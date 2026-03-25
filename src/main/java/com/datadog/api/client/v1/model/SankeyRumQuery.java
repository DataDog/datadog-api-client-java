/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Sankey widget with RUM data source query. */
@JsonPropertyOrder({
  SankeyRumQuery.JSON_PROPERTY_AUDIENCE_FILTERS,
  SankeyRumQuery.JSON_PROPERTY_DATA_SOURCE,
  SankeyRumQuery.JSON_PROPERTY_ENTRIES_PER_STEP,
  SankeyRumQuery.JSON_PROPERTY_JOIN_KEYS,
  SankeyRumQuery.JSON_PROPERTY_MODE,
  SankeyRumQuery.JSON_PROPERTY_NUMBER_OF_STEPS,
  SankeyRumQuery.JSON_PROPERTY_OCCURRENCES,
  SankeyRumQuery.JSON_PROPERTY_QUERY_STRING,
  SankeyRumQuery.JSON_PROPERTY_SOURCE,
  SankeyRumQuery.JSON_PROPERTY_SUBQUERY_ID,
  SankeyRumQuery.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyRumQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private ProductAnalyticsAudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private SankeyRumDataSource dataSource = SankeyRumDataSource.RUM;

  public static final String JSON_PROPERTY_ENTRIES_PER_STEP = "entries_per_step";
  private Long entriesPerStep;

  public static final String JSON_PROPERTY_JOIN_KEYS = "join_keys";
  private SankeyJoinKeys joinKeys;

  public static final String JSON_PROPERTY_MODE = "mode";
  private SankeyRumQueryMode mode = SankeyRumQueryMode.SOURCE;

  public static final String JSON_PROPERTY_NUMBER_OF_STEPS = "number_of_steps";
  private Long numberOfSteps;

  public static final String JSON_PROPERTY_OCCURRENCES = "occurrences";
  private ProductAnalyticsAudienceOccurrenceFilter occurrences;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_SUBQUERY_ID = "subquery_id";
  private String subqueryId;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public SankeyRumQuery() {}

  @JsonCreator
  public SankeyRumQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          SankeyRumDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) SankeyRumQueryMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.queryString = queryString;
  }

  public SankeyRumQuery audienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Product Analytics/RUM audience filters.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsAudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(ProductAnalyticsAudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
  }

  public SankeyRumQuery dataSource(SankeyRumDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Sankey widget with RUM data source.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyRumDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(SankeyRumDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public SankeyRumQuery entriesPerStep(Long entriesPerStep) {
    this.entriesPerStep = entriesPerStep;
    return this;
  }

  /**
   * Entries per step.
   *
   * @return entriesPerStep
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES_PER_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEntriesPerStep() {
    return entriesPerStep;
  }

  public void setEntriesPerStep(Long entriesPerStep) {
    this.entriesPerStep = entriesPerStep;
  }

  public SankeyRumQuery joinKeys(SankeyJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
    this.unparsed |= joinKeys.unparsed;
    return this;
  }

  /**
   * Join keys.
   *
   * @return joinKeys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOIN_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyJoinKeys getJoinKeys() {
    return joinKeys;
  }

  public void setJoinKeys(SankeyJoinKeys joinKeys) {
    this.joinKeys = joinKeys;
  }

  public SankeyRumQuery mode(SankeyRumQueryMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Sankey mode for RUM queries.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SankeyRumQueryMode getMode() {
    return mode;
  }

  public void setMode(SankeyRumQueryMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public SankeyRumQuery numberOfSteps(Long numberOfSteps) {
    this.numberOfSteps = numberOfSteps;
    return this;
  }

  /**
   * Number of steps.
   *
   * @return numberOfSteps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumberOfSteps() {
    return numberOfSteps;
  }

  public void setNumberOfSteps(Long numberOfSteps) {
    this.numberOfSteps = numberOfSteps;
  }

  public SankeyRumQuery occurrences(ProductAnalyticsAudienceOccurrenceFilter occurrences) {
    this.occurrences = occurrences;
    this.unparsed |= occurrences.unparsed;
    return this;
  }

  /**
   * Getoccurrences
   *
   * @return occurrences
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsAudienceOccurrenceFilter getOccurrences() {
    return occurrences;
  }

  public void setOccurrences(ProductAnalyticsAudienceOccurrenceFilter occurrences) {
    this.occurrences = occurrences;
  }

  public SankeyRumQuery queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Query string.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public SankeyRumQuery source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public SankeyRumQuery subqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
    return this;
  }

  /**
   * Subquery ID.
   *
   * @return subqueryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBQUERY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubqueryId() {
    return subqueryId;
  }

  public void setSubqueryId(String subqueryId) {
    this.subqueryId = subqueryId;
  }

  public SankeyRumQuery target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Target.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  /** Return true if this SankeyRumQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyRumQuery sankeyRumQuery = (SankeyRumQuery) o;
    return Objects.equals(this.audienceFilters, sankeyRumQuery.audienceFilters)
        && Objects.equals(this.dataSource, sankeyRumQuery.dataSource)
        && Objects.equals(this.entriesPerStep, sankeyRumQuery.entriesPerStep)
        && Objects.equals(this.joinKeys, sankeyRumQuery.joinKeys)
        && Objects.equals(this.mode, sankeyRumQuery.mode)
        && Objects.equals(this.numberOfSteps, sankeyRumQuery.numberOfSteps)
        && Objects.equals(this.occurrences, sankeyRumQuery.occurrences)
        && Objects.equals(this.queryString, sankeyRumQuery.queryString)
        && Objects.equals(this.source, sankeyRumQuery.source)
        && Objects.equals(this.subqueryId, sankeyRumQuery.subqueryId)
        && Objects.equals(this.target, sankeyRumQuery.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        audienceFilters,
        dataSource,
        entriesPerStep,
        joinKeys,
        mode,
        numberOfSteps,
        occurrences,
        queryString,
        source,
        subqueryId,
        target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SankeyRumQuery {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    entriesPerStep: ").append(toIndentedString(entriesPerStep)).append("\n");
    sb.append("    joinKeys: ").append(toIndentedString(joinKeys)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    numberOfSteps: ").append(toIndentedString(numberOfSteps)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    subqueryId: ").append(toIndentedString(subqueryId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
