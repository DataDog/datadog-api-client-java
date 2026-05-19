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
import org.openapitools.jackson.nullable.JsonNullable;

/** Information about an artifact file or directory within a run. */
@JsonPropertyOrder({
  ModelLabArtifactObjectInfo.JSON_PROPERTY_FILE_SIZE,
  ModelLabArtifactObjectInfo.JSON_PROPERTY_IS_DIR,
  ModelLabArtifactObjectInfo.JSON_PROPERTY_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabArtifactObjectInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE_SIZE = "file_size";
  private JsonNullable<Long> fileSize = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_IS_DIR = "is_dir";
  private Boolean isDir;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public ModelLabArtifactObjectInfo() {}

  @JsonCreator
  public ModelLabArtifactObjectInfo(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DIR) Boolean isDir,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path) {
    this.isDir = isDir;
    this.path = path;
  }

  public ModelLabArtifactObjectInfo fileSize(Long fileSize) {
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

  public ModelLabArtifactObjectInfo isDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  /**
   * Whether this artifact entry is a directory.
   *
   * @return isDir
   */
  @JsonProperty(JSON_PROPERTY_IS_DIR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDir() {
    return isDir;
  }

  public void setIsDir(Boolean isDir) {
    this.isDir = isDir;
  }

  public ModelLabArtifactObjectInfo path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path of the artifact relative to the run's artifact root.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
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
   * @return ModelLabArtifactObjectInfo
   */
  @JsonAnySetter
  public ModelLabArtifactObjectInfo putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabArtifactObjectInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabArtifactObjectInfo modelLabArtifactObjectInfo = (ModelLabArtifactObjectInfo) o;
    return Objects.equals(this.fileSize, modelLabArtifactObjectInfo.fileSize)
        && Objects.equals(this.isDir, modelLabArtifactObjectInfo.isDir)
        && Objects.equals(this.path, modelLabArtifactObjectInfo.path)
        && Objects.equals(
            this.additionalProperties, modelLabArtifactObjectInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileSize, isDir, path, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabArtifactObjectInfo {\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    isDir: ").append(toIndentedString(isDir)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
