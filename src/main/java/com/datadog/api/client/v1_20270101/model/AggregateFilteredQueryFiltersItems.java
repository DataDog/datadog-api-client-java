/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AggregateFilteredQueryFiltersItems.JSON_PROPERTY_BASE_ATTRIBUTE,
  AggregateFilteredQueryFiltersItems.JSON_PROPERTY_EXCLUDE,
  AggregateFilteredQueryFiltersItems.JSON_PROPERTY_FILTER_ATTRIBUTE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregateFilteredQueryFiltersItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_ATTRIBUTE = "base_attribute";
  private String baseAttribute;

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private Boolean exclude;

  public static final String JSON_PROPERTY_FILTER_ATTRIBUTE = "filter_attribute";
  private String filterAttribute;

  public AggregateFilteredQueryFiltersItems() {}

  @JsonCreator
  public AggregateFilteredQueryFiltersItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_ATTRIBUTE) String baseAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER_ATTRIBUTE)
          String filterAttribute) {
    this.baseAttribute = baseAttribute;
    this.filterAttribute = filterAttribute;
  }

  public AggregateFilteredQueryFiltersItems baseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return baseAttribute
   */
  @JsonProperty(JSON_PROPERTY_BASE_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseAttribute() {
    return baseAttribute;
  }

  public void setBaseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
  }

  public AggregateFilteredQueryFiltersItems exclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return exclude
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExclude() {
    return exclude;
  }

  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  public AggregateFilteredQueryFiltersItems filterAttribute(String filterAttribute) {
    this.filterAttribute = filterAttribute;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filterAttribute
   */
  @JsonProperty(JSON_PROPERTY_FILTER_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilterAttribute() {
    return filterAttribute;
  }

  public void setFilterAttribute(String filterAttribute) {
    this.filterAttribute = filterAttribute;
  }

  /** Return true if this AggregateFilteredQueryFiltersItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateFilteredQueryFiltersItems aggregateFilteredQueryFiltersItems =
        (AggregateFilteredQueryFiltersItems) o;
    return Objects.equals(this.baseAttribute, aggregateFilteredQueryFiltersItems.baseAttribute)
        && Objects.equals(this.exclude, aggregateFilteredQueryFiltersItems.exclude)
        && Objects.equals(this.filterAttribute, aggregateFilteredQueryFiltersItems.filterAttribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseAttribute, exclude, filterAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateFilteredQueryFiltersItems {\n");
    sb.append("    baseAttribute: ").append(toIndentedString(baseAttribute)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    filterAttribute: ").append(toIndentedString(filterAttribute)).append("\n");
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
