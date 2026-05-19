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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A trace, experiment trace, or session interaction with its associated annotations. */
@JsonPropertyOrder({
  LLMObsTraceAnnotatedInteractionItem.JSON_PROPERTY_ANNOTATIONS,
  LLMObsTraceAnnotatedInteractionItem.JSON_PROPERTY_CONTENT_ID,
  LLMObsTraceAnnotatedInteractionItem.JSON_PROPERTY_CREATED_AT,
  LLMObsTraceAnnotatedInteractionItem.JSON_PROPERTY_ID,
  LLMObsTraceAnnotatedInteractionItem.JSON_PROPERTY_MODIFIED_AT,
  LLMObsTraceAnnotatedInteractionItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsTraceAnnotatedInteractionItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<LLMObsAnnotationItem> annotations = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsTraceInteractionType type;

  public LLMObsTraceAnnotatedInteractionItem() {}

  @JsonCreator
  public LLMObsTraceAnnotatedInteractionItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATIONS)
          List<LLMObsAnnotationItem> annotations,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_ID) String contentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LLMObsTraceInteractionType type) {
    this.annotations = annotations;
    this.contentId = contentId;
    this.createdAt = createdAt;
    this.id = id;
    this.modifiedAt = modifiedAt;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsTraceAnnotatedInteractionItem annotations(List<LLMObsAnnotationItem> annotations) {
    this.annotations = annotations;
    for (LLMObsAnnotationItem item : annotations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsTraceAnnotatedInteractionItem addAnnotationsItem(
      LLMObsAnnotationItem annotationsItem) {
    this.annotations.add(annotationsItem);
    this.unparsed |= annotationsItem.unparsed;
    return this;
  }

  /**
   * List of annotations for this interaction.
   *
   * @return annotations
   */
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsAnnotationItem> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<LLMObsAnnotationItem> annotations) {
    this.annotations = annotations;
  }

  public LLMObsTraceAnnotatedInteractionItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Upstream entity identifier supplied by the caller.
   *
   * @return contentId
   */
  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContentId() {
    return contentId;
  }

  public void setContentId(String contentId) {
    this.contentId = contentId;
  }

  public LLMObsTraceAnnotatedInteractionItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the interaction was added to the queue.
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

  public LLMObsTraceAnnotatedInteractionItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the interaction.
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

  public LLMObsTraceAnnotatedInteractionItem modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp when the interaction was last updated.
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

  public LLMObsTraceAnnotatedInteractionItem type(LLMObsTraceInteractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of an upstream-entity interaction.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsTraceInteractionType getType() {
    return type;
  }

  public void setType(LLMObsTraceInteractionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return LLMObsTraceAnnotatedInteractionItem
   */
  @JsonAnySetter
  public LLMObsTraceAnnotatedInteractionItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsTraceAnnotatedInteractionItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsTraceAnnotatedInteractionItem llmObsTraceAnnotatedInteractionItem =
        (LLMObsTraceAnnotatedInteractionItem) o;
    return Objects.equals(this.annotations, llmObsTraceAnnotatedInteractionItem.annotations)
        && Objects.equals(this.contentId, llmObsTraceAnnotatedInteractionItem.contentId)
        && Objects.equals(this.createdAt, llmObsTraceAnnotatedInteractionItem.createdAt)
        && Objects.equals(this.id, llmObsTraceAnnotatedInteractionItem.id)
        && Objects.equals(this.modifiedAt, llmObsTraceAnnotatedInteractionItem.modifiedAt)
        && Objects.equals(this.type, llmObsTraceAnnotatedInteractionItem.type)
        && Objects.equals(
            this.additionalProperties, llmObsTraceAnnotatedInteractionItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotations, contentId, createdAt, id, modifiedAt, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsTraceAnnotatedInteractionItem {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
