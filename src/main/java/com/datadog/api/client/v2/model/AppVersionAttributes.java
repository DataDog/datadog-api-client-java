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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes describing an app version. */
@JsonPropertyOrder({
  AppVersionAttributes.JSON_PROPERTY_APP_ID,
  AppVersionAttributes.JSON_PROPERTY_CREATED_AT,
  AppVersionAttributes.JSON_PROPERTY_HAS_EVER_BEEN_PUBLISHED,
  AppVersionAttributes.JSON_PROPERTY_NAME,
  AppVersionAttributes.JSON_PROPERTY_UPDATED_AT,
  AppVersionAttributes.JSON_PROPERTY_USER_ID,
  AppVersionAttributes.JSON_PROPERTY_USER_NAME,
  AppVersionAttributes.JSON_PROPERTY_USER_UUID,
  AppVersionAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AppVersionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APP_ID = "app_id";
  private UUID appId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_HAS_EVER_BEEN_PUBLISHED = "has_ever_been_published";
  private Boolean hasEverBeenPublished;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private Long userId;

  public static final String JSON_PROPERTY_USER_NAME = "user_name";
  private String userName;

  public static final String JSON_PROPERTY_USER_UUID = "user_uuid";
  private UUID userUuid;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public AppVersionAttributes appId(UUID appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The ID of the app this version belongs to.
   *
   * @return appId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getAppId() {
    return appId;
  }

  public void setAppId(UUID appId) {
    this.appId = appId;
  }

  public AppVersionAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the version was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AppVersionAttributes hasEverBeenPublished(Boolean hasEverBeenPublished) {
    this.hasEverBeenPublished = hasEverBeenPublished;
    return this;
  }

  /**
   * Whether this version has ever been published.
   *
   * @return hasEverBeenPublished
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_EVER_BEEN_PUBLISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasEverBeenPublished() {
    return hasEverBeenPublished;
  }

  public void setHasEverBeenPublished(Boolean hasEverBeenPublished) {
    this.hasEverBeenPublished = hasEverBeenPublished;
  }

  public AppVersionAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The optional human-readable name of the version.
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

  public AppVersionAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp of when the version was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AppVersionAttributes userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who created the version.
   *
   * @return userId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public AppVersionAttributes userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The name (or email) of the user who created the version.
   *
   * @return userName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AppVersionAttributes userUuid(UUID userUuid) {
    this.userUuid = userUuid;
    return this;
  }

  /**
   * The UUID of the user who created the version.
   *
   * @return userUuid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(UUID userUuid) {
    this.userUuid = userUuid;
  }

  public AppVersionAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version number of the app, starting at 1.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return AppVersionAttributes
   */
  @JsonAnySetter
  public AppVersionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AppVersionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppVersionAttributes appVersionAttributes = (AppVersionAttributes) o;
    return Objects.equals(this.appId, appVersionAttributes.appId)
        && Objects.equals(this.createdAt, appVersionAttributes.createdAt)
        && Objects.equals(this.hasEverBeenPublished, appVersionAttributes.hasEverBeenPublished)
        && Objects.equals(this.name, appVersionAttributes.name)
        && Objects.equals(this.updatedAt, appVersionAttributes.updatedAt)
        && Objects.equals(this.userId, appVersionAttributes.userId)
        && Objects.equals(this.userName, appVersionAttributes.userName)
        && Objects.equals(this.userUuid, appVersionAttributes.userUuid)
        && Objects.equals(this.version, appVersionAttributes.version)
        && Objects.equals(this.additionalProperties, appVersionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        appId,
        createdAt,
        hasEverBeenPublished,
        name,
        updatedAt,
        userId,
        userName,
        userUuid,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppVersionAttributes {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hasEverBeenPublished: ")
        .append(toIndentedString(hasEverBeenPublished))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
