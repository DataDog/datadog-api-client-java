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

/** The attributes of a maintenance template. */
@JsonPropertyOrder({
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_COMPLETED_DESCRIPTION,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_COMPONENT_IDS,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_CREATED_AT,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_IN_PROGRESS_DESCRIPTION,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_MAINTENANCE_TITLE,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_NAME,
  MaintenanceTemplateDataAttributes.JSON_PROPERTY_SCHEDULED_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MaintenanceTemplateDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED_DESCRIPTION = "completed_description";
  private String completedDescription;

  public static final String JSON_PROPERTY_COMPONENT_IDS = "component_ids";
  private List<String> componentIds = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_IN_PROGRESS_DESCRIPTION = "in_progress_description";
  private String inProgressDescription;

  public static final String JSON_PROPERTY_MAINTENANCE_TITLE = "maintenance_title";
  private String maintenanceTitle;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCHEDULED_DESCRIPTION = "scheduled_description";
  private String scheduledDescription;

  public MaintenanceTemplateDataAttributes completedDescription(String completedDescription) {
    this.completedDescription = completedDescription;
    return this;
  }

  /**
   * The description shown when a maintenance created from this template is completed.
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

  public MaintenanceTemplateDataAttributes componentIds(List<String> componentIds) {
    this.componentIds = componentIds;
    return this;
  }

  public MaintenanceTemplateDataAttributes addComponentIdsItem(String componentIdsItem) {
    if (this.componentIds == null) {
      this.componentIds = new ArrayList<>();
    }
    this.componentIds.add(componentIdsItem);
    return this;
  }

  /**
   * The IDs of the components affected by a maintenance created from this template.
   *
   * @return componentIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getComponentIds() {
    return componentIds;
  }

  public void setComponentIds(List<String> componentIds) {
    this.componentIds = componentIds;
  }

  public MaintenanceTemplateDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the maintenance template was created.
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

  public MaintenanceTemplateDataAttributes inProgressDescription(String inProgressDescription) {
    this.inProgressDescription = inProgressDescription;
    return this;
  }

  /**
   * The description shown while a maintenance created from this template is in progress.
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

  public MaintenanceTemplateDataAttributes maintenanceTitle(String maintenanceTitle) {
    this.maintenanceTitle = maintenanceTitle;
    return this;
  }

  /**
   * The title used for a maintenance created from this template.
   *
   * @return maintenanceTitle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaintenanceTitle() {
    return maintenanceTitle;
  }

  public void setMaintenanceTitle(String maintenanceTitle) {
    this.maintenanceTitle = maintenanceTitle;
  }

  public MaintenanceTemplateDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of when the maintenance template was last modified.
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

  public MaintenanceTemplateDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the maintenance template.
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

  public MaintenanceTemplateDataAttributes scheduledDescription(String scheduledDescription) {
    this.scheduledDescription = scheduledDescription;
    return this;
  }

  /**
   * The description shown when a maintenance created from this template is scheduled.
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
   * @return MaintenanceTemplateDataAttributes
   */
  @JsonAnySetter
  public MaintenanceTemplateDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MaintenanceTemplateDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceTemplateDataAttributes maintenanceTemplateDataAttributes =
        (MaintenanceTemplateDataAttributes) o;
    return Objects.equals(
            this.completedDescription, maintenanceTemplateDataAttributes.completedDescription)
        && Objects.equals(this.componentIds, maintenanceTemplateDataAttributes.componentIds)
        && Objects.equals(this.createdAt, maintenanceTemplateDataAttributes.createdAt)
        && Objects.equals(
            this.inProgressDescription, maintenanceTemplateDataAttributes.inProgressDescription)
        && Objects.equals(this.maintenanceTitle, maintenanceTemplateDataAttributes.maintenanceTitle)
        && Objects.equals(this.modifiedAt, maintenanceTemplateDataAttributes.modifiedAt)
        && Objects.equals(this.name, maintenanceTemplateDataAttributes.name)
        && Objects.equals(
            this.scheduledDescription, maintenanceTemplateDataAttributes.scheduledDescription)
        && Objects.equals(
            this.additionalProperties, maintenanceTemplateDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        completedDescription,
        componentIds,
        createdAt,
        inProgressDescription,
        maintenanceTitle,
        modifiedAt,
        name,
        scheduledDescription,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceTemplateDataAttributes {\n");
    sb.append("    completedDescription: ")
        .append(toIndentedString(completedDescription))
        .append("\n");
    sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    inProgressDescription: ")
        .append(toIndentedString(inProgressDescription))
        .append("\n");
    sb.append("    maintenanceTitle: ").append(toIndentedString(maintenanceTitle)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduledDescription: ")
        .append(toIndentedString(scheduledDescription))
        .append("\n");
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
