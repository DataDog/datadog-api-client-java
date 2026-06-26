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

/** The query execution context used to visualize a limit and its usage. */
@JsonPropertyOrder({
  GovernanceLimitQueryConfig.JSON_PROPERTY_CHART_TYPE,
  GovernanceLimitQueryConfig.JSON_PROPERTY_COMPARISON_SHIFT,
  GovernanceLimitQueryConfig.JSON_PROPERTY_DEFAULT_VALUE,
  GovernanceLimitQueryConfig.JSON_PROPERTY_DIRECTIONALITY,
  GovernanceLimitQueryConfig.JSON_PROPERTY_EFFECTIVE_TIME_WINDOW_DAYS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceLimitQueryConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHART_TYPE = "chart_type";
  private String chartType;

  public static final String JSON_PROPERTY_COMPARISON_SHIFT = "comparison_shift";
  private String comparisonShift;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "default_value";
  private Long defaultValue;

  public static final String JSON_PROPERTY_DIRECTIONALITY = "directionality";
  private String directionality;

  public static final String JSON_PROPERTY_EFFECTIVE_TIME_WINDOW_DAYS =
      "effective_time_window_days";
  private Long effectiveTimeWindowDays;

  public GovernanceLimitQueryConfig chartType(String chartType) {
    this.chartType = chartType;
    return this;
  }

  /**
   * The chart type used to visualize the limit and its usage.
   *
   * @return chartType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHART_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChartType() {
    return chartType;
  }

  public void setChartType(String chartType) {
    this.chartType = chartType;
  }

  public GovernanceLimitQueryConfig comparisonShift(String comparisonShift) {
    this.comparisonShift = comparisonShift;
    return this;
  }

  /**
   * The time shift applied to compare current usage against a prior period.
   *
   * @return comparisonShift
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARISON_SHIFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getComparisonShift() {
    return comparisonShift;
  }

  public void setComparisonShift(String comparisonShift) {
    this.comparisonShift = comparisonShift;
  }

  public GovernanceLimitQueryConfig defaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value used for the limit when no explicit value is configured.
   *
   * @return defaultValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Long defaultValue) {
    this.defaultValue = defaultValue;
  }

  public GovernanceLimitQueryConfig directionality(String directionality) {
    this.directionality = directionality;
    return this;
  }

  /**
   * The direction in which usage approaches the limit, indicating whether higher or lower values
   * are closer to the limit.
   *
   * @return directionality
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDirectionality() {
    return directionality;
  }

  public void setDirectionality(String directionality) {
    this.directionality = directionality;
  }

  public GovernanceLimitQueryConfig effectiveTimeWindowDays(Long effectiveTimeWindowDays) {
    this.effectiveTimeWindowDays = effectiveTimeWindowDays;
    return this;
  }

  /**
   * The number of days of data the limit query evaluates over.
   *
   * @return effectiveTimeWindowDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_TIME_WINDOW_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEffectiveTimeWindowDays() {
    return effectiveTimeWindowDays;
  }

  public void setEffectiveTimeWindowDays(Long effectiveTimeWindowDays) {
    this.effectiveTimeWindowDays = effectiveTimeWindowDays;
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
   * @return GovernanceLimitQueryConfig
   */
  @JsonAnySetter
  public GovernanceLimitQueryConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceLimitQueryConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceLimitQueryConfig governanceLimitQueryConfig = (GovernanceLimitQueryConfig) o;
    return Objects.equals(this.chartType, governanceLimitQueryConfig.chartType)
        && Objects.equals(this.comparisonShift, governanceLimitQueryConfig.comparisonShift)
        && Objects.equals(this.defaultValue, governanceLimitQueryConfig.defaultValue)
        && Objects.equals(this.directionality, governanceLimitQueryConfig.directionality)
        && Objects.equals(
            this.effectiveTimeWindowDays, governanceLimitQueryConfig.effectiveTimeWindowDays)
        && Objects.equals(
            this.additionalProperties, governanceLimitQueryConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chartType,
        comparisonShift,
        defaultValue,
        directionality,
        effectiveTimeWindowDays,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceLimitQueryConfig {\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
    sb.append("    comparisonShift: ").append(toIndentedString(comparisonShift)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    directionality: ").append(toIndentedString(directionality)).append("\n");
    sb.append("    effectiveTimeWindowDays: ")
        .append(toIndentedString(effectiveTimeWindowDays))
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
