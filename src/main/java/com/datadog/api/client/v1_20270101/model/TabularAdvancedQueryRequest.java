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
  TabularAdvancedQueryRequest.JSON_PROPERTY_DATASET_TO_QUERY,
  TabularAdvancedQueryRequest.JSON_PROPERTY_DATASETS,
  TabularAdvancedQueryRequest.JSON_PROPERTY_LIMIT,
  TabularAdvancedQueryRequest.JSON_PROPERTY_PROJECTION,
  TabularAdvancedQueryRequest.JSON_PROPERTY_REQUEST_TYPE,
  TabularAdvancedQueryRequest.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TabularAdvancedQueryRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_TO_QUERY = "dataset_to_query";
  private String datasetToQuery;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<AdvancedQueryDataset> datasets = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection projection;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private TabularAdvancedQueryRequestRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TabularAdvancedQueryRequestResponseFormat responseFormat;

  public TabularAdvancedQueryRequest() {}

  @JsonCreator
  public TabularAdvancedQueryRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_TO_QUERY) String datasetToQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASETS)
          List<AdvancedQueryDataset> datasets,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          TabularAdvancedQueryRequestRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TabularAdvancedQueryRequestResponseFormat responseFormat) {
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

  public TabularAdvancedQueryRequest datasetToQuery(String datasetToQuery) {
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

  public TabularAdvancedQueryRequest datasets(List<AdvancedQueryDataset> datasets) {
    this.datasets = datasets;
    for (AdvancedQueryDataset item : datasets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TabularAdvancedQueryRequest addDatasetsItem(AdvancedQueryDataset datasetsItem) {
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

  public TabularAdvancedQueryRequest limit(Double limit) {
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

  public TabularAdvancedQueryRequest projection(TabularProjection projection) {
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

  public TabularAdvancedQueryRequest requestType(
      TabularAdvancedQueryRequestRequestType requestType) {
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
  public TabularAdvancedQueryRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(TabularAdvancedQueryRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public TabularAdvancedQueryRequest responseFormat(
      TabularAdvancedQueryRequestResponseFormat responseFormat) {
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
  public TabularAdvancedQueryRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(TabularAdvancedQueryRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /** Return true if this TabularAdvancedQueryRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TabularAdvancedQueryRequest tabularAdvancedQueryRequest = (TabularAdvancedQueryRequest) o;
    return Objects.equals(this.datasetToQuery, tabularAdvancedQueryRequest.datasetToQuery)
        && Objects.equals(this.datasets, tabularAdvancedQueryRequest.datasets)
        && Objects.equals(this.limit, tabularAdvancedQueryRequest.limit)
        && Objects.equals(this.projection, tabularAdvancedQueryRequest.projection)
        && Objects.equals(this.requestType, tabularAdvancedQueryRequest.requestType)
        && Objects.equals(this.responseFormat, tabularAdvancedQueryRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetToQuery, datasets, limit, projection, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TabularAdvancedQueryRequest {\n");
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
