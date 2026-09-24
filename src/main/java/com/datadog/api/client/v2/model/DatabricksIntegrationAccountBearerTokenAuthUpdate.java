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
 * Bearer token authentication. The credential is a single opaque secret, a Databricks personal
 * access token, with no accompanying non-secret identifier. The method is deprecated: Databricks
 * accepts it only on accounts that already use it, and never on creation. Only the fields provided
 * are changed; omit <code>token</code> to keep the stored one.
 */
@JsonPropertyOrder({
  DatabricksIntegrationAccountBearerTokenAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  DatabricksIntegrationAccountBearerTokenAuthUpdate.JSON_PROPERTY_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountBearerTokenAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private DatabricksIntegrationAccountBearerTokenAuthType authType =
      DatabricksIntegrationAccountBearerTokenAuthType.BEARER_TOKEN;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public DatabricksIntegrationAccountBearerTokenAuthUpdate() {}

  @JsonCreator
  public DatabricksIntegrationAccountBearerTokenAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          DatabricksIntegrationAccountBearerTokenAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public DatabricksIntegrationAccountBearerTokenAuthUpdate authType(
      DatabricksIntegrationAccountBearerTokenAuthType authType) {
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
  public DatabricksIntegrationAccountBearerTokenAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(DatabricksIntegrationAccountBearerTokenAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public DatabricksIntegrationAccountBearerTokenAuthUpdate token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Secret token used to authenticate with Databricks.
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

  /** Return true if this DatabricksIntegrationAccountBearerTokenAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountBearerTokenAuthUpdate
        databricksIntegrationAccountBearerTokenAuthUpdate =
            (DatabricksIntegrationAccountBearerTokenAuthUpdate) o;
    return Objects.equals(this.authType, databricksIntegrationAccountBearerTokenAuthUpdate.authType)
        && Objects.equals(this.token, databricksIntegrationAccountBearerTokenAuthUpdate.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountBearerTokenAuthUpdate {\n");
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
