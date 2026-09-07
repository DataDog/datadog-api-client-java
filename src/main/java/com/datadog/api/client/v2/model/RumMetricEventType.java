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

/** The type of RUM events to filter on. */
@JsonSerialize(using = RumMetricEventType.RumMetricEventTypeSerializer.class)
public class RumMetricEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("session", "view", "action", "error", "resource", "long_task", "vital"));

  public static final RumMetricEventType SESSION = new RumMetricEventType("session");
  public static final RumMetricEventType VIEW = new RumMetricEventType("view");
  public static final RumMetricEventType ACTION = new RumMetricEventType("action");
  public static final RumMetricEventType ERROR = new RumMetricEventType("error");
  public static final RumMetricEventType RESOURCE = new RumMetricEventType("resource");
  public static final RumMetricEventType LONG_TASK = new RumMetricEventType("long_task");
  public static final RumMetricEventType VITAL = new RumMetricEventType("vital");

  RumMetricEventType(String value) {
    super(value, allowedValues);
  }

  public static class RumMetricEventTypeSerializer extends StdSerializer<RumMetricEventType> {
    public RumMetricEventTypeSerializer(Class<RumMetricEventType> t) {
      super(t);
    }

    public RumMetricEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(RumMetricEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumMetricEventType fromValue(String value) {
    return new RumMetricEventType(value);
  }
}
