/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>An object that holds an SLI value and its associated data. It can represent an SLO's overall SLI value.
   * This can also represent the SLI value for a specific monitor in multi-monitor SLOs, or a group in grouped SLOs.</p>
 */
@JsonPropertyOrder({
  SLOHistoryMonitor.JSON_PROPERTY_ERROR_BUDGET_REMAINING,
  SLOHistoryMonitor.JSON_PROPERTY_ERRORS,
  SLOHistoryMonitor.JSON_PROPERTY_GROUP,
  SLOHistoryMonitor.JSON_PROPERTY_HISTORY,
  SLOHistoryMonitor.JSON_PROPERTY_MONITOR_MODIFIED,
  SLOHistoryMonitor.JSON_PROPERTY_MONITOR_TYPE,
  SLOHistoryMonitor.JSON_PROPERTY_NAME,
  SLOHistoryMonitor.JSON_PROPERTY_PRECISION,
  SLOHistoryMonitor.JSON_PROPERTY_PREVIEW,
  SLOHistoryMonitor.JSON_PROPERTY_SLI_VALUE,
  SLOHistoryMonitor.JSON_PROPERTY_SPAN_PRECISION,
  SLOHistoryMonitor.JSON_PROPERTY_UPTIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryMonitor {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR_BUDGET_REMAINING = "error_budget_remaining";
  private Map<String, Double> errorBudgetRemaining = null;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<SLOHistoryResponseErrorWithType> errors = null;

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
  private Double precision;

  public static final String JSON_PROPERTY_PREVIEW = "preview";
  private Boolean preview;

  public static final String JSON_PROPERTY_SLI_VALUE = "sli_value";
  private JsonNullable<Double> sliValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Double spanPrecision;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private Double uptime;

  public SLOHistoryMonitor errorBudgetRemaining(Map<String, Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
    return this;
  }
  public SLOHistoryMonitor putErrorBudgetRemainingItem(String key, Double errorBudgetRemainingItem) {
    if (this.errorBudgetRemaining == null) {
      this.errorBudgetRemaining = new HashMap<>();
    }
    this.errorBudgetRemaining.put(key, errorBudgetRemainingItem);
    return this;
  }

  /**
   * <p>A mapping of threshold <code>timeframe</code> to the remaining error budget.</p>
   * @return errorBudgetRemaining
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERROR_BUDGET_REMAINING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Double> getErrorBudgetRemaining() {
        return errorBudgetRemaining;
      }
  public void setErrorBudgetRemaining(Map<String, Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
  }
  public SLOHistoryMonitor errors(List<SLOHistoryResponseErrorWithType> errors) {
    this.errors = errors;
    for (SLOHistoryResponseErrorWithType item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SLOHistoryMonitor addErrorsItem(SLOHistoryResponseErrorWithType errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * <p>An array of error objects returned while querying the history data for the service level objective.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SLOHistoryResponseErrorWithType> getErrors() {
        return errors;
      }
  public void setErrors(List<SLOHistoryResponseErrorWithType> errors) {
    this.errors = errors;
  }
  public SLOHistoryMonitor group(String group) {
    this.group = group;
    return this;
  }

  /**
   * <p>For groups in a grouped SLO, this is the group name.</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getGroup() {
        return group;
      }
  public void setGroup(String group) {
    this.group = group;
  }
  public SLOHistoryMonitor history(List<List<Double>> history) {
    this.history = history;
    return this;
  }
  public SLOHistoryMonitor addHistoryItem(List<Double> historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

  /**
   * <p>The state transition history for the monitor. It is represented as
   * an array of pairs. Each pair is an array containing the timestamp of the transition
   * as an integer in Unix epoch format in the first element, and the state as an integer in the
   * second element. An integer value of <code>0</code> for state means uptime, <code>1</code> means downtime, and <code>2</code> means no data.
   * Periods of no data are counted either as uptime or downtime depending on monitor settings.
   * See <a href="https://docs.datadoghq.com/service_management/service_level_objectives/monitor/#missing-data">SLO documentation</a>
   * for detailed information.</p>
   * @return history
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HISTORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<List<Double>> getHistory() {
        return history;
      }
  public void setHistory(List<List<Double>> history) {
    this.history = history;
  }
  public SLOHistoryMonitor monitorModified(Long monitorModified) {
    this.monitorModified = monitorModified;
    return this;
  }

  /**
   * <p>For <code>monitor</code> based SLOs, this is the last modified timestamp in epoch seconds of the monitor.</p>
   * @return monitorModified
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMonitorModified() {
        return monitorModified;
      }
  public void setMonitorModified(Long monitorModified) {
    this.monitorModified = monitorModified;
  }
  public SLOHistoryMonitor monitorType(String monitorType) {
    this.monitorType = monitorType;
    return this;
  }

  /**
   * <p>For <code>monitor</code> based SLOs, this describes the type of monitor.</p>
   * @return monitorType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITOR_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMonitorType() {
        return monitorType;
      }
  public void setMonitorType(String monitorType) {
    this.monitorType = monitorType;
  }
  public SLOHistoryMonitor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>For groups in a grouped SLO, this is the group name. For monitors in a multi-monitor SLO, this is the monitor name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SLOHistoryMonitor precision(Double precision) {
    this.precision = precision;
    return this;
  }

  /**
   * <p>The amount of decimal places the SLI value is accurate to for the given from <code>&amp;&amp;</code> to timestamp. Use <code>span_precision</code> instead.</p>
   * @return precision
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRECISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getPrecision() {
        return precision;
      }
  @Deprecated
  public void setPrecision(Double precision) {
    this.precision = precision;
  }
  public SLOHistoryMonitor preview(Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * <p>For <code>monitor</code> based SLOs, when <code>true</code> this indicates that a replay is in progress to give an accurate uptime
   * calculation.</p>
   * @return preview
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PREVIEW)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPreview() {
        return preview;
      }
  public void setPreview(Boolean preview) {
    this.preview = preview;
  }
  public SLOHistoryMonitor sliValue(Double sliValue) {
    this.sliValue = JsonNullable.<Double>of(sliValue);
    return this;
  }

  /**
   * <p>The current SLI value of the SLO over the history window.</p>
   * @return sliValue
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getSliValue() {
        return sliValue.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SLI_VALUE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getSliValue_JsonNullable() {
    return sliValue;
  }
  @JsonProperty(JSON_PROPERTY_SLI_VALUE)public void setSliValue_JsonNullable(JsonNullable<Double> sliValue) {
    this.sliValue = sliValue;
  }
  public void setSliValue(Double sliValue) {
    this.sliValue = JsonNullable.<Double>of(sliValue);
  }
  public SLOHistoryMonitor spanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
    return this;
  }

  /**
   * <p>The amount of decimal places the SLI value is accurate to for the given from <code>&amp;&amp;</code> to timestamp.</p>
   * @return spanPrecision
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SPAN_PRECISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getSpanPrecision() {
        return spanPrecision;
      }
  public void setSpanPrecision(Double spanPrecision) {
    this.spanPrecision = spanPrecision;
  }
  public SLOHistoryMonitor uptime(Double uptime) {
    this.uptime = uptime;
    return this;
  }

  /**
   * <p>Use <code>sli_value</code> instead.</p>
   * @return uptime
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPTIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getUptime() {
        return uptime;
      }
  @Deprecated
  public void setUptime(Double uptime) {
    this.uptime = uptime;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SLOHistoryMonitor
   */
  @JsonAnySetter
  public SLOHistoryMonitor putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOHistoryMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryMonitor sloHistoryMonitor = (SLOHistoryMonitor) o;
    return Objects.equals(this.errorBudgetRemaining, sloHistoryMonitor.errorBudgetRemaining) && Objects.equals(this.errors, sloHistoryMonitor.errors) && Objects.equals(this.group, sloHistoryMonitor.group) && Objects.equals(this.history, sloHistoryMonitor.history) && Objects.equals(this.monitorModified, sloHistoryMonitor.monitorModified) && Objects.equals(this.monitorType, sloHistoryMonitor.monitorType) && Objects.equals(this.name, sloHistoryMonitor.name) && Objects.equals(this.precision, sloHistoryMonitor.precision) && Objects.equals(this.preview, sloHistoryMonitor.preview) && Objects.equals(this.sliValue, sloHistoryMonitor.sliValue) && Objects.equals(this.spanPrecision, sloHistoryMonitor.spanPrecision) && Objects.equals(this.uptime, sloHistoryMonitor.uptime) && Objects.equals(this.additionalProperties, sloHistoryMonitor.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(errorBudgetRemaining,errors,group,history,monitorModified,monitorType,name,precision,preview,sliValue,spanPrecision,uptime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistoryMonitor {\n");
    sb.append("    errorBudgetRemaining: ").append(toIndentedString(errorBudgetRemaining)).append("\n");
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
