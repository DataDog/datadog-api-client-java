/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.ResponseMetaAttributes;
import com.datadog.api.v1.client.model.SLOCorrection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.datadog.api.v1.client.JSON;


/**
 * A list of  SLO correction objects.
 */
@ApiModel(description = "A list of  SLO correction objects.")
@JsonPropertyOrder({
  SLOCorrectionListResponse.JSON_PROPERTY_DATA,
  SLOCorrectionListResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SLOCorrectionListResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SLOCorrection> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private ResponseMetaAttributes meta;


  public SLOCorrectionListResponse data(List<SLOCorrection> data) {
    this.data = data;
    for (SLOCorrection item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SLOCorrectionListResponse addDataItem(SLOCorrection dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

   /**
   * The list of of SLO corrections objects.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of of SLO corrections objects.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SLOCorrection> getData() {
    return data;
  }


  public void setData(List<SLOCorrection> data) {
    this.data = data;
  }


  public SLOCorrectionListResponse meta(ResponseMetaAttributes meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseMetaAttributes getMeta() {
    return meta;
  }


  public void setMeta(ResponseMetaAttributes meta) {
    this.meta = meta;
  }


  /**
   * Return true if this SLOCorrectionListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionListResponse slOCorrectionListResponse = (SLOCorrectionListResponse) o;
    return Objects.equals(this.data, slOCorrectionListResponse.data) &&
        Objects.equals(this.meta, slOCorrectionListResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

