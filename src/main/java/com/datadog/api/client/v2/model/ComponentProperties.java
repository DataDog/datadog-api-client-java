/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/**
 * Properties of a UI component. Different component types can have their own additional unique
 * properties. See the <a
 * href="https://docs.datadoghq.com/service_management/app_builder/components/">components
 * documentation</a> for more detail on each component type and its properties.
 */
@JsonPropertyOrder({
  ComponentProperties.JSON_PROPERTY_CHILDREN,
  ComponentProperties.JSON_PROPERTY_IS_VISIBLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComponentProperties {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<Component> children = null;

  public static final String JSON_PROPERTY_IS_VISIBLE = "isVisible";
  private ComponentPropertiesIsVisible isVisible;

  public ComponentProperties children(List<Component> children) {
    this.children = children;
    for (Component item : children) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ComponentProperties addChildrenItem(Component childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    this.unparsed |= childrenItem.unparsed;
    return this;
  }

  /**
   * The child components of the UI component.
   *
   * @return children
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Component> getChildren() {
    return children;
  }

  public void setChildren(List<Component> children) {
    this.children = children;
  }

  public ComponentProperties isVisible(ComponentPropertiesIsVisible isVisible) {
    this.isVisible = isVisible;
    this.unparsed |= isVisible.unparsed;
    return this;
  }

  /**
   * Whether the UI component is visible. If this is a string, it must be a valid JavaScript
   * expression that evaluates to a boolean.
   *
   * @return isVisible
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ComponentPropertiesIsVisible getIsVisible() {
    return isVisible;
  }

  public void setIsVisible(ComponentPropertiesIsVisible isVisible) {
    this.isVisible = isVisible;
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
   * @return ComponentProperties
   */
  @JsonAnySetter
  public ComponentProperties putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ComponentProperties object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentProperties componentProperties = (ComponentProperties) o;
    return Objects.equals(this.children, componentProperties.children)
        && Objects.equals(this.isVisible, componentProperties.isVisible)
        && Objects.equals(this.additionalProperties, componentProperties.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, isVisible, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentProperties {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
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
