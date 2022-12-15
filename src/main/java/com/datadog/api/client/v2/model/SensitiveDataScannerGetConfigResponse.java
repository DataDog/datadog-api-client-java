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

/** Get all groups response. */
@JsonPropertyOrder({
  SensitiveDataScannerGetConfigResponse.JSON_PROPERTY_DATA,
  SensitiveDataScannerGetConfigResponse.JSON_PROPERTY_INCLUDED,
  SensitiveDataScannerGetConfigResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerGetConfigResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SensitiveDataScannerGetConfigResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<SensitiveDataScannerGetConfigIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private SensitiveDataScannerMeta meta;

  public SensitiveDataScannerGetConfigResponse data(
      SensitiveDataScannerGetConfigResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Response data related to the scanning groups.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerGetConfigResponseData getData() {
    return data;
  }

  public void setData(SensitiveDataScannerGetConfigResponseData data) {
    this.data = data;
  }

  public SensitiveDataScannerGetConfigResponse included(
      List<SensitiveDataScannerGetConfigIncludedItem> included) {
    this.included = included;
    for (SensitiveDataScannerGetConfigIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SensitiveDataScannerGetConfigResponse addIncludedItem(
      SensitiveDataScannerGetConfigIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Included objects from relationships.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SensitiveDataScannerGetConfigIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<SensitiveDataScannerGetConfigIncludedItem> included) {
    this.included = included;
  }

  public SensitiveDataScannerGetConfigResponse meta(SensitiveDataScannerMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Meta response containing information about the API.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerMeta getMeta() {
    return meta;
  }

  public void setMeta(SensitiveDataScannerMeta meta) {
    this.meta = meta;
  }

  /** Return true if this SensitiveDataScannerGetConfigResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerGetConfigResponse sensitiveDataScannerGetConfigResponse =
        (SensitiveDataScannerGetConfigResponse) o;
    return Objects.equals(this.data, sensitiveDataScannerGetConfigResponse.data)
        && Objects.equals(this.included, sensitiveDataScannerGetConfigResponse.included)
        && Objects.equals(this.meta, sensitiveDataScannerGetConfigResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerGetConfigResponse {\n");
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
