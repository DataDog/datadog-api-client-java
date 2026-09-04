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
 * Databricks personal access token authentication. Deprecated: accepted only on accounts that
 * already use it, and never on creation. Use <code>databricks-oauth</code> or <code>
 * private-action-runner</code> instead. Omit <code>token</code> to keep the stored one.
 *
 * @deprecated
 */
@Deprecated
@JsonPropertyOrder({
  DatabricksIntegrationAccountPatAuthUpdate.JSON_PROPERTY_AUTH_TYPE,
  DatabricksIntegrationAccountPatAuthUpdate.JSON_PROPERTY_TOKEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DatabricksIntegrationAccountPatAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private DatabricksIntegrationAccountPatAuthType authType =
      DatabricksIntegrationAccountPatAuthType.PAT;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public DatabricksIntegrationAccountPatAuthUpdate() {}

  @JsonCreator
  public DatabricksIntegrationAccountPatAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          DatabricksIntegrationAccountPatAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public DatabricksIntegrationAccountPatAuthUpdate authType(
      DatabricksIntegrationAccountPatAuthType authType) {
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
  public DatabricksIntegrationAccountPatAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(DatabricksIntegrationAccountPatAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  public DatabricksIntegrationAccountPatAuthUpdate token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Secret Databricks personal access token.
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

  /** Return true if this DatabricksIntegrationAccountPatAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabricksIntegrationAccountPatAuthUpdate databricksIntegrationAccountPatAuthUpdate =
        (DatabricksIntegrationAccountPatAuthUpdate) o;
    return Objects.equals(this.authType, databricksIntegrationAccountPatAuthUpdate.authType)
        && Objects.equals(this.token, databricksIntegrationAccountPatAuthUpdate.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabricksIntegrationAccountPatAuthUpdate {\n");
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
