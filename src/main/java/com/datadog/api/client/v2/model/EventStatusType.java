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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>If an alert event is enabled, its status is one of the following:
   * <code>failure</code>, <code>error</code>, <code>warning</code>, <code>info</code>, <code>success</code>, <code>user_update</code>,
   * <code>recommendation</code>, or <code>snapshot</code>.</p>
 */
@JsonSerialize(using = EventStatusType.EventStatusTypeSerializer.class)
public class EventStatusType {

  public static final EventStatusType FAILURE = new EventStatusType("failure");
  public static final EventStatusType ERROR = new EventStatusType("error");
  public static final EventStatusType WARNING = new EventStatusType("warning");
  public static final EventStatusType INFO = new EventStatusType("info");
  public static final EventStatusType SUCCESS = new EventStatusType("success");
  public static final EventStatusType USER_UPDATE = new EventStatusType("user_update");
  public static final EventStatusType RECOMMENDATION = new EventStatusType("recommendation");
  public static final EventStatusType SNAPSHOT = new EventStatusType("snapshot");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("failure", "error", "warning", "info", "success", "user_update", "recommendation", "snapshot"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  EventStatusType(String value) {
    this.value = value;
  }

  public static class EventStatusTypeSerializer extends StdSerializer<EventStatusType> {
      public EventStatusTypeSerializer(Class<EventStatusType> t) {
          super(t);
      }

      public EventStatusTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(EventStatusType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Return true if this EventStatusType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((EventStatusType) o).value);
  }

  @Override
  public int hashCode() {
      return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventStatusType fromValue(String value) {
    return new EventStatusType(value);
  }
}
