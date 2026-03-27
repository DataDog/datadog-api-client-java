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


/**
   * <p>Options on sequence detection method.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleSequenceDetectionOptions.JSON_PROPERTY_STEP_TRANSITIONS,
  SecurityMonitoringRuleSequenceDetectionOptions.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleSequenceDetectionOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_STEP_TRANSITIONS = "stepTransitions";
  private List<SecurityMonitoringRuleSequenceDetectionStepTransition> stepTransitions = null;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<SecurityMonitoringRuleSequenceDetectionStep> steps = null;

  public SecurityMonitoringRuleSequenceDetectionOptions stepTransitions(List<SecurityMonitoringRuleSequenceDetectionStepTransition> stepTransitions) {
    this.stepTransitions = stepTransitions;
    for (SecurityMonitoringRuleSequenceDetectionStepTransition item : stepTransitions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringRuleSequenceDetectionOptions addStepTransitionsItem(SecurityMonitoringRuleSequenceDetectionStepTransition stepTransitionsItem) {
    if (this.stepTransitions == null) {
      this.stepTransitions = new ArrayList<>();
    }
    this.stepTransitions.add(stepTransitionsItem);
    this.unparsed |= stepTransitionsItem.unparsed;
    return this;
  }

  /**
   * <p>Transitions defining the allowed order of steps and their evaluation windows.</p>
   * @return stepTransitions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STEP_TRANSITIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringRuleSequenceDetectionStepTransition> getStepTransitions() {
        return stepTransitions;
      }
  public void setStepTransitions(List<SecurityMonitoringRuleSequenceDetectionStepTransition> stepTransitions) {
    this.stepTransitions = stepTransitions;
  }
  public SecurityMonitoringRuleSequenceDetectionOptions steps(List<SecurityMonitoringRuleSequenceDetectionStep> steps) {
    this.steps = steps;
    for (SecurityMonitoringRuleSequenceDetectionStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringRuleSequenceDetectionOptions addStepsItem(SecurityMonitoringRuleSequenceDetectionStep stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * <p>Steps that define the conditions to be matched in sequence.</p>
   * @return steps
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STEPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringRuleSequenceDetectionStep> getSteps() {
        return steps;
      }
  public void setSteps(List<SecurityMonitoringRuleSequenceDetectionStep> steps) {
    this.steps = steps;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SecurityMonitoringRuleSequenceDetectionOptions
   */
  @JsonAnySetter
  public SecurityMonitoringRuleSequenceDetectionOptions putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this SecurityMonitoringRuleSequenceDetectionOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleSequenceDetectionOptions securityMonitoringRuleSequenceDetectionOptions = (SecurityMonitoringRuleSequenceDetectionOptions) o;
    return Objects.equals(this.stepTransitions, securityMonitoringRuleSequenceDetectionOptions.stepTransitions) && Objects.equals(this.steps, securityMonitoringRuleSequenceDetectionOptions.steps) && Objects.equals(this.additionalProperties, securityMonitoringRuleSequenceDetectionOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(stepTransitions,steps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleSequenceDetectionOptions {\n");
    sb.append("    stepTransitions: ").append(toIndentedString(stepTransitions)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
