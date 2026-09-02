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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The supported attributes for updating a maintenance template. */
@JsonPropertyOrder({
  PatchMaintenanceTemplateRequestDataAttributes.JSON_PROPERTY_COMPLETED_DESCRIPTION,
  PatchMaintenanceTemplateRequestDataAttributes.JSON_PROPERTY_COMPONENT_IDS,
  PatchMaintenanceTemplateRequestDataAttributes.JSON_PROPERTY_IN_PROGRESS_DESCRIPTION,
  PatchMaintenanceTemplateRequestDataAttributes.JSON_PROPERTY_MAINTENANCE_TITLE,
  PatchMaintenanceTemplateRequestDataAttributes.JSON_PROPERTY_NAME,
  PatchMaintenanceTemplateRequestDataAttributes.JSON_PROPERTY_SCHEDULED_DESCRIPTION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchMaintenanceTemplateRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED_DESCRIPTION = "completed_description";
  private String completedDescription;

  public static final String JSON_PROPERTY_COMPONENT_IDS = "component_ids";
  private List<String> componentIds = null;

  public static final String JSON_PROPERTY_IN_PROGRESS_DESCRIPTION = "in_progress_description";
  private String inProgressDescription;

  public static final String JSON_PROPERTY_MAINTENANCE_TITLE = "maintenance_title";
  private String maintenanceTitle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCHEDULED_DESCRIPTION = "scheduled_description";
  private String scheduledDescription;

  public PatchMaintenanceTemplateRequestDataAttributes completedDescription(
      String completedDescription) {
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

  public PatchMaintenanceTemplateRequestDataAttributes componentIds(List<String> componentIds) {
    this.componentIds = componentIds;
    return this;
  }

  public PatchMaintenanceTemplateRequestDataAttributes addComponentIdsItem(
      String componentIdsItem) {
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

  public PatchMaintenanceTemplateRequestDataAttributes inProgressDescription(
      String inProgressDescription) {
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

  public PatchMaintenanceTemplateRequestDataAttributes maintenanceTitle(String maintenanceTitle) {
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

  public PatchMaintenanceTemplateRequestDataAttributes name(String name) {
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

  public PatchMaintenanceTemplateRequestDataAttributes scheduledDescription(
      String scheduledDescription) {
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
   * @return PatchMaintenanceTemplateRequestDataAttributes
   */
  @JsonAnySetter
  public PatchMaintenanceTemplateRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this PatchMaintenanceTemplateRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchMaintenanceTemplateRequestDataAttributes patchMaintenanceTemplateRequestDataAttributes =
        (PatchMaintenanceTemplateRequestDataAttributes) o;
    return Objects.equals(
            this.completedDescription,
            patchMaintenanceTemplateRequestDataAttributes.completedDescription)
        && Objects.equals(
            this.componentIds, patchMaintenanceTemplateRequestDataAttributes.componentIds)
        && Objects.equals(
            this.inProgressDescription,
            patchMaintenanceTemplateRequestDataAttributes.inProgressDescription)
        && Objects.equals(
            this.maintenanceTitle, patchMaintenanceTemplateRequestDataAttributes.maintenanceTitle)
        && Objects.equals(this.name, patchMaintenanceTemplateRequestDataAttributes.name)
        && Objects.equals(
            this.scheduledDescription,
            patchMaintenanceTemplateRequestDataAttributes.scheduledDescription)
        && Objects.equals(
            this.additionalProperties,
            patchMaintenanceTemplateRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        completedDescription,
        componentIds,
        inProgressDescription,
        maintenanceTitle,
        name,
        scheduledDescription,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchMaintenanceTemplateRequestDataAttributes {\n");
    sb.append("    completedDescription: ")
        .append(toIndentedString(completedDescription))
        .append("\n");
    sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
    sb.append("    inProgressDescription: ")
        .append(toIndentedString(inProgressDescription))
        .append("\n");
    sb.append("    maintenanceTitle: ").append(toIndentedString(maintenanceTitle)).append("\n");
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
