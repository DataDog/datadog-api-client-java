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

/** A Product Analytics occurrence-filtered query. */
@JsonPropertyOrder({
  ProductAnalyticsOccurrenceQuery.JSON_PROPERTY_DATA_SOURCE,
  ProductAnalyticsOccurrenceQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsOccurrenceQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ProductAnalyticsOccurrenceQueryDataSource dataSource;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsOccurrenceSearch search;

  public ProductAnalyticsOccurrenceQuery() {}

  @JsonCreator
  public ProductAnalyticsOccurrenceQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ProductAnalyticsOccurrenceQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsOccurrenceSearch search) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsOccurrenceQuery dataSource(
      ProductAnalyticsOccurrenceQueryDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * The data source identifier for occurrence queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsOccurrenceQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ProductAnalyticsOccurrenceQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ProductAnalyticsOccurrenceQuery search(ProductAnalyticsOccurrenceSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search parameters for an occurrence query.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsOccurrenceSearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsOccurrenceSearch search) {
    this.search = search;
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
   * @return ProductAnalyticsOccurrenceQuery
   */
  @JsonAnySetter
  public ProductAnalyticsOccurrenceQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsOccurrenceQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsOccurrenceQuery productAnalyticsOccurrenceQuery =
        (ProductAnalyticsOccurrenceQuery) o;
    return Objects.equals(this.dataSource, productAnalyticsOccurrenceQuery.dataSource)
        && Objects.equals(this.search, productAnalyticsOccurrenceQuery.search)
        && Objects.equals(
            this.additionalProperties, productAnalyticsOccurrenceQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, search, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsOccurrenceQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
