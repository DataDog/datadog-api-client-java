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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * An action query. This query type is used to trigger an action, such as sending a HTTP request.
 */
@JsonPropertyOrder({
  ActionQuery.JSON_PROPERTY_EVENTS,
  ActionQuery.JSON_PROPERTY_ID,
  ActionQuery.JSON_PROPERTY_NAME,
  ActionQuery.JSON_PROPERTY_PROPERTIES,
  ActionQuery.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ActionQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<AppBuilderEvent> events = null;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private ActionQueryProperties properties;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ActionQueryType type = ActionQueryType.ACTION;

  public ActionQuery() {}

  @JsonCreator
  public ActionQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTIES)
          ActionQueryProperties properties,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ActionQueryType type) {
    this.id = id;
    this.name = name;
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ActionQuery events(List<AppBuilderEvent> events) {
    this.events = events;
    for (AppBuilderEvent item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ActionQuery addEventsItem(AppBuilderEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Events to listen for downstream of the action query.
   *
   * @return events
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AppBuilderEvent> getEvents() {
    return events;
  }

  public void setEvents(List<AppBuilderEvent> events) {
    this.events = events;
  }

  public ActionQuery id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the action query.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ActionQuery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A unique identifier for this action query. This name is also used to access the query's result
   * throughout the app.
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

  public ActionQuery properties(ActionQueryProperties properties) {
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    return this;
  }

  /**
   * The properties of the action query.
   *
   * @return properties
   */
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ActionQueryProperties getProperties() {
    return properties;
  }

  public void setProperties(ActionQueryProperties properties) {
    this.properties = properties;
  }

  public ActionQuery type(ActionQueryType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The action query type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ActionQueryType getType() {
    return type;
  }

  public void setType(ActionQueryType type) {
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
   * @return ActionQuery
   */
  @JsonAnySetter
  public ActionQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ActionQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionQuery actionQuery = (ActionQuery) o;
    return Objects.equals(this.events, actionQuery.events)
        && Objects.equals(this.id, actionQuery.id)
        && Objects.equals(this.name, actionQuery.name)
        && Objects.equals(this.properties, actionQuery.properties)
        && Objects.equals(this.type, actionQuery.type)
        && Objects.equals(this.additionalProperties, actionQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, id, name, properties, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionQuery {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
