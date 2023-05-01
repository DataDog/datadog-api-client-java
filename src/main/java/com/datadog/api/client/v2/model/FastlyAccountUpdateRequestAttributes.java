/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Attributes object for updating a Fastly account. */
@JsonPropertyOrder({FastlyAccountUpdateRequestAttributes.JSON_PROPERTY_API_KEY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FastlyAccountUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public FastlyAccountUpdateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key of the Fastly account.
   *
   * @return apiKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /** Return true if this FastlyAccountUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastlyAccountUpdateRequestAttributes fastlyAccountUpdateRequestAttributes =
        (FastlyAccountUpdateRequestAttributes) o;
    return Objects.equals(this.apiKey, fastlyAccountUpdateRequestAttributes.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastlyAccountUpdateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
