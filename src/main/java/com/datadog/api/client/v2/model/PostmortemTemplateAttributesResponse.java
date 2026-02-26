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

/** */
@JsonPropertyOrder({
  PostmortemTemplateAttributesResponse.JSON_PROPERTY_CREATED_AT,
  PostmortemTemplateAttributesResponse.JSON_PROPERTY_MODIFIED_AT,
  PostmortemTemplateAttributesResponse.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PostmortemTemplateAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public PostmortemTemplateAttributesResponse() {}

  @JsonCreator
  public PostmortemTemplateAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.createdAt = createdAt;
    this.modifiedAt = modifiedAt;
    this.name = name;
  }

  public PostmortemTemplateAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the template was created
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

  public PostmortemTemplateAttributesResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * When the template was last modified
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

  public PostmortemTemplateAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the template
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
   * @return PostmortemTemplateAttributesResponse
   */
  @JsonAnySetter
  public PostmortemTemplateAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PostmortemTemplateAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostmortemTemplateAttributesResponse postmortemTemplateAttributesResponse =
        (PostmortemTemplateAttributesResponse) o;
    return Objects.equals(this.createdAt, postmortemTemplateAttributesResponse.createdAt)
        && Objects.equals(this.modifiedAt, postmortemTemplateAttributesResponse.modifiedAt)
        && Objects.equals(this.name, postmortemTemplateAttributesResponse.name)
        && Objects.equals(
            this.additionalProperties, postmortemTemplateAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, modifiedAt, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostmortemTemplateAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
