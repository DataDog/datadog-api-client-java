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

/** Attributes of a JavaScript source map. */
@JsonPropertyOrder({
  JSSourcemapAttributes.JSON_PROPERTY_ABSOLUTE_PATH,
  JSSourcemapAttributes.JSON_PROPERTY_BLOB_STORAGE_SOURCEMAP_PATH,
  JSSourcemapAttributes.JSON_PROPERTY_BUILD_ID,
  JSSourcemapAttributes.JSON_PROPERTY_CREATED_AT,
  JSSourcemapAttributes.JSON_PROPERTY_DOMAIN,
  JSSourcemapAttributes.JSON_PROPERTY_FILE_NAME,
  JSSourcemapAttributes.JSON_PROPERTY_MAPKIND,
  JSSourcemapAttributes.JSON_PROPERTY_SERVICE,
  JSSourcemapAttributes.JSON_PROPERTY_SIZE,
  JSSourcemapAttributes.JSON_PROPERTY_VARIANT,
  JSSourcemapAttributes.JSON_PROPERTY_VERSION,
  JSSourcemapAttributes.JSON_PROPERTY_VERSION_CODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JSSourcemapAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ABSOLUTE_PATH = "absolute_path";
  private String absolutePath;

  public static final String JSON_PROPERTY_BLOB_STORAGE_SOURCEMAP_PATH =
      "blob_storage_sourcemap_path";
  private String blobStorageSourcemapPath;

  public static final String JSON_PROPERTY_BUILD_ID = "build_id";
  private String buildId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

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

  public JSSourcemapAttributes() {}

  @JsonCreator
  public JSSourcemapAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPKIND) String mapkind,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size) {
    this.createdAt = createdAt;
    this.mapkind = mapkind;
    this.size = size;
  }

  public JSSourcemapAttributes absolutePath(String absolutePath) {
    this.absolutePath = absolutePath;
    return this;
  }

  /**
   * The absolute path to the minified JavaScript file.
   *
   * @return absolutePath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAbsolutePath() {
    return absolutePath;
  }

  public void setAbsolutePath(String absolutePath) {
    this.absolutePath = absolutePath;
  }

  public JSSourcemapAttributes blobStorageSourcemapPath(String blobStorageSourcemapPath) {
    this.blobStorageSourcemapPath = blobStorageSourcemapPath;
    return this;
  }

  /**
   * The path to the source map in blob storage.
   *
   * @return blobStorageSourcemapPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOB_STORAGE_SOURCEMAP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBlobStorageSourcemapPath() {
    return blobStorageSourcemapPath;
  }

  public void setBlobStorageSourcemapPath(String blobStorageSourcemapPath) {
    this.blobStorageSourcemapPath = blobStorageSourcemapPath;
  }

  public JSSourcemapAttributes buildId(String buildId) {
    this.buildId = buildId;
    return this;
  }

  /**
   * The build identifier.
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

  public JSSourcemapAttributes createdAt(OffsetDateTime createdAt) {
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

  public JSSourcemapAttributes domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain associated with the source map.
   *
   * @return domain
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public JSSourcemapAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The file name of the minified JavaScript file.
   *
   * @return fileName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public JSSourcemapAttributes mapkind(String mapkind) {
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

  public JSSourcemapAttributes service(String service) {
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

  public JSSourcemapAttributes size(Long size) {
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

  public JSSourcemapAttributes variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * The source map variant.
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

  public JSSourcemapAttributes version(String version) {
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

  public JSSourcemapAttributes versionCode(String versionCode) {
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
   * @return JSSourcemapAttributes
   */
  @JsonAnySetter
  public JSSourcemapAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JSSourcemapAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSSourcemapAttributes jsSourcemapAttributes = (JSSourcemapAttributes) o;
    return Objects.equals(this.absolutePath, jsSourcemapAttributes.absolutePath)
        && Objects.equals(
            this.blobStorageSourcemapPath, jsSourcemapAttributes.blobStorageSourcemapPath)
        && Objects.equals(this.buildId, jsSourcemapAttributes.buildId)
        && Objects.equals(this.createdAt, jsSourcemapAttributes.createdAt)
        && Objects.equals(this.domain, jsSourcemapAttributes.domain)
        && Objects.equals(this.fileName, jsSourcemapAttributes.fileName)
        && Objects.equals(this.mapkind, jsSourcemapAttributes.mapkind)
        && Objects.equals(this.service, jsSourcemapAttributes.service)
        && Objects.equals(this.size, jsSourcemapAttributes.size)
        && Objects.equals(this.variant, jsSourcemapAttributes.variant)
        && Objects.equals(this.version, jsSourcemapAttributes.version)
        && Objects.equals(this.versionCode, jsSourcemapAttributes.versionCode)
        && Objects.equals(this.additionalProperties, jsSourcemapAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        absolutePath,
        blobStorageSourcemapPath,
        buildId,
        createdAt,
        domain,
        fileName,
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
    sb.append("class JSSourcemapAttributes {\n");
    sb.append("    absolutePath: ").append(toIndentedString(absolutePath)).append("\n");
    sb.append("    blobStorageSourcemapPath: ")
        .append(toIndentedString(blobStorageSourcemapPath))
        .append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
