/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.IncidentServiceIncludedItems;
import com.datadog.api.v2.client.model.IncidentServiceResponseData;
import com.datadog.api.v2.client.model.IncidentServicesResponseMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Response with a list of incident service payloads.
 */
@ApiModel(description = "Response with a list of incident service payloads.")
@JsonPropertyOrder({
  IncidentServicesResponse.JSON_PROPERTY_DATA,
  IncidentServicesResponse.JSON_PROPERTY_INCLUDED,
  IncidentServicesResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentServicesResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentServiceResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentServiceIncludedItems> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentServicesResponseMeta meta;


  public IncidentServicesResponse data(List<IncidentServiceResponseData> data) {
    this.data = data;
    return this;
  }

  public IncidentServicesResponse addDataItem(IncidentServiceResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array of incident services.
   * @return data
  **/
  @ApiModelProperty(example = "[{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"services\"}]", required = true, value = "An array of incident services.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<IncidentServiceResponseData> getData() {
    return data;
  }


  public void setData(List<IncidentServiceResponseData> data) {
    this.data = data;
  }


   /**
   * Included related resources which the user requested.
   * @return included
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Included related resources which the user requested.")
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IncidentServiceIncludedItems> getIncluded() {
    return included;
  }




  public IncidentServicesResponse meta(IncidentServicesResponseMeta meta) {
    this.meta = meta;
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

  public IncidentServicesResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(IncidentServicesResponseMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this IncidentServicesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServicesResponse incidentServicesResponse = (IncidentServicesResponse) o;
    return Objects.equals(this.data, incidentServicesResponse.data) &&
        Objects.equals(this.included, incidentServicesResponse.included) &&
        Objects.equals(this.meta, incidentServicesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServicesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

