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
 * Sankey visualization definition. Set either <code>source</code> or <code>target</code>, not both.
 * Use <code>source</code> for forward flow (where do users go after this page?) or <code>target
 * </code> for backward flow (where did users come from?).
 */
@JsonPropertyOrder({
  ProductAnalyticsSankeyDefinition.JSON_PROPERTY_ENTRIES_PER_STEP,
  ProductAnalyticsSankeyDefinition.JSON_PROPERTY_NUMBER_OF_STEPS,
  ProductAnalyticsSankeyDefinition.JSON_PROPERTY_SOURCE,
  ProductAnalyticsSankeyDefinition.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTRIES_PER_STEP = "entries_per_step";
  private Long entriesPerStep = 5l;

  public static final String JSON_PROPERTY_NUMBER_OF_STEPS = "number_of_steps";
  private Long numberOfSteps = 5l;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public ProductAnalyticsSankeyDefinition entriesPerStep(Long entriesPerStep) {
    this.entriesPerStep = entriesPerStep;
    return this;
  }

  /**
   * Number of page entries per step. Default 5, max 10. maximum: 10
   *
   * @return entriesPerStep
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES_PER_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEntriesPerStep() {
    return entriesPerStep;
  }

  public void setEntriesPerStep(Long entriesPerStep) {
    this.entriesPerStep = entriesPerStep;
  }

  public ProductAnalyticsSankeyDefinition numberOfSteps(Long numberOfSteps) {
    this.numberOfSteps = numberOfSteps;
    return this;
  }

  /**
   * Number of steps in the flow. Default 5, max 10. maximum: 10
   *
   * @return numberOfSteps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumberOfSteps() {
    return numberOfSteps;
  }

  public void setNumberOfSteps(Long numberOfSteps) {
    this.numberOfSteps = numberOfSteps;
  }

  public ProductAnalyticsSankeyDefinition source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source page for forward flow analysis. Use "*" for all pages.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ProductAnalyticsSankeyDefinition target(String target) {
    this.target = target;
    return this;
  }

  /**
   * The target page for backward flow analysis.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
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
   * @return ProductAnalyticsSankeyDefinition
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsSankeyDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyDefinition productAnalyticsSankeyDefinition =
        (ProductAnalyticsSankeyDefinition) o;
    return Objects.equals(this.entriesPerStep, productAnalyticsSankeyDefinition.entriesPerStep)
        && Objects.equals(this.numberOfSteps, productAnalyticsSankeyDefinition.numberOfSteps)
        && Objects.equals(this.source, productAnalyticsSankeyDefinition.source)
        && Objects.equals(this.target, productAnalyticsSankeyDefinition.target)
        && Objects.equals(
            this.additionalProperties, productAnalyticsSankeyDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entriesPerStep, numberOfSteps, source, target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyDefinition {\n");
    sb.append("    entriesPerStep: ").append(toIndentedString(entriesPerStep)).append("\n");
    sb.append("    numberOfSteps: ").append(toIndentedString(numberOfSteps)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
