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

/** Attributes of a maintenance update resource. */
@JsonPropertyOrder({
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_COMPONENTS_AFFECTED,
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_CREATED_AT,
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_DESCRIPTION,
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_MANUAL_TRANSITION,
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_STARTED_AT,
  MaintenanceUpdateDataAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaintenanceUpdateDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<CreateMaintenanceRequestDataAttributesComponentsAffectedItems> componentsAffected =
      null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MANUAL_TRANSITION = "manual_transition";
  private Boolean manualTransition;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MaintenanceUpdateDataAttributesStatus status;

  public MaintenanceUpdateDataAttributes componentsAffected(
      List<CreateMaintenanceRequestDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    if (componentsAffected != null) {
      for (CreateMaintenanceRequestDataAttributesComponentsAffectedItems item :
          componentsAffected) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public MaintenanceUpdateDataAttributes addComponentsAffectedItem(
      CreateMaintenanceRequestDataAttributesComponentsAffectedItems componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * Components affected at the time of the update.
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CreateMaintenanceRequestDataAttributesComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<CreateMaintenanceRequestDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    if (componentsAffected != null) {
      for (CreateMaintenanceRequestDataAttributesComponentsAffectedItems item :
          componentsAffected) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public MaintenanceUpdateDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time the update was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MaintenanceUpdateDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The message body of the update.
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

  public MaintenanceUpdateDataAttributes manualTransition(Boolean manualTransition) {
    this.manualTransition = manualTransition;
    return this;
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

  public void setManualTransition(Boolean manualTransition) {
    this.manualTransition = manualTransition;
  }

  public MaintenanceUpdateDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date and time the update was last modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public MaintenanceUpdateDataAttributes startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * The date and time the update started.
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

  public MaintenanceUpdateDataAttributes status(MaintenanceUpdateDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the maintenance update.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MaintenanceUpdateDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(MaintenanceUpdateDataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
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
   * @return MaintenanceUpdateDataAttributes
   */
  @JsonAnySetter
  public MaintenanceUpdateDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaintenanceUpdateDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceUpdateDataAttributes maintenanceUpdateDataAttributes =
        (MaintenanceUpdateDataAttributes) o;
    return Objects.equals(
            this.componentsAffected, maintenanceUpdateDataAttributes.componentsAffected)
        && Objects.equals(this.createdAt, maintenanceUpdateDataAttributes.createdAt)
        && Objects.equals(this.description, maintenanceUpdateDataAttributes.description)
        && Objects.equals(this.manualTransition, maintenanceUpdateDataAttributes.manualTransition)
        && Objects.equals(this.modifiedAt, maintenanceUpdateDataAttributes.modifiedAt)
        && Objects.equals(this.startedAt, maintenanceUpdateDataAttributes.startedAt)
        && Objects.equals(this.status, maintenanceUpdateDataAttributes.status)
        && Objects.equals(
            this.additionalProperties, maintenanceUpdateDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        componentsAffected,
        createdAt,
        description,
        manualTransition,
        modifiedAt,
        startedAt,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceUpdateDataAttributes {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
