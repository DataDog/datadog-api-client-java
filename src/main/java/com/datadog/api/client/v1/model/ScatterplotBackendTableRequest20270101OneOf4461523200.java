/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScatterplotBackendTableRequest20270101OneOf4461523200.JSON_PROPERTY__QUERY_OPTIONS,
  ScatterplotBackendTableRequest20270101OneOf4461523200.JSON_PROPERTY_Q
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendTableRequest20270101OneOf4461523200 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema2_20270101> QueryOptions = null;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public ScatterplotBackendTableRequest20270101OneOf4461523200() {}

  @JsonCreator
  public ScatterplotBackendTableRequest20270101OneOf4461523200(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461523200 QueryOptions(
      Map<String, DashboardInlineSchema2_20270101> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461523200 putQueryOptionsItem(
      String key, DashboardInlineSchema2_20270101 QueryOptionsItem) {
    if (this.QueryOptions == null) {
      this.QueryOptions = new HashMap<>();
    }
    this.QueryOptions.put(key, QueryOptionsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return QueryOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY__QUERY_OPTIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, DashboardInlineSchema2_20270101> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema2_20270101> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461523200 q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  /**
   * Return true if this ScatterplotBackendTableRequest20270101OneOf4461523200 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendTableRequest20270101OneOf4461523200
        scatterplotBackendTableRequest20270101OneOf4461523200 =
            (ScatterplotBackendTableRequest20270101OneOf4461523200) o;
    return Objects.equals(
            this.QueryOptions, scatterplotBackendTableRequest20270101OneOf4461523200.QueryOptions)
        && Objects.equals(this.q, scatterplotBackendTableRequest20270101OneOf4461523200.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(QueryOptions, q);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendTableRequest20270101OneOf4461523200 {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
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
