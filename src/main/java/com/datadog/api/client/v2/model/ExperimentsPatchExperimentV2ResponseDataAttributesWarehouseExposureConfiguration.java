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

/** Warehouse exposure model and settings used to identify experiment assignments. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      .JSON_PROPERTY_ENTRY_POINT,
  ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      .JSON_PROPERTY_EXPERIMENT_KEY,
  ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      .JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTRY_POINT = "entry_point";
  private ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPoint
      entryPoint;

  public static final String JSON_PROPERTY_EXPERIMENT_KEY = "experiment_key";
  private String experimentKey;

  public static final String JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID = "exposure_sql_model_id";
  private String exposureSqlModelId;

  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration() {}

  @JsonCreator
  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTRY_POINT)
          ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPoint
              entryPoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPERIMENT_KEY) String experimentKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
          String exposureSqlModelId) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
    this.experimentKey = experimentKey;
    if (experimentKey != null) {}
    this.exposureSqlModelId = exposureSqlModelId;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      entryPoint(
          ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPoint
              entryPoint) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
    return this;
  }

  /**
   * Optional Warehouse measure that scopes analyzed subjects.
   *
   * @return entryPoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRY_POINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPoint
      getEntryPoint() {
    return entryPoint;
  }

  public void setEntryPoint(
      ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfigurationEntryPoint
          entryPoint) {
    this.entryPoint = entryPoint;
    if (entryPoint != null) {
      this.unparsed |= entryPoint.unparsed;
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      experimentKey(String experimentKey) {
    this.experimentKey = experimentKey;
    if (experimentKey != null) {}
    return this;
  }

  /**
   * Warehouse experiment key. Reads can return null for incomplete configuration; configuration
   * writes require a value.
   *
   * @return experimentKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExperimentKey() {
    return experimentKey;
  }

  public void setExperimentKey(String experimentKey) {
    this.experimentKey = experimentKey;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      exposureSqlModelId(String exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
    return this;
  }

  /**
   * ID of the exposure SQL model that provides assignment data.
   *
   * @return exposureSqlModelId
   */
  @JsonProperty(JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExposureSqlModelId() {
    return exposureSqlModelId;
  }

  public void setExposureSqlModelId(String exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
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
   * @return ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
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
   * ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration object is
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
    ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
        experimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration =
            (ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration) o;
    return Objects.equals(
            this.entryPoint,
            experimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
                .entryPoint)
        && Objects.equals(
            this.experimentKey,
            experimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
                .experimentKey)
        && Objects.equals(
            this.exposureSqlModelId,
            experimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
                .exposureSqlModelId)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryPoint, experimentKey, exposureSqlModelId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration"
            + " {\n");
    sb.append("    entryPoint: ").append(toIndentedString(entryPoint)).append("\n");
    sb.append("    experimentKey: ").append(toIndentedString(experimentKey)).append("\n");
    sb.append("    exposureSqlModelId: ").append(toIndentedString(exposureSqlModelId)).append("\n");
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
