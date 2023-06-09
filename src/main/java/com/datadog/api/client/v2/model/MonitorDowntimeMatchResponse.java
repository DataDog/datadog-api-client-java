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

/** Response for retrieving all downtime matches for a monitor. */
@JsonPropertyOrder({
  MonitorDowntimeMatchResponse.JSON_PROPERTY_DATA,
  MonitorDowntimeMatchResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorDowntimeMatchResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<MonitorDowntimeMatchListItemResponse> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private DowntimeMeta meta;

  public MonitorDowntimeMatchResponse data(List<MonitorDowntimeMatchListItemResponse> data) {
    this.data = data;
    for (MonitorDowntimeMatchListItemResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonitorDowntimeMatchResponse addDataItem(MonitorDowntimeMatchListItemResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of downtime matches.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorDowntimeMatchListItemResponse> getData() {
    return data;
  }

  public void setData(List<MonitorDowntimeMatchListItemResponse> data) {
    this.data = data;
  }

  public MonitorDowntimeMatchResponse meta(DowntimeMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Pagination metadata returned by the API.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeMeta getMeta() {
    return meta;
  }

  public void setMeta(DowntimeMeta meta) {
    this.meta = meta;
  }

  /** Return true if this MonitorDowntimeMatchResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorDowntimeMatchResponse monitorDowntimeMatchResponse = (MonitorDowntimeMatchResponse) o;
    return Objects.equals(this.data, monitorDowntimeMatchResponse.data)
        && Objects.equals(this.meta, monitorDowntimeMatchResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorDowntimeMatchResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
