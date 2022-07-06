/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** Attributes of the role. */
@JsonPropertyOrder({
  RoleAttributes.JSON_PROPERTY_CREATED_AT,
  RoleAttributes.JSON_PROPERTY_MODIFIED_AT,
  RoleAttributes.JSON_PROPERTY_NAME,
  RoleAttributes.JSON_PROPERTY_USER_COUNT
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RoleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Long userCount;

  /**
   * Creation time of the role.
   *
   * @return createdAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Time of last role modification.
   *
   * @return modifiedAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public RoleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the role. The name is neither unique nor a stable identifier of the role.
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

  /**
   * Number of users with that role.
   *
   * @return userCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUserCount() {
    return userCount;
  }

  /** Return true if this RoleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleAttributes roleAttributes = (RoleAttributes) o;
    return Objects.equals(this.createdAt, roleAttributes.createdAt)
        && Objects.equals(this.modifiedAt, roleAttributes.modifiedAt)
        && Objects.equals(this.name, roleAttributes.name)
        && Objects.equals(this.userCount, roleAttributes.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt, name, userCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
