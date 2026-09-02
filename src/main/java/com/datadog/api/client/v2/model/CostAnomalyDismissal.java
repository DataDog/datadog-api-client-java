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

/** Resolution metadata for an anomaly that has been dismissed. */
@JsonPropertyOrder({
  CostAnomalyDismissal.JSON_PROPERTY_CAUSE,
  CostAnomalyDismissal.JSON_PROPERTY_DISMISSAL_ID,
  CostAnomalyDismissal.JSON_PROPERTY_MESSAGE,
  CostAnomalyDismissal.JSON_PROPERTY_UPDATED_AT,
  CostAnomalyDismissal.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostAnomalyDismissal {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAUSE = "cause";
  private String cause;

  public static final String JSON_PROPERTY_DISMISSAL_ID = "dismissal_id";
  private String dismissalId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public CostAnomalyDismissal() {}

  @JsonCreator
  public CostAnomalyDismissal(
      @JsonProperty(required = true, value = JSON_PROPERTY_CAUSE) String cause,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISMISSAL_ID) String dismissalId,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) Long updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY) String updatedBy) {
    this.cause = cause;
    this.dismissalId = dismissalId;
    this.message = message;
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
  }

  public CostAnomalyDismissal cause(String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Reason the anomaly was dismissed.
   *
   * @return cause
   */
  @JsonProperty(JSON_PROPERTY_CAUSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public CostAnomalyDismissal dismissalId(String dismissalId) {
    this.dismissalId = dismissalId;
    return this;
  }

  /**
   * Unique identifier of the dismissal record.
   *
   * @return dismissalId
   */
  @JsonProperty(JSON_PROPERTY_DISMISSAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDismissalId() {
    return dismissalId;
  }

  public void setDismissalId(String dismissalId) {
    this.dismissalId = dismissalId;
  }

  public CostAnomalyDismissal message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Optional message explaining the dismissal.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CostAnomalyDismissal updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp of the last dismissal update in Unix milliseconds.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CostAnomalyDismissal updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Identifier of the user that last updated the dismissal.
   *
   * @return updatedBy
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return CostAnomalyDismissal
   */
  @JsonAnySetter
  public CostAnomalyDismissal putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostAnomalyDismissal object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostAnomalyDismissal costAnomalyDismissal = (CostAnomalyDismissal) o;
    return Objects.equals(this.cause, costAnomalyDismissal.cause)
        && Objects.equals(this.dismissalId, costAnomalyDismissal.dismissalId)
        && Objects.equals(this.message, costAnomalyDismissal.message)
        && Objects.equals(this.updatedAt, costAnomalyDismissal.updatedAt)
        && Objects.equals(this.updatedBy, costAnomalyDismissal.updatedBy)
        && Objects.equals(this.additionalProperties, costAnomalyDismissal.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, dismissalId, message, updatedAt, updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostAnomalyDismissal {\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    dismissalId: ").append(toIndentedString(dismissalId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
