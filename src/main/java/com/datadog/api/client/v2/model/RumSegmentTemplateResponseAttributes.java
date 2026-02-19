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

/** Attributes of a segment template in a response. */
@JsonPropertyOrder({
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_CATEGORY,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_CREATED_AT,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_MODIFIED_AT,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_NAME,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_PARAMETERS,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_STATUS,
  RumSegmentTemplateResponseAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentTemplateResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private Map<String, RumSegmentTemplateParameterDef> parameters =
      new HashMap<String, RumSegmentTemplateParameterDef>();

  public static final String JSON_PROPERTY_STATUS = "status";
  private RumSegmentTemplateStatus status;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public RumSegmentTemplateResponseAttributes() {}

  @JsonCreator
  public RumSegmentTemplateResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARAMETERS)
          Map<String, RumSegmentTemplateParameterDef> parameters,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) RumSegmentTemplateStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.category = category;
    this.createdAt = createdAt;
    this.description = description;
    this.modifiedAt = modifiedAt;
    this.name = name;
    this.parameters = parameters;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.version = version;
  }

  public RumSegmentTemplateResponseAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the template.
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public RumSegmentTemplateResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp in RFC 3339 format.
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

  public RumSegmentTemplateResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the template.
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

  public RumSegmentTemplateResponseAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The last modification timestamp in RFC 3339 format.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public RumSegmentTemplateResponseAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the template.
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

  public RumSegmentTemplateResponseAttributes parameters(
      Map<String, RumSegmentTemplateParameterDef> parameters) {
    this.parameters = parameters;
    return this;
  }

  public RumSegmentTemplateResponseAttributes putParametersItem(
      String key, RumSegmentTemplateParameterDef parametersItem) {
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * The template parameter definitions.
   *
   * @return parameters
   */
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, RumSegmentTemplateParameterDef> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, RumSegmentTemplateParameterDef> parameters) {
    this.parameters = parameters;
  }

  public RumSegmentTemplateResponseAttributes status(RumSegmentTemplateStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a segment template.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumSegmentTemplateStatus getStatus() {
    return status;
  }

  public void setStatus(RumSegmentTemplateStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RumSegmentTemplateResponseAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version number of the template.
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
   * @return RumSegmentTemplateResponseAttributes
   */
  @JsonAnySetter
  public RumSegmentTemplateResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentTemplateResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentTemplateResponseAttributes rumSegmentTemplateResponseAttributes =
        (RumSegmentTemplateResponseAttributes) o;
    return Objects.equals(this.category, rumSegmentTemplateResponseAttributes.category)
        && Objects.equals(this.createdAt, rumSegmentTemplateResponseAttributes.createdAt)
        && Objects.equals(this.description, rumSegmentTemplateResponseAttributes.description)
        && Objects.equals(this.modifiedAt, rumSegmentTemplateResponseAttributes.modifiedAt)
        && Objects.equals(this.name, rumSegmentTemplateResponseAttributes.name)
        && Objects.equals(this.parameters, rumSegmentTemplateResponseAttributes.parameters)
        && Objects.equals(this.status, rumSegmentTemplateResponseAttributes.status)
        && Objects.equals(this.version, rumSegmentTemplateResponseAttributes.version)
        && Objects.equals(
            this.additionalProperties, rumSegmentTemplateResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        createdAt,
        description,
        modifiedAt,
        name,
        parameters,
        status,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentTemplateResponseAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
