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

/** Attributes for creating or updating a custom LLM Observability evaluator configuration. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigUpdateAttributes.JSON_PROPERTY_CATEGORY,
  LLMObsCustomEvalConfigUpdateAttributes.JSON_PROPERTY_EVAL_NAME,
  LLMObsCustomEvalConfigUpdateAttributes.JSON_PROPERTY_LLM_JUDGE_CONFIG,
  LLMObsCustomEvalConfigUpdateAttributes.JSON_PROPERTY_LLM_PROVIDER,
  LLMObsCustomEvalConfigUpdateAttributes.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigUpdateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_EVAL_NAME = "eval_name";
  private String evalName;

  public static final String JSON_PROPERTY_LLM_JUDGE_CONFIG = "llm_judge_config";
  private LLMObsCustomEvalConfigLLMJudgeConfig llmJudgeConfig;

  public static final String JSON_PROPERTY_LLM_PROVIDER = "llm_provider";
  private LLMObsCustomEvalConfigLLMProvider llmProvider;

  public static final String JSON_PROPERTY_TARGET = "target";
  private LLMObsCustomEvalConfigTarget target;

  public LLMObsCustomEvalConfigUpdateAttributes() {}

  @JsonCreator
  public LLMObsCustomEvalConfigUpdateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET)
          LLMObsCustomEvalConfigTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
  }

  public LLMObsCustomEvalConfigUpdateAttributes category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the evaluator.
   *
   * @return category
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public LLMObsCustomEvalConfigUpdateAttributes evalName(String evalName) {
    this.evalName = evalName;
    return this;
  }

  /**
   * Name of the custom evaluator. If provided, must match the eval_name path parameter.
   *
   * @return evalName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEvalName() {
    return evalName;
  }

  public void setEvalName(String evalName) {
    this.evalName = evalName;
  }

  public LLMObsCustomEvalConfigUpdateAttributes llmJudgeConfig(
      LLMObsCustomEvalConfigLLMJudgeConfig llmJudgeConfig) {
    this.llmJudgeConfig = llmJudgeConfig;
    this.unparsed |= llmJudgeConfig.unparsed;
    return this;
  }

  /**
   * LLM judge configuration for a custom evaluator.
   *
   * @return llmJudgeConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_JUDGE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigLLMJudgeConfig getLlmJudgeConfig() {
    return llmJudgeConfig;
  }

  public void setLlmJudgeConfig(LLMObsCustomEvalConfigLLMJudgeConfig llmJudgeConfig) {
    this.llmJudgeConfig = llmJudgeConfig;
  }

  public LLMObsCustomEvalConfigUpdateAttributes llmProvider(
      LLMObsCustomEvalConfigLLMProvider llmProvider) {
    this.llmProvider = llmProvider;
    this.unparsed |= llmProvider.unparsed;
    return this;
  }

  /**
   * LLM provider configuration for a custom evaluator.
   *
   * @return llmProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LLM_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigLLMProvider getLlmProvider() {
    return llmProvider;
  }

  public void setLlmProvider(LLMObsCustomEvalConfigLLMProvider llmProvider) {
    this.llmProvider = llmProvider;
  }

  public LLMObsCustomEvalConfigUpdateAttributes target(LLMObsCustomEvalConfigTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Target application configuration for a custom evaluator.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsCustomEvalConfigTarget getTarget() {
    return target;
  }

  public void setTarget(LLMObsCustomEvalConfigTarget target) {
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
   * @return LLMObsCustomEvalConfigUpdateAttributes
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigUpdateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigUpdateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigUpdateAttributes llmObsCustomEvalConfigUpdateAttributes =
        (LLMObsCustomEvalConfigUpdateAttributes) o;
    return Objects.equals(this.category, llmObsCustomEvalConfigUpdateAttributes.category)
        && Objects.equals(this.evalName, llmObsCustomEvalConfigUpdateAttributes.evalName)
        && Objects.equals(
            this.llmJudgeConfig, llmObsCustomEvalConfigUpdateAttributes.llmJudgeConfig)
        && Objects.equals(this.llmProvider, llmObsCustomEvalConfigUpdateAttributes.llmProvider)
        && Objects.equals(this.target, llmObsCustomEvalConfigUpdateAttributes.target)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigUpdateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category, evalName, llmJudgeConfig, llmProvider, target, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigUpdateAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    evalName: ").append(toIndentedString(evalName)).append("\n");
    sb.append("    llmJudgeConfig: ").append(toIndentedString(llmJudgeConfig)).append("\n");
    sb.append("    llmProvider: ").append(toIndentedString(llmProvider)).append("\n");
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
