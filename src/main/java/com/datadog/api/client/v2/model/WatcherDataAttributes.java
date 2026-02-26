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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  WatcherDataAttributes.JSON_PROPERTY_HANDLE,
  WatcherDataAttributes.JSON_PROPERTY_ICON,
  WatcherDataAttributes.JSON_PROPERTY_LAST_WATCHED_AT,
  WatcherDataAttributes.JSON_PROPERTY_NAME,
  WatcherDataAttributes.JSON_PROPERTY_WATCH_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WatcherDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_LAST_WATCHED_AT = "last_watched_at";
  private OffsetDateTime lastWatchedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WATCH_COUNT = "watch_count";
  private Integer watchCount;

  public WatcherDataAttributes() {}

  @JsonCreator
  public WatcherDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HANDLE) String handle,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_WATCHED_AT)
          OffsetDateTime lastWatchedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_WATCH_COUNT) Integer watchCount) {
    this.handle = handle;
    this.lastWatchedAt = lastWatchedAt;
    this.watchCount = watchCount;
  }

  public WatcherDataAttributes handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Gethandle
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

  public WatcherDataAttributes icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Geticon
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

  public WatcherDataAttributes lastWatchedAt(OffsetDateTime lastWatchedAt) {
    this.lastWatchedAt = lastWatchedAt;
    return this;
  }

  /**
   * GetlastWatchedAt
   *
   * @return lastWatchedAt
   */
  @JsonProperty(JSON_PROPERTY_LAST_WATCHED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastWatchedAt() {
    return lastWatchedAt;
  }

  public void setLastWatchedAt(OffsetDateTime lastWatchedAt) {
    this.lastWatchedAt = lastWatchedAt;
  }

  public WatcherDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
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

  public WatcherDataAttributes watchCount(Integer watchCount) {
    this.watchCount = watchCount;
    return this;
  }

  /**
   * GetwatchCount maximum: 2147483647
   *
   * @return watchCount
   */
  @JsonProperty(JSON_PROPERTY_WATCH_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getWatchCount() {
    return watchCount;
  }

  public void setWatchCount(Integer watchCount) {
    this.watchCount = watchCount;
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
   * @return WatcherDataAttributes
   */
  @JsonAnySetter
  public WatcherDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WatcherDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatcherDataAttributes watcherDataAttributes = (WatcherDataAttributes) o;
    return Objects.equals(this.handle, watcherDataAttributes.handle)
        && Objects.equals(this.icon, watcherDataAttributes.icon)
        && Objects.equals(this.lastWatchedAt, watcherDataAttributes.lastWatchedAt)
        && Objects.equals(this.name, watcherDataAttributes.name)
        && Objects.equals(this.watchCount, watcherDataAttributes.watchCount)
        && Objects.equals(this.additionalProperties, watcherDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handle, icon, lastWatchedAt, name, watchCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatcherDataAttributes {\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    lastWatchedAt: ").append(toIndentedString(lastWatchedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
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
