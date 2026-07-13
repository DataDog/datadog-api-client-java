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

/** The attributes of a Cloud SIEM dataset. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_CREATED_BY_HANDLE,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_CREATED_BY_NAME,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_DEFINITION,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_ID,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_IS_DEFAULT,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_IS_DEPRECATED,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_NAME,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_UPDATED_BY_HANDLE,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_UPDATED_BY_NAME,
  SecurityMonitoringDatasetAttributesResponse.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "createdByHandle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_CREATED_BY_NAME = "createdByName";
  private String createdByName;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private SecurityMonitoringDatasetDefinition definition;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_DEPRECATED = "isDeprecated";
  private Boolean isDeprecated;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPDATED_BY_HANDLE = "updatedByHandle";
  private String updatedByHandle;

  public static final String JSON_PROPERTY_UPDATED_BY_NAME = "updatedByName";
  private String updatedByName;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringDatasetAttributesResponse() {}

  @JsonCreator
  public SecurityMonitoringDatasetAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) String createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_HANDLE)
          String createdByHandle,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY_NAME) String createdByName,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          SecurityMonitoringDatasetDefinition definition,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEFAULT) Boolean isDefault,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEPRECATED) Boolean isDeprecated,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) String modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY_HANDLE)
          String updatedByHandle,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY_NAME) String updatedByName,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.createdAt = createdAt;
    this.createdByHandle = createdByHandle;
    this.createdByName = createdByName;
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    this.description = description;
    this.id = id;
    this.isDefault = isDefault;
    this.isDeprecated = isDeprecated;
    this.modifiedAt = modifiedAt;
    this.name = name;
    this.updatedByHandle = updatedByHandle;
    if (updatedByHandle != null) {}
    this.updatedByName = updatedByName;
    if (updatedByName != null) {}
    this.version = version;
  }

  public SecurityMonitoringDatasetAttributesResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp of the dataset, in ISO 8601 format.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SecurityMonitoringDatasetAttributesResponse createdByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
    return this;
  }

  /**
   * The Datadog handle of the user who created the dataset.
   *
   * @return createdByHandle
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedByHandle() {
    return createdByHandle;
  }

  public void setCreatedByHandle(String createdByHandle) {
    this.createdByHandle = createdByHandle;
  }

  public SecurityMonitoringDatasetAttributesResponse createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
  }

  /**
   * The display name of the user who created the dataset.
   *
   * @return createdByName
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedByName() {
    return createdByName;
  }

  public void setCreatedByName(String createdByName) {
    this.createdByName = createdByName;
  }

  public SecurityMonitoringDatasetAttributesResponse definition(
      SecurityMonitoringDatasetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * The definition of the dataset. The shape depends on the value of <code>data_source</code>. Use
   * <code>reference_table</code> or <code>managed_resource</code> for a referential dataset, or one
   * of the event platform sources (for example <code>logs</code>, <code>audit</code>, <code>events
   * </code>, <code>spans</code>, <code>rum</code>) for an event platform dataset.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringDatasetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(SecurityMonitoringDatasetDefinition definition) {
    this.definition = definition;
    if (definition != null) {
      this.unparsed |= definition.unparsed;
    }
  }

  public SecurityMonitoringDatasetAttributesResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the dataset.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SecurityMonitoringDatasetAttributesResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The UUID of the dataset.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityMonitoringDatasetAttributesResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the dataset is an out-of-the-box dataset provided by Datadog.
   *
   * @return isDefault
   */
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SecurityMonitoringDatasetAttributesResponse isDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
    return this;
  }

  /**
   * Whether the dataset is marked as deprecated.
   *
   * @return isDeprecated
   */
  @JsonProperty(JSON_PROPERTY_IS_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDeprecated() {
    return isDeprecated;
  }

  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }

  public SecurityMonitoringDatasetAttributesResponse modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The timestamp of the last modification of the dataset, in ISO 8601 format.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public SecurityMonitoringDatasetAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unique name of the dataset.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringDatasetAttributesResponse updatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
    if (updatedByHandle != null) {}
    return this;
  }

  /**
   * The Datadog handle of the user who last updated the dataset.
   *
   * @return updatedByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedByHandle() {
    return updatedByHandle;
  }

  public void setUpdatedByHandle(String updatedByHandle) {
    this.updatedByHandle = updatedByHandle;
  }

  public SecurityMonitoringDatasetAttributesResponse updatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
    if (updatedByName != null) {}
    return this;
  }

  /**
   * The display name of the user who last updated the dataset.
   *
   * @return updatedByName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedByName() {
    return updatedByName;
  }

  public void setUpdatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
  }

  public SecurityMonitoringDatasetAttributesResponse version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The current version of the dataset.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return SecurityMonitoringDatasetAttributesResponse
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetAttributesResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SecurityMonitoringDatasetAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetAttributesResponse securityMonitoringDatasetAttributesResponse =
        (SecurityMonitoringDatasetAttributesResponse) o;
    return Objects.equals(this.createdAt, securityMonitoringDatasetAttributesResponse.createdAt)
        && Objects.equals(
            this.createdByHandle, securityMonitoringDatasetAttributesResponse.createdByHandle)
        && Objects.equals(
            this.createdByName, securityMonitoringDatasetAttributesResponse.createdByName)
        && Objects.equals(this.definition, securityMonitoringDatasetAttributesResponse.definition)
        && Objects.equals(this.description, securityMonitoringDatasetAttributesResponse.description)
        && Objects.equals(this.id, securityMonitoringDatasetAttributesResponse.id)
        && Objects.equals(this.isDefault, securityMonitoringDatasetAttributesResponse.isDefault)
        && Objects.equals(
            this.isDeprecated, securityMonitoringDatasetAttributesResponse.isDeprecated)
        && Objects.equals(this.modifiedAt, securityMonitoringDatasetAttributesResponse.modifiedAt)
        && Objects.equals(this.name, securityMonitoringDatasetAttributesResponse.name)
        && Objects.equals(
            this.updatedByHandle, securityMonitoringDatasetAttributesResponse.updatedByHandle)
        && Objects.equals(
            this.updatedByName, securityMonitoringDatasetAttributesResponse.updatedByName)
        && Objects.equals(this.version, securityMonitoringDatasetAttributesResponse.version)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringDatasetAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdByHandle,
        createdByName,
        definition,
        description,
        id,
        isDefault,
        isDeprecated,
        modifiedAt,
        name,
        updatedByHandle,
        updatedByName,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeprecated: ").append(toIndentedString(isDeprecated)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedByHandle: ").append(toIndentedString(updatedByHandle)).append("\n");
    sb.append("    updatedByName: ").append(toIndentedString(updatedByName)).append("\n");
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
