/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Properties of a grid component.</p>
 */
@JsonPropertyOrder({
  ComponentGridProperties.JSON_PROPERTY_BACKGROUND_COLOR,
  ComponentGridProperties.JSON_PROPERTY_CHILDREN,
  ComponentGridProperties.JSON_PROPERTY_IS_VISIBLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ComponentGridProperties {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "backgroundColor";
  private String backgroundColor = "default";

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<Component> children = null;

  public static final String JSON_PROPERTY_IS_VISIBLE = "isVisible";
  private ComponentGridPropertiesIsVisible isVisible;

  public ComponentGridProperties backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * <p>The background color of the grid.</p>
   * @return backgroundColor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBackgroundColor() {
        return backgroundColor;
      }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }
  public ComponentGridProperties children(List<Component> children) {
    this.children = children;
    for (Component item : children) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ComponentGridProperties addChildrenItem(Component childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    this.unparsed |= childrenItem.unparsed;
    return this;
  }

  /**
   * <p>The child components of the grid.</p>
   * @return children
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHILDREN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Component> getChildren() {
        return children;
      }
  public void setChildren(List<Component> children) {
    this.children = children;
  }
  public ComponentGridProperties isVisible(ComponentGridPropertiesIsVisible isVisible) {
    this.isVisible = isVisible;
    this.unparsed |= isVisible.unparsed;
    return this;
  }

  /**
   * <p>Whether the grid component and its children are visible. If a string, it must be a valid JavaScript expression that evaluates to a boolean.</p>
   * @return isVisible
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_VISIBLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ComponentGridPropertiesIsVisible getIsVisible() {
        return isVisible;
      }
  public void setIsVisible(ComponentGridPropertiesIsVisible isVisible) {
    this.isVisible = isVisible;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ComponentGridProperties
   */
  @JsonAnySetter
  public ComponentGridProperties putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ComponentGridProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentGridProperties componentGridProperties = (ComponentGridProperties) o;
    return Objects.equals(this.backgroundColor, componentGridProperties.backgroundColor) && Objects.equals(this.children, componentGridProperties.children) && Objects.equals(this.isVisible, componentGridProperties.isVisible) && Objects.equals(this.additionalProperties, componentGridProperties.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor,children,isVisible, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentGridProperties {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
