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

/** Traffic exposure fraction or schedule configured for the experiment. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.JSON_PROPERTY_FRACTION,
  ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.JSON_PROPERTY_MODE,
  ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FRACTION = "fraction";
  private Double fraction;

  public static final String JSON_PROPERTY_MODE = "mode";
  private ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureMode mode;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems> steps =
      null;

  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure() {}

  @JsonCreator
  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure fraction(
      Double fraction) {
    this.fraction = fraction;
    return this;
  }

  /**
   * STATIC exposure fraction. Draft experiments can change this value. After start only warehouse
   * experiments without a Datadog flag can change a STATIC fraction through the public API.
   *
   * @return fraction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFraction() {
    return fraction;
  }

  public void setFraction(Double fraction) {
    this.fraction = fraction;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure mode(
      ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Whether exposure uses a fixed fraction or a sequence of steps.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureMode getMode() {
    return mode;
  }

  public void setMode(ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure steps(
      List<ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems> steps) {
    this.steps = steps;
    if (steps != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems item :
          steps) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure addStepsItem(
      ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    this.unparsed |= stepsItem.unparsed;
    return this;
  }

  /**
   * Configured exposure plan rather than wall-clock history. At least two steps must have strictly
   * increasing fractions and no gaps. Warehouse steps start at assignments_start_date and can use
   * different durations. New Datadog plans have at most five steps and a first fraction above zero.
   * Their nonfinal durations must be equal and exclude time paused. Datadog steps start with the
   * experiment. Running warehouse experiments can replace step fractions, durations, and the
   * exposure mode. After start, Datadog exposure plans cannot change through the public API. The
   * final duration is null and its fraction holds until assignment ends.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems>
      getSteps() {
    return steps;
  }

  public void setSteps(
      List<ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems> steps) {
    this.steps = steps;
    if (steps != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesTrafficExposureStepsItems item :
          steps) {
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
   * @return ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure object is
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
    ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure
        experimentsPatchExperimentV2ResponseDataAttributesTrafficExposure =
            (ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure) o;
    return Objects.equals(
            this.fraction,
            experimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.fraction)
        && Objects.equals(
            this.mode, experimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.mode)
        && Objects.equals(
            this.steps, experimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.steps)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentV2ResponseDataAttributesTrafficExposure.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraction, mode, steps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure {\n");
    sb.append("    fraction: ").append(toIndentedString(fraction)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
