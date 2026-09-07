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

/** An audit log query used to compute an insight value. */
@JsonPropertyOrder({
  GovernanceInsightAuditQuery.JSON_PROPERTY_COMPUTE,
  GovernanceInsightAuditQuery.JSON_PROPERTY_INDEXES,
  GovernanceInsightAuditQuery.JSON_PROPERTY_QUERY,
  GovernanceInsightAuditQuery.JSON_PROPERTY_SOURCE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceInsightAuditQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private GovernanceInsightAuditCompute compute;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public GovernanceInsightAuditQuery() {}

  @JsonCreator
  public GovernanceInsightAuditQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          GovernanceInsightAuditCompute compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEXES) List<String> indexes,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    this.indexes = indexes;
    this.query = query;
    this.source = source;
  }

  public GovernanceInsightAuditQuery compute(GovernanceInsightAuditCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * The aggregation applied to an audit log query.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceInsightAuditCompute getCompute() {
    return compute;
  }

  public void setCompute(GovernanceInsightAuditCompute compute) {
    this.compute = compute;
    if (compute != null) {
      this.unparsed |= compute.unparsed;
    }
  }

  public GovernanceInsightAuditQuery indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public GovernanceInsightAuditQuery addIndexesItem(String indexesItem) {
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * The audit log indexes the query runs against.
   *
   * @return indexes
   */
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public GovernanceInsightAuditQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The audit log search query string.
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

  public GovernanceInsightAuditQuery source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The data source the query runs against.
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
   * @return GovernanceInsightAuditQuery
   */
  @JsonAnySetter
  public GovernanceInsightAuditQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceInsightAuditQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceInsightAuditQuery governanceInsightAuditQuery = (GovernanceInsightAuditQuery) o;
    return Objects.equals(this.compute, governanceInsightAuditQuery.compute)
        && Objects.equals(this.indexes, governanceInsightAuditQuery.indexes)
        && Objects.equals(this.query, governanceInsightAuditQuery.query)
        && Objects.equals(this.source, governanceInsightAuditQuery.source)
        && Objects.equals(
            this.additionalProperties, governanceInsightAuditQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, indexes, query, source, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceInsightAuditQuery {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
