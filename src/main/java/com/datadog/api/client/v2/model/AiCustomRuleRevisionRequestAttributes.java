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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating an AI custom rule revision. */
@JsonPropertyOrder({
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_CATEGORY,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_CONTENT,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_CWE,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_DIRECTORIES,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_EXECUTION_MODE,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_GLOBS,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_IS_PUBLISHED,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_IS_TESTING,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_SEVERITY,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_SHORT_DESCRIPTION,
  AiCustomRuleRevisionRequestAttributes.JSON_PROPERTY_VERSION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiCustomRuleRevisionRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CustomRuleRevisionAttributesCategory category;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private JsonNullable<String> cwe = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DIRECTORIES = "directories";
  private List<String> directories = new ArrayList<>();

  public static final String JSON_PROPERTY_EXECUTION_MODE = "execution_mode";
  private AiCustomRuleRevisionExecutionMode executionMode;

  public static final String JSON_PROPERTY_GLOBS = "globs";
  private List<String> globs = new ArrayList<>();

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

  public AiCustomRuleRevisionRequestAttributes() {}

  @JsonCreator
  public AiCustomRuleRevisionRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          CustomRuleRevisionAttributesCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECTORIES) List<String> directories,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXECUTION_MODE)
          AiCustomRuleRevisionExecutionMode executionMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBS) List<String> globs,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PUBLISHED) Boolean isPublished,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TESTING) Boolean isTesting,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          CustomRuleRevisionAttributesSeverity severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_DESCRIPTION)
          String shortDescription) {
    this.category = category;
    this.unparsed |= !category.isValid();
    this.content = content;
    this.description = description;
    this.directories = directories;
    this.executionMode = executionMode;
    this.unparsed |= !executionMode.isValid();
    this.globs = globs;
    this.isPublished = isPublished;
    this.isTesting = isTesting;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.shortDescription = shortDescription;
  }

  public AiCustomRuleRevisionRequestAttributes category(
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

  public AiCustomRuleRevisionRequestAttributes content(String content) {
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

  public AiCustomRuleRevisionRequestAttributes cwe(String cwe) {
    this.cwe = JsonNullable.<String>of(cwe);
    return this;
  }

  /**
   * The associated CWE identifier.
   *
   * @return cwe
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCwe() {
    return cwe.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CWE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCwe_JsonNullable() {
    return cwe;
  }

  @JsonProperty(JSON_PROPERTY_CWE)
  public void setCwe_JsonNullable(JsonNullable<String> cwe) {
    this.cwe = cwe;
  }

  public void setCwe(String cwe) {
    this.cwe = JsonNullable.<String>of(cwe);
  }

  public AiCustomRuleRevisionRequestAttributes description(String description) {
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

  public AiCustomRuleRevisionRequestAttributes directories(List<String> directories) {
    this.directories = directories;
    return this;
  }

  public AiCustomRuleRevisionRequestAttributes addDirectoriesItem(String directoriesItem) {
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

  public AiCustomRuleRevisionRequestAttributes executionMode(
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

  public AiCustomRuleRevisionRequestAttributes globs(List<String> globs) {
    this.globs = globs;
    return this;
  }

  public AiCustomRuleRevisionRequestAttributes addGlobsItem(String globsItem) {
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

  public AiCustomRuleRevisionRequestAttributes isPublished(Boolean isPublished) {
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

  public AiCustomRuleRevisionRequestAttributes isTesting(Boolean isTesting) {
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

  public AiCustomRuleRevisionRequestAttributes severity(
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

  public AiCustomRuleRevisionRequestAttributes shortDescription(String shortDescription) {
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

  public AiCustomRuleRevisionRequestAttributes versionId(Long versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * The version identifier for this revision.
   *
   * @return versionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return AiCustomRuleRevisionRequestAttributes
   */
  @JsonAnySetter
  public AiCustomRuleRevisionRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiCustomRuleRevisionRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiCustomRuleRevisionRequestAttributes aiCustomRuleRevisionRequestAttributes =
        (AiCustomRuleRevisionRequestAttributes) o;
    return Objects.equals(this.category, aiCustomRuleRevisionRequestAttributes.category)
        && Objects.equals(this.content, aiCustomRuleRevisionRequestAttributes.content)
        && Objects.equals(this.cwe, aiCustomRuleRevisionRequestAttributes.cwe)
        && Objects.equals(this.description, aiCustomRuleRevisionRequestAttributes.description)
        && Objects.equals(this.directories, aiCustomRuleRevisionRequestAttributes.directories)
        && Objects.equals(this.executionMode, aiCustomRuleRevisionRequestAttributes.executionMode)
        && Objects.equals(this.globs, aiCustomRuleRevisionRequestAttributes.globs)
        && Objects.equals(this.isPublished, aiCustomRuleRevisionRequestAttributes.isPublished)
        && Objects.equals(this.isTesting, aiCustomRuleRevisionRequestAttributes.isTesting)
        && Objects.equals(this.severity, aiCustomRuleRevisionRequestAttributes.severity)
        && Objects.equals(
            this.shortDescription, aiCustomRuleRevisionRequestAttributes.shortDescription)
        && Objects.equals(this.versionId, aiCustomRuleRevisionRequestAttributes.versionId)
        && Objects.equals(
            this.additionalProperties, aiCustomRuleRevisionRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        content,
        cwe,
        description,
        directories,
        executionMode,
        globs,
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
    sb.append("class AiCustomRuleRevisionRequestAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
    sb.append("    globs: ").append(toIndentedString(globs)).append("\n");
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
