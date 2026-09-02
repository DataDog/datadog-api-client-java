/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The type of custom unit. */
@JsonSerialize(using = NumberFormatUnitCustomType.NumberFormatUnitCustomTypeSerializer.class)
public class NumberFormatUnitCustomType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_unit_label"));

  public static final NumberFormatUnitCustomType CUSTOM_UNIT_LABEL =
      new NumberFormatUnitCustomType("custom_unit_label");

  NumberFormatUnitCustomType(String value) {
    super(value, allowedValues);
  }

  public static class NumberFormatUnitCustomTypeSerializer
      extends StdSerializer<NumberFormatUnitCustomType> {
    public NumberFormatUnitCustomTypeSerializer(Class<NumberFormatUnitCustomType> t) {
      super(t);
    }

    public NumberFormatUnitCustomTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NumberFormatUnitCustomType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NumberFormatUnitCustomType fromValue(String value) {
    return new NumberFormatUnitCustomType(value);
  }
}
