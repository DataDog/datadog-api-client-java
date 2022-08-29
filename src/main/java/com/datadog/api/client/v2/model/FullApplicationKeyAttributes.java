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
   * <p>Attributes of a full application key.</p>
 */
@JsonPropertyOrder({
  FullApplicationKeyAttributes.JSON_PROPERTY_CREATED_AT,
  FullApplicationKeyAttributes.JSON_PROPERTY_KEY,
  FullApplicationKeyAttributes.JSON_PROPERTY_LAST4,
  FullApplicationKeyAttributes.JSON_PROPERTY_NAME,
  FullApplicationKeyAttributes.JSON_PROPERTY_SCOPES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FullApplicationKeyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LAST4 = "last4";
  private String last4;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  private JsonNullable<List<String>> scopes = JsonNullable.<List<String>>undefined();


  /**
   * <p>Creation date of the application key.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>The application key.</p>
   * @return key
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getKey() {
        return key;
      }

  /**
   * <p>The last four characters of the application key.</p>
   * @return last4
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST4)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLast4() {
        return last4;
      }
  public FullApplicationKeyAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the application key.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public FullApplicationKeyAttributes scopes(List<String> scopes) {
    this.scopes = JsonNullable.<List<String>>of(scopes);
    return this;
  }
  public FullApplicationKeyAttributes addScopesItem(String scopesItem) {
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
   * <p>Array of scopes to grant the application key. This feature is in private beta, please contact Datadog support to enable scopes for your application keys.</p>
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
   * Return true if this FullApplicationKeyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullApplicationKeyAttributes fullApplicationKeyAttributes = (FullApplicationKeyAttributes) o;
    return Objects.equals(this.createdAt, fullApplicationKeyAttributes.createdAt) && Objects.equals(this.key, fullApplicationKeyAttributes.key) && Objects.equals(this.last4, fullApplicationKeyAttributes.last4) && Objects.equals(this.name, fullApplicationKeyAttributes.name) && Objects.equals(this.scopes, fullApplicationKeyAttributes.scopes);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,key,last4,name,scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullApplicationKeyAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
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
