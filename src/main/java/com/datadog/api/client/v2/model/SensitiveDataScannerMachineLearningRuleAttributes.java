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

/**
 * Attributes of a rule based on a standard machine learning rule. It has no pattern or keywords.
 */
@JsonPropertyOrder({
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_EXCLUDED_NAMESPACES,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_NAMESPACES,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_PRIORITY,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_RULE_TYPE,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_SUPPRESSIONS,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_TAGS,
  SensitiveDataScannerMachineLearningRuleAttributes.JSON_PROPERTY_TEXT_REPLACEMENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerMachineLearningRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXCLUDED_NAMESPACES = "excluded_namespaces";
  private List<String> excludedNamespaces = null;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMESPACES = "namespaces";
  private List<String> namespaces = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private SensitiveDataScannerRulePriority priority;

  public static final String JSON_PROPERTY_RULE_TYPE = "rule_type";
  private SensitiveDataScannerMachineLearningRuleType ruleType;

  public static final String JSON_PROPERTY_SUPPRESSIONS = "suppressions";
  private SensitiveDataScannerSuppressions suppressions;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEXT_REPLACEMENT = "text_replacement";
  private SensitiveDataScannerTextReplacement textReplacement;

  public SensitiveDataScannerMachineLearningRuleAttributes() {}

  @JsonCreator
  public SensitiveDataScannerMachineLearningRuleAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_TYPE)
          SensitiveDataScannerMachineLearningRuleType ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
  }

  public SensitiveDataScannerMachineLearningRuleAttributes description(String description) {
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

  public SensitiveDataScannerMachineLearningRuleAttributes excludedNamespaces(
      List<String> excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
    return this;
  }

  public SensitiveDataScannerMachineLearningRuleAttributes addExcludedNamespacesItem(
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

  public SensitiveDataScannerMachineLearningRuleAttributes isEnabled(Boolean isEnabled) {
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

  public SensitiveDataScannerMachineLearningRuleAttributes name(String name) {
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

  public SensitiveDataScannerMachineLearningRuleAttributes namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public SensitiveDataScannerMachineLearningRuleAttributes addNamespacesItem(
      String namespacesItem) {
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

  public SensitiveDataScannerMachineLearningRuleAttributes priority(
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

  public SensitiveDataScannerMachineLearningRuleAttributes ruleType(
      SensitiveDataScannerMachineLearningRuleType ruleType) {
    this.ruleType = ruleType;
    this.unparsed |= !ruleType.isValid();
    return this;
  }

  /**
   * Type of a rule based on a standard machine learning rule.
   *
   * @return ruleType
   */
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerMachineLearningRuleType getRuleType() {
    return ruleType;
  }

  public void setRuleType(SensitiveDataScannerMachineLearningRuleType ruleType) {
    if (!ruleType.isValid()) {
      this.unparsed = true;
    }
    this.ruleType = ruleType;
  }

  public SensitiveDataScannerMachineLearningRuleAttributes suppressions(
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

  public SensitiveDataScannerMachineLearningRuleAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SensitiveDataScannerMachineLearningRuleAttributes addTagsItem(String tagsItem) {
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

  public SensitiveDataScannerMachineLearningRuleAttributes textReplacement(
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
   * @return SensitiveDataScannerMachineLearningRuleAttributes
   */
  @JsonAnySetter
  public SensitiveDataScannerMachineLearningRuleAttributes putAdditionalProperty(
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

  /** Return true if this SensitiveDataScannerMachineLearningRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerMachineLearningRuleAttributes
        sensitiveDataScannerMachineLearningRuleAttributes =
            (SensitiveDataScannerMachineLearningRuleAttributes) o;
    return Objects.equals(
            this.description, sensitiveDataScannerMachineLearningRuleAttributes.description)
        && Objects.equals(
            this.excludedNamespaces,
            sensitiveDataScannerMachineLearningRuleAttributes.excludedNamespaces)
        && Objects.equals(
            this.isEnabled, sensitiveDataScannerMachineLearningRuleAttributes.isEnabled)
        && Objects.equals(this.name, sensitiveDataScannerMachineLearningRuleAttributes.name)
        && Objects.equals(
            this.namespaces, sensitiveDataScannerMachineLearningRuleAttributes.namespaces)
        && Objects.equals(this.priority, sensitiveDataScannerMachineLearningRuleAttributes.priority)
        && Objects.equals(this.ruleType, sensitiveDataScannerMachineLearningRuleAttributes.ruleType)
        && Objects.equals(
            this.suppressions, sensitiveDataScannerMachineLearningRuleAttributes.suppressions)
        && Objects.equals(this.tags, sensitiveDataScannerMachineLearningRuleAttributes.tags)
        && Objects.equals(
            this.textReplacement, sensitiveDataScannerMachineLearningRuleAttributes.textReplacement)
        && Objects.equals(
            this.additionalProperties,
            sensitiveDataScannerMachineLearningRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        excludedNamespaces,
        isEnabled,
        name,
        namespaces,
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
    sb.append("class SensitiveDataScannerMachineLearningRuleAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excludedNamespaces: ").append(toIndentedString(excludedNamespaces)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
