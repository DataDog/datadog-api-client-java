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
        RUMSdkConfigMatchOptionSerializedType.RUMSdkConfigMatchOptionSerializedTypeSerializer.class)
public class RUMSdkConfigMatchOptionSerializedType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("string", "regex"));

  public static final RUMSdkConfigMatchOptionSerializedType STRING =
      new RUMSdkConfigMatchOptionSerializedType("string");
  public static final RUMSdkConfigMatchOptionSerializedType REGEX =
      new RUMSdkConfigMatchOptionSerializedType("regex");

  RUMSdkConfigMatchOptionSerializedType(String value) {
    super(value, allowedValues);
  }

  public static class RUMSdkConfigMatchOptionSerializedTypeSerializer
      extends StdSerializer<RUMSdkConfigMatchOptionSerializedType> {
    public RUMSdkConfigMatchOptionSerializedTypeSerializer(
        Class<RUMSdkConfigMatchOptionSerializedType> t) {
      super(t);
    }

    public RUMSdkConfigMatchOptionSerializedTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMSdkConfigMatchOptionSerializedType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMSdkConfigMatchOptionSerializedType fromValue(String value) {
    return new RUMSdkConfigMatchOptionSerializedType(value);
  }
}
