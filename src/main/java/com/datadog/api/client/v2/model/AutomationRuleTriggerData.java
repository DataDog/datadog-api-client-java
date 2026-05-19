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

/**
 * Additional configuration for the trigger, dependent on the trigger type. For <code>
 * status_transitioned</code> triggers, specify <code>from_status_name</code> and <code>
 * to_status_name</code>. For <code>attribute_value_changed</code> triggers, specify <code>field
 * </code> and <code>change_type</code>.
 */
@JsonPropertyOrder({
  AutomationRuleTriggerData.JSON_PROPERTY_APPROVAL_TYPE,
  AutomationRuleTriggerData.JSON_PROPERTY_CHANGE_TYPE,
  AutomationRuleTriggerData.JSON_PROPERTY_FIELD,
  AutomationRuleTriggerData.JSON_PROPERTY_FROM_STATUS_NAME,
  AutomationRuleTriggerData.JSON_PROPERTY_TO_STATUS_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AutomationRuleTriggerData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPROVAL_TYPE = "approval_type";
  private String approvalType;

  public static final String JSON_PROPERTY_CHANGE_TYPE = "change_type";
  private String changeType;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_FROM_STATUS_NAME = "from_status_name";
  private String fromStatusName;

  public static final String JSON_PROPERTY_TO_STATUS_NAME = "to_status_name";
  private String toStatusName;

  public AutomationRuleTriggerData approvalType(String approvalType) {
    this.approvalType = approvalType;
    return this;
  }

  /**
   * The approval outcome to match. Used with <code>case_review_approved</code> triggers.
   *
   * @return approvalType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPROVAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApprovalType() {
    return approvalType;
  }

  public void setApprovalType(String approvalType) {
    this.approvalType = approvalType;
  }

  public AutomationRuleTriggerData changeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * The kind of attribute change to match. Allowed values: <code>VALUE_ADDED</code>, <code>
   * VALUE_DELETED</code>, <code>ANY_CHANGES</code>. Used with <code>attribute_value_changed</code>
   * triggers.
   *
   * @return changeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChangeType() {
    return changeType;
  }

  public void setChangeType(String changeType) {
    this.changeType = changeType;
  }

  public AutomationRuleTriggerData field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The case attribute field name to monitor for changes. Used with <code>attribute_value_changed
   * </code> triggers.
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

  public AutomationRuleTriggerData fromStatusName(String fromStatusName) {
    this.fromStatusName = fromStatusName;
    return this;
  }

  /**
   * The originating status name. Used with <code>status_transitioned</code> triggers to match
   * transitions from this status.
   *
   * @return fromStatusName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFromStatusName() {
    return fromStatusName;
  }

  public void setFromStatusName(String fromStatusName) {
    this.fromStatusName = fromStatusName;
  }

  public AutomationRuleTriggerData toStatusName(String toStatusName) {
    this.toStatusName = toStatusName;
    return this;
  }

  /**
   * The destination status name. Used with <code>status_transitioned</code> triggers to match
   * transitions to this status.
   *
   * @return toStatusName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToStatusName() {
    return toStatusName;
  }

  public void setToStatusName(String toStatusName) {
    this.toStatusName = toStatusName;
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
   * @return AutomationRuleTriggerData
   */
  @JsonAnySetter
  public AutomationRuleTriggerData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AutomationRuleTriggerData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRuleTriggerData automationRuleTriggerData = (AutomationRuleTriggerData) o;
    return Objects.equals(this.approvalType, automationRuleTriggerData.approvalType)
        && Objects.equals(this.changeType, automationRuleTriggerData.changeType)
        && Objects.equals(this.field, automationRuleTriggerData.field)
        && Objects.equals(this.fromStatusName, automationRuleTriggerData.fromStatusName)
        && Objects.equals(this.toStatusName, automationRuleTriggerData.toStatusName)
        && Objects.equals(
            this.additionalProperties, automationRuleTriggerData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        approvalType, changeType, field, fromStatusName, toStatusName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRuleTriggerData {\n");
    sb.append("    approvalType: ").append(toIndentedString(approvalType)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fromStatusName: ").append(toIndentedString(fromStatusName)).append("\n");
    sb.append("    toStatusName: ").append(toIndentedString(toStatusName)).append("\n");
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
