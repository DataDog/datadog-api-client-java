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

/** A single interaction result. */
@JsonPropertyOrder({
  LLMObsAnnotationQueueInteractionResponseItem.JSON_PROPERTY_ALREADY_EXISTED,
  LLMObsAnnotationQueueInteractionResponseItem.JSON_PROPERTY_CONTENT_ID,
  LLMObsAnnotationQueueInteractionResponseItem.JSON_PROPERTY_ID,
  LLMObsAnnotationQueueInteractionResponseItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsAnnotationQueueInteractionResponseItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALREADY_EXISTED = "already_existed";
  private Boolean alreadyExisted;

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsInteractionType type;

  public LLMObsAnnotationQueueInteractionResponseItem() {}

  @JsonCreator
  public LLMObsAnnotationQueueInteractionResponseItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALREADY_EXISTED) Boolean alreadyExisted,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_ID) String contentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LLMObsInteractionType type) {
    this.alreadyExisted = alreadyExisted;
    this.contentId = contentId;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsAnnotationQueueInteractionResponseItem alreadyExisted(Boolean alreadyExisted) {
    this.alreadyExisted = alreadyExisted;
    return this;
  }

  /**
   * Whether this interaction already existed in the queue.
   *
   * @return alreadyExisted
   */
  @JsonProperty(JSON_PROPERTY_ALREADY_EXISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAlreadyExisted() {
    return alreadyExisted;
  }

  public void setAlreadyExisted(Boolean alreadyExisted) {
    this.alreadyExisted = alreadyExisted;
  }

  public LLMObsAnnotationQueueInteractionResponseItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Identifier of the content for this interaction.
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

  public LLMObsAnnotationQueueInteractionResponseItem id(String id) {
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

  public LLMObsAnnotationQueueInteractionResponseItem type(LLMObsInteractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of interaction in an annotation queue.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsInteractionType getType() {
    return type;
  }

  public void setType(LLMObsInteractionType type) {
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
   * @return LLMObsAnnotationQueueInteractionResponseItem
   */
  @JsonAnySetter
  public LLMObsAnnotationQueueInteractionResponseItem putAdditionalProperty(
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

  /** Return true if this LLMObsAnnotationQueueInteractionResponseItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsAnnotationQueueInteractionResponseItem llmObsAnnotationQueueInteractionResponseItem =
        (LLMObsAnnotationQueueInteractionResponseItem) o;
    return Objects.equals(
            this.alreadyExisted, llmObsAnnotationQueueInteractionResponseItem.alreadyExisted)
        && Objects.equals(this.contentId, llmObsAnnotationQueueInteractionResponseItem.contentId)
        && Objects.equals(this.id, llmObsAnnotationQueueInteractionResponseItem.id)
        && Objects.equals(this.type, llmObsAnnotationQueueInteractionResponseItem.type)
        && Objects.equals(
            this.additionalProperties,
            llmObsAnnotationQueueInteractionResponseItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alreadyExisted, contentId, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsAnnotationQueueInteractionResponseItem {\n");
    sb.append("    alreadyExisted: ").append(toIndentedString(alreadyExisted)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
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
