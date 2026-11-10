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
 * Bearer token authentication. For an enterprise, use a personal access token (classic) from an
 * Enterprise Admin with the <code>manage_billing:enterprise</code> and <code>read:org</code>
 * scopes. For an organization, use a fine-grained personal access token created by an organization
 * owner, with the organization as resource owner and read-only <code>Administration</code>
 * permission. Only the fields provided are changed; omit <code>token</code> to keep the stored one.
 */
@JsonPropertyOrder({
  GitHubCostsIntegrationAccountBearerTokenAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  GitHubCostsIntegrationAccountBearerTokenAuthUpdate.JSON_PROPERTY_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubCostsIntegrationAccountBearerTokenAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private GitHubCostsIntegrationAccountBearerTokenAuthType authType =
      GitHubCostsIntegrationAccountBearerTokenAuthType.BEARER_TOKEN;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public GitHubCostsIntegrationAccountBearerTokenAuthUpdate() {}

  @JsonCreator
  public GitHubCostsIntegrationAccountBearerTokenAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          GitHubCostsIntegrationAccountBearerTokenAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public GitHubCostsIntegrationAccountBearerTokenAuthUpdate authType(
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

  public GitHubCostsIntegrationAccountBearerTokenAuthUpdate token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Secret token used to authenticate with GitHub.
   *
   * @return token
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Return true if this GitHubCostsIntegrationAccountBearerTokenAuthUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubCostsIntegrationAccountBearerTokenAuthUpdate
        gitHubCostsIntegrationAccountBearerTokenAuthUpdate =
            (GitHubCostsIntegrationAccountBearerTokenAuthUpdate) o;
    return Objects.equals(
            this.authType, gitHubCostsIntegrationAccountBearerTokenAuthUpdate.authType)
        && Objects.equals(this.token, gitHubCostsIntegrationAccountBearerTokenAuthUpdate.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubCostsIntegrationAccountBearerTokenAuthUpdate {\n");
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
