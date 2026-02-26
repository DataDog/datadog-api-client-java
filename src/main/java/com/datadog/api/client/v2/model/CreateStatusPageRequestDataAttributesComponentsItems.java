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
import java.util.UUID;

/** */
@JsonPropertyOrder({
  CreateStatusPageRequestDataAttributesComponentsItems.JSON_PROPERTY_COMPONENTS,
  CreateStatusPageRequestDataAttributesComponentsItems.JSON_PROPERTY_ID,
  CreateStatusPageRequestDataAttributesComponentsItems.JSON_PROPERTY_NAME,
  CreateStatusPageRequestDataAttributesComponentsItems.JSON_PROPERTY_POSITION,
  CreateStatusPageRequestDataAttributesComponentsItems.JSON_PROPERTY_STATUS,
  CreateStatusPageRequestDataAttributesComponentsItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateStatusPageRequestDataAttributesComponentsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<CreateStatusPageRequestDataAttributesComponentsItemsComponentsItems> components =
      null;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Long position;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusPagesComponentGroupAttributesComponentsItemsStatus status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CreateComponentRequestDataAttributesType type;

  public CreateStatusPageRequestDataAttributesComponentsItems components(
      List<CreateStatusPageRequestDataAttributesComponentsItemsComponentsItems> components) {
    this.components = components;
    for (CreateStatusPageRequestDataAttributesComponentsItemsComponentsItems item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateStatusPageRequestDataAttributesComponentsItems addComponentsItem(
      CreateStatusPageRequestDataAttributesComponentsItemsComponentsItems componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * If creating a component of type <code>group</code>, the components to create within the group.
   *
   * @return components
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CreateStatusPageRequestDataAttributesComponentsItemsComponentsItems> getComponents() {
    return components;
  }

  public void setComponents(
      List<CreateStatusPageRequestDataAttributesComponentsItemsComponentsItems> components) {
    this.components = components;
  }

  /**
   * The ID of the component.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  public CreateStatusPageRequestDataAttributesComponentsItems name(String name) {
    this.name = name;
    return this;
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

  public void setName(String name) {
    this.name = name;
  }

  public CreateStatusPageRequestDataAttributesComponentsItems position(Long position) {
    this.position = position;
    return this;
  }

  /**
   * The zero-indexed position of the component.
   *
   * @return position
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  /**
   * The status of the component.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusPagesComponentGroupAttributesComponentsItemsStatus getStatus() {
    return status;
  }

  public CreateStatusPageRequestDataAttributesComponentsItems type(
      CreateComponentRequestDataAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of the component.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateComponentRequestDataAttributesType getType() {
    return type;
  }

  public void setType(CreateComponentRequestDataAttributesType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return CreateStatusPageRequestDataAttributesComponentsItems
   */
  @JsonAnySetter
  public CreateStatusPageRequestDataAttributesComponentsItems putAdditionalProperty(
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
   * Return true if this CreateStatusPageRequestDataAttributesComponentsItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStatusPageRequestDataAttributesComponentsItems
        createStatusPageRequestDataAttributesComponentsItems =
            (CreateStatusPageRequestDataAttributesComponentsItems) o;
    return Objects.equals(
            this.components, createStatusPageRequestDataAttributesComponentsItems.components)
        && Objects.equals(this.id, createStatusPageRequestDataAttributesComponentsItems.id)
        && Objects.equals(this.name, createStatusPageRequestDataAttributesComponentsItems.name)
        && Objects.equals(
            this.position, createStatusPageRequestDataAttributesComponentsItems.position)
        && Objects.equals(this.status, createStatusPageRequestDataAttributesComponentsItems.status)
        && Objects.equals(this.type, createStatusPageRequestDataAttributesComponentsItems.type)
        && Objects.equals(
            this.additionalProperties,
            createStatusPageRequestDataAttributesComponentsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, id, name, position, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStatusPageRequestDataAttributesComponentsItems {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
