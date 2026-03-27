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
   * <p>Powerpack group widget object.</p>
 */
@JsonPropertyOrder({
  PowerpackGroupWidgetDefinition.JSON_PROPERTY_LAYOUT_TYPE,
  PowerpackGroupWidgetDefinition.JSON_PROPERTY_SHOW_TITLE,
  PowerpackGroupWidgetDefinition.JSON_PROPERTY_TITLE,
  PowerpackGroupWidgetDefinition.JSON_PROPERTY_TYPE,
  PowerpackGroupWidgetDefinition.JSON_PROPERTY_WIDGETS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PowerpackGroupWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private String layoutType;

  public static final String JSON_PROPERTY_SHOW_TITLE = "show_title";
  private Boolean showTitle;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<PowerpackInnerWidgets> widgets = new ArrayList<>();

  public PowerpackGroupWidgetDefinition() {}

  @JsonCreator
  public PowerpackGroupWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_LAYOUT_TYPE)String layoutType,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type,
            @JsonProperty(required=true, value=JSON_PROPERTY_WIDGETS)List<PowerpackInnerWidgets> widgets) {
        this.layoutType = layoutType;
        this.type = type;
        this.widgets = widgets;
  }
  public PowerpackGroupWidgetDefinition layoutType(String layoutType) {
    this.layoutType = layoutType;
    return this;
  }

  /**
   * <p>Layout type of widgets.</p>
   * @return layoutType
  **/
      @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLayoutType() {
        return layoutType;
      }
  public void setLayoutType(String layoutType) {
    this.layoutType = layoutType;
  }
  public PowerpackGroupWidgetDefinition showTitle(Boolean showTitle) {
    this.showTitle = showTitle;
    return this;
  }

  /**
   * <p>Boolean indicating whether powerpack group title should be visible or not.</p>
   * @return showTitle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShowTitle() {
        return showTitle;
      }
  public void setShowTitle(Boolean showTitle) {
    this.showTitle = showTitle;
  }
  public PowerpackGroupWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Name for the group widget.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public PowerpackGroupWidgetDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Type of widget, must be group.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }
  public PowerpackGroupWidgetDefinition widgets(List<PowerpackInnerWidgets> widgets) {
    this.widgets = widgets;
    for (PowerpackInnerWidgets item : widgets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public PowerpackGroupWidgetDefinition addWidgetsItem(PowerpackInnerWidgets widgetsItem) {
    this.widgets.add(widgetsItem);
    this.unparsed |= widgetsItem.unparsed;
    return this;
  }

  /**
   * <p>Widgets inside the powerpack.</p>
   * @return widgets
  **/
      @JsonProperty(JSON_PROPERTY_WIDGETS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<PowerpackInnerWidgets> getWidgets() {
        return widgets;
      }
  public void setWidgets(List<PowerpackInnerWidgets> widgets) {
    this.widgets = widgets;
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
   * @return PowerpackGroupWidgetDefinition
   */
  @JsonAnySetter
  public PowerpackGroupWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this PowerpackGroupWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerpackGroupWidgetDefinition powerpackGroupWidgetDefinition = (PowerpackGroupWidgetDefinition) o;
    return Objects.equals(this.layoutType, powerpackGroupWidgetDefinition.layoutType) && Objects.equals(this.showTitle, powerpackGroupWidgetDefinition.showTitle) && Objects.equals(this.title, powerpackGroupWidgetDefinition.title) && Objects.equals(this.type, powerpackGroupWidgetDefinition.type) && Objects.equals(this.widgets, powerpackGroupWidgetDefinition.widgets) && Objects.equals(this.additionalProperties, powerpackGroupWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(layoutType,showTitle,title,type,widgets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerpackGroupWidgetDefinition {\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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
