/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
   * <p>The groups widget allows you to keep similar graphs together on your timeboard. Each group has a custom header, can hold one to many graphs, and is collapsible.</p>
 */
@JsonPropertyOrder({
  GroupWidgetDefinition.JSON_PROPERTY_BACKGROUND_COLOR,
  GroupWidgetDefinition.JSON_PROPERTY_BANNER_IMG,
  GroupWidgetDefinition.JSON_PROPERTY_LAYOUT_TYPE,
  GroupWidgetDefinition.JSON_PROPERTY_SHOW_TITLE,
  GroupWidgetDefinition.JSON_PROPERTY_TITLE,
  GroupWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  GroupWidgetDefinition.JSON_PROPERTY_TYPE,
  GroupWidgetDefinition.JSON_PROPERTY_WIDGETS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GroupWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "background_color";
  private String backgroundColor;

  public static final String JSON_PROPERTY_BANNER_IMG = "banner_img";
  private String bannerImg;

  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private WidgetLayoutType layoutType;

  public static final String JSON_PROPERTY_SHOW_TITLE = "show_title";
  private Boolean showTitle = true;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GroupWidgetDefinitionType type = GroupWidgetDefinitionType.GROUP;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<Widget> widgets = new ArrayList<>();

  public GroupWidgetDefinition() {}

  @JsonCreator
  public GroupWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_LAYOUT_TYPE)WidgetLayoutType layoutType,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)GroupWidgetDefinitionType type,
            @JsonProperty(required=true, value=JSON_PROPERTY_WIDGETS)List<Widget> widgets) {
        this.layoutType = layoutType;
        this.unparsed |= !layoutType.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
        this.widgets = widgets;
  }
  public GroupWidgetDefinition backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * <p>Background color of the group title.</p>
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
  public GroupWidgetDefinition bannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
    return this;
  }

  /**
   * <p>URL of image to display as a banner for the group.</p>
   * @return bannerImg
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BANNER_IMG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBannerImg() {
        return bannerImg;
      }
  public void setBannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
  }
  public GroupWidgetDefinition layoutType(WidgetLayoutType layoutType) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    return this;
  }

  /**
   * <p>Layout type of the group.</p>
   * @return layoutType
  **/
      @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public WidgetLayoutType getLayoutType() {
        return layoutType;
      }
  public void setLayoutType(WidgetLayoutType layoutType) {
    if (!layoutType.isValid()) {
        this.unparsed = true;
    }
    this.layoutType = layoutType;
  }
  public GroupWidgetDefinition showTitle(Boolean showTitle) {
    this.showTitle = showTitle;
    return this;
  }

  /**
   * <p>Whether to show the title or not.</p>
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
  public GroupWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of the widget.</p>
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
  public GroupWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTitleAlign() {
        return titleAlign;
      }
  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
        this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }
  public GroupWidgetDefinition type(GroupWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the group widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public GroupWidgetDefinitionType getType() {
        return type;
      }
  public void setType(GroupWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public GroupWidgetDefinition widgets(List<Widget> widgets) {
    this.widgets = widgets;
    for (Widget item : widgets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public GroupWidgetDefinition addWidgetsItem(Widget widgetsItem) {
    this.widgets.add(widgetsItem);
    this.unparsed |= widgetsItem.unparsed;
    return this;
  }

  /**
   * <p>List of widget groups.</p>
   * @return widgets
  **/
      @JsonProperty(JSON_PROPERTY_WIDGETS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Widget> getWidgets() {
        return widgets;
      }
  public void setWidgets(List<Widget> widgets) {
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
   * @return GroupWidgetDefinition
   */
  @JsonAnySetter
  public GroupWidgetDefinition putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.backgroundColor, groupWidgetDefinition.backgroundColor) && Objects.equals(this.bannerImg, groupWidgetDefinition.bannerImg) && Objects.equals(this.layoutType, groupWidgetDefinition.layoutType) && Objects.equals(this.showTitle, groupWidgetDefinition.showTitle) && Objects.equals(this.title, groupWidgetDefinition.title) && Objects.equals(this.titleAlign, groupWidgetDefinition.titleAlign) && Objects.equals(this.type, groupWidgetDefinition.type) && Objects.equals(this.widgets, groupWidgetDefinition.widgets) && Objects.equals(this.additionalProperties, groupWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor,bannerImg,layoutType,showTitle,title,titleAlign,type,widgets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupWidgetDefinition {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    bannerImg: ").append(toIndentedString(bannerImg)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
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
