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


/**
   * <p>Options on new value rules.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleNewValueOptions.JSON_PROPERTY_FORGET_AFTER,
  SecurityMonitoringRuleNewValueOptions.JSON_PROPERTY_LEARNING_DURATION,
  SecurityMonitoringRuleNewValueOptions.JSON_PROPERTY_LEARNING_METHOD,
  SecurityMonitoringRuleNewValueOptions.JSON_PROPERTY_LEARNING_THRESHOLD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleNewValueOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORGET_AFTER = "forgetAfter";
  private SecurityMonitoringRuleNewValueOptionsForgetAfter forgetAfter;

  public static final String JSON_PROPERTY_LEARNING_DURATION = "learningDuration";
  private SecurityMonitoringRuleNewValueOptionsLearningDuration learningDuration = SecurityMonitoringRuleNewValueOptionsLearningDuration.ZERO_DAYS;

  public static final String JSON_PROPERTY_LEARNING_METHOD = "learningMethod";
  private SecurityMonitoringRuleNewValueOptionsLearningMethod learningMethod = SecurityMonitoringRuleNewValueOptionsLearningMethod.DURATION;

  public static final String JSON_PROPERTY_LEARNING_THRESHOLD = "learningThreshold";
  private SecurityMonitoringRuleNewValueOptionsLearningThreshold learningThreshold = SecurityMonitoringRuleNewValueOptionsLearningThreshold.ZERO_OCCURRENCES;

  public SecurityMonitoringRuleNewValueOptions forgetAfter(SecurityMonitoringRuleNewValueOptionsForgetAfter forgetAfter) {
    this.forgetAfter = forgetAfter;
    this.unparsed |= !forgetAfter.isValid();
    return this;
  }

  /**
   * <p>The duration in days after which a learned value is forgotten.</p>
   * @return forgetAfter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FORGET_AFTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleNewValueOptionsForgetAfter getForgetAfter() {
        return forgetAfter;
      }
  public void setForgetAfter(SecurityMonitoringRuleNewValueOptionsForgetAfter forgetAfter) {
    if (!forgetAfter.isValid()) {
        this.unparsed = true;
    }
    this.forgetAfter = forgetAfter;
  }
  public SecurityMonitoringRuleNewValueOptions learningDuration(SecurityMonitoringRuleNewValueOptionsLearningDuration learningDuration) {
    this.learningDuration = learningDuration;
    this.unparsed |= !learningDuration.isValid();
    return this;
  }

  /**
   * <p>The duration in days during which values are learned, and after which signals will be generated for values that
   * weren't learned. If set to 0, a signal will be generated for all new values after the first value is learned.</p>
   * @return learningDuration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEARNING_DURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleNewValueOptionsLearningDuration getLearningDuration() {
        return learningDuration;
      }
  public void setLearningDuration(SecurityMonitoringRuleNewValueOptionsLearningDuration learningDuration) {
    if (!learningDuration.isValid()) {
        this.unparsed = true;
    }
    this.learningDuration = learningDuration;
  }
  public SecurityMonitoringRuleNewValueOptions learningMethod(SecurityMonitoringRuleNewValueOptionsLearningMethod learningMethod) {
    this.learningMethod = learningMethod;
    this.unparsed |= !learningMethod.isValid();
    return this;
  }

  /**
   * <p>The learning method used to determine when signals should be generated for values that weren't learned.</p>
   * @return learningMethod
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEARNING_METHOD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleNewValueOptionsLearningMethod getLearningMethod() {
        return learningMethod;
      }
  public void setLearningMethod(SecurityMonitoringRuleNewValueOptionsLearningMethod learningMethod) {
    if (!learningMethod.isValid()) {
        this.unparsed = true;
    }
    this.learningMethod = learningMethod;
  }
  public SecurityMonitoringRuleNewValueOptions learningThreshold(SecurityMonitoringRuleNewValueOptionsLearningThreshold learningThreshold) {
    this.learningThreshold = learningThreshold;
    this.unparsed |= !learningThreshold.isValid();
    return this;
  }

  /**
   * <p>A number of occurrences after which signals will be generated for values that weren't learned.</p>
   * @return learningThreshold
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LEARNING_THRESHOLD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleNewValueOptionsLearningThreshold getLearningThreshold() {
        return learningThreshold;
      }
  public void setLearningThreshold(SecurityMonitoringRuleNewValueOptionsLearningThreshold learningThreshold) {
    if (!learningThreshold.isValid()) {
        this.unparsed = true;
    }
    this.learningThreshold = learningThreshold;
  }

  /**
   * Return true if this SecurityMonitoringRuleNewValueOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleNewValueOptions securityMonitoringRuleNewValueOptions = (SecurityMonitoringRuleNewValueOptions) o;
    return Objects.equals(this.forgetAfter, securityMonitoringRuleNewValueOptions.forgetAfter) && Objects.equals(this.learningDuration, securityMonitoringRuleNewValueOptions.learningDuration) && Objects.equals(this.learningMethod, securityMonitoringRuleNewValueOptions.learningMethod) && Objects.equals(this.learningThreshold, securityMonitoringRuleNewValueOptions.learningThreshold);
  }


  @Override
  public int hashCode() {
    return Objects.hash(forgetAfter,learningDuration,learningMethod,learningThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleNewValueOptions {\n");
    sb.append("    forgetAfter: ").append(toIndentedString(forgetAfter)).append("\n");
    sb.append("    learningDuration: ").append(toIndentedString(learningDuration)).append("\n");
    sb.append("    learningMethod: ").append(toIndentedString(learningMethod)).append("\n");
    sb.append("    learningThreshold: ").append(toIndentedString(learningThreshold)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
