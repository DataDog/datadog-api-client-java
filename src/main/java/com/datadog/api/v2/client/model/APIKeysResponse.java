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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response for a list of API keys. */
@ApiModel(description = "Response for a list of API keys.")
@JsonPropertyOrder({APIKeysResponse.JSON_PROPERTY_DATA, APIKeysResponse.JSON_PROPERTY_INCLUDED})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIKeysResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<PartialAPIKey> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<APIKeyResponseIncludedItem> included = null;

  public APIKeysResponse data(List<PartialAPIKey> data) {
    this.data = data;
    return this;
  }

  public APIKeysResponse addDataItem(PartialAPIKey dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Array of API keys.
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of API keys.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PartialAPIKey> getData() {
    return data;
  }

  public void setData(List<PartialAPIKey> data) {
    this.data = data;
  }

  public APIKeysResponse included(List<APIKeyResponseIncludedItem> included) {
    this.included = included;
    return this;
  }

  public APIKeysResponse addIncludedItem(APIKeyResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

  /**
   * Array of objects related to the API key.
   *
   * @return included
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of objects related to the API key.")
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<APIKeyResponseIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<APIKeyResponseIncludedItem> included) {
    this.included = included;
  }

  /** Return true if this APIKeysResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeysResponse apIKeysResponse = (APIKeysResponse) o;
    return Objects.equals(this.data, apIKeysResponse.data)
        && Objects.equals(this.included, apIKeysResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeysResponse {\n");
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
