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

/** Webhooks auth method data from a response. */
@JsonPropertyOrder({
  WebhooksAuthMethodResponseData.JSON_PROPERTY_ATTRIBUTES,
  WebhooksAuthMethodResponseData.JSON_PROPERTY_ID,
  WebhooksAuthMethodResponseData.JSON_PROPERTY_RELATIONSHIPS,
  WebhooksAuthMethodResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WebhooksAuthMethodResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private WebhooksAuthMethodAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private WebhooksAuthMethodRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private WebhooksAuthMethodType type = WebhooksAuthMethodType.WEBHOOKS_AUTH_METHOD;

  public WebhooksAuthMethodResponseData() {}

  @JsonCreator
  public WebhooksAuthMethodResponseData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          WebhooksAuthMethodAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) WebhooksAuthMethodType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public WebhooksAuthMethodResponseData attributes(WebhooksAuthMethodAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes of a webhooks auth method.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WebhooksAuthMethodAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(WebhooksAuthMethodAttributes attributes) {
    this.attributes = attributes;
    if (attributes != null) {
      this.unparsed |= attributes.unparsed;
    }
  }

  public WebhooksAuthMethodResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the auth method.
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

  public WebhooksAuthMethodResponseData relationships(
      WebhooksAuthMethodRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * Relationships of a webhooks auth method to its protocol-specific resource.
   *
   * @return relationships
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebhooksAuthMethodRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(WebhooksAuthMethodRelationships relationships) {
    this.relationships = relationships;
    if (relationships != null) {
      this.unparsed |= relationships.unparsed;
    }
  }

  public WebhooksAuthMethodResponseData type(WebhooksAuthMethodType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Webhooks auth method resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WebhooksAuthMethodType getType() {
    return type;
  }

  public void setType(WebhooksAuthMethodType type) {
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
   * @return WebhooksAuthMethodResponseData
   */
  @JsonAnySetter
  public WebhooksAuthMethodResponseData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WebhooksAuthMethodResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhooksAuthMethodResponseData webhooksAuthMethodResponseData =
        (WebhooksAuthMethodResponseData) o;
    return Objects.equals(this.attributes, webhooksAuthMethodResponseData.attributes)
        && Objects.equals(this.id, webhooksAuthMethodResponseData.id)
        && Objects.equals(this.relationships, webhooksAuthMethodResponseData.relationships)
        && Objects.equals(this.type, webhooksAuthMethodResponseData.type)
        && Objects.equals(
            this.additionalProperties, webhooksAuthMethodResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, relationships, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhooksAuthMethodResponseData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
