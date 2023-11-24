/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/**
 * Calendar interval options for compute. Fields <code>interval</code> (numeric interval) and <code>
 * rollup</code> (calendar interval) are mutually exclusive.
 *
 * <p>For instance: - { type: 'day', alignment: '1pm', timezone: 'Europe/Paris' } - { type: 'week',
 * alignment: 'tuesday', quantity: 2 } - { type: 'month', alignment: '15th' } - { type: 'year',
 * alignment: 'april' }
 */
@JsonPropertyOrder({
  CalendarInterval.JSON_PROPERTY_ALIGNMENT,
  CalendarInterval.JSON_PROPERTY_QUANTITY,
  CalendarInterval.JSON_PROPERTY_TIMEZONE,
  CalendarInterval.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CalendarInterval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIGNMENT = "alignment";
  private String alignment;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity = 1l;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public static final String JSON_PROPERTY_TYPE = "type";
  private CalendarIntervalType type;

  public CalendarInterval() {}

  @JsonCreator
  public CalendarInterval(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CalendarIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CalendarInterval alignment(String alignment) {
    this.alignment = alignment;
    return this;
  }

  /**
   * Optional alignment to define period start. Its possible values depend on the type field:
   *
   * <ul>
   *   <li>day: start hour of day as 12 or 24-hr format (for instance: 11pm, 3am, 15)
   *   <li>week: first day of the week (for instance: tuesday, note the lowercase)
   *   <li>month: first day of month (for instance: 1th, 2nd, 23th)
   *   <li>year: first month of the year (for instance: april, note the lowercase)
   * </ul>
   *
   * @return alignment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlignment() {
    return alignment;
  }

  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }

  public CalendarInterval quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Optional integer to specify how many units to group together.
   *
   * @return quantity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public CalendarInterval timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Optional timezone to define the calendar interval.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CalendarInterval type(CalendarIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of calendar interval (day, week, etc.).
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CalendarIntervalType getType() {
    return type;
  }

  public void setType(CalendarIntervalType type) {
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
   * @return CalendarInterval
   */
  @JsonAnySetter
  public CalendarInterval putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CalendarInterval object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarInterval calendarInterval = (CalendarInterval) o;
    return Objects.equals(this.alignment, calendarInterval.alignment)
        && Objects.equals(this.quantity, calendarInterval.quantity)
        && Objects.equals(this.timezone, calendarInterval.timezone)
        && Objects.equals(this.type, calendarInterval.type)
        && Objects.equals(this.additionalProperties, calendarInterval.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, quantity, timezone, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarInterval {\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
