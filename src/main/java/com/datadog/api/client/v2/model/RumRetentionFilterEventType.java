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
@JsonSerialize(using = RumRetentionFilterEventType.RumRetentionFilterEventTypeSerializer.class)
public class RumRetentionFilterEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("session", "view", "action", "error", "resource", "long_task", "vital"));

  public static final RumRetentionFilterEventType SESSION =
      new RumRetentionFilterEventType("session");
  public static final RumRetentionFilterEventType VIEW = new RumRetentionFilterEventType("view");
  public static final RumRetentionFilterEventType ACTION =
      new RumRetentionFilterEventType("action");
  public static final RumRetentionFilterEventType ERROR = new RumRetentionFilterEventType("error");
  public static final RumRetentionFilterEventType RESOURCE =
      new RumRetentionFilterEventType("resource");
  public static final RumRetentionFilterEventType LONG_TASK =
      new RumRetentionFilterEventType("long_task");
  public static final RumRetentionFilterEventType VITAL = new RumRetentionFilterEventType("vital");

  RumRetentionFilterEventType(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionFilterEventTypeSerializer
      extends StdSerializer<RumRetentionFilterEventType> {
    public RumRetentionFilterEventTypeSerializer(Class<RumRetentionFilterEventType> t) {
      super(t);
    }

    public RumRetentionFilterEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionFilterEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionFilterEventType fromValue(String value) {
    return new RumRetentionFilterEventType(value);
  }
}
