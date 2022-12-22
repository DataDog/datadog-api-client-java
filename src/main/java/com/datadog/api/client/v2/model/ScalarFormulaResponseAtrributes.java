/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The object describing a scalar response. */
@JsonPropertyOrder({
  ScalarFormulaResponseAtrributes.JSON_PROPERTY_COLUMNS,
  ScalarFormulaResponseAtrributes.JSON_PROPERTY_SERIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScalarFormulaResponseAtrributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<ScalarColumn> columns = null;

  public static final String JSON_PROPERTY_SERIES = "series";
  private List<List<String>> series = null;

  public ScalarFormulaResponseAtrributes columns(List<ScalarColumn> columns) {
    this.columns = columns;
    for (ScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScalarFormulaResponseAtrributes addColumnsItem(ScalarColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * List of response columns, each corresponding to an individual formula or query in the request
   * and with values in parallel arrays matching the series list.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ScalarColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ScalarColumn> columns) {
    this.columns = columns;
  }

  public ScalarFormulaResponseAtrributes series(List<List<String>> series) {
    this.series = series;
    return this;
  }

  public ScalarFormulaResponseAtrributes addSeriesItem(List<String> seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<>();
    }
    this.series.add(seriesItem);
    return this;
  }

  /**
   * List of group-by tags for the response. Parallel array to the values in each scalar column.
   *
   * @return series
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<List<String>> getSeries() {
    return series;
  }

  public void setSeries(List<List<String>> series) {
    this.series = series;
  }

  /** Return true if this ScalarFormulaResponseAtrributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalarFormulaResponseAtrributes scalarFormulaResponseAtrributes =
        (ScalarFormulaResponseAtrributes) o;
    return Objects.equals(this.columns, scalarFormulaResponseAtrributes.columns)
        && Objects.equals(this.series, scalarFormulaResponseAtrributes.series);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, series);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalarFormulaResponseAtrributes {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("}");
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
