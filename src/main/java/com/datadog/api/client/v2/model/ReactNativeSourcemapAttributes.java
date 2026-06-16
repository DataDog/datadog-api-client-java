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

/** Attributes of a React Native source map. */
@JsonPropertyOrder({
  ReactNativeSourcemapAttributes.JSON_PROPERTY_BUILD_NUMBER,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_BUNDLE_NAME,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_BUNDLE_VERSION,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_CREATED_AT,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_DEBUG_ID,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_MAPKIND,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_PLATFORM,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_SERVICE,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_SIZE,
  ReactNativeSourcemapAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReactNativeSourcemapAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUILD_NUMBER = "build_number";
  private String buildNumber;

  public static final String JSON_PROPERTY_BUNDLE_NAME = "bundle_name";
  private String bundleName;

  public static final String JSON_PROPERTY_BUNDLE_VERSION = "bundle_version";
  private String bundleVersion;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DEBUG_ID = "debug_id";
  private String debugId;

  public static final String JSON_PROPERTY_MAPKIND = "mapkind";
  private String mapkind;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public ReactNativeSourcemapAttributes() {}

  @JsonCreator
  public ReactNativeSourcemapAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPKIND) String mapkind,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size) {
    this.createdAt = createdAt;
    this.mapkind = mapkind;
    this.size = size;
  }

  public ReactNativeSourcemapAttributes buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * The build number.
   *
   * @return buildNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public ReactNativeSourcemapAttributes bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  /**
   * The bundle name.
   *
   * @return bundleName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUNDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBundleName() {
    return bundleName;
  }

  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  public ReactNativeSourcemapAttributes bundleVersion(String bundleVersion) {
    this.bundleVersion = bundleVersion;
    return this;
  }

  /**
   * The bundle version.
   *
   * @return bundleVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUNDLE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBundleVersion() {
    return bundleVersion;
  }

  public void setBundleVersion(String bundleVersion) {
    this.bundleVersion = bundleVersion;
  }

  public ReactNativeSourcemapAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the source map was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ReactNativeSourcemapAttributes debugId(String debugId) {
    this.debugId = debugId;
    return this;
  }

  /**
   * The debug identifier (UUID format).
   *
   * @return debugId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEBUG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDebugId() {
    return debugId;
  }

  public void setDebugId(String debugId) {
    this.debugId = debugId;
  }

  public ReactNativeSourcemapAttributes mapkind(String mapkind) {
    this.mapkind = mapkind;
    return this;
  }

  /**
   * The type of source map.
   *
   * @return mapkind
   */
  @JsonProperty(JSON_PROPERTY_MAPKIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMapkind() {
    return mapkind;
  }

  public void setMapkind(String mapkind) {
    this.mapkind = mapkind;
  }

  public ReactNativeSourcemapAttributes platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * The platform the source map was built for (e.g., <code>ios</code>, <code>android</code>).
   *
   * @return platform
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ReactNativeSourcemapAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service name associated with the source map.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public ReactNativeSourcemapAttributes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the source map file in bytes.
   *
   * @return size
   */
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ReactNativeSourcemapAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the service associated with the source map.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
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
   * @return ReactNativeSourcemapAttributes
   */
  @JsonAnySetter
  public ReactNativeSourcemapAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReactNativeSourcemapAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactNativeSourcemapAttributes reactNativeSourcemapAttributes =
        (ReactNativeSourcemapAttributes) o;
    return Objects.equals(this.buildNumber, reactNativeSourcemapAttributes.buildNumber)
        && Objects.equals(this.bundleName, reactNativeSourcemapAttributes.bundleName)
        && Objects.equals(this.bundleVersion, reactNativeSourcemapAttributes.bundleVersion)
        && Objects.equals(this.createdAt, reactNativeSourcemapAttributes.createdAt)
        && Objects.equals(this.debugId, reactNativeSourcemapAttributes.debugId)
        && Objects.equals(this.mapkind, reactNativeSourcemapAttributes.mapkind)
        && Objects.equals(this.platform, reactNativeSourcemapAttributes.platform)
        && Objects.equals(this.service, reactNativeSourcemapAttributes.service)
        && Objects.equals(this.size, reactNativeSourcemapAttributes.size)
        && Objects.equals(this.version, reactNativeSourcemapAttributes.version)
        && Objects.equals(
            this.additionalProperties, reactNativeSourcemapAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        buildNumber,
        bundleName,
        bundleVersion,
        createdAt,
        debugId,
        mapkind,
        platform,
        service,
        size,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactNativeSourcemapAttributes {\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    bundleVersion: ").append(toIndentedString(bundleVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    debugId: ").append(toIndentedString(debugId)).append("\n");
    sb.append("    mapkind: ").append(toIndentedString(mapkind)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
