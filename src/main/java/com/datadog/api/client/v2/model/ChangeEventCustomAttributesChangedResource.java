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

/**
 * Required JSON Object representing a resource. A resource is defined by <code>type</code> and
 * <code>name</code>. Currently it only supports <code>feature_flag</code> resource type.
 */
@JsonPropertyOrder({
  ChangeEventCustomAttributesChangedResource.JSON_PROPERTY_NAME,
  ChangeEventCustomAttributesChangedResource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeEventCustomAttributesChangedResource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private ChangeEventCustomAttributesChangedResourceName name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public ChangeEventCustomAttributesChangedResource() {}

  @JsonCreator
  public ChangeEventCustomAttributesChangedResource(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME)
          ChangeEventCustomAttributesChangedResourceName name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.name = name;
    this.unparsed |= !name.isValid();
    this.type = type;
  }

  public ChangeEventCustomAttributesChangedResource name(
      ChangeEventCustomAttributesChangedResourceName name) {
    this.name = name;
    this.unparsed |= !name.isValid();
    return this;
  }

  /**
   * Resource's type.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ChangeEventCustomAttributesChangedResourceName getName() {
    return name;
  }

  public void setName(ChangeEventCustomAttributesChangedResourceName name) {
    if (!name.isValid()) {
      this.unparsed = true;
    }
    this.name = name;
  }

  public ChangeEventCustomAttributesChangedResource type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Resource's name.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return ChangeEventCustomAttributesChangedResource
   */
  @JsonAnySetter
  public ChangeEventCustomAttributesChangedResource putAdditionalProperty(
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

  /** Return true if this ChangeEventCustomAttributesChangedResource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeEventCustomAttributesChangedResource changeEventCustomAttributesChangedResource =
        (ChangeEventCustomAttributesChangedResource) o;
    return Objects.equals(this.name, changeEventCustomAttributesChangedResource.name)
        && Objects.equals(this.type, changeEventCustomAttributesChangedResource.type)
        && Objects.equals(
            this.additionalProperties,
            changeEventCustomAttributesChangedResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeEventCustomAttributesChangedResource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
