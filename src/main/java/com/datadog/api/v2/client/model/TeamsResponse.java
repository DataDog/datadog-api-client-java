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
import com.datadog.api.v2.client.model.ServicesResponseMeta;
import com.datadog.api.v2.client.model.TeamIncludedItems;
import com.datadog.api.v2.client.model.TeamResponseData;
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
 * Response with a list of team payloads.
 */
@ApiModel(description = "Response with a list of team payloads.")
@JsonPropertyOrder({
  TeamsResponse.JSON_PROPERTY_DATA,
  TeamsResponse.JSON_PROPERTY_INCLUDED,
  TeamsResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeamsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TeamResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<TeamIncludedItems> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private ServicesResponseMeta meta;


  public TeamsResponse data(List<TeamResponseData> data) {
    this.data = data;
    return this;
  }

  public TeamsResponse addDataItem(TeamResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array of teams.
   * @return data
  **/
  @ApiModelProperty(example = "[{\"attributes\":{\"name\":\"team name\"},\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"teams\"}]", required = true, value = "An array of teams.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TeamResponseData> getData() {
    return data;
  }


  public void setData(List<TeamResponseData> data) {
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

  public List<TeamIncludedItems> getIncluded() {
    return included;
  }




  public TeamsResponse meta(ServicesResponseMeta meta) {
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

  public ServicesResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(ServicesResponseMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this TeamsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsResponse teamsResponse = (TeamsResponse) o;
    return Objects.equals(this.data, teamsResponse.data) &&
        Objects.equals(this.included, teamsResponse.included) &&
        Objects.equals(this.meta, teamsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsResponse {\n");
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

