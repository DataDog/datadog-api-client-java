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

/** The metric metadata resource type. */
@JsonSerialize(using = MetricMetadataType.MetricMetadataTypeSerializer.class)
public class MetricMetadataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metric_metadata"));

  public static final MetricMetadataType METRIC_METADATA =
      new MetricMetadataType("metric_metadata");

  MetricMetadataType(String value) {
    super(value, allowedValues);
  }

  public static class MetricMetadataTypeSerializer extends StdSerializer<MetricMetadataType> {
    public MetricMetadataTypeSerializer(Class<MetricMetadataType> t) {
      super(t);
    }

    public MetricMetadataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricMetadataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricMetadataType fromValue(String value) {
    return new MetricMetadataType(value);
  }
}
