/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Use the SLO and uptime widget to track your SLOs (Service Level Objectives) and uptime on
 * screenboards and timeboards.
 */
@JsonPropertyOrder({
  SLOWidgetDefinition.JSON_PROPERTY_GLOBAL_TIME_TARGET,
  SLOWidgetDefinition.JSON_PROPERTY_SHOW_ERROR_BUDGET,
  SLOWidgetDefinition.JSON_PROPERTY_SLO_ID,
  SLOWidgetDefinition.JSON_PROPERTY_TIME_WINDOWS,
  SLOWidgetDefinition.JSON_PROPERTY_TITLE,
  SLOWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  SLOWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  SLOWidgetDefinition.JSON_PROPERTY_TYPE,
  SLOWidgetDefinition.JSON_PROPERTY_VIEW_MODE,
  SLOWidgetDefinition.JSON_PROPERTY_VIEW_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GLOBAL_TIME_TARGET = "global_time_target";
  private String globalTimeTarget;

  public static final String JSON_PROPERTY_SHOW_ERROR_BUDGET = "show_error_budget";
  private Boolean showErrorBudget;

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_TIME_WINDOWS = "time_windows";
  private List<WidgetTimeWindows> timeWindows = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOWidgetDefinitionType type = SLOWidgetDefinitionType.SLO;

  public static final String JSON_PROPERTY_VIEW_MODE = "view_mode";
  private WidgetViewMode viewMode;

  public static final String JSON_PROPERTY_VIEW_TYPE = "view_type";
  private String viewType = "detail";

  public SLOWidgetDefinition() {}

  @JsonCreator
  public SLOWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SLOWidgetDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_TYPE) String viewType) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.viewType = viewType;
  }

  public SLOWidgetDefinition globalTimeTarget(String globalTimeTarget) {
    this.globalTimeTarget = globalTimeTarget;
    return this;
  }

  /**
   * Defined global time target.
   *
   * @return globalTimeTarget
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_TIME_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGlobalTimeTarget() {
    return globalTimeTarget;
  }

  public void setGlobalTimeTarget(String globalTimeTarget) {
    this.globalTimeTarget = globalTimeTarget;
  }

  public SLOWidgetDefinition showErrorBudget(Boolean showErrorBudget) {
    this.showErrorBudget = showErrorBudget;
    return this;
  }

  /**
   * Defined error budget.
   *
   * @return showErrorBudget
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_ERROR_BUDGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowErrorBudget() {
    return showErrorBudget;
  }

  public void setShowErrorBudget(Boolean showErrorBudget) {
    this.showErrorBudget = showErrorBudget;
  }

  public SLOWidgetDefinition sloId(String sloId) {
    this.sloId = sloId;
    return this;
  }

  /**
   * ID of the SLO displayed.
   *
   * @return sloId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSloId() {
    return sloId;
  }

  public void setSloId(String sloId) {
    this.sloId = sloId;
  }

  public SLOWidgetDefinition timeWindows(List<WidgetTimeWindows> timeWindows) {
    this.timeWindows = timeWindows;
    return this;
  }

  public SLOWidgetDefinition addTimeWindowsItem(WidgetTimeWindows timeWindowsItem) {
    if (this.timeWindows == null) {
      this.timeWindows = new ArrayList<>();
    }
    this.timeWindows.add(timeWindowsItem);
    this.unparsed |= !timeWindowsItem.isValid();
    return this;
  }

  /**
   * Times being monitored.
   *
   * @return timeWindows
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetTimeWindows> getTimeWindows() {
    return timeWindows;
  }

  public void setTimeWindows(List<WidgetTimeWindows> timeWindows) {
    this.timeWindows = timeWindows;
  }

  public SLOWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the widget.
   *
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SLOWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * How to align the text on the widget.
   *
   * @return titleAlign
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }

  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
      this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }

  public SLOWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Size of the title.
   *
   * @return titleSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitleSize() {
    return titleSize;
  }

  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }

  public SLOWidgetDefinition type(SLOWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the SLO widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOWidgetDefinitionType getType() {
    return type;
  }

  public void setType(SLOWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SLOWidgetDefinition viewMode(WidgetViewMode viewMode) {
    this.viewMode = viewMode;
    this.unparsed |= !viewMode.isValid();
    return this;
  }

  /**
   * Define how you want the SLO to be displayed.
   *
   * @return viewMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetViewMode getViewMode() {
    return viewMode;
  }

  public void setViewMode(WidgetViewMode viewMode) {
    if (!viewMode.isValid()) {
      this.unparsed = true;
    }
    this.viewMode = viewMode;
  }

  public SLOWidgetDefinition viewType(String viewType) {
    this.viewType = viewType;
    return this;
  }

  /**
   * Type of view displayed by the widget.
   *
   * @return viewType
   */
  @JsonProperty(JSON_PROPERTY_VIEW_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getViewType() {
    return viewType;
  }

  public void setViewType(String viewType) {
    this.viewType = viewType;
  }

  /** Return true if this SLOWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOWidgetDefinition sloWidgetDefinition = (SLOWidgetDefinition) o;
    return Objects.equals(this.globalTimeTarget, sloWidgetDefinition.globalTimeTarget)
        && Objects.equals(this.showErrorBudget, sloWidgetDefinition.showErrorBudget)
        && Objects.equals(this.sloId, sloWidgetDefinition.sloId)
        && Objects.equals(this.timeWindows, sloWidgetDefinition.timeWindows)
        && Objects.equals(this.title, sloWidgetDefinition.title)
        && Objects.equals(this.titleAlign, sloWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, sloWidgetDefinition.titleSize)
        && Objects.equals(this.type, sloWidgetDefinition.type)
        && Objects.equals(this.viewMode, sloWidgetDefinition.viewMode)
        && Objects.equals(this.viewType, sloWidgetDefinition.viewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        globalTimeTarget,
        showErrorBudget,
        sloId,
        timeWindows,
        title,
        titleAlign,
        titleSize,
        type,
        viewMode,
        viewType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOWidgetDefinition {\n");
    sb.append("    globalTimeTarget: ").append(toIndentedString(globalTimeTarget)).append("\n");
    sb.append("    showErrorBudget: ").append(toIndentedString(showErrorBudget)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    timeWindows: ").append(toIndentedString(timeWindows)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
    sb.append("}");
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