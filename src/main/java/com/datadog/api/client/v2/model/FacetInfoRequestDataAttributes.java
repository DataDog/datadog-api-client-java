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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  FacetInfoRequestDataAttributes.JSON_PROPERTY_FACET_ID,
  FacetInfoRequestDataAttributes.JSON_PROPERTY_LIMIT,
  FacetInfoRequestDataAttributes.JSON_PROPERTY_SEARCH,
  FacetInfoRequestDataAttributes.JSON_PROPERTY_TERM_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FacetInfoRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET_ID = "facet_id";
  private String facetId;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private FacetInfoRequestDataAttributesSearch search;

  public static final String JSON_PROPERTY_TERM_SEARCH = "term_search";
  private FacetInfoRequestDataAttributesTermSearch termSearch;

  public FacetInfoRequestDataAttributes() {}

  @JsonCreator
  public FacetInfoRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET_ID) String facetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT) Long limit) {
    this.facetId = facetId;
    this.limit = limit;
  }

  public FacetInfoRequestDataAttributes facetId(String facetId) {
    this.facetId = facetId;
    return this;
  }

  /**
   * GetfacetId
   *
   * @return facetId
   */
  @JsonProperty(JSON_PROPERTY_FACET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacetId() {
    return facetId;
  }

  public void setFacetId(String facetId) {
    this.facetId = facetId;
  }

  public FacetInfoRequestDataAttributes limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Getlimit
   *
   * @return limit
   */
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public FacetInfoRequestDataAttributes search(FacetInfoRequestDataAttributesSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Getsearch
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FacetInfoRequestDataAttributesSearch getSearch() {
    return search;
  }

  public void setSearch(FacetInfoRequestDataAttributesSearch search) {
    this.search = search;
  }

  public FacetInfoRequestDataAttributes termSearch(
      FacetInfoRequestDataAttributesTermSearch termSearch) {
    this.termSearch = termSearch;
    this.unparsed |= termSearch.unparsed;
    return this;
  }

  /**
   * GettermSearch
   *
   * @return termSearch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERM_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FacetInfoRequestDataAttributesTermSearch getTermSearch() {
    return termSearch;
  }

  public void setTermSearch(FacetInfoRequestDataAttributesTermSearch termSearch) {
    this.termSearch = termSearch;
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
   * @return FacetInfoRequestDataAttributes
   */
  @JsonAnySetter
  public FacetInfoRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FacetInfoRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetInfoRequestDataAttributes facetInfoRequestDataAttributes =
        (FacetInfoRequestDataAttributes) o;
    return Objects.equals(this.facetId, facetInfoRequestDataAttributes.facetId)
        && Objects.equals(this.limit, facetInfoRequestDataAttributes.limit)
        && Objects.equals(this.search, facetInfoRequestDataAttributes.search)
        && Objects.equals(this.termSearch, facetInfoRequestDataAttributes.termSearch)
        && Objects.equals(
            this.additionalProperties, facetInfoRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetId, limit, search, termSearch, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetInfoRequestDataAttributes {\n");
    sb.append("    facetId: ").append(toIndentedString(facetId)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    termSearch: ").append(toIndentedString(termSearch)).append("\n");
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
