/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Analytics aggregation parameters. */
@JsonPropertyOrder({
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_COMPUTE,
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_DATASET_VERSION,
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_GROUP_BY,
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_INDEXES,
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_LIMIT,
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_SEARCH,
  LLMObsExperimentationAnalyticsAggregate.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationAnalyticsAggregate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE = "compute";
  private List<LLMObsExperimentationAnalyticsCompute> compute = new ArrayList<>();

  public static final String JSON_PROPERTY_DATASET_VERSION = "dataset_version";
  private JsonNullable<Long> datasetVersion = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<LLMObsExperimentationAnalyticsGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private JsonNullable<Integer> limit = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SEARCH = "search";
  private LLMObsExperimentationAnalyticsSearch search;

  public static final String JSON_PROPERTY_TIME = "time";
  private LLMObsExperimentationAnalyticsTimeRange time;

  public LLMObsExperimentationAnalyticsAggregate() {}

  @JsonCreator
  public LLMObsExperimentationAnalyticsAggregate(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPUTE)
          List<LLMObsExperimentationAnalyticsCompute> compute,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEXES) List<String> indexes,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          LLMObsExperimentationAnalyticsSearch search) {
    this.compute = compute;
    for (LLMObsExperimentationAnalyticsCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    this.indexes = indexes;
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public LLMObsExperimentationAnalyticsAggregate compute(
      List<LLMObsExperimentationAnalyticsCompute> compute) {
    this.compute = compute;
    for (LLMObsExperimentationAnalyticsCompute item : compute) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsExperimentationAnalyticsAggregate addComputeItem(
      LLMObsExperimentationAnalyticsCompute computeItem) {
    this.compute.add(computeItem);
    this.unparsed |= computeItem.unparsed;
    return this;
  }

  /**
   * List of metric computations to perform.
   *
   * @return compute
   */
  @JsonProperty(JSON_PROPERTY_COMPUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsExperimentationAnalyticsCompute> getCompute() {
    return compute;
  }

  public void setCompute(List<LLMObsExperimentationAnalyticsCompute> compute) {
    this.compute = compute;
    if (compute != null) {
      for (LLMObsExperimentationAnalyticsCompute item : compute) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsExperimentationAnalyticsAggregate datasetVersion(Long datasetVersion) {
    this.datasetVersion = JsonNullable.<Long>of(datasetVersion);
    return this;
  }

  /**
   * Filter to a specific dataset version.
   *
   * @return datasetVersion
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getDatasetVersion() {
    return datasetVersion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATASET_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDatasetVersion_JsonNullable() {
    return datasetVersion;
  }

  @JsonProperty(JSON_PROPERTY_DATASET_VERSION)
  public void setDatasetVersion_JsonNullable(JsonNullable<Long> datasetVersion) {
    this.datasetVersion = datasetVersion;
  }

  public void setDatasetVersion(Long datasetVersion) {
    this.datasetVersion = JsonNullable.<Long>of(datasetVersion);
  }

  public LLMObsExperimentationAnalyticsAggregate groupBy(
      List<LLMObsExperimentationAnalyticsGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (LLMObsExperimentationAnalyticsGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsExperimentationAnalyticsAggregate addGroupByItem(
      LLMObsExperimentationAnalyticsGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Fields to group results by.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsExperimentationAnalyticsGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<LLMObsExperimentationAnalyticsGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (LLMObsExperimentationAnalyticsGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsExperimentationAnalyticsAggregate indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public LLMObsExperimentationAnalyticsAggregate addIndexesItem(String indexesItem) {
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Data indexes to query. At least one is required.
   *
   * @return indexes
   */
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public LLMObsExperimentationAnalyticsAggregate limit(Integer limit) {
    this.limit = JsonNullable.<Integer>of(limit);
    return this;
  }

  /**
   * Maximum number of results to return. maximum: 2147483647
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Integer getLimit() {
    return limit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Integer> getLimit_JsonNullable() {
    return limit;
  }

  @JsonProperty(JSON_PROPERTY_LIMIT)
  public void setLimit_JsonNullable(JsonNullable<Integer> limit) {
    this.limit = limit;
  }

  public void setLimit(Integer limit) {
    this.limit = JsonNullable.<Integer>of(limit);
  }

  public LLMObsExperimentationAnalyticsAggregate search(
      LLMObsExperimentationAnalyticsSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search query for filtering analytics data.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsExperimentationAnalyticsSearch getSearch() {
    return search;
  }

  public void setSearch(LLMObsExperimentationAnalyticsSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public LLMObsExperimentationAnalyticsAggregate time(
      LLMObsExperimentationAnalyticsTimeRange time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Unix-millisecond time range for filtering analytics data.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsExperimentationAnalyticsTimeRange getTime() {
    return time;
  }

  public void setTime(LLMObsExperimentationAnalyticsTimeRange time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
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
   * @return LLMObsExperimentationAnalyticsAggregate
   */
  @JsonAnySetter
  public LLMObsExperimentationAnalyticsAggregate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationAnalyticsAggregate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationAnalyticsAggregate llmObsExperimentationAnalyticsAggregate =
        (LLMObsExperimentationAnalyticsAggregate) o;
    return Objects.equals(this.compute, llmObsExperimentationAnalyticsAggregate.compute)
        && Objects.equals(
            this.datasetVersion, llmObsExperimentationAnalyticsAggregate.datasetVersion)
        && Objects.equals(this.groupBy, llmObsExperimentationAnalyticsAggregate.groupBy)
        && Objects.equals(this.indexes, llmObsExperimentationAnalyticsAggregate.indexes)
        && Objects.equals(this.limit, llmObsExperimentationAnalyticsAggregate.limit)
        && Objects.equals(this.search, llmObsExperimentationAnalyticsAggregate.search)
        && Objects.equals(this.time, llmObsExperimentationAnalyticsAggregate.time)
        && Objects.equals(
            this.additionalProperties,
            llmObsExperimentationAnalyticsAggregate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        compute, datasetVersion, groupBy, indexes, limit, search, time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationAnalyticsAggregate {\n");
    sb.append("    compute: ").append(toIndentedString(compute)).append("\n");
    sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
