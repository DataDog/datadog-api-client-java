/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Group by configuration for the Journey Paths widget. */
@JsonPropertyOrder({
  JourneyMapGroupBy.JSON_PROPERTY_FACET,
  JourneyMapGroupBy.JSON_PROPERTY_SOURCE,
  JourneyMapGroupBy.JSON_PROPERTY_VALUE_FILTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JourneyMapGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JourneyMapGroupByAudience source;

  public static final String JSON_PROPERTY_VALUE_FILTERS = "value_filters";
  private List<String> valueFilters = new ArrayList<>();

  public JourneyMapGroupBy() {}

  @JsonCreator
  public JourneyMapGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE_FILTERS)
          List<String> valueFilters) {
    this.facet = facet;
    this.valueFilters = valueFilters;
  }

  public JourneyMapGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Facet to group by. Must be a valid tag name.
   *
   * @return facet
   */
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public JourneyMapGroupBy source(JourneyMapGroupByAudience source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Audience the group by facet is read from.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JourneyMapGroupByAudience getSource() {
    return source;
  }

  public void setSource(JourneyMapGroupByAudience source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public JourneyMapGroupBy valueFilters(List<String> valueFilters) {
    this.valueFilters = valueFilters;
    return this;
  }

  public JourneyMapGroupBy addValueFiltersItem(String valueFiltersItem) {
    this.valueFilters.add(valueFiltersItem);
    return this;
  }

  /**
   * Facet values to keep.
   *
   * @return valueFilters
   */
  @JsonProperty(JSON_PROPERTY_VALUE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValueFilters() {
    return valueFilters;
  }

  public void setValueFilters(List<String> valueFilters) {
    this.valueFilters = valueFilters;
  }

  /** Return true if this JourneyMapGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyMapGroupBy journeyMapGroupBy = (JourneyMapGroupBy) o;
    return Objects.equals(this.facet, journeyMapGroupBy.facet)
        && Objects.equals(this.source, journeyMapGroupBy.source)
        && Objects.equals(this.valueFilters, journeyMapGroupBy.valueFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, source, valueFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyMapGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    valueFilters: ").append(toIndentedString(valueFilters)).append("\n");
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
