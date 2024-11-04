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

/** The type of the resource. The value should always be rum_metrics. */
@JsonSerialize(using = RumMetricType.RumMetricTypeSerializer.class)
public class RumMetricType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("rum_metrics"));

  public static final RumMetricType RUM_METRICS = new RumMetricType("rum_metrics");

  RumMetricType(String value) {
    super(value, allowedValues);
  }

  public static class RumMetricTypeSerializer extends StdSerializer<RumMetricType> {
    public RumMetricTypeSerializer(Class<RumMetricType> t) {
      super(t);
    }

    public RumMetricTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RumMetricType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumMetricType fromValue(String value) {
    return new RumMetricType(value);
  }
}
