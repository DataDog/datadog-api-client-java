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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a full personal access token, including the token key. */
@JsonPropertyOrder({
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_ALIAS,
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_CREATED_AT,
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_EXPIRES_AT,
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_KEY,
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_NAME,
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_PUBLIC_PORTION,
  FullPersonalAccessTokenAttributes.JSON_PROPERTY_SCOPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FullPersonalAccessTokenAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_PORTION = "public_portion";
  private String publicPortion;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes = null;

  /**
   * The alias (short identifier) of the personal access token.
   *
   * @return alias
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlias() {
    return alias;
  }

  /**
   * Creation date of the personal access token.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Expiration date of the personal access token.
   *
   * @return expiresAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getExpiresAt() {

    if (expiresAt == null) {
      expiresAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getExpiresAt_JsonNullable() {
    return expiresAt;
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  private void setExpiresAt_JsonNullable(JsonNullable<OffsetDateTime> expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The personal access token key. Only returned upon creation.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public FullPersonalAccessTokenAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the personal access token.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The public portion of the personal access token.
   *
   * @return publicPortion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_PORTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicPortion() {
    return publicPortion;
  }

  public FullPersonalAccessTokenAttributes scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public FullPersonalAccessTokenAttributes addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Array of scopes granted to the personal access token.
   *
   * @return scopes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
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
   * @return FullPersonalAccessTokenAttributes
   */
  @JsonAnySetter
  public FullPersonalAccessTokenAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FullPersonalAccessTokenAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullPersonalAccessTokenAttributes fullPersonalAccessTokenAttributes =
        (FullPersonalAccessTokenAttributes) o;
    return Objects.equals(this.alias, fullPersonalAccessTokenAttributes.alias)
        && Objects.equals(this.createdAt, fullPersonalAccessTokenAttributes.createdAt)
        && Objects.equals(this.expiresAt, fullPersonalAccessTokenAttributes.expiresAt)
        && Objects.equals(this.key, fullPersonalAccessTokenAttributes.key)
        && Objects.equals(this.name, fullPersonalAccessTokenAttributes.name)
        && Objects.equals(this.publicPortion, fullPersonalAccessTokenAttributes.publicPortion)
        && Objects.equals(this.scopes, fullPersonalAccessTokenAttributes.scopes)
        && Objects.equals(
            this.additionalProperties, fullPersonalAccessTokenAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alias, createdAt, expiresAt, key, name, publicPortion, scopes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullPersonalAccessTokenAttributes {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicPortion: ").append(toIndentedString(publicPortion)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
