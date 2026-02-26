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
   * <p>Defines the updatable attributes for a schedule, such as name, time zone, and layers.</p>
 */
@JsonPropertyOrder({
  ScheduleUpdateRequestDataAttributes.JSON_PROPERTY_LAYERS,
  ScheduleUpdateRequestDataAttributes.JSON_PROPERTY_NAME,
  ScheduleUpdateRequestDataAttributes.JSON_PROPERTY_TIME_ZONE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleUpdateRequestDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAYERS = "layers";
  private List<ScheduleUpdateRequestDataAttributesLayersItems> layers = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private String timeZone;

  public ScheduleUpdateRequestDataAttributes() {}

  @JsonCreator
  public ScheduleUpdateRequestDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_LAYERS)List<ScheduleUpdateRequestDataAttributesLayersItems> layers,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_TIME_ZONE)String timeZone) {
        this.layers = layers;
        this.name = name;
        this.timeZone = timeZone;
  }
  public ScheduleUpdateRequestDataAttributes layers(List<ScheduleUpdateRequestDataAttributesLayersItems> layers) {
    this.layers = layers;
    for (ScheduleUpdateRequestDataAttributesLayersItems item : layers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ScheduleUpdateRequestDataAttributes addLayersItem(ScheduleUpdateRequestDataAttributesLayersItems layersItem) {
    this.layers.add(layersItem);
    this.unparsed |= layersItem.unparsed;
    return this;
  }

  /**
   * <p>The updated list of layers (rotations) for this schedule.</p>
   * @return layers
  **/
      @JsonProperty(JSON_PROPERTY_LAYERS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<ScheduleUpdateRequestDataAttributesLayersItems> getLayers() {
        return layers;
      }
  public void setLayers(List<ScheduleUpdateRequestDataAttributesLayersItems> layers) {
    this.layers = layers;
  }
  public ScheduleUpdateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>A short name for the schedule.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ScheduleUpdateRequestDataAttributes timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * <p>The time zone used when interpreting rotation times.</p>
   * @return timeZone
  **/
      @JsonProperty(JSON_PROPERTY_TIME_ZONE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTimeZone() {
        return timeZone;
      }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
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
   * @return ScheduleUpdateRequestDataAttributes
   */
  @JsonAnySetter
  public ScheduleUpdateRequestDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ScheduleUpdateRequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleUpdateRequestDataAttributes scheduleUpdateRequestDataAttributes = (ScheduleUpdateRequestDataAttributes) o;
    return Objects.equals(this.layers, scheduleUpdateRequestDataAttributes.layers) && Objects.equals(this.name, scheduleUpdateRequestDataAttributes.name) && Objects.equals(this.timeZone, scheduleUpdateRequestDataAttributes.timeZone) && Objects.equals(this.additionalProperties, scheduleUpdateRequestDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(layers,name,timeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleUpdateRequestDataAttributes {\n");
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
