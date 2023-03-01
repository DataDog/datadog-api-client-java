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
   * <p>Response for retrieving an application key.</p>
 */
@JsonPropertyOrder({
  ApplicationKeyResponse.JSON_PROPERTY_DATA,
  ApplicationKeyResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private FullApplicationKey data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<ApplicationKeyResponseIncludedItem> included = null;

  public ApplicationKeyResponse data(FullApplicationKey data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>Datadog application key.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FullApplicationKey getData() {
        return data;
      }
  public void setData(FullApplicationKey data) {
    this.data = data;
  }
  public ApplicationKeyResponse included(List<ApplicationKeyResponseIncludedItem> included) {
    this.included = included;
    for (ApplicationKeyResponseIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ApplicationKeyResponse addIncludedItem(ApplicationKeyResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * <p>Array of objects related to the application key.</p>
   * @return included
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ApplicationKeyResponseIncludedItem> getIncluded() {
        return included;
      }
  public void setIncluded(List<ApplicationKeyResponseIncludedItem> included) {
    this.included = included;
  }

  /**
   * Return true if this ApplicationKeyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyResponse applicationKeyResponse = (ApplicationKeyResponse) o;
    return Objects.equals(this.data, applicationKeyResponse.data) && Objects.equals(this.included, applicationKeyResponse.included);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
