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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a delegated token. */
@JsonPropertyOrder({
  DelegatedTokenAttributes.JSON_PROPERTY_ACCESS_TOKEN,
  DelegatedTokenAttributes.JSON_PROPERTY_EXPIRES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DelegatedTokenAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "access_token";
  private String accessToken;

  public static final String JSON_PROPERTY_EXPIRES = "expires";
  private OffsetDateTime expires;

  public DelegatedTokenAttributes() {}

  @JsonCreator
  public DelegatedTokenAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCESS_TOKEN) String accessToken,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPIRES) OffsetDateTime expires) {
    this.accessToken = accessToken;
    this.expires = expires;
  }

  public DelegatedTokenAttributes accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * A short-lived JWT representing the authenticated Datadog user. Pass this as a bearer token in
   * subsequent API calls.
   *
   * @return accessToken
   */
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public DelegatedTokenAttributes expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * The expiry time of the token.
   *
   * @return expires
   */
  @JsonProperty(JSON_PROPERTY_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
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
   * @return DelegatedTokenAttributes
   */
  @JsonAnySetter
  public DelegatedTokenAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DelegatedTokenAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegatedTokenAttributes delegatedTokenAttributes = (DelegatedTokenAttributes) o;
    return Objects.equals(this.accessToken, delegatedTokenAttributes.accessToken)
        && Objects.equals(this.expires, delegatedTokenAttributes.expires)
        && Objects.equals(this.additionalProperties, delegatedTokenAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expires, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegatedTokenAttributes {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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
