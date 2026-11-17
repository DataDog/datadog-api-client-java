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

/** The prior the bandit's estimates start from. */
@JsonPropertyOrder({
  ExperimentsBanditBayesianPriorV2.JSON_PROPERTY_ARM_STANDARD_DEVIATION,
  ExperimentsBanditBayesianPriorV2.JSON_PROPERTY_GRAND_MEAN,
  ExperimentsBanditBayesianPriorV2.JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditBayesianPriorV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARM_STANDARD_DEVIATION = "arm_standard_deviation";
  private Double armStandardDeviation;

  public static final String JSON_PROPERTY_GRAND_MEAN = "grand_mean";
  private Double grandMean;

  public static final String JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION =
      "grand_mean_standard_deviation";
  private Double grandMeanStandardDeviation;

  public ExperimentsBanditBayesianPriorV2() {}

  @JsonCreator
  public ExperimentsBanditBayesianPriorV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARM_STANDARD_DEVIATION)
          Double armStandardDeviation,
      @JsonProperty(required = true, value = JSON_PROPERTY_GRAND_MEAN) Double grandMean,
      @JsonProperty(required = true, value = JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION)
          Double grandMeanStandardDeviation) {
    this.armStandardDeviation = armStandardDeviation;
    this.grandMean = grandMean;
    this.grandMeanStandardDeviation = grandMeanStandardDeviation;
  }

  public ExperimentsBanditBayesianPriorV2 armStandardDeviation(Double armStandardDeviation) {
    this.armStandardDeviation = armStandardDeviation;
    return this;
  }

  /**
   * Prior standard deviation of each arm's mean around the shared mean.
   *
   * @return armStandardDeviation
   */
  @JsonProperty(JSON_PROPERTY_ARM_STANDARD_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getArmStandardDeviation() {
    return armStandardDeviation;
  }

  public void setArmStandardDeviation(Double armStandardDeviation) {
    this.armStandardDeviation = armStandardDeviation;
  }

  public ExperimentsBanditBayesianPriorV2 grandMean(Double grandMean) {
    this.grandMean = grandMean;
    return this;
  }

  /**
   * Prior mean of the shared mean of the arms, in the metric's units.
   *
   * @return grandMean
   */
  @JsonProperty(JSON_PROPERTY_GRAND_MEAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getGrandMean() {
    return grandMean;
  }

  public void setGrandMean(Double grandMean) {
    this.grandMean = grandMean;
  }

  public ExperimentsBanditBayesianPriorV2 grandMeanStandardDeviation(
      Double grandMeanStandardDeviation) {
    this.grandMeanStandardDeviation = grandMeanStandardDeviation;
    return this;
  }

  /**
   * Prior standard deviation of the shared mean of the arms.
   *
   * @return grandMeanStandardDeviation
   */
  @JsonProperty(JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getGrandMeanStandardDeviation() {
    return grandMeanStandardDeviation;
  }

  public void setGrandMeanStandardDeviation(Double grandMeanStandardDeviation) {
    this.grandMeanStandardDeviation = grandMeanStandardDeviation;
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
   * @return ExperimentsBanditBayesianPriorV2
   */
  @JsonAnySetter
  public ExperimentsBanditBayesianPriorV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditBayesianPriorV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditBayesianPriorV2 experimentsBanditBayesianPriorV2 =
        (ExperimentsBanditBayesianPriorV2) o;
    return Objects.equals(
            this.armStandardDeviation, experimentsBanditBayesianPriorV2.armStandardDeviation)
        && Objects.equals(this.grandMean, experimentsBanditBayesianPriorV2.grandMean)
        && Objects.equals(
            this.grandMeanStandardDeviation,
            experimentsBanditBayesianPriorV2.grandMeanStandardDeviation)
        && Objects.equals(
            this.additionalProperties, experimentsBanditBayesianPriorV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        armStandardDeviation, grandMean, grandMeanStandardDeviation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditBayesianPriorV2 {\n");
    sb.append("    armStandardDeviation: ")
        .append(toIndentedString(armStandardDeviation))
        .append("\n");
    sb.append("    grandMean: ").append(toIndentedString(grandMean)).append("\n");
    sb.append("    grandMeanStandardDeviation: ")
        .append(toIndentedString(grandMeanStandardDeviation))
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
