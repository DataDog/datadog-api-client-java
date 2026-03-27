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
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistorySLIData {
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
  private Map<String, Double> precision = null;

  public static final String JSON_PROPERTY_PREVIEW = "preview";
  private Boolean preview;

  public static final String JSON_PROPERTY_SLI_VALUE = "sli_value";
  private JsonNullable<Double> sliValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SPAN_PRECISION = "span_precision";
  private Double spanPrecision;

  public static final String JSON_PROPERTY_UPTIME = "uptime";
  private JsonNullable<Double> uptime = JsonNullable.<Double>undefined();

  public SLOHistorySLIData errorBudgetRemaining(Map<String, Double> errorBudgetRemaining) {
    this.errorBudgetRemaining = errorBudgetRemaining;
    return this;
  }
  public SLOHistorySLIData putErrorBudgetRemainingItem(String key, Double errorBudgetRemainingItem) {
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
  public SLOHistorySLIData errors(List<SLOHistoryResponseErrorWithType> errors) {
    this.errors = errors;
    for (SLOHistoryResponseErrorWithType item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SLOHistorySLIData addErrorsItem(SLOHistoryResponseErrorWithType errorsItem) {
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
  public SLOHistorySLIData group(String group) {
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
   * <p>The state transition history for <code>monitor</code> or <code>time-slice</code> SLOs. It is represented as
   * an array of pairs. Each pair is an array containing the timestamp of the transition
   * as an integer in Unix epoch format in the first element, and the state as an integer in the
   * second element. An integer value of <code>0</code> for state means uptime, <code>1</code> means downtime, and <code>2</code> means no data.
   * Periods of no data count as uptime in time-slice SLOs, while for monitor SLOs, no data is counted
   * either as uptime or downtime depending on monitor settings. See
   * <a href="https://docs.datadoghq.com/service_management/service_level_objectives/monitor/#missing-data">SLO documentation</a>
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
  public SLOHistorySLIData monitorModified(Long monitorModified) {
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
  public SLOHistorySLIData monitorType(String monitorType) {
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
  public SLOHistorySLIData name(String name) {
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
   * <p>A mapping of threshold <code>timeframe</code> to number of accurate decimals, regardless of the from &amp;&amp; to timestamp.</p>
   * @return precision
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRECISION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
  public SLOHistorySLIData sliValue(Double sliValue) {
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
  public SLOHistorySLIData spanPrecision(Double spanPrecision) {
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
  public SLOHistorySLIData uptime(Double uptime) {
    this.uptime = JsonNullable.<Double>of(uptime);
    return this;
  }

  /**
   * <p>Use <code>sli_value</code> instead.</p>
   * @return uptime
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getUptime() {
        return uptime.orElse(null);
      }
  @Deprecated
  @JsonProperty(JSON_PROPERTY_UPTIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getUptime_JsonNullable() {
    return uptime;
  }
  @JsonProperty(JSON_PROPERTY_UPTIME)public void setUptime_JsonNullable(JsonNullable<Double> uptime) {
    this.uptime = uptime;
  }
  public void setUptime(Double uptime) {
    this.uptime = JsonNullable.<Double>of(uptime);
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
   * @return SLOHistorySLIData
   */
  @JsonAnySetter
  public SLOHistorySLIData putAdditionalProperty(String key, Object value) {
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
   * Return true if this SLOHistorySLIData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistorySLIData sloHistorySliData = (SLOHistorySLIData) o;
    return Objects.equals(this.errorBudgetRemaining, sloHistorySliData.errorBudgetRemaining) && Objects.equals(this.errors, sloHistorySliData.errors) && Objects.equals(this.group, sloHistorySliData.group) && Objects.equals(this.history, sloHistorySliData.history) && Objects.equals(this.monitorModified, sloHistorySliData.monitorModified) && Objects.equals(this.monitorType, sloHistorySliData.monitorType) && Objects.equals(this.name, sloHistorySliData.name) && Objects.equals(this.precision, sloHistorySliData.precision) && Objects.equals(this.preview, sloHistorySliData.preview) && Objects.equals(this.sliValue, sloHistorySliData.sliValue) && Objects.equals(this.spanPrecision, sloHistorySliData.spanPrecision) && Objects.equals(this.uptime, sloHistorySliData.uptime) && Objects.equals(this.additionalProperties, sloHistorySliData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(errorBudgetRemaining,errors,group,history,monitorModified,monitorType,name,precision,preview,sliValue,spanPrecision,uptime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOHistorySLIData {\n");
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
