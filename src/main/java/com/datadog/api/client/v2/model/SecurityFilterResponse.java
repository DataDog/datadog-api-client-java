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
   * <p>Response object which includes a single security filter.</p>
 */
@JsonPropertyOrder({
  SecurityFilterResponse.JSON_PROPERTY_DATA,
  SecurityFilterResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityFilterResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private SecurityFilter data;

  public static final String JSON_PROPERTY_META = "meta";
  private SecurityFilterMeta meta;

  public SecurityFilterResponse data(SecurityFilter data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>The security filter's properties.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityFilter getData() {
        return data;
      }
  public void setData(SecurityFilter data) {
    this.data = data;
  }
  public SecurityFilterResponse meta(SecurityFilterMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Optional metadata associated to the response.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityFilterMeta getMeta() {
        return meta;
      }
  public void setMeta(SecurityFilterMeta meta) {
    this.meta = meta;
  }

  /**
   * Return true if this SecurityFilterResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityFilterResponse securityFilterResponse = (SecurityFilterResponse) o;
    return Objects.equals(this.data, securityFilterResponse.data) && Objects.equals(this.meta, securityFilterResponse.meta);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityFilterResponse {\n");
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
