/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Objects;

/** Response with an incident service payload. */
@JsonPropertyOrder({
  IncidentServiceResponse.JSON_PROPERTY_DATA,
  IncidentServiceResponse.JSON_PROPERTY_INCLUDED
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentServiceResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private IncidentServiceResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentServiceIncludedItems> included = null;

  public IncidentServiceResponse() {}

  @JsonCreator
  public IncidentServiceResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) IncidentServiceResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public IncidentServiceResponse data(IncidentServiceResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Incident Service data from responses.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentServiceResponseData getData() {
    return data;
  }

  public void setData(IncidentServiceResponseData data) {
    this.data = data;
  }

  /**
   * Included objects from relationships.
   *
   * @return included
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentServiceIncludedItems> getIncluded() {
    return included;
  }

  /** Return true if this IncidentServiceResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentServiceResponse incidentServiceResponse = (IncidentServiceResponse) o;
    return Objects.equals(this.data, incidentServiceResponse.data)
        && Objects.equals(this.included, incidentServiceResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentServiceResponse {\n");
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
