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

/** Response attributes of an AI prompt. */
@JsonPropertyOrder({
  AiPromptResponseAttributes.JSON_PROPERTY_CATEGORY,
  AiPromptResponseAttributes.JSON_PROPERTY_CHECKSUM,
  AiPromptResponseAttributes.JSON_PROPERTY_CONTENT,
  AiPromptResponseAttributes.JSON_PROPERTY_CWE,
  AiPromptResponseAttributes.JSON_PROPERTY_DESCRIPTION,
  AiPromptResponseAttributes.JSON_PROPERTY_DIRECTORIES,
  AiPromptResponseAttributes.JSON_PROPERTY_EXECUTION_MODE,
  AiPromptResponseAttributes.JSON_PROPERTY_FILE_SEARCH_KEYWORDS,
  AiPromptResponseAttributes.JSON_PROPERTY_GLOBS,
  AiPromptResponseAttributes.JSON_PROPERTY_IS_DEFAULT,
  AiPromptResponseAttributes.JSON_PROPERTY_IS_TESTING,
  AiPromptResponseAttributes.JSON_PROPERTY_LANGUAGE,
  AiPromptResponseAttributes.JSON_PROPERTY_RESULT_KEYWORDS_EXCLUDE,
  AiPromptResponseAttributes.JSON_PROPERTY_RULE_VERSION,
  AiPromptResponseAttributes.JSON_PROPERTY_SEVERITY,
  AiPromptResponseAttributes.JSON_PROPERTY_SHORT_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiPromptResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CustomRuleRevisionAttributesCategory category;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private String cwe;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DIRECTORIES = "directories";
  private List<String> directories = new ArrayList<>();

  public static final String JSON_PROPERTY_EXECUTION_MODE = "execution_mode";
  private AiCustomRuleRevisionExecutionMode executionMode;

  public static final String JSON_PROPERTY_FILE_SEARCH_KEYWORDS = "file_search_keywords";
  private List<String> fileSearchKeywords = new ArrayList<>();

  public static final String JSON_PROPERTY_GLOBS = "globs";
  private List<String> globs = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_DEFAULT = "is_default";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_TESTING = "is_testing";
  private Boolean isTesting;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private Language language;

  public static final String JSON_PROPERTY_RESULT_KEYWORDS_EXCLUDE = "result_keywords_exclude";
  private List<String> resultKeywordsExclude = new ArrayList<>();

  public static final String JSON_PROPERTY_RULE_VERSION = "rule_version";
  private String ruleVersion;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private CustomRuleRevisionAttributesSeverity severity;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public AiPromptResponseAttributes() {}

  @JsonCreator
  public AiPromptResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          CustomRuleRevisionAttributesCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIRECTORIES) List<String> directories,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXECUTION_MODE)
          AiCustomRuleRevisionExecutionMode executionMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE_SEARCH_KEYWORDS)
          List<String> fileSearchKeywords,
      @JsonProperty(required = true, value = JSON_PROPERTY_GLOBS) List<String> globs,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DEFAULT) Boolean isDefault,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TESTING) Boolean isTesting,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULT_KEYWORDS_EXCLUDE)
          List<String> resultKeywordsExclude,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_VERSION) String ruleVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          CustomRuleRevisionAttributesSeverity severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_DESCRIPTION)
          String shortDescription) {
    this.category = category;
    this.unparsed |= !category.isValid();
    this.checksum = checksum;
    this.content = content;
    this.description = description;
    this.directories = directories;
    this.executionMode = executionMode;
    this.unparsed |= !executionMode.isValid();
    this.fileSearchKeywords = fileSearchKeywords;
    this.globs = globs;
    this.isDefault = isDefault;
    this.isTesting = isTesting;
    this.resultKeywordsExclude = resultKeywordsExclude;
    this.ruleVersion = ruleVersion;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.shortDescription = shortDescription;
  }

  public AiPromptResponseAttributes category(CustomRuleRevisionAttributesCategory category) {
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

  public AiPromptResponseAttributes checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Checksum of the prompt content.
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

  public AiPromptResponseAttributes content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Base64-encoded AI prompt content.
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

  public AiPromptResponseAttributes cwe(String cwe) {
    this.cwe = cwe;
    return this;
  }

  /**
   * The CWE identifier associated with this prompt.
   *
   * @return cwe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CWE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCwe() {
    return cwe;
  }

  public void setCwe(String cwe) {
    this.cwe = cwe;
  }

  public AiPromptResponseAttributes description(String description) {
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

  public AiPromptResponseAttributes directories(List<String> directories) {
    this.directories = directories;
    return this;
  }

  public AiPromptResponseAttributes addDirectoriesItem(String directoriesItem) {
    this.directories.add(directoriesItem);
    return this;
  }

  /**
   * Directory patterns this prompt applies to.
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

  public AiPromptResponseAttributes executionMode(AiCustomRuleRevisionExecutionMode executionMode) {
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

  public AiPromptResponseAttributes fileSearchKeywords(List<String> fileSearchKeywords) {
    this.fileSearchKeywords = fileSearchKeywords;
    return this;
  }

  public AiPromptResponseAttributes addFileSearchKeywordsItem(String fileSearchKeywordsItem) {
    this.fileSearchKeywords.add(fileSearchKeywordsItem);
    return this;
  }

  /**
   * Keywords used to search for relevant files.
   *
   * @return fileSearchKeywords
   */
  @JsonProperty(JSON_PROPERTY_FILE_SEARCH_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFileSearchKeywords() {
    return fileSearchKeywords;
  }

  public void setFileSearchKeywords(List<String> fileSearchKeywords) {
    this.fileSearchKeywords = fileSearchKeywords;
  }

  public AiPromptResponseAttributes globs(List<String> globs) {
    this.globs = globs;
    return this;
  }

  public AiPromptResponseAttributes addGlobsItem(String globsItem) {
    this.globs.add(globsItem);
    return this;
  }

  /**
   * File glob patterns this prompt applies to.
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

  public AiPromptResponseAttributes isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether this is a default Datadog prompt.
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

  public AiPromptResponseAttributes isTesting(Boolean isTesting) {
    this.isTesting = isTesting;
    return this;
  }

  /**
   * Whether this prompt is for testing only.
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

  public AiPromptResponseAttributes language(Language language) {
    this.language = language;
    this.unparsed |= !language.isValid();
    return this;
  }

  /**
   * Programming language
   *
   * @return language
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    if (!language.isValid()) {
      this.unparsed = true;
    }
    this.language = language;
  }

  public AiPromptResponseAttributes resultKeywordsExclude(List<String> resultKeywordsExclude) {
    this.resultKeywordsExclude = resultKeywordsExclude;
    return this;
  }

  public AiPromptResponseAttributes addResultKeywordsExcludeItem(String resultKeywordsExcludeItem) {
    this.resultKeywordsExclude.add(resultKeywordsExcludeItem);
    return this;
  }

  /**
   * Keywords to exclude from results.
   *
   * @return resultKeywordsExclude
   */
  @JsonProperty(JSON_PROPERTY_RESULT_KEYWORDS_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getResultKeywordsExclude() {
    return resultKeywordsExclude;
  }

  public void setResultKeywordsExclude(List<String> resultKeywordsExclude) {
    this.resultKeywordsExclude = resultKeywordsExclude;
  }

  public AiPromptResponseAttributes ruleVersion(String ruleVersion) {
    this.ruleVersion = ruleVersion;
    return this;
  }

  /**
   * The version of the rule this prompt is associated with.
   *
   * @return ruleVersion
   */
  @JsonProperty(JSON_PROPERTY_RULE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleVersion() {
    return ruleVersion;
  }

  public void setRuleVersion(String ruleVersion) {
    this.ruleVersion = ruleVersion;
  }

  public AiPromptResponseAttributes severity(CustomRuleRevisionAttributesSeverity severity) {
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

  public AiPromptResponseAttributes shortDescription(String shortDescription) {
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
   * @return AiPromptResponseAttributes
   */
  @JsonAnySetter
  public AiPromptResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiPromptResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiPromptResponseAttributes aiPromptResponseAttributes = (AiPromptResponseAttributes) o;
    return Objects.equals(this.category, aiPromptResponseAttributes.category)
        && Objects.equals(this.checksum, aiPromptResponseAttributes.checksum)
        && Objects.equals(this.content, aiPromptResponseAttributes.content)
        && Objects.equals(this.cwe, aiPromptResponseAttributes.cwe)
        && Objects.equals(this.description, aiPromptResponseAttributes.description)
        && Objects.equals(this.directories, aiPromptResponseAttributes.directories)
        && Objects.equals(this.executionMode, aiPromptResponseAttributes.executionMode)
        && Objects.equals(this.fileSearchKeywords, aiPromptResponseAttributes.fileSearchKeywords)
        && Objects.equals(this.globs, aiPromptResponseAttributes.globs)
        && Objects.equals(this.isDefault, aiPromptResponseAttributes.isDefault)
        && Objects.equals(this.isTesting, aiPromptResponseAttributes.isTesting)
        && Objects.equals(this.language, aiPromptResponseAttributes.language)
        && Objects.equals(
            this.resultKeywordsExclude, aiPromptResponseAttributes.resultKeywordsExclude)
        && Objects.equals(this.ruleVersion, aiPromptResponseAttributes.ruleVersion)
        && Objects.equals(this.severity, aiPromptResponseAttributes.severity)
        && Objects.equals(this.shortDescription, aiPromptResponseAttributes.shortDescription)
        && Objects.equals(
            this.additionalProperties, aiPromptResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        checksum,
        content,
        cwe,
        description,
        directories,
        executionMode,
        fileSearchKeywords,
        globs,
        isDefault,
        isTesting,
        language,
        resultKeywordsExclude,
        ruleVersion,
        severity,
        shortDescription,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiPromptResponseAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
    sb.append("    fileSearchKeywords: ").append(toIndentedString(fileSearchKeywords)).append("\n");
    sb.append("    globs: ").append(toIndentedString(globs)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isTesting: ").append(toIndentedString(isTesting)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    resultKeywordsExclude: ")
        .append(toIndentedString(resultKeywordsExclude))
        .append("\n");
    sb.append("    ruleVersion: ").append(toIndentedString(ruleVersion)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
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
