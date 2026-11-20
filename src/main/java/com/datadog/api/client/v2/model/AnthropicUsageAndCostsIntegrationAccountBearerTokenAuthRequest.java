/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Bearer token authentication. Use an Anthropic Admin API key (Platform plan) or an Analytics API
 * key with the <code>read:analytics</code> scope (Enterprise plan). An invalid key, or an Analytics
 * key without the <code>read:analytics</code> scope, is rejected with a <code>422</code> response.
 */
@JsonPropertyOrder({
  AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest.JSON_PROPERTY_AUTH_TYPE,
  AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest.JSON_PROPERTY_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType authType =
      AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType.BEARER_TOKEN;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest() {}

  @JsonCreator
  public AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN) String token) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.token = token;
  }

  public AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest authType(
      AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType authType) {
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
  public AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Anthropic Admin API key with permission to read usage and cost data, or an Analytics API key
   * with the <code>read:analytics</code> scope. Generate an Admin API key in the Anthropic Console
   * under <strong>Settings &gt; Admin Keys</strong>.
   *
   * @return token
   */
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Return true if this AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest
        anthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest =
            (AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest) o;
    return Objects.equals(
            this.authType, anthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest.authType)
        && Objects.equals(
            this.token, anthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnthropicUsageAndCostsIntegrationAccountBearerTokenAuthRequest {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
