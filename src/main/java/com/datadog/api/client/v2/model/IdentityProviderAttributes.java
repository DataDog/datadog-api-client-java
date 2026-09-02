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

/** Attributes of an organization identity provider. */
@JsonPropertyOrder({
  IdentityProviderAttributes.JSON_PROPERTY_AUTHENTICATION_METHOD,
  IdentityProviderAttributes.JSON_PROPERTY_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IdentityProviderAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHENTICATION_METHOD = "authentication_method";
  private String authenticationMethod;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public IdentityProviderAttributes() {}

  @JsonCreator
  public IdentityProviderAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTHENTICATION_METHOD)
          String authenticationMethod,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled) {
    this.authenticationMethod = authenticationMethod;
    this.enabled = enabled;
  }

  public IdentityProviderAttributes authenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  /**
   * The authentication method used by this identity provider.
   *
   * @return authenticationMethod
   */
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAuthenticationMethod() {
    return authenticationMethod;
  }

  public void setAuthenticationMethod(String authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }

  public IdentityProviderAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether this identity provider is enabled for the organization.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
   * @return IdentityProviderAttributes
   */
  @JsonAnySetter
  public IdentityProviderAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IdentityProviderAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderAttributes identityProviderAttributes = (IdentityProviderAttributes) o;
    return Objects.equals(
            this.authenticationMethod, identityProviderAttributes.authenticationMethod)
        && Objects.equals(this.enabled, identityProviderAttributes.enabled)
        && Objects.equals(
            this.additionalProperties, identityProviderAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethod, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderAttributes {\n");
    sb.append("    authenticationMethod: ")
        .append(toIndentedString(authenticationMethod))
        .append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
