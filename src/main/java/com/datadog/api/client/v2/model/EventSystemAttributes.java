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
   * <p>JSON object of event system attributes.</p>
 */
@JsonPropertyOrder({
  EventSystemAttributes.JSON_PROPERTY_CATEGORY,
  EventSystemAttributes.JSON_PROPERTY_ID,
  EventSystemAttributes.JSON_PROPERTY_INTEGRATION_ID,
  EventSystemAttributes.JSON_PROPERTY_SOURCE_ID,
  EventSystemAttributes.JSON_PROPERTY_UID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventSystemAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private EventSystemAttributesCategory category;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private EventSystemAttributesIntegrationId integrationId;

  public static final String JSON_PROPERTY_SOURCE_ID = "source_id";
  private Long sourceId;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public EventSystemAttributes category(EventSystemAttributesCategory category) {
    this.category = category;
    this.unparsed |= !category.isValid();
    return this;
  }

  /**
   * <p>Event category identifying the type of event.</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventSystemAttributesCategory getCategory() {
        return category;
      }
  public void setCategory(EventSystemAttributesCategory category) {
    if (!category.isValid()) {
        this.unparsed = true;
    }
    this.category = category;
  }
  public EventSystemAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Event identifier. This field is deprecated and will be removed in a future version. Use the <code>uid</code> field instead.</p>
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
  public EventSystemAttributes integrationId(EventSystemAttributesIntegrationId integrationId) {
    this.integrationId = integrationId;
    this.unparsed |= !integrationId.isValid();
    return this;
  }

  /**
   * <p>Integration ID sourced from integration manifests.</p>
   * @return integrationId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EventSystemAttributesIntegrationId getIntegrationId() {
        return integrationId;
      }
  public void setIntegrationId(EventSystemAttributesIntegrationId integrationId) {
    if (!integrationId.isValid()) {
        this.unparsed = true;
    }
    this.integrationId = integrationId;
  }
  public EventSystemAttributes sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * <p>The source type ID of the event.</p>
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
  public EventSystemAttributes uid(String uid) {
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
   * @return EventSystemAttributes
   */
  @JsonAnySetter
  public EventSystemAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this EventSystemAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSystemAttributes eventSystemAttributes = (EventSystemAttributes) o;
    return Objects.equals(this.category, eventSystemAttributes.category) && Objects.equals(this.id, eventSystemAttributes.id) && Objects.equals(this.integrationId, eventSystemAttributes.integrationId) && Objects.equals(this.sourceId, eventSystemAttributes.sourceId) && Objects.equals(this.uid, eventSystemAttributes.uid) && Objects.equals(this.additionalProperties, eventSystemAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(category,id,integrationId,sourceId,uid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventSystemAttributes {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
