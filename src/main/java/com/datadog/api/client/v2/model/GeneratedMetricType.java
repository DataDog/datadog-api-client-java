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

/** The generated metric resource type. */
@JsonSerialize(using = GeneratedMetricType.GeneratedMetricTypeSerializer.class)
public class GeneratedMetricType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("generated_metric"));

  public static final GeneratedMetricType GENERATED_METRIC =
      new GeneratedMetricType("generated_metric");

  GeneratedMetricType(String value) {
    super(value, allowedValues);
  }

  public static class GeneratedMetricTypeSerializer extends StdSerializer<GeneratedMetricType> {
    public GeneratedMetricTypeSerializer(Class<GeneratedMetricType> t) {
      super(t);
    }

    public GeneratedMetricTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GeneratedMetricType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GeneratedMetricType fromValue(String value) {
    return new GeneratedMetricType(value);
  }
}
