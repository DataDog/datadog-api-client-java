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
   * <p>Duration in seconds of the time buckets used to aggregate events matched by the rule.
   * Must be greater than or equal to 300.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration.SecurityMonitoringRuleAnomalyDetectionOptionsBucketDurationSerializer.class)
public class SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(300, 600, 900, 1800, 3600, 10800));

  public static final SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration FIVE_MINUTES = new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(300);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration TEN_MINUTES = new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(600);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration FIFTEEN_MINUTES = new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(900);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration THIRTY_MINUTES = new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(1800);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration ONE_HOUR = new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(3600);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration THREE_HOURS = new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(10800);


  SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleAnomalyDetectionOptionsBucketDurationSerializer extends StdSerializer<SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration> {
      public SecurityMonitoringRuleAnomalyDetectionOptionsBucketDurationSerializer(Class<SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration> t) {
          super(t);
      }

      public SecurityMonitoringRuleAnomalyDetectionOptionsBucketDurationSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration fromValue(Integer value) {
    return new SecurityMonitoringRuleAnomalyDetectionOptionsBucketDuration(value);
  }
}
