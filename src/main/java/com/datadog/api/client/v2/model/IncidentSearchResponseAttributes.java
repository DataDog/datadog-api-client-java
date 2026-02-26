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
   * <p>Attributes returned by an incident search.</p>
 */
@JsonPropertyOrder({
  IncidentSearchResponseAttributes.JSON_PROPERTY_FACETS,
  IncidentSearchResponseAttributes.JSON_PROPERTY_INCIDENTS,
  IncidentSearchResponseAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACETS = "facets";
  private IncidentSearchResponseFacetsData facets;

  public static final String JSON_PROPERTY_INCIDENTS = "incidents";
  private List<IncidentSearchResponseIncidentsData> incidents = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public IncidentSearchResponseAttributes() {}

  @JsonCreator
  public IncidentSearchResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_FACETS)IncidentSearchResponseFacetsData facets,
            @JsonProperty(required=true, value=JSON_PROPERTY_INCIDENTS)List<IncidentSearchResponseIncidentsData> incidents,
            @JsonProperty(required=true, value=JSON_PROPERTY_TOTAL)Integer total) {
        this.facets = facets;
        this.unparsed |= facets.unparsed;
        this.incidents = incidents;
        this.total = total;
  }
  public IncidentSearchResponseAttributes facets(IncidentSearchResponseFacetsData facets) {
    this.facets = facets;
    this.unparsed |= facets.unparsed;
    return this;
  }

  /**
   * <p>Facet data for incidents returned by a search query.</p>
   * @return facets
  **/
      @JsonProperty(JSON_PROPERTY_FACETS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public IncidentSearchResponseFacetsData getFacets() {
        return facets;
      }
  public void setFacets(IncidentSearchResponseFacetsData facets) {
    this.facets = facets;
  }
  public IncidentSearchResponseAttributes incidents(List<IncidentSearchResponseIncidentsData> incidents) {
    this.incidents = incidents;
    for (IncidentSearchResponseIncidentsData item : incidents) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public IncidentSearchResponseAttributes addIncidentsItem(IncidentSearchResponseIncidentsData incidentsItem) {
    this.incidents.add(incidentsItem);
    this.unparsed |= incidentsItem.unparsed;
    return this;
  }

  /**
   * <p>Incidents returned by the search.</p>
   * @return incidents
  **/
      @JsonProperty(JSON_PROPERTY_INCIDENTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<IncidentSearchResponseIncidentsData> getIncidents() {
        return incidents;
      }
  public void setIncidents(List<IncidentSearchResponseIncidentsData> incidents) {
    this.incidents = incidents;
  }
  public IncidentSearchResponseAttributes total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * <p>Number of incidents returned by the search.</p>
   * maximum: 2147483647
   * @return total
  **/
      @JsonProperty(JSON_PROPERTY_TOTAL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Integer getTotal() {
        return total;
      }
  public void setTotal(Integer total) {
    this.total = total;
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
   * @return IncidentSearchResponseAttributes
   */
  @JsonAnySetter
  public IncidentSearchResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentSearchResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseAttributes incidentSearchResponseAttributes = (IncidentSearchResponseAttributes) o;
    return Objects.equals(this.facets, incidentSearchResponseAttributes.facets) && Objects.equals(this.incidents, incidentSearchResponseAttributes.incidents) && Objects.equals(this.total, incidentSearchResponseAttributes.total) && Objects.equals(this.additionalProperties, incidentSearchResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(facets,incidents,total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseAttributes {\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
