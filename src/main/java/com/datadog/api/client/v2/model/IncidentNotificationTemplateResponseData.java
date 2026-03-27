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
   * <p>Notification template data from a response.</p>
 */
@JsonPropertyOrder({
  IncidentNotificationTemplateResponseData.JSON_PROPERTY_ATTRIBUTES,
  IncidentNotificationTemplateResponseData.JSON_PROPERTY_ID,
  IncidentNotificationTemplateResponseData.JSON_PROPERTY_RELATIONSHIPS,
  IncidentNotificationTemplateResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentNotificationTemplateResponseData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentNotificationTemplateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentNotificationTemplateRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentNotificationTemplateType type;

  public IncidentNotificationTemplateResponseData() {}

  @JsonCreator
  public IncidentNotificationTemplateResponseData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)UUID id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)IncidentNotificationTemplateType type) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public IncidentNotificationTemplateResponseData attributes(IncidentNotificationTemplateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>The notification template's attributes.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentNotificationTemplateAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(IncidentNotificationTemplateAttributes attributes) {
    this.attributes = attributes;
  }
  public IncidentNotificationTemplateResponseData id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier of the notification template.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UUID getId() {
        return id;
      }
  public void setId(UUID id) {
    this.id = id;
  }
  public IncidentNotificationTemplateResponseData relationships(IncidentNotificationTemplateRelationships relationships) {
    this.relationships = relationships;
    this.unparsed |= relationships.unparsed;
    return this;
  }

  /**
   * <p>The notification template's resource relationships.</p>
   * @return relationships
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IncidentNotificationTemplateRelationships getRelationships() {
        return relationships;
      }
  public void setRelationships(IncidentNotificationTemplateRelationships relationships) {
    this.relationships = relationships;
  }
  public IncidentNotificationTemplateResponseData type(IncidentNotificationTemplateType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Notification templates resource type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public IncidentNotificationTemplateType getType() {
        return type;
      }
  public void setType(IncidentNotificationTemplateType type) {
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
   * @return IncidentNotificationTemplateResponseData
   */
  @JsonAnySetter
  public IncidentNotificationTemplateResponseData putAdditionalProperty(String key, Object value) {
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
   * Return true if this IncidentNotificationTemplateResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentNotificationTemplateResponseData incidentNotificationTemplateResponseData = (IncidentNotificationTemplateResponseData) o;
    return Objects.equals(this.attributes, incidentNotificationTemplateResponseData.attributes) && Objects.equals(this.id, incidentNotificationTemplateResponseData.id) && Objects.equals(this.relationships, incidentNotificationTemplateResponseData.relationships) && Objects.equals(this.type, incidentNotificationTemplateResponseData.type) && Objects.equals(this.additionalProperties, incidentNotificationTemplateResponseData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,relationships,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentNotificationTemplateResponseData {\n");
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
