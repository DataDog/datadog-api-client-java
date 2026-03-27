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

/** Type of metric pagination. */
@JsonSerialize(using = MetricMetaPageType.MetricMetaPageTypeSerializer.class)
public class MetricMetaPageType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cursor_limit"));

  public static final MetricMetaPageType CURSOR_LIMIT = new MetricMetaPageType("cursor_limit");

  MetricMetaPageType(String value) {
    super(value, allowedValues);
  }

  public static class MetricMetaPageTypeSerializer extends StdSerializer<MetricMetaPageType> {
    public MetricMetaPageTypeSerializer(Class<MetricMetaPageType> t) {
      super(t);
    }

    public MetricMetaPageTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricMetaPageType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricMetaPageType fromValue(String value) {
    return new MetricMetaPageType(value);
  }
}
