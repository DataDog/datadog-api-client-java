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
  FormulaSloQuery.JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS,
  FormulaSloQuery.JSON_PROPERTY_APPLY_CORRECTIONS,
  FormulaSloQuery.JSON_PROPERTY_DATA_SOURCE,
  FormulaSloQuery.JSON_PROPERTY_GROUP_MODE,
  FormulaSloQuery.JSON_PROPERTY_MEASURE,
  FormulaSloQuery.JSON_PROPERTY_NAME,
  FormulaSloQuery.JSON_PROPERTY_SLO_ID,
  FormulaSloQuery.JSON_PROPERTY_SLO_QUERY_TYPE,
  FormulaSloQuery.JSON_PROPERTY_SLO_TIME_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaSloQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS = "additional_query_filters";
  private String additionalQueryFilters;

  public static final String JSON_PROPERTY_APPLY_CORRECTIONS = "apply_corrections";
  private Boolean applyCorrections;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private FormulaSloQueryDataSource dataSource;

  public static final String JSON_PROPERTY_GROUP_MODE = "group_mode";
  private SloGroupMode groupMode;

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private SloMeasure measure;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_SLO_QUERY_TYPE = "slo_query_type";
  private SloQueryType sloQueryType;

  public static final String JSON_PROPERTY_SLO_TIME_WINDOW = "slo_time_window";
  private SloTimeWindow sloTimeWindow;

  public FormulaSloQuery() {}

  @JsonCreator
  public FormulaSloQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          FormulaSloQueryDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_MODE) SloGroupMode groupMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEASURE) SloMeasure measure,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLO_ID) String sloId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLO_QUERY_TYPE)
          SloQueryType sloQueryType) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.groupMode = groupMode;
    this.unparsed |= !groupMode.isValid();
    this.measure = measure;
    this.unparsed |= measure.unparsed;
    this.name = name;
    this.sloId = sloId;
    this.sloQueryType = sloQueryType;
    this.unparsed |= !sloQueryType.isValid();
  }

  public FormulaSloQuery additionalQueryFilters(String additionalQueryFilters) {
    this.additionalQueryFilters = additionalQueryFilters;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaSloQuery applyCorrections(Boolean applyCorrections) {
    this.applyCorrections = applyCorrections;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return applyCorrections
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLY_CORRECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getApplyCorrections() {
    return applyCorrections;
  }

  public void setApplyCorrections(Boolean applyCorrections) {
    this.applyCorrections = applyCorrections;
  }

  public FormulaSloQuery dataSource(FormulaSloQueryDataSource dataSource) {
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
  public FormulaSloQueryDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(FormulaSloQueryDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public FormulaSloQuery groupMode(SloGroupMode groupMode) {
    this.groupMode = groupMode;
    this.unparsed |= !groupMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupMode
   */
  @JsonProperty(JSON_PROPERTY_GROUP_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SloGroupMode getGroupMode() {
    return groupMode;
  }

  public void setGroupMode(SloGroupMode groupMode) {
    if (!groupMode.isValid()) {
      this.unparsed = true;
    }
    this.groupMode = groupMode;
  }

  public FormulaSloQuery measure(SloMeasure measure) {
    this.measure = measure;
    this.unparsed |= measure.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return measure
   */
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SloMeasure getMeasure() {
    return measure;
  }

  public void setMeasure(SloMeasure measure) {
    this.measure = measure;
    if (measure != null) {
      this.unparsed |= measure.unparsed;
    }
  }

  public FormulaSloQuery name(String name) {
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

  public FormulaSloQuery sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public FormulaSloQuery sloQueryType(SloQueryType sloQueryType) {
    this.sloQueryType = sloQueryType;
    this.unparsed |= !sloQueryType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sloQueryType
   */
  @JsonProperty(JSON_PROPERTY_SLO_QUERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SloQueryType getSloQueryType() {
    return sloQueryType;
  }

  public void setSloQueryType(SloQueryType sloQueryType) {
    if (!sloQueryType.isValid()) {
      this.unparsed = true;
    }
    this.sloQueryType = sloQueryType;
  }

  public FormulaSloQuery sloTimeWindow(SloTimeWindow sloTimeWindow) {
    this.sloTimeWindow = sloTimeWindow;
    this.unparsed |= !sloTimeWindow.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sloTimeWindow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLO_TIME_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SloTimeWindow getSloTimeWindow() {
    return sloTimeWindow;
  }

  public void setSloTimeWindow(SloTimeWindow sloTimeWindow) {
    if (!sloTimeWindow.isValid()) {
      this.unparsed = true;
    }
    this.sloTimeWindow = sloTimeWindow;
  }

  /** Return true if this FormulaSloQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaSloQuery formulaSloQuery = (FormulaSloQuery) o;
    return Objects.equals(this.additionalQueryFilters, formulaSloQuery.additionalQueryFilters)
        && Objects.equals(this.applyCorrections, formulaSloQuery.applyCorrections)
        && Objects.equals(this.dataSource, formulaSloQuery.dataSource)
        && Objects.equals(this.groupMode, formulaSloQuery.groupMode)
        && Objects.equals(this.measure, formulaSloQuery.measure)
        && Objects.equals(this.name, formulaSloQuery.name)
        && Objects.equals(this.sloId, formulaSloQuery.sloId)
        && Objects.equals(this.sloQueryType, formulaSloQuery.sloQueryType)
        && Objects.equals(this.sloTimeWindow, formulaSloQuery.sloTimeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalQueryFilters,
        applyCorrections,
        dataSource,
        groupMode,
        measure,
        name,
        sloId,
        sloQueryType,
        sloTimeWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaSloQuery {\n");
    sb.append("    additionalQueryFilters: ")
        .append(toIndentedString(additionalQueryFilters))
        .append("\n");
    sb.append("    applyCorrections: ").append(toIndentedString(applyCorrections)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    groupMode: ").append(toIndentedString(groupMode)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    sloQueryType: ").append(toIndentedString(sloQueryType)).append("\n");
    sb.append("    sloTimeWindow: ").append(toIndentedString(sloTimeWindow)).append("\n");
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
