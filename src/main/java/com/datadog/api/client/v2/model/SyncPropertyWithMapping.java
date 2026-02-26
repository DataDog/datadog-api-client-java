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

/** Sync property with mapping configuration */
@JsonPropertyOrder({
  SyncPropertyWithMapping.JSON_PROPERTY_MAPPING,
  SyncPropertyWithMapping.JSON_PROPERTY_NAME_MAPPING,
  SyncPropertyWithMapping.JSON_PROPERTY_SYNC_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyncPropertyWithMapping {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAPPING = "mapping";
  private Map<String, String> mapping = null;

  public static final String JSON_PROPERTY_NAME_MAPPING = "name_mapping";
  private Map<String, String> nameMapping = null;

  public static final String JSON_PROPERTY_SYNC_TYPE = "sync_type";
  private String syncType;

  public SyncPropertyWithMapping mapping(Map<String, String> mapping) {
    this.mapping = mapping;
    return this;
  }

  public SyncPropertyWithMapping putMappingItem(String key, String mappingItem) {
    if (this.mapping == null) {
      this.mapping = new HashMap<>();
    }
    this.mapping.put(key, mappingItem);
    return this;
  }

  /**
   * Getmapping
   *
   * @return mapping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getMapping() {
    return mapping;
  }

  public void setMapping(Map<String, String> mapping) {
    this.mapping = mapping;
  }

  public SyncPropertyWithMapping nameMapping(Map<String, String> nameMapping) {
    this.nameMapping = nameMapping;
    return this;
  }

  public SyncPropertyWithMapping putNameMappingItem(String key, String nameMappingItem) {
    if (this.nameMapping == null) {
      this.nameMapping = new HashMap<>();
    }
    this.nameMapping.put(key, nameMappingItem);
    return this;
  }

  /**
   * GetnameMapping
   *
   * @return nameMapping
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getNameMapping() {
    return nameMapping;
  }

  public void setNameMapping(Map<String, String> nameMapping) {
    this.nameMapping = nameMapping;
  }

  public SyncPropertyWithMapping syncType(String syncType) {
    this.syncType = syncType;
    return this;
  }

  /**
   * GetsyncType
   *
   * @return syncType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSyncType() {
    return syncType;
  }

  public void setSyncType(String syncType) {
    this.syncType = syncType;
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
   * @return SyncPropertyWithMapping
   */
  @JsonAnySetter
  public SyncPropertyWithMapping putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyncPropertyWithMapping object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncPropertyWithMapping syncPropertyWithMapping = (SyncPropertyWithMapping) o;
    return Objects.equals(this.mapping, syncPropertyWithMapping.mapping)
        && Objects.equals(this.nameMapping, syncPropertyWithMapping.nameMapping)
        && Objects.equals(this.syncType, syncPropertyWithMapping.syncType)
        && Objects.equals(this.additionalProperties, syncPropertyWithMapping.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, nameMapping, syncType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncPropertyWithMapping {\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    nameMapping: ").append(toIndentedString(nameMapping)).append("\n");
    sb.append("    syncType: ").append(toIndentedString(syncType)).append("\n");
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
