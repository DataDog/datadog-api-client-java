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

/** The type of match pattern, either a literal string or a regex. */
@JsonSerialize(
    using =
        RumSdkConfigMatchOptionSerializedType.RumSdkConfigMatchOptionSerializedTypeSerializer.class)
public class RumSdkConfigMatchOptionSerializedType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("string", "regex"));

  public static final RumSdkConfigMatchOptionSerializedType STRING =
      new RumSdkConfigMatchOptionSerializedType("string");
  public static final RumSdkConfigMatchOptionSerializedType REGEX =
      new RumSdkConfigMatchOptionSerializedType("regex");

  RumSdkConfigMatchOptionSerializedType(String value) {
    super(value, allowedValues);
  }

  public static class RumSdkConfigMatchOptionSerializedTypeSerializer
      extends StdSerializer<RumSdkConfigMatchOptionSerializedType> {
    public RumSdkConfigMatchOptionSerializedTypeSerializer(
        Class<RumSdkConfigMatchOptionSerializedType> t) {
      super(t);
    }

    public RumSdkConfigMatchOptionSerializedTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumSdkConfigMatchOptionSerializedType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumSdkConfigMatchOptionSerializedType fromValue(String value) {
    return new RumSdkConfigMatchOptionSerializedType(value);
  }
}
