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

/** Attributes returned by an incident search. */
@JsonPropertyOrder({
  IncidentSearchResponseAttributes.JSON_PROPERTY_FACETS,
  IncidentSearchResponseAttributes.JSON_PROPERTY_INCIDENTS,
  IncidentSearchResponseAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACETS = "facets";
  private IncidentSearchResponseFacetsData facets;

  public static final String JSON_PROPERTY_INCIDENTS = "incidents";
  private List<IncidentSearchResponseIncidentsData> incidents = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public IncidentSearchResponseAttributes() {}

  @JsonCreator
  public IncidentSearchResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACETS)
          IncidentSearchResponseFacetsData facets,
      @JsonProperty(required = true, value = JSON_PROPERTY_INCIDENTS)
          List<IncidentSearchResponseIncidentsData> incidents,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Integer total) {
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
   * Facet data for incidents returned by a search query.
   *
   * @return facets
   */
  @JsonProperty(JSON_PROPERTY_FACETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentSearchResponseFacetsData getFacets() {
    return facets;
  }

  public void setFacets(IncidentSearchResponseFacetsData facets) {
    this.facets = facets;
  }

  public IncidentSearchResponseAttributes incidents(
      List<IncidentSearchResponseIncidentsData> incidents) {
    this.incidents = incidents;
    for (IncidentSearchResponseIncidentsData item : incidents) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentSearchResponseAttributes addIncidentsItem(
      IncidentSearchResponseIncidentsData incidentsItem) {
    this.incidents.add(incidentsItem);
    this.unparsed |= incidentsItem.unparsed;
    return this;
  }

  /**
   * Incidents returned by the search.
   *
   * @return incidents
   */
  @JsonProperty(JSON_PROPERTY_INCIDENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * Number of incidents returned by the search. maximum: 2147483647
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  /** Return true if this IncidentSearchResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseAttributes incidentSearchResponseAttributes =
        (IncidentSearchResponseAttributes) o;
    return Objects.equals(this.facets, incidentSearchResponseAttributes.facets)
        && Objects.equals(this.incidents, incidentSearchResponseAttributes.incidents)
        && Objects.equals(this.total, incidentSearchResponseAttributes.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facets, incidents, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseAttributes {\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
