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

/** A revision of a custom static analysis rule as embedded in a rule or ruleset response. */
@JsonPropertyOrder({
  CustomRuleRevisionEmbedded.JSON_PROPERTY_ARGUMENTS,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CATEGORY,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CHECKSUM,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CODE,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CREATED_AT,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CREATED_BY,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CREATION_MESSAGE,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CVE,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_CWE,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_DESCRIPTION,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_DOCUMENTATION_URL,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_ID,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_IS_PUBLISHED,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_IS_TESTING,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_LANGUAGE,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_SEVERITY,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_SHORT_DESCRIPTION,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_SHOULD_USE_AI_FIX,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_TAGS,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_TESTS,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_TREE_SITTER_QUERY,
  CustomRuleRevisionEmbedded.JSON_PROPERTY_VERSION_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomRuleRevisionEmbedded {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private List<Argument> arguments = new ArrayList<>();

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
  private String cve;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private String cwe;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOCUMENTATION_URL = "documentation_url";
  private String documentationUrl;

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
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<CustomRuleRevisionTest> tests = new ArrayList<>();

  public static final String JSON_PROPERTY_TREE_SITTER_QUERY = "tree_sitter_query";
  private String treeSitterQuery;

  public static final String JSON_PROPERTY_VERSION_ID = "version_id";
  private Long versionId;

  public CustomRuleRevisionEmbedded() {}

  @JsonCreator
  public CustomRuleRevisionEmbedded(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARGUMENTS) List<Argument> arguments,
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY)
          CustomRuleRevisionAttributesCategory category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_CODE) String code,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATION_MESSAGE) String creationMessage,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
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
          String treeSitterQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION_ID) Long versionId) {
    this.arguments = arguments;
    if (arguments != null) {
      for (Argument item : arguments) {
        this.unparsed |= item.unparsed;
      }
    }
    this.category = category;
    this.unparsed |= !category.isValid();
    this.checksum = checksum;
    this.code = code;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.creationMessage = creationMessage;
    this.description = description;
    this.id = id;
    this.isPublished = isPublished;
    this.isTesting = isTesting;
    this.language = language;
    this.unparsed |= !language.isValid();
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.shortDescription = shortDescription;
    this.shouldUseAiFix = shouldUseAiFix;
    this.tags = tags;
    if (tags != null) {}
    this.tests = tests;
    if (tests != null) {
      for (CustomRuleRevisionTest item : tests) {
        this.unparsed |= item.unparsed;
      }
    }
    this.treeSitterQuery = treeSitterQuery;
    this.versionId = versionId;
  }

  public CustomRuleRevisionEmbedded arguments(List<Argument> arguments) {
    this.arguments = arguments;
    for (Argument item : arguments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomRuleRevisionEmbedded addArgumentsItem(Argument argumentsItem) {
    this.arguments.add(argumentsItem);
    this.unparsed |= argumentsItem.unparsed;
    return this;
  }

  /**
   * Rule arguments
   *
   * @return arguments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Argument> getArguments() {
    return arguments;
  }

  public void setArguments(List<Argument> arguments) {
    this.arguments = arguments;
    if (arguments != null) {
      for (Argument item : arguments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CustomRuleRevisionEmbedded category(CustomRuleRevisionAttributesCategory category) {
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

  public CustomRuleRevisionEmbedded checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Code checksum
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

  public CustomRuleRevisionEmbedded code(String code) {
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

  public CustomRuleRevisionEmbedded createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation timestamp
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

  public CustomRuleRevisionEmbedded createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Creator identifier
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

  public CustomRuleRevisionEmbedded creationMessage(String creationMessage) {
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

  public CustomRuleRevisionEmbedded cve(String cve) {
    this.cve = cve;
    return this;
  }

  /**
   * Associated CVE. Omitted when the revision has no associated CVE.
   *
   * @return cve
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCve() {
    return cve;
  }

  public void setCve(String cve) {
    this.cve = cve;
  }

  public CustomRuleRevisionEmbedded cwe(String cwe) {
    this.cwe = cwe;
    return this;
  }

  /**
   * Associated CWE. Omitted when the revision has no associated CWE.
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

  public CustomRuleRevisionEmbedded description(String description) {
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

  public CustomRuleRevisionEmbedded documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

  /**
   * Documentation URL. Omitted when the revision has no documentation URL.
   *
   * @return documentationUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  public CustomRuleRevisionEmbedded id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Revision identifier
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomRuleRevisionEmbedded isPublished(Boolean isPublished) {
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

  public CustomRuleRevisionEmbedded isTesting(Boolean isTesting) {
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

  public CustomRuleRevisionEmbedded language(Language language) {
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

  public CustomRuleRevisionEmbedded severity(CustomRuleRevisionAttributesSeverity severity) {
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

  public CustomRuleRevisionEmbedded shortDescription(String shortDescription) {
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

  public CustomRuleRevisionEmbedded shouldUseAiFix(Boolean shouldUseAiFix) {
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

  public CustomRuleRevisionEmbedded tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CustomRuleRevisionEmbedded addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Rule tags
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CustomRuleRevisionEmbedded tests(List<CustomRuleRevisionTest> tests) {
    this.tests = tests;
    for (CustomRuleRevisionTest item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomRuleRevisionEmbedded addTestsItem(CustomRuleRevisionTest testsItem) {
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * Rule tests
   *
   * @return tests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CustomRuleRevisionTest> getTests() {
    return tests;
  }

  public void setTests(List<CustomRuleRevisionTest> tests) {
    this.tests = tests;
    if (tests != null) {
      for (CustomRuleRevisionTest item : tests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CustomRuleRevisionEmbedded treeSitterQuery(String treeSitterQuery) {
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

  public CustomRuleRevisionEmbedded versionId(Long versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Monotonically increasing version number of the revision.
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
   * @return CustomRuleRevisionEmbedded
   */
  @JsonAnySetter
  public CustomRuleRevisionEmbedded putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomRuleRevisionEmbedded object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomRuleRevisionEmbedded customRuleRevisionEmbedded = (CustomRuleRevisionEmbedded) o;
    return Objects.equals(this.arguments, customRuleRevisionEmbedded.arguments)
        && Objects.equals(this.category, customRuleRevisionEmbedded.category)
        && Objects.equals(this.checksum, customRuleRevisionEmbedded.checksum)
        && Objects.equals(this.code, customRuleRevisionEmbedded.code)
        && Objects.equals(this.createdAt, customRuleRevisionEmbedded.createdAt)
        && Objects.equals(this.createdBy, customRuleRevisionEmbedded.createdBy)
        && Objects.equals(this.creationMessage, customRuleRevisionEmbedded.creationMessage)
        && Objects.equals(this.cve, customRuleRevisionEmbedded.cve)
        && Objects.equals(this.cwe, customRuleRevisionEmbedded.cwe)
        && Objects.equals(this.description, customRuleRevisionEmbedded.description)
        && Objects.equals(this.documentationUrl, customRuleRevisionEmbedded.documentationUrl)
        && Objects.equals(this.id, customRuleRevisionEmbedded.id)
        && Objects.equals(this.isPublished, customRuleRevisionEmbedded.isPublished)
        && Objects.equals(this.isTesting, customRuleRevisionEmbedded.isTesting)
        && Objects.equals(this.language, customRuleRevisionEmbedded.language)
        && Objects.equals(this.severity, customRuleRevisionEmbedded.severity)
        && Objects.equals(this.shortDescription, customRuleRevisionEmbedded.shortDescription)
        && Objects.equals(this.shouldUseAiFix, customRuleRevisionEmbedded.shouldUseAiFix)
        && Objects.equals(this.tags, customRuleRevisionEmbedded.tags)
        && Objects.equals(this.tests, customRuleRevisionEmbedded.tests)
        && Objects.equals(this.treeSitterQuery, customRuleRevisionEmbedded.treeSitterQuery)
        && Objects.equals(this.versionId, customRuleRevisionEmbedded.versionId)
        && Objects.equals(
            this.additionalProperties, customRuleRevisionEmbedded.additionalProperties);
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
        versionId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRuleRevisionEmbedded {\n");
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
