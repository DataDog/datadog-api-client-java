/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The response object for the RUM events aggregate API endpoint. */
@JsonPropertyOrder({
  RUMAnalyticsAggregateResponse.JSON_PROPERTY_DATA,
  RUMAnalyticsAggregateResponse.JSON_PROPERTY_LINKS,
  RUMAnalyticsAggregateResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RUMAnalyticsAggregateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private RUMAggregationBucketsResponse data;

  public static final String JSON_PROPERTY_LINKS = "links";
  private RUMResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private RUMResponseMetadata meta;

  public RUMAnalyticsAggregateResponse data(RUMAggregationBucketsResponse data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * The query results.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMAggregationBucketsResponse getData() {
    return data;
  }

  public void setData(RUMAggregationBucketsResponse data) {
    this.data = data;
  }

  public RUMAnalyticsAggregateResponse links(RUMResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links attributes.
   *
   * @return links
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMResponseLinks getLinks() {
    return links;
  }

  public void setLinks(RUMResponseLinks links) {
    this.links = links;
  }

  public RUMAnalyticsAggregateResponse meta(RUMResponseMetadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The metadata associated with a request.
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RUMResponseMetadata getMeta() {
    return meta;
  }

  public void setMeta(RUMResponseMetadata meta) {
    this.meta = meta;
  }

  /** Return true if this RUMAnalyticsAggregateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RUMAnalyticsAggregateResponse rumAnalyticsAggregateResponse = (RUMAnalyticsAggregateResponse) o;
    return Objects.equals(this.data, rumAnalyticsAggregateResponse.data)
        && Objects.equals(this.links, rumAnalyticsAggregateResponse.links)
        && Objects.equals(this.meta, rumAnalyticsAggregateResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RUMAnalyticsAggregateResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
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
