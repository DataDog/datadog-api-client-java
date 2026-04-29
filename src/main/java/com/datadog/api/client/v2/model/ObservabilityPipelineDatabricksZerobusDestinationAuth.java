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

/** OAuth credentials for authenticating with the Databricks Zerobus ingestion API. */
@JsonPropertyOrder({
  ObservabilityPipelineDatabricksZerobusDestinationAuth.JSON_PROPERTY_CLIENT_ID,
  ObservabilityPipelineDatabricksZerobusDestinationAuth.JSON_PROPERTY_CLIENT_SECRET_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineDatabricksZerobusDestinationAuth {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET_KEY = "client_secret_key";
  private String clientSecretKey;

  public ObservabilityPipelineDatabricksZerobusDestinationAuth() {}

  @JsonCreator
  public ObservabilityPipelineDatabricksZerobusDestinationAuth(
      @JsonProperty(required = true, value = JSON_PROPERTY_CLIENT_ID) String clientId) {
    this.clientId = clientId;
  }

  public ObservabilityPipelineDatabricksZerobusDestinationAuth clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Your service principal application ID (UUID).
   *
   * @return clientId
   */
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ObservabilityPipelineDatabricksZerobusDestinationAuth clientSecretKey(
      String clientSecretKey) {
    this.clientSecretKey = clientSecretKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the OAuth client secret used to
   * authenticate with the Databricks ingestion endpoint.
   *
   * @return clientSecretKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getClientSecretKey() {
    return clientSecretKey;
  }

  public void setClientSecretKey(String clientSecretKey) {
    this.clientSecretKey = clientSecretKey;
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
   * @return ObservabilityPipelineDatabricksZerobusDestinationAuth
   */
  @JsonAnySetter
  public ObservabilityPipelineDatabricksZerobusDestinationAuth putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineDatabricksZerobusDestinationAuth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineDatabricksZerobusDestinationAuth
        observabilityPipelineDatabricksZerobusDestinationAuth =
            (ObservabilityPipelineDatabricksZerobusDestinationAuth) o;
    return Objects.equals(
            this.clientId, observabilityPipelineDatabricksZerobusDestinationAuth.clientId)
        && Objects.equals(
            this.clientSecretKey,
            observabilityPipelineDatabricksZerobusDestinationAuth.clientSecretKey)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineDatabricksZerobusDestinationAuth.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecretKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineDatabricksZerobusDestinationAuth {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecretKey: ").append(toIndentedString(clientSecretKey)).append("\n");
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
