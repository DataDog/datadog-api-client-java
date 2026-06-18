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
 * Request to exchange a Vercel marketplace authorization code for a Datadog-managed access token.
 */
@JsonPropertyOrder({
  VercelTokenCreateRequest.JSON_PROPERTY_AUTH_GRANT_CODE,
  VercelTokenCreateRequest.JSON_PROPERTY_VERCEL_CONFIGURATION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class VercelTokenCreateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_GRANT_CODE = "authGrantCode";
  private String authGrantCode;

  public static final String JSON_PROPERTY_VERCEL_CONFIGURATION_ID = "vercelConfigurationId";
  private String vercelConfigurationId;

  public VercelTokenCreateRequest() {}

  @JsonCreator
  public VercelTokenCreateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_GRANT_CODE) String authGrantCode,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERCEL_CONFIGURATION_ID)
          String vercelConfigurationId) {
    this.authGrantCode = authGrantCode;
    this.vercelConfigurationId = vercelConfigurationId;
  }

  public VercelTokenCreateRequest authGrantCode(String authGrantCode) {
    this.authGrantCode = authGrantCode;
    return this;
  }

  /**
   * OAuth authorization code received from the Vercel marketplace flow.
   *
   * @return authGrantCode
   */
  @JsonProperty(JSON_PROPERTY_AUTH_GRANT_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthGrantCode() {
    return authGrantCode;
  }

  public void setAuthGrantCode(String authGrantCode) {
    this.authGrantCode = authGrantCode;
  }

  public VercelTokenCreateRequest vercelConfigurationId(String vercelConfigurationId) {
    this.vercelConfigurationId = vercelConfigurationId;
    return this;
  }

  /**
   * Vercel configuration identifier returned by the marketplace flow.
   *
   * @return vercelConfigurationId
   */
  @JsonProperty(JSON_PROPERTY_VERCEL_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVercelConfigurationId() {
    return vercelConfigurationId;
  }

  public void setVercelConfigurationId(String vercelConfigurationId) {
    this.vercelConfigurationId = vercelConfigurationId;
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
   * @return VercelTokenCreateRequest
   */
  @JsonAnySetter
  public VercelTokenCreateRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this VercelTokenCreateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VercelTokenCreateRequest vercelTokenCreateRequest = (VercelTokenCreateRequest) o;
    return Objects.equals(this.authGrantCode, vercelTokenCreateRequest.authGrantCode)
        && Objects.equals(
            this.vercelConfigurationId, vercelTokenCreateRequest.vercelConfigurationId)
        && Objects.equals(this.additionalProperties, vercelTokenCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authGrantCode, vercelConfigurationId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VercelTokenCreateRequest {\n");
    sb.append("    authGrantCode: ").append(toIndentedString(authGrantCode)).append("\n");
    sb.append("    vercelConfigurationId: ")
        .append(toIndentedString(vercelConfigurationId))
        .append("\n");
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
