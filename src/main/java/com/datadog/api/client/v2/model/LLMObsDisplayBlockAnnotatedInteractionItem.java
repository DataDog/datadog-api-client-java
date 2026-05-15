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

/** A display_block interaction with its associated annotations. */
@JsonPropertyOrder({
  LLMObsDisplayBlockAnnotatedInteractionItem.JSON_PROPERTY_ANNOTATIONS,
  LLMObsDisplayBlockAnnotatedInteractionItem.JSON_PROPERTY_CONTENT_ID,
  LLMObsDisplayBlockAnnotatedInteractionItem.JSON_PROPERTY_DISPLAY_BLOCK,
  LLMObsDisplayBlockAnnotatedInteractionItem.JSON_PROPERTY_ID,
  LLMObsDisplayBlockAnnotatedInteractionItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDisplayBlockAnnotatedInteractionItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANNOTATIONS = "annotations";
  private List<LLMObsAnnotationItem> annotations = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_DISPLAY_BLOCK = "display_block";
  private List<LLMObsContentBlock> displayBlock = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsDisplayBlockInteractionType type;

  public LLMObsDisplayBlockAnnotatedInteractionItem() {}

  @JsonCreator
  public LLMObsDisplayBlockAnnotatedInteractionItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ANNOTATIONS)
          List<LLMObsAnnotationItem> annotations,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_ID) String contentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_BLOCK)
          List<LLMObsContentBlock> displayBlock,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LLMObsDisplayBlockInteractionType type) {
    this.annotations = annotations;
    this.contentId = contentId;
    this.displayBlock = displayBlock;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsDisplayBlockAnnotatedInteractionItem annotations(
      List<LLMObsAnnotationItem> annotations) {
    this.annotations = annotations;
    for (LLMObsAnnotationItem item : annotations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsDisplayBlockAnnotatedInteractionItem addAnnotationsItem(
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

  public LLMObsDisplayBlockAnnotatedInteractionItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Server-generated deterministic identifier derived from the block list.
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

  public LLMObsDisplayBlockAnnotatedInteractionItem displayBlock(
      List<LLMObsContentBlock> displayBlock) {
    this.displayBlock = displayBlock;
    for (LLMObsContentBlock item : displayBlock) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsDisplayBlockAnnotatedInteractionItem addDisplayBlockItem(
      LLMObsContentBlock displayBlockItem) {
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
  @JsonProperty(JSON_PROPERTY_DISPLAY_BLOCK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsContentBlock> getDisplayBlock() {
    return displayBlock;
  }

  public void setDisplayBlock(List<LLMObsContentBlock> displayBlock) {
    this.displayBlock = displayBlock;
  }

  public LLMObsDisplayBlockAnnotatedInteractionItem id(String id) {
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

  public LLMObsDisplayBlockAnnotatedInteractionItem type(LLMObsDisplayBlockInteractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type discriminator for a <code>display_block</code> interaction.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsDisplayBlockInteractionType getType() {
    return type;
  }

  public void setType(LLMObsDisplayBlockInteractionType type) {
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
   * @return LLMObsDisplayBlockAnnotatedInteractionItem
   */
  @JsonAnySetter
  public LLMObsDisplayBlockAnnotatedInteractionItem putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this LLMObsDisplayBlockAnnotatedInteractionItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDisplayBlockAnnotatedInteractionItem llmObsDisplayBlockAnnotatedInteractionItem =
        (LLMObsDisplayBlockAnnotatedInteractionItem) o;
    return Objects.equals(this.annotations, llmObsDisplayBlockAnnotatedInteractionItem.annotations)
        && Objects.equals(this.contentId, llmObsDisplayBlockAnnotatedInteractionItem.contentId)
        && Objects.equals(
            this.displayBlock, llmObsDisplayBlockAnnotatedInteractionItem.displayBlock)
        && Objects.equals(this.id, llmObsDisplayBlockAnnotatedInteractionItem.id)
        && Objects.equals(this.type, llmObsDisplayBlockAnnotatedInteractionItem.type)
        && Objects.equals(
            this.additionalProperties,
            llmObsDisplayBlockAnnotatedInteractionItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, contentId, displayBlock, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDisplayBlockAnnotatedInteractionItem {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    displayBlock: ").append(toIndentedString(displayBlock)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
