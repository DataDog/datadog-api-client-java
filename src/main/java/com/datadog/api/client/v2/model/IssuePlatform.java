/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Platform associated with the issue. */
@JsonSerialize(using = IssuePlatform.IssuePlatformSerializer.class)
public class IssuePlatform extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "ANDROID",
              "BACKEND",
              "BROWSER",
              "FLUTTER",
              "IOS",
              "REACT_NATIVE",
              "ROKU",
              "UNKNOWN"));

  public static final IssuePlatform ANDROID = new IssuePlatform("ANDROID");
  public static final IssuePlatform BACKEND = new IssuePlatform("BACKEND");
  public static final IssuePlatform BROWSER = new IssuePlatform("BROWSER");
  public static final IssuePlatform FLUTTER = new IssuePlatform("FLUTTER");
  public static final IssuePlatform IOS = new IssuePlatform("IOS");
  public static final IssuePlatform REACT_NATIVE = new IssuePlatform("REACT_NATIVE");
  public static final IssuePlatform ROKU = new IssuePlatform("ROKU");
  public static final IssuePlatform UNKNOWN = new IssuePlatform("UNKNOWN");

  IssuePlatform(String value) {
    super(value, allowedValues);
  }

  public static class IssuePlatformSerializer extends StdSerializer<IssuePlatform> {
    public IssuePlatformSerializer(Class<IssuePlatform> t) {
      super(t);
    }

    public IssuePlatformSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssuePlatform value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssuePlatform fromValue(String value) {
    return new IssuePlatform(value);
  }
}
