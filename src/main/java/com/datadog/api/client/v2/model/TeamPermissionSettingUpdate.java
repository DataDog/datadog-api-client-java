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
import java.util.Objects;

/** Team permission setting update */
@JsonPropertyOrder({
  TeamPermissionSettingUpdate.JSON_PROPERTY_ATTRIBUTES,
  TeamPermissionSettingUpdate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamPermissionSettingUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private TeamPermissionSettingUpdateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamPermissionSettingType type = TeamPermissionSettingType.TEAM_PERMISSION_SETTINGS;

  public TeamPermissionSettingUpdate() {}

  @JsonCreator
  public TeamPermissionSettingUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) TeamPermissionSettingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamPermissionSettingUpdate attributes(TeamPermissionSettingUpdateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Team permission setting update attributes
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamPermissionSettingUpdateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(TeamPermissionSettingUpdateAttributes attributes) {
    this.attributes = attributes;
  }

  public TeamPermissionSettingUpdate type(TeamPermissionSettingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Team permission setting type
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamPermissionSettingType getType() {
    return type;
  }

  public void setType(TeamPermissionSettingType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TeamPermissionSettingUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPermissionSettingUpdate teamPermissionSettingUpdate = (TeamPermissionSettingUpdate) o;
    return Objects.equals(this.attributes, teamPermissionSettingUpdate.attributes)
        && Objects.equals(this.type, teamPermissionSettingUpdate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPermissionSettingUpdate {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
