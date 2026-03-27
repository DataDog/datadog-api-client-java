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
   * <p>The duration in days during which values are learned, and after which signals will be generated for values that
   * weren't learned. If set to 0, a signal will be generated for all new values after the first value is learned.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleNewValueOptionsLearningDuration.SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer.class)
public class SecurityMonitoringRuleNewValueOptionsLearningDuration extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 7));

  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration ZERO_DAYS = new SecurityMonitoringRuleNewValueOptionsLearningDuration(0);
  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration ONE_DAY = new SecurityMonitoringRuleNewValueOptionsLearningDuration(1);
  public static final SecurityMonitoringRuleNewValueOptionsLearningDuration SEVEN_DAYS = new SecurityMonitoringRuleNewValueOptionsLearningDuration(7);


  SecurityMonitoringRuleNewValueOptionsLearningDuration(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer extends StdSerializer<SecurityMonitoringRuleNewValueOptionsLearningDuration> {
      public SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer(Class<SecurityMonitoringRuleNewValueOptionsLearningDuration> t) {
          super(t);
      }

      public SecurityMonitoringRuleNewValueOptionsLearningDurationSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleNewValueOptionsLearningDuration value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleNewValueOptionsLearningDuration fromValue(Integer value) {
    return new SecurityMonitoringRuleNewValueOptionsLearningDuration(value);
  }
}
