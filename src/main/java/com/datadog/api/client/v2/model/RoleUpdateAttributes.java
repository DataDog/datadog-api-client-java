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
   * <p>Attributes of the role.</p>
 */
@JsonPropertyOrder({
  RoleUpdateAttributes.JSON_PROPERTY_CREATED_AT,
  RoleUpdateAttributes.JSON_PROPERTY_MODIFIED_AT,
  RoleUpdateAttributes.JSON_PROPERTY_NAME,
  RoleUpdateAttributes.JSON_PROPERTY_RECEIVES_PERMISSIONS_FROM,
  RoleUpdateAttributes.JSON_PROPERTY_USER_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoleUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECEIVES_PERMISSIONS_FROM = "receives_permissions_from";
  private List<String> receivesPermissionsFrom = null;

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Integer userCount;


  /**
   * <p>Creation time of the role.</p>
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
   * <p>Time of last role modification.</p>
   * @return modifiedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getModifiedAt() {
        return modifiedAt;
      }
  public RoleUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the role.</p>
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
  public RoleUpdateAttributes receivesPermissionsFrom(List<String> receivesPermissionsFrom) {
    this.receivesPermissionsFrom = receivesPermissionsFrom;
    return this;
  }
  public RoleUpdateAttributes addReceivesPermissionsFromItem(String receivesPermissionsFromItem) {
    if (this.receivesPermissionsFrom == null) {
      this.receivesPermissionsFrom = new ArrayList<>();
    }
    this.receivesPermissionsFrom.add(receivesPermissionsFromItem);
    return this;
  }

  /**
   * <p>The managed role from which this role automatically inherits new permissions.
   * Specify one of the following: "Datadog Admin Role", "Datadog Standard Role", or "Datadog Read Only Role".
   * If empty or not specified, the role does not automatically inherit permissions from any managed role.</p>
   * @return receivesPermissionsFrom
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RECEIVES_PERMISSIONS_FROM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getReceivesPermissionsFrom() {
        return receivesPermissionsFrom;
      }
  public void setReceivesPermissionsFrom(List<String> receivesPermissionsFrom) {
    this.receivesPermissionsFrom = receivesPermissionsFrom;
  }
  public RoleUpdateAttributes userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * <p>The user count.</p>
   * maximum: 2147483647
   * @return userCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USER_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getUserCount() {
        return userCount;
      }
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
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
   * @return RoleUpdateAttributes
   */
  @JsonAnySetter
  public RoleUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RoleUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleUpdateAttributes roleUpdateAttributes = (RoleUpdateAttributes) o;
    return Objects.equals(this.createdAt, roleUpdateAttributes.createdAt) && Objects.equals(this.modifiedAt, roleUpdateAttributes.modifiedAt) && Objects.equals(this.name, roleUpdateAttributes.name) && Objects.equals(this.receivesPermissionsFrom, roleUpdateAttributes.receivesPermissionsFrom) && Objects.equals(this.userCount, roleUpdateAttributes.userCount) && Objects.equals(this.additionalProperties, roleUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,modifiedAt,name,receivesPermissionsFrom,userCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleUpdateAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    receivesPermissionsFrom: ").append(toIndentedString(receivesPermissionsFrom)).append("\n");
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
