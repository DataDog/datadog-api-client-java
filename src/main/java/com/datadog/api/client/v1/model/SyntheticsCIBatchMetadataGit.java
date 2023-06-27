/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Git information. */
@JsonPropertyOrder({
  SyntheticsCIBatchMetadataGit.JSON_PROPERTY_BRANCH,
  SyntheticsCIBatchMetadataGit.JSON_PROPERTY_COMMIT_SHA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsCIBatchMetadataGit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_COMMIT_SHA = "commitSha";
  private String commitSha;

  public SyntheticsCIBatchMetadataGit branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Branch name.
   *
   * @return branch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public SyntheticsCIBatchMetadataGit commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * The commit SHA.
   *
   * @return commitSha
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMIT_SHA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCommitSha() {
    return commitSha;
  }

  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
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
   * @return SyntheticsCIBatchMetadataGit
   */
  @JsonAnySetter
  public SyntheticsCIBatchMetadataGit putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsCIBatchMetadataGit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsCIBatchMetadataGit syntheticsCiBatchMetadataGit = (SyntheticsCIBatchMetadataGit) o;
    return Objects.equals(this.branch, syntheticsCiBatchMetadataGit.branch)
        && Objects.equals(this.commitSha, syntheticsCiBatchMetadataGit.commitSha)
        && Objects.equals(
            this.additionalProperties, syntheticsCiBatchMetadataGit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, commitSha, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsCIBatchMetadataGit {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
