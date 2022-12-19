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

/** List Standard patterns response data. */
@JsonPropertyOrder({SensitiveDataScannerStandardPatternsResponseData.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerStandardPatternsResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SensitiveDataScannerStandardPatternsResponseItem> data = null;

  public SensitiveDataScannerStandardPatternsResponseData data(
      List<SensitiveDataScannerStandardPatternsResponseItem> data) {
    this.data = data;
    for (SensitiveDataScannerStandardPatternsResponseItem item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SensitiveDataScannerStandardPatternsResponseData addDataItem(
      SensitiveDataScannerStandardPatternsResponseItem dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List Standard patterns response.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SensitiveDataScannerStandardPatternsResponseItem> getData() {
    return data;
  }

  public void setData(List<SensitiveDataScannerStandardPatternsResponseItem> data) {
    this.data = data;
  }

  /** Return true if this SensitiveDataScannerStandardPatternsResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerStandardPatternsResponseData
        sensitiveDataScannerStandardPatternsResponseData =
            (SensitiveDataScannerStandardPatternsResponseData) o;
    return Objects.equals(this.data, sensitiveDataScannerStandardPatternsResponseData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerStandardPatternsResponseData {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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