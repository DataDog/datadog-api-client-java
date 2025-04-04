package com.datadog.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/** Describes given action. */
public class Given {

  public String step;
  public String tag;
  public String operationId;

  /** Defines how to populate operation parameters. */
  public static class Parameter {
    public String name;

    @JsonInclude(Include.NON_NULL)
    public String source;

    @JsonInclude(Include.NON_NULL)
    public String value;

    @JsonInclude(Include.NON_NULL)
    public String origin;

    public <T> T resolve(Class<T> clazz, Object context, ObjectMapper mapper, String version) {
      try {
        if (value != null) {
          if (clazz == File.class) {
            // trim leading and trailing quotes from the value variable
            String filePath =
                "src/test/resources/com/datadog/api/client/"
                    + version
                    + "/api/"
                    + value.replaceAll("^\"|\"$", "");
            return (T) new File(filePath);
          }
          return World.fromJSON(mapper, clazz, World.templated(value, context));
        }
        if (source != null) {
          return (T) World.lookup(context, source);
        }
      } catch (java.lang.IllegalAccessException
          | java.lang.NoSuchFieldException
          | com.fasterxml.jackson.core.JsonProcessingException e) {
        throw new RuntimeException(e);
      }
      return null;
    }
  }

  @JsonInclude(Include.NON_NULL)
  public List<Parameter> parameters;

  @JsonInclude(Include.NON_NULL)
  public String source;

  public String key;

  public Map<String, Parameter> getRequestParameters() {
    Map<String, Parameter> requestParams = new HashMap<>();
    if (parameters != null) {
      for (Parameter p : parameters) {
        requestParams.put(World.toPropertyName(p.name), p);
      }
    }
    return requestParams;
  }

  /** Load given definition from a configuration file. */
  public static List<Given> load(File file) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    TypeReference<List<Given>> typeRef = new TypeReference<List<Given>>() {};
    return mapper.readValue(file, typeRef);
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
    return Pattern.compile("[- ]").matcher(tag).replaceAll("");
  }

  public String getOperationName() {
    return toOperationName(operationId);
  }
}
