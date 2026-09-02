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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of an upsert OAuth2 scopes restriction request. */
@JsonPropertyOrder({
  UpsertOAuthScopesRestrictionDataAttributes.JSON_PROPERTY_OIDC_SCOPES,
  UpsertOAuthScopesRestrictionDataAttributes.JSON_PROPERTY_PERMISSION_SCOPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpsertOAuthScopesRestrictionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OIDC_SCOPES = "oidc_scopes";
  private List<OAuthOidcScope> oidcScopes = null;

  public static final String JSON_PROPERTY_PERMISSION_SCOPES = "permission_scopes";
  private List<String> permissionScopes = null;

  public UpsertOAuthScopesRestrictionDataAttributes oidcScopes(List<OAuthOidcScope> oidcScopes) {
    this.oidcScopes = oidcScopes;
    return this;
  }

  public UpsertOAuthScopesRestrictionDataAttributes addOidcScopesItem(
      OAuthOidcScope oidcScopesItem) {
    if (this.oidcScopes == null) {
      this.oidcScopes = new ArrayList<>();
    }
    this.oidcScopes.add(oidcScopesItem);
    this.unparsed |= !oidcScopesItem.isValid();
    return this;
  }

  /**
   * OIDC scopes the client is allowed to request.
   *
   * @return oidcScopes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OIDC_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OAuthOidcScope> getOidcScopes() {
    return oidcScopes;
  }

  public void setOidcScopes(List<OAuthOidcScope> oidcScopes) {
    this.oidcScopes = oidcScopes;
  }

  public UpsertOAuthScopesRestrictionDataAttributes permissionScopes(
      List<String> permissionScopes) {
    this.permissionScopes = permissionScopes;
    return this;
  }

  public UpsertOAuthScopesRestrictionDataAttributes addPermissionScopesItem(
      String permissionScopesItem) {
    if (this.permissionScopes == null) {
      this.permissionScopes = new ArrayList<>();
    }
    this.permissionScopes.add(permissionScopesItem);
    return this;
  }

  /**
   * Datadog permission scopes the client is allowed to request. Each value must be a valid
   * permission name.
   *
   * @return permissionScopes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSION_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return UpsertOAuthScopesRestrictionDataAttributes
   */
  @JsonAnySetter
  public UpsertOAuthScopesRestrictionDataAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this UpsertOAuthScopesRestrictionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertOAuthScopesRestrictionDataAttributes upsertOAuthScopesRestrictionDataAttributes =
        (UpsertOAuthScopesRestrictionDataAttributes) o;
    return Objects.equals(this.oidcScopes, upsertOAuthScopesRestrictionDataAttributes.oidcScopes)
        && Objects.equals(
            this.permissionScopes, upsertOAuthScopesRestrictionDataAttributes.permissionScopes)
        && Objects.equals(
            this.additionalProperties,
            upsertOAuthScopesRestrictionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oidcScopes, permissionScopes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertOAuthScopesRestrictionDataAttributes {\n");
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
