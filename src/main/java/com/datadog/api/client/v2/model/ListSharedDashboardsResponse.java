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

/** Response containing shared dashboards for a dashboard. */
@JsonPropertyOrder({
  ListSharedDashboardsResponse.JSON_PROPERTY_DATA,
  ListSharedDashboardsResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListSharedDashboardsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SharedDashboardResponse> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<SharedDashboardIncluded> included = new ArrayList<>();

  public ListSharedDashboardsResponse() {}

  @JsonCreator
  public ListSharedDashboardsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<SharedDashboardResponse> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCLUDED)
          List<SharedDashboardIncluded> included) {
    this.data = data;
    for (SharedDashboardResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    this.included = included;
    for (SharedDashboardIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
  }

  public ListSharedDashboardsResponse data(List<SharedDashboardResponse> data) {
    this.data = data;
    for (SharedDashboardResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListSharedDashboardsResponse addDataItem(SharedDashboardResponse dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Shared dashboards for the dashboard.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SharedDashboardResponse> getData() {
    return data;
  }

  public void setData(List<SharedDashboardResponse> data) {
    this.data = data;
    if (data != null) {
      for (SharedDashboardResponse item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ListSharedDashboardsResponse included(List<SharedDashboardIncluded> included) {
    this.included = included;
    for (SharedDashboardIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListSharedDashboardsResponse addIncludedItem(SharedDashboardIncluded includedItem) {
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Users and dashboards related to the shared dashboards.
   *
   * @return included
   */
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SharedDashboardIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<SharedDashboardIncluded> included) {
    this.included = included;
    if (included != null) {
      for (SharedDashboardIncluded item : included) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ListSharedDashboardsResponse
   */
  @JsonAnySetter
  public ListSharedDashboardsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListSharedDashboardsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSharedDashboardsResponse listSharedDashboardsResponse = (ListSharedDashboardsResponse) o;
    return Objects.equals(this.data, listSharedDashboardsResponse.data)
        && Objects.equals(this.included, listSharedDashboardsResponse.included)
        && Objects.equals(
            this.additionalProperties, listSharedDashboardsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSharedDashboardsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
