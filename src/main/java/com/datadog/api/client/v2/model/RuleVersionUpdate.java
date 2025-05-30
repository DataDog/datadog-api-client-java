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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A change in a rule version. */
@JsonPropertyOrder({
  RuleVersionUpdate.JSON_PROPERTY_CHANGE,
  RuleVersionUpdate.JSON_PROPERTY_FIELD,
  RuleVersionUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RuleVersionUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE = "change";
  private String change;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_TYPE = "type";
  private RuleVersionUpdateType type;

  public RuleVersionUpdate change(String change) {
    this.change = change;
    return this;
  }

  /**
   * The new value of the field.
   *
   * @return change
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public RuleVersionUpdate field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field that was changed.
   *
   * @return field
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RuleVersionUpdate type(RuleVersionUpdateType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of change.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RuleVersionUpdateType getType() {
    return type;
  }

  public void setType(RuleVersionUpdateType type) {
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
   * @return RuleVersionUpdate
   */
  @JsonAnySetter
  public RuleVersionUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RuleVersionUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleVersionUpdate ruleVersionUpdate = (RuleVersionUpdate) o;
    return Objects.equals(this.change, ruleVersionUpdate.change)
        && Objects.equals(this.field, ruleVersionUpdate.field)
        && Objects.equals(this.type, ruleVersionUpdate.type)
        && Objects.equals(this.additionalProperties, ruleVersionUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, field, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleVersionUpdate {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
