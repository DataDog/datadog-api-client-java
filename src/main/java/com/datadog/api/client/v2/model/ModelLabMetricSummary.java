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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Summary statistics for a metric recorded during a Model Lab run. */
@JsonPropertyOrder({
  ModelLabMetricSummary.JSON_PROPERTY_COUNT,
  ModelLabMetricSummary.JSON_PROPERTY_FIRST_STEP,
  ModelLabMetricSummary.JSON_PROPERTY_KEY,
  ModelLabMetricSummary.JSON_PROPERTY_LAST_STEP,
  ModelLabMetricSummary.JSON_PROPERTY_LATEST,
  ModelLabMetricSummary.JSON_PROPERTY_MAX,
  ModelLabMetricSummary.JSON_PROPERTY_MEAN,
  ModelLabMetricSummary.JSON_PROPERTY_MIN,
  ModelLabMetricSummary.JSON_PROPERTY_STDDEV
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabMetricSummary {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_FIRST_STEP = "first_step";
  private JsonNullable<Long> firstStep = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_LAST_STEP = "last_step";
  private JsonNullable<Long> lastStep = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_LATEST = "latest";
  private JsonNullable<Double> latest = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MAX = "max";
  private JsonNullable<Double> max = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MEAN = "mean";
  private JsonNullable<Double> mean = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MIN = "min";
  private JsonNullable<Double> min = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_STDDEV = "stddev";
  private JsonNullable<Double> stddev = JsonNullable.<Double>undefined();

  public ModelLabMetricSummary() {}

  @JsonCreator
  public ModelLabMetricSummary(
      @JsonProperty(required = true, value = JSON_PROPERTY_COUNT) Long count,
      @JsonProperty(required = true, value = JSON_PROPERTY_KEY) String key) {
    this.count = count;
    this.key = key;
  }

  public ModelLabMetricSummary count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of recorded values.
   *
   * @return count
   */
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public ModelLabMetricSummary firstStep(Long firstStep) {
    this.firstStep = JsonNullable.<Long>of(firstStep);
    return this;
  }

  /**
   * The first step at which the metric was recorded.
   *
   * @return firstStep
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getFirstStep() {
    return firstStep.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIRST_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getFirstStep_JsonNullable() {
    return firstStep;
  }

  @JsonProperty(JSON_PROPERTY_FIRST_STEP)
  public void setFirstStep_JsonNullable(JsonNullable<Long> firstStep) {
    this.firstStep = firstStep;
  }

  public void setFirstStep(Long firstStep) {
    this.firstStep = JsonNullable.<Long>of(firstStep);
  }

  public ModelLabMetricSummary key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The metric name.
   *
   * @return key
   */
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ModelLabMetricSummary lastStep(Long lastStep) {
    this.lastStep = JsonNullable.<Long>of(lastStep);
    return this;
  }

  /**
   * The last step at which the metric was recorded.
   *
   * @return lastStep
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLastStep() {
    return lastStep.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLastStep_JsonNullable() {
    return lastStep;
  }

  @JsonProperty(JSON_PROPERTY_LAST_STEP)
  public void setLastStep_JsonNullable(JsonNullable<Long> lastStep) {
    this.lastStep = lastStep;
  }

  public void setLastStep(Long lastStep) {
    this.lastStep = JsonNullable.<Long>of(lastStep);
  }

  public ModelLabMetricSummary latest(Double latest) {
    this.latest = JsonNullable.<Double>of(latest);
    return this;
  }

  /**
   * The most recently recorded value.
   *
   * @return latest
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getLatest() {
    return latest.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getLatest_JsonNullable() {
    return latest;
  }

  @JsonProperty(JSON_PROPERTY_LATEST)
  public void setLatest_JsonNullable(JsonNullable<Double> latest) {
    this.latest = latest;
  }

  public void setLatest(Double latest) {
    this.latest = JsonNullable.<Double>of(latest);
  }

  public ModelLabMetricSummary max(Double max) {
    this.max = JsonNullable.<Double>of(max);
    return this;
  }

  /**
   * The maximum recorded value.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getMax() {
    return max.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMax_JsonNullable() {
    return max;
  }

  @JsonProperty(JSON_PROPERTY_MAX)
  public void setMax_JsonNullable(JsonNullable<Double> max) {
    this.max = max;
  }

  public void setMax(Double max) {
    this.max = JsonNullable.<Double>of(max);
  }

  public ModelLabMetricSummary mean(Double mean) {
    this.mean = JsonNullable.<Double>of(mean);
    return this;
  }

  /**
   * The mean of recorded values.
   *
   * @return mean
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getMean() {
    return mean.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMean_JsonNullable() {
    return mean;
  }

  @JsonProperty(JSON_PROPERTY_MEAN)
  public void setMean_JsonNullable(JsonNullable<Double> mean) {
    this.mean = mean;
  }

  public void setMean(Double mean) {
    this.mean = JsonNullable.<Double>of(mean);
  }

  public ModelLabMetricSummary min(Double min) {
    this.min = JsonNullable.<Double>of(min);
    return this;
  }

  /**
   * The minimum recorded value.
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getMin() {
    return min.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMin_JsonNullable() {
    return min;
  }

  @JsonProperty(JSON_PROPERTY_MIN)
  public void setMin_JsonNullable(JsonNullable<Double> min) {
    this.min = min;
  }

  public void setMin(Double min) {
    this.min = JsonNullable.<Double>of(min);
  }

  public ModelLabMetricSummary stddev(Double stddev) {
    this.stddev = JsonNullable.<Double>of(stddev);
    return this;
  }

  /**
   * The standard deviation of recorded values.
   *
   * @return stddev
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getStddev() {
    return stddev.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STDDEV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getStddev_JsonNullable() {
    return stddev;
  }

  @JsonProperty(JSON_PROPERTY_STDDEV)
  public void setStddev_JsonNullable(JsonNullable<Double> stddev) {
    this.stddev = stddev;
  }

  public void setStddev(Double stddev) {
    this.stddev = JsonNullable.<Double>of(stddev);
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
   * @return ModelLabMetricSummary
   */
  @JsonAnySetter
  public ModelLabMetricSummary putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabMetricSummary object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabMetricSummary modelLabMetricSummary = (ModelLabMetricSummary) o;
    return Objects.equals(this.count, modelLabMetricSummary.count)
        && Objects.equals(this.firstStep, modelLabMetricSummary.firstStep)
        && Objects.equals(this.key, modelLabMetricSummary.key)
        && Objects.equals(this.lastStep, modelLabMetricSummary.lastStep)
        && Objects.equals(this.latest, modelLabMetricSummary.latest)
        && Objects.equals(this.max, modelLabMetricSummary.max)
        && Objects.equals(this.mean, modelLabMetricSummary.mean)
        && Objects.equals(this.min, modelLabMetricSummary.min)
        && Objects.equals(this.stddev, modelLabMetricSummary.stddev)
        && Objects.equals(this.additionalProperties, modelLabMetricSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        count, firstStep, key, lastStep, latest, max, mean, min, stddev, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabMetricSummary {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    firstStep: ").append(toIndentedString(firstStep)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastStep: ").append(toIndentedString(lastStep)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    stddev: ").append(toIndentedString(stddev)).append("\n");
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
