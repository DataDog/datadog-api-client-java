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
import java.util.Objects;

/** Facet data numeric attributes of an incident. */
@JsonPropertyOrder({
  IncidentSearchResponseNumericFacetData.JSON_PROPERTY_AGGREGATES,
  IncidentSearchResponseNumericFacetData.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseNumericFacetData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATES = "aggregates";
  private IncidentSearchResponseNumericFacetDataAggregates aggregates;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IncidentSearchResponseNumericFacetData() {}

  @JsonCreator
  public IncidentSearchResponseNumericFacetData(
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATES)
          IncidentSearchResponseNumericFacetDataAggregates aggregates,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.aggregates = aggregates;
    this.unparsed |= aggregates.unparsed;
    this.name = name;
  }

  public IncidentSearchResponseNumericFacetData aggregates(
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
  @JsonProperty(JSON_PROPERTY_AGGREGATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentSearchResponseNumericFacetDataAggregates getAggregates() {
    return aggregates;
  }

  public void setAggregates(IncidentSearchResponseNumericFacetDataAggregates aggregates) {
    this.aggregates = aggregates;
  }

  public IncidentSearchResponseNumericFacetData name(String name) {
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

  /** Return true if this IncidentSearchResponseNumericFacetData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseNumericFacetData incidentSearchResponseNumericFacetData =
        (IncidentSearchResponseNumericFacetData) o;
    return Objects.equals(this.aggregates, incidentSearchResponseNumericFacetData.aggregates)
        && Objects.equals(this.name, incidentSearchResponseNumericFacetData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseNumericFacetData {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
