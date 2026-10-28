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

/** Response with a list of incident responders. */
@JsonPropertyOrder({
  IncidentRespondersResponse.JSON_PROPERTY_DATA,
  IncidentRespondersResponse.JSON_PROPERTY_INCLUDED,
  IncidentRespondersResponse.JSON_PROPERTY_LINKS,
  IncidentRespondersResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRespondersResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentResponderDataResponse> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentResponderIncludedItem> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Map<String, String> links = null;

  public static final String JSON_PROPERTY_META = "meta";
  private IncidentRespondersResponseMeta meta;

  public IncidentRespondersResponse() {}

  @JsonCreator
  public IncidentRespondersResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentResponderDataResponse> data) {
    this.data = data;
    for (IncidentResponderDataResponse item : data) {
      this.unparsed |= item.unparsed;
    }
  }

  public IncidentRespondersResponse data(List<IncidentResponderDataResponse> data) {
    this.data = data;
    for (IncidentResponderDataResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentRespondersResponse addDataItem(IncidentResponderDataResponse dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of incident responders.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentResponderDataResponse> getData() {
    return data;
  }

  public void setData(List<IncidentResponderDataResponse> data) {
    this.data = data;
    if (data != null) {
      for (IncidentResponderDataResponse item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /**
   * Included related resources.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentResponderIncludedItem> getIncluded() {
    return included;
  }

  public IncidentRespondersResponse links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public IncidentRespondersResponse putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Links to pages of incident responders.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }

  public IncidentRespondersResponse meta(IncidentRespondersResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Pagination metadata for the responder list.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentRespondersResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(IncidentRespondersResponseMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
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
   * @return IncidentRespondersResponse
   */
  @JsonAnySetter
  public IncidentRespondersResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentRespondersResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRespondersResponse incidentRespondersResponse = (IncidentRespondersResponse) o;
    return Objects.equals(this.data, incidentRespondersResponse.data)
        && Objects.equals(this.included, incidentRespondersResponse.included)
        && Objects.equals(this.links, incidentRespondersResponse.links)
        && Objects.equals(this.meta, incidentRespondersResponse.meta)
        && Objects.equals(
            this.additionalProperties, incidentRespondersResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRespondersResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
