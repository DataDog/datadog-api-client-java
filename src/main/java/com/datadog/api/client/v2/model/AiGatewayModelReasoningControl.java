/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** One supported mechanism for configuring model reasoning. */
@JsonPropertyOrder({
  AiGatewayModelReasoningControl.JSON_PROPERTY_EFFORT_LEVELS,
  AiGatewayModelReasoningControl.JSON_PROPERTY_MAX_BUDGET_TOKENS,
  AiGatewayModelReasoningControl.JSON_PROPERTY_MIN_BUDGET_TOKENS,
  AiGatewayModelReasoningControl.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelReasoningControl {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFORT_LEVELS = "effort_levels";
  private List<String> effortLevels = null;

  public static final String JSON_PROPERTY_MAX_BUDGET_TOKENS = "max_budget_tokens";
  private Long maxBudgetTokens;

  public static final String JSON_PROPERTY_MIN_BUDGET_TOKENS = "min_budget_tokens";
  private Long minBudgetTokens;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AiGatewayModelReasoningControlType type;

  public AiGatewayModelReasoningControl() {}

  @JsonCreator
  public AiGatewayModelReasoningControl(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          AiGatewayModelReasoningControlType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AiGatewayModelReasoningControl effortLevels(List<String> effortLevels) {
    this.effortLevels = effortLevels;
    return this;
  }

  public AiGatewayModelReasoningControl addEffortLevelsItem(String effortLevelsItem) {
    if (this.effortLevels == null) {
      this.effortLevels = new ArrayList<>();
    }
    this.effortLevels.add(effortLevelsItem);
    return this;
  }

  /**
   * Supported effort values in provider order for an effort control.
   *
   * @return effortLevels
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFORT_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEffortLevels() {
    return effortLevels;
  }

  public void setEffortLevels(List<String> effortLevels) {
    this.effortLevels = effortLevels;
  }

  public AiGatewayModelReasoningControl maxBudgetTokens(Long maxBudgetTokens) {
    this.maxBudgetTokens = maxBudgetTokens;
    return this;
  }

  /**
   * Maximum reasoning-token budget. minimum: 0
   *
   * @return maxBudgetTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_BUDGET_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxBudgetTokens() {
    return maxBudgetTokens;
  }

  public void setMaxBudgetTokens(Long maxBudgetTokens) {
    this.maxBudgetTokens = maxBudgetTokens;
  }

  public AiGatewayModelReasoningControl minBudgetTokens(Long minBudgetTokens) {
    this.minBudgetTokens = minBudgetTokens;
    return this;
  }

  /**
   * Minimum reasoning-token budget. minimum: -1
   *
   * @return minBudgetTokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_BUDGET_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinBudgetTokens() {
    return minBudgetTokens;
  }

  public void setMinBudgetTokens(Long minBudgetTokens) {
    this.minBudgetTokens = minBudgetTokens;
  }

  public AiGatewayModelReasoningControl type(AiGatewayModelReasoningControlType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Reasoning-control mechanism.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelReasoningControlType getType() {
    return type;
  }

  public void setType(AiGatewayModelReasoningControlType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return AiGatewayModelReasoningControl
   */
  @JsonAnySetter
  public AiGatewayModelReasoningControl putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelReasoningControl object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelReasoningControl aiGatewayModelReasoningControl =
        (AiGatewayModelReasoningControl) o;
    return Objects.equals(this.effortLevels, aiGatewayModelReasoningControl.effortLevels)
        && Objects.equals(this.maxBudgetTokens, aiGatewayModelReasoningControl.maxBudgetTokens)
        && Objects.equals(this.minBudgetTokens, aiGatewayModelReasoningControl.minBudgetTokens)
        && Objects.equals(this.type, aiGatewayModelReasoningControl.type)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelReasoningControl.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effortLevels, maxBudgetTokens, minBudgetTokens, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelReasoningControl {\n");
    sb.append("    effortLevels: ").append(toIndentedString(effortLevels)).append("\n");
    sb.append("    maxBudgetTokens: ").append(toIndentedString(maxBudgetTokens)).append("\n");
    sb.append("    minBudgetTokens: ").append(toIndentedString(minBudgetTokens)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
