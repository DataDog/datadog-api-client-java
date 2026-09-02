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

/** Attributes of an ELF symbol file. */
@JsonPropertyOrder({
  ELFSourcemapAttributes.JSON_PROPERTY_ARCH,
  ELFSourcemapAttributes.JSON_PROPERTY_CREATED_AT,
  ELFSourcemapAttributes.JSON_PROPERTY_FILE_HASH,
  ELFSourcemapAttributes.JSON_PROPERTY_FILE_NAME,
  ELFSourcemapAttributes.JSON_PROPERTY_GNU_BUILD_ID,
  ELFSourcemapAttributes.JSON_PROPERTY_GO_BUILD_ID,
  ELFSourcemapAttributes.JSON_PROPERTY_MAPKIND,
  ELFSourcemapAttributes.JSON_PROPERTY_ORIGIN,
  ELFSourcemapAttributes.JSON_PROPERTY_ORIGIN_VERSION,
  ELFSourcemapAttributes.JSON_PROPERTY_SIZE,
  ELFSourcemapAttributes.JSON_PROPERTY_SYMBOL_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ELFSourcemapAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCH = "arch";
  private String arch;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FILE_HASH = "file_hash";
  private String fileHash;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_GNU_BUILD_ID = "gnu_build_id";
  private String gnuBuildId;

  public static final String JSON_PROPERTY_GO_BUILD_ID = "go_build_id";
  private String goBuildId;

  public static final String JSON_PROPERTY_MAPKIND = "mapkind";
  private String mapkind;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public static final String JSON_PROPERTY_ORIGIN_VERSION = "origin_version";
  private String originVersion;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_SYMBOL_SOURCE = "symbol_source";
  private String symbolSource;

  public ELFSourcemapAttributes() {}

  @JsonCreator
  public ELFSourcemapAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPKIND) String mapkind,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size) {
    this.createdAt = createdAt;
    this.mapkind = mapkind;
    this.size = size;
  }

  public ELFSourcemapAttributes arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * The target CPU architecture.
   *
   * @return arch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }

  public ELFSourcemapAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the symbol file was created.
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

  public ELFSourcemapAttributes fileHash(String fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  /**
   * The SHA256 hash of the ELF file.
   *
   * @return fileHash
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileHash() {
    return fileHash;
  }

  public void setFileHash(String fileHash) {
    this.fileHash = fileHash;
  }

  public ELFSourcemapAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The ELF file name.
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

  public ELFSourcemapAttributes gnuBuildId(String gnuBuildId) {
    this.gnuBuildId = gnuBuildId;
    return this;
  }

  /**
   * The GNU build ID (UUID format).
   *
   * @return gnuBuildId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GNU_BUILD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGnuBuildId() {
    return gnuBuildId;
  }

  public void setGnuBuildId(String gnuBuildId) {
    this.gnuBuildId = gnuBuildId;
  }

  public ELFSourcemapAttributes goBuildId(String goBuildId) {
    this.goBuildId = goBuildId;
    return this;
  }

  /**
   * The Go build ID (UUID format).
   *
   * @return goBuildId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GO_BUILD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGoBuildId() {
    return goBuildId;
  }

  public void setGoBuildId(String goBuildId) {
    this.goBuildId = goBuildId;
  }

  public ELFSourcemapAttributes mapkind(String mapkind) {
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

  public ELFSourcemapAttributes origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * The origin of the ELF file.
   *
   * @return origin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public ELFSourcemapAttributes originVersion(String originVersion) {
    this.originVersion = originVersion;
    return this;
  }

  /**
   * The version of the origin package.
   *
   * @return originVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginVersion() {
    return originVersion;
  }

  public void setOriginVersion(String originVersion) {
    this.originVersion = originVersion;
  }

  public ELFSourcemapAttributes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the ELF file in bytes.
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

  public ELFSourcemapAttributes symbolSource(String symbolSource) {
    this.symbolSource = symbolSource;
    return this;
  }

  /**
   * The source of the debug symbols.
   *
   * @return symbolSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYMBOL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSymbolSource() {
    return symbolSource;
  }

  public void setSymbolSource(String symbolSource) {
    this.symbolSource = symbolSource;
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
   * @return ELFSourcemapAttributes
   */
  @JsonAnySetter
  public ELFSourcemapAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ELFSourcemapAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ELFSourcemapAttributes elfSourcemapAttributes = (ELFSourcemapAttributes) o;
    return Objects.equals(this.arch, elfSourcemapAttributes.arch)
        && Objects.equals(this.createdAt, elfSourcemapAttributes.createdAt)
        && Objects.equals(this.fileHash, elfSourcemapAttributes.fileHash)
        && Objects.equals(this.fileName, elfSourcemapAttributes.fileName)
        && Objects.equals(this.gnuBuildId, elfSourcemapAttributes.gnuBuildId)
        && Objects.equals(this.goBuildId, elfSourcemapAttributes.goBuildId)
        && Objects.equals(this.mapkind, elfSourcemapAttributes.mapkind)
        && Objects.equals(this.origin, elfSourcemapAttributes.origin)
        && Objects.equals(this.originVersion, elfSourcemapAttributes.originVersion)
        && Objects.equals(this.size, elfSourcemapAttributes.size)
        && Objects.equals(this.symbolSource, elfSourcemapAttributes.symbolSource)
        && Objects.equals(this.additionalProperties, elfSourcemapAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arch,
        createdAt,
        fileHash,
        fileName,
        gnuBuildId,
        goBuildId,
        mapkind,
        origin,
        originVersion,
        size,
        symbolSource,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ELFSourcemapAttributes {\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    gnuBuildId: ").append(toIndentedString(gnuBuildId)).append("\n");
    sb.append("    goBuildId: ").append(toIndentedString(goBuildId)).append("\n");
    sb.append("    mapkind: ").append(toIndentedString(mapkind)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originVersion: ").append(toIndentedString(originVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    symbolSource: ").append(toIndentedString(symbolSource)).append("\n");
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
