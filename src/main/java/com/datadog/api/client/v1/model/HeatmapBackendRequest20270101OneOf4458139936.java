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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  HeatmapBackendRequest20270101OneOf4458139936.JSON_PROPERTY_PROCESS_QUERY,
  HeatmapBackendRequest20270101OneOf4458139936.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatmapBackendRequest20270101OneOf4458139936 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROCESS_QUERY = "process_query";
  private ProcessQueryDefinition_20270101 processQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle_20270101 style;

  public HeatmapBackendRequest20270101OneOf4458139936() {}

  @JsonCreator
  public HeatmapBackendRequest20270101OneOf4458139936(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROCESS_QUERY)
          ProcessQueryDefinition_20270101 processQuery) {
    this.processQuery = processQuery;
    this.unparsed |= processQuery.unparsed;
  }

  public HeatmapBackendRequest20270101OneOf4458139936 processQuery(
      ProcessQueryDefinition_20270101 processQuery) {
    this.processQuery = processQuery;
    this.unparsed |= processQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return processQuery
   */
  @JsonProperty(JSON_PROPERTY_PROCESS_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProcessQueryDefinition_20270101 getProcessQuery() {
    return processQuery;
  }

  public void setProcessQuery(ProcessQueryDefinition_20270101 processQuery) {
    this.processQuery = processQuery;
    if (processQuery != null) {
      this.unparsed |= processQuery.unparsed;
    }
  }

  public HeatmapBackendRequest20270101OneOf4458139936 style(RequestStyle_20270101 style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RequestStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(RequestStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this HeatmapBackendRequest20270101OneOf4458139936 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatmapBackendRequest20270101OneOf4458139936 heatmapBackendRequest20270101OneOf4458139936 =
        (HeatmapBackendRequest20270101OneOf4458139936) o;
    return Objects.equals(
            this.processQuery, heatmapBackendRequest20270101OneOf4458139936.processQuery)
        && Objects.equals(this.style, heatmapBackendRequest20270101OneOf4458139936.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processQuery, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatmapBackendRequest20270101OneOf4458139936 {\n");
    sb.append("    processQuery: ").append(toIndentedString(processQuery)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
