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

/** */
@JsonPropertyOrder({
  StatusPagesComponentDataAttributes.JSON_PROPERTY_COMPONENTS,
  StatusPagesComponentDataAttributes.JSON_PROPERTY_CREATED_AT,
  StatusPagesComponentDataAttributes.JSON_PROPERTY_MODIFIED_AT,
  StatusPagesComponentDataAttributes.JSON_PROPERTY_NAME,
  StatusPagesComponentDataAttributes.JSON_PROPERTY_POSITION,
  StatusPagesComponentDataAttributes.JSON_PROPERTY_STATUS,
  StatusPagesComponentDataAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPagesComponentDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS = "components";
  private List<StatusPagesComponentDataAttributesComponentsItems> components = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Long position;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusPagesComponentDataAttributesStatus status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CreateComponentRequestDataAttributesType type;

  public StatusPagesComponentDataAttributes() {}

  @JsonCreator
  public StatusPagesComponentDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CreateComponentRequestDataAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public StatusPagesComponentDataAttributes components(
      List<StatusPagesComponentDataAttributesComponentsItems> components) {
    this.components = components;
    for (StatusPagesComponentDataAttributesComponentsItems item : components) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public StatusPagesComponentDataAttributes addComponentsItem(
      StatusPagesComponentDataAttributesComponentsItems componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    this.unparsed |= componentsItem.unparsed;
    return this;
  }

  /**
   * Getcomponents
   *
   * @return components
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<StatusPagesComponentDataAttributesComponentsItems> getComponents() {
    return components;
  }

  public void setComponents(List<StatusPagesComponentDataAttributesComponentsItems> components) {
    this.components = components;
  }

  public StatusPagesComponentDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
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

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StatusPagesComponentDataAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
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

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public StatusPagesComponentDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Getname
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

  public StatusPagesComponentDataAttributes position(Long position) {
    this.position = position;
    return this;
  }

  /**
   * Getposition
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

  public StatusPagesComponentDataAttributes status(
      StatusPagesComponentDataAttributesStatus status) {
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
  public StatusPagesComponentDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(StatusPagesComponentDataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public StatusPagesComponentDataAttributes type(CreateComponentRequestDataAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Gettype
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return StatusPagesComponentDataAttributes
   */
  @JsonAnySetter
  public StatusPagesComponentDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this StatusPagesComponentDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPagesComponentDataAttributes statusPagesComponentDataAttributes =
        (StatusPagesComponentDataAttributes) o;
    return Objects.equals(this.components, statusPagesComponentDataAttributes.components)
        && Objects.equals(this.createdAt, statusPagesComponentDataAttributes.createdAt)
        && Objects.equals(this.modifiedAt, statusPagesComponentDataAttributes.modifiedAt)
        && Objects.equals(this.name, statusPagesComponentDataAttributes.name)
        && Objects.equals(this.position, statusPagesComponentDataAttributes.position)
        && Objects.equals(this.status, statusPagesComponentDataAttributes.status)
        && Objects.equals(this.type, statusPagesComponentDataAttributes.type)
        && Objects.equals(
            this.additionalProperties, statusPagesComponentDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        components, createdAt, modifiedAt, name, position, status, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPagesComponentDataAttributes {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
