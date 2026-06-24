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

/**
 * HTTP Basic Authentication credentials for the ClickHouse destination. When <code>strategy</code>
 * is <code>basic</code>, provide <code>username_key</code> and <code>password_key</code> that
 * reference environment variables or secrets containing the credentials.
 */
@JsonPropertyOrder({
  ObservabilityPipelineClickhouseDestinationAuth.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelineClickhouseDestinationAuth.JSON_PROPERTY_STRATEGY,
  ObservabilityPipelineClickhouseDestinationAuth.JSON_PROPERTY_USERNAME_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClickhouseDestinationAuth {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private ObservabilityPipelineClickhouseDestinationAuthStrategy strategy;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public ObservabilityPipelineClickhouseDestinationAuth() {}

  @JsonCreator
  public ObservabilityPipelineClickhouseDestinationAuth(
      @JsonProperty(required = true, value = JSON_PROPERTY_STRATEGY)
          ObservabilityPipelineClickhouseDestinationAuthStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
  }

  public ObservabilityPipelineClickhouseDestinationAuth passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that contains the ClickHouse password.
   *
   * @return passwordKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPasswordKey() {
    return passwordKey;
  }

  public void setPasswordKey(String passwordKey) {
    this.passwordKey = passwordKey;
  }

  public ObservabilityPipelineClickhouseDestinationAuth strategy(
      ObservabilityPipelineClickhouseDestinationAuthStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
    return this;
  }

  /**
   * The authentication strategy for ClickHouse HTTP requests. Only <code>basic</code> is supported.
   *
   * @return strategy
   */
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineClickhouseDestinationAuthStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(ObservabilityPipelineClickhouseDestinationAuthStrategy strategy) {
    if (!strategy.isValid()) {
      this.unparsed = true;
    }
    this.strategy = strategy;
  }

  public ObservabilityPipelineClickhouseDestinationAuth usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that contains the ClickHouse username.
   *
   * @return usernameKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsernameKey() {
    return usernameKey;
  }

  public void setUsernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
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
   * @return ObservabilityPipelineClickhouseDestinationAuth
   */
  @JsonAnySetter
  public ObservabilityPipelineClickhouseDestinationAuth putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineClickhouseDestinationAuth object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClickhouseDestinationAuth observabilityPipelineClickhouseDestinationAuth =
        (ObservabilityPipelineClickhouseDestinationAuth) o;
    return Objects.equals(
            this.passwordKey, observabilityPipelineClickhouseDestinationAuth.passwordKey)
        && Objects.equals(this.strategy, observabilityPipelineClickhouseDestinationAuth.strategy)
        && Objects.equals(
            this.usernameKey, observabilityPipelineClickhouseDestinationAuth.usernameKey)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineClickhouseDestinationAuth.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordKey, strategy, usernameKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClickhouseDestinationAuth {\n");
    sb.append("    passwordKey: ").append(toIndentedString(passwordKey)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    usernameKey: ").append(toIndentedString(usernameKey)).append("\n");
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
