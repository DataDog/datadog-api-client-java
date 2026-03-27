/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
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
   * <p>Static library vulnerability location.</p>
 */
@JsonPropertyOrder({
  DependencyLocation.JSON_PROPERTY_COLUMN_END,
  DependencyLocation.JSON_PROPERTY_COLUMN_START,
  DependencyLocation.JSON_PROPERTY_FILE_NAME,
  DependencyLocation.JSON_PROPERTY_LINE_END,
  DependencyLocation.JSON_PROPERTY_LINE_START
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DependencyLocation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_END = "column_end";
  private Long columnEnd;

  public static final String JSON_PROPERTY_COLUMN_START = "column_start";
  private Long columnStart;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_LINE_END = "line_end";
  private Long lineEnd;

  public static final String JSON_PROPERTY_LINE_START = "line_start";
  private Long lineStart;

  public DependencyLocation() {}

  @JsonCreator
  public DependencyLocation(
            @JsonProperty(required=true, value=JSON_PROPERTY_COLUMN_END)Long columnEnd,
            @JsonProperty(required=true, value=JSON_PROPERTY_COLUMN_START)Long columnStart,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILE_NAME)String fileName,
            @JsonProperty(required=true, value=JSON_PROPERTY_LINE_END)Long lineEnd,
            @JsonProperty(required=true, value=JSON_PROPERTY_LINE_START)Long lineStart) {
        this.columnEnd = columnEnd;
        this.columnStart = columnStart;
        this.fileName = fileName;
        this.lineEnd = lineEnd;
        this.lineStart = lineStart;
  }
  public DependencyLocation columnEnd(Long columnEnd) {
    this.columnEnd = columnEnd;
    return this;
  }

  /**
   * <p>Location column end.</p>
   * @return columnEnd
  **/
      @JsonProperty(JSON_PROPERTY_COLUMN_END)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getColumnEnd() {
        return columnEnd;
      }
  public void setColumnEnd(Long columnEnd) {
    this.columnEnd = columnEnd;
  }
  public DependencyLocation columnStart(Long columnStart) {
    this.columnStart = columnStart;
    return this;
  }

  /**
   * <p>Location column start.</p>
   * @return columnStart
  **/
      @JsonProperty(JSON_PROPERTY_COLUMN_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getColumnStart() {
        return columnStart;
      }
  public void setColumnStart(Long columnStart) {
    this.columnStart = columnStart;
  }
  public DependencyLocation fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * <p>Location file name.</p>
   * @return fileName
  **/
      @JsonProperty(JSON_PROPERTY_FILE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFileName() {
        return fileName;
      }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  public DependencyLocation lineEnd(Long lineEnd) {
    this.lineEnd = lineEnd;
    return this;
  }

  /**
   * <p>Location line end.</p>
   * @return lineEnd
  **/
      @JsonProperty(JSON_PROPERTY_LINE_END)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getLineEnd() {
        return lineEnd;
      }
  public void setLineEnd(Long lineEnd) {
    this.lineEnd = lineEnd;
  }
  public DependencyLocation lineStart(Long lineStart) {
    this.lineStart = lineStart;
    return this;
  }

  /**
   * <p>Location line start.</p>
   * @return lineStart
  **/
      @JsonProperty(JSON_PROPERTY_LINE_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getLineStart() {
        return lineStart;
      }
  public void setLineStart(Long lineStart) {
    this.lineStart = lineStart;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return DependencyLocation
   */
  @JsonAnySetter
  public DependencyLocation putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this DependencyLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyLocation dependencyLocation = (DependencyLocation) o;
    return Objects.equals(this.columnEnd, dependencyLocation.columnEnd) && Objects.equals(this.columnStart, dependencyLocation.columnStart) && Objects.equals(this.fileName, dependencyLocation.fileName) && Objects.equals(this.lineEnd, dependencyLocation.lineEnd) && Objects.equals(this.lineStart, dependencyLocation.lineStart) && Objects.equals(this.additionalProperties, dependencyLocation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(columnEnd,columnStart,fileName,lineEnd,lineStart, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyLocation {\n");
    sb.append("    columnEnd: ").append(toIndentedString(columnEnd)).append("\n");
    sb.append("    columnStart: ").append(toIndentedString(columnStart)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineEnd: ").append(toIndentedString(lineEnd)).append("\n");
    sb.append("    lineStart: ").append(toIndentedString(lineStart)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
