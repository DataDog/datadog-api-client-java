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

/** Timeline cell data for Markdown timeline cells for a create request. */
@JsonPropertyOrder({
  IncidentTimelineCellMarkdownCreateAttributes.JSON_PROPERTY_CELL_TYPE,
  IncidentTimelineCellMarkdownCreateAttributes.JSON_PROPERTY_CONTENT,
  IncidentTimelineCellMarkdownCreateAttributes.JSON_PROPERTY_IMPORTANT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTimelineCellMarkdownCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELL_TYPE = "cell_type";
  private IncidentTimelineCellMarkdownContentType cellType =
      IncidentTimelineCellMarkdownContentType.MARKDOWN;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private IncidentTimelineCellMarkdownCreateAttributesContent content;

  public static final String JSON_PROPERTY_IMPORTANT = "important";
  private Boolean important = false;

  public IncidentTimelineCellMarkdownCreateAttributes() {}

  @JsonCreator
  public IncidentTimelineCellMarkdownCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CELL_TYPE)
          IncidentTimelineCellMarkdownContentType cellType,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT)
          IncidentTimelineCellMarkdownCreateAttributesContent content) {
    this.cellType = cellType;
    this.unparsed |= !cellType.isValid();
    this.content = content;
    this.unparsed |= content.unparsed;
  }

  public IncidentTimelineCellMarkdownCreateAttributes cellType(
      IncidentTimelineCellMarkdownContentType cellType) {
    this.cellType = cellType;
    this.unparsed |= !cellType.isValid();
    return this;
  }

  /**
   * Type of the Markdown timeline cell.
   *
   * @return cellType
   */
  @JsonProperty(JSON_PROPERTY_CELL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineCellMarkdownContentType getCellType() {
    return cellType;
  }

  public void setCellType(IncidentTimelineCellMarkdownContentType cellType) {
    if (!cellType.isValid()) {
      this.unparsed = true;
    }
    this.cellType = cellType;
  }

  public IncidentTimelineCellMarkdownCreateAttributes content(
      IncidentTimelineCellMarkdownCreateAttributesContent content) {
    this.content = content;
    this.unparsed |= content.unparsed;
    return this;
  }

  /**
   * The Markdown timeline cell contents.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTimelineCellMarkdownCreateAttributesContent getContent() {
    return content;
  }

  public void setContent(IncidentTimelineCellMarkdownCreateAttributesContent content) {
    this.content = content;
  }

  public IncidentTimelineCellMarkdownCreateAttributes important(Boolean important) {
    this.important = important;
    return this;
  }

  /**
   * A flag indicating whether the timeline cell is important and should be highlighted.
   *
   * @return important
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getImportant() {
    return important;
  }

  public void setImportant(Boolean important) {
    this.important = important;
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
   * @return IncidentTimelineCellMarkdownCreateAttributes
   */
  @JsonAnySetter
  public IncidentTimelineCellMarkdownCreateAttributes putAdditionalProperty(
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

  /** Return true if this IncidentTimelineCellMarkdownCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTimelineCellMarkdownCreateAttributes incidentTimelineCellMarkdownCreateAttributes =
        (IncidentTimelineCellMarkdownCreateAttributes) o;
    return Objects.equals(this.cellType, incidentTimelineCellMarkdownCreateAttributes.cellType)
        && Objects.equals(this.content, incidentTimelineCellMarkdownCreateAttributes.content)
        && Objects.equals(this.important, incidentTimelineCellMarkdownCreateAttributes.important)
        && Objects.equals(
            this.additionalProperties,
            incidentTimelineCellMarkdownCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cellType, content, important, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTimelineCellMarkdownCreateAttributes {\n");
    sb.append("    cellType: ").append(toIndentedString(cellType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
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
