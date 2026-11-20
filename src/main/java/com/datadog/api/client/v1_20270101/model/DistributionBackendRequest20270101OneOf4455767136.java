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
@JsonPropertyOrder({
  DistributionBackendRequest20270101OneOf4455767136.JSON_PROPERTY_EVENT_QUERY,
  DistributionBackendRequest20270101OneOf4455767136.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionBackendRequest20270101OneOf4455767136 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private LogQueryDefinition eventQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle style;

  public DistributionBackendRequest20270101OneOf4455767136() {}

  @JsonCreator
  public DistributionBackendRequest20270101OneOf4455767136(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVENT_QUERY)
          LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
  }

  public DistributionBackendRequest20270101OneOf4455767136 eventQuery(
      LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return eventQuery
   */
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(LogQueryDefinition eventQuery) {
    this.eventQuery = eventQuery;
    if (eventQuery != null) {
      this.unparsed |= eventQuery.unparsed;
    }
  }

  public DistributionBackendRequest20270101OneOf4455767136 style(RequestStyle style) {
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
  public RequestStyle getStyle() {
    return style;
  }

  public void setStyle(RequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this DistributionBackendRequest20270101OneOf4455767136 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionBackendRequest20270101OneOf4455767136
        distributionBackendRequest20270101OneOf4455767136 =
            (DistributionBackendRequest20270101OneOf4455767136) o;
    return Objects.equals(
            this.eventQuery, distributionBackendRequest20270101OneOf4455767136.eventQuery)
        && Objects.equals(this.style, distributionBackendRequest20270101OneOf4455767136.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventQuery, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionBackendRequest20270101OneOf4455767136 {\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
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
