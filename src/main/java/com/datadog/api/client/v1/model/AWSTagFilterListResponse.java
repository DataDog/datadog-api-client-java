/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>An array of tag filter rules by <code>namespace</code> and tag filter string.</p>
 */
@JsonPropertyOrder({
  AWSTagFilterListResponse.JSON_PROPERTY_FILTERS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSTagFilterListResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<AWSTagFilter> filters = null;

  public AWSTagFilterListResponse filters(List<AWSTagFilter> filters) {
    this.filters = filters;
    for (AWSTagFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AWSTagFilterListResponse addFiltersItem(AWSTagFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * <p>An array of tag filters.</p>
   * @return filters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<AWSTagFilter> getFilters() {
        return filters;
      }
  public void setFilters(List<AWSTagFilter> filters) {
    this.filters = filters;
  }

  /**
   * Return true if this AWSTagFilterListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSTagFilterListResponse awsTagFilterListResponse = (AWSTagFilterListResponse) o;
    return Objects.equals(this.filters, awsTagFilterListResponse.filters);
  }


  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSTagFilterListResponse {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("}");
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
