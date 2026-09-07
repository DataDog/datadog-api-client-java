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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Data payload for tag indexing rule options. */
@JsonPropertyOrder({
  TagIndexingRuleOptionsData.JSON_PROPERTY_DYNAMIC_TAGS,
  TagIndexingRuleOptionsData.JSON_PROPERTY_MANAGE_PREEXISTING_METRICS,
  TagIndexingRuleOptionsData.JSON_PROPERTY_METRIC_MATCH,
  TagIndexingRuleOptionsData.JSON_PROPERTY_OVERRIDE_PREVIOUS_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagIndexingRuleOptionsData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DYNAMIC_TAGS = "dynamic_tags";
  private TagIndexingRuleDynamicTags dynamicTags;

  public static final String JSON_PROPERTY_MANAGE_PREEXISTING_METRICS =
      "manage_preexisting_metrics";
  private Boolean managePreexistingMetrics;

  public static final String JSON_PROPERTY_METRIC_MATCH = "metric_match";
  private TagIndexingRuleMetricMatch metricMatch;

  public static final String JSON_PROPERTY_OVERRIDE_PREVIOUS_RULES = "override_previous_rules";
  private Boolean overridePreviousRules;

  public TagIndexingRuleOptionsData dynamicTags(TagIndexingRuleDynamicTags dynamicTags) {
    this.dynamicTags = dynamicTags;
    this.unparsed |= dynamicTags.unparsed;
    return this;
  }

  /**
   * Options for dynamic tag indexing applied per metric, such as tags filtered by query usage.
   *
   * <p>Before a tag key is dropped by this rule, two grace period conditions must be met:
   *
   * <ol>
   *   <li>The metric must be submitted for at least as long as the selected window.
   *   <li>A tag key must have been submitted for at least 15 days.
   * </ol>
   *
   * <p>Any metric or tag key that does not meet these conditions are excluded from this indexing
   * rule. The <code>exclude_not_*</code> fields require <code>exclude_tags_mode</code> to be set to
   * <code>true</code>.
   *
   * @return dynamicTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DYNAMIC_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TagIndexingRuleDynamicTags getDynamicTags() {
    return dynamicTags;
  }

  public void setDynamicTags(TagIndexingRuleDynamicTags dynamicTags) {
    this.dynamicTags = dynamicTags;
    if (dynamicTags != null) {
      this.unparsed |= dynamicTags.unparsed;
    }
  }

  public TagIndexingRuleOptionsData managePreexistingMetrics(Boolean managePreexistingMetrics) {
    this.managePreexistingMetrics = managePreexistingMetrics;
    return this;
  }

  /**
   * When true, the rule applies to metrics that were ingested before the rule was created.
   *
   * @return managePreexistingMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGE_PREEXISTING_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getManagePreexistingMetrics() {
    return managePreexistingMetrics;
  }

  public void setManagePreexistingMetrics(Boolean managePreexistingMetrics) {
    this.managePreexistingMetrics = managePreexistingMetrics;
  }

  public TagIndexingRuleOptionsData metricMatch(TagIndexingRuleMetricMatch metricMatch) {
    this.metricMatch = metricMatch;
    this.unparsed |= metricMatch.unparsed;
    return this;
  }

  /**
   * Criteria for matching metrics based on query state.
   *
   * @return metricMatch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TagIndexingRuleMetricMatch getMetricMatch() {
    return metricMatch;
  }

  public void setMetricMatch(TagIndexingRuleMetricMatch metricMatch) {
    this.metricMatch = metricMatch;
    if (metricMatch != null) {
      this.unparsed |= metricMatch.unparsed;
    }
  }

  public TagIndexingRuleOptionsData overridePreviousRules(Boolean overridePreviousRules) {
    this.overridePreviousRules = overridePreviousRules;
    return this;
  }

  /**
   * When true, this rule's tag list overrides tags configured by earlier rules for the same metric.
   * When false (default), tags from all matching rules are combined.
   *
   * @return overridePreviousRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERRIDE_PREVIOUS_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOverridePreviousRules() {
    return overridePreviousRules;
  }

  public void setOverridePreviousRules(Boolean overridePreviousRules) {
    this.overridePreviousRules = overridePreviousRules;
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
   * @return TagIndexingRuleOptionsData
   */
  @JsonAnySetter
  public TagIndexingRuleOptionsData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagIndexingRuleOptionsData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagIndexingRuleOptionsData tagIndexingRuleOptionsData = (TagIndexingRuleOptionsData) o;
    return Objects.equals(this.dynamicTags, tagIndexingRuleOptionsData.dynamicTags)
        && Objects.equals(
            this.managePreexistingMetrics, tagIndexingRuleOptionsData.managePreexistingMetrics)
        && Objects.equals(this.metricMatch, tagIndexingRuleOptionsData.metricMatch)
        && Objects.equals(
            this.overridePreviousRules, tagIndexingRuleOptionsData.overridePreviousRules)
        && Objects.equals(
            this.additionalProperties, tagIndexingRuleOptionsData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dynamicTags,
        managePreexistingMetrics,
        metricMatch,
        overridePreviousRules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagIndexingRuleOptionsData {\n");
    sb.append("    dynamicTags: ").append(toIndentedString(dynamicTags)).append("\n");
    sb.append("    managePreexistingMetrics: ")
        .append(toIndentedString(managePreexistingMetrics))
        .append("\n");
    sb.append("    metricMatch: ").append(toIndentedString(metricMatch)).append("\n");
    sb.append("    overridePreviousRules: ")
        .append(toIndentedString(overridePreviousRules))
        .append("\n");
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
