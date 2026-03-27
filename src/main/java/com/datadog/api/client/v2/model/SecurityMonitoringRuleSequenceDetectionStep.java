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
   * <p>Step definition for sequence detection containing the step name, condition, and evaluation window.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleSequenceDetectionStep.JSON_PROPERTY_CONDITION,
  SecurityMonitoringRuleSequenceDetectionStep.JSON_PROPERTY_EVALUATION_WINDOW,
  SecurityMonitoringRuleSequenceDetectionStep.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleSequenceDetectionStep {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private String condition;

  public static final String JSON_PROPERTY_EVALUATION_WINDOW = "evaluationWindow";
  private SecurityMonitoringRuleEvaluationWindow evaluationWindow;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public SecurityMonitoringRuleSequenceDetectionStep condition(String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * <p>Condition referencing rule queries (e.g., <code>a &gt; 0</code>).</p>
   * @return condition
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCondition() {
        return condition;
      }
  public void setCondition(String condition) {
    this.condition = condition;
  }
  public SecurityMonitoringRuleSequenceDetectionStep evaluationWindow(SecurityMonitoringRuleEvaluationWindow evaluationWindow) {
    this.evaluationWindow = evaluationWindow;
    this.unparsed |= !evaluationWindow.isValid();
    return this;
  }

  /**
   * <p>A time window is specified to match when at least one of the cases matches true. This is a sliding window
   * and evaluates in real time. For third party detection method, this field is not used.</p>
   * @return evaluationWindow
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATION_WINDOW)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleEvaluationWindow getEvaluationWindow() {
        return evaluationWindow;
      }
  public void setEvaluationWindow(SecurityMonitoringRuleEvaluationWindow evaluationWindow) {
    if (!evaluationWindow.isValid()) {
        this.unparsed = true;
    }
    this.evaluationWindow = evaluationWindow;
  }
  public SecurityMonitoringRuleSequenceDetectionStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Unique name identifying the step.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
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
   * @return SecurityMonitoringRuleSequenceDetectionStep
   */
  @JsonAnySetter
  public SecurityMonitoringRuleSequenceDetectionStep putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringRuleSequenceDetectionStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleSequenceDetectionStep securityMonitoringRuleSequenceDetectionStep = (SecurityMonitoringRuleSequenceDetectionStep) o;
    return Objects.equals(this.condition, securityMonitoringRuleSequenceDetectionStep.condition) && Objects.equals(this.evaluationWindow, securityMonitoringRuleSequenceDetectionStep.evaluationWindow) && Objects.equals(this.name, securityMonitoringRuleSequenceDetectionStep.name) && Objects.equals(this.additionalProperties, securityMonitoringRuleSequenceDetectionStep.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(condition,evaluationWindow,name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleSequenceDetectionStep {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    evaluationWindow: ").append(toIndentedString(evaluationWindow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
