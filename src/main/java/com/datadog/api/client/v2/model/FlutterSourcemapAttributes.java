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

/** Attributes of a Flutter symbol file. */
@JsonPropertyOrder({
  FlutterSourcemapAttributes.JSON_PROPERTY_ARCH,
  FlutterSourcemapAttributes.JSON_PROPERTY_CREATED_AT,
  FlutterSourcemapAttributes.JSON_PROPERTY_MAPKIND,
  FlutterSourcemapAttributes.JSON_PROPERTY_SERVICE,
  FlutterSourcemapAttributes.JSON_PROPERTY_SIZE,
  FlutterSourcemapAttributes.JSON_PROPERTY_VARIANT,
  FlutterSourcemapAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlutterSourcemapAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARCH = "arch";
  private String arch;

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

  public FlutterSourcemapAttributes() {}

  @JsonCreator
  public FlutterSourcemapAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAPKIND) String mapkind,
      @JsonProperty(required = true, value = JSON_PROPERTY_SIZE) Long size) {
    this.createdAt = createdAt;
    this.mapkind = mapkind;
    this.size = size;
  }

  public FlutterSourcemapAttributes arch(String arch) {
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

  public FlutterSourcemapAttributes createdAt(OffsetDateTime createdAt) {
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

  public FlutterSourcemapAttributes mapkind(String mapkind) {
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

  public FlutterSourcemapAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service name associated with the symbol file.
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

  public FlutterSourcemapAttributes size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the symbol file in bytes.
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

  public FlutterSourcemapAttributes variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * The build variant.
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

  public FlutterSourcemapAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the service associated with the symbol file.
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
   * @return FlutterSourcemapAttributes
   */
  @JsonAnySetter
  public FlutterSourcemapAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FlutterSourcemapAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlutterSourcemapAttributes flutterSourcemapAttributes = (FlutterSourcemapAttributes) o;
    return Objects.equals(this.arch, flutterSourcemapAttributes.arch)
        && Objects.equals(this.createdAt, flutterSourcemapAttributes.createdAt)
        && Objects.equals(this.mapkind, flutterSourcemapAttributes.mapkind)
        && Objects.equals(this.service, flutterSourcemapAttributes.service)
        && Objects.equals(this.size, flutterSourcemapAttributes.size)
        && Objects.equals(this.variant, flutterSourcemapAttributes.variant)
        && Objects.equals(this.version, flutterSourcemapAttributes.version)
        && Objects.equals(
            this.additionalProperties, flutterSourcemapAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arch, createdAt, mapkind, service, size, variant, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlutterSourcemapAttributes {\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    mapkind: ").append(toIndentedString(mapkind)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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
