/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Relationships of a webhooks auth method to its protocol-specific resource. */
@JsonPropertyOrder({WebhooksAuthMethodRelationships.JSON_PROPERTY_OAUTH2_CLIENT_CREDENTIALS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksAuthMethodRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OAUTH2_CLIENT_CREDENTIALS = "oauth2-client-credentials";
  private WebhooksOAuth2ClientCredentialsRelationship oauth2ClientCredentials;

  public WebhooksAuthMethodRelationships oauth2ClientCredentials(
      WebhooksOAuth2ClientCredentialsRelationship oauth2ClientCredentials) {
    this.oauth2ClientCredentials = oauth2ClientCredentials;
    this.unparsed |= oauth2ClientCredentials.unparsed;
    return this;
  }

  /**
   * Relationship pointing to the OAuth2 client credentials resource for this auth method.
   *
   * @return oauth2ClientCredentials
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OAUTH2_CLIENT_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebhooksOAuth2ClientCredentialsRelationship getOauth2ClientCredentials() {
    return oauth2ClientCredentials;
  }

  public void setOauth2ClientCredentials(
      WebhooksOAuth2ClientCredentialsRelationship oauth2ClientCredentials) {
    this.oauth2ClientCredentials = oauth2ClientCredentials;
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
   * @return WebhooksAuthMethodRelationships
   */
  @JsonAnySetter
  public WebhooksAuthMethodRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WebhooksAuthMethodRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksAuthMethodRelationships webhooksAuthMethodRelationships =
        (WebhooksAuthMethodRelationships) o;
    return Objects.equals(
            this.oauth2ClientCredentials, webhooksAuthMethodRelationships.oauth2ClientCredentials)
        && Objects.equals(
            this.additionalProperties, webhooksAuthMethodRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauth2ClientCredentials, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksAuthMethodRelationships {\n");
    sb.append("    oauth2ClientCredentials: ")
        .append(toIndentedString(oauth2ClientCredentials))
        .append("\n");
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
