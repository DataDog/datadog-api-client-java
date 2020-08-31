/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.GroupWidgetDefinitionType;
import com.datadog.api.v1.client.model.Widget;
import com.datadog.api.v1.client.model.WidgetLayoutType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The groups widget allows you to keep similar graphs together on your timeboard. Each group has a custom header, can hold one to many graphs, and is collapsible.
 */
@ApiModel(description = "The groups widget allows you to keep similar graphs together on your timeboard. Each group has a custom header, can hold one to many graphs, and is collapsible.")
@JsonPropertyOrder({
  GroupWidgetDefinition.JSON_PROPERTY_LAYOUT_TYPE,
  GroupWidgetDefinition.JSON_PROPERTY_TITLE,
  GroupWidgetDefinition.JSON_PROPERTY_TYPE,
  GroupWidgetDefinition.JSON_PROPERTY_WIDGETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupWidgetDefinition {
  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private WidgetLayoutType layoutType;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GroupWidgetDefinitionType type = GroupWidgetDefinitionType.GROUP;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<Widget> widgets = new ArrayList<>();


  public GroupWidgetDefinition layoutType(WidgetLayoutType layoutType) {
    this.layoutType = layoutType;
    return this;
  }

   /**
   * Get layoutType
   * @return layoutType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WidgetLayoutType getLayoutType() {
    return layoutType;
  }


  public void setLayoutType(WidgetLayoutType layoutType) {
    this.layoutType = layoutType;
  }


  public GroupWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public GroupWidgetDefinition type(GroupWidgetDefinitionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GroupWidgetDefinitionType getType() {
    return type;
  }


  public void setType(GroupWidgetDefinitionType type) {
    this.type = type;
  }


  public GroupWidgetDefinition widgets(List<Widget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public GroupWidgetDefinition addWidgetsItem(Widget widgetsItem) {
    this.widgets.add(widgetsItem);
    return this;
  }

   /**
   * List of widget groups.
   * @return widgets
  **/
  @ApiModelProperty(example = "[{\"definition\":{\"requests\":{\"fill\":{\"q\":\"system.cpu.user\"}},\"type\":\"hostmap\"}}]", required = true, value = "List of widget groups.")
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Widget> getWidgets() {
    return widgets;
  }


  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
  }


  /**
   * Return true if this GroupWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupWidgetDefinition groupWidgetDefinition = (GroupWidgetDefinition) o;
    return Objects.equals(this.layoutType, groupWidgetDefinition.layoutType) &&
        Objects.equals(this.title, groupWidgetDefinition.title) &&
        Objects.equals(this.type, groupWidgetDefinition.type) &&
        Objects.equals(this.widgets, groupWidgetDefinition.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layoutType, title, type, widgets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupWidgetDefinition {\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("}");
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

