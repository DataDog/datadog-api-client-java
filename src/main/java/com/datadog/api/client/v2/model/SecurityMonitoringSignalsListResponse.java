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

/**
 * The response object with all security signals matching the request and pagination information.
 */
@JsonPropertyOrder({
  SecurityMonitoringSignalsListResponse.JSON_PROPERTY_DATA,
  SecurityMonitoringSignalsListResponse.JSON_PROPERTY_LINKS,
  SecurityMonitoringSignalsListResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalsListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SecurityMonitoringSignal> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private SecurityMonitoringSignalsListResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private SecurityMonitoringSignalsListResponseMeta meta;

  public SecurityMonitoringSignalsListResponse data(List<SecurityMonitoringSignal> data) {
    this.data = data;
    for (SecurityMonitoringSignal item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalsListResponse addDataItem(SecurityMonitoringSignal dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of security signals matching the request.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringSignal> getData() {
    return data;
  }

  public void setData(List<SecurityMonitoringSignal> data) {
    this.data = data;
  }

  public SecurityMonitoringSignalsListResponse links(
      SecurityMonitoringSignalsListResponseLinks links) {
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
  public SecurityMonitoringSignalsListResponseLinks getLinks() {
    return links;
  }

  public void setLinks(SecurityMonitoringSignalsListResponseLinks links) {
    this.links = links;
  }

  public SecurityMonitoringSignalsListResponse meta(
      SecurityMonitoringSignalsListResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Meta attributes.
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringSignalsListResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(SecurityMonitoringSignalsListResponseMeta meta) {
    this.meta = meta;
  }

  /** Return true if this SecurityMonitoringSignalsListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalsListResponse securityMonitoringSignalsListResponse =
        (SecurityMonitoringSignalsListResponse) o;
    return Objects.equals(this.data, securityMonitoringSignalsListResponse.data)
        && Objects.equals(this.links, securityMonitoringSignalsListResponse.links)
        && Objects.equals(this.meta, securityMonitoringSignalsListResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalsListResponse {\n");
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
