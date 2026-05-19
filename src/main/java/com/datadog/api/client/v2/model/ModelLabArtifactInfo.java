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
import org.openapitools.jackson.nullable.JsonNullable;

/** Information about a project-level artifact file. */
@JsonPropertyOrder({
  ModelLabArtifactInfo.JSON_PROPERTY_ARTIFACT_PATH,
  ModelLabArtifactInfo.JSON_PROPERTY_CREATED_AT,
  ModelLabArtifactInfo.JSON_PROPERTY_FILE_SIZE,
  ModelLabArtifactInfo.JSON_PROPERTY_FILENAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabArtifactInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARTIFACT_PATH = "artifact_path";
  private String artifactPath;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private JsonNullable<Long> fileSize = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public ModelLabArtifactInfo() {}

  @JsonCreator
  public ModelLabArtifactInfo(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARTIFACT_PATH) String artifactPath,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILENAME) String filename) {
    this.artifactPath = artifactPath;
    this.createdAt = createdAt;
    this.filename = filename;
  }

  public ModelLabArtifactInfo artifactPath(String artifactPath) {
    this.artifactPath = artifactPath;
    return this;
  }

  /**
   * The full artifact path relative to the project's artifact root.
   *
   * @return artifactPath
   */
  @JsonProperty(JSON_PROPERTY_ARTIFACT_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getArtifactPath() {
    return artifactPath;
  }

  public void setArtifactPath(String artifactPath) {
    this.artifactPath = artifactPath;
  }

  public ModelLabArtifactInfo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time the artifact was created.
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

  public ModelLabArtifactInfo fileSize(Long fileSize) {
    this.fileSize = JsonNullable.<Long>of(fileSize);
    return this;
  }

  /**
   * The size of the file in bytes.
   *
   * @return fileSize
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getFileSize() {
    return fileSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getFileSize_JsonNullable() {
    return fileSize;
  }

  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  public void setFileSize_JsonNullable(JsonNullable<Long> fileSize) {
    this.fileSize = fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = JsonNullable.<Long>of(fileSize);
  }

  public ModelLabArtifactInfo filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The filename of the artifact.
   *
   * @return filename
   */
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
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
   * @return ModelLabArtifactInfo
   */
  @JsonAnySetter
  public ModelLabArtifactInfo putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabArtifactInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabArtifactInfo modelLabArtifactInfo = (ModelLabArtifactInfo) o;
    return Objects.equals(this.artifactPath, modelLabArtifactInfo.artifactPath)
        && Objects.equals(this.createdAt, modelLabArtifactInfo.createdAt)
        && Objects.equals(this.fileSize, modelLabArtifactInfo.fileSize)
        && Objects.equals(this.filename, modelLabArtifactInfo.filename)
        && Objects.equals(this.additionalProperties, modelLabArtifactInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactPath, createdAt, fileSize, filename, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabArtifactInfo {\n");
    sb.append("    artifactPath: ").append(toIndentedString(artifactPath)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
