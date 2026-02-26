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

/** Powerpack group widget definition object. */
@JsonPropertyOrder({
  PowerpackGroupWidget.JSON_PROPERTY_DEFINITION,
  PowerpackGroupWidget.JSON_PROPERTY_LAYOUT,
  PowerpackGroupWidget.JSON_PROPERTY_LIVE_SPAN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackGroupWidget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private PowerpackGroupWidgetDefinition definition;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private PowerpackGroupWidgetLayout layout;

  public static final String JSON_PROPERTY_LIVE_SPAN = "live_span";
  private WidgetLiveSpan liveSpan;

  public PowerpackGroupWidget() {}

  @JsonCreator
  public PowerpackGroupWidget(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          PowerpackGroupWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public PowerpackGroupWidget definition(PowerpackGroupWidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Powerpack group widget object.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PowerpackGroupWidgetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(PowerpackGroupWidgetDefinition definition) {
    this.definition = definition;
  }

  public PowerpackGroupWidget layout(PowerpackGroupWidgetLayout layout) {
    this.layout = layout;
    this.unparsed |= layout.unparsed;
    return this;
  }

  /**
   * Powerpack group widget layout.
   *
   * @return layout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PowerpackGroupWidgetLayout getLayout() {
    return layout;
  }

  public void setLayout(PowerpackGroupWidgetLayout layout) {
    this.layout = layout;
  }

  public PowerpackGroupWidget liveSpan(WidgetLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    this.unparsed |= !liveSpan.isValid();
    return this;
  }

  /**
   * The available timeframes depend on the widget you are using.
   *
   * @return liveSpan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLiveSpan getLiveSpan() {
    return liveSpan;
  }

  public void setLiveSpan(WidgetLiveSpan liveSpan) {
    if (!liveSpan.isValid()) {
      this.unparsed = true;
    }
    this.liveSpan = liveSpan;
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
   * @return PowerpackGroupWidget
   */
  @JsonAnySetter
  public PowerpackGroupWidget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this PowerpackGroupWidget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackGroupWidget powerpackGroupWidget = (PowerpackGroupWidget) o;
    return Objects.equals(this.definition, powerpackGroupWidget.definition)
        && Objects.equals(this.layout, powerpackGroupWidget.layout)
        && Objects.equals(this.liveSpan, powerpackGroupWidget.liveSpan)
        && Objects.equals(this.additionalProperties, powerpackGroupWidget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, layout, liveSpan, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackGroupWidget {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    liveSpan: ").append(toIndentedString(liveSpan)).append("\n");
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
