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
import java.util.Objects;

/** Create rule response. */
@JsonPropertyOrder({
  SensitiveDataScannerCreateRuleResponse.JSON_PROPERTY_DATA,
  SensitiveDataScannerCreateRuleResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerCreateRuleResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SensitiveDataScannerRuleResponse data;

  public static final String JSON_PROPERTY_META = "meta";
  private SensitiveDataScannerMetaVersionOnly meta;

  public SensitiveDataScannerCreateRuleResponse data(SensitiveDataScannerRuleResponse data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Response data related to the creation of a rule.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerRuleResponse getData() {
    return data;
  }

  public void setData(SensitiveDataScannerRuleResponse data) {
    this.data = data;
  }

  public SensitiveDataScannerCreateRuleResponse meta(SensitiveDataScannerMetaVersionOnly meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Meta payload containing information about the API.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerMetaVersionOnly getMeta() {
    return meta;
  }

  public void setMeta(SensitiveDataScannerMetaVersionOnly meta) {
    this.meta = meta;
  }

  /** Return true if this SensitiveDataScannerCreateRuleResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerCreateRuleResponse sensitiveDataScannerCreateRuleResponse =
        (SensitiveDataScannerCreateRuleResponse) o;
    return Objects.equals(this.data, sensitiveDataScannerCreateRuleResponse.data)
        && Objects.equals(this.meta, sensitiveDataScannerCreateRuleResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerCreateRuleResponse {\n");
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
