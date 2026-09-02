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
 * A single content block rendered inside a <code>display_block</code> interaction. <code>type
 * </code> discriminates which other fields are meaningful:
 *
 * <ul>
 *   <li><code>markdown</code> / <code>text</code>: <code>content</code> must be a string.
 *   <li><code>header</code>: <code>content</code> must be a string; <code>level</code>, when set,
 *       must be one of <code>sm</code>, <code>md</code>, <code>lg</code>, <code>xl</code>.
 *   <li><code>json</code>: <code>content</code> must be a well-formed JSON value (object, array, or
 *       scalar).
 *   <li><code>image</code>: <code>url</code> is required.
 *   <li><code>widget</code>: <code>tileDef</code> is required (any well-formed JSON; the frontend
 *       owns the renderable schema).
 *   <li><code>llmobs_trace</code>: <code>traceId</code> is required; <code>interactionType</code>,
 *       when set, must be <code>trace</code> or <code>experiment_trace</code>.
 * </ul>
 *
 * <p><code>height</code>, when set, must be positive.
 */
@JsonPropertyOrder({
  LLMObsContentBlock.JSON_PROPERTY_ALT,
  LLMObsContentBlock.JSON_PROPERTY_CONTENT,
  LLMObsContentBlock.JSON_PROPERTY_HEIGHT,
  LLMObsContentBlock.JSON_PROPERTY_INTERACTION_TYPE,
  LLMObsContentBlock.JSON_PROPERTY_LABEL,
  LLMObsContentBlock.JSON_PROPERTY_LEVEL,
  LLMObsContentBlock.JSON_PROPERTY_TILE_DEF,
  LLMObsContentBlock.JSON_PROPERTY_TIME_FRAME,
  LLMObsContentBlock.JSON_PROPERTY_TRACE_ID,
  LLMObsContentBlock.JSON_PROPERTY_TYPE,
  LLMObsContentBlock.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsContentBlock {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALT = "alt";
  private String alt;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private Object content = null;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_INTERACTION_TYPE = "interactionType";
  private LLMObsContentBlockLLMObsTraceInteractionType interactionType;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private LLMObsContentBlockHeaderLevel level;

  public static final String JSON_PROPERTY_TILE_DEF = "tileDef";
  private Object tileDef = null;

  public static final String JSON_PROPERTY_TIME_FRAME = "timeFrame";
  private LLMObsContentBlockTimeFrame timeFrame;

  public static final String JSON_PROPERTY_TRACE_ID = "traceId";
  private String traceId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsContentBlockType type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public LLMObsContentBlock() {}

  @JsonCreator
  public LLMObsContentBlock(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LLMObsContentBlockType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsContentBlock alt(String alt) {
    this.alt = alt;
    return this;
  }

  /**
   * Alternative text for an <code>image</code> block.
   *
   * @return alt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public LLMObsContentBlock content(Object content) {
    this.content = content;
    return this;
  }

  /**
   * Block payload. A string for <code>markdown</code>, <code>header</code>, and <code>text</code>;
   * an arbitrary JSON value (object, array, or scalar) for <code>json</code>. Omitted for <code>
   * image</code>, <code>widget</code>, and <code>llmobs_trace</code>.
   *
   * @return content
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getContent() {
    return content;
  }

  public void setContent(Object content) {
    this.content = content;
  }

  public LLMObsContentBlock height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Optional rendered height. Must be positive when set.
   *
   * @return height
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public LLMObsContentBlock interactionType(
      LLMObsContentBlockLLMObsTraceInteractionType interactionType) {
    this.interactionType = interactionType;
    this.unparsed |= !interactionType.isValid();
    return this;
  }

  /**
   * Upstream interaction type referenced by an <code>llmobs_trace</code> block. Restricted to
   * <code>trace</code> or <code>experiment_trace</code>.
   *
   * @return interactionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsContentBlockLLMObsTraceInteractionType getInteractionType() {
    return interactionType;
  }

  public void setInteractionType(LLMObsContentBlockLLMObsTraceInteractionType interactionType) {
    if (!interactionType.isValid()) {
      this.unparsed = true;
    }
    this.interactionType = interactionType;
  }

  public LLMObsContentBlock label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Optional label rendered alongside the block.
   *
   * @return label
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LLMObsContentBlock level(LLMObsContentBlockHeaderLevel level) {
    this.level = level;
    this.unparsed |= !level.isValid();
    return this;
  }

  /**
   * Visual size for a <code>header</code> block.
   *
   * @return level
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsContentBlockHeaderLevel getLevel() {
    return level;
  }

  public void setLevel(LLMObsContentBlockHeaderLevel level) {
    if (!level.isValid()) {
      this.unparsed = true;
    }
    this.level = level;
  }

  public LLMObsContentBlock tileDef(Object tileDef) {
    this.tileDef = tileDef;
    return this;
  }

  /**
   * Tile definition for a <code>widget</code> block. Required for <code>widget</code>. The schema
   * is owned by the frontend renderer.
   *
   * @return tileDef
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TILE_DEF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getTileDef() {
    return tileDef;
  }

  public void setTileDef(Object tileDef) {
    this.tileDef = tileDef;
  }

  public LLMObsContentBlock timeFrame(LLMObsContentBlockTimeFrame timeFrame) {
    this.timeFrame = timeFrame;
    this.unparsed |= timeFrame.unparsed;
    return this;
  }

  /**
   * Unix-millis time range used by chart blocks.
   *
   * @return timeFrame
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_FRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsContentBlockTimeFrame getTimeFrame() {
    return timeFrame;
  }

  public void setTimeFrame(LLMObsContentBlockTimeFrame timeFrame) {
    this.timeFrame = timeFrame;
    if (timeFrame != null) {
      this.unparsed |= timeFrame.unparsed;
    }
  }

  public LLMObsContentBlock traceId(String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * Trace identifier. Required for <code>llmobs_trace</code> blocks.
   *
   * @return traceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public LLMObsContentBlock type(LLMObsContentBlockType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Discriminator for a single <code>display_block</code> content block. Adding a variant requires
   * coordinated changes in the frontend renderer.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsContentBlockType getType() {
    return type;
  }

  public void setType(LLMObsContentBlockType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public LLMObsContentBlock url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the image. Required for <code>image</code> blocks.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return LLMObsContentBlock
   */
  @JsonAnySetter
  public LLMObsContentBlock putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsContentBlock object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsContentBlock llmObsContentBlock = (LLMObsContentBlock) o;
    return Objects.equals(this.alt, llmObsContentBlock.alt)
        && Objects.equals(this.content, llmObsContentBlock.content)
        && Objects.equals(this.height, llmObsContentBlock.height)
        && Objects.equals(this.interactionType, llmObsContentBlock.interactionType)
        && Objects.equals(this.label, llmObsContentBlock.label)
        && Objects.equals(this.level, llmObsContentBlock.level)
        && Objects.equals(this.tileDef, llmObsContentBlock.tileDef)
        && Objects.equals(this.timeFrame, llmObsContentBlock.timeFrame)
        && Objects.equals(this.traceId, llmObsContentBlock.traceId)
        && Objects.equals(this.type, llmObsContentBlock.type)
        && Objects.equals(this.url, llmObsContentBlock.url)
        && Objects.equals(this.additionalProperties, llmObsContentBlock.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alt,
        content,
        height,
        interactionType,
        label,
        level,
        tileDef,
        timeFrame,
        traceId,
        type,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsContentBlock {\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    tileDef: ").append(toIndentedString(tileDef)).append("\n");
    sb.append("    timeFrame: ").append(toIndentedString(timeFrame)).append("\n");
    sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
