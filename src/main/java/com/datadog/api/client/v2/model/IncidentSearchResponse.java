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

/** Response with incidents and facets. */
@JsonPropertyOrder({
  IncidentSearchResponse.JSON_PROPERTY_DATA,
  IncidentSearchResponse.JSON_PROPERTY_INCLUDED,
  IncidentSearchResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private IncidentSearchResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentSearchResponseMeta meta;

  public IncidentSearchResponse() {}

  @JsonCreator
  public IncidentSearchResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) IncidentSearchResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public IncidentSearchResponse data(IncidentSearchResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Data returned by an incident search.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentSearchResponseData getData() {
    return data;
  }

  public void setData(IncidentSearchResponseData data) {
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
  public List<IncidentResponseIncludedItem> getIncluded() {
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
  public IncidentSearchResponseMeta getMeta() {
    return meta;
  }

  /** Return true if this IncidentSearchResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponse incidentSearchResponse = (IncidentSearchResponse) o;
    return Objects.equals(this.data, incidentSearchResponse.data)
        && Objects.equals(this.included, incidentSearchResponse.included)
        && Objects.equals(this.meta, incidentSearchResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponse {\n");
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
