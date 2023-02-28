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

/** Attributes object for creating a Cloudflare account. */
@JsonPropertyOrder({
  CloudflareAccountCreateRequestAttributes.JSON_PROPERTY_API_KEY,
  CloudflareAccountCreateRequestAttributes.JSON_PROPERTY_EMAIL,
  CloudflareAccountCreateRequestAttributes.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareAccountCreateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CloudflareAccountCreateRequestAttributes() {}

  @JsonCreator
  public CloudflareAccountCreateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_API_KEY) String apiKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.apiKey = apiKey;
    this.name = name;
  }

  public CloudflareAccountCreateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The API key (or token) for the Cloudflare account.
   *
   * @return apiKey
   */
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public CloudflareAccountCreateRequestAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email associated with the Cloudflare account. If an API key is provided (and not a token),
   * this field is also required.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CloudflareAccountCreateRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Cloudflare account.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /** Return true if this CloudflareAccountCreateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareAccountCreateRequestAttributes cloudflareAccountCreateRequestAttributes =
        (CloudflareAccountCreateRequestAttributes) o;
    return Objects.equals(this.apiKey, cloudflareAccountCreateRequestAttributes.apiKey)
        && Objects.equals(this.email, cloudflareAccountCreateRequestAttributes.email)
        && Objects.equals(this.name, cloudflareAccountCreateRequestAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, email, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareAccountCreateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
