/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Options on new value rules. */
@JsonPropertyOrder({
  SecurityMonitoringRuleNewValueOptions.JSON_PROPERTY_FORGET_AFTER,
  SecurityMonitoringRuleNewValueOptions.JSON_PROPERTY_LEARNING_DURATION
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleNewValueOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORGET_AFTER = "forgetAfter";
  private SecurityMonitoringRuleNewValueOptionsForgetAfter forgetAfter;

  public static final String JSON_PROPERTY_LEARNING_DURATION = "learningDuration";
  private SecurityMonitoringRuleNewValueOptionsLearningDuration learningDuration;

  public SecurityMonitoringRuleNewValueOptions forgetAfter(
      SecurityMonitoringRuleNewValueOptionsForgetAfter forgetAfter) {
    this.forgetAfter = forgetAfter;
    this.unparsed |= !forgetAfter.isValid();
    return this;
  }

  /**
   * The duration in days after which a learned value is forgotten.
   *
   * @return forgetAfter
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORGET_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleNewValueOptionsForgetAfter getForgetAfter() {
    return forgetAfter;
  }

  public void setForgetAfter(SecurityMonitoringRuleNewValueOptionsForgetAfter forgetAfter) {
    if (!forgetAfter.isValid()) {
      this.unparsed = true;
    }
    this.forgetAfter = forgetAfter;
  }

  public SecurityMonitoringRuleNewValueOptions learningDuration(
      SecurityMonitoringRuleNewValueOptionsLearningDuration learningDuration) {
    this.learningDuration = learningDuration;
    this.unparsed |= !learningDuration.isValid();
    return this;
  }

  /**
   * The duration in days during which values are learned, and after which signals will be generated
   * for values that weren&#39;t learned. If set to 0, a signal will be generated for all new values
   * after the first value is learned.
   *
   * @return learningDuration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEARNING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleNewValueOptionsLearningDuration getLearningDuration() {
    return learningDuration;
  }

  public void setLearningDuration(
      SecurityMonitoringRuleNewValueOptionsLearningDuration learningDuration) {
    if (!learningDuration.isValid()) {
      this.unparsed = true;
    }
    this.learningDuration = learningDuration;
  }

  /** Return true if this SecurityMonitoringRuleNewValueOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleNewValueOptions securityMonitoringRuleNewValueOptions =
        (SecurityMonitoringRuleNewValueOptions) o;
    return Objects.equals(this.forgetAfter, securityMonitoringRuleNewValueOptions.forgetAfter)
        && Objects.equals(
            this.learningDuration, securityMonitoringRuleNewValueOptions.learningDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forgetAfter, learningDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleNewValueOptions {\n");
    sb.append("    forgetAfter: ").append(toIndentedString(forgetAfter)).append("\n");
    sb.append("    learningDuration: ").append(toIndentedString(learningDuration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
