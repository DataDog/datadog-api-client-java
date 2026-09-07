/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The type of RUM events to filter on.</p>
 */
@JsonSerialize(using = RumExclusionFilterEventType.RumExclusionFilterEventTypeSerializer.class)
public class RumExclusionFilterEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("session", "view", "action", "error", "resource", "long_task", "vital"));

  public static final RumExclusionFilterEventType SESSION = new RumExclusionFilterEventType("session");
  public static final RumExclusionFilterEventType VIEW = new RumExclusionFilterEventType("view");
  public static final RumExclusionFilterEventType ACTION = new RumExclusionFilterEventType("action");
  public static final RumExclusionFilterEventType ERROR = new RumExclusionFilterEventType("error");
  public static final RumExclusionFilterEventType RESOURCE = new RumExclusionFilterEventType("resource");
  public static final RumExclusionFilterEventType LONG_TASK = new RumExclusionFilterEventType("long_task");
  public static final RumExclusionFilterEventType VITAL = new RumExclusionFilterEventType("vital");


  RumExclusionFilterEventType(String value) {
    super(value, allowedValues);
  }

  public static class RumExclusionFilterEventTypeSerializer extends StdSerializer<RumExclusionFilterEventType> {
      public RumExclusionFilterEventTypeSerializer(Class<RumExclusionFilterEventType> t) {
          super(t);
      }

      public RumExclusionFilterEventTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(RumExclusionFilterEventType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static RumExclusionFilterEventType fromValue(String value) {
    return new RumExclusionFilterEventType(value);
  }
}
