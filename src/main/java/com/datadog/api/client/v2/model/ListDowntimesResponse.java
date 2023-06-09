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

/** Response for retrieving all downtimes. */
@JsonPropertyOrder({
  ListDowntimesResponse.JSON_PROPERTY_DATA,
  ListDowntimesResponse.JSON_PROPERTY_INCLUDED,
  ListDowntimesResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListDowntimesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<DowntimeListItemResponse> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<UserResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private DowntimeMeta meta;

  public ListDowntimesResponse data(List<DowntimeListItemResponse> data) {
    this.data = data;
    for (DowntimeListItemResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListDowntimesResponse addDataItem(DowntimeListItemResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of downtimes.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DowntimeListItemResponse> getData() {
    return data;
  }

  public void setData(List<DowntimeListItemResponse> data) {
    this.data = data;
  }

  public ListDowntimesResponse included(List<UserResponseIncludedItem> included) {
    this.included = included;
    for (UserResponseIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListDowntimesResponse addIncludedItem(UserResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Array of objects related to the users.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UserResponseIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<UserResponseIncludedItem> included) {
    this.included = included;
  }

  public ListDowntimesResponse meta(DowntimeMeta meta) {
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

  /** Return true if this ListDowntimesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDowntimesResponse listDowntimesResponse = (ListDowntimesResponse) o;
    return Objects.equals(this.data, listDowntimesResponse.data)
        && Objects.equals(this.included, listDowntimesResponse.included)
        && Objects.equals(this.meta, listDowntimesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDowntimesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
