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

/** */
@JsonPropertyOrder({
  FunnelSuggestionRequestDataAttributesSearch.JSON_PROPERTY_CROSS_SESSION_FILTER,
  FunnelSuggestionRequestDataAttributesSearch.JSON_PROPERTY_QUERY_STRING,
  FunnelSuggestionRequestDataAttributesSearch.JSON_PROPERTY_STEPS,
  FunnelSuggestionRequestDataAttributesSearch.JSON_PROPERTY_SUBQUERY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelSuggestionRequestDataAttributesSearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CROSS_SESSION_FILTER = "cross_session_filter";
  private String crossSessionFilter;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<FunnelSuggestionRequestDataAttributesSearchStepsItems> steps = null;

  public static final String JSON_PROPERTY_SUBQUERY_ID = "subquery_id";
  private String subqueryId;

  public FunnelSuggestionRequestDataAttributesSearch crossSessionFilter(String crossSessionFilter) {
    this.crossSessionFilter = crossSessionFilter;
    return this;
  }

  /**
   * GetcrossSessionFilter
   *
   * @return crossSessionFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_SESSION_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCrossSessionFilter() {
    return crossSessionFilter;
  }

  public void setCrossSessionFilter(String crossSessionFilter) {
    this.crossSessionFilter = crossSessionFilter;
  }

  public FunnelSuggestionRequestDataAttributesSearch queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * GetqueryString
   *
   * @return queryString
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public FunnelSuggestionRequestDataAttributesSearch steps(
      List<FunnelSuggestionRequestDataAttributesSearchStepsItems> steps) {
    this.steps = steps;
    for (FunnelSuggestionRequestDataAttributesSearchStepsItems item : steps) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public FunnelSuggestionRequestDataAttributesSearch addStepsItem(
      FunnelSuggestionRequestDataAttributesSearchStepsItems stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Getsteps
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FunnelSuggestionRequestDataAttributesSearchStepsItems> getSteps() {
    return steps;
  }

  public void setSteps(List<FunnelSuggestionRequestDataAttributesSearchStepsItems> steps) {
    this.steps = steps;
  }

  public FunnelSuggestionRequestDataAttributesSearch subqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
    return this;
  }

  /**
   * GetsubqueryId
   *
   * @return subqueryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBQUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubqueryId() {
    return subqueryId;
  }

  public void setSubqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
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
   * @return FunnelSuggestionRequestDataAttributesSearch
   */
  @JsonAnySetter
  public FunnelSuggestionRequestDataAttributesSearch putAdditionalProperty(
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

  /** Return true if this FunnelSuggestionRequestDataAttributesSearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelSuggestionRequestDataAttributesSearch funnelSuggestionRequestDataAttributesSearch =
        (FunnelSuggestionRequestDataAttributesSearch) o;
    return Objects.equals(
            this.crossSessionFilter, funnelSuggestionRequestDataAttributesSearch.crossSessionFilter)
        && Objects.equals(this.queryString, funnelSuggestionRequestDataAttributesSearch.queryString)
        && Objects.equals(this.steps, funnelSuggestionRequestDataAttributesSearch.steps)
        && Objects.equals(this.subqueryId, funnelSuggestionRequestDataAttributesSearch.subqueryId)
        && Objects.equals(
            this.additionalProperties,
            funnelSuggestionRequestDataAttributesSearch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crossSessionFilter, queryString, steps, subqueryId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelSuggestionRequestDataAttributesSearch {\n");
    sb.append("    crossSessionFilter: ").append(toIndentedString(crossSessionFilter)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    subqueryId: ").append(toIndentedString(subqueryId)).append("\n");
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
