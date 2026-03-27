/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes of the Sensitive Data Scanner rule.</p>
 */
@JsonPropertyOrder({
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_EXCLUDED_NAMESPACES,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_INCLUDED_KEYWORD_CONFIGURATION,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_NAMESPACES,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_PATTERN,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_PRIORITY,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_SUPPRESSIONS,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_TAGS,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_TEXT_REPLACEMENT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXCLUDED_NAMESPACES = "excluded_namespaces";
  private List<String> excludedNamespaces = null;

  public static final String JSON_PROPERTY_INCLUDED_KEYWORD_CONFIGURATION = "included_keyword_configuration";
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
  private Long priority;

  public static final String JSON_PROPERTY_SUPPRESSIONS = "suppressions";
  private SensitiveDataScannerSuppressions suppressions;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEXT_REPLACEMENT = "text_replacement";
  private SensitiveDataScannerTextReplacement textReplacement;

  public SensitiveDataScannerRuleAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the rule.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public SensitiveDataScannerRuleAttributes excludedNamespaces(List<String> excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
    return this;
  }
  public SensitiveDataScannerRuleAttributes addExcludedNamespacesItem(String excludedNamespacesItem) {
    if (this.excludedNamespaces == null) {
      this.excludedNamespaces = new ArrayList<>();
    }
    this.excludedNamespaces.add(excludedNamespacesItem);
    return this;
  }

  /**
   * <p>Attributes excluded from the scan. If namespaces is provided, it has to be a sub-path of the namespaces array.</p>
   * @return excludedNamespaces
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUDED_NAMESPACES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getExcludedNamespaces() {
        return excludedNamespaces;
      }
  public void setExcludedNamespaces(List<String> excludedNamespaces) {
    this.excludedNamespaces = excludedNamespaces;
  }
  public SensitiveDataScannerRuleAttributes includedKeywordConfiguration(SensitiveDataScannerIncludedKeywordConfiguration includedKeywordConfiguration) {
    this.includedKeywordConfiguration = includedKeywordConfiguration;
    this.unparsed |= includedKeywordConfiguration.unparsed;
    return this;
  }

  /**
   * <p>Object defining a set of keywords and a number of characters that help reduce noise.
   * You can provide a list of keywords you would like to check within a defined proximity of the matching pattern.
   * If any of the keywords are found within the proximity check, the match is kept.
   * If none are found, the match is discarded.</p>
   * @return includedKeywordConfiguration
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDED_KEYWORD_CONFIGURATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerIncludedKeywordConfiguration getIncludedKeywordConfiguration() {
        return includedKeywordConfiguration;
      }
  public void setIncludedKeywordConfiguration(SensitiveDataScannerIncludedKeywordConfiguration includedKeywordConfiguration) {
    this.includedKeywordConfiguration = includedKeywordConfiguration;
  }
  public SensitiveDataScannerRuleAttributes isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether or not the rule is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public SensitiveDataScannerRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the rule.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SensitiveDataScannerRuleAttributes namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }
  public SensitiveDataScannerRuleAttributes addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

  /**
   * <p>Attributes included in the scan. If namespaces is empty or missing, all attributes except excluded_namespaces are scanned.
   * If both are missing the whole event is scanned.</p>
   * @return namespaces
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAMESPACES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getNamespaces() {
        return namespaces;
      }
  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }
  public SensitiveDataScannerRuleAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * <p>Not included if there is a relationship to a standard pattern.</p>
   * @return pattern
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATTERN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPattern() {
        return pattern;
      }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }
  public SensitiveDataScannerRuleAttributes priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p>Integer from 1 (high) to 5 (low) indicating rule issue severity.</p>
   * minimum: 1
   * maximum: 5
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPriority() {
        return priority;
      }
  public void setPriority(Long priority) {
    this.priority = priority;
  }
  public SensitiveDataScannerRuleAttributes suppressions(SensitiveDataScannerSuppressions suppressions) {
    this.suppressions = suppressions;
    this.unparsed |= suppressions.unparsed;
    return this;
  }

  /**
   * <p>Object describing the suppressions for a rule. There are three types of suppressions, <code>starts_with</code>, <code>ends_with</code>, and <code>exact_match</code>.
   * Suppressed matches are not obfuscated, counted in metrics, or displayed in the Findings page.</p>
   * @return suppressions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUPPRESSIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerSuppressions getSuppressions() {
        return suppressions;
      }
  public void setSuppressions(SensitiveDataScannerSuppressions suppressions) {
    this.suppressions = suppressions;
  }
  public SensitiveDataScannerRuleAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SensitiveDataScannerRuleAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public SensitiveDataScannerRuleAttributes textReplacement(SensitiveDataScannerTextReplacement textReplacement) {
    this.textReplacement = textReplacement;
    this.unparsed |= textReplacement.unparsed;
    return this;
  }

  /**
   * <p>Object describing how the scanned event will be replaced.</p>
   * @return textReplacement
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEXT_REPLACEMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SensitiveDataScannerTextReplacement getTextReplacement() {
        return textReplacement;
      }
  public void setTextReplacement(SensitiveDataScannerTextReplacement textReplacement) {
    this.textReplacement = textReplacement;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SensitiveDataScannerRuleAttributes
   */
  @JsonAnySetter
  public SensitiveDataScannerRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SensitiveDataScannerRuleAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleAttributes sensitiveDataScannerRuleAttributes = (SensitiveDataScannerRuleAttributes) o;
    return Objects.equals(this.description, sensitiveDataScannerRuleAttributes.description) && Objects.equals(this.excludedNamespaces, sensitiveDataScannerRuleAttributes.excludedNamespaces) && Objects.equals(this.includedKeywordConfiguration, sensitiveDataScannerRuleAttributes.includedKeywordConfiguration) && Objects.equals(this.isEnabled, sensitiveDataScannerRuleAttributes.isEnabled) && Objects.equals(this.name, sensitiveDataScannerRuleAttributes.name) && Objects.equals(this.namespaces, sensitiveDataScannerRuleAttributes.namespaces) && Objects.equals(this.pattern, sensitiveDataScannerRuleAttributes.pattern) && Objects.equals(this.priority, sensitiveDataScannerRuleAttributes.priority) && Objects.equals(this.suppressions, sensitiveDataScannerRuleAttributes.suppressions) && Objects.equals(this.tags, sensitiveDataScannerRuleAttributes.tags) && Objects.equals(this.textReplacement, sensitiveDataScannerRuleAttributes.textReplacement) && Objects.equals(this.additionalProperties, sensitiveDataScannerRuleAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(description,excludedNamespaces,includedKeywordConfiguration,isEnabled,name,namespaces,pattern,priority,suppressions,tags,textReplacement, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excludedNamespaces: ").append(toIndentedString(excludedNamespaces)).append("\n");
    sb.append("    includedKeywordConfiguration: ").append(toIndentedString(includedKeywordConfiguration)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
