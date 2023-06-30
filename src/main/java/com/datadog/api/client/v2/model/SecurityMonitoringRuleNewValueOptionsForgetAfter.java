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

/** The duration in days after which a learned value is forgotten. */
@JsonSerialize(
    using =
        SecurityMonitoringRuleNewValueOptionsForgetAfter
            .SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer.class)
public class SecurityMonitoringRuleNewValueOptionsForgetAfter extends ModelEnum<Integer> {

  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter ONE_DAY =
      new SecurityMonitoringRuleNewValueOptionsForgetAfter(1);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter TWO_DAYS =
      new SecurityMonitoringRuleNewValueOptionsForgetAfter(2);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter ONE_WEEK =
      new SecurityMonitoringRuleNewValueOptionsForgetAfter(7);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter TWO_WEEKS =
      new SecurityMonitoringRuleNewValueOptionsForgetAfter(14);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter THREE_WEEKS =
      new SecurityMonitoringRuleNewValueOptionsForgetAfter(21);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter FOUR_WEEKS =
      new SecurityMonitoringRuleNewValueOptionsForgetAfter(28);

  private static final Set<Integer> allowedValues =
      new HashSet<Integer>(Arrays.asList(1, 2, 7, 14, 21, 28));

  SecurityMonitoringRuleNewValueOptionsForgetAfter(Integer value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer
      extends StdSerializer<SecurityMonitoringRuleNewValueOptionsForgetAfter> {
    public SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer(
        Class<SecurityMonitoringRuleNewValueOptionsForgetAfter> t) {
      super(t);
    }

    public SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringRuleNewValueOptionsForgetAfter value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringRuleNewValueOptionsForgetAfter fromValue(Integer value) {
    return new SecurityMonitoringRuleNewValueOptionsForgetAfter(value);
  }
}
