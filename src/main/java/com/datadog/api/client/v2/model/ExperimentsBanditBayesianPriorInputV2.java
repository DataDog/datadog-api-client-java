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

/**
 * The prior the bandit's estimates start from, in the metric's units. Omitted fields keep their
 * current values, or their defaults on create. A change takes effect on the next refresh.
 */
@JsonPropertyOrder({
  ExperimentsBanditBayesianPriorInputV2.JSON_PROPERTY_ARM_STANDARD_DEVIATION,
  ExperimentsBanditBayesianPriorInputV2.JSON_PROPERTY_GRAND_MEAN,
  ExperimentsBanditBayesianPriorInputV2.JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditBayesianPriorInputV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARM_STANDARD_DEVIATION = "arm_standard_deviation";
  private Double armStandardDeviation;

  public static final String JSON_PROPERTY_GRAND_MEAN = "grand_mean";
  private Double grandMean;

  public static final String JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION =
      "grand_mean_standard_deviation";
  private Double grandMeanStandardDeviation;

  public ExperimentsBanditBayesianPriorInputV2 armStandardDeviation(Double armStandardDeviation) {
    this.armStandardDeviation = armStandardDeviation;
    return this;
  }

  /**
   * Prior standard deviation of each arm's mean around the shared mean. Must be between 1e-12 and
   * 1e12. Defaults to 100.
   *
   * @return armStandardDeviation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARM_STANDARD_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getArmStandardDeviation() {
    return armStandardDeviation;
  }

  public void setArmStandardDeviation(Double armStandardDeviation) {
    this.armStandardDeviation = armStandardDeviation;
  }

  public ExperimentsBanditBayesianPriorInputV2 grandMean(Double grandMean) {
    this.grandMean = grandMean;
    return this;
  }

  /**
   * Prior mean of the shared mean of the arms. Its absolute value must be at most 1e12 times <code>
   * grand_mean_standard_deviation</code>. Defaults to 0.
   *
   * @return grandMean
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAND_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGrandMean() {
    return grandMean;
  }

  public void setGrandMean(Double grandMean) {
    this.grandMean = grandMean;
  }

  public ExperimentsBanditBayesianPriorInputV2 grandMeanStandardDeviation(
      Double grandMeanStandardDeviation) {
    this.grandMeanStandardDeviation = grandMeanStandardDeviation;
    return this;
  }

  /**
   * Prior standard deviation of the shared mean of the arms. Must be between 1e-12 and 1e12, and at
   * most 1e7 times <code>arm_standard_deviation</code>. Defaults to 10000.
   *
   * @return grandMeanStandardDeviation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAND_MEAN_STANDARD_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return ExperimentsBanditBayesianPriorInputV2
   */
  @JsonAnySetter
  public ExperimentsBanditBayesianPriorInputV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditBayesianPriorInputV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditBayesianPriorInputV2 experimentsBanditBayesianPriorInputV2 =
        (ExperimentsBanditBayesianPriorInputV2) o;
    return Objects.equals(
            this.armStandardDeviation, experimentsBanditBayesianPriorInputV2.armStandardDeviation)
        && Objects.equals(this.grandMean, experimentsBanditBayesianPriorInputV2.grandMean)
        && Objects.equals(
            this.grandMeanStandardDeviation,
            experimentsBanditBayesianPriorInputV2.grandMeanStandardDeviation)
        && Objects.equals(
            this.additionalProperties, experimentsBanditBayesianPriorInputV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        armStandardDeviation, grandMean, grandMeanStandardDeviation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditBayesianPriorInputV2 {\n");
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
