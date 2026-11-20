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

/**
 * The type of RUM events the metric is generated from. It is set at creation and cannot be changed.
 */
@JsonSerialize(using = RUMMetricEventType.RUMMetricEventTypeSerializer.class)
public class RUMMetricEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("session", "view", "action", "error", "resource", "long_task", "vital"));

  public static final RUMMetricEventType SESSION = new RUMMetricEventType("session");
  public static final RUMMetricEventType VIEW = new RUMMetricEventType("view");
  public static final RUMMetricEventType ACTION = new RUMMetricEventType("action");
  public static final RUMMetricEventType ERROR = new RUMMetricEventType("error");
  public static final RUMMetricEventType RESOURCE = new RUMMetricEventType("resource");
  public static final RUMMetricEventType LONG_TASK = new RUMMetricEventType("long_task");
  public static final RUMMetricEventType VITAL = new RUMMetricEventType("vital");

  RUMMetricEventType(String value) {
    super(value, allowedValues);
  }

  public static class RUMMetricEventTypeSerializer extends StdSerializer<RUMMetricEventType> {
    public RUMMetricEventTypeSerializer(Class<RUMMetricEventType> t) {
      super(t);
    }

    public RUMMetricEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RUMMetricEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMMetricEventType fromValue(String value) {
    return new RUMMetricEventType(value);
  }
}
