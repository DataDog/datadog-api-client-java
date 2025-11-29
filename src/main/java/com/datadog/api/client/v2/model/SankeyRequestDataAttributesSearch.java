/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  SankeyRequestDataAttributesSearch.JSON_PROPERTY_AUDIENCE_FILTERS,
  SankeyRequestDataAttributesSearch.JSON_PROPERTY_OCCURRENCES,
  SankeyRequestDataAttributesSearch.JSON_PROPERTY_QUERY,
  SankeyRequestDataAttributesSearch.JSON_PROPERTY_SUBQUERY_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyRequestDataAttributesSearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private SankeyRequestDataAttributesSearchAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_OCCURRENCES = "occurrences";
  private SankeyRequestDataAttributesSearchOccurrences occurrences;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SUBQUERY_ID = "subquery_id";
  private String subqueryId;

  public SankeyRequestDataAttributesSearch audienceFilters(
      SankeyRequestDataAttributesSearchAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * GetaudienceFilters
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyRequestDataAttributesSearchAudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(SankeyRequestDataAttributesSearchAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
  }

  public SankeyRequestDataAttributesSearch occurrences(
      SankeyRequestDataAttributesSearchOccurrences occurrences) {
    this.occurrences = occurrences;
    this.unparsed |= occurrences.unparsed;
    return this;
  }

  /**
   * Getoccurrences
   *
   * @return occurrences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyRequestDataAttributesSearchOccurrences getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(SankeyRequestDataAttributesSearchOccurrences occurrences) {
    this.occurrences = occurrences;
  }

  public SankeyRequestDataAttributesSearch query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Getquery
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SankeyRequestDataAttributesSearch subqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
    return this;
  }

  /**
   * GetsubqueryId
   *
   * @return subqueryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBQUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubqueryId() {
    return subqueryId;
  }

  public void setSubqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
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
   * @return SankeyRequestDataAttributesSearch
   */
  @JsonAnySetter
  public SankeyRequestDataAttributesSearch putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SankeyRequestDataAttributesSearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyRequestDataAttributesSearch sankeyRequestDataAttributesSearch =
        (SankeyRequestDataAttributesSearch) o;
    return Objects.equals(this.audienceFilters, sankeyRequestDataAttributesSearch.audienceFilters)
        && Objects.equals(this.occurrences, sankeyRequestDataAttributesSearch.occurrences)
        && Objects.equals(this.query, sankeyRequestDataAttributesSearch.query)
        && Objects.equals(this.subqueryId, sankeyRequestDataAttributesSearch.subqueryId)
        && Objects.equals(
            this.additionalProperties, sankeyRequestDataAttributesSearch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audienceFilters, occurrences, query, subqueryId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyRequestDataAttributesSearch {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    subqueryId: ").append(toIndentedString(subqueryId)).append("\n");
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
