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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing the definition of a metric tag configuration to be created. */
@JsonPropertyOrder({
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_AGGREGATIONS,
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_INCLUDE_PERCENTILES,
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_METRIC_TYPE,
  MetricTagConfigurationCreateAttributes.JSON_PROPERTY_TAGS
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricTagConfigurationCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATIONS = "aggregations";
  private List<MetricCustomAggregation> aggregations = null;

  public static final String JSON_PROPERTY_INCLUDE_PERCENTILES = "include_percentiles";
  private Boolean includePercentiles = false;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metric_type";
  private MetricTagConfigurationMetricTypes metricType = MetricTagConfigurationMetricTypes.GAUGE;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public MetricTagConfigurationCreateAttributes() {}

  @JsonCreator
  public MetricTagConfigurationCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_TYPE)
          MetricTagConfigurationMetricTypes metricType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    this.tags = tags;
  }

  public MetricTagConfigurationCreateAttributes aggregations(
      List<MetricCustomAggregation> aggregations) {
    this.aggregations = aggregations;
    for (MetricCustomAggregation item : aggregations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MetricTagConfigurationCreateAttributes addAggregationsItem(
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

  public MetricTagConfigurationCreateAttributes includePercentiles(Boolean includePercentiles) {
    this.includePercentiles = includePercentiles;
    return this;
  }

  /**
   * Toggle to include/exclude percentiles for a distribution metric. Defaults to false. Can only be
   * applied to metrics that have a &#x60;metric_type&#x60; of &#x60;distribution&#x60;.
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

  public MetricTagConfigurationCreateAttributes metricType(
      MetricTagConfigurationMetricTypes metricType) {
    this.metricType = metricType;
    this.unparsed |= !metricType.isValid();
    return this;
  }

  /**
   * The metric&#39;s type.
   *
   * @return metricType
   */
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricTagConfigurationMetricTypes getMetricType() {
    return metricType;
  }

  public void setMetricType(MetricTagConfigurationMetricTypes metricType) {
    if (!metricType.isValid()) {
      this.unparsed = true;
    }
    this.metricType = metricType;
  }

  public MetricTagConfigurationCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MetricTagConfigurationCreateAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tag keys that will be queryable for your metric.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /** Return true if this MetricTagConfigurationCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricTagConfigurationCreateAttributes metricTagConfigurationCreateAttributes =
        (MetricTagConfigurationCreateAttributes) o;
    return Objects.equals(this.aggregations, metricTagConfigurationCreateAttributes.aggregations)
        && Objects.equals(
            this.includePercentiles, metricTagConfigurationCreateAttributes.includePercentiles)
        && Objects.equals(this.metricType, metricTagConfigurationCreateAttributes.metricType)
        && Objects.equals(this.tags, metricTagConfigurationCreateAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregations, includePercentiles, metricType, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricTagConfigurationCreateAttributes {\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    includePercentiles: ").append(toIndentedString(includePercentiles)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
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
