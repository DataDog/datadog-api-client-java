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

/** The attributes of a degradation. */
@JsonPropertyOrder({
  DegradationDataAttributes.JSON_PROPERTY_COMPONENTS_AFFECTED,
  DegradationDataAttributes.JSON_PROPERTY_CREATED_AT,
  DegradationDataAttributes.JSON_PROPERTY_DESCRIPTION,
  DegradationDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  DegradationDataAttributes.JSON_PROPERTY_STATUS,
  DegradationDataAttributes.JSON_PROPERTY_TITLE,
  DegradationDataAttributes.JSON_PROPERTY_UPDATES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DegradationDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<DegradationDataAttributesComponentsAffectedItems> componentsAffected = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CreateDegradationRequestDataAttributesStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_UPDATES = "updates";
  private List<DegradationDataAttributesUpdatesItems> updates = null;

  public DegradationDataAttributes componentsAffected(
      List<DegradationDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    for (DegradationDataAttributesComponentsAffectedItems item : componentsAffected) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DegradationDataAttributes addComponentsAffectedItem(
      DegradationDataAttributesComponentsAffectedItems componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * Components affected by the degradation.
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DegradationDataAttributesComponentsAffectedItems> getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<DegradationDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
  }

  public DegradationDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the degradation was created.
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

  public DegradationDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the degradation.
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

  public DegradationDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Timestamp of when the degradation was last modified.
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

  public DegradationDataAttributes status(CreateDegradationRequestDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the degradation.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateDegradationRequestDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(CreateDegradationRequestDataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public DegradationDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the degradation.
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

  public DegradationDataAttributes updates(List<DegradationDataAttributesUpdatesItems> updates) {
    this.updates = updates;
    for (DegradationDataAttributesUpdatesItems item : updates) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DegradationDataAttributes addUpdatesItem(
      DegradationDataAttributesUpdatesItems updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    this.unparsed |= updatesItem.unparsed;
    return this;
  }

  /**
   * Past updates made to the degradation.
   *
   * @return updates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DegradationDataAttributesUpdatesItems> getUpdates() {
    return updates;
  }

  public void setUpdates(List<DegradationDataAttributesUpdatesItems> updates) {
    this.updates = updates;
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
   * @return DegradationDataAttributes
   */
  @JsonAnySetter
  public DegradationDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DegradationDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DegradationDataAttributes degradationDataAttributes = (DegradationDataAttributes) o;
    return Objects.equals(this.componentsAffected, degradationDataAttributes.componentsAffected)
        && Objects.equals(this.createdAt, degradationDataAttributes.createdAt)
        && Objects.equals(this.description, degradationDataAttributes.description)
        && Objects.equals(this.modifiedAt, degradationDataAttributes.modifiedAt)
        && Objects.equals(this.status, degradationDataAttributes.status)
        && Objects.equals(this.title, degradationDataAttributes.title)
        && Objects.equals(this.updates, degradationDataAttributes.updates)
        && Objects.equals(
            this.additionalProperties, degradationDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        componentsAffected,
        createdAt,
        description,
        modifiedAt,
        status,
        title,
        updates,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DegradationDataAttributes {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
