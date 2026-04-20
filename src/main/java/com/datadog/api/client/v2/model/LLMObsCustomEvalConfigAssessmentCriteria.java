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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Criteria used to assess the pass/fail result of a custom evaluator. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigAssessmentCriteria.JSON_PROPERTY_MAX_THRESHOLD,
  LLMObsCustomEvalConfigAssessmentCriteria.JSON_PROPERTY_MIN_THRESHOLD,
  LLMObsCustomEvalConfigAssessmentCriteria.JSON_PROPERTY_PASS_VALUES,
  LLMObsCustomEvalConfigAssessmentCriteria.JSON_PROPERTY_PASS_WHEN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigAssessmentCriteria {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MAX_THRESHOLD = "max_threshold";
  private JsonNullable<Double> maxThreshold = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MIN_THRESHOLD = "min_threshold";
  private JsonNullable<Double> minThreshold = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PASS_VALUES = "pass_values";
  private JsonNullable<List<String>> passValues = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_PASS_WHEN = "pass_when";
  private JsonNullable<Boolean> passWhen = JsonNullable.<Boolean>undefined();

  public LLMObsCustomEvalConfigAssessmentCriteria maxThreshold(Double maxThreshold) {
    this.maxThreshold = JsonNullable.<Double>of(maxThreshold);
    return this;
  }

  /**
   * Maximum numeric threshold for a passing result.
   *
   * @return maxThreshold
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getMaxThreshold() {
    return maxThreshold.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAX_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMaxThreshold_JsonNullable() {
    return maxThreshold;
  }

  @JsonProperty(JSON_PROPERTY_MAX_THRESHOLD)
  public void setMaxThreshold_JsonNullable(JsonNullable<Double> maxThreshold) {
    this.maxThreshold = maxThreshold;
  }

  public void setMaxThreshold(Double maxThreshold) {
    this.maxThreshold = JsonNullable.<Double>of(maxThreshold);
  }

  public LLMObsCustomEvalConfigAssessmentCriteria minThreshold(Double minThreshold) {
    this.minThreshold = JsonNullable.<Double>of(minThreshold);
    return this;
  }

  /**
   * Minimum numeric threshold for a passing result.
   *
   * @return minThreshold
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getMinThreshold() {
    return minThreshold.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getMinThreshold_JsonNullable() {
    return minThreshold;
  }

  @JsonProperty(JSON_PROPERTY_MIN_THRESHOLD)
  public void setMinThreshold_JsonNullable(JsonNullable<Double> minThreshold) {
    this.minThreshold = minThreshold;
  }

  public void setMinThreshold(Double minThreshold) {
    this.minThreshold = JsonNullable.<Double>of(minThreshold);
  }

  public LLMObsCustomEvalConfigAssessmentCriteria passValues(List<String> passValues) {
    this.passValues = JsonNullable.<List<String>>of(passValues);
    return this;
  }

  public LLMObsCustomEvalConfigAssessmentCriteria addPassValuesItem(String passValuesItem) {
    if (this.passValues == null || !this.passValues.isPresent()) {
      this.passValues = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.passValues.get().add(passValuesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Specific output values considered as a passing result.
   *
   * @return passValues
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getPassValues() {
    return passValues.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASS_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getPassValues_JsonNullable() {
    return passValues;
  }

  @JsonProperty(JSON_PROPERTY_PASS_VALUES)
  public void setPassValues_JsonNullable(JsonNullable<List<String>> passValues) {
    this.passValues = passValues;
  }

  public void setPassValues(List<String> passValues) {
    this.passValues = JsonNullable.<List<String>>of(passValues);
  }

  public LLMObsCustomEvalConfigAssessmentCriteria passWhen(Boolean passWhen) {
    this.passWhen = JsonNullable.<Boolean>of(passWhen);
    return this;
  }

  /**
   * When true, a boolean output of true is treated as passing.
   *
   * @return passWhen
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getPassWhen() {
    return passWhen.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASS_WHEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getPassWhen_JsonNullable() {
    return passWhen;
  }

  @JsonProperty(JSON_PROPERTY_PASS_WHEN)
  public void setPassWhen_JsonNullable(JsonNullable<Boolean> passWhen) {
    this.passWhen = passWhen;
  }

  public void setPassWhen(Boolean passWhen) {
    this.passWhen = JsonNullable.<Boolean>of(passWhen);
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
   * @return LLMObsCustomEvalConfigAssessmentCriteria
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigAssessmentCriteria putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigAssessmentCriteria object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigAssessmentCriteria llmObsCustomEvalConfigAssessmentCriteria =
        (LLMObsCustomEvalConfigAssessmentCriteria) o;
    return Objects.equals(this.maxThreshold, llmObsCustomEvalConfigAssessmentCriteria.maxThreshold)
        && Objects.equals(this.minThreshold, llmObsCustomEvalConfigAssessmentCriteria.minThreshold)
        && Objects.equals(this.passValues, llmObsCustomEvalConfigAssessmentCriteria.passValues)
        && Objects.equals(this.passWhen, llmObsCustomEvalConfigAssessmentCriteria.passWhen)
        && Objects.equals(
            this.additionalProperties,
            llmObsCustomEvalConfigAssessmentCriteria.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxThreshold, minThreshold, passValues, passWhen, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigAssessmentCriteria {\n");
    sb.append("    maxThreshold: ").append(toIndentedString(maxThreshold)).append("\n");
    sb.append("    minThreshold: ").append(toIndentedString(minThreshold)).append("\n");
    sb.append("    passValues: ").append(toIndentedString(passValues)).append("\n");
    sb.append("    passWhen: ").append(toIndentedString(passWhen)).append("\n");
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
