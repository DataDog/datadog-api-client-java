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

/** Hourly usage response. */
@JsonPropertyOrder({HourlyUsageResponse.JSON_PROPERTY_DATA, HourlyUsageResponse.JSON_PROPERTY_META})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<HourlyUsage> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private HourlyUsageMetadata meta;

  public HourlyUsageResponse data(List<HourlyUsage> data) {
    this.data = data;
    for (HourlyUsage item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HourlyUsageResponse addDataItem(HourlyUsage dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Response containing hourly usage.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HourlyUsage> getData() {
    return data;
  }

  public void setData(List<HourlyUsage> data) {
    this.data = data;
  }

  public HourlyUsageResponse meta(HourlyUsageMetadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The object containing document metadata.
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HourlyUsageMetadata getMeta() {
    return meta;
  }

  public void setMeta(HourlyUsageMetadata meta) {
    this.meta = meta;
  }

  /** Return true if this HourlyUsageResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageResponse hourlyUsageResponse = (HourlyUsageResponse) o;
    return Objects.equals(this.data, hourlyUsageResponse.data)
        && Objects.equals(this.meta, hourlyUsageResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageResponse {\n");
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
