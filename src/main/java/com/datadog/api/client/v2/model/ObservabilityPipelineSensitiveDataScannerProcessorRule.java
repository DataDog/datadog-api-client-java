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
 * Defines a rule for detecting sensitive data, including matching pattern, scope, and the action to
 * take.
 */
@JsonPropertyOrder({
  ObservabilityPipelineSensitiveDataScannerProcessorRule.JSON_PROPERTY_KEYWORD_OPTIONS,
  ObservabilityPipelineSensitiveDataScannerProcessorRule.JSON_PROPERTY_NAME,
  ObservabilityPipelineSensitiveDataScannerProcessorRule.JSON_PROPERTY_ON_MATCH,
  ObservabilityPipelineSensitiveDataScannerProcessorRule.JSON_PROPERTY_PATTERN,
  ObservabilityPipelineSensitiveDataScannerProcessorRule.JSON_PROPERTY_SCOPE,
  ObservabilityPipelineSensitiveDataScannerProcessorRule.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSensitiveDataScannerProcessorRule {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KEYWORD_OPTIONS = "keyword_options";
  private ObservabilityPipelineSensitiveDataScannerProcessorKeywordOptions keywordOptions;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ON_MATCH = "on_match";
  private ObservabilityPipelineSensitiveDataScannerProcessorAction onMatch;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private ObservabilityPipelineSensitiveDataScannerProcessorPattern pattern;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private ObservabilityPipelineSensitiveDataScannerProcessorScope scope;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public ObservabilityPipelineSensitiveDataScannerProcessorRule() {}

  @JsonCreator
  public ObservabilityPipelineSensitiveDataScannerProcessorRule(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ON_MATCH)
          ObservabilityPipelineSensitiveDataScannerProcessorAction onMatch,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATTERN)
          ObservabilityPipelineSensitiveDataScannerProcessorPattern pattern,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE)
          ObservabilityPipelineSensitiveDataScannerProcessorScope scope) {
    this.name = name;
    this.onMatch = onMatch;
    this.unparsed |= onMatch.unparsed;
    this.pattern = pattern;
    this.unparsed |= pattern.unparsed;
    this.scope = scope;
    this.unparsed |= scope.unparsed;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule keywordOptions(
      ObservabilityPipelineSensitiveDataScannerProcessorKeywordOptions keywordOptions) {
    this.keywordOptions = keywordOptions;
    this.unparsed |= keywordOptions.unparsed;
    return this;
  }

  /**
   * Configuration for keywords used to reinforce sensitive data pattern detection.
   *
   * @return keywordOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEYWORD_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineSensitiveDataScannerProcessorKeywordOptions getKeywordOptions() {
    return keywordOptions;
  }

  public void setKeywordOptions(
      ObservabilityPipelineSensitiveDataScannerProcessorKeywordOptions keywordOptions) {
    this.keywordOptions = keywordOptions;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A name identifying the rule.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule onMatch(
      ObservabilityPipelineSensitiveDataScannerProcessorAction onMatch) {
    this.onMatch = onMatch;
    this.unparsed |= onMatch.unparsed;
    return this;
  }

  /**
   * Defines what action to take when sensitive data is matched.
   *
   * @return onMatch
   */
  @JsonProperty(JSON_PROPERTY_ON_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorAction getOnMatch() {
    return onMatch;
  }

  public void setOnMatch(ObservabilityPipelineSensitiveDataScannerProcessorAction onMatch) {
    this.onMatch = onMatch;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule pattern(
      ObservabilityPipelineSensitiveDataScannerProcessorPattern pattern) {
    this.pattern = pattern;
    this.unparsed |= pattern.unparsed;
    return this;
  }

  /**
   * Pattern detection configuration for identifying sensitive data using either a custom regex or a
   * library reference.
   *
   * @return pattern
   */
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorPattern getPattern() {
    return pattern;
  }

  public void setPattern(ObservabilityPipelineSensitiveDataScannerProcessorPattern pattern) {
    this.pattern = pattern;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule scope(
      ObservabilityPipelineSensitiveDataScannerProcessorScope scope) {
    this.scope = scope;
    this.unparsed |= scope.unparsed;
    return this;
  }

  /**
   * Determines which parts of the log the pattern-matching rule should be applied to.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSensitiveDataScannerProcessorScope getScope() {
    return scope;
  }

  public void setScope(ObservabilityPipelineSensitiveDataScannerProcessorScope scope) {
    this.scope = scope;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ObservabilityPipelineSensitiveDataScannerProcessorRule addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Optional tags assigned to this rule for filtering and classification.
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
   * @return ObservabilityPipelineSensitiveDataScannerProcessorRule
   */
  @JsonAnySetter
  public ObservabilityPipelineSensitiveDataScannerProcessorRule putAdditionalProperty(
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

  /**
   * Return true if this ObservabilityPipelineSensitiveDataScannerProcessorRule object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSensitiveDataScannerProcessorRule
        observabilityPipelineSensitiveDataScannerProcessorRule =
            (ObservabilityPipelineSensitiveDataScannerProcessorRule) o;
    return Objects.equals(
            this.keywordOptions,
            observabilityPipelineSensitiveDataScannerProcessorRule.keywordOptions)
        && Objects.equals(this.name, observabilityPipelineSensitiveDataScannerProcessorRule.name)
        && Objects.equals(
            this.onMatch, observabilityPipelineSensitiveDataScannerProcessorRule.onMatch)
        && Objects.equals(
            this.pattern, observabilityPipelineSensitiveDataScannerProcessorRule.pattern)
        && Objects.equals(this.scope, observabilityPipelineSensitiveDataScannerProcessorRule.scope)
        && Objects.equals(this.tags, observabilityPipelineSensitiveDataScannerProcessorRule.tags)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineSensitiveDataScannerProcessorRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordOptions, name, onMatch, pattern, scope, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSensitiveDataScannerProcessorRule {\n");
    sb.append("    keywordOptions: ").append(toIndentedString(keywordOptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onMatch: ").append(toIndentedString(onMatch)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
