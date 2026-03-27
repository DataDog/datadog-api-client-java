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
   * <p>An optional parameter that sets how permissive anomaly detection is.
   * Higher values require higher deviations before triggering a signal.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance.SecurityMonitoringRuleAnomalyDetectionOptionsDetectionToleranceSerializer.class)
public class SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));

  public static final SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance ONE = new SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(1);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance TWO = new SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(2);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance THREE = new SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(3);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance FOUR = new SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(4);
  public static final SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance FIVE = new SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(5);


  SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(Integer value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleAnomalyDetectionOptionsDetectionToleranceSerializer extends StdSerializer<SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance> {
      public SecurityMonitoringRuleAnomalyDetectionOptionsDetectionToleranceSerializer(Class<SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance> t) {
          super(t);
      }

      public SecurityMonitoringRuleAnomalyDetectionOptionsDetectionToleranceSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance fromValue(Integer value) {
    return new SecurityMonitoringRuleAnomalyDetectionOptionsDetectionTolerance(value);
  }
}
