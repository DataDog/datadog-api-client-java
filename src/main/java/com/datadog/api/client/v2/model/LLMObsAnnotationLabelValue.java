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

/**
 * A single label value entry in an annotation. The <code>value</code> type must match the label
 * schema type: - <code>score</code>: a number within the schema <code>min</code>/<code>max</code>
 * range (integer if <code>is_integer</code> is <code>true</code>). - <code>categorical</code>: a
 * string that is one of the schema <code>values</code>. - <code>boolean</code>: <code>true</code>
 * or <code>false</code>. - <code>text</code>: any non-empty string.
 */
@JsonPropertyOrder({
  LLMObsAnnotationLabelValue.JSON_PROPERTY_ASSESSMENT,
  LLMObsAnnotationLabelValue.JSON_PROPERTY_LABEL_SCHEMA_ID,
  LLMObsAnnotationLabelValue.JSON_PROPERTY_REASONING,
  LLMObsAnnotationLabelValue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationLabelValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
  private LLMObsAnnotationAssessment assessment;

  public static final String JSON_PROPERTY_LABEL_SCHEMA_ID = "label_schema_id";
  private String labelSchemaId;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private String reasoning;

  public static final String JSON_PROPERTY_VALUE = "value";
  private LLMObsAnnotationLabelValueValue value;

  public LLMObsAnnotationLabelValue() {}

  @JsonCreator
  public LLMObsAnnotationLabelValue(
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL_SCHEMA_ID) String labelSchemaId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          LLMObsAnnotationLabelValueValue value) {
    this.labelSchemaId = labelSchemaId;
    this.value = value;
    this.unparsed |= value.unparsed;
  }

  public LLMObsAnnotationLabelValue assessment(LLMObsAnnotationAssessment assessment) {
    this.assessment = assessment;
    this.unparsed |= !assessment.isValid();
    return this;
  }

  /**
   * Assessment result for a label value.
   *
   * @return assessment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsAnnotationAssessment getAssessment() {
    return assessment;
  }

  public void setAssessment(LLMObsAnnotationAssessment assessment) {
    if (!assessment.isValid()) {
      this.unparsed = true;
    }
    this.assessment = assessment;
  }

  public LLMObsAnnotationLabelValue labelSchemaId(String labelSchemaId) {
    this.labelSchemaId = labelSchemaId;
    return this;
  }

  /**
   * ID of the label schema this value corresponds to.
   *
   * @return labelSchemaId
   */
  @JsonProperty(JSON_PROPERTY_LABEL_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLabelSchemaId() {
    return labelSchemaId;
  }

  public void setLabelSchemaId(String labelSchemaId) {
    this.labelSchemaId = labelSchemaId;
  }

  public LLMObsAnnotationLabelValue reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Free text reasoning for this label value.
   *
   * @return reasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  public LLMObsAnnotationLabelValue value(LLMObsAnnotationLabelValueValue value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * The value for this label. Must comply with the label schema type constraints.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsAnnotationLabelValueValue getValue() {
    return value;
  }

  public void setValue(LLMObsAnnotationLabelValueValue value) {
    this.value = value;
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
   * @return LLMObsAnnotationLabelValue
   */
  @JsonAnySetter
  public LLMObsAnnotationLabelValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnnotationLabelValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationLabelValue llmObsAnnotationLabelValue = (LLMObsAnnotationLabelValue) o;
    return Objects.equals(this.assessment, llmObsAnnotationLabelValue.assessment)
        && Objects.equals(this.labelSchemaId, llmObsAnnotationLabelValue.labelSchemaId)
        && Objects.equals(this.reasoning, llmObsAnnotationLabelValue.reasoning)
        && Objects.equals(this.value, llmObsAnnotationLabelValue.value)
        && Objects.equals(
            this.additionalProperties, llmObsAnnotationLabelValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessment, labelSchemaId, reasoning, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationLabelValue {\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    labelSchemaId: ").append(toIndentedString(labelSchemaId)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
