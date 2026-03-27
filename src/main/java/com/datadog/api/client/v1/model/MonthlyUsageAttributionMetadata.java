/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The object containing document metadata. */
@JsonPropertyOrder({
  MonthlyUsageAttributionMetadata.JSON_PROPERTY_AGGREGATES,
  MonthlyUsageAttributionMetadata.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonthlyUsageAttributionMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATES = "aggregates";
  private List<UsageAttributionAggregatesBody> aggregates = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private MonthlyUsageAttributionPagination pagination;

  public MonthlyUsageAttributionMetadata aggregates(
      List<UsageAttributionAggregatesBody> aggregates) {
    this.aggregates = aggregates;
    for (UsageAttributionAggregatesBody item : aggregates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MonthlyUsageAttributionMetadata addAggregatesItem(
      UsageAttributionAggregatesBody aggregatesItem) {
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

  public MonthlyUsageAttributionMetadata pagination(MonthlyUsageAttributionPagination pagination) {
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
  public MonthlyUsageAttributionPagination getPagination() {
    return pagination;
  }

  public void setPagination(MonthlyUsageAttributionPagination pagination) {
    this.pagination = pagination;
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
   * @return MonthlyUsageAttributionMetadata
   */
  @JsonAnySetter
  public MonthlyUsageAttributionMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonthlyUsageAttributionMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthlyUsageAttributionMetadata monthlyUsageAttributionMetadata =
        (MonthlyUsageAttributionMetadata) o;
    return Objects.equals(this.aggregates, monthlyUsageAttributionMetadata.aggregates)
        && Objects.equals(this.pagination, monthlyUsageAttributionMetadata.pagination)
        && Objects.equals(
            this.additionalProperties, monthlyUsageAttributionMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregates, pagination, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthlyUsageAttributionMetadata {\n");
    sb.append("    aggregates: ").append(toIndentedString(aggregates)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
