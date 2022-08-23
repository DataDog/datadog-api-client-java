/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The data for a notebook update request.</p>
 */
@JsonPropertyOrder({
  NotebookUpdateData.JSON_PROPERTY_ATTRIBUTES,
  NotebookUpdateData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookUpdateData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private NotebookUpdateDataAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private NotebookResourceType type = NotebookResourceType.NOTEBOOKS;

  public NotebookUpdateData() {}

  @JsonCreator
  public NotebookUpdateData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)NotebookUpdateDataAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)NotebookResourceType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public NotebookUpdateData attributes(NotebookUpdateDataAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>The data attributes of a notebook.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public NotebookUpdateDataAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(NotebookUpdateDataAttributes attributes) {
    this.attributes = attributes;
  }
  public NotebookUpdateData type(NotebookResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the Notebook resource.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public NotebookResourceType getType() {
        return type;
      }
  public void setType(NotebookResourceType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this NotebookUpdateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookUpdateData notebookUpdateData = (NotebookUpdateData) o;
    return Objects.equals(this.attributes, notebookUpdateData.attributes) && Objects.equals(this.type, notebookUpdateData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookUpdateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
