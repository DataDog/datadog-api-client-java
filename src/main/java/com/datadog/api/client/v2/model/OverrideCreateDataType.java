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

/** The definition of <code>OverrideCreateDataType</code> object. */
@JsonSerialize(using = OverrideCreateDataType.OverrideCreateDataTypeSerializer.class)
public class OverrideCreateDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("overrides"));

  public static final OverrideCreateDataType OVERRIDES = new OverrideCreateDataType("overrides");

  OverrideCreateDataType(String value) {
    super(value, allowedValues);
  }

  public static class OverrideCreateDataTypeSerializer
      extends StdSerializer<OverrideCreateDataType> {
    public OverrideCreateDataTypeSerializer(Class<OverrideCreateDataType> t) {
      super(t);
    }

    public OverrideCreateDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OverrideCreateDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OverrideCreateDataType fromValue(String value) {
    return new OverrideCreateDataType(value);
  }
}
