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

/** Response with an incident team payload. */
@JsonPropertyOrder({
  IncidentTeamResponse.JSON_PROPERTY_DATA,
  IncidentTeamResponse.JSON_PROPERTY_INCLUDED
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTeamResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private IncidentTeamResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentTeamIncludedItems> included = null;

  public IncidentTeamResponse() {}

  @JsonCreator
  public IncidentTeamResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) IncidentTeamResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public IncidentTeamResponse data(IncidentTeamResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Incident Team data from a response.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentTeamResponseData getData() {
    return data;
  }

  public void setData(IncidentTeamResponseData data) {
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
  public List<IncidentTeamIncludedItems> getIncluded() {
    return included;
  }

  /** Return true if this IncidentTeamResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTeamResponse incidentTeamResponse = (IncidentTeamResponse) o;
    return Objects.equals(this.data, incidentTeamResponse.data)
        && Objects.equals(this.included, incidentTeamResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTeamResponse {\n");
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
