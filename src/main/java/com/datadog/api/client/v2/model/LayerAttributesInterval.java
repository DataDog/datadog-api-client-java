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
   * <p>Defines how often the rotation repeats, using a combination of days and optional seconds. Should be at least 1 hour.</p>
 */
@JsonPropertyOrder({
  LayerAttributesInterval.JSON_PROPERTY_DAYS,
  LayerAttributesInterval.JSON_PROPERTY_SECONDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LayerAttributesInterval {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAYS = "days";
  private Integer days;

  public static final String JSON_PROPERTY_SECONDS = "seconds";
  private Long seconds;

  public LayerAttributesInterval days(Integer days) {
    this.days = days;
    return this;
  }

  /**
   * <p>The number of days in each rotation cycle.</p>
   * maximum: 400
   * @return days
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DAYS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getDays() {
        return days;
      }
  public void setDays(Integer days) {
    this.days = days;
  }
  public LayerAttributesInterval seconds(Long seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * <p>Any additional seconds for the rotation cycle (up to 30 days).</p>
   * maximum: 2592000
   * @return seconds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SECONDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSeconds() {
        return seconds;
      }
  public void setSeconds(Long seconds) {
    this.seconds = seconds;
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
   * @return LayerAttributesInterval
   */
  @JsonAnySetter
  public LayerAttributesInterval putAdditionalProperty(String key, Object value) {
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
   * Return true if this LayerAttributesInterval object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayerAttributesInterval layerAttributesInterval = (LayerAttributesInterval) o;
    return Objects.equals(this.days, layerAttributesInterval.days) && Objects.equals(this.seconds, layerAttributesInterval.seconds) && Objects.equals(this.additionalProperties, layerAttributesInterval.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(days,seconds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayerAttributesInterval {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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
