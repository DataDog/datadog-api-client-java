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

/**
 * Attributes of a maintenance window, including its schedule and the query that determines which
 * cases are affected.
 */
@JsonPropertyOrder({
  MaintenanceWindowAttributes.JSON_PROPERTY_CREATED_BY,
  MaintenanceWindowAttributes.JSON_PROPERTY_END_AT,
  MaintenanceWindowAttributes.JSON_PROPERTY_NAME,
  MaintenanceWindowAttributes.JSON_PROPERTY_QUERY,
  MaintenanceWindowAttributes.JSON_PROPERTY_START_AT,
  MaintenanceWindowAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaintenanceWindowAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private OffsetDateTime endAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_START_AT = "start_at";
  private OffsetDateTime startAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public MaintenanceWindowAttributes() {}

  @JsonCreator
  public MaintenanceWindowAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_END_AT) OffsetDateTime endAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_START_AT) OffsetDateTime startAt) {
    this.endAt = endAt;
    this.name = name;
    this.query = query;
    this.startAt = startAt;
  }

  /**
   * The UUID of the user who created this maintenance window. Read-only.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedBy() {
    return createdBy;
  }

  public MaintenanceWindowAttributes endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * The ISO 8601 timestamp when the maintenance window ends and normal notification behavior
   * resumes.
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

  public MaintenanceWindowAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-readable name for the maintenance window (for example, <code>
   * Database migration - Dec 15</code>).
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

  public MaintenanceWindowAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * A case search query that determines which cases are affected during the maintenance window.
   * Uses the same syntax as the Case Management search bar.
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

  public MaintenanceWindowAttributes startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The ISO 8601 timestamp when the maintenance window begins and notifications start being
   * suppressed.
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
   * The UUID of the user who last modified this maintenance window. Read-only.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedBy() {
    return updatedBy;
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
   * @return MaintenanceWindowAttributes
   */
  @JsonAnySetter
  public MaintenanceWindowAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaintenanceWindowAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowAttributes maintenanceWindowAttributes = (MaintenanceWindowAttributes) o;
    return Objects.equals(this.createdBy, maintenanceWindowAttributes.createdBy)
        && Objects.equals(this.endAt, maintenanceWindowAttributes.endAt)
        && Objects.equals(this.name, maintenanceWindowAttributes.name)
        && Objects.equals(this.query, maintenanceWindowAttributes.query)
        && Objects.equals(this.startAt, maintenanceWindowAttributes.startAt)
        && Objects.equals(this.updatedBy, maintenanceWindowAttributes.updatedBy)
        && Objects.equals(
            this.additionalProperties, maintenanceWindowAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, endAt, name, query, startAt, updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowAttributes {\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
