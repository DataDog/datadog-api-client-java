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

/**
 * An annotated interaction returned by the cross-queue lookup, including the source queue metadata.
 */
@JsonPropertyOrder({
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_ANNOTATIONS,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_CONTENT_ID,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_CREATED_AT,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_DISPLAY_BLOCK,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_ID,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_MODIFIED_AT,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_QUEUE_ID,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_QUEUE_NAME,
  LLMObsAnnotatedInteractionByTraceItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotatedInteractionByTraceItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<LLMObsAnnotationItem> annotations = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISPLAY_BLOCK = "display_block";
  private List<LLMObsContentBlock> displayBlock = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_QUEUE_ID = "queue_id";
  private String queueId;

  public static final String JSON_PROPERTY_QUEUE_NAME = "queue_name";
  private String queueName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsAnyInteractionType type;

  public LLMObsAnnotatedInteractionByTraceItem() {}

  @JsonCreator
  public LLMObsAnnotatedInteractionByTraceItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATIONS)
          List<LLMObsAnnotationItem> annotations,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_ID) String contentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUEUE_ID) String queueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUEUE_NAME) String queueName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LLMObsAnyInteractionType type) {
    this.annotations = annotations;
    for (LLMObsAnnotationItem item : annotations) {
      this.unparsed |= item.unparsed;
    }
    this.contentId = contentId;
    this.createdAt = createdAt;
    this.id = id;
    this.modifiedAt = modifiedAt;
    this.queueId = queueId;
    this.queueName = queueName;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsAnnotatedInteractionByTraceItem annotations(List<LLMObsAnnotationItem> annotations) {
    this.annotations = annotations;
    for (LLMObsAnnotationItem item : annotations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotatedInteractionByTraceItem addAnnotationsItem(
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
    if (annotations != null) {
      for (LLMObsAnnotationItem item : annotations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsAnnotatedInteractionByTraceItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Upstream entity identifier (trace ID, session ID, or deterministic display_block ID).
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

  public LLMObsAnnotatedInteractionByTraceItem createdAt(OffsetDateTime createdAt) {
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

  public LLMObsAnnotatedInteractionByTraceItem displayBlock(List<LLMObsContentBlock> displayBlock) {
    this.displayBlock = displayBlock;
    for (LLMObsContentBlock item : displayBlock) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsAnnotatedInteractionByTraceItem addDisplayBlockItem(
      LLMObsContentBlock displayBlockItem) {
    if (this.displayBlock == null) {
      this.displayBlock = new ArrayList<>();
    }
    this.displayBlock.add(displayBlockItem);
    this.unparsed |= displayBlockItem.unparsed;
    return this;
  }

  /**
   * List of content blocks that make up a <code>display_block</code> interaction. Must contain at
   * least one block.
   *
   * @return displayBlock
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsContentBlock> getDisplayBlock() {
    return displayBlock;
  }

  public void setDisplayBlock(List<LLMObsContentBlock> displayBlock) {
    this.displayBlock = displayBlock;
    if (displayBlock != null) {
      for (LLMObsContentBlock item : displayBlock) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsAnnotatedInteractionByTraceItem id(String id) {
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

  public LLMObsAnnotatedInteractionByTraceItem modifiedAt(OffsetDateTime modifiedAt) {
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

  public LLMObsAnnotatedInteractionByTraceItem queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

  /**
   * Identifier of the annotation queue this interaction belongs to.
   *
   * @return queueId
   */
  @JsonProperty(JSON_PROPERTY_QUEUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  public LLMObsAnnotatedInteractionByTraceItem queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  /**
   * Name of the annotation queue this interaction belongs to.
   *
   * @return queueName
   */
  @JsonProperty(JSON_PROPERTY_QUEUE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }

  public LLMObsAnnotatedInteractionByTraceItem type(LLMObsAnyInteractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of an annotated interaction.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsAnyInteractionType getType() {
    return type;
  }

  public void setType(LLMObsAnyInteractionType type) {
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
   * @return LLMObsAnnotatedInteractionByTraceItem
   */
  @JsonAnySetter
  public LLMObsAnnotatedInteractionByTraceItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsAnnotatedInteractionByTraceItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotatedInteractionByTraceItem llmObsAnnotatedInteractionByTraceItem =
        (LLMObsAnnotatedInteractionByTraceItem) o;
    return Objects.equals(this.annotations, llmObsAnnotatedInteractionByTraceItem.annotations)
        && Objects.equals(this.contentId, llmObsAnnotatedInteractionByTraceItem.contentId)
        && Objects.equals(this.createdAt, llmObsAnnotatedInteractionByTraceItem.createdAt)
        && Objects.equals(this.displayBlock, llmObsAnnotatedInteractionByTraceItem.displayBlock)
        && Objects.equals(this.id, llmObsAnnotatedInteractionByTraceItem.id)
        && Objects.equals(this.modifiedAt, llmObsAnnotatedInteractionByTraceItem.modifiedAt)
        && Objects.equals(this.queueId, llmObsAnnotatedInteractionByTraceItem.queueId)
        && Objects.equals(this.queueName, llmObsAnnotatedInteractionByTraceItem.queueName)
        && Objects.equals(this.type, llmObsAnnotatedInteractionByTraceItem.type)
        && Objects.equals(
            this.additionalProperties, llmObsAnnotatedInteractionByTraceItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        annotations,
        contentId,
        createdAt,
        displayBlock,
        id,
        modifiedAt,
        queueId,
        queueName,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotatedInteractionByTraceItem {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    displayBlock: ").append(toIndentedString(displayBlock)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
