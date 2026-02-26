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

/** */
@JsonPropertyOrder({
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_ARGUMENTS,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_CATEGORY,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_CODE,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_CREATION_MESSAGE,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_CVE,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_CWE,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_DESCRIPTION,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_DOCUMENTATION_URL,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_IS_PUBLISHED,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_IS_TESTING,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_LANGUAGE,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_SEVERITY,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_SHORT_DESCRIPTION,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_SHOULD_USE_AI_FIX,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_TAGS,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_TESTS,
  CustomRuleRevisionInputAttributes.JSON_PROPERTY_TREE_SITTER_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomRuleRevisionInputAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private List<Argument> arguments = new ArrayList<>();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CustomRuleRevisionAttributesCategory category;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CREATION_MESSAGE = "creation_message";
  private String creationMessage;

  public static final String JSON_PROPERTY_CVE = "cve";
  private String cve;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private String cwe;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOCUMENTATION_URL = "documentation_url";
  private String documentationUrl;

  public static final String JSON_PROPERTY_IS_PUBLISHED = "is_published";
  private Boolean isPublished;

  public static final String JSON_PROPERTY_IS_TESTING = "is_testing";
  private Boolean isTesting;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private Language language;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private CustomRuleRevisionAttributesSeverity severity;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public static final String JSON_PROPERTY_SHOULD_USE_AI_FIX = "should_use_ai_fix";
  private Boolean shouldUseAiFix;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<CustomRuleRevisionTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_TREE_SITTER_QUERY = "tree_sitter_query";
  private String treeSitterQuery;

  public CustomRuleRevisionInputAttributes() {}

  @JsonCreator
  public CustomRuleRevisionInputAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARGUMENTS) List<Argument> arguments,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          CustomRuleRevisionAttributesCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CODE) String code,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATION_MESSAGE) String creationMessage,
      @JsonProperty(required = true, value = JSON_PROPERTY_CVE) String cve,
      @JsonProperty(required = true, value = JSON_PROPERTY_CWE) String cwe,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DOCUMENTATION_URL)
          String documentationUrl,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PUBLISHED) Boolean isPublished,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_TESTING) Boolean isTesting,
      @JsonProperty(required = true, value = JSON_PROPERTY_LANGUAGE) Language language,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          CustomRuleRevisionAttributesSeverity severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_DESCRIPTION)
          String shortDescription,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHOULD_USE_AI_FIX)
          Boolean shouldUseAiFix,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TESTS)
          List<CustomRuleRevisionTest> tests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TREE_SITTER_QUERY)
          String treeSitterQuery) {
    this.arguments = arguments;
    this.category = category;
    this.unparsed |= !category.isValid();
    this.code = code;
    this.creationMessage = creationMessage;
    this.cve = cve;
    if (cve != null) {}
    this.cwe = cwe;
    if (cwe != null) {}
    this.description = description;
    this.documentationUrl = documentationUrl;
    if (documentationUrl != null) {}
    this.isPublished = isPublished;
    this.isTesting = isTesting;
    this.language = language;
    this.unparsed |= !language.isValid();
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.shortDescription = shortDescription;
    this.shouldUseAiFix = shouldUseAiFix;
    this.tags = tags;
    this.tests = tests;
    this.treeSitterQuery = treeSitterQuery;
  }

  public CustomRuleRevisionInputAttributes arguments(List<Argument> arguments) {
    this.arguments = arguments;
    for (Argument item : arguments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomRuleRevisionInputAttributes addArgumentsItem(Argument argumentsItem) {
    this.arguments.add(argumentsItem);
    this.unparsed |= argumentsItem.unparsed;
    return this;
  }

  /**
   * Rule arguments
   *
   * @return arguments
   */
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Argument> getArguments() {
    return arguments;
  }

  public void setArguments(List<Argument> arguments) {
    this.arguments = arguments;
  }

  public CustomRuleRevisionInputAttributes category(CustomRuleRevisionAttributesCategory category) {
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

  public CustomRuleRevisionInputAttributes code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Rule code
   *
   * @return code
   */
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CustomRuleRevisionInputAttributes creationMessage(String creationMessage) {
    this.creationMessage = creationMessage;
    return this;
  }

  /**
   * Revision creation message
   *
   * @return creationMessage
   */
  @JsonProperty(JSON_PROPERTY_CREATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreationMessage() {
    return creationMessage;
  }

  public void setCreationMessage(String creationMessage) {
    this.creationMessage = creationMessage;
  }

  public CustomRuleRevisionInputAttributes cve(String cve) {
    this.cve = cve;
    if (cve != null) {}
    return this;
  }

  /**
   * Associated CVE
   *
   * @return cve
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCve() {
    return cve;
  }

  public void setCve(String cve) {
    this.cve = cve;
  }

  public CustomRuleRevisionInputAttributes cwe(String cwe) {
    this.cwe = cwe;
    if (cwe != null) {}
    return this;
  }

  /**
   * Associated CWE
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

  public CustomRuleRevisionInputAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Full description
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

  public CustomRuleRevisionInputAttributes documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    if (documentationUrl != null) {}
    return this;
  }

  /**
   * Documentation URL
   *
   * @return documentationUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  public CustomRuleRevisionInputAttributes isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Whether the revision is published
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

  public CustomRuleRevisionInputAttributes isTesting(Boolean isTesting) {
    this.isTesting = isTesting;
    return this;
  }

  /**
   * Whether this is a testing revision
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

  public CustomRuleRevisionInputAttributes language(Language language) {
    this.language = language;
    this.unparsed |= !language.isValid();
    return this;
  }

  /**
   * Programming language
   *
   * @return language
   */
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    if (!language.isValid()) {
      this.unparsed = true;
    }
    this.language = language;
  }

  public CustomRuleRevisionInputAttributes severity(CustomRuleRevisionAttributesSeverity severity) {
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

  public CustomRuleRevisionInputAttributes shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Short description
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

  public CustomRuleRevisionInputAttributes shouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
    return this;
  }

  /**
   * Whether to use AI for fixes
   *
   * @return shouldUseAiFix
   */
  @JsonProperty(JSON_PROPERTY_SHOULD_USE_AI_FIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getShouldUseAiFix() {
    return shouldUseAiFix;
  }

  public void setShouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
  }

  public CustomRuleRevisionInputAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CustomRuleRevisionInputAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Rule tags
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CustomRuleRevisionInputAttributes tests(List<CustomRuleRevisionTest> tests) {
    this.tests = tests;
    for (CustomRuleRevisionTest item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomRuleRevisionInputAttributes addTestsItem(CustomRuleRevisionTest testsItem) {
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * Rule tests
   *
   * @return tests
   */
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CustomRuleRevisionTest> getTests() {
    return tests;
  }

  public void setTests(List<CustomRuleRevisionTest> tests) {
    this.tests = tests;
  }

  public CustomRuleRevisionInputAttributes treeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
    return this;
  }

  /**
   * Tree-sitter query
   *
   * @return treeSitterQuery
   */
  @JsonProperty(JSON_PROPERTY_TREE_SITTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTreeSitterQuery() {
    return treeSitterQuery;
  }

  public void setTreeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
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
   * @return CustomRuleRevisionInputAttributes
   */
  @JsonAnySetter
  public CustomRuleRevisionInputAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomRuleRevisionInputAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRuleRevisionInputAttributes customRuleRevisionInputAttributes =
        (CustomRuleRevisionInputAttributes) o;
    return Objects.equals(this.arguments, customRuleRevisionInputAttributes.arguments)
        && Objects.equals(this.category, customRuleRevisionInputAttributes.category)
        && Objects.equals(this.code, customRuleRevisionInputAttributes.code)
        && Objects.equals(this.creationMessage, customRuleRevisionInputAttributes.creationMessage)
        && Objects.equals(this.cve, customRuleRevisionInputAttributes.cve)
        && Objects.equals(this.cwe, customRuleRevisionInputAttributes.cwe)
        && Objects.equals(this.description, customRuleRevisionInputAttributes.description)
        && Objects.equals(this.documentationUrl, customRuleRevisionInputAttributes.documentationUrl)
        && Objects.equals(this.isPublished, customRuleRevisionInputAttributes.isPublished)
        && Objects.equals(this.isTesting, customRuleRevisionInputAttributes.isTesting)
        && Objects.equals(this.language, customRuleRevisionInputAttributes.language)
        && Objects.equals(this.severity, customRuleRevisionInputAttributes.severity)
        && Objects.equals(this.shortDescription, customRuleRevisionInputAttributes.shortDescription)
        && Objects.equals(this.shouldUseAiFix, customRuleRevisionInputAttributes.shouldUseAiFix)
        && Objects.equals(this.tags, customRuleRevisionInputAttributes.tags)
        && Objects.equals(this.tests, customRuleRevisionInputAttributes.tests)
        && Objects.equals(this.treeSitterQuery, customRuleRevisionInputAttributes.treeSitterQuery)
        && Objects.equals(
            this.additionalProperties, customRuleRevisionInputAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arguments,
        category,
        code,
        creationMessage,
        cve,
        cwe,
        description,
        documentationUrl,
        isPublished,
        isTesting,
        language,
        severity,
        shortDescription,
        shouldUseAiFix,
        tags,
        tests,
        treeSitterQuery,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRuleRevisionInputAttributes {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    creationMessage: ").append(toIndentedString(creationMessage)).append("\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    isTesting: ").append(toIndentedString(isTesting)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    shouldUseAiFix: ").append(toIndentedString(shouldUseAiFix)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    treeSitterQuery: ").append(toIndentedString(treeSitterQuery)).append("\n");
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
