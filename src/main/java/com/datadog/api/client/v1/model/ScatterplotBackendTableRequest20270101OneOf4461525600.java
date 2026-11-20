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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ScatterplotBackendTableRequest20270101OneOf4461525600.JSON_PROPERTY_DATASET_TO_QUERY,
  ScatterplotBackendTableRequest20270101OneOf4461525600.JSON_PROPERTY_DATASETS,
  ScatterplotBackendTableRequest20270101OneOf4461525600.JSON_PROPERTY_LIMIT,
  ScatterplotBackendTableRequest20270101OneOf4461525600.JSON_PROPERTY_PROJECTION,
  ScatterplotBackendTableRequest20270101OneOf4461525600.JSON_PROPERTY_REQUEST_TYPE,
  ScatterplotBackendTableRequest20270101OneOf4461525600.JSON_PROPERTY_RESPONSE_FORMAT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScatterplotBackendTableRequest20270101OneOf4461525600 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_TO_QUERY = "dataset_to_query";
  private String datasetToQuery;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<AdvancedQueryDataset_20270101> datasets = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private ScatterplotProjection_20270101 projection;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451373184_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451373984_20270101
      responseFormat;

  public ScatterplotBackendTableRequest20270101OneOf4461525600() {}

  @JsonCreator
  public ScatterplotBackendTableRequest20270101OneOf4461525600(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_TO_QUERY) String datasetToQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASETS)
          List<AdvancedQueryDataset_20270101> datasets,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451373184_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451373984_20270101
              responseFormat) {
    this.datasetToQuery = datasetToQuery;
    this.datasets = datasets;
    for (AdvancedQueryDataset_20270101 item : datasets) {
      this.unparsed |= item.unparsed;
    }
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.responseFormat = responseFormat;
    this.unparsed |= !responseFormat.isValid();
  }

  public ScatterplotBackendTableRequest20270101OneOf4461525600 datasetToQuery(
      String datasetToQuery) {
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

  public ScatterplotBackendTableRequest20270101OneOf4461525600 datasets(
      List<AdvancedQueryDataset_20270101> datasets) {
    this.datasets = datasets;
    for (AdvancedQueryDataset_20270101 item : datasets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461525600 addDatasetsItem(
      AdvancedQueryDataset_20270101 datasetsItem) {
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
  public List<AdvancedQueryDataset_20270101> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<AdvancedQueryDataset_20270101> datasets) {
    this.datasets = datasets;
    if (datasets != null) {
      for (AdvancedQueryDataset_20270101 item : datasets) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461525600 limit(Double limit) {
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

  public ScatterplotBackendTableRequest20270101OneOf4461525600 projection(
      ScatterplotProjection_20270101 projection) {
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
  public ScatterplotProjection_20270101 getProjection() {
    return projection;
  }

  public void setProjection(ScatterplotProjection_20270101 projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public ScatterplotBackendTableRequest20270101OneOf4461525600 requestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451373184_20270101 requestType) {
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
  public ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451373184_20270101
      getRequestType() {
    return requestType;
  }

  public void setRequestType(
      ScatterplotBackendTableRequestAnyOfAnyOfItemRequestType4451373184_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public ScatterplotBackendTableRequest20270101OneOf4461525600 responseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451373984_20270101
          responseFormat) {
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
  public ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451373984_20270101
      getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      ScatterplotBackendTableRequestAnyOfAnyOfItemResponseFormat4451373984_20270101
          responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  /**
   * Return true if this ScatterplotBackendTableRequest20270101OneOf4461525600 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScatterplotBackendTableRequest20270101OneOf4461525600
        scatterplotBackendTableRequest20270101OneOf4461525600 =
            (ScatterplotBackendTableRequest20270101OneOf4461525600) o;
    return Objects.equals(
            this.datasetToQuery,
            scatterplotBackendTableRequest20270101OneOf4461525600.datasetToQuery)
        && Objects.equals(
            this.datasets, scatterplotBackendTableRequest20270101OneOf4461525600.datasets)
        && Objects.equals(this.limit, scatterplotBackendTableRequest20270101OneOf4461525600.limit)
        && Objects.equals(
            this.projection, scatterplotBackendTableRequest20270101OneOf4461525600.projection)
        && Objects.equals(
            this.requestType, scatterplotBackendTableRequest20270101OneOf4461525600.requestType)
        && Objects.equals(
            this.responseFormat,
            scatterplotBackendTableRequest20270101OneOf4461525600.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetToQuery, datasets, limit, projection, requestType, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScatterplotBackendTableRequest20270101OneOf4461525600 {\n");
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
