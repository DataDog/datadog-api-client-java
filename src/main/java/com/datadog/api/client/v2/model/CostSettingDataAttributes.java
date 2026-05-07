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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for a cost setting. */
@JsonPropertyOrder({
  CostSettingDataAttributes.JSON_PROPERTY_CREATED_AT,
  CostSettingDataAttributes.JSON_PROPERTY_CREATED_BY,
  CostSettingDataAttributes.JSON_PROPERTY_DATA,
  CostSettingDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CostSettingDataAttributes.JSON_PROPERTY_LAST_MODIFIED_BY,
  CostSettingDataAttributes.JSON_PROPERTY_SETTING_NAME,
  CostSettingDataAttributes.JSON_PROPERTY_UPDATED_AT,
  CostSettingDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostSettingDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<Map<String, Object>> data = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LAST_MODIFIED_BY = "last_modified_by";
  private String lastModifiedBy;

  public static final String JSON_PROPERTY_SETTING_NAME = "setting_name";
  private String settingName;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public CostSettingDataAttributes() {}

  @JsonCreator
  public CostSettingDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) String createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_MODIFIED_BY) String lastModifiedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_SETTING_NAME) String settingName,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) String updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.description = description;
    this.lastModifiedBy = lastModifiedBy;
    this.settingName = settingName;
    this.updatedAt = updatedAt;
    this.version = version;
  }

  public CostSettingDataAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the setting was created.
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

  public CostSettingDataAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user who created the setting.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CostSettingDataAttributes data(Map<String, Object> data) {
    this.data = JsonNullable.<Map<String, Object>>of(data);
    return this;
  }

  public CostSettingDataAttributes putDataItem(String key, Object dataItem) {
    if (this.data == null || !this.data.isPresent()) {
      this.data = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.data.get().put(key, dataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The setting data as a flexible key-value map.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getData() {
    return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getData_JsonNullable() {
    return data;
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<Map<String, Object>> data) {
    this.data = data;
  }

  public void setData(Map<String, Object> data) {
    this.data = JsonNullable.<Map<String, Object>>of(data);
  }

  public CostSettingDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of the setting.
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

  public CostSettingDataAttributes lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * The UUID of the user who last modified the setting.
   *
   * @return lastModifiedBy
   */
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public CostSettingDataAttributes settingName(String settingName) {
    this.settingName = settingName;
    return this;
  }

  /**
   * The name of the setting.
   *
   * @return settingName
   */
  @JsonProperty(JSON_PROPERTY_SETTING_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSettingName() {
    return settingName;
  }

  public void setSettingName(String settingName) {
    this.settingName = settingName;
  }

  public CostSettingDataAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the setting was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CostSettingDataAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the setting.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return CostSettingDataAttributes
   */
  @JsonAnySetter
  public CostSettingDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostSettingDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostSettingDataAttributes costSettingDataAttributes = (CostSettingDataAttributes) o;
    return Objects.equals(this.createdAt, costSettingDataAttributes.createdAt)
        && Objects.equals(this.createdBy, costSettingDataAttributes.createdBy)
        && Objects.equals(this.data, costSettingDataAttributes.data)
        && Objects.equals(this.description, costSettingDataAttributes.description)
        && Objects.equals(this.lastModifiedBy, costSettingDataAttributes.lastModifiedBy)
        && Objects.equals(this.settingName, costSettingDataAttributes.settingName)
        && Objects.equals(this.updatedAt, costSettingDataAttributes.updatedAt)
        && Objects.equals(this.version, costSettingDataAttributes.version)
        && Objects.equals(
            this.additionalProperties, costSettingDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        data,
        description,
        lastModifiedBy,
        settingName,
        updatedAt,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostSettingDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
