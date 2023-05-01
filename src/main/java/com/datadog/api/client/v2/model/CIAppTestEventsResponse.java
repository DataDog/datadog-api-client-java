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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response object with all test events matching the request and pagination information. */
@JsonPropertyOrder({
  CIAppTestEventsResponse.JSON_PROPERTY_DATA,
  CIAppTestEventsResponse.JSON_PROPERTY_LINKS,
  CIAppTestEventsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppTestEventsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<CIAppTestEvent> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private CIAppResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private CIAppResponseMetadataWithPagination meta;

  public CIAppTestEventsResponse data(List<CIAppTestEvent> data) {
    this.data = data;
    for (CIAppTestEvent item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CIAppTestEventsResponse addDataItem(CIAppTestEvent dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of events matching the request.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CIAppTestEvent> getData() {
    return data;
  }

  public void setData(List<CIAppTestEvent> data) {
    this.data = data;
  }

  public CIAppTestEventsResponse links(CIAppResponseLinks links) {
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

  public CIAppTestEventsResponse meta(CIAppResponseMetadataWithPagination meta) {
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
  public CIAppResponseMetadataWithPagination getMeta() {
    return meta;
  }

  public void setMeta(CIAppResponseMetadataWithPagination meta) {
    this.meta = meta;
  }

  /** Return true if this CIAppTestEventsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppTestEventsResponse ciAppTestEventsResponse = (CIAppTestEventsResponse) o;
    return Objects.equals(this.data, ciAppTestEventsResponse.data)
        && Objects.equals(this.links, ciAppTestEventsResponse.links)
        && Objects.equals(this.meta, ciAppTestEventsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppTestEventsResponse {\n");
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
