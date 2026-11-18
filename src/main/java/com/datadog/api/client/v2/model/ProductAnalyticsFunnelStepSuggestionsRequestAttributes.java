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

/** Attributes of a step suggestions request. */
@JsonPropertyOrder({
  ProductAnalyticsFunnelStepSuggestionsRequestAttributes.JSON_PROPERTY_APPLICATION_ID,
  ProductAnalyticsFunnelStepSuggestionsRequestAttributes.JSON_PROPERTY_EXPRESSION,
  ProductAnalyticsFunnelStepSuggestionsRequestAttributes.JSON_PROPERTY_STEPS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsFunnelStepSuggestionsRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "application_id";
  private String applicationId;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private Map<String, String> steps = new HashMap<String, String>();

  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression,
      @JsonProperty(required = true, value = JSON_PROPERTY_STEPS) Map<String, String> steps) {
    this.expression = expression;
    this.steps = steps;
  }

  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes applicationId(
      String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Only use journeys from this RUM application.
   *
   * @return applicationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Order of the funnel steps, as step IDs joined by <code>-&gt;</code>.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes steps(Map<String, String> steps) {
    this.steps = steps;
    return this;
  }

  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes putStepsItem(
      String key, String stepsItem) {
    this.steps.put(key, stepsItem);
    return this;
  }

  /**
   * Map of step ID to the event query of the step. Steps are matched in the string sort order of
   * their IDs, so use zero-padded IDs such as <code>node_01</code> and <code>node_02</code>.
   * Without padding, <code>node_10</code> sorts before <code>node_2</code>.
   *
   * @return steps
   */
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, String> getSteps() {
    return steps;
  }

  public void setSteps(Map<String, String> steps) {
    this.steps = steps;
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
   * @return ProductAnalyticsFunnelStepSuggestionsRequestAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsFunnelStepSuggestionsRequestAttributes putAdditionalProperty(
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
   * Return true if this ProductAnalyticsFunnelStepSuggestionsRequestAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsFunnelStepSuggestionsRequestAttributes
        productAnalyticsFunnelStepSuggestionsRequestAttributes =
            (ProductAnalyticsFunnelStepSuggestionsRequestAttributes) o;
    return Objects.equals(
            this.applicationId,
            productAnalyticsFunnelStepSuggestionsRequestAttributes.applicationId)
        && Objects.equals(
            this.expression, productAnalyticsFunnelStepSuggestionsRequestAttributes.expression)
        && Objects.equals(this.steps, productAnalyticsFunnelStepSuggestionsRequestAttributes.steps)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsFunnelStepSuggestionsRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, expression, steps, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsFunnelStepSuggestionsRequestAttributes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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
