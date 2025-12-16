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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  GetCohortResponseDataAttributesCohortsItemsValuesItems.JSON_PROPERTY_ABSOLUTE_VALUE,
  GetCohortResponseDataAttributesCohortsItemsValuesItems.JSON_PROPERTY_END_TIME,
  GetCohortResponseDataAttributesCohortsItemsValuesItems.JSON_PROPERTY_RELATIVE_VALUE,
  GetCohortResponseDataAttributesCohortsItemsValuesItems.JSON_PROPERTY_START_TIME,
  GetCohortResponseDataAttributesCohortsItemsValuesItems.JSON_PROPERTY_WINDOW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetCohortResponseDataAttributesCohortsItemsValuesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ABSOLUTE_VALUE = "absolute_value";
  private Long absoluteValue;

  public static final String JSON_PROPERTY_END_TIME = "end_time";
  private Long endTime;

  public static final String JSON_PROPERTY_RELATIVE_VALUE = "relative_value";
  private Double relativeValue;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_WINDOW = "window";
  private Long window;

  public GetCohortResponseDataAttributesCohortsItemsValuesItems absoluteValue(Long absoluteValue) {
    this.absoluteValue = absoluteValue;
    return this;
  }

  /**
   * GetabsoluteValue
   *
   * @return absoluteValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAbsoluteValue() {
    return absoluteValue;
  }

  public void setAbsoluteValue(Long absoluteValue) {
    this.absoluteValue = absoluteValue;
  }

  public GetCohortResponseDataAttributesCohortsItemsValuesItems endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * GetendTime
   *
   * @return endTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public GetCohortResponseDataAttributesCohortsItemsValuesItems relativeValue(
      Double relativeValue) {
    this.relativeValue = relativeValue;
    return this;
  }

  /**
   * GetrelativeValue
   *
   * @return relativeValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIVE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRelativeValue() {
    return relativeValue;
  }

  public void setRelativeValue(Double relativeValue) {
    this.relativeValue = relativeValue;
  }

  public GetCohortResponseDataAttributesCohortsItemsValuesItems startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * GetstartTime
   *
   * @return startTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public GetCohortResponseDataAttributesCohortsItemsValuesItems window(Long window) {
    this.window = window;
    return this;
  }

  /**
   * Getwindow
   *
   * @return window
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWindow() {
    return window;
  }

  public void setWindow(Long window) {
    this.window = window;
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
   * @return GetCohortResponseDataAttributesCohortsItemsValuesItems
   */
  @JsonAnySetter
  public GetCohortResponseDataAttributesCohortsItemsValuesItems putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this GetCohortResponseDataAttributesCohortsItemsValuesItems object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCohortResponseDataAttributesCohortsItemsValuesItems
        getCohortResponseDataAttributesCohortsItemsValuesItems =
            (GetCohortResponseDataAttributesCohortsItemsValuesItems) o;
    return Objects.equals(
            this.absoluteValue,
            getCohortResponseDataAttributesCohortsItemsValuesItems.absoluteValue)
        && Objects.equals(
            this.endTime, getCohortResponseDataAttributesCohortsItemsValuesItems.endTime)
        && Objects.equals(
            this.relativeValue,
            getCohortResponseDataAttributesCohortsItemsValuesItems.relativeValue)
        && Objects.equals(
            this.startTime, getCohortResponseDataAttributesCohortsItemsValuesItems.startTime)
        && Objects.equals(
            this.window, getCohortResponseDataAttributesCohortsItemsValuesItems.window)
        && Objects.equals(
            this.additionalProperties,
            getCohortResponseDataAttributesCohortsItemsValuesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        absoluteValue, endTime, relativeValue, startTime, window, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCohortResponseDataAttributesCohortsItemsValuesItems {\n");
    sb.append("    absoluteValue: ").append(toIndentedString(absoluteValue)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    relativeValue: ").append(toIndentedString(relativeValue)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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
