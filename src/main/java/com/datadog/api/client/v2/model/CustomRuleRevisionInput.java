/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A revision of a custom static analysis rule as embedded in a rule supplied by a create or update
 * request. Nested revisions are sent flat, without a <code>data</code>/<code>type</code>/<code>
 * attributes</code> envelope. <code>id</code>, <code>version_id</code>, <code>checksum</code>,
 * <code>created_at</code> and <code>created_by</code> are server-assigned and read-only; they are
 * declared so that a ruleset previously read back can be supplied unchanged.
 */
@JsonPropertyOrder({
  CustomRuleRevisionInput.JSON_PROPERTY_ARGUMENTS,
  CustomRuleRevisionInput.JSON_PROPERTY_CATEGORY,
  CustomRuleRevisionInput.JSON_PROPERTY_CHECKSUM,
  CustomRuleRevisionInput.JSON_PROPERTY_CODE,
  CustomRuleRevisionInput.JSON_PROPERTY_CREATED_AT,
  CustomRuleRevisionInput.JSON_PROPERTY_CREATED_BY,
  CustomRuleRevisionInput.JSON_PROPERTY_CREATION_MESSAGE,
  CustomRuleRevisionInput.JSON_PROPERTY_CVE,
  CustomRuleRevisionInput.JSON_PROPERTY_CWE,
  CustomRuleRevisionInput.JSON_PROPERTY_DESCRIPTION,
  CustomRuleRevisionInput.JSON_PROPERTY_DOCUMENTATION_URL,
  CustomRuleRevisionInput.JSON_PROPERTY_ID,
  CustomRuleRevisionInput.JSON_PROPERTY_IS_PUBLISHED,
  CustomRuleRevisionInput.JSON_PROPERTY_IS_TESTING,
  CustomRuleRevisionInput.JSON_PROPERTY_LANGUAGE,
  CustomRuleRevisionInput.JSON_PROPERTY_SEVERITY,
  CustomRuleRevisionInput.JSON_PROPERTY_SHORT_DESCRIPTION,
  CustomRuleRevisionInput.JSON_PROPERTY_SHOULD_USE_AI_FIX,
  CustomRuleRevisionInput.JSON_PROPERTY_TAGS,
  CustomRuleRevisionInput.JSON_PROPERTY_TESTS,
  CustomRuleRevisionInput.JSON_PROPERTY_TREE_SITTER_QUERY,
  CustomRuleRevisionInput.JSON_PROPERTY_VERSION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomRuleRevisionInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private JsonNullable<List<Argument>> arguments = JsonNullable.<List<Argument>>undefined();

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CustomRuleRevisionAttributesCategory category;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATION_MESSAGE = "creation_message";
  private String creationMessage;

  public static final String JSON_PROPERTY_CVE = "cve";
  private JsonNullable<String> cve = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CWE = "cwe";
  private JsonNullable<String> cwe = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOCUMENTATION_URL = "documentation_url";
  private JsonNullable<String> documentationUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

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
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TESTS = "tests";
  private JsonNullable<List<CustomRuleRevisionTest>> tests =
      JsonNullable.<List<CustomRuleRevisionTest>>undefined();

  public static final String JSON_PROPERTY_TREE_SITTER_QUERY = "tree_sitter_query";
  private String treeSitterQuery;

  public static final String JSON_PROPERTY_VERSION_ID = "version_id";
  private Long versionId;

  public CustomRuleRevisionInput arguments(List<Argument> arguments) {
    this.arguments = JsonNullable.<List<Argument>>of(arguments);
    return this;
  }

  public CustomRuleRevisionInput addArgumentsItem(Argument argumentsItem) {
    if (this.arguments == null || !this.arguments.isPresent()) {
      this.arguments = JsonNullable.<List<Argument>>of(new ArrayList<>());
    }
    try {
      this.arguments.get().add(argumentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Rule arguments
   *
   * @return arguments
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<Argument> getArguments() {
    return arguments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Argument>> getArguments_JsonNullable() {
    return arguments;
  }

  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  public void setArguments_JsonNullable(JsonNullable<List<Argument>> arguments) {
    this.arguments = arguments;
  }

  public void setArguments(List<Argument> arguments) {
    this.arguments = JsonNullable.<List<Argument>>of(arguments);
  }

  public CustomRuleRevisionInput category(CustomRuleRevisionAttributesCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * Rule category
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomRuleRevisionAttributesCategory getCategory() {
    return category;
  }

  public void setCategory(CustomRuleRevisionAttributesCategory category) {
    if (!category.isValid()) {
      this.unparsed = true;
    }
    this.category = category;
  }

  /**
   * Code checksum
   *
   * @return checksum
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChecksum() {
    return checksum;
  }

  public CustomRuleRevisionInput code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Rule code
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Creation timestamp
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
   * Creator identifier
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public CustomRuleRevisionInput creationMessage(String creationMessage) {
    this.creationMessage = creationMessage;
    return this;
  }

  /**
   * Revision creation message
   *
   * @return creationMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreationMessage() {
    return creationMessage;
  }

  public void setCreationMessage(String creationMessage) {
    this.creationMessage = creationMessage;
  }

  public CustomRuleRevisionInput cve(String cve) {
    this.cve = JsonNullable.<String>of(cve);
    return this;
  }

  /**
   * Associated CVE
   *
   * @return cve
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCve() {
    return cve.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCve_JsonNullable() {
    return cve;
  }

  @JsonProperty(JSON_PROPERTY_CVE)
  public void setCve_JsonNullable(JsonNullable<String> cve) {
    this.cve = cve;
  }

  public void setCve(String cve) {
    this.cve = JsonNullable.<String>of(cve);
  }

  public CustomRuleRevisionInput cwe(String cwe) {
    this.cwe = JsonNullable.<String>of(cwe);
    return this;
  }

  /**
   * Associated CWE
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

  public CustomRuleRevisionInput description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Base64-encoded full description
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomRuleRevisionInput documentationUrl(String documentationUrl) {
    this.documentationUrl = JsonNullable.<String>of(documentationUrl);
    return this;
  }

  /**
   * Documentation URL
   *
   * @return documentationUrl
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDocumentationUrl() {
    return documentationUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDocumentationUrl_JsonNullable() {
    return documentationUrl;
  }

  @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL)
  public void setDocumentationUrl_JsonNullable(JsonNullable<String> documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = JsonNullable.<String>of(documentationUrl);
  }

  /**
   * Revision identifier
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public CustomRuleRevisionInput isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Whether the revision should be published
   *
   * @return isPublished
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUBLISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public CustomRuleRevisionInput isTesting(Boolean isTesting) {
    this.isTesting = isTesting;
    return this;
  }

  /**
   * Whether this is a testing revision
   *
   * @return isTesting
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TESTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsTesting() {
    return isTesting;
  }

  public void setIsTesting(Boolean isTesting) {
    this.isTesting = isTesting;
  }

  public CustomRuleRevisionInput language(Language language) {
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

  public CustomRuleRevisionInput severity(CustomRuleRevisionAttributesSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * Rule severity
   *
   * @return severity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomRuleRevisionAttributesSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(CustomRuleRevisionAttributesSeverity severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
  }

  public CustomRuleRevisionInput shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Base64-encoded short description
   *
   * @return shortDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public CustomRuleRevisionInput shouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
    return this;
  }

  /**
   * Whether to use AI for fixes
   *
   * @return shouldUseAiFix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_USE_AI_FIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShouldUseAiFix() {
    return shouldUseAiFix;
  }

  public void setShouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
  }

  public CustomRuleRevisionInput tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public CustomRuleRevisionInput addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Rule tags
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public CustomRuleRevisionInput tests(List<CustomRuleRevisionTest> tests) {
    this.tests = JsonNullable.<List<CustomRuleRevisionTest>>of(tests);
    return this;
  }

  public CustomRuleRevisionInput addTestsItem(CustomRuleRevisionTest testsItem) {
    if (this.tests == null || !this.tests.isPresent()) {
      this.tests = JsonNullable.<List<CustomRuleRevisionTest>>of(new ArrayList<>());
    }
    try {
      this.tests.get().add(testsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Rule tests
   *
   * @return tests
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<CustomRuleRevisionTest> getTests() {
    return tests.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<CustomRuleRevisionTest>> getTests_JsonNullable() {
    return tests;
  }

  @JsonProperty(JSON_PROPERTY_TESTS)
  public void setTests_JsonNullable(JsonNullable<List<CustomRuleRevisionTest>> tests) {
    this.tests = tests;
  }

  public void setTests(List<CustomRuleRevisionTest> tests) {
    this.tests = JsonNullable.<List<CustomRuleRevisionTest>>of(tests);
  }

  public CustomRuleRevisionInput treeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
    return this;
  }

  /**
   * Tree-sitter query
   *
   * @return treeSitterQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TREE_SITTER_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTreeSitterQuery() {
    return treeSitterQuery;
  }

  public void setTreeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
  }

  /**
   * Monotonically increasing version number of the revision.
   *
   * @return versionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersionId() {
    return versionId;
  }

  /** Return true if this CustomRuleRevisionInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRuleRevisionInput customRuleRevisionInput = (CustomRuleRevisionInput) o;
    return Objects.equals(this.arguments, customRuleRevisionInput.arguments)
        && Objects.equals(this.category, customRuleRevisionInput.category)
        && Objects.equals(this.checksum, customRuleRevisionInput.checksum)
        && Objects.equals(this.code, customRuleRevisionInput.code)
        && Objects.equals(this.createdAt, customRuleRevisionInput.createdAt)
        && Objects.equals(this.createdBy, customRuleRevisionInput.createdBy)
        && Objects.equals(this.creationMessage, customRuleRevisionInput.creationMessage)
        && Objects.equals(this.cve, customRuleRevisionInput.cve)
        && Objects.equals(this.cwe, customRuleRevisionInput.cwe)
        && Objects.equals(this.description, customRuleRevisionInput.description)
        && Objects.equals(this.documentationUrl, customRuleRevisionInput.documentationUrl)
        && Objects.equals(this.id, customRuleRevisionInput.id)
        && Objects.equals(this.isPublished, customRuleRevisionInput.isPublished)
        && Objects.equals(this.isTesting, customRuleRevisionInput.isTesting)
        && Objects.equals(this.language, customRuleRevisionInput.language)
        && Objects.equals(this.severity, customRuleRevisionInput.severity)
        && Objects.equals(this.shortDescription, customRuleRevisionInput.shortDescription)
        && Objects.equals(this.shouldUseAiFix, customRuleRevisionInput.shouldUseAiFix)
        && Objects.equals(this.tags, customRuleRevisionInput.tags)
        && Objects.equals(this.tests, customRuleRevisionInput.tests)
        && Objects.equals(this.treeSitterQuery, customRuleRevisionInput.treeSitterQuery)
        && Objects.equals(this.versionId, customRuleRevisionInput.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        arguments,
        category,
        checksum,
        code,
        createdAt,
        createdBy,
        creationMessage,
        cve,
        cwe,
        description,
        documentationUrl,
        id,
        isPublished,
        isTesting,
        language,
        severity,
        shortDescription,
        shouldUseAiFix,
        tags,
        tests,
        treeSitterQuery,
        versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRuleRevisionInput {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationMessage: ").append(toIndentedString(creationMessage)).append("\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    isTesting: ").append(toIndentedString(isTesting)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    shouldUseAiFix: ").append(toIndentedString(shouldUseAiFix)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    treeSitterQuery: ").append(toIndentedString(treeSitterQuery)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
