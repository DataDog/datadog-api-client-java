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
 * Describes the main attributes for creating a new schedule, including name, layers, and time zone.
 */
@JsonPropertyOrder({
  ScheduleCreateRequestDataAttributes.JSON_PROPERTY_LAYERS,
  ScheduleCreateRequestDataAttributes.JSON_PROPERTY_NAME,
  ScheduleCreateRequestDataAttributes.JSON_PROPERTY_TIME_ZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleCreateRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAYERS = "layers";
  private List<ScheduleCreateRequestDataAttributesLayersItems> layers = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private String timeZone;

  public ScheduleCreateRequestDataAttributes() {}

  @JsonCreator
  public ScheduleCreateRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAYERS)
          List<ScheduleCreateRequestDataAttributesLayersItems> layers,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_ZONE) String timeZone) {
    this.layers = layers;
    this.name = name;
    this.timeZone = timeZone;
  }

  public ScheduleCreateRequestDataAttributes layers(
      List<ScheduleCreateRequestDataAttributesLayersItems> layers) {
    this.layers = layers;
    for (ScheduleCreateRequestDataAttributesLayersItems item : layers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScheduleCreateRequestDataAttributes addLayersItem(
      ScheduleCreateRequestDataAttributesLayersItems layersItem) {
    this.layers.add(layersItem);
    this.unparsed |= layersItem.unparsed;
    return this;
  }

  /**
   * The layers of On-Call coverage that define rotation intervals and restrictions.
   *
   * @return layers
   */
  @JsonProperty(JSON_PROPERTY_LAYERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScheduleCreateRequestDataAttributesLayersItems> getLayers() {
    return layers;
  }

  public void setLayers(List<ScheduleCreateRequestDataAttributesLayersItems> layers) {
    this.layers = layers;
  }

  public ScheduleCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for the new schedule.
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

  public ScheduleCreateRequestDataAttributes timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone in which the schedule is defined.
   *
   * @return timeZone
   */
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
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
   * @return ScheduleCreateRequestDataAttributes
   */
  @JsonAnySetter
  public ScheduleCreateRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScheduleCreateRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleCreateRequestDataAttributes scheduleCreateRequestDataAttributes =
        (ScheduleCreateRequestDataAttributes) o;
    return Objects.equals(this.layers, scheduleCreateRequestDataAttributes.layers)
        && Objects.equals(this.name, scheduleCreateRequestDataAttributes.name)
        && Objects.equals(this.timeZone, scheduleCreateRequestDataAttributes.timeZone)
        && Objects.equals(
            this.additionalProperties, scheduleCreateRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layers, name, timeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreateRequestDataAttributes {\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
