/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes used to create an application Key.</p>
 */
@JsonPropertyOrder({
  ApplicationKeyCreateAttributes.JSON_PROPERTY_NAME,
  ApplicationKeyCreateAttributes.JSON_PROPERTY_SCOPES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyCreateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private JsonNullable<List<String>> scopes = JsonNullable.<List<String>>undefined();

  public ApplicationKeyCreateAttributes() {}

  @JsonCreator
  public ApplicationKeyCreateAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public ApplicationKeyCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the application key.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>Array of scopes to grant the application key.</p>
   * @return scopes
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getScopes() {
        return scopes.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getScopes_JsonNullable() {
    return scopes;
  }
  @JsonProperty(JSON_PROPERTY_SCOPES)public void setScopes_JsonNullable(JsonNullable<List<String>> scopes) {
    this.scopes = scopes;
  }
  public void setScopes(List<String> scopes) {
    this.scopes = JsonNullable.<List<String>>of(scopes);
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ApplicationKeyCreateAttributes
   */
  @JsonAnySetter
  public ApplicationKeyCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ApplicationKeyCreateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyCreateAttributes applicationKeyCreateAttributes = (ApplicationKeyCreateAttributes) o;
    return Objects.equals(this.name, applicationKeyCreateAttributes.name) && Objects.equals(this.scopes, applicationKeyCreateAttributes.scopes) && Objects.equals(this.additionalProperties, applicationKeyCreateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,scopes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyCreateAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
