/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = NumberFormatUnitCanonicalType.NumberFormatUnitCanonicalTypeSerializer.class)
public class NumberFormatUnitCanonicalType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("canonical_unit"));

  public static final NumberFormatUnitCanonicalType CANONICAL_UNIT =
      new NumberFormatUnitCanonicalType("canonical_unit");

  NumberFormatUnitCanonicalType(String value) {
    super(value, allowedValues);
  }

  public static class NumberFormatUnitCanonicalTypeSerializer
      extends StdSerializer<NumberFormatUnitCanonicalType> {
    public NumberFormatUnitCanonicalTypeSerializer(Class<NumberFormatUnitCanonicalType> t) {
      super(t);
    }

    public NumberFormatUnitCanonicalTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NumberFormatUnitCanonicalType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NumberFormatUnitCanonicalType fromValue(String value) {
    return new NumberFormatUnitCanonicalType(value);
  }
}
