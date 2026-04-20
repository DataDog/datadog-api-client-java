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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a custom LLM Observability evaluator configuration. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_CATEGORY,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_CREATED_AT,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_CREATED_BY,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_EVAL_NAME,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_LAST_UPDATED_BY,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_LLM_JUDGE_CONFIG,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_LLM_PROVIDER,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_TARGET,
  LLMObsCustomEvalConfigAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private LLMObsCustomEvalConfigUser createdBy;

  public static final String JSON_PROPERTY_EVAL_NAME = "eval_name";
  private String evalName;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "last_updated_by";
  private LLMObsCustomEvalConfigUser lastUpdatedBy;

  public static final String JSON_PROPERTY_LLM_JUDGE_CONFIG = "llm_judge_config";
  private LLMObsCustomEvalConfigLLMJudgeConfig llmJudgeConfig;

  public static final String JSON_PROPERTY_LLM_PROVIDER = "llm_provider";
  private LLMObsCustomEvalConfigLLMProvider llmProvider;

  public static final String JSON_PROPERTY_TARGET = "target";
  private LLMObsCustomEvalConfigTarget target;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public LLMObsCustomEvalConfigAttributes() {}

  @JsonCreator
  public LLMObsCustomEvalConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVAL_NAME) String evalName,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.evalName = evalName;
    this.updatedAt = updatedAt;
  }

  public LLMObsCustomEvalConfigAttributes category(String category) {
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

  public LLMObsCustomEvalConfigAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the evaluator configuration was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LLMObsCustomEvalConfigAttributes createdBy(LLMObsCustomEvalConfigUser createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * A Datadog user associated with a custom evaluator configuration.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(LLMObsCustomEvalConfigUser createdBy) {
    this.createdBy = createdBy;
  }

  public LLMObsCustomEvalConfigAttributes evalName(String evalName) {
    this.evalName = evalName;
    return this;
  }

  /**
   * Name of the custom evaluator.
   *
   * @return evalName
   */
  @JsonProperty(JSON_PROPERTY_EVAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEvalName() {
    return evalName;
  }

  public void setEvalName(String evalName) {
    this.evalName = evalName;
  }

  public LLMObsCustomEvalConfigAttributes lastUpdatedBy(LLMObsCustomEvalConfigUser lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    this.unparsed |= lastUpdatedBy.unparsed;
    return this;
  }

  /**
   * A Datadog user associated with a custom evaluator configuration.
   *
   * @return lastUpdatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigUser getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(LLMObsCustomEvalConfigUser lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public LLMObsCustomEvalConfigAttributes llmJudgeConfig(
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

  public LLMObsCustomEvalConfigAttributes llmProvider(
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

  public LLMObsCustomEvalConfigAttributes target(LLMObsCustomEvalConfigTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Target application configuration for a custom evaluator.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigTarget getTarget() {
    return target;
  }

  public void setTarget(LLMObsCustomEvalConfigTarget target) {
    this.target = target;
  }

  public LLMObsCustomEvalConfigAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the evaluator configuration was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return LLMObsCustomEvalConfigAttributes
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigAttributes llmObsCustomEvalConfigAttributes =
        (LLMObsCustomEvalConfigAttributes) o;
    return Objects.equals(this.category, llmObsCustomEvalConfigAttributes.category)
        && Objects.equals(this.createdAt, llmObsCustomEvalConfigAttributes.createdAt)
        && Objects.equals(this.createdBy, llmObsCustomEvalConfigAttributes.createdBy)
        && Objects.equals(this.evalName, llmObsCustomEvalConfigAttributes.evalName)
        && Objects.equals(this.lastUpdatedBy, llmObsCustomEvalConfigAttributes.lastUpdatedBy)
        && Objects.equals(this.llmJudgeConfig, llmObsCustomEvalConfigAttributes.llmJudgeConfig)
        && Objects.equals(this.llmProvider, llmObsCustomEvalConfigAttributes.llmProvider)
        && Objects.equals(this.target, llmObsCustomEvalConfigAttributes.target)
        && Objects.equals(this.updatedAt, llmObsCustomEvalConfigAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        createdAt,
        createdBy,
        evalName,
        lastUpdatedBy,
        llmJudgeConfig,
        llmProvider,
        target,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    evalName: ").append(toIndentedString(evalName)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    llmJudgeConfig: ").append(toIndentedString(llmJudgeConfig)).append("\n");
    sb.append("    llmProvider: ").append(toIndentedString(llmProvider)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
