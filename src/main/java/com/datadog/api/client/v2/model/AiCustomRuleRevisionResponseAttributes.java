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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response attributes of an AI custom rule revision. */
@JsonPropertyOrder({
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_CATEGORY,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_CHECKSUM,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_CONTENT,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_CREATED_AT,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_CREATED_BY,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_CWE,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_DIRECTORIES,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_EXECUTION_MODE,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_GLOBS,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_IS_DEFAULT,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_IS_PUBLISHED,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_IS_TESTING,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_SEVERITY,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_SHORT_DESCRIPTION,
  AiCustomRuleRevisionResponseAttributes.JSON_PROPERTY_VERSION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiCustomRuleRevisionResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CustomRuleRevisionAttributesCategory category;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private String cwe;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DIRECTORIES = "directories";
  private List<String> directories = new ArrayList<>();

  public static final String JSON_PROPERTY_EXECUTION_MODE = "execution_mode";
  private AiCustomRuleRevisionExecutionMode executionMode;

  public static final String JSON_PROPERTY_GLOBS = "globs";
  private List<String> globs = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_PUBLISHED = "is_published";
  private Boolean isPublished;

  public static final String JSON_PROPERTY_IS_TESTING = "is_testing";
  private Boolean isTesting;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private CustomRuleRevisionAttributesSeverity severity;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public static final String JSON_PROPERTY_VERSION_ID = "version_id";
  private Long versionId;

  public AiCustomRuleRevisionResponseAttributes() {}

  @JsonCreator
  public AiCustomRuleRevisionResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          CustomRuleRevisionAttributesCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CWE) String cwe,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECTORIES) List<String> directories,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXECUTION_MODE)
          AiCustomRuleRevisionExecutionMode executionMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBS) List<String> globs,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEFAULT) Boolean isDefault,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PUBLISHED) Boolean isPublished,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TESTING) Boolean isTesting,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          CustomRuleRevisionAttributesSeverity severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_DESCRIPTION)
          String shortDescription,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION_ID) Long versionId) {
    this.category = category;
    this.unparsed |= !category.isValid();
    this.checksum = checksum;
    this.content = content;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.cwe = cwe;
    if (cwe != null) {}
    this.description = description;
    this.directories = directories;
    this.executionMode = executionMode;
    this.unparsed |= !executionMode.isValid();
    this.globs = globs;
    this.isDefault = isDefault;
    this.isPublished = isPublished;
    this.isTesting = isTesting;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.shortDescription = shortDescription;
    this.versionId = versionId;
  }

  public AiCustomRuleRevisionResponseAttributes category(
      CustomRuleRevisionAttributesCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * Rule category
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomRuleRevisionAttributesCategory getCategory() {
    return category;
  }

  public void setCategory(CustomRuleRevisionAttributesCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  public AiCustomRuleRevisionResponseAttributes checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Checksum of the revision content.
   *
   * @return checksum
   */
  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public AiCustomRuleRevisionResponseAttributes content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Base64-encoded AI model content for this revision.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public AiCustomRuleRevisionResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation timestamp.
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

  public AiCustomRuleRevisionResponseAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The identifier of the user who created the revision.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AiCustomRuleRevisionResponseAttributes cwe(String cwe) {
    this.cwe = cwe;
    if (cwe != null) {}
    return this;
  }

  /**
   * The associated CWE identifier.
   *
   * @return cwe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCwe() {
    return cwe;
  }

  public void setCwe(String cwe) {
    this.cwe = cwe;
  }

  public AiCustomRuleRevisionResponseAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Base64-encoded full description.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AiCustomRuleRevisionResponseAttributes directories(List<String> directories) {
    this.directories = directories;
    return this;
  }

  public AiCustomRuleRevisionResponseAttributes addDirectoriesItem(String directoriesItem) {
    this.directories.add(directoriesItem);
    return this;
  }

  /**
   * Directory patterns this rule applies to.
   *
   * @return directories
   */
  @JsonProperty(JSON_PROPERTY_DIRECTORIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getDirectories() {
    return directories;
  }

  public void setDirectories(List<String> directories) {
    this.directories = directories;
  }

  public AiCustomRuleRevisionResponseAttributes executionMode(
      AiCustomRuleRevisionExecutionMode executionMode) {
    this.executionMode = executionMode;
    this.unparsed |= !executionMode.isValid();
    return this;
  }

  /**
   * The execution mode for an AI rule revision.
   *
   * @return executionMode
   */
  @JsonProperty(JSON_PROPERTY_EXECUTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiCustomRuleRevisionExecutionMode getExecutionMode() {
    return executionMode;
  }

  public void setExecutionMode(AiCustomRuleRevisionExecutionMode executionMode) {
    if (!executionMode.isValid()) {
      this.unparsed = true;
    }
    this.executionMode = executionMode;
  }

  public AiCustomRuleRevisionResponseAttributes globs(List<String> globs) {
    this.globs = globs;
    return this;
  }

  public AiCustomRuleRevisionResponseAttributes addGlobsItem(String globsItem) {
    this.globs.add(globsItem);
    return this;
  }

  /**
   * File glob patterns this rule applies to.
   *
   * @return globs
   */
  @JsonProperty(JSON_PROPERTY_GLOBS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGlobs() {
    return globs;
  }

  public void setGlobs(List<String> globs) {
    this.globs = globs;
  }

  public AiCustomRuleRevisionResponseAttributes isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is a default Datadog rule.
   *
   * @return isDefault
   */
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public AiCustomRuleRevisionResponseAttributes isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Whether this revision is published.
   *
   * @return isPublished
   */
  @JsonProperty(JSON_PROPERTY_IS_PUBLISHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public AiCustomRuleRevisionResponseAttributes isTesting(Boolean isTesting) {
    this.isTesting = isTesting;
    return this;
  }

  /**
   * Whether this revision is for testing only.
   *
   * @return isTesting
   */
  @JsonProperty(JSON_PROPERTY_IS_TESTING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsTesting() {
    return isTesting;
  }

  public void setIsTesting(Boolean isTesting) {
    this.isTesting = isTesting;
  }

  public AiCustomRuleRevisionResponseAttributes severity(
      CustomRuleRevisionAttributesSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * Rule severity
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomRuleRevisionAttributesSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(CustomRuleRevisionAttributesSeverity severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
  }

  public AiCustomRuleRevisionResponseAttributes shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Base64-encoded short description.
   *
   * @return shortDescription
   */
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public AiCustomRuleRevisionResponseAttributes versionId(Long versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * The version identifier for this revision.
   *
   * @return versionId
   */
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersionId() {
    return versionId;
  }

  public void setVersionId(Long versionId) {
    this.versionId = versionId;
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
   * @return AiCustomRuleRevisionResponseAttributes
   */
  @JsonAnySetter
  public AiCustomRuleRevisionResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiCustomRuleRevisionResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiCustomRuleRevisionResponseAttributes aiCustomRuleRevisionResponseAttributes =
        (AiCustomRuleRevisionResponseAttributes) o;
    return Objects.equals(this.category, aiCustomRuleRevisionResponseAttributes.category)
        && Objects.equals(this.checksum, aiCustomRuleRevisionResponseAttributes.checksum)
        && Objects.equals(this.content, aiCustomRuleRevisionResponseAttributes.content)
        && Objects.equals(this.createdAt, aiCustomRuleRevisionResponseAttributes.createdAt)
        && Objects.equals(this.createdBy, aiCustomRuleRevisionResponseAttributes.createdBy)
        && Objects.equals(this.cwe, aiCustomRuleRevisionResponseAttributes.cwe)
        && Objects.equals(this.description, aiCustomRuleRevisionResponseAttributes.description)
        && Objects.equals(this.directories, aiCustomRuleRevisionResponseAttributes.directories)
        && Objects.equals(this.executionMode, aiCustomRuleRevisionResponseAttributes.executionMode)
        && Objects.equals(this.globs, aiCustomRuleRevisionResponseAttributes.globs)
        && Objects.equals(this.isDefault, aiCustomRuleRevisionResponseAttributes.isDefault)
        && Objects.equals(this.isPublished, aiCustomRuleRevisionResponseAttributes.isPublished)
        && Objects.equals(this.isTesting, aiCustomRuleRevisionResponseAttributes.isTesting)
        && Objects.equals(this.severity, aiCustomRuleRevisionResponseAttributes.severity)
        && Objects.equals(
            this.shortDescription, aiCustomRuleRevisionResponseAttributes.shortDescription)
        && Objects.equals(this.versionId, aiCustomRuleRevisionResponseAttributes.versionId)
        && Objects.equals(
            this.additionalProperties, aiCustomRuleRevisionResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        checksum,
        content,
        createdAt,
        createdBy,
        cwe,
        description,
        directories,
        executionMode,
        globs,
        isDefault,
        isPublished,
        isTesting,
        severity,
        shortDescription,
        versionId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiCustomRuleRevisionResponseAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
    sb.append("    globs: ").append(toIndentedString(globs)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    isTesting: ").append(toIndentedString(isTesting)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
