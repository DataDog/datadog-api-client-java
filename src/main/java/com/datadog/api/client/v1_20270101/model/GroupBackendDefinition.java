/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  GroupBackendDefinition.JSON_PROPERTY_BACKGROUND_COLOR,
  GroupBackendDefinition.JSON_PROPERTY_BANNER_IMG,
  GroupBackendDefinition.JSON_PROPERTY_DEFAULT_STATE,
  GroupBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  GroupBackendDefinition.JSON_PROPERTY_LAYOUT_TYPE,
  GroupBackendDefinition.JSON_PROPERTY_SHOW_TITLE,
  GroupBackendDefinition.JSON_PROPERTY_TITLE,
  GroupBackendDefinition.JSON_PROPERTY_TYPE,
  GroupBackendDefinition.JSON_PROPERTY_WIDGETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GroupBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BACKGROUND_COLOR = "background_color";
  private String backgroundColor;

  public static final String JSON_PROPERTY_BANNER_IMG = "banner_img";
  private String bannerImg;

  public static final String JSON_PROPERTY_DEFAULT_STATE = "default_state";
  private GroupBackendDefinitionDefaultState defaultState;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LAYOUT_TYPE = "layout_type";
  private LayoutType layoutType;

  public static final String JSON_PROPERTY_SHOW_TITLE = "show_title";
  private Boolean showTitle;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GroupBackendDefinitionType type;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<DashboardBackendWidget> widgets = new ArrayList<>();

  public GroupBackendDefinition() {}

  @JsonCreator
  public GroupBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAYOUT_TYPE) LayoutType layoutType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GroupBackendDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGETS)
          List<DashboardBackendWidget> widgets) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
    this.widgets = widgets;
    for (DashboardBackendWidget item : widgets) {
      this.unparsed |= item.unparsed;
    }
  }

  public GroupBackendDefinition backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return backgroundColor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public GroupBackendDefinition bannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return bannerImg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANNER_IMG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBannerImg() {
    return bannerImg;
  }

  public void setBannerImg(String bannerImg) {
    this.bannerImg = bannerImg;
  }

  public GroupBackendDefinition defaultState(GroupBackendDefinitionDefaultState defaultState) {
    this.defaultState = defaultState;
    this.unparsed |= !defaultState.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return defaultState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GroupBackendDefinitionDefaultState getDefaultState() {
    return defaultState;
  }

  public void setDefaultState(GroupBackendDefinitionDefaultState defaultState) {
    if (!defaultState.isValid()) {
      this.unparsed = true;
    }
    this.defaultState = defaultState;
  }

  public GroupBackendDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GroupBackendDefinition layoutType(LayoutType layoutType) {
    this.layoutType = layoutType;
    this.unparsed |= !layoutType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return layoutType
   */
  @JsonProperty(JSON_PROPERTY_LAYOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LayoutType getLayoutType() {
    return layoutType;
  }

  public void setLayoutType(LayoutType layoutType) {
    if (!layoutType.isValid()) {
      this.unparsed = true;
    }
    this.layoutType = layoutType;
  }

  public GroupBackendDefinition showTitle(Boolean showTitle) {
    this.showTitle = showTitle;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showTitle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowTitle() {
    return showTitle;
  }

  public void setShowTitle(Boolean showTitle) {
    this.showTitle = showTitle;
  }

  public GroupBackendDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GroupBackendDefinition type(GroupBackendDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GroupBackendDefinitionType getType() {
    return type;
  }

  public void setType(GroupBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public GroupBackendDefinition widgets(List<DashboardBackendWidget> widgets) {
    this.widgets = widgets;
    for (DashboardBackendWidget item : widgets) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GroupBackendDefinition addWidgetsItem(DashboardBackendWidget widgetsItem) {
    this.widgets.add(widgetsItem);
    this.unparsed |= widgetsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return widgets
   */
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<DashboardBackendWidget> getWidgets() {
    return widgets;
  }

  public void setWidgets(List<DashboardBackendWidget> widgets) {
    this.widgets = widgets;
    if (widgets != null) {
      for (DashboardBackendWidget item : widgets) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  /** Return true if this GroupBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupBackendDefinition groupBackendDefinition = (GroupBackendDefinition) o;
    return Objects.equals(this.backgroundColor, groupBackendDefinition.backgroundColor)
        && Objects.equals(this.bannerImg, groupBackendDefinition.bannerImg)
        && Objects.equals(this.defaultState, groupBackendDefinition.defaultState)
        && Objects.equals(this.description, groupBackendDefinition.description)
        && Objects.equals(this.layoutType, groupBackendDefinition.layoutType)
        && Objects.equals(this.showTitle, groupBackendDefinition.showTitle)
        && Objects.equals(this.title, groupBackendDefinition.title)
        && Objects.equals(this.type, groupBackendDefinition.type)
        && Objects.equals(this.widgets, groupBackendDefinition.widgets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        backgroundColor,
        bannerImg,
        defaultState,
        description,
        layoutType,
        showTitle,
        title,
        type,
        widgets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBackendDefinition {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    bannerImg: ").append(toIndentedString(bannerImg)).append("\n");
    sb.append("    defaultState: ").append(toIndentedString(defaultState)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
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
