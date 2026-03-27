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

/** Facet data for the incident property fields. */
@JsonPropertyOrder({
  IncidentSearchResponsePropertyFieldFacetData.JSON_PROPERTY_AGGREGATES,
  IncidentSearchResponsePropertyFieldFacetData.JSON_PROPERTY_FACETS,
  IncidentSearchResponsePropertyFieldFacetData.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponsePropertyFieldFacetData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATES = "aggregates";
  private IncidentSearchResponseNumericFacetDataAggregates aggregates;

  public static final String JSON_PROPERTY_FACETS = "facets";
  private List<IncidentSearchResponseFieldFacetData> facets = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IncidentSearchResponsePropertyFieldFacetData() {}

  @JsonCreator
  public IncidentSearchResponsePropertyFieldFacetData(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACETS)
          List<IncidentSearchResponseFieldFacetData> facets,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.facets = facets;
    this.name = name;
  }

  public IncidentSearchResponsePropertyFieldFacetData aggregates(
      IncidentSearchResponseNumericFacetDataAggregates aggregates) {
    this.aggregates = aggregates;
    this.unparsed |= aggregates.unparsed;
    return this;
  }

  /**
   * Aggregate information for numeric incident data.
   *
   * @return aggregates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IncidentSearchResponseNumericFacetDataAggregates getAggregates() {
    return aggregates;
  }

  public void setAggregates(IncidentSearchResponseNumericFacetDataAggregates aggregates) {
    this.aggregates = aggregates;
  }

  public IncidentSearchResponsePropertyFieldFacetData facets(
      List<IncidentSearchResponseFieldFacetData> facets) {
    this.facets = facets;
    for (IncidentSearchResponseFieldFacetData item : facets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponsePropertyFieldFacetData addFacetsItem(
      IncidentSearchResponseFieldFacetData facetsItem) {
    this.facets.add(facetsItem);
    this.unparsed |= facetsItem.unparsed;
    return this;
  }

  /**
   * Facet data for the property field of an incident.
   *
   * @return facets
   */
  @JsonProperty(JSON_PROPERTY_FACETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentSearchResponseFieldFacetData> getFacets() {
    return facets;
  }

  public void setFacets(List<IncidentSearchResponseFieldFacetData> facets) {
    this.facets = facets;
  }

  public IncidentSearchResponsePropertyFieldFacetData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the incident property field.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return IncidentSearchResponsePropertyFieldFacetData
   */
  @JsonAnySetter
  public IncidentSearchResponsePropertyFieldFacetData putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentSearchResponsePropertyFieldFacetData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponsePropertyFieldFacetData incidentSearchResponsePropertyFieldFacetData =
        (IncidentSearchResponsePropertyFieldFacetData) o;
    return Objects.equals(this.aggregates, incidentSearchResponsePropertyFieldFacetData.aggregates)
        && Objects.equals(this.facets, incidentSearchResponsePropertyFieldFacetData.facets)
        && Objects.equals(this.name, incidentSearchResponsePropertyFieldFacetData.name)
        && Objects.equals(
            this.additionalProperties,
            incidentSearchResponsePropertyFieldFacetData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, facets, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponsePropertyFieldFacetData {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
