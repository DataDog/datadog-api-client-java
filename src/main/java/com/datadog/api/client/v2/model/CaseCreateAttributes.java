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

/** Case creation attributes */
@JsonPropertyOrder({
  CaseCreateAttributes.JSON_PROPERTY_CUSTOM_ATTRIBUTES,
  CaseCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  CaseCreateAttributes.JSON_PROPERTY_PRIORITY,
  CaseCreateAttributes.JSON_PROPERTY_STATUS_NAME,
  CaseCreateAttributes.JSON_PROPERTY_TITLE,
  CaseCreateAttributes.JSON_PROPERTY_TYPE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_ATTRIBUTES = "custom_attributes";
  private Map<String, CustomAttributeValue> customAttributes = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private CasePriority priority = CasePriority.NOT_DEFINED;

  public static final String JSON_PROPERTY_STATUS_NAME = "status_name";
  private String statusName;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE_ID = "type_id";
  private String typeId;

  public CaseCreateAttributes() {}

  @JsonCreator
  public CaseCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE_ID) String typeId) {
    this.title = title;
    this.typeId = typeId;
  }

  public CaseCreateAttributes customAttributes(Map<String, CustomAttributeValue> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public CaseCreateAttributes putCustomAttributesItem(
      String key, CustomAttributeValue customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new HashMap<>();
    }
    this.customAttributes.put(key, customAttributesItem);
    return this;
  }

  /**
   * Case custom attributes
   *
   * @return customAttributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, CustomAttributeValue> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(Map<String, CustomAttributeValue> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public CaseCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CaseCreateAttributes priority(CasePriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * Case priority
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CasePriority getPriority() {
    return priority;
  }

  public void setPriority(CasePriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public CaseCreateAttributes statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

  /**
   * Status of the case. Must be one of the existing statuses for the case's type.
   *
   * @return statusName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public CaseCreateAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CaseCreateAttributes typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Case type UUID
   *
   * @return typeId
   */
  @JsonProperty(JSON_PROPERTY_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
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
   * @return CaseCreateAttributes
   */
  @JsonAnySetter
  public CaseCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseCreateAttributes caseCreateAttributes = (CaseCreateAttributes) o;
    return Objects.equals(this.customAttributes, caseCreateAttributes.customAttributes)
        && Objects.equals(this.description, caseCreateAttributes.description)
        && Objects.equals(this.priority, caseCreateAttributes.priority)
        && Objects.equals(this.statusName, caseCreateAttributes.statusName)
        && Objects.equals(this.title, caseCreateAttributes.title)
        && Objects.equals(this.typeId, caseCreateAttributes.typeId)
        && Objects.equals(this.additionalProperties, caseCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customAttributes, description, priority, statusName, title, typeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseCreateAttributes {\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
