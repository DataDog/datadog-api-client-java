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

/** Attributes of an access token. */
@JsonPropertyOrder({
  ServiceAccessTokenAttributes.JSON_PROPERTY_CREATED_AT,
  ServiceAccessTokenAttributes.JSON_PROPERTY_EXPIRES_AT,
  ServiceAccessTokenAttributes.JSON_PROPERTY_LAST_USED_AT,
  ServiceAccessTokenAttributes.JSON_PROPERTY_MODIFIED_AT,
  ServiceAccessTokenAttributes.JSON_PROPERTY_NAME,
  ServiceAccessTokenAttributes.JSON_PROPERTY_PUBLIC_PORTION,
  ServiceAccessTokenAttributes.JSON_PROPERTY_SCOPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ServiceAccessTokenAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_LAST_USED_AT = "last_used_at";
  private JsonNullable<OffsetDateTime> lastUsedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private JsonNullable<OffsetDateTime> modifiedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_PORTION = "public_portion";
  private String publicPortion;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private List<String> scopes = null;

  /**
   * Creation date of the access token.
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
   * Expiration date of the access token.
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
   * Date the access token was last used.
   *
   * @return lastUsedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getLastUsedAt() {

    if (lastUsedAt == null) {
      lastUsedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return lastUsedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastUsedAt_JsonNullable() {
    return lastUsedAt;
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_AT)
  private void setLastUsedAt_JsonNullable(JsonNullable<OffsetDateTime> lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  /**
   * Date of last modification of the access token.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getModifiedAt() {

    if (modifiedAt == null) {
      modifiedAt = JsonNullable.<OffsetDateTime>undefined();
    }
    return modifiedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getModifiedAt_JsonNullable() {
    return modifiedAt;
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  private void setModifiedAt_JsonNullable(JsonNullable<OffsetDateTime> modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public ServiceAccessTokenAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the access token.
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
   * The public portion of the access token.
   *
   * @return publicPortion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_PORTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicPortion() {
    return publicPortion;
  }

  public ServiceAccessTokenAttributes scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ServiceAccessTokenAttributes addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Array of scopes granted to the access token.
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
   * @return ServiceAccessTokenAttributes
   */
  @JsonAnySetter
  public ServiceAccessTokenAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ServiceAccessTokenAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccessTokenAttributes serviceAccessTokenAttributes = (ServiceAccessTokenAttributes) o;
    return Objects.equals(this.createdAt, serviceAccessTokenAttributes.createdAt)
        && Objects.equals(this.expiresAt, serviceAccessTokenAttributes.expiresAt)
        && Objects.equals(this.lastUsedAt, serviceAccessTokenAttributes.lastUsedAt)
        && Objects.equals(this.modifiedAt, serviceAccessTokenAttributes.modifiedAt)
        && Objects.equals(this.name, serviceAccessTokenAttributes.name)
        && Objects.equals(this.publicPortion, serviceAccessTokenAttributes.publicPortion)
        && Objects.equals(this.scopes, serviceAccessTokenAttributes.scopes)
        && Objects.equals(
            this.additionalProperties, serviceAccessTokenAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        expiresAt,
        lastUsedAt,
        modifiedAt,
        name,
        publicPortion,
        scopes,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccessTokenAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
