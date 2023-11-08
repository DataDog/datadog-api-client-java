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

/** Object containing the definition of a metric tag configuration attributes. */
@JsonPropertyOrder({
  MetricTagConfigurationAttributes.JSON_PROPERTY_AGGREGATIONS,
  MetricTagConfigurationAttributes.JSON_PROPERTY_CREATED_AT,
  MetricTagConfigurationAttributes.JSON_PROPERTY_EXCLUDE_TAGS_MODE,
  MetricTagConfigurationAttributes.JSON_PROPERTY_INCLUDE_PERCENTILES,
  MetricTagConfigurationAttributes.JSON_PROPERTY_METRIC_TYPE,
  MetricTagConfigurationAttributes.JSON_PROPERTY_MODIFIED_AT,
  MetricTagConfigurationAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricTagConfigurationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATIONS = "aggregations";
  private List<MetricCustomAggregation> aggregations = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXCLUDE_TAGS_MODE = "exclude_tags_mode";
  private Boolean excludeTagsMode;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private MetricTagConfigurationMetricTypes metricType = MetricTagConfigurationMetricTypes.GAUGE;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public MetricTagConfigurationAttributes aggregations(List<MetricCustomAggregation> aggregations) {
    this.aggregations = aggregations;
    for (MetricCustomAggregation item : aggregations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MetricTagConfigurationAttributes addAggregationsItem(
      MetricCustomAggregation aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<>();
    }
    this.aggregations.add(aggregationsItem);
    this.unparsed |= aggregationsItem.unparsed;
    return this;
  }

  /**
   * A list of queryable aggregation combinations for a count, rate, or gauge metric. By default,
   * count and rate metrics require the (time: sum, space: sum) aggregation and Gauge metrics
   * require the (time: avg, space: avg) aggregation. Additional time &amp; space combinations are
   * also available:
   *
   * <ul>
   *   <li>time: avg, space: avg
   *   <li>time: avg, space: max
   *   <li>time: avg, space: min
   *   <li>time: avg, space: sum
   *   <li>time: count, space: sum
   *   <li>time: max, space: max
   *   <li>time: min, space: min
   *   <li>time: sum, space: avg
   *   <li>time: sum, space: sum
   * </ul>
   *
   * <p>Can only be applied to metrics that have a <code>metric_type</code> of <code>count</code>,
   * <code>rate</code>, or <code>gauge</code>.
   *
   * @return aggregations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MetricCustomAggregation> getAggregations() {
    return aggregations;
  }

  public void setAggregations(List<MetricCustomAggregation> aggregations) {
    this.aggregations = aggregations;
  }

  public MetricTagConfigurationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the tag configuration was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MetricTagConfigurationAttributes excludeTagsMode(Boolean excludeTagsMode) {
    this.excludeTagsMode = excludeTagsMode;
    return this;
  }

  /**
   * When set to true, the configuration will exclude the configured tags and include any other
   * submitted tags. When set to false, the configuration will include the configured tags and
   * exclude any other submitted tags. Defaults to false. Requires <code>tags</code> property.
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

  public MetricTagConfigurationAttributes includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Toggle to include or exclude percentile aggregations for distribution metrics. Only present
   * when the <code>metric_type</code> is <code>distribution</code>.
   *
   * @return includePercentiles
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_PERCENTILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludePercentiles() {
    return includePercentiles;
  }

  public void setIncludePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
  }

  public MetricTagConfigurationAttributes metricType(MetricTagConfigurationMetricTypes metricType) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    return this;
  }

  /**
   * The metric's type.
   *
   * @return metricType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricTagConfigurationMetricTypes getMetricType() {
    return metricType;
  }

  public void setMetricType(MetricTagConfigurationMetricTypes metricType) {
    if (!metricType.isValid()) {
      this.unparsed = true;
    }
    this.metricType = metricType;
  }

  public MetricTagConfigurationAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the tag configuration was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public MetricTagConfigurationAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricTagConfigurationAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tag keys on which to group.
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
   * @return MetricTagConfigurationAttributes
   */
  @JsonAnySetter
  public MetricTagConfigurationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MetricTagConfigurationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricTagConfigurationAttributes metricTagConfigurationAttributes =
        (MetricTagConfigurationAttributes) o;
    return Objects.equals(this.aggregations, metricTagConfigurationAttributes.aggregations)
        && Objects.equals(this.createdAt, metricTagConfigurationAttributes.createdAt)
        && Objects.equals(this.excludeTagsMode, metricTagConfigurationAttributes.excludeTagsMode)
        && Objects.equals(
            this.includePercentiles, metricTagConfigurationAttributes.includePercentiles)
        && Objects.equals(this.metricType, metricTagConfigurationAttributes.metricType)
        && Objects.equals(this.modifiedAt, metricTagConfigurationAttributes.modifiedAt)
        && Objects.equals(this.tags, metricTagConfigurationAttributes.tags)
        && Objects.equals(
            this.additionalProperties, metricTagConfigurationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregations,
        createdAt,
        excludeTagsMode,
        includePercentiles,
        metricType,
        modifiedAt,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfigurationAttributes {\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    excludeTagsMode: ").append(toIndentedString(excludeTagsMode)).append("\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
