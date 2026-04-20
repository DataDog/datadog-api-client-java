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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** LLM judge configuration for a custom evaluator. */
@JsonPropertyOrder({
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_ASSESSMENT_CRITERIA,
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_INFERENCE_PARAMS,
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_LAST_USED_LIBRARY_PROMPT_TEMPLATE_NAME,
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_MODIFIED_LIBRARY_PROMPT_TEMPLATE,
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_OUTPUT_SCHEMA,
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_PARSING_TYPE,
  LLMObsCustomEvalConfigLLMJudgeConfig.JSON_PROPERTY_PROMPT_TEMPLATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCustomEvalConfigLLMJudgeConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT_CRITERIA = "assessment_criteria";
  private LLMObsCustomEvalConfigAssessmentCriteria assessmentCriteria;

  public static final String JSON_PROPERTY_INFERENCE_PARAMS = "inference_params";
  private LLMObsCustomEvalConfigInferenceParams inferenceParams;

  public static final String JSON_PROPERTY_LAST_USED_LIBRARY_PROMPT_TEMPLATE_NAME =
      "last_used_library_prompt_template_name";
  private JsonNullable<String> lastUsedLibraryPromptTemplateName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODIFIED_LIBRARY_PROMPT_TEMPLATE =
      "modified_library_prompt_template";
  private JsonNullable<Boolean> modifiedLibraryPromptTemplate = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_OUTPUT_SCHEMA = "output_schema";
  private JsonNullable<Map<String, Object>> outputSchema =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_PARSING_TYPE = "parsing_type";
  private LLMObsCustomEvalConfigParsingType parsingType;

  public static final String JSON_PROPERTY_PROMPT_TEMPLATE = "prompt_template";
  private List<LLMObsCustomEvalConfigPromptMessage> promptTemplate = null;

  public LLMObsCustomEvalConfigLLMJudgeConfig() {}

  @JsonCreator
  public LLMObsCustomEvalConfigLLMJudgeConfig(
      @JsonProperty(required = true, value = JSON_PROPERTY_INFERENCE_PARAMS)
          LLMObsCustomEvalConfigInferenceParams inferenceParams) {
    this.inferenceParams = inferenceParams;
    this.unparsed |= inferenceParams.unparsed;
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig assessmentCriteria(
      LLMObsCustomEvalConfigAssessmentCriteria assessmentCriteria) {
    this.assessmentCriteria = assessmentCriteria;
    this.unparsed |= assessmentCriteria.unparsed;
    return this;
  }

  /**
   * Criteria used to assess the pass/fail result of a custom evaluator.
   *
   * @return assessmentCriteria
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigAssessmentCriteria getAssessmentCriteria() {
    return assessmentCriteria;
  }

  public void setAssessmentCriteria(LLMObsCustomEvalConfigAssessmentCriteria assessmentCriteria) {
    this.assessmentCriteria = assessmentCriteria;
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig inferenceParams(
      LLMObsCustomEvalConfigInferenceParams inferenceParams) {
    this.inferenceParams = inferenceParams;
    this.unparsed |= inferenceParams.unparsed;
    return this;
  }

  /**
   * LLM inference parameters for a custom evaluator.
   *
   * @return inferenceParams
   */
  @JsonProperty(JSON_PROPERTY_INFERENCE_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsCustomEvalConfigInferenceParams getInferenceParams() {
    return inferenceParams;
  }

  public void setInferenceParams(LLMObsCustomEvalConfigInferenceParams inferenceParams) {
    this.inferenceParams = inferenceParams;
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig lastUsedLibraryPromptTemplateName(
      String lastUsedLibraryPromptTemplateName) {
    this.lastUsedLibraryPromptTemplateName =
        JsonNullable.<String>of(lastUsedLibraryPromptTemplateName);
    return this;
  }

  /**
   * Name of the last library prompt template used.
   *
   * @return lastUsedLibraryPromptTemplateName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getLastUsedLibraryPromptTemplateName() {
    return lastUsedLibraryPromptTemplateName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_LIBRARY_PROMPT_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLastUsedLibraryPromptTemplateName_JsonNullable() {
    return lastUsedLibraryPromptTemplateName;
  }

  @JsonProperty(JSON_PROPERTY_LAST_USED_LIBRARY_PROMPT_TEMPLATE_NAME)
  public void setLastUsedLibraryPromptTemplateName_JsonNullable(
      JsonNullable<String> lastUsedLibraryPromptTemplateName) {
    this.lastUsedLibraryPromptTemplateName = lastUsedLibraryPromptTemplateName;
  }

  public void setLastUsedLibraryPromptTemplateName(String lastUsedLibraryPromptTemplateName) {
    this.lastUsedLibraryPromptTemplateName =
        JsonNullable.<String>of(lastUsedLibraryPromptTemplateName);
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig modifiedLibraryPromptTemplate(
      Boolean modifiedLibraryPromptTemplate) {
    this.modifiedLibraryPromptTemplate = JsonNullable.<Boolean>of(modifiedLibraryPromptTemplate);
    return this;
  }

  /**
   * Whether the library prompt template was modified.
   *
   * @return modifiedLibraryPromptTemplate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getModifiedLibraryPromptTemplate() {
    return modifiedLibraryPromptTemplate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_LIBRARY_PROMPT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getModifiedLibraryPromptTemplate_JsonNullable() {
    return modifiedLibraryPromptTemplate;
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_LIBRARY_PROMPT_TEMPLATE)
  public void setModifiedLibraryPromptTemplate_JsonNullable(
      JsonNullable<Boolean> modifiedLibraryPromptTemplate) {
    this.modifiedLibraryPromptTemplate = modifiedLibraryPromptTemplate;
  }

  public void setModifiedLibraryPromptTemplate(Boolean modifiedLibraryPromptTemplate) {
    this.modifiedLibraryPromptTemplate = JsonNullable.<Boolean>of(modifiedLibraryPromptTemplate);
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig outputSchema(Map<String, Object> outputSchema) {
    this.outputSchema = JsonNullable.<Map<String, Object>>of(outputSchema);
    return this;
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig putOutputSchemaItem(
      String key, Object outputSchemaItem) {
    if (this.outputSchema == null || !this.outputSchema.isPresent()) {
      this.outputSchema = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.outputSchema.get().put(key, outputSchemaItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * JSON schema describing the expected output format of the LLM judge.
   *
   * @return outputSchema
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getOutputSchema() {
    return outputSchema.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTPUT_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getOutputSchema_JsonNullable() {
    return outputSchema;
  }

  @JsonProperty(JSON_PROPERTY_OUTPUT_SCHEMA)
  public void setOutputSchema_JsonNullable(JsonNullable<Map<String, Object>> outputSchema) {
    this.outputSchema = outputSchema;
  }

  public void setOutputSchema(Map<String, Object> outputSchema) {
    this.outputSchema = JsonNullable.<Map<String, Object>>of(outputSchema);
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig parsingType(
      LLMObsCustomEvalConfigParsingType parsingType) {
    this.parsingType = parsingType;
    this.unparsed |= !parsingType.isValid();
    return this;
  }

  /**
   * Output parsing type for a custom LLM judge evaluator.
   *
   * @return parsingType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsCustomEvalConfigParsingType getParsingType() {
    return parsingType;
  }

  public void setParsingType(LLMObsCustomEvalConfigParsingType parsingType) {
    if (!parsingType.isValid()) {
      this.unparsed = true;
    }
    this.parsingType = parsingType;
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig promptTemplate(
      List<LLMObsCustomEvalConfigPromptMessage> promptTemplate) {
    this.promptTemplate = promptTemplate;
    for (LLMObsCustomEvalConfigPromptMessage item : promptTemplate) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsCustomEvalConfigLLMJudgeConfig addPromptTemplateItem(
      LLMObsCustomEvalConfigPromptMessage promptTemplateItem) {
    if (this.promptTemplate == null) {
      this.promptTemplate = new ArrayList<>();
    }
    this.promptTemplate.add(promptTemplateItem);
    this.unparsed |= promptTemplateItem.unparsed;
    return this;
  }

  /**
   * List of messages forming the LLM judge prompt template.
   *
   * @return promptTemplate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMPT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsCustomEvalConfigPromptMessage> getPromptTemplate() {
    return promptTemplate;
  }

  public void setPromptTemplate(List<LLMObsCustomEvalConfigPromptMessage> promptTemplate) {
    this.promptTemplate = promptTemplate;
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
   * @return LLMObsCustomEvalConfigLLMJudgeConfig
   */
  @JsonAnySetter
  public LLMObsCustomEvalConfigLLMJudgeConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCustomEvalConfigLLMJudgeConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCustomEvalConfigLLMJudgeConfig llmObsCustomEvalConfigLlmJudgeConfig =
        (LLMObsCustomEvalConfigLLMJudgeConfig) o;
    return Objects.equals(
            this.assessmentCriteria, llmObsCustomEvalConfigLlmJudgeConfig.assessmentCriteria)
        && Objects.equals(
            this.inferenceParams, llmObsCustomEvalConfigLlmJudgeConfig.inferenceParams)
        && Objects.equals(
            this.lastUsedLibraryPromptTemplateName,
            llmObsCustomEvalConfigLlmJudgeConfig.lastUsedLibraryPromptTemplateName)
        && Objects.equals(
            this.modifiedLibraryPromptTemplate,
            llmObsCustomEvalConfigLlmJudgeConfig.modifiedLibraryPromptTemplate)
        && Objects.equals(this.outputSchema, llmObsCustomEvalConfigLlmJudgeConfig.outputSchema)
        && Objects.equals(this.parsingType, llmObsCustomEvalConfigLlmJudgeConfig.parsingType)
        && Objects.equals(this.promptTemplate, llmObsCustomEvalConfigLlmJudgeConfig.promptTemplate)
        && Objects.equals(
            this.additionalProperties, llmObsCustomEvalConfigLlmJudgeConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assessmentCriteria,
        inferenceParams,
        lastUsedLibraryPromptTemplateName,
        modifiedLibraryPromptTemplate,
        outputSchema,
        parsingType,
        promptTemplate,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCustomEvalConfigLLMJudgeConfig {\n");
    sb.append("    assessmentCriteria: ").append(toIndentedString(assessmentCriteria)).append("\n");
    sb.append("    inferenceParams: ").append(toIndentedString(inferenceParams)).append("\n");
    sb.append("    lastUsedLibraryPromptTemplateName: ")
        .append(toIndentedString(lastUsedLibraryPromptTemplateName))
        .append("\n");
    sb.append("    modifiedLibraryPromptTemplate: ")
        .append(toIndentedString(modifiedLibraryPromptTemplate))
        .append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
    sb.append("    parsingType: ").append(toIndentedString(parsingType)).append("\n");
    sb.append("    promptTemplate: ").append(toIndentedString(promptTemplate)).append("\n");
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
