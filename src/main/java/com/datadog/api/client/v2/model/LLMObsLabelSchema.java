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

/** Schema definition for a single label in an annotation queue. */
@JsonPropertyOrder({
  LLMObsLabelSchema.JSON_PROPERTY_DESCRIPTION,
  LLMObsLabelSchema.JSON_PROPERTY_HAS_ASSESSMENT,
  LLMObsLabelSchema.JSON_PROPERTY_HAS_REASONING,
  LLMObsLabelSchema.JSON_PROPERTY_ID,
  LLMObsLabelSchema.JSON_PROPERTY_IS_ASSESSMENT,
  LLMObsLabelSchema.JSON_PROPERTY_IS_INTEGER,
  LLMObsLabelSchema.JSON_PROPERTY_IS_REQUIRED,
  LLMObsLabelSchema.JSON_PROPERTY_MAX,
  LLMObsLabelSchema.JSON_PROPERTY_MIN,
  LLMObsLabelSchema.JSON_PROPERTY_NAME,
  LLMObsLabelSchema.JSON_PROPERTY_TYPE,
  LLMObsLabelSchema.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsLabelSchema {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HAS_ASSESSMENT = "has_assessment";
  private Boolean hasAssessment;

  public static final String JSON_PROPERTY_HAS_REASONING = "has_reasoning";
  private Boolean hasReasoning;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_ASSESSMENT = "is_assessment";
  private Boolean isAssessment;

  public static final String JSON_PROPERTY_IS_INTEGER = "is_integer";
  private Boolean isInteger;

  public static final String JSON_PROPERTY_IS_REQUIRED = "is_required";
  private Boolean isRequired;

  public static final String JSON_PROPERTY_MAX = "max";
  private Double max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Double min;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsLabelSchemaType type;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public LLMObsLabelSchema() {}

  @JsonCreator
  public LLMObsLabelSchema(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LLMObsLabelSchemaType type) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsLabelSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the label.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LLMObsLabelSchema hasAssessment(Boolean hasAssessment) {
    this.hasAssessment = hasAssessment;
    return this;
  }

  /**
   * Whether this label includes an assessment field.
   *
   * @return hasAssessment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasAssessment() {
    return hasAssessment;
  }

  public void setHasAssessment(Boolean hasAssessment) {
    this.hasAssessment = hasAssessment;
  }

  public LLMObsLabelSchema hasReasoning(Boolean hasReasoning) {
    this.hasReasoning = hasReasoning;
    return this;
  }

  /**
   * Whether this label includes a reasoning field.
   *
   * @return hasReasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasReasoning() {
    return hasReasoning;
  }

  public void setHasReasoning(Boolean hasReasoning) {
    this.hasReasoning = hasReasoning;
  }

  public LLMObsLabelSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the label schema. Assigned by the server if not provided.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsLabelSchema isAssessment(Boolean isAssessment) {
    this.isAssessment = isAssessment;
    return this;
  }

  /**
   * Whether the boolean label represents an assessment. Requires <code>has_assessment</code> to be
   * true.
   *
   * @return isAssessment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ASSESSMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsAssessment() {
    return isAssessment;
  }

  public void setIsAssessment(Boolean isAssessment) {
    this.isAssessment = isAssessment;
  }

  public LLMObsLabelSchema isInteger(Boolean isInteger) {
    this.isInteger = isInteger;
    return this;
  }

  /**
   * Whether score values must be integers. Applicable to score-type labels.
   *
   * @return isInteger
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_INTEGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsInteger() {
    return isInteger;
  }

  public void setIsInteger(Boolean isInteger) {
    this.isInteger = isInteger;
  }

  public LLMObsLabelSchema isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Whether this label is required for an annotation.
   *
   * @return isRequired
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public LLMObsLabelSchema max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * Maximum value for score-type labels.
   *
   * @return max
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public LLMObsLabelSchema min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * Minimum value for score-type labels.
   *
   * @return min
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  public LLMObsLabelSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the label. Must match the pattern <code>^[a-zA-Z0-9_-]+$</code> and be unique within
   * the queue.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LLMObsLabelSchema type(LLMObsLabelSchemaType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of a label in an annotation queue label schema.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsLabelSchemaType getType() {
    return type;
  }

  public void setType(LLMObsLabelSchemaType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public LLMObsLabelSchema values(List<String> values) {
    this.values = values;
    return this;
  }

  public LLMObsLabelSchema addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Allowed values for categorical-type labels. Must contain at least one non-empty, unique value.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return LLMObsLabelSchema
   */
  @JsonAnySetter
  public LLMObsLabelSchema putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsLabelSchema object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsLabelSchema llmObsLabelSchema = (LLMObsLabelSchema) o;
    return Objects.equals(this.description, llmObsLabelSchema.description)
        && Objects.equals(this.hasAssessment, llmObsLabelSchema.hasAssessment)
        && Objects.equals(this.hasReasoning, llmObsLabelSchema.hasReasoning)
        && Objects.equals(this.id, llmObsLabelSchema.id)
        && Objects.equals(this.isAssessment, llmObsLabelSchema.isAssessment)
        && Objects.equals(this.isInteger, llmObsLabelSchema.isInteger)
        && Objects.equals(this.isRequired, llmObsLabelSchema.isRequired)
        && Objects.equals(this.max, llmObsLabelSchema.max)
        && Objects.equals(this.min, llmObsLabelSchema.min)
        && Objects.equals(this.name, llmObsLabelSchema.name)
        && Objects.equals(this.type, llmObsLabelSchema.type)
        && Objects.equals(this.values, llmObsLabelSchema.values)
        && Objects.equals(this.additionalProperties, llmObsLabelSchema.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        hasAssessment,
        hasReasoning,
        id,
        isAssessment,
        isInteger,
        isRequired,
        max,
        min,
        name,
        type,
        values,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsLabelSchema {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasAssessment: ").append(toIndentedString(hasAssessment)).append("\n");
    sb.append("    hasReasoning: ").append(toIndentedString(hasReasoning)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAssessment: ").append(toIndentedString(isAssessment)).append("\n");
    sb.append("    isInteger: ").append(toIndentedString(isInteger)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
