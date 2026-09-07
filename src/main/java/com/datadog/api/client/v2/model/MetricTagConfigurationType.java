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

/** The metric tag configuration resource type. */
@JsonSerialize(using = MetricTagConfigurationType.MetricTagConfigurationTypeSerializer.class)
public class MetricTagConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("manage_tags"));

  public static final MetricTagConfigurationType MANAGE_TAGS =
      new MetricTagConfigurationType("manage_tags");

  MetricTagConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class MetricTagConfigurationTypeSerializer
      extends StdSerializer<MetricTagConfigurationType> {
    public MetricTagConfigurationTypeSerializer(Class<MetricTagConfigurationType> t) {
      super(t);
    }

    public MetricTagConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricTagConfigurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricTagConfigurationType fromValue(String value) {
    return new MetricTagConfigurationType(value);
  }
}
