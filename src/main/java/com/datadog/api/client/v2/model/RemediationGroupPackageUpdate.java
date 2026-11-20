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

/**
 * A package to update in a repository, for a group of library vulnerabilities (<code>
 * sca.package_update</code>). The group gathers the open vulnerabilities of direct dependencies
 * that have a recommended fix, and groups them by <code>@git.repository_id</code>, <code>
 * @vulnerability.stack.ecosystem</code>, and <code>@remediation.recommended.name</code>.
 */
@JsonPropertyOrder({
  RemediationGroupPackageUpdate.JSON_PROPERTY_ADVISORY_COUNT,
  RemediationGroupPackageUpdate.JSON_PROPERTY_ECOSYSTEM,
  RemediationGroupPackageUpdate.JSON_PROPERTY_EXPLOITABLE_CVE_COUNT,
  RemediationGroupPackageUpdate.JSON_PROPERTY_FILE_COUNT,
  RemediationGroupPackageUpdate.JSON_PROPERTY_PACKAGE_NAME,
  RemediationGroupPackageUpdate.JSON_PROPERTY_REPOSITORY_ID,
  RemediationGroupPackageUpdate.JSON_PROPERTY_TARGET_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupPackageUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADVISORY_COUNT = "advisory_count";
  private Long advisoryCount;

  public static final String JSON_PROPERTY_ECOSYSTEM = "ecosystem";
  private String ecosystem;

  public static final String JSON_PROPERTY_EXPLOITABLE_CVE_COUNT = "exploitable_cve_count";
  private Long exploitableCveCount;

  public static final String JSON_PROPERTY_FILE_COUNT = "file_count";
  private Long fileCount;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "package_name";
  private String packageName;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_TARGET_VERSION = "target_version";
  private String targetVersion;

  public RemediationGroupPackageUpdate() {}

  @JsonCreator
  public RemediationGroupPackageUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_ADVISORY_COUNT) Long advisoryCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_ECOSYSTEM) String ecosystem,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPLOITABLE_CVE_COUNT)
          Long exploitableCveCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE_COUNT) Long fileCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_PACKAGE_NAME) String packageName,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPOSITORY_ID) String repositoryId) {
    this.advisoryCount = advisoryCount;
    this.ecosystem = ecosystem;
    this.exploitableCveCount = exploitableCveCount;
    this.fileCount = fileCount;
    this.packageName = packageName;
    this.repositoryId = repositoryId;
  }

  public RemediationGroupPackageUpdate advisoryCount(Long advisoryCount) {
    this.advisoryCount = advisoryCount;
    return this;
  }

  /**
   * Number of distinct values of <code>@advisory.id</code> across the group's findings.
   *
   * @return advisoryCount
   */
  @JsonProperty(JSON_PROPERTY_ADVISORY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAdvisoryCount() {
    return advisoryCount;
  }

  public void setAdvisoryCount(Long advisoryCount) {
    this.advisoryCount = advisoryCount;
  }

  public RemediationGroupPackageUpdate ecosystem(String ecosystem) {
    this.ecosystem = ecosystem;
    return this;
  }

  /**
   * Package ecosystem, the findings' <code>@vulnerability.stack.ecosystem</code>.
   *
   * @return ecosystem
   */
  @JsonProperty(JSON_PROPERTY_ECOSYSTEM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEcosystem() {
    return ecosystem;
  }

  public void setEcosystem(String ecosystem) {
    this.ecosystem = ecosystem;
  }

  public RemediationGroupPackageUpdate exploitableCveCount(Long exploitableCveCount) {
    this.exploitableCveCount = exploitableCveCount;
    return this;
  }

  /**
   * Number of distinct values of <code>@advisory.id</code> across the group's findings that have
   * <code>@risk.has_exploit_available</code> set to <code>true</code>.
   *
   * @return exploitableCveCount
   */
  @JsonProperty(JSON_PROPERTY_EXPLOITABLE_CVE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getExploitableCveCount() {
    return exploitableCveCount;
  }

  public void setExploitableCveCount(Long exploitableCveCount) {
    this.exploitableCveCount = exploitableCveCount;
  }

  public RemediationGroupPackageUpdate fileCount(Long fileCount) {
    this.fileCount = fileCount;
    return this;
  }

  /**
   * Number of distinct values of <code>@package.declaration.block.filename</code>, the files that
   * declare the package.
   *
   * @return fileCount
   */
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFileCount() {
    return fileCount;
  }

  public void setFileCount(Long fileCount) {
    this.fileCount = fileCount;
  }

  public RemediationGroupPackageUpdate packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Name of the package to update, the findings' <code>@remediation.recommended.name</code>.
   *
   * @return packageName
   */
  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public RemediationGroupPackageUpdate repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * Repository that depends on the package, the findings' <code>@git.repository_id</code>.
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

  public RemediationGroupPackageUpdate targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Version to update the package to, the highest <code>@remediation.recommended.version</code>
   * across the group's findings. Omitted when no version is recommended or when the recommended
   * versions can't be ordered.
   *
   * @return targetVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
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
   * @return RemediationGroupPackageUpdate
   */
  @JsonAnySetter
  public RemediationGroupPackageUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupPackageUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupPackageUpdate remediationGroupPackageUpdate = (RemediationGroupPackageUpdate) o;
    return Objects.equals(this.advisoryCount, remediationGroupPackageUpdate.advisoryCount)
        && Objects.equals(this.ecosystem, remediationGroupPackageUpdate.ecosystem)
        && Objects.equals(
            this.exploitableCveCount, remediationGroupPackageUpdate.exploitableCveCount)
        && Objects.equals(this.fileCount, remediationGroupPackageUpdate.fileCount)
        && Objects.equals(this.packageName, remediationGroupPackageUpdate.packageName)
        && Objects.equals(this.repositoryId, remediationGroupPackageUpdate.repositoryId)
        && Objects.equals(this.targetVersion, remediationGroupPackageUpdate.targetVersion)
        && Objects.equals(
            this.additionalProperties, remediationGroupPackageUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        advisoryCount,
        ecosystem,
        exploitableCveCount,
        fileCount,
        packageName,
        repositoryId,
        targetVersion,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupPackageUpdate {\n");
    sb.append("    advisoryCount: ").append(toIndentedString(advisoryCount)).append("\n");
    sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
    sb.append("    exploitableCveCount: ")
        .append(toIndentedString(exploitableCveCount))
        .append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
