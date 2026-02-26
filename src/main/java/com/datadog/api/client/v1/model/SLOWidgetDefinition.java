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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Use the SLO and uptime widget to track your SLOs (Service Level Objectives) and uptime on
 * screenboards and timeboards.
 */
@JsonPropertyOrder({
  SLOWidgetDefinition.JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS,
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
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS = "additional_query_filters";
  private String additionalQueryFilters;

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

  public SLOWidgetDefinition additionalQueryFilters(String additionalQueryFilters) {
    this.additionalQueryFilters = additionalQueryFilters;
    return this;
  }

  /**
   * Additional filters applied to the SLO query.
   *
   * @return additionalQueryFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAdditionalQueryFilters() {
    return additionalQueryFilters;
  }

  public void setAdditionalQueryFilters(String additionalQueryFilters) {
    this.additionalQueryFilters = additionalQueryFilters;
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
  @jakarta.annotation.Nullable
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
   * @return SLOWidgetDefinition
   */
  @JsonAnySetter
  public SLOWidgetDefinition putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.additionalQueryFilters, sloWidgetDefinition.additionalQueryFilters)
        && Objects.equals(this.globalTimeTarget, sloWidgetDefinition.globalTimeTarget)
        && Objects.equals(this.showErrorBudget, sloWidgetDefinition.showErrorBudget)
        && Objects.equals(this.sloId, sloWidgetDefinition.sloId)
        && Objects.equals(this.timeWindows, sloWidgetDefinition.timeWindows)
        && Objects.equals(this.title, sloWidgetDefinition.title)
        && Objects.equals(this.titleAlign, sloWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, sloWidgetDefinition.titleSize)
        && Objects.equals(this.type, sloWidgetDefinition.type)
        && Objects.equals(this.viewMode, sloWidgetDefinition.viewMode)
        && Objects.equals(this.viewType, sloWidgetDefinition.viewType)
        && Objects.equals(this.additionalProperties, sloWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalQueryFilters,
        globalTimeTarget,
        showErrorBudget,
        sloId,
        timeWindows,
        title,
        titleAlign,
        titleSize,
        type,
        viewMode,
        viewType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOWidgetDefinition {\n");
    sb.append("    additionalQueryFilters: ")
        .append(toIndentedString(additionalQueryFilters))
        .append("\n");
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
