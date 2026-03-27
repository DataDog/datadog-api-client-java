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

/** Attributes for requesting code coverage summary for a commit. */
@JsonPropertyOrder({
  CommitCoverageSummaryRequestAttributes.JSON_PROPERTY_COMMIT_SHA,
  CommitCoverageSummaryRequestAttributes.JSON_PROPERTY_REPOSITORY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitCoverageSummaryRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMMIT_SHA = "commit_sha";
  private String commitSha;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public CommitCoverageSummaryRequestAttributes() {}

  @JsonCreator
  public CommitCoverageSummaryRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMMIT_SHA) String commitSha,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPOSITORY_ID) String repositoryId) {
    this.commitSha = commitSha;
    this.repositoryId = repositoryId;
  }

  public CommitCoverageSummaryRequestAttributes commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * The commit SHA (40-character hexadecimal string).
   *
   * @return commitSha
   */
  @JsonProperty(JSON_PROPERTY_COMMIT_SHA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCommitSha() {
    return commitSha;
  }

  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }

  public CommitCoverageSummaryRequestAttributes repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * The repository identifier.
   *
   * @return repositoryId
   */
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
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
   * @return CommitCoverageSummaryRequestAttributes
   */
  @JsonAnySetter
  public CommitCoverageSummaryRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitCoverageSummaryRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitCoverageSummaryRequestAttributes commitCoverageSummaryRequestAttributes =
        (CommitCoverageSummaryRequestAttributes) o;
    return Objects.equals(this.commitSha, commitCoverageSummaryRequestAttributes.commitSha)
        && Objects.equals(this.repositoryId, commitCoverageSummaryRequestAttributes.repositoryId)
        && Objects.equals(
            this.additionalProperties, commitCoverageSummaryRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitSha, repositoryId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitCoverageSummaryRequestAttributes {\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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
