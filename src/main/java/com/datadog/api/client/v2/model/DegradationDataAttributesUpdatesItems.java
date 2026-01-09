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

/** */
@JsonPropertyOrder({
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_COMPONENTS_AFFECTED,
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_CREATED_AT,
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_DESCRIPTION,
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_ID,
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_MODIFIED_AT,
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_STARTED_AT,
  DegradationDataAttributesUpdatesItems.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DegradationDataAttributesUpdatesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<DegradationDataAttributesUpdatesItemsComponentsAffectedItems> componentsAffected =
      null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CreateDegradationRequestDataAttributesStatus status;

  public DegradationDataAttributesUpdatesItems componentsAffected(
      List<DegradationDataAttributesUpdatesItemsComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    for (DegradationDataAttributesUpdatesItemsComponentsAffectedItems item : componentsAffected) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DegradationDataAttributesUpdatesItems addComponentsAffectedItem(
      DegradationDataAttributesUpdatesItemsComponentsAffectedItems componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * GetcomponentsAffected
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DegradationDataAttributesUpdatesItemsComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<DegradationDataAttributesUpdatesItemsComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
  }

  /**
   * GetcreatedAt
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public DegradationDataAttributesUpdatesItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Getdescription
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
   * Getid
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * GetmodifiedAt
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public DegradationDataAttributesUpdatesItems startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * GetstartedAt
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

  public DegradationDataAttributesUpdatesItems status(
      CreateDegradationRequestDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Getstatus
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
   * @return DegradationDataAttributesUpdatesItems
   */
  @JsonAnySetter
  public DegradationDataAttributesUpdatesItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DegradationDataAttributesUpdatesItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DegradationDataAttributesUpdatesItems degradationDataAttributesUpdatesItems =
        (DegradationDataAttributesUpdatesItems) o;
    return Objects.equals(
            this.componentsAffected, degradationDataAttributesUpdatesItems.componentsAffected)
        && Objects.equals(this.createdAt, degradationDataAttributesUpdatesItems.createdAt)
        && Objects.equals(this.description, degradationDataAttributesUpdatesItems.description)
        && Objects.equals(this.id, degradationDataAttributesUpdatesItems.id)
        && Objects.equals(this.modifiedAt, degradationDataAttributesUpdatesItems.modifiedAt)
        && Objects.equals(this.startedAt, degradationDataAttributesUpdatesItems.startedAt)
        && Objects.equals(this.status, degradationDataAttributesUpdatesItems.status)
        && Objects.equals(
            this.additionalProperties, degradationDataAttributesUpdatesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        componentsAffected,
        createdAt,
        description,
        id,
        modifiedAt,
        startedAt,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DegradationDataAttributesUpdatesItems {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
