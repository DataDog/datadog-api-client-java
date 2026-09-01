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
 * An interaction whose rendered content is supplied directly as web content. The server generates
 * <code>content_id</code> deterministically from the content.
 */
@JsonPropertyOrder({
  LLMObsFrontendInteractionItem.JSON_PROPERTY_FRONTEND,
  LLMObsFrontendInteractionItem.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsFrontendInteractionItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FRONTEND = "frontend";
  private LLMObsFrontendContent frontend;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LLMObsFrontendInteractionType type;

  public LLMObsFrontendInteractionItem() {}

  @JsonCreator
  public LLMObsFrontendInteractionItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_FRONTEND) LLMObsFrontendContent frontend,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LLMObsFrontendInteractionType type) {
    this.frontend = frontend;
    this.unparsed |= frontend.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LLMObsFrontendInteractionItem frontend(LLMObsFrontendContent frontend) {
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

  public LLMObsFrontendInteractionItem type(LLMObsFrontendInteractionType type) {
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
   * @return LLMObsFrontendInteractionItem
   */
  @JsonAnySetter
  public LLMObsFrontendInteractionItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsFrontendInteractionItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsFrontendInteractionItem llmObsFrontendInteractionItem = (LLMObsFrontendInteractionItem) o;
    return Objects.equals(this.frontend, llmObsFrontendInteractionItem.frontend)
        && Objects.equals(this.type, llmObsFrontendInteractionItem.type)
        && Objects.equals(
            this.additionalProperties, llmObsFrontendInteractionItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontend, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsFrontendInteractionItem {\n");
    sb.append("    frontend: ").append(toIndentedString(frontend)).append("\n");
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
