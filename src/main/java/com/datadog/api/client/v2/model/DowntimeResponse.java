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
 * Downtiming gives you greater control over monitor notifications by allowing you to globally
 * exclude scopes from alerting. Downtime settings, which can be scheduled with start and end times,
 * prevent all alerting related to specified Datadog tags.
 */
@JsonPropertyOrder({DowntimeResponse.JSON_PROPERTY_DATA, DowntimeResponse.JSON_PROPERTY_INCLUDED})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private DowntimeResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<DowntimeResponseIncludedItem> included = null;

  public DowntimeResponse data(DowntimeResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Downtime data.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DowntimeResponseData getData() {
    return data;
  }

  public void setData(DowntimeResponseData data) {
    this.data = data;
  }

  public DowntimeResponse included(List<DowntimeResponseIncludedItem> included) {
    this.included = included;
    for (DowntimeResponseIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DowntimeResponse addIncludedItem(DowntimeResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Array of objects related to the downtime that the user requested.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DowntimeResponseIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<DowntimeResponseIncludedItem> included) {
    this.included = included;
  }

  /** Return true if this DowntimeResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeResponse downtimeResponse = (DowntimeResponse) o;
    return Objects.equals(this.data, downtimeResponse.data)
        && Objects.equals(this.included, downtimeResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
