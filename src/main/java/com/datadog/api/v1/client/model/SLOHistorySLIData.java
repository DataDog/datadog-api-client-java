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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * An object that holds an SLI value and its associated data. It can represent an SLO&#39;s overall
 * SLI value. This can also represent the SLI value for a specific monitor in multi-monitor SLOs, or
 * a group in grouped SLOs.
 */
@ApiModel(
    description =
        "An object that holds an SLI value and its associated data. It can represent an SLO's"
            + " overall SLI value. This can also represent the SLI value for a specific monitor in"
            + " multi-monitor SLOs, or a group in grouped SLOs.")
@JsonPropertyOrder({
  SLOHistorySLIData.JSON_PROPERTY_ERROR_BUDGET_REMAINING,
  SLOHistorySLIData.JSON_PROPERTY_ERRORS,
  SLOHistorySLIData.JSON_PROPERTY_GROUP,
  SLOHistorySLIData.JSON_PROPERTY_HISTORY,
  SLOHistorySLIData.JSON_PROPERTY_MONITOR_MODIFIED,
  SLOHistorySLIData.JSON_PROPERTY_MONITOR_TYPE,
  SLOHistorySLIData.JSON_PROPERTY_NAME,
  SLOHistorySLIData.JSON_PROPERTY_PRECISION,
  SLOHistorySLIData.JSON_PROPERTY_PREVIEW,
  SLOHistorySLIData.JSON_PROPERTY_SLI_VALUE,
  SLOHistorySLIData.JSON_PROPERTY_SPAN_PRECISION,
  SLOHistorySLIData.JSON_PROPERTY_UPTIME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SLOHistorySLIData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_BUDGET_REMAINING = "error_budget_remaining";
  private Map<String, Double> errorBudgetRemaining = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<SLOHistoryResponseError> errors = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_HISTORY = "history";
  private List<List<Double>> history = null;

  public static final String JSON_PROPERTY_MONITOR_MODIFIED = "monitor_modified";
  private Long monitorModified;

  public static final String JSON_PROPERTY_MONITOR_TYPE = "monitor_type";
  private String monitorType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Map<String, Double> precision = null;

  public static final String JSON_PROPERTY_PREVIEW = "preview";
  private Boolean preview;

  public static final String JSON_PROPERTY_SLI_VALUE = "sli_value";
  private Double sliValue;

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Double spanPrecision;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private Double uptime;

  public SLOHistorySLIData errorBudgetRemaining(Map<String, Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
    return this;
  }

  public SLOHistorySLIData putErrorBudgetRemainingItem(
      String key, Double errorBudgetRemainingItem) {
    if (this.errorBudgetRemaining == null) {
      this.errorBudgetRemaining = new HashMap<>();
    }
    this.errorBudgetRemaining.put(key, errorBudgetRemainingItem);
    return this;
  }

  /**
   * A mapping of threshold &#x60;timeframe&#x60; to the remaining error budget.
   *
   * @return errorBudgetRemaining
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "{\"7d\":100.0}",
      value = "A mapping of threshold `timeframe` to the remaining error budget.")
  @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Double> getErrorBudgetRemaining() {
    return errorBudgetRemaining;
  }

  public void setErrorBudgetRemaining(Map<String, Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
  }

  public SLOHistorySLIData errors(List<SLOHistoryResponseError> errors) {
    this.errors = errors;
    for (SLOHistoryResponseError item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOHistorySLIData addErrorsItem(SLOHistoryResponseError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * A list of errors while querying the history data for the service level objective.
   *
   * @return errors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "[]",
      value = "A list of errors while querying the history data for the service level objective.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SLOHistoryResponseError> getErrors() {
    return errors;
  }

  public void setErrors(List<SLOHistoryResponseError> errors) {
    this.errors = errors;
  }

  public SLOHistorySLIData group(String group) {
    this.group = group;
    return this;
  }

  /**
   * For groups in a grouped SLO, this is the group name.
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "name",
      value = "For groups in a grouped SLO, this is the group name.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public SLOHistorySLIData history(List<List<Double>> history) {
    this.history = history;
    return this;
  }

  public SLOHistorySLIData addHistoryItem(List<Double> historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * For &#x60;monitor&#x60; based SLOs, this includes the aggregated history as arrays that include
   * time series and uptime data where &#x60;0&#x3D;monitor&#x60; is in &#x60;OK&#x60; state and
   * &#x60;1&#x3D;monitor&#x60; is in &#x60;alert&#x60; state.
   *
   * @return history
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "For `monitor` based SLOs, this includes the aggregated history as arrays that include"
              + " time series and uptime data where `0=monitor` is in `OK` state and `1=monitor`"
              + " is in `alert` state.")
  @JsonProperty(JSON_PROPERTY_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<Double>> getHistory() {
    return history;
  }

  public void setHistory(List<List<Double>> history) {
    this.history = history;
  }

  public SLOHistorySLIData monitorModified(Long monitorModified) {
    this.monitorModified = monitorModified;
    return this;
  }

  /**
   * For &#x60;monitor&#x60; based SLOs, this is the last modified timestamp in epoch seconds of the
   * monitor.
   *
   * @return monitorModified
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "1615867200",
      value =
          "For `monitor` based SLOs, this is the last modified timestamp in epoch seconds of the"
              + " monitor.")
  @JsonProperty(JSON_PROPERTY_MONITOR_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorModified() {
    return monitorModified;
  }

  public void setMonitorModified(Long monitorModified) {
    this.monitorModified = monitorModified;
  }

  public SLOHistorySLIData monitorType(String monitorType) {
    this.monitorType = monitorType;
    return this;
  }

  /**
   * For &#x60;monitor&#x60; based SLOs, this describes the type of monitor.
   *
   * @return monitorType
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "string",
      value = "For `monitor` based SLOs, this describes the type of monitor.")
  @JsonProperty(JSON_PROPERTY_MONITOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMonitorType() {
    return monitorType;
  }

  public void setMonitorType(String monitorType) {
    this.monitorType = monitorType;
  }

  public SLOHistorySLIData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * For groups in a grouped SLO, this is the group name. For monitors in a multi-monitor SLO, this
   * is the monitor name.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "string",
      value =
          "For groups in a grouped SLO, this is the group name. For monitors in a multi-monitor"
              + " SLO, this is the monitor name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SLOHistorySLIData precision(Map<String, Double> precision) {
    this.precision = precision;
    return this;
  }

  public SLOHistorySLIData putPrecisionItem(String key, Double precisionItem) {
    if (this.precision == null) {
      this.precision = new HashMap<>();
    }
    this.precision.put(key, precisionItem);
    return this;
  }

  /**
   * A mapping of threshold &#x60;timeframe&#x60; to number of accurate decimals, regardless of the
   * from &amp;&amp; to timestamp.
   *
   * @return precision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "{\"30d\":1,\"7d\":2}",
      value =
          "A mapping of threshold `timeframe` to number of accurate decimals, regardless of the"
              + " from && to timestamp.")
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Double> getPrecision() {
    return precision;
  }

  public void setPrecision(Map<String, Double> precision) {
    this.precision = precision;
  }

  public SLOHistorySLIData preview(Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * For &#x60;monitor&#x60; based SLOs, when &#x60;true&#x60; this indicates that a replay is in
   * progress to give an accurate uptime calculation.
   *
   * @return preview
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "true",
      value =
          "For `monitor` based SLOs, when `true` this indicates that a replay is in progress to"
              + " give an accurate uptime calculation.")
  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPreview() {
    return preview;
  }

  public void setPreview(Boolean preview) {
    this.preview = preview;
  }

  public SLOHistorySLIData sliValue(Double sliValue) {
    this.sliValue = sliValue;
    return this;
  }

  /**
   * The current SLI value of the SLO over the history window.
   *
   * @return sliValue
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "99.99",
      value = "The current SLI value of the SLO over the history window.")
  @JsonProperty(JSON_PROPERTY_SLI_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSliValue() {
    return sliValue;
  }

  public void setSliValue(Double sliValue) {
    this.sliValue = sliValue;
  }

  public SLOHistorySLIData spanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
    return this;
  }

  /**
   * The amount of decimal places the SLI value is accurate to for the given from
   * &#x60;&amp;&amp;&#x60; to timestamp.
   *
   * @return spanPrecision
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      example = "2",
      value =
          "The amount of decimal places the SLI value is accurate to for the given from `&&` to"
              + " timestamp.")
  @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSpanPrecision() {
    return spanPrecision;
  }

  public void setSpanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
  }

  public SLOHistorySLIData uptime(Double uptime) {
    this.uptime = uptime;
    return this;
  }

  /**
   * Use &#x60;sli_value&#x60; instead.
   *
   * @return uptime
   */
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.99", value = "Use `sli_value` instead.")
  @JsonProperty(JSON_PROPERTY_UPTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getUptime() {
    return uptime;
  }

  public void setUptime(Double uptime) {
    this.uptime = uptime;
  }

  /** Return true if this SLOHistorySLIData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistorySLIData slOHistorySLIData = (SLOHistorySLIData) o;
    return Objects.equals(this.errorBudgetRemaining, slOHistorySLIData.errorBudgetRemaining)
        && Objects.equals(this.errors, slOHistorySLIData.errors)
        && Objects.equals(this.group, slOHistorySLIData.group)
        && Objects.equals(this.history, slOHistorySLIData.history)
        && Objects.equals(this.monitorModified, slOHistorySLIData.monitorModified)
        && Objects.equals(this.monitorType, slOHistorySLIData.monitorType)
        && Objects.equals(this.name, slOHistorySLIData.name)
        && Objects.equals(this.precision, slOHistorySLIData.precision)
        && Objects.equals(this.preview, slOHistorySLIData.preview)
        && Objects.equals(this.sliValue, slOHistorySLIData.sliValue)
        && Objects.equals(this.spanPrecision, slOHistorySLIData.spanPrecision)
        && Objects.equals(this.uptime, slOHistorySLIData.uptime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        errorBudgetRemaining,
        errors,
        group,
        history,
        monitorModified,
        monitorType,
        name,
        precision,
        preview,
        sliValue,
        spanPrecision,
        uptime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistorySLIData {\n");
    sb.append("    errorBudgetRemaining: ")
        .append(toIndentedString(errorBudgetRemaining))
        .append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    monitorModified: ").append(toIndentedString(monitorModified)).append("\n");
    sb.append("    monitorType: ").append(toIndentedString(monitorType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    sliValue: ").append(toIndentedString(sliValue)).append("\n");
    sb.append("    spanPrecision: ").append(toIndentedString(spanPrecision)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
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
