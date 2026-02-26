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

/** The metric actively queried configuration resource type. */
@JsonSerialize(using = MetricActiveConfigurationType.MetricActiveConfigurationTypeSerializer.class)
public class MetricActiveConfigurationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("actively_queried_configurations"));

  public static final MetricActiveConfigurationType ACTIVELY_QUERIED_CONFIGURATIONS =
      new MetricActiveConfigurationType("actively_queried_configurations");

  MetricActiveConfigurationType(String value) {
    super(value, allowedValues);
  }

  public static class MetricActiveConfigurationTypeSerializer
      extends StdSerializer<MetricActiveConfigurationType> {
    public MetricActiveConfigurationTypeSerializer(Class<MetricActiveConfigurationType> t) {
      super(t);
    }

    public MetricActiveConfigurationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MetricActiveConfigurationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricActiveConfigurationType fromValue(String value) {
    return new MetricActiveConfigurationType(value);
  }
}
