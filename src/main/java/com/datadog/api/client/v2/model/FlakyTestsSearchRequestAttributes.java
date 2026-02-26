/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes for the flaky tests search request.</p>
 */
@JsonPropertyOrder({
  FlakyTestsSearchRequestAttributes.JSON_PROPERTY_FILTER,
  FlakyTestsSearchRequestAttributes.JSON_PROPERTY_INCLUDE_HISTORY,
  FlakyTestsSearchRequestAttributes.JSON_PROPERTY_PAGE,
  FlakyTestsSearchRequestAttributes.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FlakyTestsSearchRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER = "filter";
  private FlakyTestsSearchFilter filter;

  public static final String JSON_PROPERTY_INCLUDE_HISTORY = "include_history";
  private Boolean includeHistory = false;

  public static final String JSON_PROPERTY_PAGE = "page";
  private FlakyTestsSearchPageOptions page;

  public static final String JSON_PROPERTY_SORT = "sort";
  private FlakyTestsSearchSort sort;

  public FlakyTestsSearchRequestAttributes filter(FlakyTestsSearchFilter filter) {
    this.filter = filter;
    this.unparsed |= filter.unparsed;
    return this;
  }

  /**
   * <p>Search filter settings.</p>
   * @return filter
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FlakyTestsSearchFilter getFilter() {
        return filter;
      }
  public void setFilter(FlakyTestsSearchFilter filter) {
    this.filter = filter;
  }
  public FlakyTestsSearchRequestAttributes includeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
    return this;
  }

  /**
   * <p>Whether to include the status change history for each flaky test in the response.
   * When set to true, each test will include a <code>history</code> array with chronological status changes.
   * Defaults to false.</p>
   * @return includeHistory
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDE_HISTORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIncludeHistory() {
        return includeHistory;
      }
  public void setIncludeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
  }
  public FlakyTestsSearchRequestAttributes page(FlakyTestsSearchPageOptions page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * <p>Pagination attributes for listing flaky tests.</p>
   * @return page
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FlakyTestsSearchPageOptions getPage() {
        return page;
      }
  public void setPage(FlakyTestsSearchPageOptions page) {
    this.page = page;
  }
  public FlakyTestsSearchRequestAttributes sort(FlakyTestsSearchSort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * <p>Parameter for sorting flaky test results. The default sort is by ascending Fully Qualified Name (FQN). The FQN is the concatenation of the test module, suite, and name.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FlakyTestsSearchSort getSort() {
        return sort;
      }
  public void setSort(FlakyTestsSearchSort sort) {
    if (!sort.isValid()) {
        this.unparsed = true;
    }
    this.sort = sort;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return FlakyTestsSearchRequestAttributes
   */
  @JsonAnySetter
  public FlakyTestsSearchRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this FlakyTestsSearchRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlakyTestsSearchRequestAttributes flakyTestsSearchRequestAttributes = (FlakyTestsSearchRequestAttributes) o;
    return Objects.equals(this.filter, flakyTestsSearchRequestAttributes.filter) && Objects.equals(this.includeHistory, flakyTestsSearchRequestAttributes.includeHistory) && Objects.equals(this.page, flakyTestsSearchRequestAttributes.page) && Objects.equals(this.sort, flakyTestsSearchRequestAttributes.sort) && Objects.equals(this.additionalProperties, flakyTestsSearchRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filter,includeHistory,page,sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlakyTestsSearchRequestAttributes {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    includeHistory: ").append(toIndentedString(includeHistory)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
