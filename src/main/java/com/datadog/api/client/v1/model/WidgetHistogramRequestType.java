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

/**
 * Request type for distribution of point values for distribution metrics. Query space aggregator
 * must be <code>histogram:&lt;metric name&gt;</code> for points distributions.
 */
@JsonSerialize(using = WidgetHistogramRequestType.WidgetHistogramRequestTypeSerializer.class)
public class WidgetHistogramRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("histogram"));

  public static final WidgetHistogramRequestType HISTOGRAM =
      new WidgetHistogramRequestType("histogram");

  WidgetHistogramRequestType(String value) {
    super(value, allowedValues);
  }

  public static class WidgetHistogramRequestTypeSerializer
      extends StdSerializer<WidgetHistogramRequestType> {
    public WidgetHistogramRequestTypeSerializer(Class<WidgetHistogramRequestType> t) {
      super(t);
    }

    public WidgetHistogramRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        WidgetHistogramRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetHistogramRequestType fromValue(String value) {
    return new WidgetHistogramRequestType(value);
  }
}
