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
   * <p>Attributes required to create a new role by cloning an existing one.</p>
 */
@JsonPropertyOrder({
  RoleCloneAttributes.JSON_PROPERTY_NAME,
  RoleCloneAttributes.JSON_PROPERTY_RECEIVES_PERMISSIONS_FROM
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoleCloneAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RECEIVES_PERMISSIONS_FROM = "receives_permissions_from";
  private List<String> receivesPermissionsFrom = null;

  public RoleCloneAttributes() {}

  @JsonCreator
  public RoleCloneAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name) {
        this.name = name;
  }
  public RoleCloneAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the new role that is cloned.</p>
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
  public RoleCloneAttributes receivesPermissionsFrom(List<String> receivesPermissionsFrom) {
    this.receivesPermissionsFrom = receivesPermissionsFrom;
    return this;
  }
  public RoleCloneAttributes addReceivesPermissionsFromItem(String receivesPermissionsFromItem) {
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
   * @return RoleCloneAttributes
   */
  @JsonAnySetter
  public RoleCloneAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RoleCloneAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleCloneAttributes roleCloneAttributes = (RoleCloneAttributes) o;
    return Objects.equals(this.name, roleCloneAttributes.name) && Objects.equals(this.receivesPermissionsFrom, roleCloneAttributes.receivesPermissionsFrom) && Objects.equals(this.additionalProperties, roleCloneAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(name,receivesPermissionsFrom, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleCloneAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    receivesPermissionsFrom: ").append(toIndentedString(receivesPermissionsFrom)).append("\n");
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
