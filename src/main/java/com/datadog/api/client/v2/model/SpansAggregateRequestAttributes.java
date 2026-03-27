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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The object containing all the query parameters. */
@JsonPropertyOrder({
  SpansAggregateRequestAttributes.JSON_PROPERTY_COMPUTE,
  SpansAggregateRequestAttributes.JSON_PROPERTY_FILTER,
  SpansAggregateRequestAttributes.JSON_PROPERTY_GROUP_BY,
  SpansAggregateRequestAttributes.JSON_PROPERTY_OPTIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansAggregateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<SpansCompute> compute = null;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private SpansQueryFilter filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<SpansGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SpansQueryOptions options;

  public SpansAggregateRequestAttributes compute(List<SpansCompute> compute) {
    this.compute = compute;
    for (SpansCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SpansAggregateRequestAttributes addComputeItem(SpansCompute computeItem) {
    if (this.compute == null) {
      this.compute = new ArrayList<>();
    }
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * The list of metrics or timeseries to compute for the retrieved buckets.
   *
   * @return compute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SpansCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<SpansCompute> compute) {
    this.compute = compute;
  }

  public SpansAggregateRequestAttributes filter(SpansQueryFilter filter) {
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

  public SpansAggregateRequestAttributes groupBy(List<SpansGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (SpansGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SpansAggregateRequestAttributes addGroupByItem(SpansGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * The rules for the group by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SpansGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<SpansGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public SpansAggregateRequestAttributes options(SpansQueryOptions options) {
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
   * @return SpansAggregateRequestAttributes
   */
  @JsonAnySetter
  public SpansAggregateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SpansAggregateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansAggregateRequestAttributes spansAggregateRequestAttributes =
        (SpansAggregateRequestAttributes) o;
    return Objects.equals(this.compute, spansAggregateRequestAttributes.compute)
        && Objects.equals(this.filter, spansAggregateRequestAttributes.filter)
        && Objects.equals(this.groupBy, spansAggregateRequestAttributes.groupBy)
        && Objects.equals(this.options, spansAggregateRequestAttributes.options)
        && Objects.equals(
            this.additionalProperties, spansAggregateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compute, filter, groupBy, options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansAggregateRequestAttributes {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
