package com.datadog.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
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
    }

    public String type;
    public String operationId;
    public List<Parameter> parameters;

    public Map<String, Object> getRequestParameters(Object data) {
      Map<String, Object> requestParams = new HashMap<String, Object>();
      for (Undo.UndoMethod.Parameter p : parameters) {
        try {
          requestParams.put(World.toPropertyName(p.name), World.lookup(data, p.source));
        } catch (java.lang.IllegalAccessException e) {
          throw new RuntimeException(e);
        } catch (java.lang.NoSuchFieldException e) {
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
    return Pattern.compile(" ").matcher(tag).replaceAll("");
  }

  public String getOperationName() {
    return toOperationName(undo.operationId);
  }
}
