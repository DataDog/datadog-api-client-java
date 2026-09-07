/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** One row of the retention grid, holding the results for a single cohort. */
@JsonPropertyOrder({
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_CELLS,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_COHORT_END_TIME,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_COHORT_INDEX,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_COHORT_SIZE,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_COHORT_START_TIME,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_GROUP_TAGS,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_NAME,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_TYPE,
  ProductAnalyticsRetentionGridCohort.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionGridCohort {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CELLS = "cells";
  private List<ProductAnalyticsRetentionGridCohortCell> cells = null;

  public static final String JSON_PROPERTY_COHORT_END_TIME = "cohort_end_time";
  private Long cohortEndTime;

  public static final String JSON_PROPERTY_COHORT_INDEX = "cohort_index";
  private Long cohortIndex;

  public static final String JSON_PROPERTY_COHORT_SIZE = "cohort_size";
  private Long cohortSize;

  public static final String JSON_PROPERTY_COHORT_START_TIME = "cohort_start_time";
  private Long cohortStartTime;

  public static final String JSON_PROPERTY_GROUP_TAGS = "group_tags";
  private List<String> groupTags = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsRetentionGridCohortType type;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<ProductAnalyticsUnit> unit = null;

  public ProductAnalyticsRetentionGridCohort cells(
      List<ProductAnalyticsRetentionGridCohortCell> cells) {
    this.cells = cells;
    if (cells != null) {
      for (ProductAnalyticsRetentionGridCohortCell item : cells) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsRetentionGridCohort addCellsItem(
      ProductAnalyticsRetentionGridCohortCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<>();
    }
    this.cells.add(cellsItem);
    this.unparsed |= cellsItem.unparsed;
    return this;
  }

  /**
   * The cells of the row, one per return period.
   *
   * @return cells
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsRetentionGridCohortCell> getCells() {
    return cells;
  }

  public void setCells(List<ProductAnalyticsRetentionGridCohortCell> cells) {
    this.cells = cells;
    if (cells != null) {
      for (ProductAnalyticsRetentionGridCohortCell item : cells) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsRetentionGridCohort cohortEndTime(Long cohortEndTime) {
    this.cohortEndTime = cohortEndTime;
    return this;
  }

  /**
   * End of the cohort window, in epoch milliseconds.
   *
   * @return cohortEndTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCohortEndTime() {
    return cohortEndTime;
  }

  public void setCohortEndTime(Long cohortEndTime) {
    this.cohortEndTime = cohortEndTime;
  }

  public ProductAnalyticsRetentionGridCohort cohortIndex(Long cohortIndex) {
    this.cohortIndex = cohortIndex;
    return this;
  }

  /**
   * Zero-based index of the cohort in the grid.
   *
   * @return cohortIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCohortIndex() {
    return cohortIndex;
  }

  public void setCohortIndex(Long cohortIndex) {
    this.cohortIndex = cohortIndex;
  }

  public ProductAnalyticsRetentionGridCohort cohortSize(Long cohortSize) {
    this.cohortSize = cohortSize;
    return this;
  }

  /**
   * Number of entities in the cohort.
   *
   * @return cohortSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCohortSize() {
    return cohortSize;
  }

  public void setCohortSize(Long cohortSize) {
    this.cohortSize = cohortSize;
  }

  public ProductAnalyticsRetentionGridCohort cohortStartTime(Long cohortStartTime) {
    this.cohortStartTime = cohortStartTime;
    return this;
  }

  /**
   * Start of the cohort window, in epoch milliseconds.
   *
   * @return cohortStartTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCohortStartTime() {
    return cohortStartTime;
  }

  public void setCohortStartTime(Long cohortStartTime) {
    this.cohortStartTime = cohortStartTime;
  }

  public ProductAnalyticsRetentionGridCohort groupTags(List<String> groupTags) {
    this.groupTags = groupTags;
    return this;
  }

  public ProductAnalyticsRetentionGridCohort addGroupTagsItem(String groupTagsItem) {
    if (this.groupTags == null) {
      this.groupTags = new ArrayList<>();
    }
    this.groupTags.add(groupTagsItem);
    return this;
  }

  /**
   * The group-by facet values that identify this row.
   *
   * @return groupTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupTags() {
    return groupTags;
  }

  public void setGroupTags(List<String> groupTags) {
    this.groupTags = groupTags;
  }

  public ProductAnalyticsRetentionGridCohort name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Label identifying the cohort, such as the week it started.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductAnalyticsRetentionGridCohort type(ProductAnalyticsRetentionGridCohortType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Whether the row holds one cohort's own numbers, or the weighted roll-up across every cohort.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsRetentionGridCohortType getType() {
    return type;
  }

  public void setType(ProductAnalyticsRetentionGridCohortType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ProductAnalyticsRetentionGridCohort unit(List<ProductAnalyticsUnit> unit) {
    this.unit = unit;
    if (unit != null) {
      for (ProductAnalyticsUnit item : unit) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsRetentionGridCohort addUnitItem(ProductAnalyticsUnit unitItem) {
    if (this.unit == null) {
      this.unit = new ArrayList<>();
    }
    this.unit.add(unitItem);
    this.unparsed |= unitItem.unparsed;
    return this;
  }

  /**
   * Unit definitions for the cell values.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsUnit> getUnit() {
    return unit;
  }

  public void setUnit(List<ProductAnalyticsUnit> unit) {
    this.unit = unit;
    if (unit != null) {
      for (ProductAnalyticsUnit item : unit) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsRetentionGridCohort
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionGridCohort putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsRetentionGridCohort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionGridCohort productAnalyticsRetentionGridCohort =
        (ProductAnalyticsRetentionGridCohort) o;
    return Objects.equals(this.cells, productAnalyticsRetentionGridCohort.cells)
        && Objects.equals(this.cohortEndTime, productAnalyticsRetentionGridCohort.cohortEndTime)
        && Objects.equals(this.cohortIndex, productAnalyticsRetentionGridCohort.cohortIndex)
        && Objects.equals(this.cohortSize, productAnalyticsRetentionGridCohort.cohortSize)
        && Objects.equals(this.cohortStartTime, productAnalyticsRetentionGridCohort.cohortStartTime)
        && Objects.equals(this.groupTags, productAnalyticsRetentionGridCohort.groupTags)
        && Objects.equals(this.name, productAnalyticsRetentionGridCohort.name)
        && Objects.equals(this.type, productAnalyticsRetentionGridCohort.type)
        && Objects.equals(this.unit, productAnalyticsRetentionGridCohort.unit)
        && Objects.equals(
            this.additionalProperties, productAnalyticsRetentionGridCohort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cells,
        cohortEndTime,
        cohortIndex,
        cohortSize,
        cohortStartTime,
        groupTags,
        name,
        type,
        unit,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionGridCohort {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    cohortEndTime: ").append(toIndentedString(cohortEndTime)).append("\n");
    sb.append("    cohortIndex: ").append(toIndentedString(cohortIndex)).append("\n");
    sb.append("    cohortSize: ").append(toIndentedString(cohortSize)).append("\n");
    sb.append("    cohortStartTime: ").append(toIndentedString(cohortStartTime)).append("\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
