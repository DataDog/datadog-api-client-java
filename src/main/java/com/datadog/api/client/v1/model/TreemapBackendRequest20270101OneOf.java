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
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_DATASET_TO_QUERY,
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_DATASETS,
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_LIMIT,
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_PROJECTION,
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_REQUEST_TYPE,
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_RESPONSE_FORMAT,
  TreemapBackendRequest20270101OneOf.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreemapBackendRequest20270101OneOf {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_TO_QUERY = "dataset_to_query";
  private String datasetToQuery;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<AdvancedQueryDataset_20270101> datasets = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TabularProjection_20270101 projection;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private TreemapBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TreemapBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TreemapRequestStyle_20270101 style;

  public TreemapBackendRequest20270101OneOf() {}

  @JsonCreator
  public TreemapBackendRequest20270101OneOf(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_TO_QUERY) String datasetToQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASETS)
          List<AdvancedQueryDataset_20270101> datasets,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          TreemapBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TreemapBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
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

  public TreemapBackendRequest20270101OneOf datasetToQuery(String datasetToQuery) {
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

  public TreemapBackendRequest20270101OneOf datasets(List<AdvancedQueryDataset_20270101> datasets) {
    this.datasets = datasets;
    for (AdvancedQueryDataset_20270101 item : datasets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TreemapBackendRequest20270101OneOf addDatasetsItem(
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

  public TreemapBackendRequest20270101OneOf limit(Double limit) {
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

  public TreemapBackendRequest20270101OneOf projection(TabularProjection_20270101 projection) {
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
  public TabularProjection_20270101 getProjection() {
    return projection;
  }

  public void setProjection(TabularProjection_20270101 projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public TreemapBackendRequest20270101OneOf requestType(
      TreemapBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType) {
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
  public TreemapBackendRequestAnyOfAnyOfItemRequestType_20270101 getRequestType() {
    return requestType;
  }

  public void setRequestType(TreemapBackendRequestAnyOfAnyOfItemRequestType_20270101 requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public TreemapBackendRequest20270101OneOf responseFormat(
      TreemapBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
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
  public TreemapBackendRequestAnyOfAnyOfItemResponseFormat_20270101 getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(
      TreemapBackendRequestAnyOfAnyOfItemResponseFormat_20270101 responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public TreemapBackendRequest20270101OneOf style(TreemapRequestStyle_20270101 style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreemapRequestStyle_20270101 getStyle() {
    return style;
  }

  public void setStyle(TreemapRequestStyle_20270101 style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TreemapBackendRequest20270101OneOf object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreemapBackendRequest20270101OneOf treemapBackendRequest20270101OneOf =
        (TreemapBackendRequest20270101OneOf) o;
    return Objects.equals(this.datasetToQuery, treemapBackendRequest20270101OneOf.datasetToQuery)
        && Objects.equals(this.datasets, treemapBackendRequest20270101OneOf.datasets)
        && Objects.equals(this.limit, treemapBackendRequest20270101OneOf.limit)
        && Objects.equals(this.projection, treemapBackendRequest20270101OneOf.projection)
        && Objects.equals(this.requestType, treemapBackendRequest20270101OneOf.requestType)
        && Objects.equals(this.responseFormat, treemapBackendRequest20270101OneOf.responseFormat)
        && Objects.equals(this.style, treemapBackendRequest20270101OneOf.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datasetToQuery, datasets, limit, projection, requestType, responseFormat, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreemapBackendRequest20270101OneOf {\n");
    sb.append("    datasetToQuery: ").append(toIndentedString(datasetToQuery)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
