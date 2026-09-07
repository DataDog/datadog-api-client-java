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

/** The view of the world that the map should render. */
@JsonPropertyOrder({GeomapWidgetDefinitionView.JSON_PROPERTY_FOCUS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapWidgetDefinitionView {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FOCUS = "focus";
  private String focus;

  public GeomapWidgetDefinitionView() {}

  @JsonCreator
  public GeomapWidgetDefinitionView(
      @JsonProperty(required = true, value = JSON_PROPERTY_FOCUS) String focus) {
    this.focus = focus;
  }

  public GeomapWidgetDefinitionView focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * The 2-letter ISO code of a country to focus the map on, or <code>WORLD</code> for global view,
   * or a region (<code>EMEA</code>, <code>APAC</code>, <code>LATAM</code>), or a continent (<code>
   * NORTH_AMERICA</code>, <code>SOUTH_AMERICA</code>, <code>EUROPE</code>, <code>AFRICA</code>,
   * <code>ASIA</code>, <code>OCEANIA</code>).
   *
   * @return focus
   */
  @JsonProperty(JSON_PROPERTY_FOCUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
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
   * @return GeomapWidgetDefinitionView
   */
  @JsonAnySetter
  public GeomapWidgetDefinitionView putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GeomapWidgetDefinitionView object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapWidgetDefinitionView geomapWidgetDefinitionView = (GeomapWidgetDefinitionView) o;
    return Objects.equals(this.focus, geomapWidgetDefinitionView.focus)
        && Objects.equals(
            this.additionalProperties, geomapWidgetDefinitionView.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(focus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapWidgetDefinitionView {\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
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
