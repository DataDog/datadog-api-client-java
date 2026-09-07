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

/** A condition that must be met to trigger the notification rule. */
@JsonPropertyOrder({
  IncidentNotificationRuleConditionsItems.JSON_PROPERTY_FIELD,
  IncidentNotificationRuleConditionsItems.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationRuleConditionsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public IncidentNotificationRuleConditionsItems() {}

  @JsonCreator
  public IncidentNotificationRuleConditionsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELD) String field,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUES) List<String> values) {
    this.field = field;
    this.values = values;
  }

  public IncidentNotificationRuleConditionsItems field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The incident field to evaluate
   *
   * @return field
   */
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public IncidentNotificationRuleConditionsItems values(List<String> values) {
    this.values = values;
    return this;
  }

  public IncidentNotificationRuleConditionsItems addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The value(s) to compare against. Multiple values are <code>ORed</code> together.
   *
   * @return values
   */
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return IncidentNotificationRuleConditionsItems
   */
  @JsonAnySetter
  public IncidentNotificationRuleConditionsItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentNotificationRuleConditionsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationRuleConditionsItems incidentNotificationRuleConditionsItems =
        (IncidentNotificationRuleConditionsItems) o;
    return Objects.equals(this.field, incidentNotificationRuleConditionsItems.field)
        && Objects.equals(this.values, incidentNotificationRuleConditionsItems.values)
        && Objects.equals(
            this.additionalProperties,
            incidentNotificationRuleConditionsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationRuleConditionsItems {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
