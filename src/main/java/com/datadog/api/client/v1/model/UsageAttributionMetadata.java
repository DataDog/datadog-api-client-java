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

/** The object containing document metadata. */
@JsonPropertyOrder({
  UsageAttributionMetadata.JSON_PROPERTY_AGGREGATES,
  UsageAttributionMetadata.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributionMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATES = "aggregates";
  private List<UsageAttributionAggregatesBody> aggregates = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private UsageAttributionPagination pagination;

  public UsageAttributionMetadata aggregates(List<UsageAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
    for (UsageAttributionAggregatesBody item : aggregates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageAttributionMetadata addAggregatesItem(UsageAttributionAggregatesBody aggregatesItem) {
    if (this.aggregates == null) {
      this.aggregates = new ArrayList<>();
    }
    this.aggregates.add(aggregatesItem);
    this.unparsed |= aggregatesItem.unparsed;
    return this;
  }

  /**
   * An array of available aggregates.
   *
   * @return aggregates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageAttributionAggregatesBody> getAggregates() {
    return aggregates;
  }

  public void setAggregates(List<UsageAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
  }

  public UsageAttributionMetadata pagination(UsageAttributionPagination pagination) {
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
    return this;
  }

  /**
   * The metadata for the current pagination.
   *
   * @return pagination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageAttributionPagination getPagination() {
    return pagination;
  }

  public void setPagination(UsageAttributionPagination pagination) {
    this.pagination = pagination;
  }

  /** Return true if this UsageAttributionMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionMetadata usageAttributionMetadata = (UsageAttributionMetadata) o;
    return Objects.equals(this.aggregates, usageAttributionMetadata.aggregates)
        && Objects.equals(this.pagination, usageAttributionMetadata.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionMetadata {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
