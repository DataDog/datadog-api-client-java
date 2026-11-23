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

/** Attributes of a timeseries coverage response. */
@JsonPropertyOrder({
  CommitmentsCoverageTimeseriesResponseAttributes.JSON_PROPERTY_COST,
  CommitmentsCoverageTimeseriesResponseAttributes.JSON_PROPERTY_HOURS,
  CommitmentsCoverageTimeseriesResponseAttributes.JSON_PROPERTY_QUERY_DEFINITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsCoverageTimeseriesResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COST = "cost";
  private CommitmentsCoverageTimeseriesMetric cost;

  public static final String JSON_PROPERTY_HOURS = "hours";
  private CommitmentsCoverageTimeseriesMetric hours;

  public static final String JSON_PROPERTY_QUERY_DEFINITION = "query_definition";
  private CommitmentsQueryDefinition queryDefinition;

  public CommitmentsCoverageTimeseriesResponseAttributes() {}

  @JsonCreator
  public CommitmentsCoverageTimeseriesResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COST)
          CommitmentsCoverageTimeseriesMetric cost,
      @JsonProperty(required = true, value = JSON_PROPERTY_HOURS)
          CommitmentsCoverageTimeseriesMetric hours) {
    this.cost = cost;
    this.unparsed |= cost.unparsed;
    this.hours = hours;
    this.unparsed |= hours.unparsed;
  }

  public CommitmentsCoverageTimeseriesResponseAttributes cost(
      CommitmentsCoverageTimeseriesMetric cost) {
    this.cost = cost;
    this.unparsed |= cost.unparsed;
    return this;
  }

  /**
   * A coverage timeseries metric. For AWS and Azure, <code>series</code> holds the <code>
   * on_demand_only</code>, <code>spot_only</code>, <code>ri</code>, and <code>sp</code> buckets,
   * plus <code>ppp</code> for Azure pre-purchase plans when enabled. For GCP, <code>series</code>
   * holds the <code>on_demand_only</code> and <code>flex_cud</code> buckets.
   *
   * @return cost
   */
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsCoverageTimeseriesMetric getCost() {
    return cost;
  }

  public void setCost(CommitmentsCoverageTimeseriesMetric cost) {
    this.cost = cost;
    if (cost != null) {
      this.unparsed |= cost.unparsed;
    }
  }

  public CommitmentsCoverageTimeseriesResponseAttributes hours(
      CommitmentsCoverageTimeseriesMetric hours) {
    this.hours = hours;
    this.unparsed |= hours.unparsed;
    return this;
  }

  /**
   * A coverage timeseries metric. For AWS and Azure, <code>series</code> holds the <code>
   * on_demand_only</code>, <code>spot_only</code>, <code>ri</code>, and <code>sp</code> buckets,
   * plus <code>ppp</code> for Azure pre-purchase plans when enabled. For GCP, <code>series</code>
   * holds the <code>on_demand_only</code> and <code>flex_cud</code> buckets.
   *
   * @return hours
   */
  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsCoverageTimeseriesMetric getHours() {
    return hours;
  }

  public void setHours(CommitmentsCoverageTimeseriesMetric hours) {
    this.hours = hours;
    if (hours != null) {
      this.unparsed |= hours.unparsed;
    }
  }

  public CommitmentsCoverageTimeseriesResponseAttributes queryDefinition(
      CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    this.unparsed |= queryDefinition.unparsed;
    return this;
  }

  /**
   * The query that produces the response values, in the same format as dashboard and notebook
   * widget requests, so a client can graph the values in a widget. Each formula's <code>id</code>
   * names the response value that it produces.
   *
   * @return queryDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsQueryDefinition getQueryDefinition() {
    return queryDefinition;
  }

  public void setQueryDefinition(CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    if (queryDefinition != null) {
      this.unparsed |= queryDefinition.unparsed;
    }
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
   * @return CommitmentsCoverageTimeseriesResponseAttributes
   */
  @JsonAnySetter
  public CommitmentsCoverageTimeseriesResponseAttributes putAdditionalProperty(
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

  /** Return true if this CommitmentsCoverageTimeseriesResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsCoverageTimeseriesResponseAttributes
        commitmentsCoverageTimeseriesResponseAttributes =
            (CommitmentsCoverageTimeseriesResponseAttributes) o;
    return Objects.equals(this.cost, commitmentsCoverageTimeseriesResponseAttributes.cost)
        && Objects.equals(this.hours, commitmentsCoverageTimeseriesResponseAttributes.hours)
        && Objects.equals(
            this.queryDefinition, commitmentsCoverageTimeseriesResponseAttributes.queryDefinition)
        && Objects.equals(
            this.additionalProperties,
            commitmentsCoverageTimeseriesResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, hours, queryDefinition, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsCoverageTimeseriesResponseAttributes {\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    queryDefinition: ").append(toIndentedString(queryDefinition)).append("\n");
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
