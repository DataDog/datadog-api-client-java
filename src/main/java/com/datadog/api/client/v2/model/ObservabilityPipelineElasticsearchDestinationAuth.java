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
   * <p>Authentication settings for the Elasticsearch destination.
   * When <code>strategy</code> is <code>basic</code>, use <code>username_key</code> and <code>password_key</code> to reference credentials stored in environment variables or secrets.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineElasticsearchDestinationAuth.JSON_PROPERTY_PASSWORD_KEY,
  ObservabilityPipelineElasticsearchDestinationAuth.JSON_PROPERTY_STRATEGY,
  ObservabilityPipelineElasticsearchDestinationAuth.JSON_PROPERTY_USERNAME_KEY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineElasticsearchDestinationAuth {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PASSWORD_KEY = "password_key";
  private String passwordKey;

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy;

  public static final String JSON_PROPERTY_USERNAME_KEY = "username_key";
  private String usernameKey;

  public ObservabilityPipelineElasticsearchDestinationAuth() {}

  @JsonCreator
  public ObservabilityPipelineElasticsearchDestinationAuth(
            @JsonProperty(required=true, value=JSON_PROPERTY_STRATEGY)ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy) {
        this.strategy = strategy;
        this.unparsed |= !strategy.isValid();
  }
  public ObservabilityPipelineElasticsearchDestinationAuth passwordKey(String passwordKey) {
    this.passwordKey = passwordKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the Elasticsearch password (used when <code>strategy</code> is <code>basic</code>).</p>
   * @return passwordKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PASSWORD_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPasswordKey() {
        return passwordKey;
      }
  public void setPasswordKey(String passwordKey) {
    this.passwordKey = passwordKey;
  }
  public ObservabilityPipelineElasticsearchDestinationAuth strategy(ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy) {
    this.strategy = strategy;
    this.unparsed |= !strategy.isValid();
    return this;
  }

  /**
   * <p>The authentication strategy to use.</p>
   * @return strategy
  **/
      @JsonProperty(JSON_PROPERTY_STRATEGY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy getStrategy() {
        return strategy;
      }
  public void setStrategy(ObservabilityPipelineAmazonOpenSearchDestinationAuthStrategy strategy) {
    if (!strategy.isValid()) {
        this.unparsed = true;
    }
    this.strategy = strategy;
  }
  public ObservabilityPipelineElasticsearchDestinationAuth usernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the Elasticsearch username (used when <code>strategy</code> is <code>basic</code>).</p>
   * @return usernameKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USERNAME_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUsernameKey() {
        return usernameKey;
      }
  public void setUsernameKey(String usernameKey) {
    this.usernameKey = usernameKey;
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
   * @return ObservabilityPipelineElasticsearchDestinationAuth
   */
  @JsonAnySetter
  public ObservabilityPipelineElasticsearchDestinationAuth putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineElasticsearchDestinationAuth object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineElasticsearchDestinationAuth observabilityPipelineElasticsearchDestinationAuth = (ObservabilityPipelineElasticsearchDestinationAuth) o;
    return Objects.equals(this.passwordKey, observabilityPipelineElasticsearchDestinationAuth.passwordKey) && Objects.equals(this.strategy, observabilityPipelineElasticsearchDestinationAuth.strategy) && Objects.equals(this.usernameKey, observabilityPipelineElasticsearchDestinationAuth.usernameKey) && Objects.equals(this.additionalProperties, observabilityPipelineElasticsearchDestinationAuth.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(passwordKey,strategy,usernameKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineElasticsearchDestinationAuth {\n");
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
