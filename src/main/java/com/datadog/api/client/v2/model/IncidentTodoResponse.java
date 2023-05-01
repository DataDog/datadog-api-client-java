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
import java.util.List;
import java.util.Objects;

/** Response with an incident todo. */
@JsonPropertyOrder({
  IncidentTodoResponse.JSON_PROPERTY_DATA,
  IncidentTodoResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTodoResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private IncidentTodoResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentTodoResponseIncludedItem> included = null;

  public IncidentTodoResponse() {}

  @JsonCreator
  public IncidentTodoResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) IncidentTodoResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public IncidentTodoResponse data(IncidentTodoResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Incident todo response data.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTodoResponseData getData() {
    return data;
  }

  public void setData(IncidentTodoResponseData data) {
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

  /** Return true if this IncidentTodoResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTodoResponse incidentTodoResponse = (IncidentTodoResponse) o;
    return Objects.equals(this.data, incidentTodoResponse.data)
        && Objects.equals(this.included, incidentTodoResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTodoResponse {\n");
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
