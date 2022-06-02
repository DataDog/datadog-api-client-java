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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response object with all logs matching the request and pagination information. */
@JsonPropertyOrder({
  LogsListResponse.JSON_PROPERTY_DATA,
  LogsListResponse.JSON_PROPERTY_LINKS,
  LogsListResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<Log> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private LogsListResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private LogsResponseMetadata meta;

  public LogsListResponse data(List<Log> data) {
    this.data = data;
    for (Log item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsListResponse addDataItem(Log dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of logs matching the request.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Log> getData() {
    return data;
  }

  public void setData(List<Log> data) {
    this.data = data;
  }

  public LogsListResponse links(LogsListResponseLinks links) {
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
  public LogsListResponseLinks getLinks() {
    return links;
  }

  public void setLinks(LogsListResponseLinks links) {
    this.links = links;
  }

  public LogsListResponse meta(LogsResponseMetadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The metadata associated with a request
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsResponseMetadata getMeta() {
    return meta;
  }

  public void setMeta(LogsResponseMetadata meta) {
    this.meta = meta;
  }

  /** Return true if this LogsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsListResponse logsListResponse = (LogsListResponse) o;
    return Objects.equals(this.data, logsListResponse.data)
        && Objects.equals(this.links, logsListResponse.links)
        && Objects.equals(this.meta, logsListResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsListResponse {\n");
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
