/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Describes key properties of a Layer, including rotation details, name, start/end times, and any
 * restrictions.
 */
@JsonPropertyOrder({
  LayerAttributes.JSON_PROPERTY_EFFECTIVE_DATE,
  LayerAttributes.JSON_PROPERTY_END_DATE,
  LayerAttributes.JSON_PROPERTY_INTERVAL,
  LayerAttributes.JSON_PROPERTY_NAME,
  LayerAttributes.JSON_PROPERTY_RESTRICTIONS,
  LayerAttributes.JSON_PROPERTY_ROTATION_START,
  LayerAttributes.JSON_PROPERTY_TIME_ZONE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LayerAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "effective_date";
  private OffsetDateTime effectiveDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private LayerAttributesInterval interval;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private List<TimeRestriction> restrictions = null;

  public static final String JSON_PROPERTY_ROTATION_START = "rotation_start";
  private OffsetDateTime rotationStart;

  public static final String JSON_PROPERTY_TIME_ZONE = "time_zone";
  private String timeZone;

  public LayerAttributes effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * When the layer becomes active (ISO 8601).
   *
   * @return effectiveDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public LayerAttributes endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * When the layer ceases to be active (ISO 8601).
   *
   * @return endDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public LayerAttributes interval(LayerAttributesInterval interval) {
    this.interval = interval;
    this.unparsed |= interval.unparsed;
    return this;
  }

  /**
   * Defines how often the rotation repeats, using a combination of days and optional seconds.
   * Should be at least 1 hour.
   *
   * @return interval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LayerAttributesInterval getInterval() {
    return interval;
  }

  public void setInterval(LayerAttributesInterval interval) {
    this.interval = interval;
  }

  public LayerAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this layer.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LayerAttributes restrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
    for (TimeRestriction item : restrictions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LayerAttributes addRestrictionsItem(TimeRestriction restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    this.unparsed |= restrictionsItem.unparsed;
    return this;
  }

  /**
   * An optional list of time restrictions for when this layer is in effect.
   *
   * @return restrictions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeRestriction> getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
  }

  public LayerAttributes rotationStart(OffsetDateTime rotationStart) {
    this.rotationStart = rotationStart;
    return this;
  }

  /**
   * The date/time when the rotation starts (ISO 8601).
   *
   * @return rotationStart
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROTATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getRotationStart() {
    return rotationStart;
  }

  public void setRotationStart(OffsetDateTime rotationStart) {
    this.rotationStart = rotationStart;
  }

  public LayerAttributes timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The time zone for this layer.
   *
   * @return timeZone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return LayerAttributes
   */
  @JsonAnySetter
  public LayerAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LayerAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerAttributes layerAttributes = (LayerAttributes) o;
    return Objects.equals(this.effectiveDate, layerAttributes.effectiveDate)
        && Objects.equals(this.endDate, layerAttributes.endDate)
        && Objects.equals(this.interval, layerAttributes.interval)
        && Objects.equals(this.name, layerAttributes.name)
        && Objects.equals(this.restrictions, layerAttributes.restrictions)
        && Objects.equals(this.rotationStart, layerAttributes.rotationStart)
        && Objects.equals(this.timeZone, layerAttributes.timeZone)
        && Objects.equals(this.additionalProperties, layerAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        effectiveDate,
        endDate,
        interval,
        name,
        restrictions,
        rotationStart,
        timeZone,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerAttributes {\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    rotationStart: ").append(toIndentedString(rotationStart)).append("\n");
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
