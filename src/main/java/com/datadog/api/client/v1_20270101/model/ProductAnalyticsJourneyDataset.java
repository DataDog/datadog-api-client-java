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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_AUDIENCE_FILTERS,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_COLUMNS,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_CONVERSION_TIME_MS,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_DATA_SOURCE,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_ENTITY,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_EXPRESSION,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_NAME,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_NODE_OBJECTS,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_SEARCH,
  ProductAnalyticsJourneyDataset.JSON_PROPERTY_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyDataset {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIENCE_FILTERS = "audience_filters";
  private AudienceFilters audienceFilters;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<DatasetColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_CONVERSION_TIME_MS = "conversion_time_ms";
  private JsonNullable<Double> conversionTimeMs = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ProductAnalyticsJourneyDatasetDataSource dataSource;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private ProductAnalyticsJourneyDatasetEntity entity;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE_OBJECTS = "node_objects";
  private Map<String, ProductAnalyticsEventQuery> nodeObjects =
      new HashMap<String, ProductAnalyticsEventQuery>();

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsJourneyDatasetSearch search;

  public static final String JSON_PROPERTY_TIME_WINDOW = "time_window";
  private TimeWindow timeWindow;

  public ProductAnalyticsJourneyDataset() {}

  @JsonCreator
  public ProductAnalyticsJourneyDataset(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS) List<DatasetColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ProductAnalyticsJourneyDatasetDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY)
          ProductAnalyticsJourneyDatasetEntity entity,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_NODE_OBJECTS)
          Map<String, ProductAnalyticsEventQuery> nodeObjects) {
    this.columns = columns;
    for (DatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.entity = entity;
    this.unparsed |= !entity.isValid();
    this.expression = expression;
    this.name = name;
    this.nodeObjects = nodeObjects;
  }

  public ProductAnalyticsJourneyDataset audienceFilters(AudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    this.unparsed |= audienceFilters.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return audienceFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIENCE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AudienceFilters getAudienceFilters() {
    return audienceFilters;
  }

  public void setAudienceFilters(AudienceFilters audienceFilters) {
    this.audienceFilters = audienceFilters;
    if (audienceFilters != null) {
      this.unparsed |= audienceFilters.unparsed;
    }
  }

  public ProductAnalyticsJourneyDataset columns(List<DatasetColumn> columns) {
    this.columns = columns;
    for (DatasetColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProductAnalyticsJourneyDataset addColumnsItem(DatasetColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DatasetColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<DatasetColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (DatasetColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsJourneyDataset conversionTimeMs(Double conversionTimeMs) {
    this.conversionTimeMs = JsonNullable.<Double>of(conversionTimeMs);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conversionTimeMs
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getConversionTimeMs() {
    return conversionTimeMs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONVERSION_TIME_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getConversionTimeMs_JsonNullable() {
    return conversionTimeMs;
  }

  @JsonProperty(JSON_PROPERTY_CONVERSION_TIME_MS)
  public void setConversionTimeMs_JsonNullable(JsonNullable<Double> conversionTimeMs) {
    this.conversionTimeMs = conversionTimeMs;
  }

  public void setConversionTimeMs(Double conversionTimeMs) {
    this.conversionTimeMs = JsonNullable.<Double>of(conversionTimeMs);
  }

  public ProductAnalyticsJourneyDataset dataSource(
      ProductAnalyticsJourneyDatasetDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneyDatasetDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ProductAnalyticsJourneyDatasetDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public ProductAnalyticsJourneyDataset entity(ProductAnalyticsJourneyDatasetEntity entity) {
    this.entity = entity;
    this.unparsed |= !entity.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return entity
   */
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneyDatasetEntity getEntity() {
    return entity;
  }

  public void setEntity(ProductAnalyticsJourneyDatasetEntity entity) {
    if (!entity.isValid()) {
      this.unparsed = true;
    }
    this.entity = entity;
  }

  public ProductAnalyticsJourneyDataset expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public ProductAnalyticsJourneyDataset name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAnalyticsJourneyDataset nodeObjects(
      Map<String, ProductAnalyticsEventQuery> nodeObjects) {
    this.nodeObjects = nodeObjects;
    return this;
  }

  public ProductAnalyticsJourneyDataset putNodeObjectsItem(
      String key, ProductAnalyticsEventQuery nodeObjectsItem) {
    this.nodeObjects.put(key, nodeObjectsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return nodeObjects
   */
  @JsonProperty(JSON_PROPERTY_NODE_OBJECTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, ProductAnalyticsEventQuery> getNodeObjects() {
    return nodeObjects;
  }

  public void setNodeObjects(Map<String, ProductAnalyticsEventQuery> nodeObjects) {
    this.nodeObjects = nodeObjects;
  }

  public ProductAnalyticsJourneyDataset search(ProductAnalyticsJourneyDatasetSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneyDatasetSearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsJourneyDatasetSearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public ProductAnalyticsJourneyDataset timeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    this.unparsed |= timeWindow.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeWindow getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(TimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    if (timeWindow != null) {
      this.unparsed |= timeWindow.unparsed;
    }
  }

  /** Return true if this ProductAnalyticsJourneyDataset object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyDataset productAnalyticsJourneyDataset =
        (ProductAnalyticsJourneyDataset) o;
    return Objects.equals(this.audienceFilters, productAnalyticsJourneyDataset.audienceFilters)
        && Objects.equals(this.columns, productAnalyticsJourneyDataset.columns)
        && Objects.equals(this.conversionTimeMs, productAnalyticsJourneyDataset.conversionTimeMs)
        && Objects.equals(this.dataSource, productAnalyticsJourneyDataset.dataSource)
        && Objects.equals(this.entity, productAnalyticsJourneyDataset.entity)
        && Objects.equals(this.expression, productAnalyticsJourneyDataset.expression)
        && Objects.equals(this.name, productAnalyticsJourneyDataset.name)
        && Objects.equals(this.nodeObjects, productAnalyticsJourneyDataset.nodeObjects)
        && Objects.equals(this.search, productAnalyticsJourneyDataset.search)
        && Objects.equals(this.timeWindow, productAnalyticsJourneyDataset.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        audienceFilters,
        columns,
        conversionTimeMs,
        dataSource,
        entity,
        expression,
        name,
        nodeObjects,
        search,
        timeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyDataset {\n");
    sb.append("    audienceFilters: ").append(toIndentedString(audienceFilters)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    conversionTimeMs: ").append(toIndentedString(conversionTimeMs)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeObjects: ").append(toIndentedString(nodeObjects)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
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
