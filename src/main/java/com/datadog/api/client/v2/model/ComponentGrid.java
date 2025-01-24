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

/**
 * A grid component. The grid component is the root canvas for an app and contains all other
 * components.
 */
@JsonPropertyOrder({
  ComponentGrid.JSON_PROPERTY_EVENTS,
  ComponentGrid.JSON_PROPERTY_ID,
  ComponentGrid.JSON_PROPERTY_NAME,
  ComponentGrid.JSON_PROPERTY_PROPERTIES,
  ComponentGrid.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComponentGrid {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<AppBuilderEvent> events = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private ComponentGridProperties properties;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ComponentGridType type = ComponentGridType.GRID;

  public ComponentGrid() {}

  @JsonCreator
  public ComponentGrid(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROPERTIES)
          ComponentGridProperties properties,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ComponentGridType type) {
    this.name = name;
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ComponentGrid events(List<AppBuilderEvent> events) {
    this.events = events;
    for (AppBuilderEvent item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ComponentGrid addEventsItem(AppBuilderEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Events to listen for on the grid component.
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

  public ComponentGrid id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the grid component. This property is deprecated; use <code>name</code> to identify
   * individual components instead.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ComponentGrid name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A unique identifier for this grid component. This name is also visible in the app editor.
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

  public ComponentGrid properties(ComponentGridProperties properties) {
    this.properties = properties;
    this.unparsed |= properties.unparsed;
    return this;
  }

  /**
   * Properties of a grid component.
   *
   * @return properties
   */
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ComponentGridProperties getProperties() {
    return properties;
  }

  public void setProperties(ComponentGridProperties properties) {
    this.properties = properties;
  }

  public ComponentGrid type(ComponentGridType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The grid component type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ComponentGridType getType() {
    return type;
  }

  public void setType(ComponentGridType type) {
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
   * @return ComponentGrid
   */
  @JsonAnySetter
  public ComponentGrid putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ComponentGrid object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentGrid componentGrid = (ComponentGrid) o;
    return Objects.equals(this.events, componentGrid.events)
        && Objects.equals(this.id, componentGrid.id)
        && Objects.equals(this.name, componentGrid.name)
        && Objects.equals(this.properties, componentGrid.properties)
        && Objects.equals(this.type, componentGrid.type)
        && Objects.equals(this.additionalProperties, componentGrid.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, id, name, properties, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentGrid {\n");
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
