/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  ProcessQueryDefinition.JSON_PROPERTY_FILTER_BY,
  ProcessQueryDefinition.JSON_PROPERTY_LIMIT,
  ProcessQueryDefinition.JSON_PROPERTY_METRIC,
  ProcessQueryDefinition.JSON_PROPERTY_SEARCH_BY
})

public class ProcessQueryDefinition {
  public static final String JSON_PROPERTY_FILTER_BY = "filter_by";
  private List<String> filterBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_SEARCH_BY = "search_by";
  private String searchBy;


  public ProcessQueryDefinition filterBy(List<String> filterBy) {
    
    this.filterBy = filterBy;
    return this;
  }

  public ProcessQueryDefinition addFilterByItem(String filterByItem) {
    if (this.filterBy == null) {
      this.filterBy = new ArrayList<>();
    }
    this.filterBy.add(filterByItem);
    return this;
  }

   /**
   * TODO.
   * @return filterBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_FILTER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFilterBy() {
    return filterBy;
  }


  public void setFilterBy(List<String> filterBy) {
    this.filterBy = filterBy;
  }


  public ProcessQueryDefinition limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * TODO.
   * minimum: 0
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public ProcessQueryDefinition metric(String metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * TODO.
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "TODO.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetric() {
    return metric;
  }


  public void setMetric(String metric) {
    this.metric = metric;
  }


  public ProcessQueryDefinition searchBy(String searchBy) {
    
    this.searchBy = searchBy;
    return this;
  }

   /**
   * TODO.
   * @return searchBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_SEARCH_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchBy() {
    return searchBy;
  }


  public void setSearchBy(String searchBy) {
    this.searchBy = searchBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessQueryDefinition processQueryDefinition = (ProcessQueryDefinition) o;
    return Objects.equals(this.filterBy, processQueryDefinition.filterBy) &&
        Objects.equals(this.limit, processQueryDefinition.limit) &&
        Objects.equals(this.metric, processQueryDefinition.metric) &&
        Objects.equals(this.searchBy, processQueryDefinition.searchBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, limit, metric, searchBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessQueryDefinition {\n");
    sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    searchBy: ").append(toIndentedString(searchBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

