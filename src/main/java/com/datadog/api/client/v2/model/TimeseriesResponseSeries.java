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

 */
@JsonPropertyOrder({
  TimeseriesResponseSeries.JSON_PROPERTY_GROUP_TAGS,
  TimeseriesResponseSeries.JSON_PROPERTY_QUERY_INDEX,
  TimeseriesResponseSeries.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TimeseriesResponseSeries {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_GROUP_TAGS = "group_tags";
  private List<String> groupTags = null;

  public static final String JSON_PROPERTY_QUERY_INDEX = "query_index";
  private Integer queryIndex;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private JsonNullable<List<Unit>> unit = JsonNullable.<List<Unit>>undefined();

  public TimeseriesResponseSeries groupTags(List<String> groupTags) {
    this.groupTags = groupTags;
    return this;
  }
  public TimeseriesResponseSeries addGroupTagsItem(String groupTagsItem) {
    if (this.groupTags == null) {
      this.groupTags = new ArrayList<>();
    }
    this.groupTags.add(groupTagsItem);
    return this;
  }

  /**
   * <p>List of tags that apply to a single response value.</p>
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
  public TimeseriesResponseSeries queryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
    return this;
  }

  /**
   * <p>The index of the query in the "formulas" array (or "queries" array if no "formulas" was specified).</p>
   * maximum: 2147483647
   * @return queryIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getQueryIndex() {
        return queryIndex;
      }
  public void setQueryIndex(Integer queryIndex) {
    this.queryIndex = queryIndex;
  }
  public TimeseriesResponseSeries unit(List<Unit> unit) {
    this.unit = JsonNullable.<List<Unit>>of(unit);
    return this;
  }
  public TimeseriesResponseSeries addUnitItem(Unit unitItem) {
    if (this.unit == null || !this.unit.isPresent()) {
      this.unit = JsonNullable.<List<Unit>>of(new ArrayList<>());
    }
    try {
      this.unit.get().add(unitItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>Detailed information about the unit.
   * The first element describes the "primary unit" (for example, <code>bytes</code> in <code>bytes per second</code>).
   * The second element describes the "per unit" (for example, <code>second</code> in <code>bytes per second</code>).
   * If the second element is not present, the API returns null.</p>
   * @return unit
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<Unit> getUnit() {
        return unit.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<Unit>> getUnit_JsonNullable() {
    return unit;
  }
  @JsonProperty(JSON_PROPERTY_UNIT)public void setUnit_JsonNullable(JsonNullable<List<Unit>> unit) {
    this.unit = unit;
  }
  public void setUnit(List<Unit> unit) {
    this.unit = JsonNullable.<List<Unit>>of(unit);
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
   * @return TimeseriesResponseSeries
   */
  @JsonAnySetter
  public TimeseriesResponseSeries putAdditionalProperty(String key, Object value) {
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
   * Return true if this TimeseriesResponseSeries object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeseriesResponseSeries timeseriesResponseSeries = (TimeseriesResponseSeries) o;
    return Objects.equals(this.groupTags, timeseriesResponseSeries.groupTags) && Objects.equals(this.queryIndex, timeseriesResponseSeries.queryIndex) && Objects.equals(this.unit, timeseriesResponseSeries.unit) && Objects.equals(this.additionalProperties, timeseriesResponseSeries.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(groupTags,queryIndex,unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeseriesResponseSeries {\n");
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
