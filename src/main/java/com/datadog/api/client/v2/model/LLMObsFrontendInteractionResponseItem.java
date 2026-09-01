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

/** A frontend interaction result. */
@JsonPropertyOrder({
  LLMObsFrontendInteractionResponseItem.JSON_PROPERTY_ALREADY_EXISTED,
  LLMObsFrontendInteractionResponseItem.JSON_PROPERTY_CONTENT_ID,
  LLMObsFrontendInteractionResponseItem.JSON_PROPERTY_FRONTEND,
  LLMObsFrontendInteractionResponseItem.JSON_PROPERTY_ID,
  LLMObsFrontendInteractionResponseItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsFrontendInteractionResponseItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALREADY_EXISTED = "already_existed";
  private Boolean alreadyExisted;

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_FRONTEND = "frontend";
  private LLMObsFrontendContent frontend;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsFrontendInteractionType type;

  public LLMObsFrontendInteractionResponseItem() {}

  @JsonCreator
  public LLMObsFrontendInteractionResponseItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ALREADY_EXISTED) Boolean alreadyExisted,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT_ID) String contentId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FRONTEND) LLMObsFrontendContent frontend,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LLMObsFrontendInteractionType type) {
    this.alreadyExisted = alreadyExisted;
    this.contentId = contentId;
    this.frontend = frontend;
    this.unparsed |= frontend.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsFrontendInteractionResponseItem alreadyExisted(Boolean alreadyExisted) {
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

  public LLMObsFrontendInteractionResponseItem contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

  /**
   * Server-generated deterministic identifier derived from the content.
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

  public LLMObsFrontendInteractionResponseItem frontend(LLMObsFrontendContent frontend) {
    this.frontend = frontend;
    this.unparsed |= frontend.unparsed;
    return this;
  }

  /**
   * Web content that makes up a <code>frontend</code> interaction.
   *
   * @return frontend
   */
  @JsonProperty(JSON_PROPERTY_FRONTEND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsFrontendContent getFrontend() {
    return frontend;
  }

  public void setFrontend(LLMObsFrontendContent frontend) {
    this.frontend = frontend;
    if (frontend != null) {
      this.unparsed |= frontend.unparsed;
    }
  }

  public LLMObsFrontendInteractionResponseItem id(String id) {
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

  public LLMObsFrontendInteractionResponseItem type(LLMObsFrontendInteractionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type discriminator for a <code>frontend</code> interaction.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsFrontendInteractionType getType() {
    return type;
  }

  public void setType(LLMObsFrontendInteractionType type) {
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
   * @return LLMObsFrontendInteractionResponseItem
   */
  @JsonAnySetter
  public LLMObsFrontendInteractionResponseItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsFrontendInteractionResponseItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsFrontendInteractionResponseItem llmObsFrontendInteractionResponseItem =
        (LLMObsFrontendInteractionResponseItem) o;
    return Objects.equals(this.alreadyExisted, llmObsFrontendInteractionResponseItem.alreadyExisted)
        && Objects.equals(this.contentId, llmObsFrontendInteractionResponseItem.contentId)
        && Objects.equals(this.frontend, llmObsFrontendInteractionResponseItem.frontend)
        && Objects.equals(this.id, llmObsFrontendInteractionResponseItem.id)
        && Objects.equals(this.type, llmObsFrontendInteractionResponseItem.type)
        && Objects.equals(
            this.additionalProperties, llmObsFrontendInteractionResponseItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alreadyExisted, contentId, frontend, id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsFrontendInteractionResponseItem {\n");
    sb.append("    alreadyExisted: ").append(toIndentedString(alreadyExisted)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    frontend: ").append(toIndentedString(frontend)).append("\n");
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
