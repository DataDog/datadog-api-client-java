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
   * <p>The detection method.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleDetectionMethod.SecurityMonitoringRuleDetectionMethodSerializer.class)
public class SecurityMonitoringRuleDetectionMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("threshold", "new_value", "anomaly_detection", "impossible_travel", "hardcoded", "third_party", "anomaly_threshold", "sequence_detection"));

  public static final SecurityMonitoringRuleDetectionMethod THRESHOLD = new SecurityMonitoringRuleDetectionMethod("threshold");
  public static final SecurityMonitoringRuleDetectionMethod NEW_VALUE = new SecurityMonitoringRuleDetectionMethod("new_value");
  public static final SecurityMonitoringRuleDetectionMethod ANOMALY_DETECTION = new SecurityMonitoringRuleDetectionMethod("anomaly_detection");
  public static final SecurityMonitoringRuleDetectionMethod IMPOSSIBLE_TRAVEL = new SecurityMonitoringRuleDetectionMethod("impossible_travel");
  public static final SecurityMonitoringRuleDetectionMethod HARDCODED = new SecurityMonitoringRuleDetectionMethod("hardcoded");
  public static final SecurityMonitoringRuleDetectionMethod THIRD_PARTY = new SecurityMonitoringRuleDetectionMethod("third_party");
  public static final SecurityMonitoringRuleDetectionMethod ANOMALY_THRESHOLD = new SecurityMonitoringRuleDetectionMethod("anomaly_threshold");
  public static final SecurityMonitoringRuleDetectionMethod SEQUENCE_DETECTION = new SecurityMonitoringRuleDetectionMethod("sequence_detection");


  SecurityMonitoringRuleDetectionMethod(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleDetectionMethodSerializer extends StdSerializer<SecurityMonitoringRuleDetectionMethod> {
      public SecurityMonitoringRuleDetectionMethodSerializer(Class<SecurityMonitoringRuleDetectionMethod> t) {
          super(t);
      }

      public SecurityMonitoringRuleDetectionMethodSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleDetectionMethod value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecurityMonitoringRuleDetectionMethod fromValue(String value) {
    return new SecurityMonitoringRuleDetectionMethod(value);
  }
}
