/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of a permission. */
@JsonPropertyOrder({
  PermissionAttributes.JSON_PROPERTY_CREATED,
  PermissionAttributes.JSON_PROPERTY_DESCRIPTION,
  PermissionAttributes.JSON_PROPERTY_DISPLAY_NAME,
  PermissionAttributes.JSON_PROPERTY_DISPLAY_TYPE,
  PermissionAttributes.JSON_PROPERTY_GROUP_NAME,
  PermissionAttributes.JSON_PROPERTY_NAME,
  PermissionAttributes.JSON_PROPERTY_RESTRICTED
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PermissionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private String displayType;

  public static final String JSON_PROPERTY_GROUP_NAME = "group_name";
  private String groupName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESTRICTED = "restricted";
  private Boolean restricted;

  public PermissionAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Creation time of the permission.
   *
   * @return created
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public PermissionAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the permission.
   *
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Displayed name for the permission.
   *
   * @return displayName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PermissionAttributes displayType(String displayType) {
    this.displayType = displayType;
    return this;
  }

  /**
   * Display type.
   *
   * @return displayType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayType() {
    return displayType;
  }

  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }

  public PermissionAttributes groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Name of the permission group.
   *
   * @return groupName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public PermissionAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the permission.
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

  public PermissionAttributes restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

  /**
   * Whether or not the permission is restricted.
   *
   * @return restricted
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  /** Return true if this PermissionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionAttributes permissionAttributes = (PermissionAttributes) o;
    return Objects.equals(this.created, permissionAttributes.created)
        && Objects.equals(this.description, permissionAttributes.description)
        && Objects.equals(this.displayName, permissionAttributes.displayName)
        && Objects.equals(this.displayType, permissionAttributes.displayType)
        && Objects.equals(this.groupName, permissionAttributes.groupName)
        && Objects.equals(this.name, permissionAttributes.name)
        && Objects.equals(this.restricted, permissionAttributes.restricted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created, description, displayName, displayType, groupName, name, restricted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
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
