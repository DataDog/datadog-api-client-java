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

/** Request payload for executing a remediation. */
@JsonPropertyOrder({
  RemediationExecuteRequest.JSON_PROPERTY_CONNECTION_ID,
  RemediationExecuteRequest.JSON_PROPERTY_INVESTIGATION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationExecuteRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_INVESTIGATION_ID = "investigation_id";
  private String investigationId;

  public RemediationExecuteRequest() {}

  @JsonCreator
  public RemediationExecuteRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_ID) String connectionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_INVESTIGATION_ID)
          String investigationId) {
    this.connectionId = connectionId;
    this.investigationId = investigationId;
  }

  public RemediationExecuteRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * The Action Platform AWS connection ID to execute through. Must carry the integration_aws
   * connection prefix.
   *
   * @return connectionId
   */
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public RemediationExecuteRequest investigationId(String investigationId) {
    this.investigationId = investigationId;
    return this;
  }

  /**
   * The ID of the investigation to remediate.
   *
   * @return investigationId
   */
  @JsonProperty(JSON_PROPERTY_INVESTIGATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInvestigationId() {
    return investigationId;
  }

  public void setInvestigationId(String investigationId) {
    this.investigationId = investigationId;
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
   * @return RemediationExecuteRequest
   */
  @JsonAnySetter
  public RemediationExecuteRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationExecuteRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationExecuteRequest remediationExecuteRequest = (RemediationExecuteRequest) o;
    return Objects.equals(this.connectionId, remediationExecuteRequest.connectionId)
        && Objects.equals(this.investigationId, remediationExecuteRequest.investigationId)
        && Objects.equals(
            this.additionalProperties, remediationExecuteRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, investigationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationExecuteRequest {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    investigationId: ").append(toIndentedString(investigationId)).append("\n");
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
