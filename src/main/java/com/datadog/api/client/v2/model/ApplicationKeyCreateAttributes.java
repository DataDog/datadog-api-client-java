/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes used to create an application Key. */
@JsonPropertyOrder({
  ApplicationKeyCreateAttributes.JSON_PROPERTY_NAME,
  ApplicationKeyCreateAttributes.JSON_PROPERTY_SCOPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private JsonNullable<List<String>> scopes = JsonNullable.<List<String>>undefined();

  public ApplicationKeyCreateAttributes() {}

  @JsonCreator
  public ApplicationKeyCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ApplicationKeyCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the application key.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationKeyCreateAttributes scopes(List<String> scopes) {
    this.scopes = JsonNullable.<List<String>>of(scopes);
    return this;
  }

  public ApplicationKeyCreateAttributes addScopesItem(String scopesItem) {
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
  @jakarta.annotation.Nullable
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

  /** Return true if this ApplicationKeyCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyCreateAttributes applicationKeyCreateAttributes =
        (ApplicationKeyCreateAttributes) o;
    return Objects.equals(this.name, applicationKeyCreateAttributes.name)
        && Objects.equals(this.scopes, applicationKeyCreateAttributes.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyCreateAttributes {\n");
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
