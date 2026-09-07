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
   * <p>Attributes of the restriction query.</p>
 */
@JsonPropertyOrder({
  RestrictionQueryAttributes.JSON_PROPERTY_CREATED_AT,
  RestrictionQueryAttributes.JSON_PROPERTY_LAST_MODIFIER_EMAIL,
  RestrictionQueryAttributes.JSON_PROPERTY_LAST_MODIFIER_NAME,
  RestrictionQueryAttributes.JSON_PROPERTY_MODIFIED_AT,
  RestrictionQueryAttributes.JSON_PROPERTY_RESTRICTION_QUERY,
  RestrictionQueryAttributes.JSON_PROPERTY_ROLE_COUNT,
  RestrictionQueryAttributes.JSON_PROPERTY_USER_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RestrictionQueryAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_LAST_MODIFIER_EMAIL = "last_modifier_email";
  private String lastModifierEmail;

  public static final String JSON_PROPERTY_LAST_MODIFIER_NAME = "last_modifier_name";
  private String lastModifierName;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_RESTRICTION_QUERY = "restriction_query";
  private String restrictionQuery;

  public static final String JSON_PROPERTY_ROLE_COUNT = "role_count";
  private Long roleCount;

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Long userCount;


  /**
   * <p>Creation time of the restriction query.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }

  /**
   * <p>Email of the user who last modified this restriction query.</p>
   * @return lastModifierEmail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIER_EMAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLastModifierEmail() {
        return lastModifierEmail;
      }

  /**
   * <p>Name of the user who last modified this restriction query.</p>
   * @return lastModifierName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIER_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLastModifierName() {
        return lastModifierName;
      }

  /**
   * <p>Time of last restriction query modification.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public RestrictionQueryAttributes restrictionQuery(String restrictionQuery) {
    this.restrictionQuery = restrictionQuery;
    return this;
  }

  /**
   * <p>The query that defines the restriction. Only the content matching the query can be returned.</p>
   * @return restrictionQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESTRICTION_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRestrictionQuery() {
        return restrictionQuery;
      }
  public void setRestrictionQuery(String restrictionQuery) {
    this.restrictionQuery = restrictionQuery;
  }

  /**
   * <p>Number of roles associated with this restriction query.</p>
   * @return roleCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ROLE_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRoleCount() {
        return roleCount;
      }

  /**
   * <p>Number of users associated with this restriction query.</p>
   * @return userCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUserCount() {
        return userCount;
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
   * @return RestrictionQueryAttributes
   */
  @JsonAnySetter
  public RestrictionQueryAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RestrictionQueryAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictionQueryAttributes restrictionQueryAttributes = (RestrictionQueryAttributes) o;
    return Objects.equals(this.createdAt, restrictionQueryAttributes.createdAt) && Objects.equals(this.lastModifierEmail, restrictionQueryAttributes.lastModifierEmail) && Objects.equals(this.lastModifierName, restrictionQueryAttributes.lastModifierName) && Objects.equals(this.modifiedAt, restrictionQueryAttributes.modifiedAt) && Objects.equals(this.restrictionQuery, restrictionQueryAttributes.restrictionQuery) && Objects.equals(this.roleCount, restrictionQueryAttributes.roleCount) && Objects.equals(this.userCount, restrictionQueryAttributes.userCount) && Objects.equals(this.additionalProperties, restrictionQueryAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,lastModifierEmail,lastModifierName,modifiedAt,restrictionQuery,roleCount,userCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictionQueryAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastModifierEmail: ").append(toIndentedString(lastModifierEmail)).append("\n");
    sb.append("    lastModifierName: ").append(toIndentedString(lastModifierName)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    restrictionQuery: ").append(toIndentedString(restrictionQuery)).append("\n");
    sb.append("    roleCount: ").append(toIndentedString(roleCount)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
