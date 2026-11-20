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
  DistributionBackendRequest20270101OneOf4455763936.JSON_PROPERTY_APM_QUERY,
  DistributionBackendRequest20270101OneOf4455763936.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionBackendRequest20270101OneOf4455763936 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APM_QUERY = "apm_query";
  private LogQueryDefinition apmQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle style;

  public DistributionBackendRequest20270101OneOf4455763936() {}

  @JsonCreator
  public DistributionBackendRequest20270101OneOf4455763936(
      @JsonProperty(required = true, value = JSON_PROPERTY_APM_QUERY) LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
    this.unparsed |= apmQuery.unparsed;
  }

  public DistributionBackendRequest20270101OneOf4455763936 apmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
    this.unparsed |= apmQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return apmQuery
   */
  @JsonProperty(JSON_PROPERTY_APM_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getApmQuery() {
    return apmQuery;
  }

  public void setApmQuery(LogQueryDefinition apmQuery) {
    this.apmQuery = apmQuery;
    if (apmQuery != null) {
      this.unparsed |= apmQuery.unparsed;
    }
  }

  public DistributionBackendRequest20270101OneOf4455763936 style(RequestStyle style) {
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

  /** Return true if this DistributionBackendRequest20270101OneOf4455763936 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionBackendRequest20270101OneOf4455763936
        distributionBackendRequest20270101OneOf4455763936 =
            (DistributionBackendRequest20270101OneOf4455763936) o;
    return Objects.equals(this.apmQuery, distributionBackendRequest20270101OneOf4455763936.apmQuery)
        && Objects.equals(this.style, distributionBackendRequest20270101OneOf4455763936.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apmQuery, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionBackendRequest20270101OneOf4455763936 {\n");
    sb.append("    apmQuery: ").append(toIndentedString(apmQuery)).append("\n");
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
