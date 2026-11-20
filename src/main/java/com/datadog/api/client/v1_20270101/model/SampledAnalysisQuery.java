/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  SampledAnalysisQuery.JSON_PROPERTY_QUERY_FILTER,
  SampledAnalysisQuery.JSON_PROPERTY_SAMPLE,
  SampledAnalysisQuery.JSON_PROPERTY_SOURCE_DATASET,
  SampledAnalysisQuery.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SampledAnalysisQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_SAMPLE = "sample";
  private SampledAnalysisQuerySample sample;

  public static final String JSON_PROPERTY_SOURCE_DATASET = "source_dataset";
  private String sourceDataset;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SampledAnalysisQueryType type;

  public SampledAnalysisQuery() {}

  @JsonCreator
  public SampledAnalysisQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLE)
          SampledAnalysisQuerySample sample,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE_DATASET) String sourceDataset,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SampledAnalysisQueryType type) {
    this.sample = sample;
    this.unparsed |= sample.unparsed;
    this.sourceDataset = sourceDataset;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SampledAnalysisQuery queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public SampledAnalysisQuery sample(SampledAnalysisQuerySample sample) {
    this.sample = sample;
    this.unparsed |= sample.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sample
   */
  @JsonProperty(JSON_PROPERTY_SAMPLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SampledAnalysisQuerySample getSample() {
    return sample;
  }

  public void setSample(SampledAnalysisQuerySample sample) {
    this.sample = sample;
    if (sample != null) {
      this.unparsed |= sample.unparsed;
    }
  }

  public SampledAnalysisQuery sourceDataset(String sourceDataset) {
    this.sourceDataset = sourceDataset;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sourceDataset
   */
  @JsonProperty(JSON_PROPERTY_SOURCE_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSourceDataset() {
    return sourceDataset;
  }

  public void setSourceDataset(String sourceDataset) {
    this.sourceDataset = sourceDataset;
  }

  public SampledAnalysisQuery type(SampledAnalysisQueryType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SampledAnalysisQueryType getType() {
    return type;
  }

  public void setType(SampledAnalysisQueryType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SampledAnalysisQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SampledAnalysisQuery sampledAnalysisQuery = (SampledAnalysisQuery) o;
    return Objects.equals(this.queryFilter, sampledAnalysisQuery.queryFilter)
        && Objects.equals(this.sample, sampledAnalysisQuery.sample)
        && Objects.equals(this.sourceDataset, sampledAnalysisQuery.sourceDataset)
        && Objects.equals(this.type, sampledAnalysisQuery.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryFilter, sample, sourceDataset, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SampledAnalysisQuery {\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
    sb.append("    sourceDataset: ").append(toIndentedString(sourceDataset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
