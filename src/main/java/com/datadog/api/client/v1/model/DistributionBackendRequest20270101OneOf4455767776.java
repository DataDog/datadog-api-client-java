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
  DistributionBackendRequest20270101OneOf4455767776.JSON_PROPERTY_PROFILE_METRICS_QUERY,
  DistributionBackendRequest20270101OneOf4455767776.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionBackendRequest20270101OneOf4455767776 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PROFILE_METRICS_QUERY = "profile_metrics_query";
  private LogQueryDefinition_20270101 profileMetricsQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle_20270101 style;

  public DistributionBackendRequest20270101OneOf4455767776() {}

  @JsonCreator
  public DistributionBackendRequest20270101OneOf4455767776(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROFILE_METRICS_QUERY)
          LogQueryDefinition_20270101 profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
    this.unparsed |= profileMetricsQuery.unparsed;
  }

  public DistributionBackendRequest20270101OneOf4455767776 profileMetricsQuery(
      LogQueryDefinition_20270101 profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
    this.unparsed |= profileMetricsQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return profileMetricsQuery
   */
  @JsonProperty(JSON_PROPERTY_PROFILE_METRICS_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition_20270101 getProfileMetricsQuery() {
    return profileMetricsQuery;
  }

  public void setProfileMetricsQuery(LogQueryDefinition_20270101 profileMetricsQuery) {
    this.profileMetricsQuery = profileMetricsQuery;
    if (profileMetricsQuery != null) {
      this.unparsed |= profileMetricsQuery.unparsed;
    }
  }

  public DistributionBackendRequest20270101OneOf4455767776 style(RequestStyle_20270101 style) {
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

  /** Return true if this DistributionBackendRequest20270101OneOf4455767776 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionBackendRequest20270101OneOf4455767776
        distributionBackendRequest20270101OneOf4455767776 =
            (DistributionBackendRequest20270101OneOf4455767776) o;
    return Objects.equals(
            this.profileMetricsQuery,
            distributionBackendRequest20270101OneOf4455767776.profileMetricsQuery)
        && Objects.equals(this.style, distributionBackendRequest20270101OneOf4455767776.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileMetricsQuery, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionBackendRequest20270101OneOf4455767776 {\n");
    sb.append("    profileMetricsQuery: ")
        .append(toIndentedString(profileMetricsQuery))
        .append("\n");
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
