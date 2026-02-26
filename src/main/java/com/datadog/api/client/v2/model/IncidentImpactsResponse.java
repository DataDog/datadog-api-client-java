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
import java.util.UUID;
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
   * <p>Response with a list of incident impacts.</p>
 */
@JsonPropertyOrder({
  IncidentImpactsResponse.JSON_PROPERTY_DATA,
  IncidentImpactsResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentImpactsResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentImpactResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentUserData> included = null;

  public IncidentImpactsResponse() {}

  @JsonCreator
  public IncidentImpactsResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)List<IncidentImpactResponseData> data) {
        this.data = data;
  }
  public IncidentImpactsResponse data(List<IncidentImpactResponseData> data) {
    this.data = data;
    for (IncidentImpactResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public IncidentImpactsResponse addDataItem(IncidentImpactResponseData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>An array of incident impacts.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<IncidentImpactResponseData> getData() {
        return data;
      }
  public void setData(List<IncidentImpactResponseData> data) {
    this.data = data;
  }

  /**
   * <p>Included related resources that the user requested.</p>
   * @return included
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<IncidentUserData> getIncluded() {
        return included;
      }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IncidentImpactsResponse
   */
  @JsonAnySetter
  public IncidentImpactsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this IncidentImpactsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentImpactsResponse incidentImpactsResponse = (IncidentImpactsResponse) o;
    return Objects.equals(this.data, incidentImpactsResponse.data) && Objects.equals(this.included, incidentImpactsResponse.included) && Objects.equals(this.additionalProperties, incidentImpactsResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,included, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentImpactsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
