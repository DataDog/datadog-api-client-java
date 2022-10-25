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

/** Response object with all pipeline events matching the request and pagination information. */
@JsonPropertyOrder({
  CIAppPipelineEventsResponse.JSON_PROPERTY_DATA,
  CIAppPipelineEventsResponse.JSON_PROPERTY_LINKS,
  CIAppPipelineEventsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<CIAppPipelineEvent> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private CIAppResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private CIAppResponseMetadata meta;

  public CIAppPipelineEventsResponse data(List<CIAppPipelineEvent> data) {
    this.data = data;
    for (CIAppPipelineEvent item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CIAppPipelineEventsResponse addDataItem(CIAppPipelineEvent dataItem) {
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
  public List<CIAppPipelineEvent> getData() {
    return data;
  }

  public void setData(List<CIAppPipelineEvent> data) {
    this.data = data;
  }

  public CIAppPipelineEventsResponse links(CIAppResponseLinks links) {
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

  public CIAppPipelineEventsResponse meta(CIAppResponseMetadata meta) {
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

  /** Return true if this CIAppPipelineEventsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventsResponse ciAppPipelineEventsResponse = (CIAppPipelineEventsResponse) o;
    return Objects.equals(this.data, ciAppPipelineEventsResponse.data)
        && Objects.equals(this.links, ciAppPipelineEventsResponse.links)
        && Objects.equals(this.meta, ciAppPipelineEventsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventsResponse {\n");
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
