/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a partial application key. */
@JsonPropertyOrder({
  PartialApplicationKeyAttributes.JSON_PROPERTY_CREATED_AT,
  PartialApplicationKeyAttributes.JSON_PROPERTY_LAST4,
  PartialApplicationKeyAttributes.JSON_PROPERTY_NAME,
  PartialApplicationKeyAttributes.JSON_PROPERTY_SCOPES
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PartialApplicationKeyAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private JsonNullable<List<String>> scopes = JsonNullable.<List<String>>undefined();

  /**
   * Creation date of the application key.
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * The last four characters of the application key.
   *
   * @return last4
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLast4() {
    return last4;
  }

  public PartialApplicationKeyAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the application key.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartialApplicationKeyAttributes scopes(List<String> scopes) {
    this.scopes = JsonNullable.<List<String>>of(scopes);
    return this;
  }

  public PartialApplicationKeyAttributes addScopesItem(String scopesItem) {
    if (this.scopes == null || !this.scopes.isPresent()) {
      this.scopes = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.scopes.get().add(scopesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Array of scopes to grant the application key. This feature is in private beta, please contact
   * Datadog support to enable scopes for your application keys.
   *
   * @return scopes
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public List<String> getScopes() {
    return scopes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getScopes_JsonNullable() {
    return scopes;
  }

  @JsonProperty(JSON_PROPERTY_SCOPES)
  public void setScopes_JsonNullable(JsonNullable<List<String>> scopes) {
    this.scopes = scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = JsonNullable.<List<String>>of(scopes);
  }

  /** Return true if this PartialApplicationKeyAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialApplicationKeyAttributes partialApplicationKeyAttributes =
        (PartialApplicationKeyAttributes) o;
    return Objects.equals(this.createdAt, partialApplicationKeyAttributes.createdAt)
        && Objects.equals(this.last4, partialApplicationKeyAttributes.last4)
        && Objects.equals(this.name, partialApplicationKeyAttributes.name)
        && Objects.equals(this.scopes, partialApplicationKeyAttributes.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, last4, name, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialApplicationKeyAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
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