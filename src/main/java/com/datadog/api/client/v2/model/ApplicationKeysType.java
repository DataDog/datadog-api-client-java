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

/** Application Keys resource type. */
@JsonSerialize(using = ApplicationKeysType.ApplicationKeysTypeSerializer.class)
public class ApplicationKeysType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("application_keys"));

  public static final ApplicationKeysType APPLICATION_KEYS =
      new ApplicationKeysType("application_keys");

  ApplicationKeysType(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationKeysTypeSerializer extends StdSerializer<ApplicationKeysType> {
    public ApplicationKeysTypeSerializer(Class<ApplicationKeysType> t) {
      super(t);
    }

    public ApplicationKeysTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationKeysType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationKeysType fromValue(String value) {
    return new ApplicationKeysType(value);
  }
}
