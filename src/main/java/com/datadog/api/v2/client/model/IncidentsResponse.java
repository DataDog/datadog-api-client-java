/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response with a list of incidents. */
@ApiModel(description = "Response with a list of incidents.")
@JsonPropertyOrder({
  IncidentsResponse.JSON_PROPERTY_DATA,
  IncidentsResponse.JSON_PROPERTY_INCLUDED,
  IncidentsResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentsResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentServicesResponseMeta meta;

  public IncidentsResponse() {}

  @JsonCreator
  public IncidentsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<IncidentResponseData> data) {
    this.data = data;
  }

  public IncidentsResponse data(List<IncidentResponseData> data) {
    this.data = data;
    return this;
  }

  public IncidentsResponse addDataItem(IncidentResponseData dataItem) {
    this.data.add(dataItem);
    return this;
  }

  /**
   * An array of incidents.
   *
   * @return data
   */
  @ApiModelProperty(
      example =
          "[{\"attributes\":{\"created\":\"2020-04-21T15:34:08.627205+00:00\",\"creation_idempotency_key\":null,\"customer_impact_duration\":0,\"customer_impact_end\":null,\"customer_impact_scope\":null,\"customer_impact_start\":null,\"customer_impacted\":false,\"detected\":\"2020-04-14T00:00:00+00:00\",\"modified\":\"2020-09-17T14:16:58.696424+00:00\",\"postmortem_id\":\"00000000-0000-0000-0000-000000000000\",\"public_id\":1,\"resolved\":null,\"severity\":\"SEV-1\",\"time_to_detect\":0,\"time_to_internal_response\":0,\"time_to_repair\":0,\"time_to_resolve\":0,\"title\":\"Example"
              + " Incident\"},\"id\":\"00000000-0000-0000-0000-000000000000\",\"relationships\":{\"commander_user\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"users\"}},\"created_by_user\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"users\"}},\"integrations\":{\"data\":[{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"incident_integration_metadata\"},{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"incident_integration_metadata\"}]},\"last_modified_by_user\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"users\"}},\"postmortem\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"incident_postmortems\"}}},\"type\":\"incidents\"},{\"attributes\":{\"created\":\"2020-04-21T15:34:08.627205+00:00\",\"creation_idempotency_key\":null,\"customer_impact_duration\":0,\"customer_impact_end\":null,\"customer_impact_scope\":null,\"customer_impact_start\":null,\"customer_impacted\":false,\"detected\":\"2020-04-14T00:00:00+00:00\",\"modified\":\"2020-09-17T14:16:58.696424+00:00\",\"postmortem_id\":\"00000000-0000-0000-0000-000000000000\",\"public_id\":2,\"resolved\":null,\"severity\":\"SEV-5\",\"time_to_detect\":0,\"time_to_internal_response\":0,\"time_to_repair\":0,\"time_to_resolve\":0,\"title\":\"Example"
              + " Incident"
              + " 2\"},\"id\":\"00000000-0000-0000-0000-000000000000\",\"relationships\":{\"commander_user\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"users\"}},\"created_by_user\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"users\"}},\"integrations\":{\"data\":[{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"incident_integration_metadata\"},{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"incident_integration_metadata\"}]},\"last_modified_by_user\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"users\"}},\"postmortem\":{\"data\":{\"id\":\"00000000-0000-0000-0000-000000000000\",\"type\":\"incident_postmortems\"}}},\"type\":\"incidents\"}]",
      required = true,
      value = "An array of incidents.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentResponseData> getData() {
    return data;
  }

  public void setData(List<IncidentResponseData> data) {
    this.data = data;
  }

  /**
   * Included related resources that the user requested.
   *
   * @return included
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Included related resources that the user requested.")
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentResponseIncludedItem> getIncluded() {
    return included;
  }

  public IncidentsResponse meta(IncidentServicesResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   *
   * @return meta
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentServicesResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(IncidentServicesResponseMeta meta) {
    this.meta = meta;
  }

  /** Return true if this IncidentsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentsResponse incidentsResponse = (IncidentsResponse) o;
    return Objects.equals(this.data, incidentsResponse.data)
        && Objects.equals(this.included, incidentsResponse.included)
        && Objects.equals(this.meta, incidentsResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentsResponse {\n");
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
