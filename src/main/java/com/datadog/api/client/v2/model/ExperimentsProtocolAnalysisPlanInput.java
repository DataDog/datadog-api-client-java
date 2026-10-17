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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Statistical settings. Use <code>default_duration_days</code> for duration; <code>
 * target_duration_days</code> is not accepted here.
 */
@JsonPropertyOrder({
  ExperimentsProtocolAnalysisPlanInput.JSON_PROPERTY_COMPUTE_CUPED,
  ExperimentsProtocolAnalysisPlanInput.JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD,
  ExperimentsProtocolAnalysisPlanInput.JSON_PROPERTY_CONFIDENCE_LEVEL,
  ExperimentsProtocolAnalysisPlanInput.JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION_METHOD
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsProtocolAnalysisPlanInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPUTE_CUPED = "compute_cuped";
  private JsonNullable<Boolean> computeCuped = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD =
      "confidence_interval_method";
  private String confidenceIntervalMethod;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private JsonNullable<Double> confidenceLevel = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION_METHOD =
      "multiple_testing_correction_method";
  private JsonNullable<String> multipleTestingCorrectionMethod = JsonNullable.<String>undefined();

  public ExperimentsProtocolAnalysisPlanInput computeCuped(Boolean computeCuped) {
    this.computeCuped = JsonNullable.<Boolean>of(computeCuped);
    return this;
  }

  /**
   * Whether to use pre-experiment data to reduce variance with CUPED.
   *
   * @return computeCuped
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getComputeCuped() {
    return computeCuped.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPUTE_CUPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getComputeCuped_JsonNullable() {
    return computeCuped;
  }

  @JsonProperty(JSON_PROPERTY_COMPUTE_CUPED)
  public void setComputeCuped_JsonNullable(JsonNullable<Boolean> computeCuped) {
    this.computeCuped = computeCuped;
  }

  public void setComputeCuped(Boolean computeCuped) {
    this.computeCuped = JsonNullable.<Boolean>of(computeCuped);
  }

  public ExperimentsProtocolAnalysisPlanInput confidenceIntervalMethod(
      String confidenceIntervalMethod) {
    this.confidenceIntervalMethod = confidenceIntervalMethod;
    return this;
  }

  /**
   * Confidence interval method: <code>Sequential</code>, <code>FixedSample</code>, <code>Bayesian
   * </code>, or <code>SequentialFixedHybrid</code>. An empty string leaves the method unset.
   *
   * @return confidenceIntervalMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_INTERVAL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConfidenceIntervalMethod() {
    return confidenceIntervalMethod;
  }

  public void setConfidenceIntervalMethod(String confidenceIntervalMethod) {
    this.confidenceIntervalMethod = confidenceIntervalMethod;
  }

  public ExperimentsProtocolAnalysisPlanInput confidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = JsonNullable.<Double>of(confidenceLevel);
    return this;
  }

  /**
   * Confidence level used by the statistical analysis. minimum: 0 maximum: 1
   *
   * @return confidenceLevel
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getConfidenceLevel() {
    return confidenceLevel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getConfidenceLevel_JsonNullable() {
    return confidenceLevel;
  }

  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  public void setConfidenceLevel_JsonNullable(JsonNullable<Double> confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }

  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = JsonNullable.<Double>of(confidenceLevel);
  }

  public ExperimentsProtocolAnalysisPlanInput multipleTestingCorrectionMethod(
      String multipleTestingCorrectionMethod) {
    this.multipleTestingCorrectionMethod = JsonNullable.<String>of(multipleTestingCorrectionMethod);
    return this;
  }

  /**
   * Method used to adjust for testing multiple metrics.
   *
   * @return multipleTestingCorrectionMethod
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMultipleTestingCorrectionMethod() {
    return multipleTestingCorrectionMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMultipleTestingCorrectionMethod_JsonNullable() {
    return multipleTestingCorrectionMethod;
  }

  @JsonProperty(JSON_PROPERTY_MULTIPLE_TESTING_CORRECTION_METHOD)
  public void setMultipleTestingCorrectionMethod_JsonNullable(
      JsonNullable<String> multipleTestingCorrectionMethod) {
    this.multipleTestingCorrectionMethod = multipleTestingCorrectionMethod;
  }

  public void setMultipleTestingCorrectionMethod(String multipleTestingCorrectionMethod) {
    this.multipleTestingCorrectionMethod = JsonNullable.<String>of(multipleTestingCorrectionMethod);
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
   * @return ExperimentsProtocolAnalysisPlanInput
   */
  @JsonAnySetter
  public ExperimentsProtocolAnalysisPlanInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsProtocolAnalysisPlanInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsProtocolAnalysisPlanInput experimentsProtocolAnalysisPlanInput =
        (ExperimentsProtocolAnalysisPlanInput) o;
    return Objects.equals(this.computeCuped, experimentsProtocolAnalysisPlanInput.computeCuped)
        && Objects.equals(
            this.confidenceIntervalMethod,
            experimentsProtocolAnalysisPlanInput.confidenceIntervalMethod)
        && Objects.equals(
            this.confidenceLevel, experimentsProtocolAnalysisPlanInput.confidenceLevel)
        && Objects.equals(
            this.multipleTestingCorrectionMethod,
            experimentsProtocolAnalysisPlanInput.multipleTestingCorrectionMethod)
        && Objects.equals(
            this.additionalProperties, experimentsProtocolAnalysisPlanInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        computeCuped,
        confidenceIntervalMethod,
        confidenceLevel,
        multipleTestingCorrectionMethod,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsProtocolAnalysisPlanInput {\n");
    sb.append("    computeCuped: ").append(toIndentedString(computeCuped)).append("\n");
    sb.append("    confidenceIntervalMethod: ")
        .append(toIndentedString(confidenceIntervalMethod))
        .append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    multipleTestingCorrectionMethod: ")
        .append(toIndentedString(multipleTestingCorrectionMethod))
        .append("\n");
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
