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
@JsonPropertyOrder({SplitDimension.JSON_PROPERTY_ONE_GRAPH_PER})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitDimension {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ONE_GRAPH_PER = "one_graph_per";
  private String oneGraphPer;

  public SplitDimension() {}

  @JsonCreator
  public SplitDimension(
      @JsonProperty(required = true, value = JSON_PROPERTY_ONE_GRAPH_PER) String oneGraphPer) {
    this.oneGraphPer = oneGraphPer;
  }

  public SplitDimension oneGraphPer(String oneGraphPer) {
    this.oneGraphPer = oneGraphPer;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return oneGraphPer
   */
  @JsonProperty(JSON_PROPERTY_ONE_GRAPH_PER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOneGraphPer() {
    return oneGraphPer;
  }

  public void setOneGraphPer(String oneGraphPer) {
    this.oneGraphPer = oneGraphPer;
  }

  /** Return true if this SplitDimension object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitDimension splitDimension = (SplitDimension) o;
    return Objects.equals(this.oneGraphPer, splitDimension.oneGraphPer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneGraphPer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitDimension {\n");
    sb.append("    oneGraphPer: ").append(toIndentedString(oneGraphPer)).append("\n");
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
