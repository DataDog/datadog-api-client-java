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

/** A nullable range within a file defined by a start and end position, along with the file name. */
@JsonPropertyOrder({
  ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.JSON_PROPERTY_END,
  ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition
      .JSON_PROPERTY_FILE_NAME,
  ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.JSON_PROPERTY_ROLE,
  ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition end;

  public static final String JSON_PROPERTY_FILE_NAME = "file_name";
  private String fileName;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_START = "start";
  private ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition start;

  public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition end(
      ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition end) {
    this.end = end;
    this.unparsed |= end.unparsed;
    return this;
  }

  /**
   * A specific position (line and column) within a source file.
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition getEnd() {
    return end;
  }

  public void setEnd(ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition end) {
    this.end = end;
    if (end != null) {
      this.unparsed |= end.unparsed;
    }
  }

  public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition fileName(
      String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name or path of the file containing this location.
   *
   * @return fileName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition role(
      String role) {
    this.role = role;
    return this;
  }

  /**
   * The semantic role associated with this file location.
   *
   * @return role
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition start(
      ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition start) {
    this.start = start;
    this.unparsed |= start.unparsed;
    return this;
  }

  /**
   * A specific position (line and column) within a source file.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition getStart() {
    return start;
  }

  public void setStart(ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition start) {
    this.start = start;
    if (start != null) {
      this.unparsed |= start.unparsed;
    }
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
   * @return ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition
   */
  @JsonAnySetter
  public ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition
        scaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition =
            (ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition) o;
    return Objects.equals(
            this.end,
            scaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.end)
        && Objects.equals(
            this.fileName,
            scaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.fileName)
        && Objects.equals(
            this.role,
            scaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.role)
        && Objects.equals(
            this.start,
            scaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition.start)
        && Objects.equals(
            this.additionalProperties,
            scaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, fileName, role, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ScaRequestDataAttributesDependenciesItemsLocationsItemsNullableFilePosition {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
