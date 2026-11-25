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
  TableTrendCellDisplayModeOptions.JSON_PROPERTY_TREND_TYPE,
  TableTrendCellDisplayModeOptions.JSON_PROPERTY_Y_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableTrendCellDisplayModeOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TREND_TYPE = "trend_type";
  private TableTrendType trendType;

  public static final String JSON_PROPERTY_Y_SCALE = "y_scale";
  private TableTrendCellDisplayModeOptionsYScale yScale;

  public TableTrendCellDisplayModeOptions() {}

  @JsonCreator
  public TableTrendCellDisplayModeOptions(
      @JsonProperty(required = true, value = JSON_PROPERTY_TREND_TYPE) TableTrendType trendType,
      @JsonProperty(required = true, value = JSON_PROPERTY_Y_SCALE)
          TableTrendCellDisplayModeOptionsYScale yScale) {
    this.trendType = trendType;
    this.unparsed |= !trendType.isValid();
    this.yScale = yScale;
    this.unparsed |= !yScale.isValid();
  }

  public TableTrendCellDisplayModeOptions trendType(TableTrendType trendType) {
    this.trendType = trendType;
    this.unparsed |= !trendType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return trendType
   */
  @JsonProperty(JSON_PROPERTY_TREND_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableTrendType getTrendType() {
    return trendType;
  }

  public void setTrendType(TableTrendType trendType) {
    if (!trendType.isValid()) {
      this.unparsed = true;
    }
    this.trendType = trendType;
  }

  public TableTrendCellDisplayModeOptions yScale(TableTrendCellDisplayModeOptionsYScale yScale) {
    this.yScale = yScale;
    this.unparsed |= !yScale.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return yScale
   */
  @JsonProperty(JSON_PROPERTY_Y_SCALE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableTrendCellDisplayModeOptionsYScale getYScale() {
    return yScale;
  }

  public void setYScale(TableTrendCellDisplayModeOptionsYScale yScale) {
    if (!yScale.isValid()) {
      this.unparsed = true;
    }
    this.yScale = yScale;
  }

  /** Return true if this TableTrendCellDisplayModeOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableTrendCellDisplayModeOptions tableTrendCellDisplayModeOptions =
        (TableTrendCellDisplayModeOptions) o;
    return Objects.equals(this.trendType, tableTrendCellDisplayModeOptions.trendType)
        && Objects.equals(this.yScale, tableTrendCellDisplayModeOptions.yScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trendType, yScale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableTrendCellDisplayModeOptions {\n");
    sb.append("    trendType: ").append(toIndentedString(trendType)).append("\n");
    sb.append("    yScale: ").append(toIndentedString(yScale)).append("\n");
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
