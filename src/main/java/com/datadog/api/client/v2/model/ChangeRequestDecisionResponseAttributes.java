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
   * <p>Attributes of a change request decision in a response.</p>
 */
@JsonPropertyOrder({
  ChangeRequestDecisionResponseAttributes.JSON_PROPERTY_CHANGE_REQUEST_STATUS,
  ChangeRequestDecisionResponseAttributes.JSON_PROPERTY_DECIDED_AT,
  ChangeRequestDecisionResponseAttributes.JSON_PROPERTY_DECISION_REASON,
  ChangeRequestDecisionResponseAttributes.JSON_PROPERTY_DELETED_AT,
  ChangeRequestDecisionResponseAttributes.JSON_PROPERTY_REQUEST_REASON,
  ChangeRequestDecisionResponseAttributes.JSON_PROPERTY_REQUESTED_AT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestDecisionResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_REQUEST_STATUS = "change_request_status";
  private ChangeRequestDecisionStatusType changeRequestStatus;

  public static final String JSON_PROPERTY_DECIDED_AT = "decided_at";
  private OffsetDateTime decidedAt;

  public static final String JSON_PROPERTY_DECISION_REASON = "decision_reason";
  private String decisionReason;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_REQUEST_REASON = "request_reason";
  private String requestReason;

  public static final String JSON_PROPERTY_REQUESTED_AT = "requested_at";
  private OffsetDateTime requestedAt;

  public ChangeRequestDecisionResponseAttributes() {}

  @JsonCreator
  public ChangeRequestDecisionResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CHANGE_REQUEST_STATUS)ChangeRequestDecisionStatusType changeRequestStatus,
            @JsonProperty(required=true, value=JSON_PROPERTY_DECIDED_AT)OffsetDateTime decidedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_DECISION_REASON)String decisionReason,
            @JsonProperty(required=true, value=JSON_PROPERTY_DELETED_AT)OffsetDateTime deletedAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUEST_REASON)String requestReason,
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTED_AT)OffsetDateTime requestedAt) {
        this.changeRequestStatus = changeRequestStatus;
        this.unparsed |= !changeRequestStatus.isValid();
        this.decidedAt = decidedAt;
        this.decisionReason = decisionReason;
        this.deletedAt = deletedAt;
        this.requestReason = requestReason;
        this.requestedAt = requestedAt;
  }
  public ChangeRequestDecisionResponseAttributes changeRequestStatus(ChangeRequestDecisionStatusType changeRequestStatus) {
    this.changeRequestStatus = changeRequestStatus;
    this.unparsed |= !changeRequestStatus.isValid();
    return this;
  }

  /**
   * <p>The status of a change request decision.</p>
   * @return changeRequestStatus
  **/
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ChangeRequestDecisionStatusType getChangeRequestStatus() {
        return changeRequestStatus;
      }
  public void setChangeRequestStatus(ChangeRequestDecisionStatusType changeRequestStatus) {
    if (!changeRequestStatus.isValid()) {
        this.unparsed = true;
    }
    this.changeRequestStatus = changeRequestStatus;
  }
  public ChangeRequestDecisionResponseAttributes decidedAt(OffsetDateTime decidedAt) {
    this.decidedAt = decidedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the decision was made.</p>
   * @return decidedAt
  **/
      @JsonProperty(JSON_PROPERTY_DECIDED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getDecidedAt() {
        return decidedAt;
      }
  public void setDecidedAt(OffsetDateTime decidedAt) {
    this.decidedAt = decidedAt;
  }
  public ChangeRequestDecisionResponseAttributes decisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
    return this;
  }

  /**
   * <p>The reason for the decision.</p>
   * @return decisionReason
  **/
      @JsonProperty(JSON_PROPERTY_DECISION_REASON)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getDecisionReason() {
        return decisionReason;
      }
  public void setDecisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
  }
  public ChangeRequestDecisionResponseAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the decision was deleted.</p>
   * @return deletedAt
  **/
      @JsonProperty(JSON_PROPERTY_DELETED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getDeletedAt() {
        return deletedAt;
      }
  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }
  public ChangeRequestDecisionResponseAttributes requestReason(String requestReason) {
    this.requestReason = requestReason;
    return this;
  }

  /**
   * <p>The reason for requesting the decision.</p>
   * @return requestReason
  **/
      @JsonProperty(JSON_PROPERTY_REQUEST_REASON)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getRequestReason() {
        return requestReason;
      }
  public void setRequestReason(String requestReason) {
    this.requestReason = requestReason;
  }
  public ChangeRequestDecisionResponseAttributes requestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * <p>Timestamp of when the decision was requested.</p>
   * @return requestedAt
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getRequestedAt() {
        return requestedAt;
      }
  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
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
   * @return ChangeRequestDecisionResponseAttributes
   */
  @JsonAnySetter
  public ChangeRequestDecisionResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ChangeRequestDecisionResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestDecisionResponseAttributes changeRequestDecisionResponseAttributes = (ChangeRequestDecisionResponseAttributes) o;
    return Objects.equals(this.changeRequestStatus, changeRequestDecisionResponseAttributes.changeRequestStatus) && Objects.equals(this.decidedAt, changeRequestDecisionResponseAttributes.decidedAt) && Objects.equals(this.decisionReason, changeRequestDecisionResponseAttributes.decisionReason) && Objects.equals(this.deletedAt, changeRequestDecisionResponseAttributes.deletedAt) && Objects.equals(this.requestReason, changeRequestDecisionResponseAttributes.requestReason) && Objects.equals(this.requestedAt, changeRequestDecisionResponseAttributes.requestedAt) && Objects.equals(this.additionalProperties, changeRequestDecisionResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(changeRequestStatus,decidedAt,decisionReason,deletedAt,requestReason,requestedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestDecisionResponseAttributes {\n");
    sb.append("    changeRequestStatus: ").append(toIndentedString(changeRequestStatus)).append("\n");
    sb.append("    decidedAt: ").append(toIndentedString(decidedAt)).append("\n");
    sb.append("    decisionReason: ").append(toIndentedString(decisionReason)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    requestReason: ").append(toIndentedString(requestReason)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
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
