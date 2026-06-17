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

/** A percentage query that computes an insight value as a ratio of two metric queries. */
@JsonPropertyOrder({
  GovernanceInsightPercentageQuery.JSON_PROPERTY_DENOMINATOR_QUERY,
  GovernanceInsightPercentageQuery.JSON_PROPERTY_NUMERATOR_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceInsightPercentageQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DENOMINATOR_QUERY = "denominator_query";
  private GovernanceInsightMetricQuery denominatorQuery;

  public static final String JSON_PROPERTY_NUMERATOR_QUERY = "numerator_query";
  private GovernanceInsightMetricQuery numeratorQuery;

  public GovernanceInsightPercentageQuery() {}

  @JsonCreator
  public GovernanceInsightPercentageQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DENOMINATOR_QUERY)
          GovernanceInsightMetricQuery denominatorQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMERATOR_QUERY)
          GovernanceInsightMetricQuery numeratorQuery) {
    this.denominatorQuery = denominatorQuery;
    this.unparsed |= denominatorQuery.unparsed;
    this.numeratorQuery = numeratorQuery;
    this.unparsed |= numeratorQuery.unparsed;
  }

  public GovernanceInsightPercentageQuery denominatorQuery(
      GovernanceInsightMetricQuery denominatorQuery) {
    this.denominatorQuery = denominatorQuery;
    this.unparsed |= denominatorQuery.unparsed;
    return this;
  }

  /**
   * A metric query used to compute an insight value.
   *
   * @return denominatorQuery
   */
  @JsonProperty(JSON_PROPERTY_DENOMINATOR_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceInsightMetricQuery getDenominatorQuery() {
    return denominatorQuery;
  }

  public void setDenominatorQuery(GovernanceInsightMetricQuery denominatorQuery) {
    this.denominatorQuery = denominatorQuery;
  }

  public GovernanceInsightPercentageQuery numeratorQuery(
      GovernanceInsightMetricQuery numeratorQuery) {
    this.numeratorQuery = numeratorQuery;
    this.unparsed |= numeratorQuery.unparsed;
    return this;
  }

  /**
   * A metric query used to compute an insight value.
   *
   * @return numeratorQuery
   */
  @JsonProperty(JSON_PROPERTY_NUMERATOR_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceInsightMetricQuery getNumeratorQuery() {
    return numeratorQuery;
  }

  public void setNumeratorQuery(GovernanceInsightMetricQuery numeratorQuery) {
    this.numeratorQuery = numeratorQuery;
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
   * @return GovernanceInsightPercentageQuery
   */
  @JsonAnySetter
  public GovernanceInsightPercentageQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceInsightPercentageQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceInsightPercentageQuery governanceInsightPercentageQuery =
        (GovernanceInsightPercentageQuery) o;
    return Objects.equals(this.denominatorQuery, governanceInsightPercentageQuery.denominatorQuery)
        && Objects.equals(this.numeratorQuery, governanceInsightPercentageQuery.numeratorQuery)
        && Objects.equals(
            this.additionalProperties, governanceInsightPercentageQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denominatorQuery, numeratorQuery, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceInsightPercentageQuery {\n");
    sb.append("    denominatorQuery: ").append(toIndentedString(denominatorQuery)).append("\n");
    sb.append("    numeratorQuery: ").append(toIndentedString(numeratorQuery)).append("\n");
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
