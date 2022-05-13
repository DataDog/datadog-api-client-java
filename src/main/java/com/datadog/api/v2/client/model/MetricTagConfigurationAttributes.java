/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.datadog.api.v2.client.JavaTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing the definition of a metric tag configuration attributes. */
@JsonPropertyOrder({
  MetricTagConfigurationAttributes.JSON_PROPERTY_AGGREGATIONS,
  MetricTagConfigurationAttributes.JSON_PROPERTY_CREATED_AT,
  MetricTagConfigurationAttributes.JSON_PROPERTY_INCLUDE_PERCENTILES,
  MetricTagConfigurationAttributes.JSON_PROPERTY_METRIC_TYPE,
  MetricTagConfigurationAttributes.JSON_PROPERTY_MODIFIED_AT,
  MetricTagConfigurationAttributes.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricTagConfigurationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATIONS = "aggregations";
  private List<MetricCustomAggregation> aggregations = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";

  @JsonSerialize(using = JavaTimeSerializer.class)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private MetricTagConfigurationMetricTypes metricType = MetricTagConfigurationMetricTypes.GAUGE;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";

  @JsonSerialize(using = JavaTimeSerializer.class)
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
   * also available: - time: avg, space: avg - time: avg, space: max - time: avg, space: min - time:
   * avg, space: sum - time: count, space: sum - time: max, space: max - time: min, space: min -
   * time: sum, space: avg - time: sum, space: sum Can only be applied to metrics that have a
   * &#x60;metric_type&#x60; of &#x60;count&#x60;, &#x60;rate&#x60;, or &#x60;gauge&#x60;.
   *
   * @return aggregations
   */
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MetricTagConfigurationAttributes includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Toggle to turn on/off percentile aggregations for distribution metrics. Only present when the
   * &#x60;metric_type&#x60; is &#x60;distribution&#x60;.
   *
   * @return includePercentiles
   */
  @javax.annotation.Nullable
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
   * The metric&#39;s type.
   *
   * @return metricType
   */
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
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
        && Objects.equals(
            this.includePercentiles, metricTagConfigurationAttributes.includePercentiles)
        && Objects.equals(this.metricType, metricTagConfigurationAttributes.metricType)
        && Objects.equals(this.modifiedAt, metricTagConfigurationAttributes.modifiedAt)
        && Objects.equals(this.tags, metricTagConfigurationAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregations, createdAt, includePercentiles, metricType, modifiedAt, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfigurationAttributes {\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
