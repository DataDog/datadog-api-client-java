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

/** Attributes of a JVM mapping file. */
@JsonPropertyOrder({
  JVMSourcemapAttributes.JSON_PROPERTY_BUILD_ID,
  JVMSourcemapAttributes.JSON_PROPERTY_CREATED_AT,
  JVMSourcemapAttributes.JSON_PROPERTY_MAPKIND,
  JVMSourcemapAttributes.JSON_PROPERTY_SERVICE,
  JVMSourcemapAttributes.JSON_PROPERTY_SIZE,
  JVMSourcemapAttributes.JSON_PROPERTY_VARIANT,
  JVMSourcemapAttributes.JSON_PROPERTY_VERSION,
  JVMSourcemapAttributes.JSON_PROPERTY_VERSION_CODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JVMSourcemapAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUILD_ID = "build_id";
  private String buildId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MAPKIND = "mapkind";
  private String mapkind;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private String variant;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_VERSION_CODE = "version_code";
  private String versionCode;

  public JVMSourcemapAttributes() {}

  @JsonCreator
  public JVMSourcemapAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPKIND) String mapkind,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size) {
    this.createdAt = createdAt;
    this.mapkind = mapkind;
    this.size = size;
  }

  public JVMSourcemapAttributes buildId(String buildId) {
    this.buildId = buildId;
    return this;
  }

  /**
   * The build identifier (UUID format).
   *
   * @return buildId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBuildId() {
    return buildId;
  }

  public void setBuildId(String buildId) {
    this.buildId = buildId;
  }

  public JVMSourcemapAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the mapping file was created.
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

  public JVMSourcemapAttributes mapkind(String mapkind) {
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

  public JVMSourcemapAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service name associated with the mapping file.
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

  public JVMSourcemapAttributes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the mapping file in bytes.
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

  public JVMSourcemapAttributes variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * The build variant (e.g., <code>release</code>, <code>debug</code>).
   *
   * @return variant
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public JVMSourcemapAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the service associated with the mapping file.
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

  public JVMSourcemapAttributes versionCode(String versionCode) {
    this.versionCode = versionCode;
    return this;
  }

  /**
   * The version code.
   *
   * @return versionCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(String versionCode) {
    this.versionCode = versionCode;
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
   * @return JVMSourcemapAttributes
   */
  @JsonAnySetter
  public JVMSourcemapAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JVMSourcemapAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JVMSourcemapAttributes jvmSourcemapAttributes = (JVMSourcemapAttributes) o;
    return Objects.equals(this.buildId, jvmSourcemapAttributes.buildId)
        && Objects.equals(this.createdAt, jvmSourcemapAttributes.createdAt)
        && Objects.equals(this.mapkind, jvmSourcemapAttributes.mapkind)
        && Objects.equals(this.service, jvmSourcemapAttributes.service)
        && Objects.equals(this.size, jvmSourcemapAttributes.size)
        && Objects.equals(this.variant, jvmSourcemapAttributes.variant)
        && Objects.equals(this.version, jvmSourcemapAttributes.version)
        && Objects.equals(this.versionCode, jvmSourcemapAttributes.versionCode)
        && Objects.equals(this.additionalProperties, jvmSourcemapAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        buildId,
        createdAt,
        mapkind,
        service,
        size,
        variant,
        version,
        versionCode,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JVMSourcemapAttributes {\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    mapkind: ").append(toIndentedString(mapkind)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
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
