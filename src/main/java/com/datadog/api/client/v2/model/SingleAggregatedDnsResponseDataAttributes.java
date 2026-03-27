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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for an aggregated DNS flow. */
@JsonPropertyOrder({
  SingleAggregatedDnsResponseDataAttributes.JSON_PROPERTY_GROUP_BYS,
  SingleAggregatedDnsResponseDataAttributes.JSON_PROPERTY_METRICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SingleAggregatedDnsResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_BYS = "group_bys";
  private List<SingleAggregatedDnsResponseDataAttributesGroupByItems> groupBys = null;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<SingleAggregatedDnsResponseDataAttributesMetricsItems> metrics = null;

  public SingleAggregatedDnsResponseDataAttributes groupBys(
      List<SingleAggregatedDnsResponseDataAttributesGroupByItems> groupBys) {
    this.groupBys = groupBys;
    for (SingleAggregatedDnsResponseDataAttributesGroupByItems item : groupBys) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SingleAggregatedDnsResponseDataAttributes addGroupBysItem(
      SingleAggregatedDnsResponseDataAttributesGroupByItems groupBysItem) {
    if (this.groupBys == null) {
      this.groupBys = new ArrayList<>();
    }
    this.groupBys.add(groupBysItem);
    this.unparsed |= groupBysItem.unparsed;
    return this;
  }

  /**
   * The key, value pairs for each group by.
   *
   * @return groupBys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SingleAggregatedDnsResponseDataAttributesGroupByItems> getGroupBys() {
    return groupBys;
  }

  public void setGroupBys(List<SingleAggregatedDnsResponseDataAttributesGroupByItems> groupBys) {
    this.groupBys = groupBys;
  }

  public SingleAggregatedDnsResponseDataAttributes metrics(
      List<SingleAggregatedDnsResponseDataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
    for (SingleAggregatedDnsResponseDataAttributesMetricsItems item : metrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SingleAggregatedDnsResponseDataAttributes addMetricsItem(
      SingleAggregatedDnsResponseDataAttributesMetricsItems metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    this.unparsed |= metricsItem.unparsed;
    return this;
  }

  /**
   * Metrics associated with an aggregated DNS flow.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SingleAggregatedDnsResponseDataAttributesMetricsItems> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<SingleAggregatedDnsResponseDataAttributesMetricsItems> metrics) {
    this.metrics = metrics;
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
   * @return SingleAggregatedDnsResponseDataAttributes
   */
  @JsonAnySetter
  public SingleAggregatedDnsResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SingleAggregatedDnsResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleAggregatedDnsResponseDataAttributes singleAggregatedDnsResponseDataAttributes =
        (SingleAggregatedDnsResponseDataAttributes) o;
    return Objects.equals(this.groupBys, singleAggregatedDnsResponseDataAttributes.groupBys)
        && Objects.equals(this.metrics, singleAggregatedDnsResponseDataAttributes.metrics)
        && Objects.equals(
            this.additionalProperties,
            singleAggregatedDnsResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBys, metrics, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleAggregatedDnsResponseDataAttributes {\n");
    sb.append("    groupBys: ").append(toIndentedString(groupBys)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
