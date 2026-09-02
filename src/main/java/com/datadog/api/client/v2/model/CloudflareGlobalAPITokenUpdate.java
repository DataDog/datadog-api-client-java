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
import java.util.UUID;
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
   * <p>The definition of the <code>CloudflareGlobalAPIToken</code> object.</p>
 */
@JsonPropertyOrder({
  CloudflareGlobalAPITokenUpdate.JSON_PROPERTY_AUTH_EMAIL,
  CloudflareGlobalAPITokenUpdate.JSON_PROPERTY_GLOBAL_API_KEY,
  CloudflareGlobalAPITokenUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareGlobalAPITokenUpdate {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_EMAIL = "auth_email";
  private String authEmail;

  public static final String JSON_PROPERTY_GLOBAL_API_KEY = "global_api_key";
  private String globalApiKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudflareGlobalAPITokenType type;

  public CloudflareGlobalAPITokenUpdate() {}

  @JsonCreator
  public CloudflareGlobalAPITokenUpdate(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)CloudflareGlobalAPITokenType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public CloudflareGlobalAPITokenUpdate authEmail(String authEmail) {
    this.authEmail = authEmail;
    return this;
  }

  /**
   * <p>The <code>CloudflareGlobalAPITokenUpdate</code> <code>auth_email</code>.</p>
   * @return authEmail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAuthEmail() {
        return authEmail;
      }
  public void setAuthEmail(String authEmail) {
    this.authEmail = authEmail;
  }
  public CloudflareGlobalAPITokenUpdate globalApiKey(String globalApiKey) {
    this.globalApiKey = globalApiKey;
    return this;
  }

  /**
   * <p>The <code>CloudflareGlobalAPITokenUpdate</code> <code>global_api_key</code>.</p>
   * @return globalApiKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GLOBAL_API_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getGlobalApiKey() {
        return globalApiKey;
      }
  public void setGlobalApiKey(String globalApiKey) {
    this.globalApiKey = globalApiKey;
  }
  public CloudflareGlobalAPITokenUpdate type(CloudflareGlobalAPITokenType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The definition of the <code>CloudflareGlobalAPIToken</code> object.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CloudflareGlobalAPITokenType getType() {
        return type;
      }
  public void setType(CloudflareGlobalAPITokenType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CloudflareGlobalAPITokenUpdate
   */
  @JsonAnySetter
  public CloudflareGlobalAPITokenUpdate putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this CloudflareGlobalAPITokenUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareGlobalAPITokenUpdate cloudflareGlobalApiTokenUpdate = (CloudflareGlobalAPITokenUpdate) o;
    return Objects.equals(this.authEmail, cloudflareGlobalApiTokenUpdate.authEmail) && Objects.equals(this.globalApiKey, cloudflareGlobalApiTokenUpdate.globalApiKey) && Objects.equals(this.type, cloudflareGlobalApiTokenUpdate.type) && Objects.equals(this.additionalProperties, cloudflareGlobalApiTokenUpdate.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(authEmail,globalApiKey,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareGlobalAPITokenUpdate {\n");
    sb.append("    authEmail: ").append(toIndentedString(authEmail)).append("\n");
    sb.append("    globalApiKey: ").append(toIndentedString(globalApiKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
