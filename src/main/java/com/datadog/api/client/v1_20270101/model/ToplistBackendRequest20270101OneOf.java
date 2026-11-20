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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_CONDITIONAL_FORMATS,
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_DATASET_TO_QUERY,
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_DATASETS,
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_LIMIT,
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_PROJECTION,
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_REQUEST_TYPE,
  ToplistBackendRequest20270101OneOf.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ToplistBackendRequest20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_DATASET_TO_QUERY = "dataset_to_query";
  private String datasetToQuery;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<AdvancedQueryDataset> datasets = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection projection;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ToplistBackendRequestAnyOfAnyOfItemRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ToplistBackendRequestAnyOfAnyOfItemResponseFormat responseFormat;

  public ToplistBackendRequest20270101OneOf() {}

  @JsonCreator
  public ToplistBackendRequest20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_TO_QUERY) String datasetToQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASETS)
          List<AdvancedQueryDataset> datasets,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ToplistBackendRequestAnyOfAnyOfItemRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ToplistBackendRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    this.datasetToQuery = datasetToQuery;
    this.datasets = datasets;
    for (AdvancedQueryDataset item : datasets) {
      this.unparsed |= item.unparsed;
    }
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ToplistBackendRequest20270101OneOf conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ToplistBackendRequest20270101OneOf datasetToQuery(String datasetToQuery) {
    this.datasetToQuery = datasetToQuery;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return datasetToQuery
   */
  @JsonProperty(JSON_PROPERTY_DATASET_TO_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetToQuery() {
    return datasetToQuery;
  }

  public void setDatasetToQuery(String datasetToQuery) {
    this.datasetToQuery = datasetToQuery;
  }

  public ToplistBackendRequest20270101OneOf datasets(List<AdvancedQueryDataset> datasets) {
    this.datasets = datasets;
    for (AdvancedQueryDataset item : datasets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ToplistBackendRequest20270101OneOf addDatasetsItem(AdvancedQueryDataset datasetsItem) {
    this.datasets.add(datasetsItem);
    this.unparsed |= datasetsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return datasets
   */
  @JsonProperty(JSON_PROPERTY_DATASETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AdvancedQueryDataset> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<AdvancedQueryDataset> datasets) {
    this.datasets = datasets;
    if (datasets != null) {
      for (AdvancedQueryDataset item : datasets) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ToplistBackendRequest20270101OneOf limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public ToplistBackendRequest20270101OneOf projection(TabularProjection projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return projection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TabularProjection getProjection() {
    return projection;
  }

  public void setProjection(TabularProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public ToplistBackendRequest20270101OneOf requestType(
      ToplistBackendRequestAnyOfAnyOfItemRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ToplistBackendRequestAnyOfAnyOfItemRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(ToplistBackendRequestAnyOfAnyOfItemRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public ToplistBackendRequest20270101OneOf responseFormat(
      ToplistBackendRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return responseFormat
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ToplistBackendRequestAnyOfAnyOfItemResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(ToplistBackendRequestAnyOfAnyOfItemResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this ToplistBackendRequest20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToplistBackendRequest20270101OneOf toplistBackendRequest20270101OneOf =
        (ToplistBackendRequest20270101OneOf) o;
    return Objects.equals(
            this.conditionalFormats, toplistBackendRequest20270101OneOf.conditionalFormats)
        && Objects.equals(this.datasetToQuery, toplistBackendRequest20270101OneOf.datasetToQuery)
        && Objects.equals(this.datasets, toplistBackendRequest20270101OneOf.datasets)
        && Objects.equals(this.limit, toplistBackendRequest20270101OneOf.limit)
        && Objects.equals(this.projection, toplistBackendRequest20270101OneOf.projection)
        && Objects.equals(this.requestType, toplistBackendRequest20270101OneOf.requestType)
        && Objects.equals(this.responseFormat, toplistBackendRequest20270101OneOf.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conditionalFormats,
        datasetToQuery,
        datasets,
        limit,
        projection,
        requestType,
        responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToplistBackendRequest20270101OneOf {\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    datasetToQuery: ").append(toIndentedString(datasetToQuery)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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
