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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes required to create a maintenance window. */
@JsonPropertyOrder({
  MaintenanceWindowCreateAttributes.JSON_PROPERTY_END_AT,
  MaintenanceWindowCreateAttributes.JSON_PROPERTY_NAME,
  MaintenanceWindowCreateAttributes.JSON_PROPERTY_QUERY,
  MaintenanceWindowCreateAttributes.JSON_PROPERTY_START_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaintenanceWindowCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END_AT = "end_at";
  private OffsetDateTime endAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private OffsetDateTime startAt;

  public MaintenanceWindowCreateAttributes() {}

  @JsonCreator
  public MaintenanceWindowCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_END_AT) OffsetDateTime endAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_AT) OffsetDateTime startAt) {
    this.endAt = endAt;
    this.name = name;
    this.query = query;
    this.startAt = startAt;
  }

  public MaintenanceWindowCreateAttributes endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * The end time of the maintenance window.
   *
   * @return endAt
   */
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }

  public MaintenanceWindowCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the maintenance window.
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

  public MaintenanceWindowCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query to filter event management cases for this maintenance window.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public MaintenanceWindowCreateAttributes startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The start time of the maintenance window.
   *
   * @return startAt
   */
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
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
   * @return MaintenanceWindowCreateAttributes
   */
  @JsonAnySetter
  public MaintenanceWindowCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaintenanceWindowCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowCreateAttributes maintenanceWindowCreateAttributes =
        (MaintenanceWindowCreateAttributes) o;
    return Objects.equals(this.endAt, maintenanceWindowCreateAttributes.endAt)
        && Objects.equals(this.name, maintenanceWindowCreateAttributes.name)
        && Objects.equals(this.query, maintenanceWindowCreateAttributes.query)
        && Objects.equals(this.startAt, maintenanceWindowCreateAttributes.startAt)
        && Objects.equals(
            this.additionalProperties, maintenanceWindowCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endAt, name, query, startAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowCreateAttributes {\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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
