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

/** Whether to show the paths that convert to the end step or drop off before it. */
@JsonSerialize(using = JourneyMapConversionType.JourneyMapConversionTypeSerializer.class)
public class JourneyMapConversionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("conversion", "drop-off"));

  public static final JourneyMapConversionType CONVERSION =
      new JourneyMapConversionType("conversion");
  public static final JourneyMapConversionType DROP_OFF = new JourneyMapConversionType("drop-off");

  JourneyMapConversionType(String value) {
    super(value, allowedValues);
  }

  public static class JourneyMapConversionTypeSerializer
      extends StdSerializer<JourneyMapConversionType> {
    public JourneyMapConversionTypeSerializer(Class<JourneyMapConversionType> t) {
      super(t);
    }

    public JourneyMapConversionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JourneyMapConversionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JourneyMapConversionType fromValue(String value) {
    return new JourneyMapConversionType(value);
  }
}
