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

/** The type of resource. The value should always be spans_metrics. */
@JsonSerialize(using = SpansMetricType.SpansMetricTypeSerializer.class)
public class SpansMetricType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("spans_metrics"));

  public static final SpansMetricType SPANS_METRICS = new SpansMetricType("spans_metrics");

  SpansMetricType(String value) {
    super(value, allowedValues);
  }

  public static class SpansMetricTypeSerializer extends StdSerializer<SpansMetricType> {
    public SpansMetricTypeSerializer(Class<SpansMetricType> t) {
      super(t);
    }

    public SpansMetricTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SpansMetricType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpansMetricType fromValue(String value) {
    return new SpansMetricType(value);
  }
}
