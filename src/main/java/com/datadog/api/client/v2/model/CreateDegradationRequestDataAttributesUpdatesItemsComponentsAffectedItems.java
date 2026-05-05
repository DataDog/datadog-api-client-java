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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A component affected by a degradation update. */
@JsonPropertyOrder({
  CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems.JSON_PROPERTY_ID,
  CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems.JSON_PROPERTY_NAME,
  CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusPagesComponentDataAttributesStatus status;

  public CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems() {}

  @JsonCreator
  public CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          StatusPagesComponentDataAttributesStatus status) {
    this.id = id;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the component. Must be a component of type <code>component</code>.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the component.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems status(
      StatusPagesComponentDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the component.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public StatusPagesComponentDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(StatusPagesComponentDataAttributesStatus status) {
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
   * @return CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems
   */
  @JsonAnySetter
  public CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems
        createDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems =
            (CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems) o;
    return Objects.equals(
            this.id, createDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems.id)
        && Objects.equals(
            this.name,
            createDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems.name)
        && Objects.equals(
            this.status,
            createDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems.status)
        && Objects.equals(
            this.additionalProperties,
            createDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class CreateDegradationRequestDataAttributesUpdatesItemsComponentsAffectedItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
