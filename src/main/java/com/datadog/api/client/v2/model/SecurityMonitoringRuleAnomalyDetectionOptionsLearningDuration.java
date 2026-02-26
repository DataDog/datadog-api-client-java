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
   * <p>Learning duration in hours. Anomaly detection waits for at least this amount of historical data before it starts evaluating.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration.SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer.class)
public class SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(1, 6, 12, 24, 48, 168, 336));

  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration ONE_HOUR = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(1);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration SIX_HOURS = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(6);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration TWELVE_HOURS = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(12);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration ONE_DAY = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(24);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration TWO_DAYS = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(48);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration ONE_WEEK = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(168);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration TWO_WEEKS = new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(336);


  SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer extends StdSerializer<SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration> {
      public SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer(Class<SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration> t) {
          super(t);
      }

      public SecurityMonitoringRuleAnomalyDetectionOptionsLearningDurationSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration fromValue(Integer value) {
    return new SecurityMonitoringRuleAnomalyDetectionOptionsLearningDuration(value);
  }
}
