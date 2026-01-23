package com.datadog.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/** Describes undo action. */
public class Undo {

  /** Holds information about undo operation. */
  public static class UndoMethod {

    /** Defines how to populate operation parameters. */
    public static class Parameter {
      public String name;
      public String source;
      public String template;
      public String origin;
    }

    public String tag;
    public String type;
    public String operationId;
    public List<Parameter> parameters;

    public Map<String, Object> getRequestParameters(
        Object responseData, Object requestData, Method requestBuilder, ObjectMapper mapper, Map<String, Object> pathParameters) {
      Map<String, Object> requestParams = new HashMap<String, Object>();
      for (int i = 0; i < parameters.size(); i++) {
        Undo.UndoMethod.Parameter p = parameters.get(i);
        Object data;
        if (p.origin != null && p.origin.equals("path")) {
          data = pathParameters;
        } else if (p.origin == null) {
          data = responseData;
        } else if (p.origin.equals("request")) {
          data = requestData;
        } else {
          data = responseData;
        }

        try {
          if (p.source != null) {
            if (p.origin != null && p.origin.equals("path")) {
              // For path parameters, try both original parameter name and property name
              String propertyName = World.toPropertyName(p.name);
              if (pathParameters.containsKey(p.source)) {
                requestParams.put(propertyName, pathParameters.get(p.source));
              } else if (pathParameters.containsKey(World.toPropertyName(p.source))) {
                requestParams.put(propertyName, pathParameters.get(World.toPropertyName(p.source)));
              } else {
                throw new RuntimeException("Path parameter '" + p.source + "' not found");
              }
            } else {
              requestParams.put(World.toPropertyName(p.name), World.lookup(data, p.source));
            }
          } else if (p.template != null) {
            Class<?>[] types = requestBuilder.getParameterTypes();
            Object param = World.fromJSON(mapper, types[i], World.templated(p.template, data));
            requestParams.put(World.toPropertyName(p.name), param);
          } else if (p.origin != null && p.origin.equals("path")) {
            throw new RuntimeException("Path origin requires 'source' field");
          }
        } catch (java.lang.IllegalAccessException e) {
          throw new RuntimeException(e);
        } catch (java.lang.NoSuchFieldException e) {
          throw new RuntimeException(e);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
          throw new RuntimeException(e);
        }
      }
      return requestParams;
    }
  }

  public String tag;
  public UndoMethod undo;

  /** Load requests undo definition from a configuration file. */
  public static Map<String, Undo> loadRequestsUndo(File file) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    TypeReference<HashMap<String, Undo>> typeRef = new TypeReference<HashMap<String, Undo>>() {};
    Map<String, Undo> result = mapper.readValue(file, typeRef);
    Map<String, Undo> clean = new HashMap<String, Undo>();
    for (String k : result.keySet()) {
      clean.put(toOperationName(k), result.get(k));
    }
    return clean;
  }

  public static String toOperationName(String string) {
    if (string == null || string.length() == 0) {
      return string;
    }

    char c[] = string.toCharArray();
    c[0] = Character.toLowerCase(c[0]);

    return new String(c);
  }

  public String getAPIName() {
    if (undo.tag != null) return Pattern.compile("[- ]").matcher(undo.tag).replaceAll("");
    return Pattern.compile("[- ]").matcher(tag).replaceAll("");
  }

  public String getOperationName() {
    return toOperationName(undo.operationId);
  }
}
