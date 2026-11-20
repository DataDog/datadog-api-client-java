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
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_DATASET_TO_QUERY,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_DATASETS,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_DISPLAY_TYPE,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_LIMIT,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_METADATA,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_ON_RIGHT_YAXIS,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_PROJECTION,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_REQUEST_TYPE,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_RESPONSE_FORMAT,
  TimeseriesWidgetAdvancedQueryRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesWidgetAdvancedQueryRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_TO_QUERY = "dataset_to_query";
  private String datasetToQuery;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<AdvancedQueryDataset> datasets = new ArrayList<>();

  public static final String JSON_PROPERTY_DISPLAY_TYPE = "display_type";
  private WidgetDisplayType displayType;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<TimeseriesWidgetExpressionAlias> metadata = null;

  public static final String JSON_PROPERTY_ON_RIGHT_YAXIS = "on_right_yaxis";
  private Boolean onRightYaxis;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private TimeseriesProjection projection;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private TimeseriesWidgetAdvancedQueryRequestRequestType requestType;

  public static final String JSON_PROPERTY_RESPONSE_FORMAT = "response_format";
  private TimeseriesWidgetAdvancedQueryRequestResponseFormat responseFormat;

  public static final String JSON_PROPERTY_STYLE = "style";
  private TimeseriesRequestStyle style;

  public TimeseriesWidgetAdvancedQueryRequest() {}

  @JsonCreator
  public TimeseriesWidgetAdvancedQueryRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_TO_QUERY) String datasetToQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASETS)
          List<AdvancedQueryDataset> datasets,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          TimeseriesWidgetAdvancedQueryRequestRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE_FORMAT)
          TimeseriesWidgetAdvancedQueryRequestResponseFormat responseFormat) {
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

  public TimeseriesWidgetAdvancedQueryRequest datasetToQuery(String datasetToQuery) {
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

  public TimeseriesWidgetAdvancedQueryRequest datasets(List<AdvancedQueryDataset> datasets) {
    this.datasets = datasets;
    for (AdvancedQueryDataset item : datasets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TimeseriesWidgetAdvancedQueryRequest addDatasetsItem(AdvancedQueryDataset datasetsItem) {
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

  public TimeseriesWidgetAdvancedQueryRequest displayType(WidgetDisplayType displayType) {
    this.displayType = displayType;
    this.unparsed |= !displayType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return displayType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetDisplayType getDisplayType() {
    return displayType;
  }

  public void setDisplayType(WidgetDisplayType displayType) {
    if (!displayType.isValid()) {
      this.unparsed = true;
    }
    this.displayType = displayType;
  }

  public TimeseriesWidgetAdvancedQueryRequest limit(Double limit) {
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

  public TimeseriesWidgetAdvancedQueryRequest metadata(
      List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TimeseriesWidgetAdvancedQueryRequest addMetadataItem(
      TimeseriesWidgetExpressionAlias metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    this.unparsed |= metadataItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeseriesWidgetExpressionAlias> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<TimeseriesWidgetExpressionAlias> metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      for (TimeseriesWidgetExpressionAlias item : metadata) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TimeseriesWidgetAdvancedQueryRequest onRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return onRightYaxis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_RIGHT_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOnRightYaxis() {
    return onRightYaxis;
  }

  public void setOnRightYaxis(Boolean onRightYaxis) {
    this.onRightYaxis = onRightYaxis;
  }

  public TimeseriesWidgetAdvancedQueryRequest projection(TimeseriesProjection projection) {
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
  public TimeseriesProjection getProjection() {
    return projection;
  }

  public void setProjection(TimeseriesProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public TimeseriesWidgetAdvancedQueryRequest requestType(
      TimeseriesWidgetAdvancedQueryRequestRequestType requestType) {
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
  public TimeseriesWidgetAdvancedQueryRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(TimeseriesWidgetAdvancedQueryRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public TimeseriesWidgetAdvancedQueryRequest responseFormat(
      TimeseriesWidgetAdvancedQueryRequestResponseFormat responseFormat) {
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
  public TimeseriesWidgetAdvancedQueryRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(TimeseriesWidgetAdvancedQueryRequestResponseFormat responseFormat) {
    if (!responseFormat.isValid()) {
      this.unparsed = true;
    }
    this.responseFormat = responseFormat;
  }

  public TimeseriesWidgetAdvancedQueryRequest style(TimeseriesRequestStyle style) {
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
  public TimeseriesRequestStyle getStyle() {
    return style;
  }

  public void setStyle(TimeseriesRequestStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this TimeseriesWidgetAdvancedQueryRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesWidgetAdvancedQueryRequest timeseriesWidgetAdvancedQueryRequest =
        (TimeseriesWidgetAdvancedQueryRequest) o;
    return Objects.equals(this.datasetToQuery, timeseriesWidgetAdvancedQueryRequest.datasetToQuery)
        && Objects.equals(this.datasets, timeseriesWidgetAdvancedQueryRequest.datasets)
        && Objects.equals(this.displayType, timeseriesWidgetAdvancedQueryRequest.displayType)
        && Objects.equals(this.limit, timeseriesWidgetAdvancedQueryRequest.limit)
        && Objects.equals(this.metadata, timeseriesWidgetAdvancedQueryRequest.metadata)
        && Objects.equals(this.onRightYaxis, timeseriesWidgetAdvancedQueryRequest.onRightYaxis)
        && Objects.equals(this.projection, timeseriesWidgetAdvancedQueryRequest.projection)
        && Objects.equals(this.requestType, timeseriesWidgetAdvancedQueryRequest.requestType)
        && Objects.equals(this.responseFormat, timeseriesWidgetAdvancedQueryRequest.responseFormat)
        && Objects.equals(this.style, timeseriesWidgetAdvancedQueryRequest.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datasetToQuery,
        datasets,
        displayType,
        limit,
        metadata,
        onRightYaxis,
        projection,
        requestType,
        responseFormat,
        style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesWidgetAdvancedQueryRequest {\n");
    sb.append("    datasetToQuery: ").append(toIndentedString(datasetToQuery)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    onRightYaxis: ").append(toIndentedString(onRightYaxis)).append("\n");
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
