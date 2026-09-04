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

/**
 * Attributes for requesting per-file code coverage data. Exactly one of <code>commit_sha</code>,
 * <code>branch</code>, or <code>pr_number</code> must be provided. At most one of <code>service
 * </code>, <code>codeowner</code>, or <code>flag</code> may be provided.
 */
@JsonPropertyOrder({
  FilesCoverageRequestAttributes.JSON_PROPERTY_BRANCH,
  FilesCoverageRequestAttributes.JSON_PROPERTY_CHANGED_ONLY,
  FilesCoverageRequestAttributes.JSON_PROPERTY_CODEOWNER,
  FilesCoverageRequestAttributes.JSON_PROPERTY_COMMIT_SHA,
  FilesCoverageRequestAttributes.JSON_PROPERTY_FLAG,
  FilesCoverageRequestAttributes.JSON_PROPERTY_PR_NUMBER,
  FilesCoverageRequestAttributes.JSON_PROPERTY_REPOSITORY_ID,
  FilesCoverageRequestAttributes.JSON_PROPERTY_REPOSITORY_URL,
  FilesCoverageRequestAttributes.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FilesCoverageRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_CHANGED_ONLY = "changed_only";
  private Boolean changedOnly;

  public static final String JSON_PROPERTY_CODEOWNER = "codeowner";
  private String codeowner;

  public static final String JSON_PROPERTY_COMMIT_SHA = "commit_sha";
  private String commitSha;

  public static final String JSON_PROPERTY_FLAG = "flag";
  private String flag;

  public static final String JSON_PROPERTY_PR_NUMBER = "pr_number";
  private Long prNumber;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_REPOSITORY_URL = "repository_url";
  private String repositoryUrl;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public FilesCoverageRequestAttributes branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * The branch name.
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

  public FilesCoverageRequestAttributes changedOnly(Boolean changedOnly) {
    this.changedOnly = changedOnly;
    return this;
  }

  /**
   * When true, return coverage data only for files that were changed in the specified scope.
   *
   * @return changedOnly
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGED_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getChangedOnly() {
    return changedOnly;
  }

  public void setChangedOnly(Boolean changedOnly) {
    this.changedOnly = changedOnly;
  }

  public FilesCoverageRequestAttributes codeowner(String codeowner) {
    this.codeowner = codeowner;
    return this;
  }

  /**
   * Filter coverage by code owner. At most one of <code>service</code>, <code>codeowner</code>, or
   * <code>flag</code> may be provided.
   *
   * @return codeowner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODEOWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCodeowner() {
    return codeowner;
  }

  public void setCodeowner(String codeowner) {
    this.codeowner = codeowner;
  }

  public FilesCoverageRequestAttributes commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

  /**
   * The commit SHA (40-character hexadecimal string).
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

  public FilesCoverageRequestAttributes flag(String flag) {
    this.flag = flag;
    return this;
  }

  /**
   * Filter coverage by coverage flag. At most one of <code>service</code>, <code>codeowner</code>,
   * or <code>flag</code> may be provided.
   *
   * @return flag
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  public FilesCoverageRequestAttributes prNumber(Long prNumber) {
    this.prNumber = prNumber;
    return this;
  }

  /**
   * The pull request number. Must be a positive integer. minimum: 1
   *
   * @return prNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PR_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPrNumber() {
    return prNumber;
  }

  public void setPrNumber(Long prNumber) {
    this.prNumber = prNumber;
  }

  public FilesCoverageRequestAttributes repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * Deprecated: use <code>repository_url</code> instead. The repository URL.
   *
   * @return repositoryId
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryId() {
    return repositoryId;
  }

  @Deprecated
  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public FilesCoverageRequestAttributes repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * The repository URL. Accepts a full URL with or without a scheme (for example, <code>
   * https://github.com/org/repo</code> or <code>github.com/org/repo</code>).
   *
   * @return repositoryUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public FilesCoverageRequestAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Filter coverage by service name. At most one of <code>service</code>, <code>codeowner</code>,
   * or <code>flag</code> may be provided.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
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
   * @return FilesCoverageRequestAttributes
   */
  @JsonAnySetter
  public FilesCoverageRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FilesCoverageRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilesCoverageRequestAttributes filesCoverageRequestAttributes =
        (FilesCoverageRequestAttributes) o;
    return Objects.equals(this.branch, filesCoverageRequestAttributes.branch)
        && Objects.equals(this.changedOnly, filesCoverageRequestAttributes.changedOnly)
        && Objects.equals(this.codeowner, filesCoverageRequestAttributes.codeowner)
        && Objects.equals(this.commitSha, filesCoverageRequestAttributes.commitSha)
        && Objects.equals(this.flag, filesCoverageRequestAttributes.flag)
        && Objects.equals(this.prNumber, filesCoverageRequestAttributes.prNumber)
        && Objects.equals(this.repositoryId, filesCoverageRequestAttributes.repositoryId)
        && Objects.equals(this.repositoryUrl, filesCoverageRequestAttributes.repositoryUrl)
        && Objects.equals(this.service, filesCoverageRequestAttributes.service)
        && Objects.equals(
            this.additionalProperties, filesCoverageRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        branch,
        changedOnly,
        codeowner,
        commitSha,
        flag,
        prNumber,
        repositoryId,
        repositoryUrl,
        service,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilesCoverageRequestAttributes {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    changedOnly: ").append(toIndentedString(changedOnly)).append("\n");
    sb.append("    codeowner: ").append(toIndentedString(codeowner)).append("\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    prNumber: ").append(toIndentedString(prNumber)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
