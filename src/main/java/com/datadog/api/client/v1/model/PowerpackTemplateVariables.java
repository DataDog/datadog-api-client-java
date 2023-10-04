/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Powerpack template variables. */
@JsonPropertyOrder({
  PowerpackTemplateVariables.JSON_PROPERTY_CONTROLLED_BY_POWERPACK,
  PowerpackTemplateVariables.JSON_PROPERTY_CONTROLLED_EXTERNALLY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackTemplateVariables {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTROLLED_BY_POWERPACK = "controlled_by_powerpack";
  private List<PowerpackTemplateVariableContents> controlledByPowerpack = null;

  public static final String JSON_PROPERTY_CONTROLLED_EXTERNALLY = "controlled_externally";
  private List<PowerpackTemplateVariableContents> controlledExternally = null;

  public PowerpackTemplateVariables controlledByPowerpack(
      List<PowerpackTemplateVariableContents> controlledByPowerpack) {
    this.controlledByPowerpack = controlledByPowerpack;
    for (PowerpackTemplateVariableContents item : controlledByPowerpack) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PowerpackTemplateVariables addControlledByPowerpackItem(
      PowerpackTemplateVariableContents controlledByPowerpackItem) {
    if (this.controlledByPowerpack == null) {
      this.controlledByPowerpack = new ArrayList<>();
    }
    this.controlledByPowerpack.add(controlledByPowerpackItem);
    this.unparsed |= controlledByPowerpackItem.unparsed;
    return this;
  }

  /**
   * Template variables controlled at the powerpack level.
   *
   * @return controlledByPowerpack
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTROLLED_BY_POWERPACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PowerpackTemplateVariableContents> getControlledByPowerpack() {
    return controlledByPowerpack;
  }

  public void setControlledByPowerpack(
      List<PowerpackTemplateVariableContents> controlledByPowerpack) {
    this.controlledByPowerpack = controlledByPowerpack;
  }

  public PowerpackTemplateVariables controlledExternally(
      List<PowerpackTemplateVariableContents> controlledExternally) {
    this.controlledExternally = controlledExternally;
    for (PowerpackTemplateVariableContents item : controlledExternally) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PowerpackTemplateVariables addControlledExternallyItem(
      PowerpackTemplateVariableContents controlledExternallyItem) {
    if (this.controlledExternally == null) {
      this.controlledExternally = new ArrayList<>();
    }
    this.controlledExternally.add(controlledExternallyItem);
    this.unparsed |= controlledExternallyItem.unparsed;
    return this;
  }

  /**
   * Template variables controlled by the external resource, such as the dashboard this powerpack is
   * on.
   *
   * @return controlledExternally
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTROLLED_EXTERNALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PowerpackTemplateVariableContents> getControlledExternally() {
    return controlledExternally;
  }

  public void setControlledExternally(
      List<PowerpackTemplateVariableContents> controlledExternally) {
    this.controlledExternally = controlledExternally;
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
   * @return PowerpackTemplateVariables
   */
  @JsonAnySetter
  public PowerpackTemplateVariables putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PowerpackTemplateVariables object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackTemplateVariables powerpackTemplateVariables = (PowerpackTemplateVariables) o;
    return Objects.equals(
            this.controlledByPowerpack, powerpackTemplateVariables.controlledByPowerpack)
        && Objects.equals(
            this.controlledExternally, powerpackTemplateVariables.controlledExternally)
        && Objects.equals(
            this.additionalProperties, powerpackTemplateVariables.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlledByPowerpack, controlledExternally, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackTemplateVariables {\n");
    sb.append("    controlledByPowerpack: ")
        .append(toIndentedString(controlledByPowerpack))
        .append("\n");
    sb.append("    controlledExternally: ")
        .append(toIndentedString(controlledExternally))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
