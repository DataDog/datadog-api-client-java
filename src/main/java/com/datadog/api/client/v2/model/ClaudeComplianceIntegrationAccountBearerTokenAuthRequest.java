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
 * Bearer token authentication. Use an Anthropic Admin API key with the <code>
 * read:compliance_activities</code> scope, or a dedicated Compliance Access key.
 */
@JsonPropertyOrder({
  ClaudeComplianceIntegrationAccountBearerTokenAuthRequest.JSON_PROPERTY_AUTH_TYPE,
  ClaudeComplianceIntegrationAccountBearerTokenAuthRequest.JSON_PROPERTY_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ClaudeComplianceIntegrationAccountBearerTokenAuthRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private ClaudeComplianceIntegrationAccountBearerTokenAuthType authType =
      ClaudeComplianceIntegrationAccountBearerTokenAuthType.BEARER_TOKEN;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public ClaudeComplianceIntegrationAccountBearerTokenAuthRequest() {}

  @JsonCreator
  public ClaudeComplianceIntegrationAccountBearerTokenAuthRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          ClaudeComplianceIntegrationAccountBearerTokenAuthType authType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOKEN) String token) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
    this.token = token;
  }

  public ClaudeComplianceIntegrationAccountBearerTokenAuthRequest authType(
      ClaudeComplianceIntegrationAccountBearerTokenAuthType authType) {
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
  public ClaudeComplianceIntegrationAccountBearerTokenAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(ClaudeComplianceIntegrationAccountBearerTokenAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public ClaudeComplianceIntegrationAccountBearerTokenAuthRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Anthropic Admin API key (prefix <code>sk-ant-admin01-</code>) with the <code>
   * read:compliance_activities</code> scope, or a dedicated Compliance Access key (prefix <code>
   * sk-ant-api01-</code>). Generate an Admin API key in the Anthropic Console under
   * <strong>Organization settings &gt; API keys</strong>.
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
   * Return true if this ClaudeComplianceIntegrationAccountBearerTokenAuthRequest object is equal to
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
    ClaudeComplianceIntegrationAccountBearerTokenAuthRequest
        claudeComplianceIntegrationAccountBearerTokenAuthRequest =
            (ClaudeComplianceIntegrationAccountBearerTokenAuthRequest) o;
    return Objects.equals(
            this.authType, claudeComplianceIntegrationAccountBearerTokenAuthRequest.authType)
        && Objects.equals(
            this.token, claudeComplianceIntegrationAccountBearerTokenAuthRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaudeComplianceIntegrationAccountBearerTokenAuthRequest {\n");
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
