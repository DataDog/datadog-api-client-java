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

/** A repository and its files that reference the feature flag. */
@JsonPropertyOrder({
  FeatureFlagStalenessCodeReference.JSON_PROPERTY_FILES,
  FeatureFlagStalenessCodeReference.JSON_PROPERTY_REPO_URL,
  FeatureFlagStalenessCodeReference.JSON_PROPERTY_SCM_REPOSITORY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagStalenessCodeReference {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILES = "files";
  private List<String> files = null;

  public static final String JSON_PROPERTY_REPO_URL = "repo_url";
  private String repoUrl;

  public static final String JSON_PROPERTY_SCM_REPOSITORY_ID = "scm_repository_id";
  private String scmRepositoryId;

  public FeatureFlagStalenessCodeReference files(List<String> files) {
    this.files = files;
    return this;
  }

  public FeatureFlagStalenessCodeReference addFilesItem(String filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Paths of files that reference the feature flag in this repository.
   *
   * @return files
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getFiles() {
    return files;
  }

  public void setFiles(List<String> files) {
    this.files = files;
  }

  public FeatureFlagStalenessCodeReference repoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
    return this;
  }

  /**
   * The URL of the source code repository, when available.
   *
   * @return repoUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepoUrl() {
    return repoUrl;
  }

  public void setRepoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
  }

  public FeatureFlagStalenessCodeReference scmRepositoryId(String scmRepositoryId) {
    this.scmRepositoryId = scmRepositoryId;
    return this;
  }

  /**
   * The identifier of the source code repository.
   *
   * @return scmRepositoryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCM_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScmRepositoryId() {
    return scmRepositoryId;
  }

  public void setScmRepositoryId(String scmRepositoryId) {
    this.scmRepositoryId = scmRepositoryId;
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
   * @return FeatureFlagStalenessCodeReference
   */
  @JsonAnySetter
  public FeatureFlagStalenessCodeReference putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagStalenessCodeReference object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagStalenessCodeReference featureFlagStalenessCodeReference =
        (FeatureFlagStalenessCodeReference) o;
    return Objects.equals(this.files, featureFlagStalenessCodeReference.files)
        && Objects.equals(this.repoUrl, featureFlagStalenessCodeReference.repoUrl)
        && Objects.equals(this.scmRepositoryId, featureFlagStalenessCodeReference.scmRepositoryId)
        && Objects.equals(
            this.additionalProperties, featureFlagStalenessCodeReference.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, repoUrl, scmRepositoryId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagStalenessCodeReference {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
    sb.append("    scmRepositoryId: ").append(toIndentedString(scmRepositoryId)).append("\n");
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
