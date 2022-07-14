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

/** AuthN Mapping response from the API. */
@JsonPropertyOrder({
  AuthNMappingResponse.JSON_PROPERTY_DATA,
  AuthNMappingResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthNMappingResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private AuthNMapping data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<AuthNMappingIncluded> included = null;

  public AuthNMappingResponse data(AuthNMapping data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * The AuthN Mapping object returned by API.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthNMapping getData() {
    return data;
  }

  public void setData(AuthNMapping data) {
    this.data = data;
  }

  public AuthNMappingResponse included(List<AuthNMappingIncluded> included) {
    this.included = included;
    for (AuthNMappingIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AuthNMappingResponse addIncludedItem(AuthNMappingIncluded includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Included data in the AuthN Mapping response.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AuthNMappingIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<AuthNMappingIncluded> included) {
    this.included = included;
  }

  /** Return true if this AuthNMappingResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthNMappingResponse authNMappingResponse = (AuthNMappingResponse) o;
    return Objects.equals(this.data, authNMappingResponse.data)
        && Objects.equals(this.included, authNMappingResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthNMappingResponse {\n");
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
