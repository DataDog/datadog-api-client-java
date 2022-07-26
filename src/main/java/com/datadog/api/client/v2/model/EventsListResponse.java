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

/** The response object with all events matching the request and pagination information. */
@JsonPropertyOrder({
  EventsListResponse.JSON_PROPERTY_DATA,
  EventsListResponse.JSON_PROPERTY_LINKS,
  EventsListResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<EventResponse> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private EventsListResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private EventsResponseMetadata meta;

  public EventsListResponse data(List<EventResponse> data) {
    this.data = data;
    for (EventResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EventsListResponse addDataItem(EventResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of events matching the request.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventResponse> getData() {
    return data;
  }

  public void setData(List<EventResponse> data) {
    this.data = data;
  }

  public EventsListResponse links(EventsListResponseLinks links) {
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
  public EventsListResponseLinks getLinks() {
    return links;
  }

  public void setLinks(EventsListResponseLinks links) {
    this.links = links;
  }

  public EventsListResponse meta(EventsResponseMetadata meta) {
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
  public EventsResponseMetadata getMeta() {
    return meta;
  }

  public void setMeta(EventsResponseMetadata meta) {
    this.meta = meta;
  }

  /** Return true if this EventsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsListResponse eventsListResponse = (EventsListResponse) o;
    return Objects.equals(this.data, eventsListResponse.data)
        && Objects.equals(this.links, eventsListResponse.links)
        && Objects.equals(this.meta, eventsListResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsListResponse {\n");
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
