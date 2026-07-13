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
 * A single label value entry in an annotation response. In addition to the submitted fields, the
 * server populates <code>type</code> and <code>name_when_saved</code> to mirror the schema state at
 * the time the annotation was created — these help clients display values correctly when the schema
 * has since changed.
 */
@JsonPropertyOrder({
  LLMObsAnnotationLabelValueResponse.JSON_PROPERTY_ASSESSMENT,
  LLMObsAnnotationLabelValueResponse.JSON_PROPERTY_LABEL_SCHEMA_ID,
  LLMObsAnnotationLabelValueResponse.JSON_PROPERTY_NAME_WHEN_SAVED,
  LLMObsAnnotationLabelValueResponse.JSON_PROPERTY_REASONING,
  LLMObsAnnotationLabelValueResponse.JSON_PROPERTY_TYPE,
  LLMObsAnnotationLabelValueResponse.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationLabelValueResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
  private LLMObsAnnotationAssessment assessment;

  public static final String JSON_PROPERTY_LABEL_SCHEMA_ID = "label_schema_id";
  private String labelSchemaId;

  public static final String JSON_PROPERTY_NAME_WHEN_SAVED = "name_when_saved";
  private String nameWhenSaved;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private String reasoning;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsLabelSchemaType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private LLMObsAnnotationLabelValueValue value;

  public LLMObsAnnotationLabelValueResponse() {}

  @JsonCreator
  public LLMObsAnnotationLabelValueResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL_SCHEMA_ID) String labelSchemaId,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          LLMObsAnnotationLabelValueValue value) {
    this.labelSchemaId = labelSchemaId;
    this.value = value;
    this.unparsed |= value.unparsed;
  }

  public LLMObsAnnotationLabelValueResponse assessment(LLMObsAnnotationAssessment assessment) {
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

  public LLMObsAnnotationLabelValueResponse labelSchemaId(String labelSchemaId) {
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

  public LLMObsAnnotationLabelValueResponse nameWhenSaved(String nameWhenSaved) {
    this.nameWhenSaved = nameWhenSaved;
    return this;
  }

  /**
   * Name of the label schema at the time the annotation was created.
   *
   * @return nameWhenSaved
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME_WHEN_SAVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNameWhenSaved() {
    return nameWhenSaved;
  }

  public void setNameWhenSaved(String nameWhenSaved) {
    this.nameWhenSaved = nameWhenSaved;
  }

  public LLMObsAnnotationLabelValueResponse reasoning(String reasoning) {
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

  public LLMObsAnnotationLabelValueResponse type(LLMObsLabelSchemaType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of a label in an annotation queue label schema.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsLabelSchemaType getType() {
    return type;
  }

  public void setType(LLMObsLabelSchemaType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public LLMObsAnnotationLabelValueResponse value(LLMObsAnnotationLabelValueValue value) {
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
    if (value != null) {
      this.unparsed |= value.unparsed;
    }
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
   * @return LLMObsAnnotationLabelValueResponse
   */
  @JsonAnySetter
  public LLMObsAnnotationLabelValueResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnnotationLabelValueResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationLabelValueResponse llmObsAnnotationLabelValueResponse =
        (LLMObsAnnotationLabelValueResponse) o;
    return Objects.equals(this.assessment, llmObsAnnotationLabelValueResponse.assessment)
        && Objects.equals(this.labelSchemaId, llmObsAnnotationLabelValueResponse.labelSchemaId)
        && Objects.equals(this.nameWhenSaved, llmObsAnnotationLabelValueResponse.nameWhenSaved)
        && Objects.equals(this.reasoning, llmObsAnnotationLabelValueResponse.reasoning)
        && Objects.equals(this.type, llmObsAnnotationLabelValueResponse.type)
        && Objects.equals(this.value, llmObsAnnotationLabelValueResponse.value)
        && Objects.equals(
            this.additionalProperties, llmObsAnnotationLabelValueResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assessment, labelSchemaId, nameWhenSaved, reasoning, type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationLabelValueResponse {\n");
    sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
    sb.append("    labelSchemaId: ").append(toIndentedString(labelSchemaId)).append("\n");
    sb.append("    nameWhenSaved: ").append(toIndentedString(nameWhenSaved)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
