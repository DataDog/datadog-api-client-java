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
 * One part of multipart message content, following the OpenAI content part format. For user,
 * system, developer, and tool messages, a text part must include non-empty <code>text</code>, and
 * an image part must include <code>image_url</code> with a non-empty <code>url</code>. These
 * content-part checks do not apply to assistant messages.
 */
@JsonPropertyOrder({
  AIGuardContentPart.JSON_PROPERTY_IMAGE_URL,
  AIGuardContentPart.JSON_PROPERTY_TEXT,
  AIGuardContentPart.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardContentPart {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IMAGE_URL = "image_url";
  private AIGuardImageURL imageUrl;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AIGuardContentPartType type;

  public AIGuardContentPart() {}

  @JsonCreator
  public AIGuardContentPart(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AIGuardContentPartType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AIGuardContentPart imageUrl(AIGuardImageURL imageUrl) {
    this.imageUrl = imageUrl;
    this.unparsed |= imageUrl.unparsed;
    return this;
  }

  /**
   * An image referenced by URL in a message content part.
   *
   * @return imageUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AIGuardImageURL getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(AIGuardImageURL imageUrl) {
    this.imageUrl = imageUrl;
    if (imageUrl != null) {
      this.unparsed |= imageUrl.unparsed;
    }
  }

  public AIGuardContentPart text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content, required and non-empty when <code>type</code> is <code>text</code> in a user,
   * system, developer, or tool message.
   *
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AIGuardContentPart type(AIGuardContentPartType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the content part.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AIGuardContentPartType getType() {
    return type;
  }

  public void setType(AIGuardContentPartType type) {
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
   * @return AIGuardContentPart
   */
  @JsonAnySetter
  public AIGuardContentPart putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardContentPart object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardContentPart aiGuardContentPart = (AIGuardContentPart) o;
    return Objects.equals(this.imageUrl, aiGuardContentPart.imageUrl)
        && Objects.equals(this.text, aiGuardContentPart.text)
        && Objects.equals(this.type, aiGuardContentPart.type)
        && Objects.equals(this.additionalProperties, aiGuardContentPart.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, text, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardContentPart {\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
