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
import java.util.UUID;

/** Attributes for registering a token. */
@JsonPropertyOrder({
  OnPremManagementServiceRegisterTokenAttributes.JSON_PROPERTY_APP_ID,
  OnPremManagementServiceRegisterTokenAttributes.JSON_PROPERTY_APP_VERSION,
  OnPremManagementServiceRegisterTokenAttributes.JSON_PROPERTY_CONNECTION_ID,
  OnPremManagementServiceRegisterTokenAttributes.JSON_PROPERTY_QUERY_ID,
  OnPremManagementServiceRegisterTokenAttributes.JSON_PROPERTY_RUNNER_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OnPremManagementServiceRegisterTokenAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APP_ID = "app_id";
  private UUID appId;

  public static final String JSON_PROPERTY_APP_VERSION = "app_version";
  private Long appVersion;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private UUID connectionId;

  public static final String JSON_PROPERTY_QUERY_ID = "query_id";
  private UUID queryId;

  public static final String JSON_PROPERTY_RUNNER_ID = "runner_id";
  private String runnerId;

  public OnPremManagementServiceRegisterTokenAttributes() {}

  @JsonCreator
  public OnPremManagementServiceRegisterTokenAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONNECTION_ID) UUID connectionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUNNER_ID) String runnerId) {
    this.connectionId = connectionId;
    this.runnerId = runnerId;
  }

  public OnPremManagementServiceRegisterTokenAttributes appId(UUID appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The application identifier.
   *
   * @return appId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getAppId() {
    return appId;
  }

  public void setAppId(UUID appId) {
    this.appId = appId;
  }

  public OnPremManagementServiceRegisterTokenAttributes appVersion(Long appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * The application version.
   *
   * @return appVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(Long appVersion) {
    this.appVersion = appVersion;
  }

  public OnPremManagementServiceRegisterTokenAttributes connectionId(UUID connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * The connection identifier.
   *
   * @return connectionId
   */
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(UUID connectionId) {
    this.connectionId = connectionId;
  }

  public OnPremManagementServiceRegisterTokenAttributes queryId(UUID queryId) {
    this.queryId = queryId;
    return this;
  }

  /**
   * The query identifier.
   *
   * @return queryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getQueryId() {
    return queryId;
  }

  public void setQueryId(UUID queryId) {
    this.queryId = queryId;
  }

  public OnPremManagementServiceRegisterTokenAttributes runnerId(String runnerId) {
    this.runnerId = runnerId;
    return this;
  }

  /**
   * The on-prem runner identifier.
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
   * @return OnPremManagementServiceRegisterTokenAttributes
   */
  @JsonAnySetter
  public OnPremManagementServiceRegisterTokenAttributes putAdditionalProperty(
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

  /** Return true if this OnPremManagementServiceRegisterTokenAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnPremManagementServiceRegisterTokenAttributes onPremManagementServiceRegisterTokenAttributes =
        (OnPremManagementServiceRegisterTokenAttributes) o;
    return Objects.equals(this.appId, onPremManagementServiceRegisterTokenAttributes.appId)
        && Objects.equals(
            this.appVersion, onPremManagementServiceRegisterTokenAttributes.appVersion)
        && Objects.equals(
            this.connectionId, onPremManagementServiceRegisterTokenAttributes.connectionId)
        && Objects.equals(this.queryId, onPremManagementServiceRegisterTokenAttributes.queryId)
        && Objects.equals(this.runnerId, onPremManagementServiceRegisterTokenAttributes.runnerId)
        && Objects.equals(
            this.additionalProperties,
            onPremManagementServiceRegisterTokenAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appVersion, connectionId, queryId, runnerId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnPremManagementServiceRegisterTokenAttributes {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
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
