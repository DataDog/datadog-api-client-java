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
import org.openapitools.jackson.nullable.JsonNullable;

/** A static analysis rule to apply during code analysis. */
@JsonPropertyOrder({
  AnalysisRequestRule.JSON_PROPERTY_CATEGORY,
  AnalysisRequestRule.JSON_PROPERTY_CHECKSUM,
  AnalysisRequestRule.JSON_PROPERTY_CODE,
  AnalysisRequestRule.JSON_PROPERTY_ENTITY_CHECKED,
  AnalysisRequestRule.JSON_PROPERTY_ID,
  AnalysisRequestRule.JSON_PROPERTY_LANGUAGE,
  AnalysisRequestRule.JSON_PROPERTY_REGEX,
  AnalysisRequestRule.JSON_PROPERTY_SEVERITY,
  AnalysisRequestRule.JSON_PROPERTY_TREE_SITTER_QUERY,
  AnalysisRequestRule.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisRequestRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_ENTITY_CHECKED = "entity_checked";
  private JsonNullable<String> entityChecked = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_REGEX = "regex";
  private JsonNullable<String> regex = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

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
    return Objects.equals(this.category, analysisRequestRule.category)
        && Objects.equals(this.checksum, analysisRequestRule.checksum)
        && Objects.equals(this.code, analysisRequestRule.code)
        && Objects.equals(this.entityChecked, analysisRequestRule.entityChecked)
        && Objects.equals(this.id, analysisRequestRule.id)
        && Objects.equals(this.language, analysisRequestRule.language)
        && Objects.equals(this.regex, analysisRequestRule.regex)
        && Objects.equals(this.severity, analysisRequestRule.severity)
        && Objects.equals(this.treeSitterQuery, analysisRequestRule.treeSitterQuery)
        && Objects.equals(this.type, analysisRequestRule.type)
        && Objects.equals(this.additionalProperties, analysisRequestRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        checksum,
        code,
        entityChecked,
        id,
        language,
        regex,
        severity,
        treeSitterQuery,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequestRule {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    entityChecked: ").append(toIndentedString(entityChecked)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
