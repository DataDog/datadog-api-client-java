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

/** Framework Requirement. */
@JsonPropertyOrder({
  CustomFrameworkRequirement.JSON_PROPERTY_CONTROLS,
  CustomFrameworkRequirement.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomFrameworkRequirement {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTROLS = "controls";
  private List<CustomFrameworkControl> controls = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CustomFrameworkRequirement() {}

  @JsonCreator
  public CustomFrameworkRequirement(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTROLS)
          List<CustomFrameworkControl> controls,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.controls = controls;
    this.name = name;
  }

  public CustomFrameworkRequirement controls(List<CustomFrameworkControl> controls) {
    this.controls = controls;
    for (CustomFrameworkControl item : controls) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomFrameworkRequirement addControlsItem(CustomFrameworkControl controlsItem) {
    this.controls.add(controlsItem);
    this.unparsed |= controlsItem.unparsed;
    return this;
  }

  /**
   * Requirement Controls.
   *
   * @return controls
   */
  @JsonProperty(JSON_PROPERTY_CONTROLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CustomFrameworkControl> getControls() {
    return controls;
  }

  public void setControls(List<CustomFrameworkControl> controls) {
    this.controls = controls;
  }

  public CustomFrameworkRequirement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Requirement Name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * @return CustomFrameworkRequirement
   */
  @JsonAnySetter
  public CustomFrameworkRequirement putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomFrameworkRequirement object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFrameworkRequirement customFrameworkRequirement = (CustomFrameworkRequirement) o;
    return Objects.equals(this.controls, customFrameworkRequirement.controls)
        && Objects.equals(this.name, customFrameworkRequirement.name)
        && Objects.equals(
            this.additionalProperties, customFrameworkRequirement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controls, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFrameworkRequirement {\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
