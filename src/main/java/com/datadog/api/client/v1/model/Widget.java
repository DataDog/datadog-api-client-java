/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
 * Information about widget.
 *
 * <p><strong>Note</strong>: The <code>layout</code> property is required for widgets in dashboards
 * with <code>free</code> <code>layout_type</code>. For the <strong>new dashboard layout</strong>,
 * the <code>layout</code> property depends on the <code>reflow_type</code> of the dashboard. - If
 * <code>reflow_type</code> is <code>fixed</code>, <code>layout</code> is required. - If <code>
 * reflow_type</code> is <code>auto</code>, <code>layout</code> should not be set.
 */
@JsonPropertyOrder({
  Widget.JSON_PROPERTY_DEFINITION,
  Widget.JSON_PROPERTY_ID,
  Widget.JSON_PROPERTY_LAYOUT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Widget {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private WidgetDefinition definition;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private WidgetLayout layout;

  public Widget() {}

  @JsonCreator
  public Widget(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          WidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
  }

  public Widget definition(WidgetDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * <a href="https://docs.datadoghq.com/dashboards/widgets/">Definition of the widget</a>.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(WidgetDefinition definition) {
    this.definition = definition;
  }

  public Widget id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the widget.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Widget layout(WidgetLayout layout) {
    this.layout = layout;
    this.unparsed |= layout.unparsed;
    return this;
  }

  /**
   * The layout for a widget on a <code>free</code> or <strong>new dashboard layout</strong>
   * dashboard.
   *
   * @return layout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLayout getLayout() {
    return layout;
  }

  public void setLayout(WidgetLayout layout) {
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
   * @return Widget
   */
  @JsonAnySetter
  public Widget putAdditionalProperty(String key, Object value) {
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

  /** Return true if this Widget object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Widget widget = (Widget) o;
    return Objects.equals(this.definition, widget.definition)
        && Objects.equals(this.id, widget.id)
        && Objects.equals(this.layout, widget.layout)
        && Objects.equals(this.additionalProperties, widget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definition, id, layout, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Widget {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
