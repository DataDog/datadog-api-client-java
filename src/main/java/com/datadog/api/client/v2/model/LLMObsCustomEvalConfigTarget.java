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

/** Target application configuration for a custom evaluator. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigTarget.JSON_PROPERTY_APPLICATION_NAME,
  LLMObsCustomEvalConfigTarget.JSON_PROPERTY_ENABLED,
  LLMObsCustomEvalConfigTarget.JSON_PROPERTY_EVAL_SCOPE,
  LLMObsCustomEvalConfigTarget.JSON_PROPERTY_FILTER,
  LLMObsCustomEvalConfigTarget.JSON_PROPERTY_ROOT_SPANS_ONLY,
  LLMObsCustomEvalConfigTarget.JSON_PROPERTY_SAMPLING_PERCENTAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigTarget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_NAME = "application_name";
  private String applicationName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EVAL_SCOPE = "eval_scope";
  private LLMObsCustomEvalConfigEvalScope evalScope;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private JsonNullable<String> filter = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ROOT_SPANS_ONLY = "root_spans_only";
  private JsonNullable<Boolean> rootSpansOnly = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SAMPLING_PERCENTAGE = "sampling_percentage";
  private JsonNullable<Double> samplingPercentage = JsonNullable.<Double>undefined();

  public LLMObsCustomEvalConfigTarget() {}

  @JsonCreator
  public LLMObsCustomEvalConfigTarget(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_NAME) String applicationName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled) {
    this.applicationName = applicationName;
    this.enabled = enabled;
  }

  public LLMObsCustomEvalConfigTarget applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Name of the ML application this evaluator targets.
   *
   * @return applicationName
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public LLMObsCustomEvalConfigTarget enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the evaluator is active for the target application.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public LLMObsCustomEvalConfigTarget evalScope(LLMObsCustomEvalConfigEvalScope evalScope) {
    this.evalScope = evalScope;
    this.unparsed |= !evalScope.isValid();
    return this;
  }

  /**
   * Scope at which to evaluate spans.
   *
   * @return evalScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVAL_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigEvalScope getEvalScope() {
    return evalScope;
  }

  public void setEvalScope(LLMObsCustomEvalConfigEvalScope evalScope) {
    if (!evalScope.isValid()) {
      this.unparsed = true;
    }
    this.evalScope = evalScope;
  }

  public LLMObsCustomEvalConfigTarget filter(String filter) {
    this.filter = JsonNullable.<String>of(filter);
    return this;
  }

  /**
   * Filter expression to select which spans to evaluate.
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getFilter() {
    return filter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getFilter_JsonNullable() {
    return filter;
  }

  @JsonProperty(JSON_PROPERTY_FILTER)
  public void setFilter_JsonNullable(JsonNullable<String> filter) {
    this.filter = filter;
  }

  public void setFilter(String filter) {
    this.filter = JsonNullable.<String>of(filter);
  }

  public LLMObsCustomEvalConfigTarget rootSpansOnly(Boolean rootSpansOnly) {
    this.rootSpansOnly = JsonNullable.<Boolean>of(rootSpansOnly);
    return this;
  }

  /**
   * When true, only root spans are evaluated.
   *
   * @return rootSpansOnly
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getRootSpansOnly() {
    return rootSpansOnly.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ROOT_SPANS_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getRootSpansOnly_JsonNullable() {
    return rootSpansOnly;
  }

  @JsonProperty(JSON_PROPERTY_ROOT_SPANS_ONLY)
  public void setRootSpansOnly_JsonNullable(JsonNullable<Boolean> rootSpansOnly) {
    this.rootSpansOnly = rootSpansOnly;
  }

  public void setRootSpansOnly(Boolean rootSpansOnly) {
    this.rootSpansOnly = JsonNullable.<Boolean>of(rootSpansOnly);
  }

  public LLMObsCustomEvalConfigTarget samplingPercentage(Double samplingPercentage) {
    this.samplingPercentage = JsonNullable.<Double>of(samplingPercentage);
    return this;
  }

  /**
   * Percentage of traces to evaluate. Must be greater than 0 and at most 100.
   *
   * @return samplingPercentage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getSamplingPercentage() {
    return samplingPercentage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SAMPLING_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getSamplingPercentage_JsonNullable() {
    return samplingPercentage;
  }

  @JsonProperty(JSON_PROPERTY_SAMPLING_PERCENTAGE)
  public void setSamplingPercentage_JsonNullable(JsonNullable<Double> samplingPercentage) {
    this.samplingPercentage = samplingPercentage;
  }

  public void setSamplingPercentage(Double samplingPercentage) {
    this.samplingPercentage = JsonNullable.<Double>of(samplingPercentage);
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
   * @return LLMObsCustomEvalConfigTarget
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigTarget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigTarget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigTarget llmObsCustomEvalConfigTarget = (LLMObsCustomEvalConfigTarget) o;
    return Objects.equals(this.applicationName, llmObsCustomEvalConfigTarget.applicationName)
        && Objects.equals(this.enabled, llmObsCustomEvalConfigTarget.enabled)
        && Objects.equals(this.evalScope, llmObsCustomEvalConfigTarget.evalScope)
        && Objects.equals(this.filter, llmObsCustomEvalConfigTarget.filter)
        && Objects.equals(this.rootSpansOnly, llmObsCustomEvalConfigTarget.rootSpansOnly)
        && Objects.equals(this.samplingPercentage, llmObsCustomEvalConfigTarget.samplingPercentage)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigTarget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applicationName,
        enabled,
        evalScope,
        filter,
        rootSpansOnly,
        samplingPercentage,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigTarget {\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    evalScope: ").append(toIndentedString(evalScope)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    rootSpansOnly: ").append(toIndentedString(rootSpansOnly)).append("\n");
    sb.append("    samplingPercentage: ").append(toIndentedString(samplingPercentage)).append("\n");
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
