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

/** A sequence of events that users follow to use a feature. */
@JsonPropertyOrder({
  ProductAnalyticsCoreUserJourney.JSON_PROPERTY_EXPRESSION,
  ProductAnalyticsCoreUserJourney.JSON_PROPERTY_SCORE,
  ProductAnalyticsCoreUserJourney.JSON_PROPERTY_STEPS,
  ProductAnalyticsCoreUserJourney.JSON_PROPERTY_SUPPORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsCoreUserJourney {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_SCORE = "score";
  private Long score;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private Map<String, String> steps = null;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  private Long support;

  public ProductAnalyticsCoreUserJourney expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Order of the steps, as step IDs joined by <code>-&gt;</code>.
   *
   * @return expression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public ProductAnalyticsCoreUserJourney score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * Relevance score of the journey. Higher is more relevant.
   *
   * @return score
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public ProductAnalyticsCoreUserJourney steps(Map<String, String> steps) {
    this.steps = steps;
    return this;
  }

  public ProductAnalyticsCoreUserJourney putStepsItem(String key, String stepsItem) {
    if (this.steps == null) {
      this.steps = new HashMap<>();
    }
    this.steps.put(key, stepsItem);
    return this;
  }

  /**
   * Map of step ID to the event query of the step.
   *
   * @return steps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getSteps() {
    return steps;
  }

  public void setSteps(Map<String, String> steps) {
    this.steps = steps;
  }

  public ProductAnalyticsCoreUserJourney support(Long support) {
    this.support = support;
    return this;
  }

  /**
   * Number of sessions that followed the journey.
   *
   * @return support
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSupport() {
    return support;
  }

  public void setSupport(Long support) {
    this.support = support;
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
   * @return ProductAnalyticsCoreUserJourney
   */
  @JsonAnySetter
  public ProductAnalyticsCoreUserJourney putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsCoreUserJourney object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsCoreUserJourney productAnalyticsCoreUserJourney =
        (ProductAnalyticsCoreUserJourney) o;
    return Objects.equals(this.expression, productAnalyticsCoreUserJourney.expression)
        && Objects.equals(this.score, productAnalyticsCoreUserJourney.score)
        && Objects.equals(this.steps, productAnalyticsCoreUserJourney.steps)
        && Objects.equals(this.support, productAnalyticsCoreUserJourney.support)
        && Objects.equals(
            this.additionalProperties, productAnalyticsCoreUserJourney.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, score, steps, support, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsCoreUserJourney {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
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
