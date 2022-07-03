/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** List of API and application keys available for a given organization. */
@JsonPropertyOrder({ApiKeyListResponse.JSON_PROPERTY_API_KEYS})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApiKeyListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEYS = "api_keys";
  private List<ApiKey> apiKeys = null;

  public ApiKeyListResponse apiKeys(List<ApiKey> apiKeys) {
    this.apiKeys = apiKeys;
    for (ApiKey item : apiKeys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ApiKeyListResponse addApiKeysItem(ApiKey apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<>();
    }
    this.apiKeys.add(apiKeysItem);
    this.unparsed |= apiKeysItem.unparsed;
    return this;
  }

  /**
   * Array of API keys.
   *
   * @return apiKeys
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ApiKey> getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(List<ApiKey> apiKeys) {
    this.apiKeys = apiKeys;
  }

  /** Return true if this ApiKeyListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyListResponse apiKeyListResponse = (ApiKeyListResponse) o;
    return Objects.equals(this.apiKeys, apiKeyListResponse.apiKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyListResponse {\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("}");
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
