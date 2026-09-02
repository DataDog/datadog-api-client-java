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
import java.util.UUID;

/** User information for a global organization association. */
@JsonPropertyOrder({GlobalOrgUser.JSON_PROPERTY_HANDLE, GlobalOrgUser.JSON_PROPERTY_UUID})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GlobalOrgUser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private UUID uuid;

  public GlobalOrgUser() {}

  @JsonCreator
  public GlobalOrgUser(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) UUID uuid) {
    this.handle = handle;
    this.uuid = uuid;
  }

  public GlobalOrgUser handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * The handle of the user.
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

  public GlobalOrgUser uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The UUID of the user.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
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
   * @return GlobalOrgUser
   */
  @JsonAnySetter
  public GlobalOrgUser putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GlobalOrgUser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalOrgUser globalOrgUser = (GlobalOrgUser) o;
    return Objects.equals(this.handle, globalOrgUser.handle)
        && Objects.equals(this.uuid, globalOrgUser.uuid)
        && Objects.equals(this.additionalProperties, globalOrgUser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, uuid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalOrgUser {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
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
