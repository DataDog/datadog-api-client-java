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

/** The attributes of a data observability monitor run status response. */
@JsonPropertyOrder({
  GetDataObservabilityMonitorRunStatusResponseAttributes.JSON_PROPERTY_ERROR_MESSAGE,
  GetDataObservabilityMonitorRunStatusResponseAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetDataObservabilityMonitorRunStatusResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DataObservabilityMonitorRunStatus status;

  public GetDataObservabilityMonitorRunStatusResponseAttributes() {}

  @JsonCreator
  public GetDataObservabilityMonitorRunStatusResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          DataObservabilityMonitorRunStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public GetDataObservabilityMonitorRunStatusResponseAttributes errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message describing why the monitor run failed. Only present when status is error.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public GetDataObservabilityMonitorRunStatusResponseAttributes status(
      DataObservabilityMonitorRunStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a data observability monitor run.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DataObservabilityMonitorRunStatus getStatus() {
    return status;
  }

  public void setStatus(DataObservabilityMonitorRunStatus status) {
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
   * @return GetDataObservabilityMonitorRunStatusResponseAttributes
   */
  @JsonAnySetter
  public GetDataObservabilityMonitorRunStatusResponseAttributes putAdditionalProperty(
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
   * Return true if this GetDataObservabilityMonitorRunStatusResponseAttributes object is equal to
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
    GetDataObservabilityMonitorRunStatusResponseAttributes
        getDataObservabilityMonitorRunStatusResponseAttributes =
            (GetDataObservabilityMonitorRunStatusResponseAttributes) o;
    return Objects.equals(
            this.errorMessage, getDataObservabilityMonitorRunStatusResponseAttributes.errorMessage)
        && Objects.equals(
            this.status, getDataObservabilityMonitorRunStatusResponseAttributes.status)
        && Objects.equals(
            this.additionalProperties,
            getDataObservabilityMonitorRunStatusResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataObservabilityMonitorRunStatusResponseAttributes {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
