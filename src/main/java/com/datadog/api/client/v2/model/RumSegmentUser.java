/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A user who performed an action on a segment. */
@JsonPropertyOrder({
  RumSegmentUser.JSON_PROPERTY_HANDLE,
  RumSegmentUser.JSON_PROPERTY_ICON,
  RumSegmentUser.JSON_PROPERTY_ID,
  RumSegmentUser.JSON_PROPERTY_NAME,
  RumSegmentUser.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentUser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public RumSegmentUser() {}

  @JsonCreator
  public RumSegmentUser(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_ICON) String icon,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) String uuid) {
    this.handle = handle;
    this.icon = icon;
    this.id = id;
    this.name = name;
    this.uuid = uuid;
  }

  public RumSegmentUser handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The email handle of the user.
   *
   * @return handle
   */
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public RumSegmentUser icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The URL of the user icon.
   *
   * @return icon
   */
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public RumSegmentUser id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The numeric identifier of the user.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RumSegmentUser name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the user.
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

  public RumSegmentUser uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The unique identifier of the user.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return RumSegmentUser
   */
  @JsonAnySetter
  public RumSegmentUser putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentUser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentUser rumSegmentUser = (RumSegmentUser) o;
    return Objects.equals(this.handle, rumSegmentUser.handle)
        && Objects.equals(this.icon, rumSegmentUser.icon)
        && Objects.equals(this.id, rumSegmentUser.id)
        && Objects.equals(this.name, rumSegmentUser.name)
        && Objects.equals(this.uuid, rumSegmentUser.uuid)
        && Objects.equals(this.additionalProperties, rumSegmentUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, icon, id, name, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentUser {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
