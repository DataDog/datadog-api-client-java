/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** A search SLO response containing results from the search query. */
@JsonPropertyOrder({
  SearchSLOResponse.JSON_PROPERTY_DATA,
  SearchSLOResponse.JSON_PROPERTY_LINKS,
  SearchSLOResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchSLOResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SearchSLOResponseData data;

  public static final String JSON_PROPERTY_LINKS = "links";
  private SearchSLOResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private SearchSLOResponseMeta meta;

  public SearchSLOResponse data(SearchSLOResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Data from search SLO response.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SearchSLOResponseData getData() {
    return data;
  }

  public void setData(SearchSLOResponseData data) {
    this.data = data;
  }

  public SearchSLOResponse links(SearchSLOResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Pagination links.
   *
   * @return links
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SearchSLOResponseLinks getLinks() {
    return links;
  }

  public void setLinks(SearchSLOResponseLinks links) {
    this.links = links;
  }

  public SearchSLOResponse meta(SearchSLOResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Searches metadata returned by the API.
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SearchSLOResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(SearchSLOResponseMeta meta) {
    this.meta = meta;
  }

  /** Return true if this SearchSLOResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSLOResponse searchSloResponse = (SearchSLOResponse) o;
    return Objects.equals(this.data, searchSloResponse.data)
        && Objects.equals(this.links, searchSloResponse.links)
        && Objects.equals(this.meta, searchSloResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSLOResponse {\n");
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
