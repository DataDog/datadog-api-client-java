/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A metric to submit to Datadog. See [Datadog
 * metrics](https://docs.datadoghq.com/developers/metrics/#custom-metrics-properties).
 */
@ApiModel(
    description =
        "A metric to submit to Datadog. See [Datadog"
            + " metrics](https://docs.datadoghq.com/developers/metrics/#custom-metrics-properties).")
@JsonPropertyOrder({
  Series.JSON_PROPERTY_HOST,
  Series.JSON_PROPERTY_INTERVAL,
  Series.JSON_PROPERTY_METRIC,
  Series.JSON_PROPERTY_POINTS,
  Series.JSON_PROPERTY_TAGS,
  Series.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Series {
  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private JsonNullable<Long> interval = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<List<Double>> points = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "gauge";

  public Series() {}

  @JsonCreator
  public Series(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric,
      @JsonProperty(required = true, value = JSON_PROPERTY_POINTS) List<List<Double>> points) {
    this.metric = metric;
    this.points = points;
  }

  public Series host(String host) {
    this.host = host;
    return this;
  }

  /**
   * The name of the host that produced the metric.
   *
   * @return host
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "test.example.com",
      value = "The name of the host that produced the metric.")
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Series interval(Long interval) {
    this.interval = JsonNullable.<Long>of(interval);
    return this;
  }

  /**
   * If the type of the metric is rate or count, define the corresponding interval.
   *
   * @return interval
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "20",
      value = "If the type of the metric is rate or count, define the corresponding interval.")
  @JsonIgnore
  public Long getInterval() {
    return interval.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getInterval_JsonNullable() {
    return interval;
  }

  @JsonProperty(JSON_PROPERTY_INTERVAL)
  public void setInterval_JsonNullable(JsonNullable<Long> interval) {
    this.interval = interval;
  }

  public void setInterval(Long interval) {
    this.interval = JsonNullable.<Long>of(interval);
  }

  public Series metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The name of the timeseries.
   *
   * @return metric
   */
  @ApiModelProperty(
      example = "system.load.1",
      required = true,
      value = "The name of the timeseries.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public Series points(List<List<Double>> points) {
    this.points = points;
    return this;
  }

  public Series addPointsItem(List<Double> pointsItem) {
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Points relating to a metric. All points must be tuples with timestamp and a scalar value
   * (cannot be a string). Timestamps should be in POSIX time in seconds, and cannot be more than
   * ten minutes in the future or more than one hour in the past.
   *
   * @return points
   */
  @ApiModelProperty(
      example = "[[1575317847,0.5]]",
      required = true,
      value =
          "Points relating to a metric. All points must be tuples with timestamp and a scalar"
              + " value (cannot be a string). Timestamps should be in POSIX time in seconds, and"
              + " cannot be more than ten minutes in the future or more than one hour in the"
              + " past.")
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<List<Double>> getPoints() {
    return points;
  }

  public void setPoints(List<List<Double>> points) {
    this.points = points;
  }

  public Series tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Series addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags associated with the metric.
   *
   * @return tags
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "[\"environment:test\"]",
      value = "A list of tags associated with the metric.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Series type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the metric either &#x60;count&#x60;, &#x60;gauge&#x60;, or &#x60;rate&#x60;.
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "rate",
      value = "The type of the metric either `count`, `gauge`, or `rate`.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /** Return true if this Series object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Series series = (Series) o;
    return Objects.equals(this.host, series.host)
        && Objects.equals(this.interval, series.interval)
        && Objects.equals(this.metric, series.metric)
        && Objects.equals(this.points, series.points)
        && Objects.equals(this.tags, series.tags)
        && Objects.equals(this.type, series.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, interval, metric, points, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
