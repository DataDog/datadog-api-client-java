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

/** Attributes of a custom rule, which matches the regular expression in <code>pattern</code>. */
@JsonPropertyOrder({
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_EXCLUDED_NAMESPACES,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_INCLUDED_KEYWORD_CONFIGURATION,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_NAMESPACES,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_PATTERN,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_PRIORITY,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_RULE_TYPE,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_SUPPRESSIONS,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_TAGS,
  SensitiveDataScannerCustomRegexRuleAttributes.JSON_PROPERTY_TEXT_REPLACEMENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerCustomRegexRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXCLUDED_NAMESPACES = "excluded_namespaces";
  private List<String> excludedNamespaces = null;

  public static final String JSON_PROPERTY_INCLUDED_KEYWORD_CONFIGURATION =
      "included_keyword_configuration";
  private SensitiveDataScannerIncludedKeywordConfiguration includedKeywordConfiguration;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMESPACES = "namespaces";
  private List<String> namespaces = null;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private SensitiveDataScannerRulePriority priority;

  public static final String JSON_PROPERTY_RULE_TYPE = "rule_type";
  private SensitiveDataScannerCustomRegexRuleType ruleType;

  public static final String JSON_PROPERTY_SUPPRESSIONS = "suppressions";
  private SensitiveDataScannerSuppressions suppressions;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEXT_REPLACEMENT = "text_replacement";
  private SensitiveDataScannerTextReplacement textReplacement;

  public SensitiveDataScannerCustomRegexRuleAttributes() {}

  @JsonCreator
  public SensitiveDataScannerCustomRegexRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_PATTERN) String pattern,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TYPE)
          SensitiveDataScannerCustomRegexRuleType ruleType) {
    this.pattern = pattern;
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
  }

  public SensitiveDataScannerCustomRegexRuleAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the rule.
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

  public SensitiveDataScannerCustomRegexRuleAttributes excludedNamespaces(
      List<String> excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
    return this;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes addExcludedNamespacesItem(
      String excludedNamespacesItem) {
    if (this.excludedNamespaces == null) {
      this.excludedNamespaces = new ArrayList<>();
    }
    this.excludedNamespaces.add(excludedNamespacesItem);
    return this;
  }

  /**
   * Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the
   * namespaces array.
   *
   * @return excludedNamespaces
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_NAMESPACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedNamespaces() {
    return excludedNamespaces;
  }

  public void setExcludedNamespaces(List<String> excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes includedKeywordConfiguration(
      SensitiveDataScannerIncludedKeywordConfiguration includedKeywordConfiguration) {
    this.includedKeywordConfiguration = includedKeywordConfiguration;
    this.unparsed |= includedKeywordConfiguration.unparsed;
    return this;
  }

  /**
   * Object defining a set of keywords and a number of characters that help reduce noise. You can
   * provide a list of keywords you would like to check within a defined proximity of the matching
   * pattern. If any of the keywords are found within the proximity check, the match is kept. If
   * none are found, the match is discarded.
   *
   * @return includedKeywordConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED_KEYWORD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerIncludedKeywordConfiguration getIncludedKeywordConfiguration() {
    return includedKeywordConfiguration;
  }

  public void setIncludedKeywordConfiguration(
      SensitiveDataScannerIncludedKeywordConfiguration includedKeywordConfiguration) {
    this.includedKeywordConfiguration = includedKeywordConfiguration;
    if (includedKeywordConfiguration != null) {
      this.unparsed |= includedKeywordConfiguration.unparsed;
    }
  }

  public SensitiveDataScannerCustomRegexRuleAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether or not the rule is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the rule.
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

  public SensitiveDataScannerCustomRegexRuleAttributes namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * Attributes included in the scan. If namespaces is empty or missing, all attributes except
   * excluded_namespaces are scanned. If both are missing the whole event is scanned.
   *
   * @return namespaces
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Regular expression of the rule.
   *
   * @return pattern
   */
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes priority(
      SensitiveDataScannerRulePriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * Severity of the issues found by the rule.
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerRulePriority getPriority() {
    return priority;
  }

  public void setPriority(SensitiveDataScannerRulePriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes ruleType(
      SensitiveDataScannerCustomRegexRuleType ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
    return this;
  }

  /**
   * Type of a custom rule.
   *
   * @return ruleType
   */
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerCustomRegexRuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(SensitiveDataScannerCustomRegexRuleType ruleType) {
    if (!ruleType.isValid()) {
      this.unparsed = true;
    }
    this.ruleType = ruleType;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes suppressions(
      SensitiveDataScannerSuppressions suppressions) {
    this.suppressions = suppressions;
    this.unparsed |= suppressions.unparsed;
    return this;
  }

  /**
   * Object describing suppressions for a rule, or the recommended suppression lists published by a
   * standard pattern. There are three types of suppressions, <code>starts_with</code>, <code>
   * ends_with</code>, and <code>exact_match</code>. Rules based on the Datadog library can use
   * recommended or custom suppressions. Custom rules can only use custom suppressions. Suppressed
   * matches are not obfuscated, counted in metrics, or displayed in the Findings page.
   *
   * @return suppressions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerSuppressions getSuppressions() {
    return suppressions;
  }

  public void setSuppressions(SensitiveDataScannerSuppressions suppressions) {
    this.suppressions = suppressions;
    if (suppressions != null) {
      this.unparsed |= suppressions.unparsed;
    }
  }

  public SensitiveDataScannerCustomRegexRuleAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SensitiveDataScannerCustomRegexRuleAttributes textReplacement(
      SensitiveDataScannerTextReplacement textReplacement) {
    this.textReplacement = textReplacement;
    this.unparsed |= textReplacement.unparsed;
    return this;
  }

  /**
   * Object describing how the scanned event will be replaced.
   *
   * @return textReplacement
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_REPLACEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerTextReplacement getTextReplacement() {
    return textReplacement;
  }

  public void setTextReplacement(SensitiveDataScannerTextReplacement textReplacement) {
    this.textReplacement = textReplacement;
    if (textReplacement != null) {
      this.unparsed |= textReplacement.unparsed;
    }
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
   * @return SensitiveDataScannerCustomRegexRuleAttributes
   */
  @JsonAnySetter
  public SensitiveDataScannerCustomRegexRuleAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this SensitiveDataScannerCustomRegexRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerCustomRegexRuleAttributes sensitiveDataScannerCustomRegexRuleAttributes =
        (SensitiveDataScannerCustomRegexRuleAttributes) o;
    return Objects.equals(
            this.description, sensitiveDataScannerCustomRegexRuleAttributes.description)
        && Objects.equals(
            this.excludedNamespaces,
            sensitiveDataScannerCustomRegexRuleAttributes.excludedNamespaces)
        && Objects.equals(
            this.includedKeywordConfiguration,
            sensitiveDataScannerCustomRegexRuleAttributes.includedKeywordConfiguration)
        && Objects.equals(this.isEnabled, sensitiveDataScannerCustomRegexRuleAttributes.isEnabled)
        && Objects.equals(this.name, sensitiveDataScannerCustomRegexRuleAttributes.name)
        && Objects.equals(this.namespaces, sensitiveDataScannerCustomRegexRuleAttributes.namespaces)
        && Objects.equals(this.pattern, sensitiveDataScannerCustomRegexRuleAttributes.pattern)
        && Objects.equals(this.priority, sensitiveDataScannerCustomRegexRuleAttributes.priority)
        && Objects.equals(this.ruleType, sensitiveDataScannerCustomRegexRuleAttributes.ruleType)
        && Objects.equals(
            this.suppressions, sensitiveDataScannerCustomRegexRuleAttributes.suppressions)
        && Objects.equals(this.tags, sensitiveDataScannerCustomRegexRuleAttributes.tags)
        && Objects.equals(
            this.textReplacement, sensitiveDataScannerCustomRegexRuleAttributes.textReplacement)
        && Objects.equals(
            this.additionalProperties,
            sensitiveDataScannerCustomRegexRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        excludedNamespaces,
        includedKeywordConfiguration,
        isEnabled,
        name,
        namespaces,
        pattern,
        priority,
        ruleType,
        suppressions,
        tags,
        textReplacement,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerCustomRegexRuleAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excludedNamespaces: ").append(toIndentedString(excludedNamespaces)).append("\n");
    sb.append("    includedKeywordConfiguration: ")
        .append(toIndentedString(includedKeywordConfiguration))
        .append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    suppressions: ").append(toIndentedString(suppressions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    textReplacement: ").append(toIndentedString(textReplacement)).append("\n");
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
