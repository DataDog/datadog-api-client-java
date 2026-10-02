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
import org.openapitools.jackson.nullable.JsonNullable;

/** Parameters of the prior distribution to use for Bayesian analysis. */
@JsonPropertyOrder({
  ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior.JSON_PROPERTY_DEGREES_OF_FREEDOM,
  ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior.JSON_PROPERTY_STANDARD_DEVIATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEGREES_OF_FREEDOM = "degrees_of_freedom";
  private JsonNullable<Double> degreesOfFreedom = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_STANDARD_DEVIATION = "standard_deviation";
  private Double standardDeviation;

  public ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior() {}

  @JsonCreator
  public ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior(
      @JsonProperty(required = true, value = JSON_PROPERTY_STANDARD_DEVIATION)
          Double standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

  public ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior degreesOfFreedom(
      Double degreesOfFreedom) {
    this.degreesOfFreedom = JsonNullable.<Double>of(degreesOfFreedom);
    return this;
  }

  /**
   * Degrees of freedom of the prior distribution.
   *
   * @return degreesOfFreedom
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDegreesOfFreedom() {
    return degreesOfFreedom.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEGREES_OF_FREEDOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDegreesOfFreedom_JsonNullable() {
    return degreesOfFreedom;
  }

  @JsonProperty(JSON_PROPERTY_DEGREES_OF_FREEDOM)
  public void setDegreesOfFreedom_JsonNullable(JsonNullable<Double> degreesOfFreedom) {
    this.degreesOfFreedom = degreesOfFreedom;
  }

  public void setDegreesOfFreedom(Double degreesOfFreedom) {
    this.degreesOfFreedom = JsonNullable.<Double>of(degreesOfFreedom);
  }

  public ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior standardDeviation(
      Double standardDeviation) {
    this.standardDeviation = standardDeviation;
    return this;
  }

  /**
   * Standard deviation of the prior distribution.
   *
   * @return standardDeviation
   */
  @JsonProperty(JSON_PROPERTY_STANDARD_DEVIATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getStandardDeviation() {
    return standardDeviation;
  }

  public void setStandardDeviation(Double standardDeviation) {
    this.standardDeviation = standardDeviation;
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
   * @return ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior
   */
  @JsonAnySetter
  public ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior putAdditionalProperty(
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
   * Return true if this ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior object is
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
    ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior
        experimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior =
            (ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior) o;
    return Objects.equals(
            this.degreesOfFreedom,
            experimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior.degreesOfFreedom)
        && Objects.equals(
            this.standardDeviation,
            experimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior.standardDeviation)
        && Objects.equals(
            this.additionalProperties,
            experimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(degreesOfFreedom, standardDeviation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsAnalysisPlanWriteV2RequestDataAttributesBayesianPrior {\n");
    sb.append("    degreesOfFreedom: ").append(toIndentedString(degreesOfFreedom)).append("\n");
    sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
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
