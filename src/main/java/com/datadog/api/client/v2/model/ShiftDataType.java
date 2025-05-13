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

/** Indicates that the resource is of type 'shifts'. */
@JsonSerialize(using = ShiftDataType.ShiftDataTypeSerializer.class)
public class ShiftDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("shifts"));

  public static final ShiftDataType SHIFTS = new ShiftDataType("shifts");

  ShiftDataType(String value) {
    super(value, allowedValues);
  }

  public static class ShiftDataTypeSerializer extends StdSerializer<ShiftDataType> {
    public ShiftDataTypeSerializer(Class<ShiftDataType> t) {
      super(t);
    }

    public ShiftDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ShiftDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ShiftDataType fromValue(String value) {
    return new ShiftDataType(value);
  }
}
