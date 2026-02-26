/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** List of objects used to group by. */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionEventQueryGroupBy.JSON_PROPERTY_FACET,
  MonitorFormulaAndFunctionEventQueryGroupBy.JSON_PROPERTY_LIMIT,
  MonitorFormulaAndFunctionEventQueryGroupBy.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionEventQueryGroupBy {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FACET = "facet";
  private String facet;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private MonitorFormulaAndFunctionEventQueryGroupBySort sort;

  public MonitorFormulaAndFunctionEventQueryGroupBy() {}

  @JsonCreator
  public MonitorFormulaAndFunctionEventQueryGroupBy(
      @JsonProperty(required = true, value = JSON_PROPERTY_FACET) String facet) {
    this.facet = facet;
  }

  public MonitorFormulaAndFunctionEventQueryGroupBy facet(String facet) {
    this.facet = facet;
    return this;
  }

  /**
   * Event facet.
   *
   * @return facet
   */
  @JsonProperty(JSON_PROPERTY_FACET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public MonitorFormulaAndFunctionEventQueryGroupBy limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Number of groups to return.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public MonitorFormulaAndFunctionEventQueryGroupBy sort(
      MonitorFormulaAndFunctionEventQueryGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Options for sorting group by results.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorFormulaAndFunctionEventQueryGroupBySort getSort() {
    return sort;
  }

  public void setSort(MonitorFormulaAndFunctionEventQueryGroupBySort sort) {
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
   * @return MonitorFormulaAndFunctionEventQueryGroupBy
   */
  @JsonAnySetter
  public MonitorFormulaAndFunctionEventQueryGroupBy putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this MonitorFormulaAndFunctionEventQueryGroupBy object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionEventQueryGroupBy monitorFormulaAndFunctionEventQueryGroupBy =
        (MonitorFormulaAndFunctionEventQueryGroupBy) o;
    return Objects.equals(this.facet, monitorFormulaAndFunctionEventQueryGroupBy.facet)
        && Objects.equals(this.limit, monitorFormulaAndFunctionEventQueryGroupBy.limit)
        && Objects.equals(this.sort, monitorFormulaAndFunctionEventQueryGroupBy.sort)
        && Objects.equals(
            this.additionalProperties,
            monitorFormulaAndFunctionEventQueryGroupBy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facet, limit, sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionEventQueryGroupBy {\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
