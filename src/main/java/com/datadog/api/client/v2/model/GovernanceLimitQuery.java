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

/** A metric query used to compute usage against a limit. */
@JsonPropertyOrder({
  GovernanceLimitQuery.JSON_PROPERTY_QUERY,
  GovernanceLimitQuery.JSON_PROPERTY_REDUCER,
  GovernanceLimitQuery.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceLimitQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_REDUCER = "reducer";
  private String reducer;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public GovernanceLimitQuery() {}

  @JsonCreator
  public GovernanceLimitQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REDUCER) String reducer,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source) {
    this.query = query;
    this.reducer = reducer;
    this.source = source;
  }

  public GovernanceLimitQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The metric query expression used to compute the limit value.
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

  public GovernanceLimitQuery reducer(String reducer) {
    this.reducer = reducer;
    return this;
  }

  /**
   * How the query results are aggregated into a single value (for example, sum, max, or avg).
   *
   * @return reducer
   */
  @JsonProperty(JSON_PROPERTY_REDUCER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReducer() {
    return reducer;
  }

  public void setReducer(String reducer) {
    this.reducer = reducer;
  }

  public GovernanceLimitQuery source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The data source used to evaluate the metric query (for example, the metrics or events backend).
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
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
   * @return GovernanceLimitQuery
   */
  @JsonAnySetter
  public GovernanceLimitQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceLimitQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceLimitQuery governanceLimitQuery = (GovernanceLimitQuery) o;
    return Objects.equals(this.query, governanceLimitQuery.query)
        && Objects.equals(this.reducer, governanceLimitQuery.reducer)
        && Objects.equals(this.source, governanceLimitQuery.source)
        && Objects.equals(this.additionalProperties, governanceLimitQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, reducer, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceLimitQuery {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    reducer: ").append(toIndentedString(reducer)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
