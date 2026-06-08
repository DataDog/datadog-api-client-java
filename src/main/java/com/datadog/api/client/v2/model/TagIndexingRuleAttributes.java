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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a tag indexing rule. */
@JsonPropertyOrder({
  TagIndexingRuleAttributes.JSON_PROPERTY_CREATED_AT,
  TagIndexingRuleAttributes.JSON_PROPERTY_CREATED_BY_HANDLE,
  TagIndexingRuleAttributes.JSON_PROPERTY_EXCLUDE_TAGS_MODE,
  TagIndexingRuleAttributes.JSON_PROPERTY_IGNORED_METRIC_NAME_MATCHES,
  TagIndexingRuleAttributes.JSON_PROPERTY_METRIC_NAME_MATCHES,
  TagIndexingRuleAttributes.JSON_PROPERTY_MODIFIED_AT,
  TagIndexingRuleAttributes.JSON_PROPERTY_MODIFIED_BY_HANDLE,
  TagIndexingRuleAttributes.JSON_PROPERTY_NAME,
  TagIndexingRuleAttributes.JSON_PROPERTY_OPTIONS,
  TagIndexingRuleAttributes.JSON_PROPERTY_RULE_ORDER,
  TagIndexingRuleAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagIndexingRuleAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY_HANDLE = "created_by_handle";
  private String createdByHandle;

  public static final String JSON_PROPERTY_EXCLUDE_TAGS_MODE = "exclude_tags_mode";
  private Boolean excludeTagsMode;

  public static final String JSON_PROPERTY_IGNORED_METRIC_NAME_MATCHES =
      "ignored_metric_name_matches";
  private List<String> ignoredMetricNameMatches = null;

  public static final String JSON_PROPERTY_METRIC_NAME_MATCHES = "metric_name_matches";
  private List<String> metricNameMatches = null;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY_HANDLE = "modified_by_handle";
  private String modifiedByHandle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private TagIndexingRuleOptions options;

  public static final String JSON_PROPERTY_RULE_ORDER = "rule_order";
  private Long ruleOrder;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  /**
   * Timestamp when the rule was created.
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
   * Handle of the user who created the rule.
   *
   * @return createdByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedByHandle() {
    return createdByHandle;
  }

  public TagIndexingRuleAttributes excludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
    return this;
  }

  /**
   * When true, the rule excludes the listed tags and indexes all others. When false (default), the
   * rule includes only the listed tags.
   *
   * @return excludeTagsMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_TAGS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeTagsMode() {
    return excludeTagsMode;
  }

  public void setExcludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
  }

  public TagIndexingRuleAttributes ignoredMetricNameMatches(List<String> ignoredMetricNameMatches) {
    this.ignoredMetricNameMatches = ignoredMetricNameMatches;
    return this;
  }

  public TagIndexingRuleAttributes addIgnoredMetricNameMatchesItem(
      String ignoredMetricNameMatchesItem) {
    if (this.ignoredMetricNameMatches == null) {
      this.ignoredMetricNameMatches = new ArrayList<>();
    }
    this.ignoredMetricNameMatches.add(ignoredMetricNameMatchesItem);
    return this;
  }

  /**
   * Metric name prefixes excluded from the rule's scope.
   *
   * @return ignoredMetricNameMatches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORED_METRIC_NAME_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIgnoredMetricNameMatches() {
    return ignoredMetricNameMatches;
  }

  public void setIgnoredMetricNameMatches(List<String> ignoredMetricNameMatches) {
    this.ignoredMetricNameMatches = ignoredMetricNameMatches;
  }

  public TagIndexingRuleAttributes metricNameMatches(List<String> metricNameMatches) {
    this.metricNameMatches = metricNameMatches;
    return this;
  }

  public TagIndexingRuleAttributes addMetricNameMatchesItem(String metricNameMatchesItem) {
    if (this.metricNameMatches == null) {
      this.metricNameMatches = new ArrayList<>();
    }
    this.metricNameMatches.add(metricNameMatchesItem);
    return this;
  }

  /**
   * Metric name prefixes (glob patterns) this rule applies to.
   *
   * @return metricNameMatches
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_NAME_MATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMetricNameMatches() {
    return metricNameMatches;
  }

  public void setMetricNameMatches(List<String> metricNameMatches) {
    this.metricNameMatches = metricNameMatches;
  }

  /**
   * Timestamp when the rule was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Handle of the user who last modified the rule.
   *
   * @return modifiedByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModifiedByHandle() {
    return modifiedByHandle;
  }

  public TagIndexingRuleAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Human-readable name for the rule.
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

  public TagIndexingRuleAttributes options(TagIndexingRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Versioned configuration options for a tag indexing rule.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TagIndexingRuleOptions getOptions() {
    return options;
  }

  public void setOptions(TagIndexingRuleOptions options) {
    this.options = options;
  }

  /**
   * Evaluation order within the org. Lower values are evaluated first. Assigned server-side on
   * create (max+1); pass on update to change the rule's position.
   *
   * @return ruleOrder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRuleOrder() {
    return ruleOrder;
  }

  public TagIndexingRuleAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TagIndexingRuleAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tag keys managed by this rule.
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
   * @return TagIndexingRuleAttributes
   */
  @JsonAnySetter
  public TagIndexingRuleAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagIndexingRuleAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagIndexingRuleAttributes tagIndexingRuleAttributes = (TagIndexingRuleAttributes) o;
    return Objects.equals(this.createdAt, tagIndexingRuleAttributes.createdAt)
        && Objects.equals(this.createdByHandle, tagIndexingRuleAttributes.createdByHandle)
        && Objects.equals(this.excludeTagsMode, tagIndexingRuleAttributes.excludeTagsMode)
        && Objects.equals(
            this.ignoredMetricNameMatches, tagIndexingRuleAttributes.ignoredMetricNameMatches)
        && Objects.equals(this.metricNameMatches, tagIndexingRuleAttributes.metricNameMatches)
        && Objects.equals(this.modifiedAt, tagIndexingRuleAttributes.modifiedAt)
        && Objects.equals(this.modifiedByHandle, tagIndexingRuleAttributes.modifiedByHandle)
        && Objects.equals(this.name, tagIndexingRuleAttributes.name)
        && Objects.equals(this.options, tagIndexingRuleAttributes.options)
        && Objects.equals(this.ruleOrder, tagIndexingRuleAttributes.ruleOrder)
        && Objects.equals(this.tags, tagIndexingRuleAttributes.tags)
        && Objects.equals(
            this.additionalProperties, tagIndexingRuleAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdByHandle,
        excludeTagsMode,
        ignoredMetricNameMatches,
        metricNameMatches,
        modifiedAt,
        modifiedByHandle,
        name,
        options,
        ruleOrder,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagIndexingRuleAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByHandle: ").append(toIndentedString(createdByHandle)).append("\n");
    sb.append("    excludeTagsMode: ").append(toIndentedString(excludeTagsMode)).append("\n");
    sb.append("    ignoredMetricNameMatches: ")
        .append(toIndentedString(ignoredMetricNameMatches))
        .append("\n");
    sb.append("    metricNameMatches: ").append(toIndentedString(metricNameMatches)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedByHandle: ").append(toIndentedString(modifiedByHandle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    ruleOrder: ").append(toIndentedString(ruleOrder)).append("\n");
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
