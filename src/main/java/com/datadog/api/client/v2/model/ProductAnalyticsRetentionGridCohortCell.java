/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>One cell of the retention grid, holding the result for a single cohort over a single return period.
   * Aggregated rows omit the time and count fields.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_CELL_COUNT,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_CELL_RATE,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_CELL_RELATIVE_VALUE_CHANGE,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_CELL_VALUE,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_IS_PARTIAL_DATA,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_RETURN_PERIOD_END_TIME,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_RETURN_PERIOD_INDEX,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_RETURN_PERIOD_START_TIME,
  ProductAnalyticsRetentionGridCohortCell.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionGridCohortCell {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELL_COUNT = "cell_count";
  private Long cellCount;

  public static final String JSON_PROPERTY_CELL_RATE = "cell_rate";
  private Double cellRate;

  public static final String JSON_PROPERTY_CELL_RELATIVE_VALUE_CHANGE = "cell_relative_value_change";
  private JsonNullable<Double> cellRelativeValueChange = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CELL_VALUE = "cell_value";
  private JsonNullable<Double> cellValue = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_IS_PARTIAL_DATA = "is_partial_data";
  private Boolean isPartialData;

  public static final String JSON_PROPERTY_RETURN_PERIOD_END_TIME = "return_period_end_time";
  private Long returnPeriodEndTime;

  public static final String JSON_PROPERTY_RETURN_PERIOD_INDEX = "return_period_index";
  private Long returnPeriodIndex;

  public static final String JSON_PROPERTY_RETURN_PERIOD_START_TIME = "return_period_start_time";
  private Long returnPeriodStartTime;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsRetentionGridCohortType type;

  public ProductAnalyticsRetentionGridCohortCell cellCount(Long cellCount) {
    this.cellCount = cellCount;
    return this;
  }

  /**
   * <p>Number of entities that returned during the period.</p>
   * @return cellCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CELL_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCellCount() {
        return cellCount;
      }
  public void setCellCount(Long cellCount) {
    this.cellCount = cellCount;
  }
  public ProductAnalyticsRetentionGridCohortCell cellRate(Double cellRate) {
    this.cellRate = cellRate;
    return this;
  }

  /**
   * <p>Fraction of the cohort that returned, between <code>0</code> and <code>1</code>.</p>
   * @return cellRate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CELL_RATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getCellRate() {
        return cellRate;
      }
  public void setCellRate(Double cellRate) {
    this.cellRate = cellRate;
  }
  public ProductAnalyticsRetentionGridCohortCell cellRelativeValueChange(Double cellRelativeValueChange) {
    this.cellRelativeValueChange = JsonNullable.<Double>of(cellRelativeValueChange);
    return this;
  }

  /**
   * <p>Change in the metric relative to the cohort baseline.</p>
   * @return cellRelativeValueChange
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getCellRelativeValueChange() {
        return cellRelativeValueChange.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CELL_RELATIVE_VALUE_CHANGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCellRelativeValueChange_JsonNullable() {
    return cellRelativeValueChange;
  }
  @JsonProperty(JSON_PROPERTY_CELL_RELATIVE_VALUE_CHANGE)public void setCellRelativeValueChange_JsonNullable(JsonNullable<Double> cellRelativeValueChange) {
    this.cellRelativeValueChange = cellRelativeValueChange;
  }
  public void setCellRelativeValueChange(Double cellRelativeValueChange) {
    this.cellRelativeValueChange = JsonNullable.<Double>of(cellRelativeValueChange);
  }
  public ProductAnalyticsRetentionGridCohortCell cellValue(Double cellValue) {
    this.cellValue = JsonNullable.<Double>of(cellValue);
    return this;
  }

  /**
   * <p>Value of the computed metric, when a metric other than the retention rate is requested.</p>
   * @return cellValue
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getCellValue() {
        return cellValue.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CELL_VALUE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getCellValue_JsonNullable() {
    return cellValue;
  }
  @JsonProperty(JSON_PROPERTY_CELL_VALUE)public void setCellValue_JsonNullable(JsonNullable<Double> cellValue) {
    this.cellValue = cellValue;
  }
  public void setCellValue(Double cellValue) {
    this.cellValue = JsonNullable.<Double>of(cellValue);
  }
  public ProductAnalyticsRetentionGridCohortCell isPartialData(Boolean isPartialData) {
    this.isPartialData = isPartialData;
    return this;
  }

  /**
   * <p>Whether the return period is still open, so the numbers are not yet final.</p>
   * @return isPartialData
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_PARTIAL_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsPartialData() {
        return isPartialData;
      }
  public void setIsPartialData(Boolean isPartialData) {
    this.isPartialData = isPartialData;
  }
  public ProductAnalyticsRetentionGridCohortCell returnPeriodEndTime(Long returnPeriodEndTime) {
    this.returnPeriodEndTime = returnPeriodEndTime;
    return this;
  }

  /**
   * <p>End of the return period, in epoch milliseconds.</p>
   * @return returnPeriodEndTime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETURN_PERIOD_END_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getReturnPeriodEndTime() {
        return returnPeriodEndTime;
      }
  public void setReturnPeriodEndTime(Long returnPeriodEndTime) {
    this.returnPeriodEndTime = returnPeriodEndTime;
  }
  public ProductAnalyticsRetentionGridCohortCell returnPeriodIndex(Long returnPeriodIndex) {
    this.returnPeriodIndex = returnPeriodIndex;
    return this;
  }

  /**
   * <p>Zero-based index of the return period this cell belongs to.</p>
   * @return returnPeriodIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETURN_PERIOD_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getReturnPeriodIndex() {
        return returnPeriodIndex;
      }
  public void setReturnPeriodIndex(Long returnPeriodIndex) {
    this.returnPeriodIndex = returnPeriodIndex;
  }
  public ProductAnalyticsRetentionGridCohortCell returnPeriodStartTime(Long returnPeriodStartTime) {
    this.returnPeriodStartTime = returnPeriodStartTime;
    return this;
  }

  /**
   * <p>Start of the return period, in epoch milliseconds.</p>
   * @return returnPeriodStartTime
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETURN_PERIOD_START_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getReturnPeriodStartTime() {
        return returnPeriodStartTime;
      }
  public void setReturnPeriodStartTime(Long returnPeriodStartTime) {
    this.returnPeriodStartTime = returnPeriodStartTime;
  }
  public ProductAnalyticsRetentionGridCohortCell type(ProductAnalyticsRetentionGridCohortType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Whether the row holds one cohort's own numbers, or the weighted roll-up across every cohort.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsRetentionGridCohortType getType() {
        return type;
      }
  public void setType(ProductAnalyticsRetentionGridCohortType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsRetentionGridCohortCell
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionGridCohortCell putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this ProductAnalyticsRetentionGridCohortCell object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionGridCohortCell productAnalyticsRetentionGridCohortCell = (ProductAnalyticsRetentionGridCohortCell) o;
    return Objects.equals(this.cellCount, productAnalyticsRetentionGridCohortCell.cellCount) && Objects.equals(this.cellRate, productAnalyticsRetentionGridCohortCell.cellRate) && Objects.equals(this.cellRelativeValueChange, productAnalyticsRetentionGridCohortCell.cellRelativeValueChange) && Objects.equals(this.cellValue, productAnalyticsRetentionGridCohortCell.cellValue) && Objects.equals(this.isPartialData, productAnalyticsRetentionGridCohortCell.isPartialData) && Objects.equals(this.returnPeriodEndTime, productAnalyticsRetentionGridCohortCell.returnPeriodEndTime) && Objects.equals(this.returnPeriodIndex, productAnalyticsRetentionGridCohortCell.returnPeriodIndex) && Objects.equals(this.returnPeriodStartTime, productAnalyticsRetentionGridCohortCell.returnPeriodStartTime) && Objects.equals(this.type, productAnalyticsRetentionGridCohortCell.type) && Objects.equals(this.additionalProperties, productAnalyticsRetentionGridCohortCell.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cellCount,cellRate,cellRelativeValueChange,cellValue,isPartialData,returnPeriodEndTime,returnPeriodIndex,returnPeriodStartTime,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionGridCohortCell {\n");
    sb.append("    cellCount: ").append(toIndentedString(cellCount)).append("\n");
    sb.append("    cellRate: ").append(toIndentedString(cellRate)).append("\n");
    sb.append("    cellRelativeValueChange: ").append(toIndentedString(cellRelativeValueChange)).append("\n");
    sb.append("    cellValue: ").append(toIndentedString(cellValue)).append("\n");
    sb.append("    isPartialData: ").append(toIndentedString(isPartialData)).append("\n");
    sb.append("    returnPeriodEndTime: ").append(toIndentedString(returnPeriodEndTime)).append("\n");
    sb.append("    returnPeriodIndex: ").append(toIndentedString(returnPeriodIndex)).append("\n");
    sb.append("    returnPeriodStartTime: ").append(toIndentedString(returnPeriodStartTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
