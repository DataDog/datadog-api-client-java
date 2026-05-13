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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A single detected Cloud Cost Management anomaly. */
@JsonPropertyOrder({
  CostAnomaly.JSON_PROPERTY_ACTUAL_COST,
  CostAnomaly.JSON_PROPERTY_ANOMALOUS_COST_CHANGE,
  CostAnomaly.JSON_PROPERTY_ANOMALY_END,
  CostAnomaly.JSON_PROPERTY_ANOMALY_START,
  CostAnomaly.JSON_PROPERTY_CORRELATED_TAGS,
  CostAnomaly.JSON_PROPERTY_DIMENSIONS,
  CostAnomaly.JSON_PROPERTY_DISMISSAL,
  CostAnomaly.JSON_PROPERTY_MAX_COST,
  CostAnomaly.JSON_PROPERTY_PROVIDER,
  CostAnomaly.JSON_PROPERTY_QUERY,
  CostAnomaly.JSON_PROPERTY_UUID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostAnomaly {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTUAL_COST = "actual_cost";
  private Double actualCost;

  public static final String JSON_PROPERTY_ANOMALOUS_COST_CHANGE = "anomalous_cost_change";
  private Double anomalousCostChange;

  public static final String JSON_PROPERTY_ANOMALY_END = "anomaly_end";
  private Long anomalyEnd;

  public static final String JSON_PROPERTY_ANOMALY_START = "anomaly_start";
  private Long anomalyStart;

  public static final String JSON_PROPERTY_CORRELATED_TAGS = "correlated_tags";
  private Map<String, List<String>> correlatedTags = new HashMap<String, List<String>>();

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private Map<String, String> dimensions = new HashMap<String, String>();

  public static final String JSON_PROPERTY_DISMISSAL = "dismissal";
  private CostAnomalyDismissal dismissal;

  public static final String JSON_PROPERTY_MAX_COST = "max_cost";
  private Double maxCost;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public CostAnomaly() {}

  @JsonCreator
  public CostAnomaly(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTUAL_COST) Double actualCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_ANOMALOUS_COST_CHANGE)
          Double anomalousCostChange,
      @JsonProperty(required = true, value = JSON_PROPERTY_ANOMALY_END) Long anomalyEnd,
      @JsonProperty(required = true, value = JSON_PROPERTY_ANOMALY_START) Long anomalyStart,
      @JsonProperty(required = true, value = JSON_PROPERTY_CORRELATED_TAGS)
          Map<String, List<String>> correlatedTags,
      @JsonProperty(required = true, value = JSON_PROPERTY_DIMENSIONS)
          Map<String, String> dimensions,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_COST) Double maxCost,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER) String provider,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_UUID) String uuid) {
    this.actualCost = actualCost;
    this.anomalousCostChange = anomalousCostChange;
    this.anomalyEnd = anomalyEnd;
    this.anomalyStart = anomalyStart;
    this.correlatedTags = correlatedTags;
    if (correlatedTags != null) {}
    this.dimensions = dimensions;
    this.maxCost = maxCost;
    this.provider = provider;
    this.query = query;
    this.uuid = uuid;
  }

  public CostAnomaly actualCost(Double actualCost) {
    this.actualCost = actualCost;
    return this;
  }

  /**
   * Actual cost incurred during the anomaly window.
   *
   * @return actualCost
   */
  @JsonProperty(JSON_PROPERTY_ACTUAL_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getActualCost() {
    return actualCost;
  }

  public void setActualCost(Double actualCost) {
    this.actualCost = actualCost;
  }

  public CostAnomaly anomalousCostChange(Double anomalousCostChange) {
    this.anomalousCostChange = anomalousCostChange;
    return this;
  }

  /**
   * Anomalous cost change relative to the expected baseline.
   *
   * @return anomalousCostChange
   */
  @JsonProperty(JSON_PROPERTY_ANOMALOUS_COST_CHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAnomalousCostChange() {
    return anomalousCostChange;
  }

  public void setAnomalousCostChange(Double anomalousCostChange) {
    this.anomalousCostChange = anomalousCostChange;
  }

  public CostAnomaly anomalyEnd(Long anomalyEnd) {
    this.anomalyEnd = anomalyEnd;
    return this;
  }

  /**
   * Anomaly end timestamp in Unix milliseconds.
   *
   * @return anomalyEnd
   */
  @JsonProperty(JSON_PROPERTY_ANOMALY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAnomalyEnd() {
    return anomalyEnd;
  }

  public void setAnomalyEnd(Long anomalyEnd) {
    this.anomalyEnd = anomalyEnd;
  }

  public CostAnomaly anomalyStart(Long anomalyStart) {
    this.anomalyStart = anomalyStart;
    return this;
  }

  /**
   * Anomaly start timestamp in Unix milliseconds.
   *
   * @return anomalyStart
   */
  @JsonProperty(JSON_PROPERTY_ANOMALY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAnomalyStart() {
    return anomalyStart;
  }

  public void setAnomalyStart(Long anomalyStart) {
    this.anomalyStart = anomalyStart;
  }

  public CostAnomaly correlatedTags(Map<String, List<String>> correlatedTags) {
    this.correlatedTags = correlatedTags;
    if (correlatedTags != null) {}
    return this;
  }

  public CostAnomaly putCorrelatedTagsItem(String key, List<String> correlatedTagsItem) {
    this.correlatedTags.put(key, correlatedTagsItem);
    return this;
  }

  /**
   * Map of correlated tag keys to the list of correlated tag values.
   *
   * @return correlatedTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORRELATED_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, List<String>> getCorrelatedTags() {
    return correlatedTags;
  }

  public void setCorrelatedTags(Map<String, List<String>> correlatedTags) {
    this.correlatedTags = correlatedTags;
  }

  public CostAnomaly dimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  public CostAnomaly putDimensionsItem(String key, String dimensionsItem) {
    this.dimensions.put(key, dimensionsItem);
    return this;
  }

  /**
   * Map of cost dimension keys to their values for the anomaly grouping.
   *
   * @return dimensions
   */
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getDimensions() {
    return dimensions;
  }

  public void setDimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
  }

  public CostAnomaly dismissal(CostAnomalyDismissal dismissal) {
    this.dismissal = dismissal;
    this.unparsed |= dismissal.unparsed;
    return this;
  }

  /**
   * Resolution metadata for an anomaly that has been dismissed.
   *
   * @return dismissal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISMISSAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CostAnomalyDismissal getDismissal() {
    return dismissal;
  }

  public void setDismissal(CostAnomalyDismissal dismissal) {
    this.dismissal = dismissal;
  }

  public CostAnomaly maxCost(Double maxCost) {
    this.maxCost = maxCost;
    return this;
  }

  /**
   * Maximum cost observed during the anomaly window.
   *
   * @return maxCost
   */
  @JsonProperty(JSON_PROPERTY_MAX_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getMaxCost() {
    return maxCost;
  }

  public void setMaxCost(Double maxCost) {
    this.maxCost = maxCost;
  }

  public CostAnomaly provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Cloud or SaaS provider associated with the anomaly (for example <code>aws</code>, <code>gcp
   * </code>, <code>azure</code>).
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public CostAnomaly query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The metrics query that detected the anomaly.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public CostAnomaly uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * The unique identifier of the anomaly.
   *
   * @return uuid
   */
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
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
   * @return CostAnomaly
   */
  @JsonAnySetter
  public CostAnomaly putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostAnomaly object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostAnomaly costAnomaly = (CostAnomaly) o;
    return Objects.equals(this.actualCost, costAnomaly.actualCost)
        && Objects.equals(this.anomalousCostChange, costAnomaly.anomalousCostChange)
        && Objects.equals(this.anomalyEnd, costAnomaly.anomalyEnd)
        && Objects.equals(this.anomalyStart, costAnomaly.anomalyStart)
        && Objects.equals(this.correlatedTags, costAnomaly.correlatedTags)
        && Objects.equals(this.dimensions, costAnomaly.dimensions)
        && Objects.equals(this.dismissal, costAnomaly.dismissal)
        && Objects.equals(this.maxCost, costAnomaly.maxCost)
        && Objects.equals(this.provider, costAnomaly.provider)
        && Objects.equals(this.query, costAnomaly.query)
        && Objects.equals(this.uuid, costAnomaly.uuid)
        && Objects.equals(this.additionalProperties, costAnomaly.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actualCost,
        anomalousCostChange,
        anomalyEnd,
        anomalyStart,
        correlatedTags,
        dimensions,
        dismissal,
        maxCost,
        provider,
        query,
        uuid,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostAnomaly {\n");
    sb.append("    actualCost: ").append(toIndentedString(actualCost)).append("\n");
    sb.append("    anomalousCostChange: ")
        .append(toIndentedString(anomalousCostChange))
        .append("\n");
    sb.append("    anomalyEnd: ").append(toIndentedString(anomalyEnd)).append("\n");
    sb.append("    anomalyStart: ").append(toIndentedString(anomalyStart)).append("\n");
    sb.append("    correlatedTags: ").append(toIndentedString(correlatedTags)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    dismissal: ").append(toIndentedString(dismissal)).append("\n");
    sb.append("    maxCost: ").append(toIndentedString(maxCost)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
