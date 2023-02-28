/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Attributes */
@JsonPropertyOrder({
  SearchSLOResponseDataAttributes.JSON_PROPERTY_FACETS,
  SearchSLOResponseDataAttributes.JSON_PROPERTY_SLOS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchSLOResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACETS = "facets";
  private SearchSLOResponseDataAttributesFacets facets;

  public static final String JSON_PROPERTY_SLOS = "slos";
  private List<SearchServiceLevelObjective> slos = null;

  public SearchSLOResponseDataAttributes facets(SearchSLOResponseDataAttributesFacets facets) {
    this.facets = facets;
    this.unparsed |= facets.unparsed;
    return this;
  }

  /**
   * Facets
   *
   * @return facets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SearchSLOResponseDataAttributesFacets getFacets() {
    return facets;
  }

  public void setFacets(SearchSLOResponseDataAttributesFacets facets) {
    this.facets = facets;
  }

  public SearchSLOResponseDataAttributes slos(List<SearchServiceLevelObjective> slos) {
    this.slos = slos;
    for (SearchServiceLevelObjective item : slos) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SearchSLOResponseDataAttributes addSlosItem(SearchServiceLevelObjective slosItem) {
    if (this.slos == null) {
      this.slos = new ArrayList<>();
    }
    this.slos.add(slosItem);
    this.unparsed |= slosItem.unparsed;
    return this;
  }

  /**
   * SLOs
   *
   * @return slos
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SearchServiceLevelObjective> getSlos() {
    return slos;
  }

  public void setSlos(List<SearchServiceLevelObjective> slos) {
    this.slos = slos;
  }

  /** Return true if this SearchSLOResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchSLOResponseDataAttributes searchSloResponseDataAttributes =
        (SearchSLOResponseDataAttributes) o;
    return Objects.equals(this.facets, searchSloResponseDataAttributes.facets)
        && Objects.equals(this.slos, searchSloResponseDataAttributes.slos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facets, slos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchSLOResponseDataAttributes {\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    slos: ").append(toIndentedString(slos)).append("\n");
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
