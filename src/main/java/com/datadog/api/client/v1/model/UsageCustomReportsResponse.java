/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response containing available custom reports. */
@JsonPropertyOrder({
  UsageCustomReportsResponse.JSON_PROPERTY_DATA,
  UsageCustomReportsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageCustomReportsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<UsageCustomReportsData> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private UsageCustomReportsMeta meta;

  public UsageCustomReportsResponse data(List<UsageCustomReportsData> data) {
    this.data = data;
    for (UsageCustomReportsData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageCustomReportsResponse addDataItem(UsageCustomReportsData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of available custom reports.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageCustomReportsData> getData() {
    return data;
  }

  public void setData(List<UsageCustomReportsData> data) {
    this.data = data;
  }

  public UsageCustomReportsResponse meta(UsageCustomReportsMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The object containing document metadata.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageCustomReportsMeta getMeta() {
    return meta;
  }

  public void setMeta(UsageCustomReportsMeta meta) {
    this.meta = meta;
  }

  /** Return true if this UsageCustomReportsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageCustomReportsResponse usageCustomReportsResponse = (UsageCustomReportsResponse) o;
    return Objects.equals(this.data, usageCustomReportsResponse.data)
        && Objects.equals(this.meta, usageCustomReportsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCustomReportsResponse {\n");
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
