/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({TableGroupKey.JSON_PROPERTY_GROUP_KEY, TableGroupKey.JSON_PROPERTY_QUERY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableGroupKey {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_KEY = "group_key";
  private String groupKey;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public TableGroupKey() {}

  @JsonCreator
  public TableGroupKey(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_KEY) String groupKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query) {
    this.groupKey = groupKey;
    this.query = query;
  }

  public TableGroupKey groupKey(String groupKey) {
    this.groupKey = groupKey;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupKey
   */
  @JsonProperty(JSON_PROPERTY_GROUP_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGroupKey() {
    return groupKey;
  }

  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  public TableGroupKey query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  /** Return true if this TableGroupKey object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableGroupKey tableGroupKey = (TableGroupKey) o;
    return Objects.equals(this.groupKey, tableGroupKey.groupKey)
        && Objects.equals(this.query, tableGroupKey.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupKey, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableGroupKey {\n");
    sb.append("    groupKey: ").append(toIndentedString(groupKey)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
