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

/** The type of the custom forecast resource. Must be <code>custom_forecast</code>. */
@JsonSerialize(using = CustomForecastType.CustomForecastTypeSerializer.class)
public class CustomForecastType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_forecast"));

  public static final CustomForecastType CUSTOM_FORECAST =
      new CustomForecastType("custom_forecast");

  CustomForecastType(String value) {
    super(value, allowedValues);
  }

  public static class CustomForecastTypeSerializer extends StdSerializer<CustomForecastType> {
    public CustomForecastTypeSerializer(Class<CustomForecastType> t) {
      super(t);
    }

    public CustomForecastTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(CustomForecastType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomForecastType fromValue(String value) {
    return new CustomForecastType(value);
  }
}
