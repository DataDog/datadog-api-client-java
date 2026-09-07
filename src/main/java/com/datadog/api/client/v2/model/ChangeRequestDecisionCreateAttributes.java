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

/** Attributes for creating a change request decision. */
@JsonPropertyOrder({
  ChangeRequestDecisionCreateAttributes.JSON_PROPERTY_CHANGE_REQUEST_STATUS,
  ChangeRequestDecisionCreateAttributes.JSON_PROPERTY_REQUEST_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestDecisionCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_REQUEST_STATUS = "change_request_status";
  private ChangeRequestDecisionStatusType changeRequestStatus;

  public static final String JSON_PROPERTY_REQUEST_REASON = "request_reason";
  private String requestReason;

  public ChangeRequestDecisionCreateAttributes changeRequestStatus(
      ChangeRequestDecisionStatusType changeRequestStatus) {
    this.changeRequestStatus = changeRequestStatus;
    this.unparsed |= !changeRequestStatus.isValid();
    return this;
  }

  /**
   * The status of a change request decision.
   *
   * @return changeRequestStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeRequestDecisionStatusType getChangeRequestStatus() {
    return changeRequestStatus;
  }

  public void setChangeRequestStatus(ChangeRequestDecisionStatusType changeRequestStatus) {
    if (!changeRequestStatus.isValid()) {
      this.unparsed = true;
    }
    this.changeRequestStatus = changeRequestStatus;
  }

  public ChangeRequestDecisionCreateAttributes requestReason(String requestReason) {
    this.requestReason = requestReason;
    return this;
  }

  /**
   * The reason for requesting the decision.
   *
   * @return requestReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestReason() {
    return requestReason;
  }

  public void setRequestReason(String requestReason) {
    this.requestReason = requestReason;
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
   * @return ChangeRequestDecisionCreateAttributes
   */
  @JsonAnySetter
  public ChangeRequestDecisionCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ChangeRequestDecisionCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestDecisionCreateAttributes changeRequestDecisionCreateAttributes =
        (ChangeRequestDecisionCreateAttributes) o;
    return Objects.equals(
            this.changeRequestStatus, changeRequestDecisionCreateAttributes.changeRequestStatus)
        && Objects.equals(this.requestReason, changeRequestDecisionCreateAttributes.requestReason)
        && Objects.equals(
            this.additionalProperties, changeRequestDecisionCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeRequestStatus, requestReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestDecisionCreateAttributes {\n");
    sb.append("    changeRequestStatus: ")
        .append(toIndentedString(changeRequestStatus))
        .append("\n");
    sb.append("    requestReason: ").append(toIndentedString(requestReason)).append("\n");
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
