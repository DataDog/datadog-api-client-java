/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A targeting rule in the protocol template. */
@JsonPropertyOrder({ExperimentsProtocolTargetingRuleInput.JSON_PROPERTY_CONDITIONS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsProtocolTargetingRuleInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private JsonNullable<List<ExperimentsProtocolConditionInput>> conditions =
      JsonNullable.<List<ExperimentsProtocolConditionInput>>undefined();

  public ExperimentsProtocolTargetingRuleInput conditions(
      List<ExperimentsProtocolConditionInput> conditions) {
    this.conditions = JsonNullable.<List<ExperimentsProtocolConditionInput>>of(conditions);
    return this;
  }

  public ExperimentsProtocolTargetingRuleInput addConditionsItem(
      ExperimentsProtocolConditionInput conditionsItem) {
    if (this.conditions == null || !this.conditions.isPresent()) {
      this.conditions = JsonNullable.<List<ExperimentsProtocolConditionInput>>of(new ArrayList<>());
    }
    try {
      this.conditions.get().add(conditionsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Conditions in this rule.
   *
   * @return conditions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ExperimentsProtocolConditionInput> getConditions() {
    return conditions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ExperimentsProtocolConditionInput>> getConditions_JsonNullable() {
    return conditions;
  }

  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  public void setConditions_JsonNullable(
      JsonNullable<List<ExperimentsProtocolConditionInput>> conditions) {
    this.conditions = conditions;
  }

  public void setConditions(List<ExperimentsProtocolConditionInput> conditions) {
    this.conditions = JsonNullable.<List<ExperimentsProtocolConditionInput>>of(conditions);
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
   * @return ExperimentsProtocolTargetingRuleInput
   */
  @JsonAnySetter
  public ExperimentsProtocolTargetingRuleInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsProtocolTargetingRuleInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsProtocolTargetingRuleInput experimentsProtocolTargetingRuleInput =
        (ExperimentsProtocolTargetingRuleInput) o;
    return Objects.equals(this.conditions, experimentsProtocolTargetingRuleInput.conditions)
        && Objects.equals(
            this.additionalProperties, experimentsProtocolTargetingRuleInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsProtocolTargetingRuleInput {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
