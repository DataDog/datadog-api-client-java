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

/** Response with a list of incident team payloads. */
@JsonPropertyOrder({
  IncidentTeamsResponse.JSON_PROPERTY_DATA,
  IncidentTeamsResponse.JSON_PROPERTY_INCLUDED,
  IncidentTeamsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentTeamsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentTeamResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentTeamIncludedItems> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentResponseMeta meta;

  public IncidentTeamsResponse() {}

  @JsonCreator
  public IncidentTeamsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentTeamResponseData> data) {
    this.data = data;
  }

  public IncidentTeamsResponse data(List<IncidentTeamResponseData> data) {
    this.data = data;
    for (IncidentTeamResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentTeamsResponse addDataItem(IncidentTeamResponseData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of incident teams.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentTeamResponseData> getData() {
    return data;
  }

  public void setData(List<IncidentTeamResponseData> data) {
    this.data = data;
  }

  /**
   * Included related resources which the user requested.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentTeamIncludedItems> getIncluded() {
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

  /** Return true if this IncidentTeamsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTeamsResponse incidentTeamsResponse = (IncidentTeamsResponse) o;
    return Objects.equals(this.data, incidentTeamsResponse.data)
        && Objects.equals(this.included, incidentTeamsResponse.included)
        && Objects.equals(this.meta, incidentTeamsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTeamsResponse {\n");
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
