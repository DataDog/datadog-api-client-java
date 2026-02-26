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

/** The type of unit scale. */
@JsonSerialize(using = NumberFormatUnitScaleType.NumberFormatUnitScaleTypeSerializer.class)
public class NumberFormatUnitScaleType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("canonical_unit"));

  public static final NumberFormatUnitScaleType CANONICAL_UNIT =
      new NumberFormatUnitScaleType("canonical_unit");

  NumberFormatUnitScaleType(String value) {
    super(value, allowedValues);
  }

  public static class NumberFormatUnitScaleTypeSerializer
      extends StdSerializer<NumberFormatUnitScaleType> {
    public NumberFormatUnitScaleTypeSerializer(Class<NumberFormatUnitScaleType> t) {
      super(t);
    }

    public NumberFormatUnitScaleTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NumberFormatUnitScaleType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NumberFormatUnitScaleType fromValue(String value) {
    return new NumberFormatUnitScaleType(value);
  }
}
