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

/** The bearer token authentication method configured on the account. */
@JsonPropertyOrder({GitHubCostsIntegrationAccountBearerTokenAuthResponse.JSON_PROPERTY_AUTH_TYPE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCostsIntegrationAccountBearerTokenAuthResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private GitHubCostsIntegrationAccountBearerTokenAuthType authType =
      GitHubCostsIntegrationAccountBearerTokenAuthType.BEARER_TOKEN;

  public GitHubCostsIntegrationAccountBearerTokenAuthResponse() {}

  @JsonCreator
  public GitHubCostsIntegrationAccountBearerTokenAuthResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          GitHubCostsIntegrationAccountBearerTokenAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public GitHubCostsIntegrationAccountBearerTokenAuthResponse authType(
      GitHubCostsIntegrationAccountBearerTokenAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    return this;
  }

  /**
   * The authentication method type.
   *
   * @return authType
   */
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GitHubCostsIntegrationAccountBearerTokenAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(GitHubCostsIntegrationAccountBearerTokenAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
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
   * @return GitHubCostsIntegrationAccountBearerTokenAuthResponse
   */
  @JsonAnySetter
  public GitHubCostsIntegrationAccountBearerTokenAuthResponse putAdditionalProperty(
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
   * Return true if this GitHubCostsIntegrationAccountBearerTokenAuthResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCostsIntegrationAccountBearerTokenAuthResponse
        gitHubCostsIntegrationAccountBearerTokenAuthResponse =
            (GitHubCostsIntegrationAccountBearerTokenAuthResponse) o;
    return Objects.equals(
            this.authType, gitHubCostsIntegrationAccountBearerTokenAuthResponse.authType)
        && Objects.equals(
            this.additionalProperties,
            gitHubCostsIntegrationAccountBearerTokenAuthResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCostsIntegrationAccountBearerTokenAuthResponse {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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
