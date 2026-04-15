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
import java.util.Objects;

/** Product Analytics event query. */
@JsonPropertyOrder({
  ProductAnalyticsBaseQuery.JSON_PROPERTY_DATA_SOURCE,
  ProductAnalyticsBaseQuery.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsBaseQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ProductAnalyticsEventDataSource dataSource;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsEventQuerySearch search;

  public ProductAnalyticsBaseQuery() {}

  @JsonCreator
  public ProductAnalyticsBaseQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ProductAnalyticsEventDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsEventQuerySearch search) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsBaseQuery dataSource(ProductAnalyticsEventDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for Product Analytics event queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsEventDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ProductAnalyticsEventDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ProductAnalyticsBaseQuery search(ProductAnalyticsEventQuerySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search configuration for Product Analytics event query.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsEventQuerySearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsEventQuerySearch search) {
    this.search = search;
  }

  /** Return true if this ProductAnalyticsBaseQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsBaseQuery productAnalyticsBaseQuery = (ProductAnalyticsBaseQuery) o;
    return Objects.equals(this.dataSource, productAnalyticsBaseQuery.dataSource)
        && Objects.equals(this.search, productAnalyticsBaseQuery.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataSource, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsBaseQuery {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
