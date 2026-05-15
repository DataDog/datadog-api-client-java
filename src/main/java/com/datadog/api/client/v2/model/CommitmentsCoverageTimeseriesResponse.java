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

/** Response containing timeseries coverage metrics for cloud commitment programs. */
@JsonPropertyOrder({
  CommitmentsCoverageTimeseriesResponse.JSON_PROPERTY_COST,
  CommitmentsCoverageTimeseriesResponse.JSON_PROPERTY_HOURS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsCoverageTimeseriesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COST = "cost";
  private CommitmentsTimeseriesMetric cost;

  public static final String JSON_PROPERTY_HOURS = "hours";
  private CommitmentsTimeseriesMetric hours;

  public CommitmentsCoverageTimeseriesResponse() {}

  @JsonCreator
  public CommitmentsCoverageTimeseriesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_COST) CommitmentsTimeseriesMetric cost,
      @JsonProperty(required = true, value = JSON_PROPERTY_HOURS)
          CommitmentsTimeseriesMetric hours) {
    this.cost = cost;
    this.unparsed |= cost.unparsed;
    this.hours = hours;
    this.unparsed |= hours.unparsed;
  }

  public CommitmentsCoverageTimeseriesResponse cost(CommitmentsTimeseriesMetric cost) {
    this.cost = cost;
    this.unparsed |= cost.unparsed;
    return this;
  }

  /**
   * A timeseries metric containing timestamps, series values, and optional unit metadata.
   *
   * @return cost
   */
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsTimeseriesMetric getCost() {
    return cost;
  }

  public void setCost(CommitmentsTimeseriesMetric cost) {
    this.cost = cost;
  }

  public CommitmentsCoverageTimeseriesResponse hours(CommitmentsTimeseriesMetric hours) {
    this.hours = hours;
    this.unparsed |= hours.unparsed;
    return this;
  }

  /**
   * A timeseries metric containing timestamps, series values, and optional unit metadata.
   *
   * @return hours
   */
  @JsonProperty(JSON_PROPERTY_HOURS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CommitmentsTimeseriesMetric getHours() {
    return hours;
  }

  public void setHours(CommitmentsTimeseriesMetric hours) {
    this.hours = hours;
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
   * @return CommitmentsCoverageTimeseriesResponse
   */
  @JsonAnySetter
  public CommitmentsCoverageTimeseriesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsCoverageTimeseriesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsCoverageTimeseriesResponse commitmentsCoverageTimeseriesResponse =
        (CommitmentsCoverageTimeseriesResponse) o;
    return Objects.equals(this.cost, commitmentsCoverageTimeseriesResponse.cost)
        && Objects.equals(this.hours, commitmentsCoverageTimeseriesResponse.hours)
        && Objects.equals(
            this.additionalProperties, commitmentsCoverageTimeseriesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, hours, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsCoverageTimeseriesResponse {\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
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
