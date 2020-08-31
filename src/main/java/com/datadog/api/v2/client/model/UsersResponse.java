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
import com.datadog.api.v2.client.model.ResponseMetaAttributes;
import com.datadog.api.v2.client.model.User;
import com.datadog.api.v2.client.model.UserResponseIncludedItem;
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
 * Response containing information about multiple users.
 */
@ApiModel(description = "Response containing information about multiple users.")
@JsonPropertyOrder({
  UsersResponse.JSON_PROPERTY_DATA,
  UsersResponse.JSON_PROPERTY_INCLUDED,
  UsersResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsersResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<User> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<UserResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private ResponseMetaAttributes meta;


  public UsersResponse data(List<User> data) {
    this.data = data;
    return this;
  }

  public UsersResponse addDataItem(User dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of returned users.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of returned users.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<User> getData() {
    return data;
  }


  public void setData(List<User> data) {
    this.data = data;
  }


  public UsersResponse included(List<UserResponseIncludedItem> included) {
    this.included = included;
    return this;
  }

  public UsersResponse addIncludedItem(UserResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Array of objects related to the users.
   * @return included
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of objects related to the users.")
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserResponseIncludedItem> getIncluded() {
    return included;
  }


  public void setIncluded(List<UserResponseIncludedItem> included) {
    this.included = included;
  }


  public UsersResponse meta(ResponseMetaAttributes meta) {
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

  public ResponseMetaAttributes getMeta() {
    return meta;
  }


  public void setMeta(ResponseMetaAttributes meta) {
    this.meta = meta;
  }


  /**
   * Return true if this UsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersResponse usersResponse = (UsersResponse) o;
    return Objects.equals(this.data, usersResponse.data) &&
        Objects.equals(this.included, usersResponse.included) &&
        Objects.equals(this.meta, usersResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersResponse {\n");
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

