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

/** The type of values for the feature flag variants. */
@JsonSerialize(using = ValueType.ValueTypeSerializer.class)
public class ValueType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("BOOLEAN", "INTEGER", "NUMERIC", "STRING", "JSON"));

  public static final ValueType BOOLEAN = new ValueType("BOOLEAN");
  public static final ValueType INTEGER = new ValueType("INTEGER");
  public static final ValueType NUMERIC = new ValueType("NUMERIC");
  public static final ValueType STRING = new ValueType("STRING");
  public static final ValueType JSON = new ValueType("JSON");

  ValueType(String value) {
    super(value, allowedValues);
  }

  public static class ValueTypeSerializer extends StdSerializer<ValueType> {
    public ValueTypeSerializer(Class<ValueType> t) {
      super(t);
    }

    public ValueTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ValueType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ValueType fromValue(String value) {
    return new ValueType(value);
  }
}
