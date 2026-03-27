/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Data for creating an on-call notification rule</p>
 */
@JsonPropertyOrder({
  CreateOnCallNotificationRuleRequestData.JSON_PROPERTY_ATTRIBUTES,
  CreateOnCallNotificationRuleRequestData.JSON_PROPERTY_RELATIONSHIPS,
  CreateOnCallNotificationRuleRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateOnCallNotificationRuleRequestData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private OnCallNotificationRuleRequestAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private OnCallNotificationRuleRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private OnCallNotificationRuleType type = OnCallNotificationRuleType.NOTIFICATION_RULES;

  public CreateOnCallNotificationRuleRequestData() {}

  @JsonCreator
  public CreateOnCallNotificationRuleRequestData(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)OnCallNotificationRuleType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public CreateOnCallNotificationRuleRequestData attributes(OnCallNotificationRuleRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Attributes for creating or modifying an on-call notification rule.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OnCallNotificationRuleRequestAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(OnCallNotificationRuleRequestAttributes attributes) {
    this.attributes = attributes;
  }
  public CreateOnCallNotificationRuleRequestData relationships(OnCallNotificationRuleRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>Relationship object for creating a notification rule</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OnCallNotificationRuleRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(OnCallNotificationRuleRelationships relationships) {
    this.relationships = relationships;
  }
  public CreateOnCallNotificationRuleRequestData type(OnCallNotificationRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Indicates that the resource is of type 'notification_rules'.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OnCallNotificationRuleType getType() {
        return type;
      }
  public void setType(OnCallNotificationRuleType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CreateOnCallNotificationRuleRequestData
   */
  @JsonAnySetter
  public CreateOnCallNotificationRuleRequestData putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CreateOnCallNotificationRuleRequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOnCallNotificationRuleRequestData createOnCallNotificationRuleRequestData = (CreateOnCallNotificationRuleRequestData) o;
    return Objects.equals(this.attributes, createOnCallNotificationRuleRequestData.attributes) && Objects.equals(this.relationships, createOnCallNotificationRuleRequestData.relationships) && Objects.equals(this.type, createOnCallNotificationRuleRequestData.type) && Objects.equals(this.additionalProperties, createOnCallNotificationRuleRequestData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,relationships,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOnCallNotificationRuleRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
