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

/** Cost anomaly results and aggregated totals for the queried window. */
@JsonPropertyOrder({
  CostAnomaliesResponseDataAttributes.JSON_PROPERTY_ANOMALIES,
  CostAnomaliesResponseDataAttributes.JSON_PROPERTY_AVG_DAILY_ANOMALOUS_COST,
  CostAnomaliesResponseDataAttributes.JSON_PROPERTY_TOTAL_ACTUAL_COST,
  CostAnomaliesResponseDataAttributes.JSON_PROPERTY_TOTAL_ANOMALOUS_COST,
  CostAnomaliesResponseDataAttributes.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostAnomaliesResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANOMALIES = "anomalies";
  private List<CostAnomaly> anomalies = new ArrayList<>();

  public static final String JSON_PROPERTY_AVG_DAILY_ANOMALOUS_COST = "avg_daily_anomalous_cost";
  private Double avgDailyAnomalousCost;

  public static final String JSON_PROPERTY_TOTAL_ACTUAL_COST = "total_actual_cost";
  private Double totalActualCost;

  public static final String JSON_PROPERTY_TOTAL_ANOMALOUS_COST = "total_anomalous_cost";
  private Double totalAnomalousCost;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public CostAnomaliesResponseDataAttributes() {}

  @JsonCreator
  public CostAnomaliesResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANOMALIES) List<CostAnomaly> anomalies,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DAILY_ANOMALOUS_COST)
          Double avgDailyAnomalousCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_ACTUAL_COST)
          Double totalActualCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_ANOMALOUS_COST)
          Double totalAnomalousCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_COUNT) Long totalCount) {
    this.anomalies = anomalies;
    for (CostAnomaly item : anomalies) {
      this.unparsed |= item.unparsed;
    }
    this.avgDailyAnomalousCost = avgDailyAnomalousCost;
    this.totalActualCost = totalActualCost;
    this.totalAnomalousCost = totalAnomalousCost;
    this.totalCount = totalCount;
  }

  public CostAnomaliesResponseDataAttributes anomalies(List<CostAnomaly> anomalies) {
    this.anomalies = anomalies;
    for (CostAnomaly item : anomalies) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CostAnomaliesResponseDataAttributes addAnomaliesItem(CostAnomaly anomaliesItem) {
    this.anomalies.add(anomaliesItem);
    this.unparsed |= anomaliesItem.unparsed;
    return this;
  }

  /**
   * The list of cost anomalies that match the request.
   *
   * @return anomalies
   */
  @JsonProperty(JSON_PROPERTY_ANOMALIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CostAnomaly> getAnomalies() {
    return anomalies;
  }

  public void setAnomalies(List<CostAnomaly> anomalies) {
    this.anomalies = anomalies;
    if (anomalies != null) {
      for (CostAnomaly item : anomalies) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CostAnomaliesResponseDataAttributes avgDailyAnomalousCost(Double avgDailyAnomalousCost) {
    this.avgDailyAnomalousCost = avgDailyAnomalousCost;
    return this;
  }

  /**
   * Average daily anomalous cost change across the queried window.
   *
   * @return avgDailyAnomalousCost
   */
  @JsonProperty(JSON_PROPERTY_AVG_DAILY_ANOMALOUS_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgDailyAnomalousCost() {
    return avgDailyAnomalousCost;
  }

  public void setAvgDailyAnomalousCost(Double avgDailyAnomalousCost) {
    this.avgDailyAnomalousCost = avgDailyAnomalousCost;
  }

  public CostAnomaliesResponseDataAttributes totalActualCost(Double totalActualCost) {
    this.totalActualCost = totalActualCost;
    return this;
  }

  /**
   * Total actual cost spent across the queried window for the matching providers.
   *
   * @return totalActualCost
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_ACTUAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTotalActualCost() {
    return totalActualCost;
  }

  public void setTotalActualCost(Double totalActualCost) {
    this.totalActualCost = totalActualCost;
  }

  public CostAnomaliesResponseDataAttributes totalAnomalousCost(Double totalAnomalousCost) {
    this.totalAnomalousCost = totalAnomalousCost;
    return this;
  }

  /**
   * Sum of the anomalous cost change across all returned anomalies.
   *
   * @return totalAnomalousCost
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_ANOMALOUS_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTotalAnomalousCost() {
    return totalAnomalousCost;
  }

  public void setTotalAnomalousCost(Double totalAnomalousCost) {
    this.totalAnomalousCost = totalAnomalousCost;
  }

  public CostAnomaliesResponseDataAttributes totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of anomalies that match the request.
   *
   * @return totalCount
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
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
   * @return CostAnomaliesResponseDataAttributes
   */
  @JsonAnySetter
  public CostAnomaliesResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostAnomaliesResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostAnomaliesResponseDataAttributes costAnomaliesResponseDataAttributes =
        (CostAnomaliesResponseDataAttributes) o;
    return Objects.equals(this.anomalies, costAnomaliesResponseDataAttributes.anomalies)
        && Objects.equals(
            this.avgDailyAnomalousCost, costAnomaliesResponseDataAttributes.avgDailyAnomalousCost)
        && Objects.equals(this.totalActualCost, costAnomaliesResponseDataAttributes.totalActualCost)
        && Objects.equals(
            this.totalAnomalousCost, costAnomaliesResponseDataAttributes.totalAnomalousCost)
        && Objects.equals(this.totalCount, costAnomaliesResponseDataAttributes.totalCount)
        && Objects.equals(
            this.additionalProperties, costAnomaliesResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anomalies,
        avgDailyAnomalousCost,
        totalActualCost,
        totalAnomalousCost,
        totalCount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostAnomaliesResponseDataAttributes {\n");
    sb.append("    anomalies: ").append(toIndentedString(anomalies)).append("\n");
    sb.append("    avgDailyAnomalousCost: ")
        .append(toIndentedString(avgDailyAnomalousCost))
        .append("\n");
    sb.append("    totalActualCost: ").append(toIndentedString(totalActualCost)).append("\n");
    sb.append("    totalAnomalousCost: ").append(toIndentedString(totalAnomalousCost)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
