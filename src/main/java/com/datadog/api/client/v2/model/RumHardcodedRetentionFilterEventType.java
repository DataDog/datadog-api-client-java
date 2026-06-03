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

/** The type of RUM events the hardcoded filter applies to. Read-only. */
@JsonSerialize(
    using =
        RumHardcodedRetentionFilterEventType.RumHardcodedRetentionFilterEventTypeSerializer.class)
public class RumHardcodedRetentionFilterEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("session", "view", "action", "error", "resource", "long_task", "vital"));

  public static final RumHardcodedRetentionFilterEventType SESSION =
      new RumHardcodedRetentionFilterEventType("session");
  public static final RumHardcodedRetentionFilterEventType VIEW =
      new RumHardcodedRetentionFilterEventType("view");
  public static final RumHardcodedRetentionFilterEventType ACTION =
      new RumHardcodedRetentionFilterEventType("action");
  public static final RumHardcodedRetentionFilterEventType ERROR =
      new RumHardcodedRetentionFilterEventType("error");
  public static final RumHardcodedRetentionFilterEventType RESOURCE =
      new RumHardcodedRetentionFilterEventType("resource");
  public static final RumHardcodedRetentionFilterEventType LONG_TASK =
      new RumHardcodedRetentionFilterEventType("long_task");
  public static final RumHardcodedRetentionFilterEventType VITAL =
      new RumHardcodedRetentionFilterEventType("vital");

  RumHardcodedRetentionFilterEventType(String value) {
    super(value, allowedValues);
  }

  public static class RumHardcodedRetentionFilterEventTypeSerializer
      extends StdSerializer<RumHardcodedRetentionFilterEventType> {
    public RumHardcodedRetentionFilterEventTypeSerializer(
        Class<RumHardcodedRetentionFilterEventType> t) {
      super(t);
    }

    public RumHardcodedRetentionFilterEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumHardcodedRetentionFilterEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumHardcodedRetentionFilterEventType fromValue(String value) {
    return new RumHardcodedRetentionFilterEventType(value);
  }
}
