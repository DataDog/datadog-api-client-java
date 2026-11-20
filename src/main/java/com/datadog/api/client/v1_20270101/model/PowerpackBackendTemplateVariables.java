/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  PowerpackBackendTemplateVariables.JSON_PROPERTY_CONTROLLED_BY_POWERPACK,
  PowerpackBackendTemplateVariables.JSON_PROPERTY_CONTROLLED_EXTERNALLY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackBackendTemplateVariables {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTROLLED_BY_POWERPACK = "controlled_by_powerpack";
  private List<PowerpackBackendTemplateVariable> controlledByPowerpack = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTROLLED_EXTERNALLY = "controlled_externally";
  private List<PowerpackBackendTemplateVariable> controlledExternally = new ArrayList<>();

  public PowerpackBackendTemplateVariables() {}

  @JsonCreator
  public PowerpackBackendTemplateVariables(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTROLLED_BY_POWERPACK)
          List<PowerpackBackendTemplateVariable> controlledByPowerpack,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTROLLED_EXTERNALLY)
          List<PowerpackBackendTemplateVariable> controlledExternally) {
    this.controlledByPowerpack = controlledByPowerpack;
    for (PowerpackBackendTemplateVariable item : controlledByPowerpack) {
      this.unparsed |= item.unparsed;
    }
    this.controlledExternally = controlledExternally;
    for (PowerpackBackendTemplateVariable item : controlledExternally) {
      this.unparsed |= item.unparsed;
    }
  }

  public PowerpackBackendTemplateVariables controlledByPowerpack(
      List<PowerpackBackendTemplateVariable> controlledByPowerpack) {
    this.controlledByPowerpack = controlledByPowerpack;
    for (PowerpackBackendTemplateVariable item : controlledByPowerpack) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PowerpackBackendTemplateVariables addControlledByPowerpackItem(
      PowerpackBackendTemplateVariable controlledByPowerpackItem) {
    this.controlledByPowerpack.add(controlledByPowerpackItem);
    this.unparsed |= controlledByPowerpackItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return controlledByPowerpack
   */
  @JsonProperty(JSON_PROPERTY_CONTROLLED_BY_POWERPACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PowerpackBackendTemplateVariable> getControlledByPowerpack() {
    return controlledByPowerpack;
  }

  public void setControlledByPowerpack(
      List<PowerpackBackendTemplateVariable> controlledByPowerpack) {
    this.controlledByPowerpack = controlledByPowerpack;
    if (controlledByPowerpack != null) {
      for (PowerpackBackendTemplateVariable item : controlledByPowerpack) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PowerpackBackendTemplateVariables controlledExternally(
      List<PowerpackBackendTemplateVariable> controlledExternally) {
    this.controlledExternally = controlledExternally;
    for (PowerpackBackendTemplateVariable item : controlledExternally) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public PowerpackBackendTemplateVariables addControlledExternallyItem(
      PowerpackBackendTemplateVariable controlledExternallyItem) {
    this.controlledExternally.add(controlledExternallyItem);
    this.unparsed |= controlledExternallyItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return controlledExternally
   */
  @JsonProperty(JSON_PROPERTY_CONTROLLED_EXTERNALLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PowerpackBackendTemplateVariable> getControlledExternally() {
    return controlledExternally;
  }

  public void setControlledExternally(List<PowerpackBackendTemplateVariable> controlledExternally) {
    this.controlledExternally = controlledExternally;
    if (controlledExternally != null) {
      for (PowerpackBackendTemplateVariable item : controlledExternally) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this PowerpackBackendTemplateVariables object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackBackendTemplateVariables powerpackBackendTemplateVariables =
        (PowerpackBackendTemplateVariables) o;
    return Objects.equals(
            this.controlledByPowerpack, powerpackBackendTemplateVariables.controlledByPowerpack)
        && Objects.equals(
            this.controlledExternally, powerpackBackendTemplateVariables.controlledExternally);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlledByPowerpack, controlledExternally);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackBackendTemplateVariables {\n");
    sb.append("    controlledByPowerpack: ")
        .append(toIndentedString(controlledByPowerpack))
        .append("\n");
    sb.append("    controlledExternally: ")
        .append(toIndentedString(controlledExternally))
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
