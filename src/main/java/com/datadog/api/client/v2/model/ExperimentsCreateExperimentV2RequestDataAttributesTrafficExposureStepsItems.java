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

/**
 * Configured exposure plan rather than wall-clock history. At least two steps must have strictly
 * increasing fractions and no gaps. Warehouse steps start at assignments_start_date and can use
 * different durations. New Datadog plans have at most five steps and a first fraction above zero.
 * Their nonfinal durations must be equal and exclude time paused. Datadog steps start with the
 * experiment. Running warehouse experiments can replace step fractions, durations, and the exposure
 * mode. After start, Datadog exposure plans cannot change through the public API. The final
 * duration is null and its fraction holds until assignment ends.
 */
@JsonPropertyOrder({
  ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems
      .JSON_PROPERTY_DURATION_MS,
  ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems.JSON_PROPERTY_FRACTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DURATION_MS = "duration_ms";
  private Long durationMs;

  public static final String JSON_PROPERTY_FRACTION = "fraction";
  private Double fraction;

  public ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems() {}

  @JsonCreator
  public ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION_MS) Long durationMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_FRACTION) Double fraction) {
    this.durationMs = durationMs;
    if (durationMs != null) {}
    this.fraction = fraction;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems durationMs(
      Long durationMs) {
    this.durationMs = durationMs;
    if (durationMs != null) {}
    return this;
  }

  /**
   * Positive step duration in milliseconds. Datadog durations exclude pauses. Send null for the
   * final step.
   *
   * @return durationMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems fraction(
      Double fraction) {
    this.fraction = fraction;
    return this;
  }

  /**
   * Fraction of traffic exposed during this step.
   *
   * @return fraction
   */
  @JsonProperty(JSON_PROPERTY_FRACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getFraction() {
    return fraction;
  }

  public void setFraction(Double fraction) {
    this.fraction = fraction;
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
   * @return ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems
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
   * Return true if this ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems
        experimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems =
            (ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems) o;
    return Objects.equals(
            this.durationMs,
            experimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems.durationMs)
        && Objects.equals(
            this.fraction,
            experimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems.fraction)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMs, fraction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems {\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    fraction: ").append(toIndentedString(fraction)).append("\n");
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
