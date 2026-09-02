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

/** The detection method. */
@JsonSerialize(
    using =
        SecurityMonitoringRuleDetectionMethod.SecurityMonitoringRuleDetectionMethodSerializer.class)
public class SecurityMonitoringRuleDetectionMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "threshold",
              "new_value",
              "anomaly_detection",
              "impossible_travel",
              "hardcoded",
              "third_party",
              "anomaly_threshold",
              "sequence_detection"));

  public static final SecurityMonitoringRuleDetectionMethod THRESHOLD =
      new SecurityMonitoringRuleDetectionMethod("threshold");
  public static final SecurityMonitoringRuleDetectionMethod NEW_VALUE =
      new SecurityMonitoringRuleDetectionMethod("new_value");
  public static final SecurityMonitoringRuleDetectionMethod ANOMALY_DETECTION =
      new SecurityMonitoringRuleDetectionMethod("anomaly_detection");
  public static final SecurityMonitoringRuleDetectionMethod IMPOSSIBLE_TRAVEL =
      new SecurityMonitoringRuleDetectionMethod("impossible_travel");
  public static final SecurityMonitoringRuleDetectionMethod HARDCODED =
      new SecurityMonitoringRuleDetectionMethod("hardcoded");
  public static final SecurityMonitoringRuleDetectionMethod THIRD_PARTY =
      new SecurityMonitoringRuleDetectionMethod("third_party");
  public static final SecurityMonitoringRuleDetectionMethod ANOMALY_THRESHOLD =
      new SecurityMonitoringRuleDetectionMethod("anomaly_threshold");
  public static final SecurityMonitoringRuleDetectionMethod SEQUENCE_DETECTION =
      new SecurityMonitoringRuleDetectionMethod("sequence_detection");

  SecurityMonitoringRuleDetectionMethod(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringRuleDetectionMethodSerializer
      extends StdSerializer<SecurityMonitoringRuleDetectionMethod> {
    public SecurityMonitoringRuleDetectionMethodSerializer(
        Class<SecurityMonitoringRuleDetectionMethod> t) {
      super(t);
    }

    public SecurityMonitoringRuleDetectionMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleDetectionMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleDetectionMethod fromValue(String value) {
    return new SecurityMonitoringRuleDetectionMethod(value);
  }
}
