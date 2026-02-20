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

/** The supported attributes for updating a maintenance. */
@JsonPropertyOrder({
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_COMPLETED_DATE,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_COMPLETED_DESCRIPTION,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_COMPONENTS_AFFECTED,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_IN_PROGRESS_DESCRIPTION,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_SCHEDULED_DESCRIPTION,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_START_DATE,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_STATUS,
  PatchMaintenanceRequestDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchMaintenanceRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED_DATE = "completed_date";
  private OffsetDateTime completedDate;

  public static final String JSON_PROPERTY_COMPLETED_DESCRIPTION = "completed_description";
  private String completedDescription;

  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<PatchMaintenanceRequestDataAttributesComponentsAffectedItems> componentsAffected =
      null;

  public static final String JSON_PROPERTY_IN_PROGRESS_DESCRIPTION = "in_progress_description";
  private String inProgressDescription;

  public static final String JSON_PROPERTY_SCHEDULED_DESCRIPTION = "scheduled_description";
  private String scheduledDescription;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MaintenanceDataAttributesStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public PatchMaintenanceRequestDataAttributes completedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * Timestamp of when the maintenance was completed.
   *
   * @return completedDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public PatchMaintenanceRequestDataAttributes completedDescription(String completedDescription) {
    this.completedDescription = completedDescription;
    return this;
  }

  /**
   * The description shown when the maintenance is completed.
   *
   * @return completedDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompletedDescription() {
    return completedDescription;
  }

  public void setCompletedDescription(String completedDescription) {
    this.completedDescription = completedDescription;
  }

  public PatchMaintenanceRequestDataAttributes componentsAffected(
      List<PatchMaintenanceRequestDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    for (PatchMaintenanceRequestDataAttributesComponentsAffectedItems item : componentsAffected) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PatchMaintenanceRequestDataAttributes addComponentsAffectedItem(
      PatchMaintenanceRequestDataAttributesComponentsAffectedItems componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * The components affected by the maintenance.
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PatchMaintenanceRequestDataAttributesComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<PatchMaintenanceRequestDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
  }

  public PatchMaintenanceRequestDataAttributes inProgressDescription(String inProgressDescription) {
    this.inProgressDescription = inProgressDescription;
    return this;
  }

  /**
   * The description shown while the maintenance is in progress.
   *
   * @return inProgressDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInProgressDescription() {
    return inProgressDescription;
  }

  public void setInProgressDescription(String inProgressDescription) {
    this.inProgressDescription = inProgressDescription;
  }

  public PatchMaintenanceRequestDataAttributes scheduledDescription(String scheduledDescription) {
    this.scheduledDescription = scheduledDescription;
    return this;
  }

  /**
   * The description shown when the maintenance is scheduled.
   *
   * @return scheduledDescription
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScheduledDescription() {
    return scheduledDescription;
  }

  public void setScheduledDescription(String scheduledDescription) {
    this.scheduledDescription = scheduledDescription;
  }

  public PatchMaintenanceRequestDataAttributes startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Timestamp of when the maintenance is scheduled to start.
   *
   * @return startDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public PatchMaintenanceRequestDataAttributes status(MaintenanceDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the maintenance.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MaintenanceDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(MaintenanceDataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public PatchMaintenanceRequestDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the maintenance.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return PatchMaintenanceRequestDataAttributes
   */
  @JsonAnySetter
  public PatchMaintenanceRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PatchMaintenanceRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchMaintenanceRequestDataAttributes patchMaintenanceRequestDataAttributes =
        (PatchMaintenanceRequestDataAttributes) o;
    return Objects.equals(this.completedDate, patchMaintenanceRequestDataAttributes.completedDate)
        && Objects.equals(
            this.completedDescription, patchMaintenanceRequestDataAttributes.completedDescription)
        && Objects.equals(
            this.componentsAffected, patchMaintenanceRequestDataAttributes.componentsAffected)
        && Objects.equals(
            this.inProgressDescription, patchMaintenanceRequestDataAttributes.inProgressDescription)
        && Objects.equals(
            this.scheduledDescription, patchMaintenanceRequestDataAttributes.scheduledDescription)
        && Objects.equals(this.startDate, patchMaintenanceRequestDataAttributes.startDate)
        && Objects.equals(this.status, patchMaintenanceRequestDataAttributes.status)
        && Objects.equals(this.title, patchMaintenanceRequestDataAttributes.title)
        && Objects.equals(
            this.additionalProperties, patchMaintenanceRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        completedDate,
        completedDescription,
        componentsAffected,
        inProgressDescription,
        scheduledDescription,
        startDate,
        status,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchMaintenanceRequestDataAttributes {\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    completedDescription: ")
        .append(toIndentedString(completedDescription))
        .append("\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    inProgressDescription: ")
        .append(toIndentedString(inProgressDescription))
        .append("\n");
    sb.append("    scheduledDescription: ")
        .append(toIndentedString(scheduledDescription))
        .append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
