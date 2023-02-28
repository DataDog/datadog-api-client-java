/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The response object for the test events aggregate API endpoint. */
@JsonPropertyOrder({
  CIAppTestsAnalyticsAggregateResponse.JSON_PROPERTY_DATA,
  CIAppTestsAnalyticsAggregateResponse.JSON_PROPERTY_LINKS,
  CIAppTestsAnalyticsAggregateResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppTestsAnalyticsAggregateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private CIAppTestsAggregationBucketsResponse data;

  public static final String JSON_PROPERTY_LINKS = "links";
  private CIAppResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private CIAppResponseMetadata meta;

  public CIAppTestsAnalyticsAggregateResponse data(CIAppTestsAggregationBucketsResponse data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * The query results.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppTestsAggregationBucketsResponse getData() {
    return data;
  }

  public void setData(CIAppTestsAggregationBucketsResponse data) {
    this.data = data;
  }

  public CIAppTestsAnalyticsAggregateResponse links(CIAppResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links attributes.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppResponseLinks getLinks() {
    return links;
  }

  public void setLinks(CIAppResponseLinks links) {
    this.links = links;
  }

  public CIAppTestsAnalyticsAggregateResponse meta(CIAppResponseMetadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The metadata associated with a request.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppResponseMetadata getMeta() {
    return meta;
  }

  public void setMeta(CIAppResponseMetadata meta) {
    this.meta = meta;
  }

  /** Return true if this CIAppTestsAnalyticsAggregateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppTestsAnalyticsAggregateResponse ciAppTestsAnalyticsAggregateResponse =
        (CIAppTestsAnalyticsAggregateResponse) o;
    return Objects.equals(this.data, ciAppTestsAnalyticsAggregateResponse.data)
        && Objects.equals(this.links, ciAppTestsAnalyticsAggregateResponse.links)
        && Objects.equals(this.meta, ciAppTestsAnalyticsAggregateResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppTestsAnalyticsAggregateResponse {\n");
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
