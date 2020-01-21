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

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.HistoryServiceLevelObjectiveGroups;
import com.datadog.api.v1.client.model.HistoryServiceLevelObjectiveMetrics;
import com.datadog.api.v1.client.model.HistoryServiceLevelObjectiveOverall;
import com.datadog.api.v1.client.model.SLOThreshold;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HistoryServiceLevelObjectiveResponseData
 */
@JsonPropertyOrder({
  HistoryServiceLevelObjectiveResponseData.JSON_PROPERTY_FROM_TS,
  HistoryServiceLevelObjectiveResponseData.JSON_PROPERTY_GROUPS,
  HistoryServiceLevelObjectiveResponseData.JSON_PROPERTY_OVERALL,
  HistoryServiceLevelObjectiveResponseData.JSON_PROPERTY_SERIES,
  HistoryServiceLevelObjectiveResponseData.JSON_PROPERTY_THRESHOLDS,
  HistoryServiceLevelObjectiveResponseData.JSON_PROPERTY_TO_TS
})

public class HistoryServiceLevelObjectiveResponseData {
  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private Long fromTs;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private HistoryServiceLevelObjectiveGroups groups;

  public static final String JSON_PROPERTY_OVERALL = "overall";
  private HistoryServiceLevelObjectiveOverall overall;

  public static final String JSON_PROPERTY_SERIES = "series";
  private HistoryServiceLevelObjectiveMetrics series;

  public static final String JSON_PROPERTY_THRESHOLDS = "thresholds";
  private Map<String, SLOThreshold> thresholds = null;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private Long toTs;


  public HistoryServiceLevelObjectiveResponseData fromTs(Long fromTs) {
    
    this.fromTs = fromTs;
    return this;
  }

   /**
   * the &#x60;from&#x60; timestamp in epoch seconds
   * @return fromTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the `from` timestamp in epoch seconds")
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFromTs() {
    return fromTs;
  }


  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }


  public HistoryServiceLevelObjectiveResponseData groups(HistoryServiceLevelObjectiveGroups groups) {
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryServiceLevelObjectiveGroups getGroups() {
    return groups;
  }


  public void setGroups(HistoryServiceLevelObjectiveGroups groups) {
    this.groups = groups;
  }


  public HistoryServiceLevelObjectiveResponseData overall(HistoryServiceLevelObjectiveOverall overall) {
    
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryServiceLevelObjectiveOverall getOverall() {
    return overall;
  }


  public void setOverall(HistoryServiceLevelObjectiveOverall overall) {
    this.overall = overall;
  }


  public HistoryServiceLevelObjectiveResponseData series(HistoryServiceLevelObjectiveMetrics series) {
    
    this.series = series;
    return this;
  }

   /**
   * Get series
   * @return series
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HistoryServiceLevelObjectiveMetrics getSeries() {
    return series;
  }


  public void setSeries(HistoryServiceLevelObjectiveMetrics series) {
    this.series = series;
  }


  public HistoryServiceLevelObjectiveResponseData thresholds(Map<String, SLOThreshold> thresholds) {
    
    this.thresholds = thresholds;
    return this;
  }

  public HistoryServiceLevelObjectiveResponseData putThresholdsItem(String key, SLOThreshold thresholdsItem) {
    if (this.thresholds == null) {
      this.thresholds = new HashMap<>();
    }
    this.thresholds.put(key, thresholdsItem);
    return this;
  }

   /**
   * mapping of string timeframe to the SLO threshold.
   * @return thresholds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "mapping of string timeframe to the SLO threshold.")
  @JsonProperty(JSON_PROPERTY_THRESHOLDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, SLOThreshold> getThresholds() {
    return thresholds;
  }


  public void setThresholds(Map<String, SLOThreshold> thresholds) {
    this.thresholds = thresholds;
  }


  public HistoryServiceLevelObjectiveResponseData toTs(Long toTs) {
    
    this.toTs = toTs;
    return this;
  }

   /**
   * the &#x60;to&#x60; timestamp in epoch seconds
   * @return toTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the `to` timestamp in epoch seconds")
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getToTs() {
    return toTs;
  }


  public void setToTs(Long toTs) {
    this.toTs = toTs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryServiceLevelObjectiveResponseData historyServiceLevelObjectiveResponseData = (HistoryServiceLevelObjectiveResponseData) o;
    return Objects.equals(this.fromTs, historyServiceLevelObjectiveResponseData.fromTs) &&
        Objects.equals(this.groups, historyServiceLevelObjectiveResponseData.groups) &&
        Objects.equals(this.overall, historyServiceLevelObjectiveResponseData.overall) &&
        Objects.equals(this.series, historyServiceLevelObjectiveResponseData.series) &&
        Objects.equals(this.thresholds, historyServiceLevelObjectiveResponseData.thresholds) &&
        Objects.equals(this.toTs, historyServiceLevelObjectiveResponseData.toTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTs, groups, overall, series, thresholds, toTs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryServiceLevelObjectiveResponseData {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

