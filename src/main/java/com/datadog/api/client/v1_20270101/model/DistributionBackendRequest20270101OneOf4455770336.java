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
  DistributionBackendRequest20270101OneOf4455770336.JSON_PROPERTY_APPSECSPAN_QUERY,
  DistributionBackendRequest20270101OneOf4455770336.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DistributionBackendRequest20270101OneOf4455770336 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPSECSPAN_QUERY = "appsecspan_query";
  private LogQueryDefinition appsecspanQuery;

  public static final String JSON_PROPERTY_STYLE = "style";
  private RequestStyle style;

  public DistributionBackendRequest20270101OneOf4455770336() {}

  @JsonCreator
  public DistributionBackendRequest20270101OneOf4455770336(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPSECSPAN_QUERY)
          LogQueryDefinition appsecspanQuery) {
    this.appsecspanQuery = appsecspanQuery;
    this.unparsed |= appsecspanQuery.unparsed;
  }

  public DistributionBackendRequest20270101OneOf4455770336 appsecspanQuery(
      LogQueryDefinition appsecspanQuery) {
    this.appsecspanQuery = appsecspanQuery;
    this.unparsed |= appsecspanQuery.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return appsecspanQuery
   */
  @JsonProperty(JSON_PROPERTY_APPSECSPAN_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogQueryDefinition getAppsecspanQuery() {
    return appsecspanQuery;
  }

  public void setAppsecspanQuery(LogQueryDefinition appsecspanQuery) {
    this.appsecspanQuery = appsecspanQuery;
    if (appsecspanQuery != null) {
      this.unparsed |= appsecspanQuery.unparsed;
    }
  }

  public DistributionBackendRequest20270101OneOf4455770336 style(RequestStyle style) {
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

  /** Return true if this DistributionBackendRequest20270101OneOf4455770336 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionBackendRequest20270101OneOf4455770336
        distributionBackendRequest20270101OneOf4455770336 =
            (DistributionBackendRequest20270101OneOf4455770336) o;
    return Objects.equals(
            this.appsecspanQuery, distributionBackendRequest20270101OneOf4455770336.appsecspanQuery)
        && Objects.equals(this.style, distributionBackendRequest20270101OneOf4455770336.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appsecspanQuery, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionBackendRequest20270101OneOf4455770336 {\n");
    sb.append("    appsecspanQuery: ").append(toIndentedString(appsecspanQuery)).append("\n");
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
