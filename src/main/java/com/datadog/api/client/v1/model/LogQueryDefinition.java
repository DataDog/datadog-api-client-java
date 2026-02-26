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
   * <p>The log query.</p>
 */
@JsonPropertyOrder({
  LogQueryDefinition.JSON_PROPERTY_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_GROUP_BY,
  LogQueryDefinition.JSON_PROPERTY_INDEX,
  LogQueryDefinition.JSON_PROPERTY_MULTI_COMPUTE,
  LogQueryDefinition.JSON_PROPERTY_SEARCH
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogQueryDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private LogsQueryCompute compute;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LogQueryDefinitionGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_MULTI_COMPUTE = "multi_compute";
  private List<LogsQueryCompute> multiCompute = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private LogQueryDefinitionSearch search;

  public LogQueryDefinition compute(LogsQueryCompute compute) {
    this.compute = compute;
    this.unparsed |= compute.unparsed;
    return this;
  }

  /**
   * <p>Define computation for a log query.</p>
   * @return compute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogsQueryCompute getCompute() {
        return compute;
      }
  public void setCompute(LogsQueryCompute compute) {
    this.compute = compute;
  }
  public LogQueryDefinition groupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (LogQueryDefinitionGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogQueryDefinition addGroupByItem(LogQueryDefinitionGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * <p>List of tag prefixes to group by in the case of a cluster check.</p>
   * @return groupBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<LogQueryDefinitionGroupBy> getGroupBy() {
        return groupBy;
      }
  public void setGroupBy(List<LogQueryDefinitionGroupBy> groupBy) {
    this.groupBy = groupBy;
  }
  public LogQueryDefinition index(String index) {
    this.index = index;
    return this;
  }

  /**
   * <p>A coma separated-list of index names. Use "*" query all indexes at once. <a href="https://docs.datadoghq.com/logs/indexes/#multiple-indexes">Multiple Indexes</a></p>
   * @return index
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIndex() {
        return index;
      }
  public void setIndex(String index) {
    this.index = index;
  }
  public LogQueryDefinition multiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
    for (LogsQueryCompute item : multiCompute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public LogQueryDefinition addMultiComputeItem(LogsQueryCompute multiComputeItem) {
    if (this.multiCompute == null) {
      this.multiCompute = new ArrayList<>();
    }
    this.multiCompute.add(multiComputeItem);
    this.unparsed |= multiComputeItem.unparsed;
    return this;
  }

  /**
   * <p>This field is mutually exclusive with <code>compute</code>.</p>
   * @return multiCompute
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MULTI_COMPUTE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<LogsQueryCompute> getMultiCompute() {
        return multiCompute;
      }
  public void setMultiCompute(List<LogsQueryCompute> multiCompute) {
    this.multiCompute = multiCompute;
  }
  public LogQueryDefinition search(LogQueryDefinitionSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * <p>The query being made on the logs.</p>
   * @return search
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEARCH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public LogQueryDefinitionSearch getSearch() {
        return search;
      }
  public void setSearch(LogQueryDefinitionSearch search) {
    this.search = search;
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
   * @return LogQueryDefinition
   */
  @JsonAnySetter
  public LogQueryDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogQueryDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogQueryDefinition logQueryDefinition = (LogQueryDefinition) o;
    return Objects.equals(this.compute, logQueryDefinition.compute) && Objects.equals(this.groupBy, logQueryDefinition.groupBy) && Objects.equals(this.index, logQueryDefinition.index) && Objects.equals(this.multiCompute, logQueryDefinition.multiCompute) && Objects.equals(this.search, logQueryDefinition.search) && Objects.equals(this.additionalProperties, logQueryDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(compute,groupBy,index,multiCompute,search, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogQueryDefinition {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    multiCompute: ").append(toIndentedString(multiCompute)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
