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

/** Response for a bulk triage update of security signals. */
@JsonPropertyOrder({
  SecurityMonitoringSignalsBulkTriageUpdateResponse.JSON_PROPERTY_RESULT,
  SecurityMonitoringSignalsBulkTriageUpdateResponse.JSON_PROPERTY_STATUS,
  SecurityMonitoringSignalsBulkTriageUpdateResponse.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalsBulkTriageUpdateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESULT = "result";
  private SecurityMonitoringSignalsBulkTriageUpdateResult result;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SecurityMonitoringSignalsBulkTriageUpdateResponse() {}

  @JsonCreator
  public SecurityMonitoringSignalsBulkTriageUpdateResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULT)
          SecurityMonitoringSignalsBulkTriageUpdateResult result,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.result = result;
    this.unparsed |= result.unparsed;
    this.status = status;
    this.type = type;
  }

  public SecurityMonitoringSignalsBulkTriageUpdateResponse result(
      SecurityMonitoringSignalsBulkTriageUpdateResult result) {
    this.result = result;
    this.unparsed |= result.unparsed;
    return this;
  }

  /**
   * The result payload of a bulk signal triage update.
   *
   * @return result
   */
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringSignalsBulkTriageUpdateResult getResult() {
    return result;
  }

  public void setResult(SecurityMonitoringSignalsBulkTriageUpdateResult result) {
    this.result = result;
  }

  public SecurityMonitoringSignalsBulkTriageUpdateResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the bulk operation.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SecurityMonitoringSignalsBulkTriageUpdateResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the response.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return SecurityMonitoringSignalsBulkTriageUpdateResponse
   */
  @JsonAnySetter
  public SecurityMonitoringSignalsBulkTriageUpdateResponse putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringSignalsBulkTriageUpdateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsBulkTriageUpdateResponse
        securityMonitoringSignalsBulkTriageUpdateResponse =
            (SecurityMonitoringSignalsBulkTriageUpdateResponse) o;
    return Objects.equals(this.result, securityMonitoringSignalsBulkTriageUpdateResponse.result)
        && Objects.equals(this.status, securityMonitoringSignalsBulkTriageUpdateResponse.status)
        && Objects.equals(this.type, securityMonitoringSignalsBulkTriageUpdateResponse.type)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalsBulkTriageUpdateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsBulkTriageUpdateResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
