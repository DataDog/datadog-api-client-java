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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Applies a manual severity override to the findings. */
@JsonPropertyOrder({
  SeverityOverrideSet.JSON_PROPERTY_ACTION,
  SeverityOverrideSet.JSON_PROPERTY_DESCRIPTION,
  SeverityOverrideSet.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SeverityOverrideSet {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private SeverityOverrideSetActionType action = SeverityOverrideSetActionType.SET;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_VALUE = "value";
  private SeverityOverrideValue value;

  public SeverityOverrideSet() {}

  @JsonCreator
  public SeverityOverrideSet(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION)
          SeverityOverrideSetActionType action,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) SeverityOverrideValue value) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.value = value;
    this.unparsed |= !value.isValid();
  }

  public SeverityOverrideSet action(SeverityOverrideSetActionType action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The action that applies a manual severity override.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SeverityOverrideSetActionType getAction() {
    return action;
  }

  public void setAction(SeverityOverrideSetActionType action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public SeverityOverrideSet description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Additional information about the severity change. This field has a limit of 280 characters.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SeverityOverrideSet value(SeverityOverrideValue value) {
    this.value = value;
    this.unparsed |= !value.isValid();
    return this;
  }

  /**
   * Severity to apply to the findings. <code>info</code> sets the lowest severity the finding type
   * allows.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SeverityOverrideValue getValue() {
    return value;
  }

  public void setValue(SeverityOverrideValue value) {
    if (!value.isValid()) {
      this.unparsed = true;
    }
    this.value = value;
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
   * @return SeverityOverrideSet
   */
  @JsonAnySetter
  public SeverityOverrideSet putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SeverityOverrideSet object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeverityOverrideSet severityOverrideSet = (SeverityOverrideSet) o;
    return Objects.equals(this.action, severityOverrideSet.action)
        && Objects.equals(this.description, severityOverrideSet.description)
        && Objects.equals(this.value, severityOverrideSet.value)
        && Objects.equals(this.additionalProperties, severityOverrideSet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, description, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeverityOverrideSet {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
