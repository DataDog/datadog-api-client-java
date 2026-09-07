/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The definition of the <code>CloudflareGlobalAPIToken</code> object. */
@JsonPropertyOrder({
  CloudflareGlobalAPIToken.JSON_PROPERTY_AUTH_EMAIL,
  CloudflareGlobalAPIToken.JSON_PROPERTY_GLOBAL_API_KEY,
  CloudflareGlobalAPIToken.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudflareGlobalAPIToken {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_EMAIL = "auth_email";
  private String authEmail;

  public static final String JSON_PROPERTY_GLOBAL_API_KEY = "global_api_key";
  private String globalApiKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudflareGlobalAPITokenType type;

  public CloudflareGlobalAPIToken() {}

  @JsonCreator
  public CloudflareGlobalAPIToken(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH_EMAIL) String authEmail,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBAL_API_KEY) String globalApiKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CloudflareGlobalAPITokenType type) {
    this.authEmail = authEmail;
    this.globalApiKey = globalApiKey;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CloudflareGlobalAPIToken authEmail(String authEmail) {
    this.authEmail = authEmail;
    return this;
  }

  /**
   * The <code>CloudflareGlobalAPIToken</code> <code>auth_email</code>.
   *
   * @return authEmail
   */
  @JsonProperty(JSON_PROPERTY_AUTH_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthEmail() {
    return authEmail;
  }

  public void setAuthEmail(String authEmail) {
    this.authEmail = authEmail;
  }

  public CloudflareGlobalAPIToken globalApiKey(String globalApiKey) {
    this.globalApiKey = globalApiKey;
    return this;
  }

  /**
   * The <code>CloudflareGlobalAPIToken</code> <code>global_api_key</code>.
   *
   * @return globalApiKey
   */
  @JsonProperty(JSON_PROPERTY_GLOBAL_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGlobalApiKey() {
    return globalApiKey;
  }

  public void setGlobalApiKey(String globalApiKey) {
    this.globalApiKey = globalApiKey;
  }

  public CloudflareGlobalAPIToken type(CloudflareGlobalAPITokenType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of the <code>CloudflareGlobalAPIToken</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CloudflareGlobalAPIToken
   */
  @JsonAnySetter
  public CloudflareGlobalAPIToken putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudflareGlobalAPIToken object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareGlobalAPIToken cloudflareGlobalApiToken = (CloudflareGlobalAPIToken) o;
    return Objects.equals(this.authEmail, cloudflareGlobalApiToken.authEmail)
        && Objects.equals(this.globalApiKey, cloudflareGlobalApiToken.globalApiKey)
        && Objects.equals(this.type, cloudflareGlobalApiToken.type)
        && Objects.equals(this.additionalProperties, cloudflareGlobalApiToken.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authEmail, globalApiKey, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareGlobalAPIToken {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
