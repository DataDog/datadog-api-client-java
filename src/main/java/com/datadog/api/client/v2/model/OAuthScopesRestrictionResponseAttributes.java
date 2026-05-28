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

/** Attributes of an OAuth2 client scopes restriction. */
@JsonPropertyOrder({
  OAuthScopesRestrictionResponseAttributes.JSON_PROPERTY_REQUIRED_PERMISSION_SCOPES,
  OAuthScopesRestrictionResponseAttributes.JSON_PROPERTY_SCOPES_RESTRICTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OAuthScopesRestrictionResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REQUIRED_PERMISSION_SCOPES =
      "required_permission_scopes";
  private List<String> requiredPermissionScopes = new ArrayList<>();

  public static final String JSON_PROPERTY_SCOPES_RESTRICTION = "scopes_restriction";
  private OAuthScopesRestriction scopesRestriction;

  public OAuthScopesRestrictionResponseAttributes() {}

  @JsonCreator
  public OAuthScopesRestrictionResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUIRED_PERMISSION_SCOPES)
          List<String> requiredPermissionScopes,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPES_RESTRICTION)
          OAuthScopesRestriction scopesRestriction) {
    this.requiredPermissionScopes = requiredPermissionScopes;
    if (requiredPermissionScopes != null) {}
    this.scopesRestriction = scopesRestriction;
    if (scopesRestriction != null) {
      this.unparsed |= scopesRestriction.unparsed;
    }
  }

  public OAuthScopesRestrictionResponseAttributes requiredPermissionScopes(
      List<String> requiredPermissionScopes) {
    this.requiredPermissionScopes = requiredPermissionScopes;
    return this;
  }

  public OAuthScopesRestrictionResponseAttributes addRequiredPermissionScopesItem(
      String requiredPermissionScopesItem) {
    this.requiredPermissionScopes.add(requiredPermissionScopesItem);
    return this;
  }

  /**
   * Permission scopes automatically required for this client (for example, mobile-app permission
   * scopes). Returns <code>null</code> when no scopes are required.
   *
   * @return requiredPermissionScopes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_PERMISSION_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getRequiredPermissionScopes() {
    return requiredPermissionScopes;
  }

  public void setRequiredPermissionScopes(List<String> requiredPermissionScopes) {
    this.requiredPermissionScopes = requiredPermissionScopes;
  }

  public OAuthScopesRestrictionResponseAttributes scopesRestriction(
      OAuthScopesRestriction scopesRestriction) {
    this.scopesRestriction = scopesRestriction;
    if (scopesRestriction != null) {
      this.unparsed |= scopesRestriction.unparsed;
    }
    return this;
  }

  /**
   * Allowlist of OIDC and permission scopes enforced for the OAuth2 client.
   *
   * @return scopesRestriction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OAuthScopesRestriction getScopesRestriction() {
    return scopesRestriction;
  }

  public void setScopesRestriction(OAuthScopesRestriction scopesRestriction) {
    this.scopesRestriction = scopesRestriction;
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
   * @return OAuthScopesRestrictionResponseAttributes
   */
  @JsonAnySetter
  public OAuthScopesRestrictionResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OAuthScopesRestrictionResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthScopesRestrictionResponseAttributes oAuthScopesRestrictionResponseAttributes =
        (OAuthScopesRestrictionResponseAttributes) o;
    return Objects.equals(
            this.requiredPermissionScopes,
            oAuthScopesRestrictionResponseAttributes.requiredPermissionScopes)
        && Objects.equals(
            this.scopesRestriction, oAuthScopesRestrictionResponseAttributes.scopesRestriction)
        && Objects.equals(
            this.additionalProperties,
            oAuthScopesRestrictionResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredPermissionScopes, scopesRestriction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthScopesRestrictionResponseAttributes {\n");
    sb.append("    requiredPermissionScopes: ")
        .append(toIndentedString(requiredPermissionScopes))
        .append("\n");
    sb.append("    scopesRestriction: ").append(toIndentedString(scopesRestriction)).append("\n");
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
