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

/** Powerpack group widget definition of individual widgets. */
@JsonPropertyOrder({
  PowerpackInnerWidgets.JSON_PROPERTY_DEFINITION,
  PowerpackInnerWidgets.JSON_PROPERTY_LAYOUT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackInnerWidgets {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private Map<String, Object> definition = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private PowerpackInnerWidgetLayout layout;

  public PowerpackInnerWidgets() {}

  @JsonCreator
  public PowerpackInnerWidgets(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          Map<String, Object> definition) {
    this.definition = definition;
  }

  public PowerpackInnerWidgets definition(Map<String, Object> definition) {
    this.definition = definition;
    return this;
  }

  public PowerpackInnerWidgets putDefinitionItem(String key, Object definitionItem) {
    this.definition.put(key, definitionItem);
    return this;
  }

  /**
   * Information about widget.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getDefinition() {
    return definition;
  }

  public void setDefinition(Map<String, Object> definition) {
    this.definition = definition;
  }

  public PowerpackInnerWidgets layout(PowerpackInnerWidgetLayout layout) {
    this.layout = layout;
    this.unparsed |= layout.unparsed;
    return this;
  }

  /**
   * Powerpack inner widget layout.
   *
   * @return layout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PowerpackInnerWidgetLayout getLayout() {
    return layout;
  }

  public void setLayout(PowerpackInnerWidgetLayout layout) {
    this.layout = layout;
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
   * @return PowerpackInnerWidgets
   */
  @JsonAnySetter
  public PowerpackInnerWidgets putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PowerpackInnerWidgets object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackInnerWidgets powerpackInnerWidgets = (PowerpackInnerWidgets) o;
    return Objects.equals(this.definition, powerpackInnerWidgets.definition)
        && Objects.equals(this.layout, powerpackInnerWidgets.layout)
        && Objects.equals(this.additionalProperties, powerpackInnerWidgets.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, layout, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackInnerWidgets {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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
