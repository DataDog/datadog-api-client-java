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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Per-file line coverage data including executable, covered, and added lines. */
@JsonPropertyOrder({
  FileCoverageLines.JSON_PROPERTY_ADDED_LINES,
  FileCoverageLines.JSON_PROPERTY_COVERED_LINES,
  FileCoverageLines.JSON_PROPERTY_EXECUTABLE_LINES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FileCoverageLines {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDED_LINES = "added_lines";
  private List<Long> addedLines = null;

  public static final String JSON_PROPERTY_COVERED_LINES = "covered_lines";
  private List<Long> coveredLines = null;

  public static final String JSON_PROPERTY_EXECUTABLE_LINES = "executable_lines";
  private List<Long> executableLines = null;

  public FileCoverageLines addedLines(List<Long> addedLines) {
    this.addedLines = addedLines;
    return this;
  }

  public FileCoverageLines addAddedLinesItem(Long addedLinesItem) {
    if (this.addedLines == null) {
      this.addedLines = new ArrayList<>();
    }
    this.addedLines.add(addedLinesItem);
    return this;
  }

  /**
   * Line numbers that were added in the specified scope (for example, in a PR diff).
   *
   * @return addedLines
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDED_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getAddedLines() {
    return addedLines;
  }

  public void setAddedLines(List<Long> addedLines) {
    this.addedLines = addedLines;
  }

  public FileCoverageLines coveredLines(List<Long> coveredLines) {
    this.coveredLines = coveredLines;
    return this;
  }

  public FileCoverageLines addCoveredLinesItem(Long coveredLinesItem) {
    if (this.coveredLines == null) {
      this.coveredLines = new ArrayList<>();
    }
    this.coveredLines.add(coveredLinesItem);
    return this;
  }

  /**
   * Line numbers that were covered by tests.
   *
   * @return coveredLines
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERED_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getCoveredLines() {
    return coveredLines;
  }

  public void setCoveredLines(List<Long> coveredLines) {
    this.coveredLines = coveredLines;
  }

  public FileCoverageLines executableLines(List<Long> executableLines) {
    this.executableLines = executableLines;
    return this;
  }

  public FileCoverageLines addExecutableLinesItem(Long executableLinesItem) {
    if (this.executableLines == null) {
      this.executableLines = new ArrayList<>();
    }
    this.executableLines.add(executableLinesItem);
    return this;
  }

  /**
   * Line numbers that are executable (can be covered).
   *
   * @return executableLines
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTABLE_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Long> getExecutableLines() {
    return executableLines;
  }

  public void setExecutableLines(List<Long> executableLines) {
    this.executableLines = executableLines;
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
   * @return FileCoverageLines
   */
  @JsonAnySetter
  public FileCoverageLines putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FileCoverageLines object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileCoverageLines fileCoverageLines = (FileCoverageLines) o;
    return Objects.equals(this.addedLines, fileCoverageLines.addedLines)
        && Objects.equals(this.coveredLines, fileCoverageLines.coveredLines)
        && Objects.equals(this.executableLines, fileCoverageLines.executableLines)
        && Objects.equals(this.additionalProperties, fileCoverageLines.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedLines, coveredLines, executableLines, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileCoverageLines {\n");
    sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
    sb.append("    coveredLines: ").append(toIndentedString(coveredLines)).append("\n");
    sb.append("    executableLines: ").append(toIndentedString(executableLines)).append("\n");
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
