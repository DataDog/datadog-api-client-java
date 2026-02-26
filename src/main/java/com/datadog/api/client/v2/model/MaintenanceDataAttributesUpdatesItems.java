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
import java.util.UUID;

/** */
@JsonPropertyOrder({
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_COMPONENTS_AFFECTED,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_CREATED_AT,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_DESCRIPTION,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_ID,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_MANUAL_TRANSITION,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_MODIFIED_AT,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_STARTED_AT,
  MaintenanceDataAttributesUpdatesItems.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaintenanceDataAttributesUpdatesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<MaintenanceDataAttributesUpdatesItemsComponentsAffectedItems> componentsAffected =
      null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_MANUAL_TRANSITION = "manual_transition";
  private Boolean manualTransition;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public MaintenanceDataAttributesUpdatesItems componentsAffected(
      List<MaintenanceDataAttributesUpdatesItemsComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    for (MaintenanceDataAttributesUpdatesItemsComponentsAffectedItems item : componentsAffected) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public MaintenanceDataAttributesUpdatesItems addComponentsAffectedItem(
      MaintenanceDataAttributesUpdatesItemsComponentsAffectedItems componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * The components affected at the time of the update.
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MaintenanceDataAttributesUpdatesItemsComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<MaintenanceDataAttributesUpdatesItemsComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
  }

  /**
   * Timestamp of when the update was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public MaintenanceDataAttributesUpdatesItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the update.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Identifier of the update.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  /**
   * Whether the update was applied manually by a user (true) or automatically by the system
   * (false).
   *
   * @return manualTransition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUAL_TRANSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getManualTransition() {
    return manualTransition;
  }

  /**
   * Timestamp of when the update was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public MaintenanceDataAttributesUpdatesItems startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Timestamp of when the update started.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public MaintenanceDataAttributesUpdatesItems status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the update.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
   * @return MaintenanceDataAttributesUpdatesItems
   */
  @JsonAnySetter
  public MaintenanceDataAttributesUpdatesItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaintenanceDataAttributesUpdatesItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceDataAttributesUpdatesItems maintenanceDataAttributesUpdatesItems =
        (MaintenanceDataAttributesUpdatesItems) o;
    return Objects.equals(
            this.componentsAffected, maintenanceDataAttributesUpdatesItems.componentsAffected)
        && Objects.equals(this.createdAt, maintenanceDataAttributesUpdatesItems.createdAt)
        && Objects.equals(this.description, maintenanceDataAttributesUpdatesItems.description)
        && Objects.equals(this.id, maintenanceDataAttributesUpdatesItems.id)
        && Objects.equals(
            this.manualTransition, maintenanceDataAttributesUpdatesItems.manualTransition)
        && Objects.equals(this.modifiedAt, maintenanceDataAttributesUpdatesItems.modifiedAt)
        && Objects.equals(this.startedAt, maintenanceDataAttributesUpdatesItems.startedAt)
        && Objects.equals(this.status, maintenanceDataAttributesUpdatesItems.status)
        && Objects.equals(
            this.additionalProperties, maintenanceDataAttributesUpdatesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        componentsAffected,
        createdAt,
        description,
        id,
        manualTransition,
        modifiedAt,
        startedAt,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceDataAttributesUpdatesItems {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manualTransition: ").append(toIndentedString(manualTransition)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
