/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of the Datadog user. */
@JsonPropertyOrder({
  StatusPagesUserAttributes.JSON_PROPERTY_EMAIL,
  StatusPagesUserAttributes.JSON_PROPERTY_HANDLE,
  StatusPagesUserAttributes.JSON_PROPERTY_ICON,
  StatusPagesUserAttributes.JSON_PROPERTY_NAME,
  StatusPagesUserAttributes.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPagesUserAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public StatusPagesUserAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the Datadog user.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StatusPagesUserAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The handle of the Datadog user.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public StatusPagesUserAttributes icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The icon of the Datadog user.
   *
   * @return icon
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public StatusPagesUserAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Datadog user.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StatusPagesUserAttributes uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The UUID of the Datadog user.
   *
   * @return uuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return StatusPagesUserAttributes
   */
  @JsonAnySetter
  public StatusPagesUserAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this StatusPagesUserAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPagesUserAttributes statusPagesUserAttributes = (StatusPagesUserAttributes) o;
    return Objects.equals(this.email, statusPagesUserAttributes.email)
        && Objects.equals(this.handle, statusPagesUserAttributes.handle)
        && Objects.equals(this.icon, statusPagesUserAttributes.icon)
        && Objects.equals(this.name, statusPagesUserAttributes.name)
        && Objects.equals(this.uuid, statusPagesUserAttributes.uuid)
        && Objects.equals(
            this.additionalProperties, statusPagesUserAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, handle, icon, name, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPagesUserAttributes {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
