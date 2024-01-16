/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response with a list of incident integration metadata. */
@JsonPropertyOrder({
  IncidentIntegrationMetadataListResponse.JSON_PROPERTY_DATA,
  IncidentIntegrationMetadataListResponse.JSON_PROPERTY_INCLUDED,
  IncidentIntegrationMetadataListResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentIntegrationMetadataListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentIntegrationMetadataResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentIntegrationMetadataResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentResponseMeta meta;

  public IncidentIntegrationMetadataListResponse() {}

  @JsonCreator
  public IncidentIntegrationMetadataListResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentIntegrationMetadataResponseData> data) {
    this.data = data;
  }

  public IncidentIntegrationMetadataListResponse data(
      List<IncidentIntegrationMetadataResponseData> data) {
    this.data = data;
    for (IncidentIntegrationMetadataResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentIntegrationMetadataListResponse addDataItem(
      IncidentIntegrationMetadataResponseData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of incident integration metadata.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentIntegrationMetadataResponseData> getData() {
    return data;
  }

  public void setData(List<IncidentIntegrationMetadataResponseData> data) {
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

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return IncidentIntegrationMetadataListResponse
   */
  @JsonAnySetter
  public IncidentIntegrationMetadataListResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentIntegrationMetadataListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentIntegrationMetadataListResponse incidentIntegrationMetadataListResponse =
        (IncidentIntegrationMetadataListResponse) o;
    return Objects.equals(this.data, incidentIntegrationMetadataListResponse.data)
        && Objects.equals(this.included, incidentIntegrationMetadataListResponse.included)
        && Objects.equals(this.meta, incidentIntegrationMetadataListResponse.meta)
        && Objects.equals(
            this.additionalProperties,
            incidentIntegrationMetadataListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentIntegrationMetadataListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
