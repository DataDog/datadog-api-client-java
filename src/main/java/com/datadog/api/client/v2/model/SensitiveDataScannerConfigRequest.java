/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Group reorder request. */
@JsonPropertyOrder({
  SensitiveDataScannerConfigRequest.JSON_PROPERTY_DATA,
  SensitiveDataScannerConfigRequest.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerConfigRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SensitiveDataScannerReorderConfig data;

  public static final String JSON_PROPERTY_META = "meta";
  private SensitiveDataScannerMetaVersionOnly meta;

  public SensitiveDataScannerConfigRequest() {}

  @JsonCreator
  public SensitiveDataScannerConfigRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          SensitiveDataScannerReorderConfig data,
      @JsonProperty(required = true, value = JSON_PROPERTY_META)
          SensitiveDataScannerMetaVersionOnly meta) {
    this.data = data;
    this.unparsed |= data.unparsed;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public SensitiveDataScannerConfigRequest data(SensitiveDataScannerReorderConfig data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Data related to the reordering of scanning groups.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerReorderConfig getData() {
    return data;
  }

  public void setData(SensitiveDataScannerReorderConfig data) {
    this.data = data;
  }

  public SensitiveDataScannerConfigRequest meta(SensitiveDataScannerMetaVersionOnly meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Meta payload containing information about the API.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SensitiveDataScannerMetaVersionOnly getMeta() {
    return meta;
  }

  public void setMeta(SensitiveDataScannerMetaVersionOnly meta) {
    this.meta = meta;
  }

  /** Return true if this SensitiveDataScannerConfigRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerConfigRequest sensitiveDataScannerConfigRequest =
        (SensitiveDataScannerConfigRequest) o;
    return Objects.equals(this.data, sensitiveDataScannerConfigRequest.data)
        && Objects.equals(this.meta, sensitiveDataScannerConfigRequest.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerConfigRequest {\n");
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
