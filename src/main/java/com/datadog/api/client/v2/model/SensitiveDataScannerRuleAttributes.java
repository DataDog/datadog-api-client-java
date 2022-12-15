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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attributes of the Sensitive Data Scanner rule. */
@JsonPropertyOrder({
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_DESCRIPTION,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_EXCLUDED_ATTRIBUTES,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_IS_ENABLED,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_NAME,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_PATTERN,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_TAGS,
  SensitiveDataScannerRuleAttributes.JSON_PROPERTY_TEXT_REPLACEMENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXCLUDED_ATTRIBUTES = "excluded_attributes";
  private List<String> excludedAttributes = null;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEXT_REPLACEMENT = "text_replacement";
  private SensitiveDataScannerTextReplacement textReplacement;

  public SensitiveDataScannerRuleAttributes description(String description) {
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

  public SensitiveDataScannerRuleAttributes excludedAttributes(List<String> excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
    return this;
  }

  public SensitiveDataScannerRuleAttributes addExcludedAttributesItem(
      String excludedAttributesItem) {
    if (this.excludedAttributes == null) {
      this.excludedAttributes = new ArrayList<>();
    }
    this.excludedAttributes.add(excludedAttributesItem);
    return this;
  }

  /**
   * Attributes excluded from the scan.
   *
   * @return excludedAttributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludedAttributes() {
    return excludedAttributes;
  }

  public void setExcludedAttributes(List<String> excludedAttributes) {
    this.excludedAttributes = excludedAttributes;
  }

  public SensitiveDataScannerRuleAttributes isEnabled(Boolean isEnabled) {
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

  public SensitiveDataScannerRuleAttributes name(String name) {
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

  public SensitiveDataScannerRuleAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Not included if there is a relationship to a standard pattern.
   *
   * @return pattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
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

  public SensitiveDataScannerRuleAttributes textReplacement(
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
  }

  /** Return true if this SensitiveDataScannerRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleAttributes sensitiveDataScannerRuleAttributes =
        (SensitiveDataScannerRuleAttributes) o;
    return Objects.equals(this.description, sensitiveDataScannerRuleAttributes.description)
        && Objects.equals(
            this.excludedAttributes, sensitiveDataScannerRuleAttributes.excludedAttributes)
        && Objects.equals(this.isEnabled, sensitiveDataScannerRuleAttributes.isEnabled)
        && Objects.equals(this.name, sensitiveDataScannerRuleAttributes.name)
        && Objects.equals(this.pattern, sensitiveDataScannerRuleAttributes.pattern)
        && Objects.equals(this.tags, sensitiveDataScannerRuleAttributes.tags)
        && Objects.equals(this.textReplacement, sensitiveDataScannerRuleAttributes.textReplacement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, excludedAttributes, isEnabled, name, pattern, tags, textReplacement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excludedAttributes: ").append(toIndentedString(excludedAttributes)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    textReplacement: ").append(toIndentedString(textReplacement)).append("\n");
    sb.append("}");
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
