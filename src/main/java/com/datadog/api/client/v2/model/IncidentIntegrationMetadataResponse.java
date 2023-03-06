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

/** Response with an incident integration metadata. */
@JsonPropertyOrder({
  IncidentIntegrationMetadataResponse.JSON_PROPERTY_DATA,
  IncidentIntegrationMetadataResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentIntegrationMetadataResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private IncidentIntegrationMetadataResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentIntegrationMetadataResponseIncludedItem> included = null;

  public IncidentIntegrationMetadataResponse() {}

  @JsonCreator
  public IncidentIntegrationMetadataResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          IncidentIntegrationMetadataResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
  }

  public IncidentIntegrationMetadataResponse data(IncidentIntegrationMetadataResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Incident integration metadata from a response.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentIntegrationMetadataResponseData getData() {
    return data;
  }

  public void setData(IncidentIntegrationMetadataResponseData data) {
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
  public List<IncidentIntegrationMetadataResponseIncludedItem> getIncluded() {
    return included;
  }

  /** Return true if this IncidentIntegrationMetadataResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentIntegrationMetadataResponse incidentIntegrationMetadataResponse =
        (IncidentIntegrationMetadataResponse) o;
    return Objects.equals(this.data, incidentIntegrationMetadataResponse.data)
        && Objects.equals(this.included, incidentIntegrationMetadataResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentIntegrationMetadataResponse {\n");
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
