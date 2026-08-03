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
   * <p>The case event that activates the automation rule.</p>
 */
@JsonSerialize(using = AutomationRuleTriggerType.AutomationRuleTriggerTypeSerializer.class)
public class AutomationRuleTriggerType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("CASE_CREATED", "STATUS_TRANSITIONED", "ATTRIBUTE_VALUE_CHANGED", "EVENT_CORRELATION_SIGNAL_CORRELATED", "CASE_REVIEW_APPROVED", "COMMENT_ADDED"));

  public static final AutomationRuleTriggerType CASE_CREATED = new AutomationRuleTriggerType("CASE_CREATED");
  public static final AutomationRuleTriggerType STATUS_TRANSITIONED = new AutomationRuleTriggerType("STATUS_TRANSITIONED");
  public static final AutomationRuleTriggerType ATTRIBUTE_VALUE_CHANGED = new AutomationRuleTriggerType("ATTRIBUTE_VALUE_CHANGED");
  public static final AutomationRuleTriggerType EVENT_CORRELATION_SIGNAL_CORRELATED = new AutomationRuleTriggerType("EVENT_CORRELATION_SIGNAL_CORRELATED");
  public static final AutomationRuleTriggerType CASE_REVIEW_APPROVED = new AutomationRuleTriggerType("CASE_REVIEW_APPROVED");
  public static final AutomationRuleTriggerType COMMENT_ADDED = new AutomationRuleTriggerType("COMMENT_ADDED");


  AutomationRuleTriggerType(String value) {
    super(value, allowedValues);
  }

  public static class AutomationRuleTriggerTypeSerializer extends StdSerializer<AutomationRuleTriggerType> {
      public AutomationRuleTriggerTypeSerializer(Class<AutomationRuleTriggerType> t) {
          super(t);
      }

      public AutomationRuleTriggerTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(AutomationRuleTriggerType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static AutomationRuleTriggerType fromValue(String value) {
    return new AutomationRuleTriggerType(value);
  }
}
