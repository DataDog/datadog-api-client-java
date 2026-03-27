/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of the Sensitive Data Scanner standard pattern. */
@JsonPropertyOrder({
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_INCLUDED_KEYWORDS,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_PATTERN,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_PRIORITY,
  SensitiveDataScannerStandardPatternAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerStandardPatternAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INCLUDED_KEYWORDS = "included_keywords";
  private List<String> includedKeywords = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Long priority;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public SensitiveDataScannerStandardPatternAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the standard pattern.
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

  public SensitiveDataScannerStandardPatternAttributes includedKeywords(
      List<String> includedKeywords) {
    this.includedKeywords = includedKeywords;
    return this;
  }

  public SensitiveDataScannerStandardPatternAttributes addIncludedKeywordsItem(
      String includedKeywordsItem) {
    if (this.includedKeywords == null) {
      this.includedKeywords = new ArrayList<>();
    }
    this.includedKeywords.add(includedKeywordsItem);
    return this;
  }

  /**
   * List of included keywords.
   *
   * @return includedKeywords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIncludedKeywords() {
    return includedKeywords;
  }

  public void setIncludedKeywords(List<String> includedKeywords) {
    this.includedKeywords = includedKeywords;
  }

  public SensitiveDataScannerStandardPatternAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the standard pattern.
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

  public SensitiveDataScannerStandardPatternAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * (Deprecated) Regex to match, optionally documented for older standard rules. Refer to the
   * <code>description</code> field to understand what the rule does.
   *
   * @return pattern
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPattern() {
    return pattern;
  }

  @Deprecated
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public SensitiveDataScannerStandardPatternAttributes priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Integer from 1 (high) to 5 (low) indicating standard pattern issue severity. minimum: 1
   * maximum: 5
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public SensitiveDataScannerStandardPatternAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SensitiveDataScannerStandardPatternAttributes addTagsItem(String tagsItem) {
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
   * @return SensitiveDataScannerStandardPatternAttributes
   */
  @JsonAnySetter
  public SensitiveDataScannerStandardPatternAttributes putAdditionalProperty(
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

  /** Return true if this SensitiveDataScannerStandardPatternAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerStandardPatternAttributes sensitiveDataScannerStandardPatternAttributes =
        (SensitiveDataScannerStandardPatternAttributes) o;
    return Objects.equals(
            this.description, sensitiveDataScannerStandardPatternAttributes.description)
        && Objects.equals(
            this.includedKeywords, sensitiveDataScannerStandardPatternAttributes.includedKeywords)
        && Objects.equals(this.name, sensitiveDataScannerStandardPatternAttributes.name)
        && Objects.equals(this.pattern, sensitiveDataScannerStandardPatternAttributes.pattern)
        && Objects.equals(this.priority, sensitiveDataScannerStandardPatternAttributes.priority)
        && Objects.equals(this.tags, sensitiveDataScannerStandardPatternAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            sensitiveDataScannerStandardPatternAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, includedKeywords, name, pattern, priority, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerStandardPatternAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includedKeywords: ").append(toIndentedString(includedKeywords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
