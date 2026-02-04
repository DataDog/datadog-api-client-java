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

/** A notebook search result. */
@JsonPropertyOrder({
  NotebookSearchResultData.JSON_PROPERTY_HIGHLIGHT,
  NotebookSearchResultData.JSON_PROPERTY_ID,
  NotebookSearchResultData.JSON_PROPERTY_NOTEBOOK_DATA,
  NotebookSearchResultData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookSearchResultData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIGHLIGHT = "highlight";
  private NotebookSearchHighlight highlight;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NOTEBOOK_DATA = "notebook_data";
  private NotebookSearchAttributes notebookData;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricNotebookType type;

  public NotebookSearchResultData() {}

  @JsonCreator
  public NotebookSearchResultData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NOTEBOOK_DATA)
          NotebookSearchAttributes notebookData,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) MetricNotebookType type) {
    this.id = id;
    this.notebookData = notebookData;
    this.unparsed |= notebookData.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NotebookSearchResultData highlight(NotebookSearchHighlight highlight) {
    this.highlight = highlight;
    this.unparsed |= highlight.unparsed;
    return this;
  }

  /**
   * Highlighted fields from the notebook search.
   *
   * @return highlight
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGHLIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NotebookSearchHighlight getHighlight() {
    return highlight;
  }

  public void setHighlight(NotebookSearchHighlight highlight) {
    this.highlight = highlight;
  }

  public NotebookSearchResultData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Notebook identifier.
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

  public NotebookSearchResultData notebookData(NotebookSearchAttributes notebookData) {
    this.notebookData = notebookData;
    this.unparsed |= notebookData.unparsed;
    return this;
  }

  /**
   * Notebook search result attributes.
   *
   * @return notebookData
   */
  @JsonProperty(JSON_PROPERTY_NOTEBOOK_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookSearchAttributes getNotebookData() {
    return notebookData;
  }

  public void setNotebookData(NotebookSearchAttributes notebookData) {
    this.notebookData = notebookData;
  }

  public NotebookSearchResultData type(MetricNotebookType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Notebook resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricNotebookType getType() {
    return type;
  }

  public void setType(MetricNotebookType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return NotebookSearchResultData
   */
  @JsonAnySetter
  public NotebookSearchResultData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookSearchResultData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookSearchResultData notebookSearchResultData = (NotebookSearchResultData) o;
    return Objects.equals(this.highlight, notebookSearchResultData.highlight)
        && Objects.equals(this.id, notebookSearchResultData.id)
        && Objects.equals(this.notebookData, notebookSearchResultData.notebookData)
        && Objects.equals(this.type, notebookSearchResultData.type)
        && Objects.equals(this.additionalProperties, notebookSearchResultData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highlight, id, notebookData, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookSearchResultData {\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notebookData: ").append(toIndentedString(notebookData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
