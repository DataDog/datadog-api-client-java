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

/** Location of a stack frame in a repository file. Empty when the source code is unavailable. */
@JsonPropertyOrder({
  IssueSampleGitFileLocation.JSON_PROPERTY_COLUMN,
  IssueSampleGitFileLocation.JSON_PROPERTY_FILEPATH,
  IssueSampleGitFileLocation.JSON_PROPERTY_FIRST_LINE,
  IssueSampleGitFileLocation.JSON_PROPERTY_LAST_LINE,
  IssueSampleGitFileLocation.JSON_PROPERTY_REF,
  IssueSampleGitFileLocation.JSON_PROPERTY_REPO_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueSampleGitFileLocation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN = "column";
  private Long column;

  public static final String JSON_PROPERTY_FILEPATH = "filepath";
  private String filepath;

  public static final String JSON_PROPERTY_FIRST_LINE = "first_line";
  private Long firstLine;

  public static final String JSON_PROPERTY_LAST_LINE = "last_line";
  private Long lastLine;

  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_REPO_ID = "repo_id";
  private String repoId;

  public IssueSampleGitFileLocation column(Long column) {
    this.column = column;
    return this;
  }

  /**
   * Column of the location, starting at 1.
   *
   * @return column
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getColumn() {
    return column;
  }

  public void setColumn(Long column) {
    this.column = column;
  }

  public IssueSampleGitFileLocation filepath(String filepath) {
    this.filepath = filepath;
    return this;
  }

  /**
   * Path of the file in the repository.
   *
   * @return filepath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILEPATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilepath() {
    return filepath;
  }

  public void setFilepath(String filepath) {
    this.filepath = filepath;
  }

  public IssueSampleGitFileLocation firstLine(Long firstLine) {
    this.firstLine = firstLine;
    return this;
  }

  /**
   * First line of the location, starting at 1.
   *
   * @return firstLine
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstLine() {
    return firstLine;
  }

  public void setFirstLine(Long firstLine) {
    this.firstLine = firstLine;
  }

  public IssueSampleGitFileLocation lastLine(Long lastLine) {
    this.lastLine = lastLine;
    return this;
  }

  /**
   * Last line of the location, starting at 1.
   *
   * @return lastLine
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastLine() {
    return lastLine;
  }

  public void setLastLine(Long lastLine) {
    this.lastLine = lastLine;
  }

  public IssueSampleGitFileLocation ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Git reference of the file, usually a commit SHA.
   *
   * @return ref
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public IssueSampleGitFileLocation repoId(String repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * Repository identifier.
   *
   * @return repoId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepoId() {
    return repoId;
  }

  public void setRepoId(String repoId) {
    this.repoId = repoId;
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
   * @return IssueSampleGitFileLocation
   */
  @JsonAnySetter
  public IssueSampleGitFileLocation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueSampleGitFileLocation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSampleGitFileLocation issueSampleGitFileLocation = (IssueSampleGitFileLocation) o;
    return Objects.equals(this.column, issueSampleGitFileLocation.column)
        && Objects.equals(this.filepath, issueSampleGitFileLocation.filepath)
        && Objects.equals(this.firstLine, issueSampleGitFileLocation.firstLine)
        && Objects.equals(this.lastLine, issueSampleGitFileLocation.lastLine)
        && Objects.equals(this.ref, issueSampleGitFileLocation.ref)
        && Objects.equals(this.repoId, issueSampleGitFileLocation.repoId)
        && Objects.equals(
            this.additionalProperties, issueSampleGitFileLocation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, filepath, firstLine, lastLine, ref, repoId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSampleGitFileLocation {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    filepath: ").append(toIndentedString(filepath)).append("\n");
    sb.append("    firstLine: ").append(toIndentedString(firstLine)).append("\n");
    sb.append("    lastLine: ").append(toIndentedString(lastLine)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
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
