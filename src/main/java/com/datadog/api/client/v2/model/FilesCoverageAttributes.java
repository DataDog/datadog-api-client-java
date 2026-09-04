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

/** Attributes of the per-file code coverage response. */
@JsonPropertyOrder({
  FilesCoverageAttributes.JSON_PROPERTY_BASE_COMMIT_SHA,
  FilesCoverageAttributes.JSON_PROPERTY_EVENT_TIMESTAMP,
  FilesCoverageAttributes.JSON_PROPERTY_FILES,
  FilesCoverageAttributes.JSON_PROPERTY_HEAD_COMMIT_SHA,
  FilesCoverageAttributes.JSON_PROPERTY_REPORT_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FilesCoverageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_COMMIT_SHA = "base_commit_sha";
  private String baseCommitSha;

  public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "event_timestamp";
  private Long eventTimestamp;

  public static final String JSON_PROPERTY_FILES = "files";
  private Map<String, FileCoverageLines> files = null;

  public static final String JSON_PROPERTY_HEAD_COMMIT_SHA = "head_commit_sha";
  private String headCommitSha;

  public static final String JSON_PROPERTY_REPORT_COUNT = "report_count";
  private Long reportCount;

  public FilesCoverageAttributes baseCommitSha(String baseCommitSha) {
    this.baseCommitSha = baseCommitSha;
    return this;
  }

  /**
   * The SHA of the base commit used for comparison (for example, the merge base for a PR).
   *
   * @return baseCommitSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_COMMIT_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBaseCommitSha() {
    return baseCommitSha;
  }

  public void setBaseCommitSha(String baseCommitSha) {
    this.baseCommitSha = baseCommitSha;
  }

  public FilesCoverageAttributes eventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

  /**
   * Unix timestamp (milliseconds) of the coverage event.
   *
   * @return eventTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public FilesCoverageAttributes files(Map<String, FileCoverageLines> files) {
    this.files = files;
    return this;
  }

  public FilesCoverageAttributes putFilesItem(String key, FileCoverageLines filesItem) {
    if (this.files == null) {
      this.files = new HashMap<>();
    }
    this.files.put(key, filesItem);
    return this;
  }

  /**
   * Map of file paths to per-file coverage line data.
   *
   * @return files
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, FileCoverageLines> getFiles() {
    return files;
  }

  public void setFiles(Map<String, FileCoverageLines> files) {
    this.files = files;
  }

  public FilesCoverageAttributes headCommitSha(String headCommitSha) {
    this.headCommitSha = headCommitSha;
    return this;
  }

  /**
   * The SHA of the head commit for which coverage was evaluated.
   *
   * @return headCommitSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAD_COMMIT_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHeadCommitSha() {
    return headCommitSha;
  }

  public void setHeadCommitSha(String headCommitSha) {
    this.headCommitSha = headCommitSha;
  }

  public FilesCoverageAttributes reportCount(Long reportCount) {
    this.reportCount = reportCount;
    return this;
  }

  /**
   * Number of coverage reports evaluated.
   *
   * @return reportCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReportCount() {
    return reportCount;
  }

  public void setReportCount(Long reportCount) {
    this.reportCount = reportCount;
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
   * @return FilesCoverageAttributes
   */
  @JsonAnySetter
  public FilesCoverageAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FilesCoverageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesCoverageAttributes filesCoverageAttributes = (FilesCoverageAttributes) o;
    return Objects.equals(this.baseCommitSha, filesCoverageAttributes.baseCommitSha)
        && Objects.equals(this.eventTimestamp, filesCoverageAttributes.eventTimestamp)
        && Objects.equals(this.files, filesCoverageAttributes.files)
        && Objects.equals(this.headCommitSha, filesCoverageAttributes.headCommitSha)
        && Objects.equals(this.reportCount, filesCoverageAttributes.reportCount)
        && Objects.equals(this.additionalProperties, filesCoverageAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        baseCommitSha, eventTimestamp, files, headCommitSha, reportCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesCoverageAttributes {\n");
    sb.append("    baseCommitSha: ").append(toIndentedString(baseCommitSha)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    headCommitSha: ").append(toIndentedString(headCommitSha)).append("\n");
    sb.append("    reportCount: ").append(toIndentedString(reportCount)).append("\n");
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
