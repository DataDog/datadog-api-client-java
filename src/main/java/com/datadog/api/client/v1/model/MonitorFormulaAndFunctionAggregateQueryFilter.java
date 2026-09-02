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
   * <p>Filter definition for aggregate filtered queries.</p>
 */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionAggregateQueryFilter.JSON_PROPERTY_BASE_ATTRIBUTE,
  MonitorFormulaAndFunctionAggregateQueryFilter.JSON_PROPERTY_EXCLUDE,
  MonitorFormulaAndFunctionAggregateQueryFilter.JSON_PROPERTY_FILTER_ATTRIBUTE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionAggregateQueryFilter {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_ATTRIBUTE = "base_attribute";
  private String baseAttribute;

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private Boolean exclude = false;

  public static final String JSON_PROPERTY_FILTER_ATTRIBUTE = "filter_attribute";
  private String filterAttribute;

  public MonitorFormulaAndFunctionAggregateQueryFilter() {}

  @JsonCreator
  public MonitorFormulaAndFunctionAggregateQueryFilter(
            @JsonProperty(required=true, value=JSON_PROPERTY_BASE_ATTRIBUTE)String baseAttribute,
            @JsonProperty(required=true, value=JSON_PROPERTY_FILTER_ATTRIBUTE)String filterAttribute) {
        this.baseAttribute = baseAttribute;
        this.filterAttribute = filterAttribute;
  }
  public MonitorFormulaAndFunctionAggregateQueryFilter baseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
    return this;
  }

  /**
   * <p>Attribute from the base query to filter on.</p>
   * @return baseAttribute
  **/
      @JsonProperty(JSON_PROPERTY_BASE_ATTRIBUTE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getBaseAttribute() {
        return baseAttribute;
      }
  public void setBaseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
  }
  public MonitorFormulaAndFunctionAggregateQueryFilter exclude(Boolean exclude) {
    this.exclude = exclude;
    return this;
  }

  /**
   * <p>Whether to exclude matching records instead of including them.</p>
   * @return exclude
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXCLUDE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getExclude() {
        return exclude;
      }
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }
  public MonitorFormulaAndFunctionAggregateQueryFilter filterAttribute(String filterAttribute) {
    this.filterAttribute = filterAttribute;
    return this;
  }

  /**
   * <p>Attribute from the filter query to match against.</p>
   * @return filterAttribute
  **/
      @JsonProperty(JSON_PROPERTY_FILTER_ATTRIBUTE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFilterAttribute() {
        return filterAttribute;
      }
  public void setFilterAttribute(String filterAttribute) {
    this.filterAttribute = filterAttribute;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionAggregateQueryFilter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionAggregateQueryFilter monitorFormulaAndFunctionAggregateQueryFilter = (MonitorFormulaAndFunctionAggregateQueryFilter) o;
    return Objects.equals(this.baseAttribute, monitorFormulaAndFunctionAggregateQueryFilter.baseAttribute) && Objects.equals(this.exclude, monitorFormulaAndFunctionAggregateQueryFilter.exclude) && Objects.equals(this.filterAttribute, monitorFormulaAndFunctionAggregateQueryFilter.filterAttribute);
  }


  @Override
  public int hashCode() {
    return Objects.hash(baseAttribute,exclude,filterAttribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionAggregateQueryFilter {\n");
    sb.append("    baseAttribute: ").append(toIndentedString(baseAttribute)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    filterAttribute: ").append(toIndentedString(filterAttribute)).append("\n");
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
