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
 * API token authentication, the only method CoreWeave integration accounts support. Only the fields
 * provided are changed; omit <code>api_token</code> to keep the stored one.
 */
@JsonPropertyOrder({
  CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate.JSON_PROPERTY_API_TOKEN,
  CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate.JSON_PROPERTY_AUTH_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_TOKEN = "api_token";
  private String apiToken;

  public static final String JSON_PROPERTY_AUTH_TYPE = "auth_type";
  private CoreWeaveCloudIntegrationAccountAPITokenAuthType authType =
      CoreWeaveCloudIntegrationAccountAPITokenAuthType.COREWEAVE_API_TOKEN;

  public CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate() {}

  @JsonCreator
  public CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_TYPE)
          CoreWeaveCloudIntegrationAccountAPITokenAuthType authType) {
    this.authType = authType;
    this.unparsed |= !authType.isValid();
  }

  public CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate apiToken(String apiToken) {
    this.apiToken = apiToken;
    return this;
  }

  /**
   * Secret CoreWeave API access token used to authenticate with CoreWeave. It cannot be cleared;
   * sending <code>null</code> or an empty string is rejected with a <code>422</code> response.
   *
   * @return apiToken
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }

  public CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate authType(
      CoreWeaveCloudIntegrationAccountAPITokenAuthType authType) {
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
  public CoreWeaveCloudIntegrationAccountAPITokenAuthType getAuthType() {
    return authType;
  }

  public void setAuthType(CoreWeaveCloudIntegrationAccountAPITokenAuthType authType) {
    if (!authType.isValid()) {
      this.unparsed = true;
    }
    this.authType = authType;
  }

  /**
   * Return true if this CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate
        coreWeaveCloudIntegrationAccountApiTokenAuthUpdate =
            (CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate) o;
    return Objects.equals(
            this.apiToken, coreWeaveCloudIntegrationAccountApiTokenAuthUpdate.apiToken)
        && Objects.equals(
            this.authType, coreWeaveCloudIntegrationAccountApiTokenAuthUpdate.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiToken, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate {\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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
