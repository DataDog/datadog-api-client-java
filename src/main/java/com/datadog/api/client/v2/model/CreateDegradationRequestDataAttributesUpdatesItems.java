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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A degradation update entry. */
@JsonPropertyOrder({
  CreateDegradationRequestDataAttributesUpdatesItems.JSON_PROPERTY_COMPONENTS_AFFECTED,
  CreateDegradationRequestDataAttributesUpdatesItems.JSON_PROPERTY_DESCRIPTION,
  CreateDegradationRequestDataAttributesUpdatesItems.JSON_PROPERTY_STARTED_AT,
  CreateDegradationRequestDataAttributesUpdatesItems.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateDegradationRequestDataAttributesUpdatesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems>
      componentsAffected = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CreateDegradationRequestDataAttributesStatus status;

  public CreateDegradationRequestDataAttributesUpdatesItems() {}

  @JsonCreator
  public CreateDegradationRequestDataAttributesUpdatesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          CreateDegradationRequestDataAttributesStatus status) {
    this.startedAt = startedAt;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public CreateDegradationRequestDataAttributesUpdatesItems componentsAffected(
      List<CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems>
          componentsAffected) {
    this.componentsAffected = componentsAffected;
    for (CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems item :
        componentsAffected) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateDegradationRequestDataAttributesUpdatesItems addComponentsAffectedItem(
      CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems
          componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * The components affected.
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems>
          componentsAffected) {
    this.componentsAffected = componentsAffected;
  }

  public CreateDegradationRequestDataAttributesUpdatesItems description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the update.
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

  public CreateDegradationRequestDataAttributesUpdatesItems startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Timestamp of when the update occurred.
   *
   * @return startedAt
   */
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public CreateDegradationRequestDataAttributesUpdatesItems status(
      CreateDegradationRequestDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the degradation.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return CreateDegradationRequestDataAttributesUpdatesItems
   */
  @JsonAnySetter
  public CreateDegradationRequestDataAttributesUpdatesItems putAdditionalProperty(
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
   * Return true if this CreateDegradationRequestDataAttributesUpdatesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDegradationRequestDataAttributesUpdatesItems
        createDegradationRequestDataAttributesUpdatesItems =
            (CreateDegradationRequestDataAttributesUpdatesItems) o;
    return Objects.equals(
            this.componentsAffected,
            createDegradationRequestDataAttributesUpdatesItems.componentsAffected)
        && Objects.equals(
            this.description, createDegradationRequestDataAttributesUpdatesItems.description)
        && Objects.equals(
            this.startedAt, createDegradationRequestDataAttributesUpdatesItems.startedAt)
        && Objects.equals(this.status, createDegradationRequestDataAttributesUpdatesItems.status)
        && Objects.equals(
            this.additionalProperties,
            createDegradationRequestDataAttributesUpdatesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsAffected, description, startedAt, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDegradationRequestDataAttributesUpdatesItems {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
