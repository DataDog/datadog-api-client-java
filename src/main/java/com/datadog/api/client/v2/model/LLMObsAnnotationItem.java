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

/** A single annotation on an interaction. */
@JsonPropertyOrder({
  LLMObsAnnotationItem.JSON_PROPERTY_CREATED_AT,
  LLMObsAnnotationItem.JSON_PROPERTY_CREATED_BY,
  LLMObsAnnotationItem.JSON_PROPERTY_ID,
  LLMObsAnnotationItem.JSON_PROPERTY_INTERACTION_ID,
  LLMObsAnnotationItem.JSON_PROPERTY_LABEL_VALUES,
  LLMObsAnnotationItem.JSON_PROPERTY_MODIFIED_AT,
  LLMObsAnnotationItem.JSON_PROPERTY_MODIFIED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERACTION_ID = "interaction_id";
  private String interactionId;

  public static final String JSON_PROPERTY_LABEL_VALUES = "label_values";
  private Map<String, Object> labelValues = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modified_by";
  private String modifiedBy;

  public LLMObsAnnotationItem() {}

  @JsonCreator
  public LLMObsAnnotationItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERACTION_ID) String interactionId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LABEL_VALUES)
          Map<String, Object> labelValues,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_BY) String modifiedBy) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.id = id;
    this.interactionId = interactionId;
    this.labelValues = labelValues;
    this.modifiedAt = modifiedAt;
    this.modifiedBy = modifiedBy;
  }

  public LLMObsAnnotationItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the annotation was created.
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

  public LLMObsAnnotationItem createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Identifier of the user who created the annotation.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LLMObsAnnotationItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the annotation.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsAnnotationItem interactionId(String interactionId) {
    this.interactionId = interactionId;
    return this;
  }

  /**
   * Identifier of the interaction this annotation belongs to.
   *
   * @return interactionId
   */
  @JsonProperty(JSON_PROPERTY_INTERACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInteractionId() {
    return interactionId;
  }

  public void setInteractionId(String interactionId) {
    this.interactionId = interactionId;
  }

  public LLMObsAnnotationItem labelValues(Map<String, Object> labelValues) {
    this.labelValues = labelValues;
    return this;
  }

  public LLMObsAnnotationItem putLabelValuesItem(String key, Object labelValuesItem) {
    this.labelValues.put(key, labelValuesItem);
    return this;
  }

  /**
   * The label values for this annotation.
   *
   * @return labelValues
   */
  @JsonProperty(JSON_PROPERTY_LABEL_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getLabelValues() {
    return labelValues;
  }

  public void setLabelValues(Map<String, Object> labelValues) {
    this.labelValues = labelValues;
  }

  public LLMObsAnnotationItem modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the annotation was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public LLMObsAnnotationItem modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * Identifier of the user who last modified the annotation.
   *
   * @return modifiedBy
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
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
   * @return LLMObsAnnotationItem
   */
  @JsonAnySetter
  public LLMObsAnnotationItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnnotationItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationItem llmObsAnnotationItem = (LLMObsAnnotationItem) o;
    return Objects.equals(this.createdAt, llmObsAnnotationItem.createdAt)
        && Objects.equals(this.createdBy, llmObsAnnotationItem.createdBy)
        && Objects.equals(this.id, llmObsAnnotationItem.id)
        && Objects.equals(this.interactionId, llmObsAnnotationItem.interactionId)
        && Objects.equals(this.labelValues, llmObsAnnotationItem.labelValues)
        && Objects.equals(this.modifiedAt, llmObsAnnotationItem.modifiedAt)
        && Objects.equals(this.modifiedBy, llmObsAnnotationItem.modifiedBy)
        && Objects.equals(this.additionalProperties, llmObsAnnotationItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        id,
        interactionId,
        labelValues,
        modifiedAt,
        modifiedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationItem {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    labelValues: ").append(toIndentedString(labelValues)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
