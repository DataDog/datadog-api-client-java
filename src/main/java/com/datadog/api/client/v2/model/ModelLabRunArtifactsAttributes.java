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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Artifact listing for a Model Lab run. */
@JsonPropertyOrder({
  ModelLabRunArtifactsAttributes.JSON_PROPERTY_FILES,
  ModelLabRunArtifactsAttributes.JSON_PROPERTY_PATH_IN_PROJECT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabRunArtifactsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILES = "files";
  private List<ModelLabArtifactObjectInfo> files = new ArrayList<>();

  public static final String JSON_PROPERTY_PATH_IN_PROJECT = "path_in_project";
  private String pathInProject;

  public ModelLabRunArtifactsAttributes() {}

  @JsonCreator
  public ModelLabRunArtifactsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILES)
          List<ModelLabArtifactObjectInfo> files,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH_IN_PROJECT) String pathInProject) {
    this.files = files;
    this.pathInProject = pathInProject;
  }

  public ModelLabRunArtifactsAttributes files(List<ModelLabArtifactObjectInfo> files) {
    this.files = files;
    for (ModelLabArtifactObjectInfo item : files) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ModelLabRunArtifactsAttributes addFilesItem(ModelLabArtifactObjectInfo filesItem) {
    this.files.add(filesItem);
    this.unparsed |= filesItem.unparsed;
    return this;
  }

  /**
   * The list of artifact files and directories.
   *
   * @return files
   */
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ModelLabArtifactObjectInfo> getFiles() {
    return files;
  }

  public void setFiles(List<ModelLabArtifactObjectInfo> files) {
    this.files = files;
  }

  public ModelLabRunArtifactsAttributes pathInProject(String pathInProject) {
    this.pathInProject = pathInProject;
    return this;
  }

  /**
   * The path of the run's artifacts relative to the project's artifact root.
   *
   * @return pathInProject
   */
  @JsonProperty(JSON_PROPERTY_PATH_IN_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPathInProject() {
    return pathInProject;
  }

  public void setPathInProject(String pathInProject) {
    this.pathInProject = pathInProject;
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
   * @return ModelLabRunArtifactsAttributes
   */
  @JsonAnySetter
  public ModelLabRunArtifactsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabRunArtifactsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabRunArtifactsAttributes modelLabRunArtifactsAttributes =
        (ModelLabRunArtifactsAttributes) o;
    return Objects.equals(this.files, modelLabRunArtifactsAttributes.files)
        && Objects.equals(this.pathInProject, modelLabRunArtifactsAttributes.pathInProject)
        && Objects.equals(
            this.additionalProperties, modelLabRunArtifactsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, pathInProject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabRunArtifactsAttributes {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    pathInProject: ").append(toIndentedString(pathInProject)).append("\n");
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
