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
   * <p>The duration in days after which a learned value is forgotten.</p>
 */
@JsonSerialize(using = SecurityMonitoringRuleNewValueOptionsForgetAfter.SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer.class)
public class SecurityMonitoringRuleNewValueOptionsForgetAfter {

  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter ONE_DAY = new SecurityMonitoringRuleNewValueOptionsForgetAfter(1);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter TWO_DAYS = new SecurityMonitoringRuleNewValueOptionsForgetAfter(2);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter ONE_WEEK = new SecurityMonitoringRuleNewValueOptionsForgetAfter(7);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter TWO_WEEKS = new SecurityMonitoringRuleNewValueOptionsForgetAfter(14);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter THREE_WEEKS = new SecurityMonitoringRuleNewValueOptionsForgetAfter(21);
  public static final SecurityMonitoringRuleNewValueOptionsForgetAfter FOUR_WEEKS = new SecurityMonitoringRuleNewValueOptionsForgetAfter(28);

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(1, 2, 7, 14, 21, 28));

  private Integer value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SecurityMonitoringRuleNewValueOptionsForgetAfter(Integer value) {
    this.value = value;
  }

  public static class SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer extends StdSerializer<SecurityMonitoringRuleNewValueOptionsForgetAfter> {
      public SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer(Class<SecurityMonitoringRuleNewValueOptionsForgetAfter> t) {
          super(t);
      }

      public SecurityMonitoringRuleNewValueOptionsForgetAfterSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecurityMonitoringRuleNewValueOptionsForgetAfter value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonValue
  public Integer getValue() {
    return this.value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  /**
   * Return true if this SecurityMonitoringRuleNewValueOptionsForgetAfter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SecurityMonitoringRuleNewValueOptionsForgetAfter) o).value);
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
  public static SecurityMonitoringRuleNewValueOptionsForgetAfter fromValue(Integer value) {
    return new SecurityMonitoringRuleNewValueOptionsForgetAfter(value);
  }
}
