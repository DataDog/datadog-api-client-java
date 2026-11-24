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
@JsonSerialize(using = RUMExclusionFilterEventType.RUMExclusionFilterEventTypeSerializer.class)
public class RUMExclusionFilterEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("session", "view", "action", "error", "resource", "long_task", "vital"));

  public static final RUMExclusionFilterEventType SESSION =
      new RUMExclusionFilterEventType("session");
  public static final RUMExclusionFilterEventType VIEW = new RUMExclusionFilterEventType("view");
  public static final RUMExclusionFilterEventType ACTION =
      new RUMExclusionFilterEventType("action");
  public static final RUMExclusionFilterEventType ERROR = new RUMExclusionFilterEventType("error");
  public static final RUMExclusionFilterEventType RESOURCE =
      new RUMExclusionFilterEventType("resource");
  public static final RUMExclusionFilterEventType LONG_TASK =
      new RUMExclusionFilterEventType("long_task");
  public static final RUMExclusionFilterEventType VITAL = new RUMExclusionFilterEventType("vital");

  RUMExclusionFilterEventType(String value) {
    super(value, allowedValues);
  }

  public static class RUMExclusionFilterEventTypeSerializer
      extends StdSerializer<RUMExclusionFilterEventType> {
    public RUMExclusionFilterEventTypeSerializer(Class<RUMExclusionFilterEventType> t) {
      super(t);
    }

    public RUMExclusionFilterEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RUMExclusionFilterEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMExclusionFilterEventType fromValue(String value) {
    return new RUMExclusionFilterEventType(value);
  }
}
