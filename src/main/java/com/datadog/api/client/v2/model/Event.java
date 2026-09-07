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
   * <p>The metadata associated with a request.</p>
 */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_ID,
  Event.JSON_PROPERTY_INTEGRATION_ID,
  Event.JSON_PROPERTY_NAME,
  Event.JSON_PROPERTY_SOURCE_ID,
  Event.JSON_PROPERTY_TYPE,
  Event.JSON_PROPERTY_UID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Event {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private String integrationId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE_ID = "source_id";
  private Long sourceId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public Event id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Event ID.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public Event integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * <p>The integration ID of the event.</p>
   * @return integrationId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getIntegrationId() {
        return integrationId;
      }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }
  public Event name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The event name.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public Event sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * <p>Event source ID.</p>
   * @return sourceId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSourceId() {
        return sourceId;
      }
  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }
  public Event type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Event type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }
  public Event uid(String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * <p>A unique identifier for the event. You can use this identifier to query or reference the event.</p>
   * @return uid
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUid() {
        return uid;
      }
  public void setUid(String uid) {
    this.uid = uid;
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
   * @return Event
   */
  @JsonAnySetter
  public Event putAdditionalProperty(String key, Object value) {
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
   * Return true if this Event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) && Objects.equals(this.integrationId, event.integrationId) && Objects.equals(this.name, event.name) && Objects.equals(this.sourceId, event.sourceId) && Objects.equals(this.type, event.type) && Objects.equals(this.uid, event.uid) && Objects.equals(this.additionalProperties, event.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,integrationId,name,sourceId,type,uid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
