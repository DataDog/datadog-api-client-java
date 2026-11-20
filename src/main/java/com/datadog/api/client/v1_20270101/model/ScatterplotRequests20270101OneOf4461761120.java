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
@JsonPropertyOrder({ScatterplotRequests20270101OneOf4461761120.JSON_PROPERTY_TABLE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotRequests20270101OneOf4461761120 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TABLE = "table";
  private ScatterplotBackendTableRequest table;

  public ScatterplotRequests20270101OneOf4461761120() {}

  @JsonCreator
  public ScatterplotRequests20270101OneOf4461761120(
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE)
          ScatterplotBackendTableRequest table) {
    this.table = table;
    this.unparsed |= table.unparsed;
  }

  public ScatterplotRequests20270101OneOf4461761120 table(ScatterplotBackendTableRequest table) {
    this.table = table;
    this.unparsed |= table.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return table
   */
  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ScatterplotBackendTableRequest getTable() {
    return table;
  }

  public void setTable(ScatterplotBackendTableRequest table) {
    this.table = table;
    if (table != null) {
      this.unparsed |= table.unparsed;
    }
  }

  /** Return true if this ScatterplotRequests20270101OneOf4461761120 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotRequests20270101OneOf4461761120 scatterplotRequests20270101OneOf4461761120 =
        (ScatterplotRequests20270101OneOf4461761120) o;
    return Objects.equals(this.table, scatterplotRequests20270101OneOf4461761120.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotRequests20270101OneOf4461761120 {\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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
