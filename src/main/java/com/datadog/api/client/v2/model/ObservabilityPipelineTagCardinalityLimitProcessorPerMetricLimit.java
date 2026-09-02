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

/** A cardinality override applied to a specific metric. */
@JsonPropertyOrder({
  ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit
      .JSON_PROPERTY_LIMIT_EXCEEDED_ACTION,
  ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.JSON_PROPERTY_METRIC_NAME,
  ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.JSON_PROPERTY_OVERRIDE_TYPE,
  ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.JSON_PROPERTY_PER_TAG_LIMITS,
  ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.JSON_PROPERTY_VALUE_LIMIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT_EXCEEDED_ACTION = "limit_exceeded_action";
  private ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction;

  public static final String JSON_PROPERTY_METRIC_NAME = "metric_name";
  private String metricName;

  public static final String JSON_PROPERTY_OVERRIDE_TYPE = "override_type";
  private ObservabilityPipelineTagCardinalityLimitProcessorOverrideType overrideType;

  public static final String JSON_PROPERTY_PER_TAG_LIMITS = "per_tag_limits";
  private List<ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit> perTagLimits = null;

  public static final String JSON_PROPERTY_VALUE_LIMIT = "value_limit";
  private Long valueLimit;

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit() {}

  @JsonCreator
  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit(
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_NAME) String metricName,
      @JsonProperty(required = true, value = JSON_PROPERTY_OVERRIDE_TYPE)
          ObservabilityPipelineTagCardinalityLimitProcessorOverrideType overrideType) {
    this.metricName = metricName;
    this.overrideType = overrideType;
    this.unparsed |= !overrideType.isValid();
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit limitExceededAction(
      ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction) {
    this.limitExceededAction = limitExceededAction;
    this.unparsed |= !limitExceededAction.isValid();
    return this;
  }

  /**
   * The action to take when the cardinality limit is exceeded.
   *
   * @return limitExceededAction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT_EXCEEDED_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineTagCardinalityLimitProcessorAction getLimitExceededAction() {
    return limitExceededAction;
  }

  public void setLimitExceededAction(
      ObservabilityPipelineTagCardinalityLimitProcessorAction limitExceededAction) {
    if (!limitExceededAction.isValid()) {
      this.unparsed = true;
    }
    this.limitExceededAction = limitExceededAction;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit metricName(
      String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * The name of the metric this override applies to.
   *
   * @return metricName
   */
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit overrideType(
      ObservabilityPipelineTagCardinalityLimitProcessorOverrideType overrideType) {
    this.overrideType = overrideType;
    this.unparsed |= !overrideType.isValid();
    return this;
  }

  /**
   * How the override is applied. <code>limit_override</code> enforces a custom limit; <code>
   * excluded</code> omits the metric or tag from cardinality tracking.
   *
   * @return overrideType
   */
  @JsonProperty(JSON_PROPERTY_OVERRIDE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineTagCardinalityLimitProcessorOverrideType getOverrideType() {
    return overrideType;
  }

  public void setOverrideType(
      ObservabilityPipelineTagCardinalityLimitProcessorOverrideType overrideType) {
    if (!overrideType.isValid()) {
      this.unparsed = true;
    }
    this.overrideType = overrideType;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit perTagLimits(
      List<ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit> perTagLimits) {
    this.perTagLimits = perTagLimits;
    if (perTagLimits != null) {
      for (ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit item : perTagLimits) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit addPerTagLimitsItem(
      ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit perTagLimitsItem) {
    if (this.perTagLimits == null) {
      this.perTagLimits = new ArrayList<>();
    }
    this.perTagLimits.add(perTagLimitsItem);
    this.unparsed |= perTagLimitsItem.unparsed;
    return this;
  }

  /**
   * A list of per-tag cardinality overrides that apply within this metric. Must be omitted when
   * <code>override_type</code> is <code>excluded</code>.
   *
   * @return perTagLimits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_TAG_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit> getPerTagLimits() {
    return perTagLimits;
  }

  public void setPerTagLimits(
      List<ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit> perTagLimits) {
    this.perTagLimits = perTagLimits;
    if (perTagLimits != null) {
      for (ObservabilityPipelineTagCardinalityLimitProcessorPerTagLimit item : perTagLimits) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit valueLimit(
      Long valueLimit) {
    this.valueLimit = valueLimit;
    return this;
  }

  /**
   * The maximum number of distinct tag value combinations allowed for this metric. Required when
   * <code>override_type</code> is <code>limit_override</code>. Must be omitted when <code>
   * override_type</code> is <code>excluded</code>. minimum: 0 maximum: 1000000
   *
   * @return valueLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getValueLimit() {
    return valueLimit;
  }

  public void setValueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
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
   * @return ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit
   */
  @JsonAnySetter
  public ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit
        observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit =
            (ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit) o;
    return Objects.equals(
            this.limitExceededAction,
            observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.limitExceededAction)
        && Objects.equals(
            this.metricName,
            observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.metricName)
        && Objects.equals(
            this.overrideType,
            observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.overrideType)
        && Objects.equals(
            this.perTagLimits,
            observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.perTagLimits)
        && Objects.equals(
            this.valueLimit,
            observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.valueLimit)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineTagCardinalityLimitProcessorPerMetricLimit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        limitExceededAction,
        metricName,
        overrideType,
        perTagLimits,
        valueLimit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineTagCardinalityLimitProcessorPerMetricLimit {\n");
    sb.append("    limitExceededAction: ")
        .append(toIndentedString(limitExceededAction))
        .append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    overrideType: ").append(toIndentedString(overrideType)).append("\n");
    sb.append("    perTagLimits: ").append(toIndentedString(perTagLimits)).append("\n");
    sb.append("    valueLimit: ").append(toIndentedString(valueLimit)).append("\n");
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
