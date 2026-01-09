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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  CreateDegradationRequestDataAttributes.JSON_PROPERTY_COMPONENTS_AFFECTED,
  CreateDegradationRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateDegradationRequestDataAttributes.JSON_PROPERTY_STATUS,
  CreateDegradationRequestDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateDegradationRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<CreateDegradationRequestDataAttributesComponentsAffectedItems> componentsAffected =
      new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CreateDegradationRequestDataAttributesStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public CreateDegradationRequestDataAttributes() {}

  @JsonCreator
  public CreateDegradationRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPONENTS_AFFECTED)
          List<CreateDegradationRequestDataAttributesComponentsAffectedItems> componentsAffected,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          CreateDegradationRequestDataAttributesStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.componentsAffected = componentsAffected;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.title = title;
  }

  public CreateDegradationRequestDataAttributes componentsAffected(
      List<CreateDegradationRequestDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
    for (CreateDegradationRequestDataAttributesComponentsAffectedItems item : componentsAffected) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateDegradationRequestDataAttributes addComponentsAffectedItem(
      CreateDegradationRequestDataAttributesComponentsAffectedItems componentsAffectedItem) {
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * GetcomponentsAffected
   *
   * @return componentsAffected
   */
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CreateDegradationRequestDataAttributesComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<CreateDegradationRequestDataAttributesComponentsAffectedItems> componentsAffected) {
    this.componentsAffected = componentsAffected;
  }

  public CreateDegradationRequestDataAttributes description(String description) {
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

  public CreateDegradationRequestDataAttributes status(
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

  public CreateDegradationRequestDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Gettitle
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return CreateDegradationRequestDataAttributes
   */
  @JsonAnySetter
  public CreateDegradationRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateDegradationRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDegradationRequestDataAttributes createDegradationRequestDataAttributes =
        (CreateDegradationRequestDataAttributes) o;
    return Objects.equals(
            this.componentsAffected, createDegradationRequestDataAttributes.componentsAffected)
        && Objects.equals(this.description, createDegradationRequestDataAttributes.description)
        && Objects.equals(this.status, createDegradationRequestDataAttributes.status)
        && Objects.equals(this.title, createDegradationRequestDataAttributes.title)
        && Objects.equals(
            this.additionalProperties, createDegradationRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsAffected, description, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDegradationRequestDataAttributes {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
