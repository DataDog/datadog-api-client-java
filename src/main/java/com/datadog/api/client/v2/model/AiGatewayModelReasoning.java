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

/** Supported reasoning controls. Absence means controls are unknown or unavailable. */
@JsonPropertyOrder({AiGatewayModelReasoning.JSON_PROPERTY_CONTROLS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelReasoning {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTROLS = "controls";
  private List<AiGatewayModelReasoningControl> controls = new ArrayList<>();

  public AiGatewayModelReasoning() {}

  @JsonCreator
  public AiGatewayModelReasoning(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTROLS)
          List<AiGatewayModelReasoningControl> controls) {
    this.controls = controls;
    for (AiGatewayModelReasoningControl item : controls) {
      this.unparsed |= item.unparsed;
    }
  }

  public AiGatewayModelReasoning controls(List<AiGatewayModelReasoningControl> controls) {
    this.controls = controls;
    for (AiGatewayModelReasoningControl item : controls) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayModelReasoning addControlsItem(AiGatewayModelReasoningControl controlsItem) {
    this.controls.add(controlsItem);
    this.unparsed |= controlsItem.unparsed;
    return this;
  }

  /**
   * Getcontrols
   *
   * @return controls
   */
  @JsonProperty(JSON_PROPERTY_CONTROLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayModelReasoningControl> getControls() {
    return controls;
  }

  public void setControls(List<AiGatewayModelReasoningControl> controls) {
    this.controls = controls;
    if (controls != null) {
      for (AiGatewayModelReasoningControl item : controls) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return AiGatewayModelReasoning
   */
  @JsonAnySetter
  public AiGatewayModelReasoning putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelReasoning object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelReasoning aiGatewayModelReasoning = (AiGatewayModelReasoning) o;
    return Objects.equals(this.controls, aiGatewayModelReasoning.controls)
        && Objects.equals(this.additionalProperties, aiGatewayModelReasoning.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelReasoning {\n");
    sb.append("    controls: ").append(toIndentedString(controls)).append("\n");
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
