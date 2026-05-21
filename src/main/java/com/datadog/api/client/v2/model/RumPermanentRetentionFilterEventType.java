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

/** The type of RUM events the filter applies to. Read-only. */
@JsonSerialize(
    using =
        RumPermanentRetentionFilterEventType.RumPermanentRetentionFilterEventTypeSerializer.class)
public class RumPermanentRetentionFilterEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "session", "view", "action", "error", "resource", "long_task", "vital", "operation"));

  public static final RumPermanentRetentionFilterEventType SESSION =
      new RumPermanentRetentionFilterEventType("session");
  public static final RumPermanentRetentionFilterEventType VIEW =
      new RumPermanentRetentionFilterEventType("view");
  public static final RumPermanentRetentionFilterEventType ACTION =
      new RumPermanentRetentionFilterEventType("action");
  public static final RumPermanentRetentionFilterEventType ERROR =
      new RumPermanentRetentionFilterEventType("error");
  public static final RumPermanentRetentionFilterEventType RESOURCE =
      new RumPermanentRetentionFilterEventType("resource");
  public static final RumPermanentRetentionFilterEventType LONG_TASK =
      new RumPermanentRetentionFilterEventType("long_task");
  public static final RumPermanentRetentionFilterEventType VITAL =
      new RumPermanentRetentionFilterEventType("vital");
  public static final RumPermanentRetentionFilterEventType OPERATION =
      new RumPermanentRetentionFilterEventType("operation");

  RumPermanentRetentionFilterEventType(String value) {
    super(value, allowedValues);
  }

  public static class RumPermanentRetentionFilterEventTypeSerializer
      extends StdSerializer<RumPermanentRetentionFilterEventType> {
    public RumPermanentRetentionFilterEventTypeSerializer(
        Class<RumPermanentRetentionFilterEventType> t) {
      super(t);
    }

    public RumPermanentRetentionFilterEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumPermanentRetentionFilterEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumPermanentRetentionFilterEventType fromValue(String value) {
    return new RumPermanentRetentionFilterEventType(value);
  }
}
