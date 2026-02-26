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
   * <p>A series in a timeseries response.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsSerie.JSON_PROPERTY_GROUP_TAGS,
  ProductAnalyticsSerie.JSON_PROPERTY_QUERY_INDEX,
  ProductAnalyticsSerie.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSerie {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_TAGS = "group_tags";
  private List<String> groupTags = null;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Long queryIndex;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<ProductAnalyticsUnit> unit = null;

  public ProductAnalyticsSerie groupTags(List<String> groupTags) {
    this.groupTags = groupTags;
    return this;
  }
  public ProductAnalyticsSerie addGroupTagsItem(String groupTagsItem) {
    if (this.groupTags == null) {
      this.groupTags = new ArrayList<>();
    }
    this.groupTags.add(groupTagsItem);
    return this;
  }

  /**
   * <p>GetgroupTags</p>
   * @return groupTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupTags() {
        return groupTags;
      }
  public void setGroupTags(List<String> groupTags) {
    this.groupTags = groupTags;
  }
  public ProductAnalyticsSerie queryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * <p>GetqueryIndex</p>
   * @return queryIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getQueryIndex() {
        return queryIndex;
      }
  public void setQueryIndex(Long queryIndex) {
    this.queryIndex = queryIndex;
  }
  public ProductAnalyticsSerie unit(List<ProductAnalyticsUnit> unit) {
    this.unit = unit;
    for (ProductAnalyticsUnit item : unit) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ProductAnalyticsSerie addUnitItem(ProductAnalyticsUnit unitItem) {
    if (this.unit == null) {
      this.unit = new ArrayList<>();
    }
    this.unit.add(unitItem);
    this.unparsed |= unitItem.unparsed;
    return this;
  }

  /**
   * <p>Getunit</p>
   * @return unit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ProductAnalyticsUnit> getUnit() {
        return unit;
      }
  public void setUnit(List<ProductAnalyticsUnit> unit) {
    this.unit = unit;
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
   * @return ProductAnalyticsSerie
   */
  @JsonAnySetter
  public ProductAnalyticsSerie putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsSerie object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSerie productAnalyticsSerie = (ProductAnalyticsSerie) o;
    return Objects.equals(this.groupTags, productAnalyticsSerie.groupTags) && Objects.equals(this.queryIndex, productAnalyticsSerie.queryIndex) && Objects.equals(this.unit, productAnalyticsSerie.unit) && Objects.equals(this.additionalProperties, productAnalyticsSerie.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(groupTags,queryIndex,unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSerie {\n");
    sb.append("    groupTags: ").append(toIndentedString(groupTags)).append("\n");
    sb.append("    queryIndex: ").append(toIndentedString(queryIndex)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
