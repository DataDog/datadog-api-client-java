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

/** Data for creating a new configuration deployment. */
@JsonPropertyOrder({
  FleetDeploymentConfigureCreate.JSON_PROPERTY_ATTRIBUTES,
  FleetDeploymentConfigureCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FleetDeploymentConfigureCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private FleetDeploymentConfigureAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FleetDeploymentResourceType type = FleetDeploymentResourceType.DEPLOYMENT;

  public FleetDeploymentConfigureCreate() {}

  @JsonCreator
  public FleetDeploymentConfigureCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          FleetDeploymentConfigureAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) FleetDeploymentResourceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public FleetDeploymentConfigureCreate attributes(FleetDeploymentConfigureAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes for creating a new configuration deployment.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FleetDeploymentConfigureAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(FleetDeploymentConfigureAttributes attributes) {
    this.attributes = attributes;
  }

  public FleetDeploymentConfigureCreate type(FleetDeploymentResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of deployment resource.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FleetDeploymentResourceType getType() {
    return type;
  }

  public void setType(FleetDeploymentResourceType type) {
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
   * @return FleetDeploymentConfigureCreate
   */
  @JsonAnySetter
  public FleetDeploymentConfigureCreate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FleetDeploymentConfigureCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetDeploymentConfigureCreate fleetDeploymentConfigureCreate =
        (FleetDeploymentConfigureCreate) o;
    return Objects.equals(this.attributes, fleetDeploymentConfigureCreate.attributes)
        && Objects.equals(this.type, fleetDeploymentConfigureCreate.type)
        && Objects.equals(
            this.additionalProperties, fleetDeploymentConfigureCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetDeploymentConfigureCreate {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
