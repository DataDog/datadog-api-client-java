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

/** Attributes for the enrollment status. */
@JsonPropertyOrder({
  OnPremManagementServiceGetEnrollmentResponseAttributes.JSON_PROPERTY_FAILURE_REASON,
  OnPremManagementServiceGetEnrollmentResponseAttributes.JSON_PROPERTY_RUNNER_ID,
  OnPremManagementServiceGetEnrollmentResponseAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnPremManagementServiceGetEnrollmentResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAILURE_REASON = "failure_reason";
  private String failureReason;

  public static final String JSON_PROPERTY_RUNNER_ID = "runner_id";
  private String runnerId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private OnPremManagementServiceGetEnrollmentResponseAttributesStatus status;

  public OnPremManagementServiceGetEnrollmentResponseAttributes() {}

  @JsonCreator
  public OnPremManagementServiceGetEnrollmentResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILURE_REASON) String failureReason,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUNNER_ID) String runnerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          OnPremManagementServiceGetEnrollmentResponseAttributesStatus status) {
    this.failureReason = failureReason;
    this.runnerId = runnerId;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public OnPremManagementServiceGetEnrollmentResponseAttributes failureReason(
      String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * The reason for enrollment failure, if applicable.
   *
   * @return failureReason
   */
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public OnPremManagementServiceGetEnrollmentResponseAttributes runnerId(String runnerId) {
    this.runnerId = runnerId;
    return this;
  }

  /**
   * The runner identifier, if enrollment was successful.
   *
   * @return runnerId
   */
  @JsonProperty(JSON_PROPERTY_RUNNER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRunnerId() {
    return runnerId;
  }

  public void setRunnerId(String runnerId) {
    this.runnerId = runnerId;
  }

  public OnPremManagementServiceGetEnrollmentResponseAttributes status(
      OnPremManagementServiceGetEnrollmentResponseAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the enrollment.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OnPremManagementServiceGetEnrollmentResponseAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(OnPremManagementServiceGetEnrollmentResponseAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return OnPremManagementServiceGetEnrollmentResponseAttributes
   */
  @JsonAnySetter
  public OnPremManagementServiceGetEnrollmentResponseAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this OnPremManagementServiceGetEnrollmentResponseAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnPremManagementServiceGetEnrollmentResponseAttributes
        onPremManagementServiceGetEnrollmentResponseAttributes =
            (OnPremManagementServiceGetEnrollmentResponseAttributes) o;
    return Objects.equals(
            this.failureReason,
            onPremManagementServiceGetEnrollmentResponseAttributes.failureReason)
        && Objects.equals(
            this.runnerId, onPremManagementServiceGetEnrollmentResponseAttributes.runnerId)
        && Objects.equals(
            this.status, onPremManagementServiceGetEnrollmentResponseAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            onPremManagementServiceGetEnrollmentResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureReason, runnerId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnPremManagementServiceGetEnrollmentResponseAttributes {\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
