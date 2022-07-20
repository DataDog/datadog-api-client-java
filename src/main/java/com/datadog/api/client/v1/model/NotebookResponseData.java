/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The data for a notebook. */
@JsonPropertyOrder({
  NotebookResponseData.JSON_PROPERTY_ATTRIBUTES,
  NotebookResponseData.JSON_PROPERTY_ID,
  NotebookResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private NotebookResponseDataAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotebookResourceType type = NotebookResourceType.NOTEBOOKS;

  public NotebookResponseData() {}

  @JsonCreator
  public NotebookResponseData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          NotebookResponseDataAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) Long id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) NotebookResourceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public NotebookResponseData attributes(NotebookResponseDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attributes of a notebook.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookResponseDataAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(NotebookResponseDataAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Unique notebook ID, assigned when you create the notebook.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getId() {
    return id;
  }

  public NotebookResponseData type(NotebookResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Notebook resource.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotebookResourceType getType() {
    return type;
  }

  public void setType(NotebookResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this NotebookResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookResponseData notebookResponseData = (NotebookResponseData) o;
    return Objects.equals(this.attributes, notebookResponseData.attributes)
        && Objects.equals(this.id, notebookResponseData.id)
        && Objects.equals(this.type, notebookResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
