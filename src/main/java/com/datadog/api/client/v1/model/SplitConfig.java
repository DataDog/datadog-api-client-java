/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>Encapsulates all user choices about how to split a graph.</p>
 */
@JsonPropertyOrder({
  SplitConfig.JSON_PROPERTY_LIMIT,
  SplitConfig.JSON_PROPERTY_SORT,
  SplitConfig.JSON_PROPERTY_SPLIT_DIMENSIONS,
  SplitConfig.JSON_PROPERTY_STATIC_SPLITS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SplitConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SplitSort sort;

  public static final String JSON_PROPERTY_SPLIT_DIMENSIONS = "split_dimensions";
  private List<SplitDimension> splitDimensions = new ArrayList<>();

  public static final String JSON_PROPERTY_STATIC_SPLITS = "static_splits";
  private List<List<SplitVectorEntryItem>> staticSplits = null;

  public SplitConfig() {}

  @JsonCreator
  public SplitConfig(
            @JsonProperty(required=true, value=JSON_PROPERTY_LIMIT)Long limit,
            @JsonProperty(required=true, value=JSON_PROPERTY_SORT)SplitSort sort,
            @JsonProperty(required=true, value=JSON_PROPERTY_SPLIT_DIMENSIONS)List<SplitDimension> splitDimensions) {
        this.limit = limit;
        this.sort = sort;
        this.unparsed |= sort.unparsed;
        this.splitDimensions = splitDimensions;
  }
  public SplitConfig limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>Maximum number of graphs to display in the widget.</p>
   * minimum: 1
   * maximum: 500
   * @return limit
  **/
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
  }
  public SplitConfig sort(SplitSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * <p>Controls the order in which graphs appear in the split.</p>
   * @return sort
  **/
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SplitSort getSort() {
        return sort;
      }
  public void setSort(SplitSort sort) {
    this.sort = sort;
  }
  public SplitConfig splitDimensions(List<SplitDimension> splitDimensions) {
    this.splitDimensions = splitDimensions;
    for (SplitDimension item : splitDimensions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SplitConfig addSplitDimensionsItem(SplitDimension splitDimensionsItem) {
    this.splitDimensions.add(splitDimensionsItem);
    this.unparsed |= splitDimensionsItem.unparsed;
    return this;
  }

  /**
   * <p>The dimension(s) on which to split the graph</p>
   * @return splitDimensions
  **/
      @JsonProperty(JSON_PROPERTY_SPLIT_DIMENSIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SplitDimension> getSplitDimensions() {
        return splitDimensions;
      }
  public void setSplitDimensions(List<SplitDimension> splitDimensions) {
    this.splitDimensions = splitDimensions;
  }
  public SplitConfig staticSplits(List<List<SplitVectorEntryItem>> staticSplits) {
    this.staticSplits = staticSplits;
    return this;
  }
  public SplitConfig addStaticSplitsItem(List<SplitVectorEntryItem> staticSplitsItem) {
    if (this.staticSplits == null) {
      this.staticSplits = new ArrayList<>();
    }
    this.staticSplits.add(staticSplitsItem);
    return this;
  }

  /**
   * <p>Manual selection of tags making split graph widget static</p>
   * @return staticSplits
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATIC_SPLITS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<List<SplitVectorEntryItem>> getStaticSplits() {
        return staticSplits;
      }
  public void setStaticSplits(List<List<SplitVectorEntryItem>> staticSplits) {
    this.staticSplits = staticSplits;
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
   * @return SplitConfig
   */
  @JsonAnySetter
  public SplitConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this SplitConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitConfig splitConfig = (SplitConfig) o;
    return Objects.equals(this.limit, splitConfig.limit) && Objects.equals(this.sort, splitConfig.sort) && Objects.equals(this.splitDimensions, splitConfig.splitDimensions) && Objects.equals(this.staticSplits, splitConfig.staticSplits) && Objects.equals(this.additionalProperties, splitConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(limit,sort,splitDimensions,staticSplits, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitConfig {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    splitDimensions: ").append(toIndentedString(splitDimensions)).append("\n");
    sb.append("    staticSplits: ").append(toIndentedString(staticSplits)).append("\n");
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
