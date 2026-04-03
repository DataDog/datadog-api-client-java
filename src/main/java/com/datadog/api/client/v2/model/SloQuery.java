/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** An individual SLO query. */
@JsonPropertyOrder({
  SloQuery.JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS,
  SloQuery.JSON_PROPERTY_DATA_SOURCE,
  SloQuery.JSON_PROPERTY_GROUP_MODE,
  SloQuery.JSON_PROPERTY_MEASURE,
  SloQuery.JSON_PROPERTY_NAME,
  SloQuery.JSON_PROPERTY_SLO_ID,
  SloQuery.JSON_PROPERTY_SLO_QUERY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SloQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS = "additional_query_filters";
  private String additionalQueryFilters;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private SloDataSource dataSource = SloDataSource.SLO;

  public static final String JSON_PROPERTY_GROUP_MODE = "group_mode";
  private SlosGroupMode groupMode;

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private SlosMeasure measure;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_SLO_QUERY_TYPE = "slo_query_type";
  private SlosQueryType sloQueryType;

  public SloQuery() {}

  @JsonCreator
  public SloQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) SloDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEASURE) SlosMeasure measure,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLO_ID) String sloId) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.measure = measure;
    this.unparsed |= !measure.isValid();
    this.sloId = sloId;
  }

  public SloQuery additionalQueryFilters(String additionalQueryFilters) {
    this.additionalQueryFilters = additionalQueryFilters;
    return this;
  }

  /**
   * Additional filters applied to the SLO query.
   *
   * @return additionalQueryFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAdditionalQueryFilters() {
    return additionalQueryFilters;
  }

  public void setAdditionalQueryFilters(String additionalQueryFilters) {
    this.additionalQueryFilters = additionalQueryFilters;
  }

  public SloQuery dataSource(SloDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * A data source for SLO queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SloDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(SloDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public SloQuery groupMode(SlosGroupMode groupMode) {
    this.groupMode = groupMode;
    this.unparsed |= !groupMode.isValid();
    return this;
  }

  /**
   * How SLO results are grouped in the response.
   *
   * @return groupMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SlosGroupMode getGroupMode() {
    return groupMode;
  }

  public void setGroupMode(SlosGroupMode groupMode) {
    if (!groupMode.isValid()) {
      this.unparsed = true;
    }
    this.groupMode = groupMode;
  }

  public SloQuery measure(SlosMeasure measure) {
    this.measure = measure;
    this.unparsed |= !measure.isValid();
    return this;
  }

  /**
   * The SLO measurement to retrieve.
   *
   * @return measure
   */
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SlosMeasure getMeasure() {
    return measure;
  }

  public void setMeasure(SlosMeasure measure) {
    if (!measure.isValid()) {
      this.unparsed = true;
    }
    this.measure = measure;
  }

  public SloQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The variable name for use in formulas.
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

  public SloQuery sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

  /**
   * The unique identifier of the SLO to query.
   *
   * @return sloId
   */
  @JsonProperty(JSON_PROPERTY_SLO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSloId() {
    return sloId;
  }

  public void setSloId(String sloId) {
    this.sloId = sloId;
  }

  public SloQuery sloQueryType(SlosQueryType sloQueryType) {
    this.sloQueryType = sloQueryType;
    this.unparsed |= !sloQueryType.isValid();
    return this;
  }

  /**
   * The type of SLO definition being queried.
   *
   * @return sloQueryType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLO_QUERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SlosQueryType getSloQueryType() {
    return sloQueryType;
  }

  public void setSloQueryType(SlosQueryType sloQueryType) {
    if (!sloQueryType.isValid()) {
      this.unparsed = true;
    }
    this.sloQueryType = sloQueryType;
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
   * @return SloQuery
   */
  @JsonAnySetter
  public SloQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SloQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SloQuery sloQuery = (SloQuery) o;
    return Objects.equals(this.additionalQueryFilters, sloQuery.additionalQueryFilters)
        && Objects.equals(this.dataSource, sloQuery.dataSource)
        && Objects.equals(this.groupMode, sloQuery.groupMode)
        && Objects.equals(this.measure, sloQuery.measure)
        && Objects.equals(this.name, sloQuery.name)
        && Objects.equals(this.sloId, sloQuery.sloId)
        && Objects.equals(this.sloQueryType, sloQuery.sloQueryType)
        && Objects.equals(this.additionalProperties, sloQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalQueryFilters,
        dataSource,
        groupMode,
        measure,
        name,
        sloId,
        sloQueryType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SloQuery {\n");
    sb.append("    additionalQueryFilters: ")
        .append(toIndentedString(additionalQueryFilters))
        .append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupMode: ").append(toIndentedString(groupMode)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    sloQueryType: ").append(toIndentedString(sloQueryType)).append("\n");
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
