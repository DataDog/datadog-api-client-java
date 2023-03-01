/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Update a user.</p>
 */
@JsonPropertyOrder({
  UserUpdateRequest.JSON_PROPERTY_DATA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserUpdateRequest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private UserUpdateData data;

  public UserUpdateRequest() {}

  @JsonCreator
  public UserUpdateRequest(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)UserUpdateData data) {
        this.data = data;
        this.unparsed |= data.unparsed;
  }
  public UserUpdateRequest data(UserUpdateData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>Object to update a user.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UserUpdateData getData() {
        return data;
      }
  public void setData(UserUpdateData data) {
    this.data = data;
  }

  /**
   * Return true if this UserUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateRequest userUpdateRequest = (UserUpdateRequest) o;
    return Objects.equals(this.data, userUpdateRequest.data);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
