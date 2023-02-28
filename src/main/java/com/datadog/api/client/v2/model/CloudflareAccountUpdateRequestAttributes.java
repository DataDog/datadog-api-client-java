/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes object for updating a Cloudflare account.</p>
 */
@JsonPropertyOrder({
  CloudflareAccountUpdateRequestAttributes.JSON_PROPERTY_API_KEY,
  CloudflareAccountUpdateRequestAttributes.JSON_PROPERTY_EMAIL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareAccountUpdateRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_KEY = "api_key";
  private String apiKey;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public CloudflareAccountUpdateRequestAttributes() {}

  @JsonCreator
  public CloudflareAccountUpdateRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_API_KEY)String apiKey) {
        this.apiKey = apiKey;
  }
  public CloudflareAccountUpdateRequestAttributes apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * <p>The API key of the Cloudflare account.</p>
   * @return apiKey
  **/
      @JsonProperty(JSON_PROPERTY_API_KEY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getApiKey() {
        return apiKey;
      }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
  public CloudflareAccountUpdateRequestAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * <p>The email associated with the Cloudflare account. If an API key is provided (and not a token), this field is also required.</p>
   * @return email
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEmail() {
        return email;
      }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Return true if this CloudflareAccountUpdateRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareAccountUpdateRequestAttributes cloudflareAccountUpdateRequestAttributes = (CloudflareAccountUpdateRequestAttributes) o;
    return Objects.equals(this.apiKey, cloudflareAccountUpdateRequestAttributes.apiKey) && Objects.equals(this.email, cloudflareAccountUpdateRequestAttributes.email);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiKey,email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareAccountUpdateRequestAttributes {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
