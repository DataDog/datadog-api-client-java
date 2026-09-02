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
   * <p>A calendar-aligned bucket definition, such as "every 1 week starting on Monday".</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsCalendarInterval.JSON_PROPERTY_ALIGNMENT,
  ProductAnalyticsCalendarInterval.JSON_PROPERTY_QUANTITY,
  ProductAnalyticsCalendarInterval.JSON_PROPERTY_TIMEZONE,
  ProductAnalyticsCalendarInterval.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsCalendarInterval {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALIGNMENT = "alignment";
  private String alignment;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsCalendarIntervalType type;

  public ProductAnalyticsCalendarInterval() {}

  @JsonCreator
  public ProductAnalyticsCalendarInterval(
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ProductAnalyticsCalendarIntervalType type) {
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ProductAnalyticsCalendarInterval alignment(String alignment) {
    this.alignment = alignment;
    return this;
  }

  /**
   * <p>Where each bucket starts within the calendar unit. Use an hour for <code>day</code> (for example <code>1am</code> or <code>14</code>),
   * a day name for <code>week</code> (for example <code>monday</code>), or an ordinal for <code>month</code> (for example <code>1st</code>).</p>
   * @return alignment
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALIGNMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAlignment() {
        return alignment;
      }
  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }
  public ProductAnalyticsCalendarInterval quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * <p>Number of calendar units per bucket.</p>
   * minimum: 1
   * @return quantity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUANTITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getQuantity() {
        return quantity;
      }
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }
  public ProductAnalyticsCalendarInterval timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * <p>Timezone used to align the buckets.</p>
   * @return timezone
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEZONE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTimezone() {
        return timezone;
      }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }
  public ProductAnalyticsCalendarInterval type(ProductAnalyticsCalendarIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Calendar unit used to bucket cohorts.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsCalendarIntervalType getType() {
        return type;
      }
  public void setType(ProductAnalyticsCalendarIntervalType type) {
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
   * @return ProductAnalyticsCalendarInterval
   */
  @JsonAnySetter
  public ProductAnalyticsCalendarInterval putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProductAnalyticsCalendarInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsCalendarInterval productAnalyticsCalendarInterval = (ProductAnalyticsCalendarInterval) o;
    return Objects.equals(this.alignment, productAnalyticsCalendarInterval.alignment) && Objects.equals(this.quantity, productAnalyticsCalendarInterval.quantity) && Objects.equals(this.timezone, productAnalyticsCalendarInterval.timezone) && Objects.equals(this.type, productAnalyticsCalendarInterval.type) && Objects.equals(this.additionalProperties, productAnalyticsCalendarInterval.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alignment,quantity,timezone,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsCalendarInterval {\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
