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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Datadog measure and filters used to select analyzed subjects. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      .JSON_PROPERTY_FILTERS,
  ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      .JSON_PROPERTY_MEASURE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<List<ExperimentsDatadogEntryPointFilter>> filters = new ArrayList<>();

  public static final String JSON_PROPERTY_MEASURE_ID = "measure_id";
  private String measureId;

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint() {}

  @JsonCreator
  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTERS)
          List<List<ExperimentsDatadogEntryPointFilter>> filters,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEASURE_ID) String measureId) {
    this.filters = filters;
    this.measureId = measureId;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      filters(List<List<ExperimentsDatadogEntryPointFilter>> filters) {
    this.filters = filters;
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      addFiltersItem(List<ExperimentsDatadogEntryPointFilter> filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Complete Datadog OR-of-ANDs entry-point filter expression.
   *
   * @return filters
   */
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<List<ExperimentsDatadogEntryPointFilter>> getFilters() {
    return filters;
  }

  public void setFilters(List<List<ExperimentsDatadogEntryPointFilter>> filters) {
    this.filters = filters;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      measureId(String measureId) {
    this.measureId = measureId;
    return this;
  }

  /**
   * Datadog measure UUID.
   *
   * @return measureId
   */
  @JsonProperty(JSON_PROPERTY_MEASURE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMeasureId() {
    return measureId;
  }

  public void setMeasureId(String measureId) {
    this.measureId = measureId;
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
   * @return ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this
   * ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
        experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint =
            (ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint)
                o;
    return Objects.equals(
            this.filters,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
                .filters)
        && Objects.equals(
            this.measureId,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
                .measureId)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, measureId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfigurationEntryPoint"
            + " {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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
