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

/** Trigger data */
@JsonPropertyOrder({
  CaseNotificationRuleTriggerData.JSON_PROPERTY_CHANGE_TYPE,
  CaseNotificationRuleTriggerData.JSON_PROPERTY_FIELD,
  CaseNotificationRuleTriggerData.JSON_PROPERTY_FROM_STATUS,
  CaseNotificationRuleTriggerData.JSON_PROPERTY_FROM_STATUS_NAME,
  CaseNotificationRuleTriggerData.JSON_PROPERTY_TO_STATUS,
  CaseNotificationRuleTriggerData.JSON_PROPERTY_TO_STATUS_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseNotificationRuleTriggerData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_TYPE = "change_type";
  private String changeType;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_FROM_STATUS = "from_status";
  private String fromStatus;

  public static final String JSON_PROPERTY_FROM_STATUS_NAME = "from_status_name";
  private String fromStatusName;

  public static final String JSON_PROPERTY_TO_STATUS = "to_status";
  private String toStatus;

  public static final String JSON_PROPERTY_TO_STATUS_NAME = "to_status_name";
  private String toStatusName;

  public CaseNotificationRuleTriggerData changeType(String changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Change type (added, removed, changed)
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

  public CaseNotificationRuleTriggerData field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Field name for attribute value changed trigger
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

  public CaseNotificationRuleTriggerData fromStatus(String fromStatus) {
    this.fromStatus = fromStatus;
    return this;
  }

  /**
   * Status ID to transition from
   *
   * @return fromStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFromStatus() {
    return fromStatus;
  }

  public void setFromStatus(String fromStatus) {
    this.fromStatus = fromStatus;
  }

  public CaseNotificationRuleTriggerData fromStatusName(String fromStatusName) {
    this.fromStatusName = fromStatusName;
    return this;
  }

  /**
   * Status name to transition from
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

  public CaseNotificationRuleTriggerData toStatus(String toStatus) {
    this.toStatus = toStatus;
    return this;
  }

  /**
   * Status ID to transition to
   *
   * @return toStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToStatus() {
    return toStatus;
  }

  public void setToStatus(String toStatus) {
    this.toStatus = toStatus;
  }

  public CaseNotificationRuleTriggerData toStatusName(String toStatusName) {
    this.toStatusName = toStatusName;
    return this;
  }

  /**
   * Status name to transition to
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
   * @return CaseNotificationRuleTriggerData
   */
  @JsonAnySetter
  public CaseNotificationRuleTriggerData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseNotificationRuleTriggerData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseNotificationRuleTriggerData caseNotificationRuleTriggerData =
        (CaseNotificationRuleTriggerData) o;
    return Objects.equals(this.changeType, caseNotificationRuleTriggerData.changeType)
        && Objects.equals(this.field, caseNotificationRuleTriggerData.field)
        && Objects.equals(this.fromStatus, caseNotificationRuleTriggerData.fromStatus)
        && Objects.equals(this.fromStatusName, caseNotificationRuleTriggerData.fromStatusName)
        && Objects.equals(this.toStatus, caseNotificationRuleTriggerData.toStatus)
        && Objects.equals(this.toStatusName, caseNotificationRuleTriggerData.toStatusName)
        && Objects.equals(
            this.additionalProperties, caseNotificationRuleTriggerData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changeType,
        field,
        fromStatus,
        fromStatusName,
        toStatus,
        toStatusName,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseNotificationRuleTriggerData {\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fromStatus: ").append(toIndentedString(fromStatus)).append("\n");
    sb.append("    fromStatusName: ").append(toIndentedString(fromStatusName)).append("\n");
    sb.append("    toStatus: ").append(toIndentedString(toStatus)).append("\n");
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
