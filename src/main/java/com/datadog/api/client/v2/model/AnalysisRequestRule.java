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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A static analysis rule to apply during code analysis. Clients forward complete rule objects
 * returned by the rulesets endpoints, so every member of that resource is declared here; only
 * <code>id</code>, <code>category</code>, <code>checksum</code>, <code>language</code>, <code>
 * severity</code>, <code>tree_sitter_query</code>, <code>entity_checked</code>, <code>regex</code>,
 * <code>type</code> and <code>code</code> are read by this operation and the rest are ignored. The
 * schema stays open so that any member beyond the forwarded rule resource is reported as a
 * promotion candidate rather than rejected; it can be closed once that telemetry confirms none
 * remain.
 */
@JsonPropertyOrder({
  AnalysisRequestRule.JSON_PROPERTY_ARGUMENTS,
  AnalysisRequestRule.JSON_PROPERTY_CATEGORY,
  AnalysisRequestRule.JSON_PROPERTY_CHECKSUM,
  AnalysisRequestRule.JSON_PROPERTY_CODE,
  AnalysisRequestRule.JSON_PROPERTY_CREATED_AT,
  AnalysisRequestRule.JSON_PROPERTY_CREATED_BY,
  AnalysisRequestRule.JSON_PROPERTY_CVE,
  AnalysisRequestRule.JSON_PROPERTY_CWE,
  AnalysisRequestRule.JSON_PROPERTY_DESCRIPTION,
  AnalysisRequestRule.JSON_PROPERTY_DOCUMENTATION_URL,
  AnalysisRequestRule.JSON_PROPERTY_ENTITY_CHECKED,
  AnalysisRequestRule.JSON_PROPERTY_ID,
  AnalysisRequestRule.JSON_PROPERTY_IS_PUBLISHED,
  AnalysisRequestRule.JSON_PROPERTY_IS_TESTING,
  AnalysisRequestRule.JSON_PROPERTY_LANGUAGE,
  AnalysisRequestRule.JSON_PROPERTY_LAST_UPDATED_AT,
  AnalysisRequestRule.JSON_PROPERTY_LAST_UPDATED_BY,
  AnalysisRequestRule.JSON_PROPERTY_NAME,
  AnalysisRequestRule.JSON_PROPERTY_REGEX,
  AnalysisRequestRule.JSON_PROPERTY_SEVERITY,
  AnalysisRequestRule.JSON_PROPERTY_SHORT_DESCRIPTION,
  AnalysisRequestRule.JSON_PROPERTY_SHOULD_USE_AI_FIX,
  AnalysisRequestRule.JSON_PROPERTY_TESTS,
  AnalysisRequestRule.JSON_PROPERTY_TREE_SITTER_QUERY,
  AnalysisRequestRule.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisRequestRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private List<AnalysisRequestRuleArgument> arguments = null;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CVE = "cve";
  private String cve;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private String cwe;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOCUMENTATION_URL = "documentation_url";
  private String documentationUrl;

  public static final String JSON_PROPERTY_ENTITY_CHECKED = "entity_checked";
  private JsonNullable<String> entityChecked = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_PUBLISHED = "is_published";
  private Boolean isPublished;

  public static final String JSON_PROPERTY_IS_TESTING = "is_testing";
  private Boolean isTesting;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "last_updated_at";
  private OffsetDateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "last_updated_by";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGEX = "regex";
  private JsonNullable<String> regex = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public static final String JSON_PROPERTY_SHOULD_USE_AI_FIX = "should_use_ai_fix";
  private Boolean shouldUseAiFix;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<AnalysisRequestRuleTest> tests = null;

  public static final String JSON_PROPERTY_TREE_SITTER_QUERY = "tree_sitter_query";
  private String treeSitterQuery;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public AnalysisRequestRule() {}

  @JsonCreator
  public AnalysisRequestRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_CATEGORY) String category,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_CODE) String code,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_LANGUAGE) String language,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) String severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_TREE_SITTER_QUERY)
          String treeSitterQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.category = category;
    this.checksum = checksum;
    this.code = code;
    this.id = id;
    this.language = language;
    this.severity = severity;
    this.treeSitterQuery = treeSitterQuery;
    this.type = type;
  }

  public AnalysisRequestRule arguments(List<AnalysisRequestRuleArgument> arguments) {
    this.arguments = arguments;
    if (arguments != null) {
      for (AnalysisRequestRuleArgument item : arguments) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AnalysisRequestRule addArgumentsItem(AnalysisRequestRuleArgument argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    this.unparsed |= argumentsItem.unparsed;
    return this;
  }

  /**
   * The configurable arguments accepted by the rule. Forwarded from the rulesets endpoints; ignored
   * by this operation.
   *
   * @return arguments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AnalysisRequestRuleArgument> getArguments() {
    return arguments;
  }

  public void setArguments(List<AnalysisRequestRuleArgument> arguments) {
    this.arguments = arguments;
    if (arguments != null) {
      for (AnalysisRequestRuleArgument item : arguments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AnalysisRequestRule category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the rule (for example, <code>BEST_PRACTICES</code>, <code>SECURITY</code>).
   *
   * @return category
   */
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AnalysisRequestRule checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * A checksum of the rule definition.
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

  public AnalysisRequestRule code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The base64-encoded rule implementation code.
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

  /**
   * The date and time when the rule was created. Server-assigned by the rulesets endpoints; ignored
   * by this operation.
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
   * The identifier of the user or system that created the rule. Server-assigned by the rulesets
   * endpoints; ignored by this operation.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public AnalysisRequestRule cve(String cve) {
    this.cve = cve;
    return this;
  }

  /**
   * The CVE identifier associated with the rule. Forwarded from the rulesets endpoints; ignored by
   * this operation.
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

  public AnalysisRequestRule cwe(String cwe) {
    this.cwe = cwe;
    return this;
  }

  /**
   * The CWE identifier associated with the rule. Forwarded from the rulesets endpoints; ignored by
   * this operation.
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

  public AnalysisRequestRule description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A detailed explanation of what the rule detects. Forwarded from the rulesets endpoints; ignored
   * by this operation.
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

  public AnalysisRequestRule documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

  /**
   * A URL pointing to the rule documentation. Forwarded from the rulesets endpoints; ignored by
   * this operation.
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

  public AnalysisRequestRule entityChecked(String entityChecked) {
    this.entityChecked = JsonNullable.<String>of(entityChecked);
    return this;
  }

  /**
   * The code entity type checked by the rule, applicable when rule type is <code>AST_CHECK</code>.
   *
   * @return entityChecked
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getEntityChecked() {
    return entityChecked.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_CHECKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEntityChecked_JsonNullable() {
    return entityChecked;
  }

  @JsonProperty(JSON_PROPERTY_ENTITY_CHECKED)
  public void setEntityChecked_JsonNullable(JsonNullable<String> entityChecked) {
    this.entityChecked = entityChecked;
  }

  public void setEntityChecked(String entityChecked) {
    this.entityChecked = JsonNullable.<String>of(entityChecked);
  }

  public AnalysisRequestRule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the rule.
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

  public AnalysisRequestRule isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * Whether the rule is published. Forwarded from the rulesets endpoints; ignored by this
   * operation.
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

  public AnalysisRequestRule isTesting(Boolean isTesting) {
    this.isTesting = isTesting;
    return this;
  }

  /**
   * Whether the rule is in testing mode. Forwarded from the rulesets endpoints; ignored by this
   * operation.
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

  public AnalysisRequestRule language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The programming language this rule targets.
   *
   * @return language
   */
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The date and time when the rule was last modified. Server-assigned by the rulesets endpoints;
   * ignored by this operation.
   *
   * @return lastUpdatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  /**
   * The identifier of the user or system that last updated the rule. Server-assigned by the
   * rulesets endpoints; ignored by this operation.
   *
   * @return lastUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public AnalysisRequestRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule. Forwarded from the rulesets endpoints; ignored by this operation.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnalysisRequestRule regex(String regex) {
    this.regex = JsonNullable.<String>of(regex);
    return this;
  }

  /**
   * A base64-encoded regex pattern used by the rule, applicable when rule type is <code>REGEX
   * </code>.
   *
   * @return regex
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getRegex() {
    return regex.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRegex_JsonNullable() {
    return regex;
  }

  @JsonProperty(JSON_PROPERTY_REGEX)
  public void setRegex_JsonNullable(JsonNullable<String> regex) {
    this.regex = regex;
  }

  public void setRegex(String regex) {
    this.regex = JsonNullable.<String>of(regex);
  }

  public AnalysisRequestRule severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The severity of findings from this rule (for example, <code>ERROR</code>, <code>WARNING</code>
   * ).
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public AnalysisRequestRule shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * A brief summary of what the rule detects. Forwarded from the rulesets endpoints; ignored by
   * this operation.
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

  public AnalysisRequestRule shouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
    return this;
  }

  /**
   * Whether an AI-generated fix should be offered. Forwarded from the rulesets endpoints; ignored
   * by this operation.
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

  public AnalysisRequestRule tests(List<AnalysisRequestRuleTest> tests) {
    this.tests = tests;
    if (tests != null) {
      for (AnalysisRequestRuleTest item : tests) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AnalysisRequestRule addTestsItem(AnalysisRequestRuleTest testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * The test cases associated with the rule. Forwarded from the rulesets endpoints; ignored by this
   * operation.
   *
   * @return tests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AnalysisRequestRuleTest> getTests() {
    return tests;
  }

  public void setTests(List<AnalysisRequestRuleTest> tests) {
    this.tests = tests;
    if (tests != null) {
      for (AnalysisRequestRuleTest item : tests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AnalysisRequestRule treeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
    return this;
  }

  /**
   * The base64-encoded tree-sitter query used by the rule.
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

  public AnalysisRequestRule type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The rule type indicating the detection mechanism (for example, <code>TREE_SITTER_QUERY</code>).
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return AnalysisRequestRule
   */
  @JsonAnySetter
  public AnalysisRequestRule putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisRequestRule object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRequestRule analysisRequestRule = (AnalysisRequestRule) o;
    return Objects.equals(this.arguments, analysisRequestRule.arguments)
        && Objects.equals(this.category, analysisRequestRule.category)
        && Objects.equals(this.checksum, analysisRequestRule.checksum)
        && Objects.equals(this.code, analysisRequestRule.code)
        && Objects.equals(this.createdAt, analysisRequestRule.createdAt)
        && Objects.equals(this.createdBy, analysisRequestRule.createdBy)
        && Objects.equals(this.cve, analysisRequestRule.cve)
        && Objects.equals(this.cwe, analysisRequestRule.cwe)
        && Objects.equals(this.description, analysisRequestRule.description)
        && Objects.equals(this.documentationUrl, analysisRequestRule.documentationUrl)
        && Objects.equals(this.entityChecked, analysisRequestRule.entityChecked)
        && Objects.equals(this.id, analysisRequestRule.id)
        && Objects.equals(this.isPublished, analysisRequestRule.isPublished)
        && Objects.equals(this.isTesting, analysisRequestRule.isTesting)
        && Objects.equals(this.language, analysisRequestRule.language)
        && Objects.equals(this.lastUpdatedAt, analysisRequestRule.lastUpdatedAt)
        && Objects.equals(this.lastUpdatedBy, analysisRequestRule.lastUpdatedBy)
        && Objects.equals(this.name, analysisRequestRule.name)
        && Objects.equals(this.regex, analysisRequestRule.regex)
        && Objects.equals(this.severity, analysisRequestRule.severity)
        && Objects.equals(this.shortDescription, analysisRequestRule.shortDescription)
        && Objects.equals(this.shouldUseAiFix, analysisRequestRule.shouldUseAiFix)
        && Objects.equals(this.tests, analysisRequestRule.tests)
        && Objects.equals(this.treeSitterQuery, analysisRequestRule.treeSitterQuery)
        && Objects.equals(this.type, analysisRequestRule.type)
        && Objects.equals(this.additionalProperties, analysisRequestRule.additionalProperties);
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
        cve,
        cwe,
        description,
        documentationUrl,
        entityChecked,
        id,
        isPublished,
        isTesting,
        language,
        lastUpdatedAt,
        lastUpdatedBy,
        name,
        regex,
        severity,
        shortDescription,
        shouldUseAiFix,
        tests,
        treeSitterQuery,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequestRule {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    entityChecked: ").append(toIndentedString(entityChecked)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    isTesting: ").append(toIndentedString(isTesting)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    shouldUseAiFix: ").append(toIndentedString(shouldUseAiFix)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    treeSitterQuery: ").append(toIndentedString(treeSitterQuery)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
