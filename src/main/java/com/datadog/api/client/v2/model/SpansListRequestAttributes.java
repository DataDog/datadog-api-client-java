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

/** The object containing all the query parameters. */
@JsonPropertyOrder({
  SpansListRequestAttributes.JSON_PROPERTY_FILTER,
  SpansListRequestAttributes.JSON_PROPERTY_OPTIONS,
  SpansListRequestAttributes.JSON_PROPERTY_PAGE,
  SpansListRequestAttributes.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansListRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansQueryFilter filter;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SpansQueryOptions options;

  public static final String JSON_PROPERTY_PAGE = "page";
  private SpansListRequestPage page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SpansSort sort;

  public SpansListRequestAttributes filter(SpansQueryFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * The search and filter query settings.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansQueryFilter getFilter() {
    return filter;
  }

  public void setFilter(SpansQueryFilter filter) {
    this.filter = filter;
  }

  public SpansListRequestAttributes options(SpansQueryOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Global query options that are used during the query. Note: You should only supply timezone or
   * time offset but not both otherwise the query will fail.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansQueryOptions getOptions() {
    return options;
  }

  public void setOptions(SpansQueryOptions options) {
    this.options = options;
  }

  public SpansListRequestAttributes page(SpansListRequestPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Paging attributes for listing spans.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansListRequestPage getPage() {
    return page;
  }

  public void setPage(SpansListRequestPage page) {
    this.page = page;
  }

  public SpansListRequestAttributes sort(SpansSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * Sort parameters when querying spans.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SpansSort getSort() {
    return sort;
  }

  public void setSort(SpansSort sort) {
    if (!sort.isValid()) {
      this.unparsed = true;
    }
    this.sort = sort;
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
   * @return SpansListRequestAttributes
   */
  @JsonAnySetter
  public SpansListRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SpansListRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansListRequestAttributes spansListRequestAttributes = (SpansListRequestAttributes) o;
    return Objects.equals(this.filter, spansListRequestAttributes.filter)
        && Objects.equals(this.options, spansListRequestAttributes.options)
        && Objects.equals(this.page, spansListRequestAttributes.page)
        && Objects.equals(this.sort, spansListRequestAttributes.sort)
        && Objects.equals(
            this.additionalProperties, spansListRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, options, page, sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansListRequestAttributes {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
