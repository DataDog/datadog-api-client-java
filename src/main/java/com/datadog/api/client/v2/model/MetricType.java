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

/** The metric resource type. */
@JsonSerialize(using = MetricType.MetricTypeSerializer.class)
public class MetricType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("metrics"));

  public static final MetricType METRICS = new MetricType("metrics");

  MetricType(String value) {
    super(value, allowedValues);
  }

  public static class MetricTypeSerializer extends StdSerializer<MetricType> {
    public MetricTypeSerializer(Class<MetricType> t) {
      super(t);
    }

    public MetricTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricType fromValue(String value) {
    return new MetricType(value);
  }
}
