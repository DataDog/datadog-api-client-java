/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with a list of incident todos. */
@JsonPropertyOrder({
  IncidentTodoListResponse.JSON_PROPERTY_DATA,
  IncidentTodoListResponse.JSON_PROPERTY_INCLUDED,
  IncidentTodoListResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTodoListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentTodoResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentTodoResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentResponseMeta meta;

  public IncidentTodoListResponse() {}

  @JsonCreator
  public IncidentTodoListResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentTodoResponseData> data) {
    this.data = data;
  }

  public IncidentTodoListResponse data(List<IncidentTodoResponseData> data) {
    this.data = data;
    for (IncidentTodoResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentTodoListResponse addDataItem(IncidentTodoResponseData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of incident todos.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentTodoResponseData> getData() {
    return data;
  }

  public void setData(List<IncidentTodoResponseData> data) {
    this.data = data;
  }

  /**
   * Included related resources that the user requested.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentTodoResponseIncludedItem> getIncluded() {
    return included;
  }

  /**
   * The metadata object containing pagination metadata.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentResponseMeta getMeta() {
    return meta;
  }

  /** Return true if this IncidentTodoListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTodoListResponse incidentTodoListResponse = (IncidentTodoListResponse) o;
    return Objects.equals(this.data, incidentTodoListResponse.data)
        && Objects.equals(this.included, incidentTodoListResponse.included)
        && Objects.equals(this.meta, incidentTodoListResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTodoListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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