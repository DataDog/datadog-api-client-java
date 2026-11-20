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
  DistributionBackendRequest20270101OneOf4455765216.JSON_PROPERTY_RUM_QUERY,
  DistributionBackendRequest20270101OneOf4455765216.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionBackendRequest20270101OneOf4455765216 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RUM_QUERY = "rum_query";
  private LogQueryDefinition rumQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle style;

  public DistributionBackendRequest20270101OneOf4455765216() {}

  @JsonCreator
  public DistributionBackendRequest20270101OneOf4455765216(
      @JsonProperty(required = true, value = JSON_PROPERTY_RUM_QUERY) LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
  }

  public DistributionBackendRequest20270101OneOf4455765216 rumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    this.unparsed |= rumQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return rumQuery
   */
  @JsonProperty(JSON_PROPERTY_RUM_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getRumQuery() {
    return rumQuery;
  }

  public void setRumQuery(LogQueryDefinition rumQuery) {
    this.rumQuery = rumQuery;
    if (rumQuery != null) {
      this.unparsed |= rumQuery.unparsed;
    }
  }

  public DistributionBackendRequest20270101OneOf4455765216 style(RequestStyle style) {
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

  /** Return true if this DistributionBackendRequest20270101OneOf4455765216 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionBackendRequest20270101OneOf4455765216
        distributionBackendRequest20270101OneOf4455765216 =
            (DistributionBackendRequest20270101OneOf4455765216) o;
    return Objects.equals(this.rumQuery, distributionBackendRequest20270101OneOf4455765216.rumQuery)
        && Objects.equals(this.style, distributionBackendRequest20270101OneOf4455765216.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rumQuery, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionBackendRequest20270101OneOf4455765216 {\n");
    sb.append("    rumQuery: ").append(toIndentedString(rumQuery)).append("\n");
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
