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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Allowlist of OIDC and permission scopes enforced for the OAuth2 client. */
@JsonPropertyOrder({
  OAuthScopesRestriction.JSON_PROPERTY_OIDC_SCOPES,
  OAuthScopesRestriction.JSON_PROPERTY_PERMISSION_SCOPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuthScopesRestriction {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OIDC_SCOPES = "oidc_scopes";
  private List<OAuthOidcScope> oidcScopes = new ArrayList<>();

  public static final String JSON_PROPERTY_PERMISSION_SCOPES = "permission_scopes";
  private List<String> permissionScopes = new ArrayList<>();

  public OAuthScopesRestriction() {}

  @JsonCreator
  public OAuthScopesRestriction(
      @JsonProperty(required = true, value = JSON_PROPERTY_OIDC_SCOPES)
          List<OAuthOidcScope> oidcScopes,
      @JsonProperty(required = true, value = JSON_PROPERTY_PERMISSION_SCOPES)
          List<String> permissionScopes) {
    this.oidcScopes = oidcScopes;
    this.permissionScopes = permissionScopes;
  }

  public OAuthScopesRestriction oidcScopes(List<OAuthOidcScope> oidcScopes) {
    this.oidcScopes = oidcScopes;
    return this;
  }

  public OAuthScopesRestriction addOidcScopesItem(OAuthOidcScope oidcScopesItem) {
    this.oidcScopes.add(oidcScopesItem);
    this.unparsed |= !oidcScopesItem.isValid();
    return this;
  }

  /**
   * OIDC scopes the client is restricted to.
   *
   * @return oidcScopes
   */
  @JsonProperty(JSON_PROPERTY_OIDC_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OAuthOidcScope> getOidcScopes() {
    return oidcScopes;
  }

  public void setOidcScopes(List<OAuthOidcScope> oidcScopes) {
    this.oidcScopes = oidcScopes;
  }

  public OAuthScopesRestriction permissionScopes(List<String> permissionScopes) {
    this.permissionScopes = permissionScopes;
    return this;
  }

  public OAuthScopesRestriction addPermissionScopesItem(String permissionScopesItem) {
    this.permissionScopes.add(permissionScopesItem);
    return this;
  }

  /**
   * Datadog permission scopes the client is restricted to.
   *
   * @return permissionScopes
   */
  @JsonProperty(JSON_PROPERTY_PERMISSION_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPermissionScopes() {
    return permissionScopes;
  }

  public void setPermissionScopes(List<String> permissionScopes) {
    this.permissionScopes = permissionScopes;
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
   * @return OAuthScopesRestriction
   */
  @JsonAnySetter
  public OAuthScopesRestriction putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OAuthScopesRestriction object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthScopesRestriction oAuthScopesRestriction = (OAuthScopesRestriction) o;
    return Objects.equals(this.oidcScopes, oAuthScopesRestriction.oidcScopes)
        && Objects.equals(this.permissionScopes, oAuthScopesRestriction.permissionScopes)
        && Objects.equals(this.additionalProperties, oAuthScopesRestriction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oidcScopes, permissionScopes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthScopesRestriction {\n");
    sb.append("    oidcScopes: ").append(toIndentedString(oidcScopes)).append("\n");
    sb.append("    permissionScopes: ").append(toIndentedString(permissionScopes)).append("\n");
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
