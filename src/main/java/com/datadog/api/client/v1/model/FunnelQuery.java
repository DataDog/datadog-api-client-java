/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Updated funnel widget. */
@JsonPropertyOrder({
  FunnelQuery.JSON_PROPERTY_DATA_SOURCE,
  FunnelQuery.JSON_PROPERTY_QUERY_STRING,
  FunnelQuery.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FunnelSource dataSource = FunnelSource.RUM;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<FunnelStep> steps = new ArrayList<>();

  public FunnelQuery() {}

  @JsonCreator
  public FunnelQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) FunnelSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEPS) List<FunnelStep> steps) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.queryString = queryString;
    this.steps = steps;
  }

  public FunnelQuery dataSource(FunnelSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Source from which to query items to display in the funnel.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FunnelSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FunnelSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FunnelQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * The widget query.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public FunnelQuery steps(List<FunnelStep> steps) {
    this.steps = steps;
    for (FunnelStep item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FunnelQuery addStepsItem(FunnelStep stepsItem) {
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * List of funnel steps.
   *
   * @return steps
   */
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<FunnelStep> getSteps() {
    return steps;
  }

  public void setSteps(List<FunnelStep> steps) {
    this.steps = steps;
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
   * @return FunnelQuery
   */
  @JsonAnySetter
  public FunnelQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FunnelQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelQuery funnelQuery = (FunnelQuery) o;
    return Objects.equals(this.dataSource, funnelQuery.dataSource)
        && Objects.equals(this.queryString, funnelQuery.queryString)
        && Objects.equals(this.steps, funnelQuery.steps)
        && Objects.equals(this.additionalProperties, funnelQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, queryString, steps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
