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
  SloBackendDefinition.JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS,
  SloBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  SloBackendDefinition.JSON_PROPERTY_GLOBAL_TIME_TARGET,
  SloBackendDefinition.JSON_PROPERTY_NOTES,
  SloBackendDefinition.JSON_PROPERTY_SHOW_ERROR_BUDGET,
  SloBackendDefinition.JSON_PROPERTY_SLO_ID,
  SloBackendDefinition.JSON_PROPERTY_TIME,
  SloBackendDefinition.JSON_PROPERTY_TIME_WINDOWS,
  SloBackendDefinition.JSON_PROPERTY_TITLE,
  SloBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  SloBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  SloBackendDefinition.JSON_PROPERTY_TYPE,
  SloBackendDefinition.JSON_PROPERTY_VIEW_MODE,
  SloBackendDefinition.JSON_PROPERTY_VIEW_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SloBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_QUERY_FILTERS = "additional_query_filters";
  private String additionalQueryFilters;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GLOBAL_TIME_TARGET = "global_time_target";
  private String globalTimeTarget;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_SHOW_ERROR_BUDGET = "show_error_budget";
  private Boolean showErrorBudget;

  public static final String JSON_PROPERTY_SLO_ID = "slo_id";
  private String sloId;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TIME_WINDOWS = "time_windows";
  private List<SloWidgetTimeWindow> timeWindows = new ArrayList<>();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SloBackendDefinitionType type;

  public static final String JSON_PROPERTY_VIEW_MODE = "view_mode";
  private SloWidgetViewMode viewMode;

  public static final String JSON_PROPERTY_VIEW_TYPE = "view_type";
  private SloBackendDefinitionViewType viewType;

  public SloBackendDefinition() {}

  @JsonCreator
  public SloBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_SHOW_ERROR_BUDGET)
          Boolean showErrorBudget,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLO_ID) String sloId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_WINDOWS)
          List<SloWidgetTimeWindow> timeWindows,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SloBackendDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_MODE) SloWidgetViewMode viewMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW_TYPE)
          SloBackendDefinitionViewType viewType) {
    this.showErrorBudget = showErrorBudget;
    this.sloId = sloId;
    if (sloId != null) {}
    this.timeWindows = timeWindows;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.viewMode = viewMode;
    this.unparsed |= !viewMode.isValid();
    this.viewType = viewType;
    this.unparsed |= !viewType.isValid();
  }

  public SloBackendDefinition additionalQueryFilters(String additionalQueryFilters) {
    this.additionalQueryFilters = additionalQueryFilters;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public SloBackendDefinition description(String description) {
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

  public SloBackendDefinition globalTimeTarget(String globalTimeTarget) {
    this.globalTimeTarget = globalTimeTarget;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public SloBackendDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return notes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public SloBackendDefinition showErrorBudget(Boolean showErrorBudget) {
    this.showErrorBudget = showErrorBudget;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showErrorBudget
   */
  @JsonProperty(JSON_PROPERTY_SHOW_ERROR_BUDGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getShowErrorBudget() {
    return showErrorBudget;
  }

  public void setShowErrorBudget(Boolean showErrorBudget) {
    this.showErrorBudget = showErrorBudget;
  }

  public SloBackendDefinition sloId(String sloId) {
    this.sloId = sloId;
    if (sloId != null) {}
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sloId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSloId() {
    return sloId;
  }

  public void setSloId(String sloId) {
    this.sloId = sloId;
  }

  public SloBackendDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTime getTime() {
    return time;
  }

  public void setTime(WidgetTime time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public SloBackendDefinition timeWindows(List<SloWidgetTimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
    return this;
  }

  public SloBackendDefinition addTimeWindowsItem(SloWidgetTimeWindow timeWindowsItem) {
    this.timeWindows.add(timeWindowsItem);
    this.unparsed |= !timeWindowsItem.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeWindows
   */
  @JsonProperty(JSON_PROPERTY_TIME_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SloWidgetTimeWindow> getTimeWindows() {
    return timeWindows;
  }

  public void setTimeWindows(List<SloWidgetTimeWindow> timeWindows) {
    this.timeWindows = timeWindows;
  }

  public SloBackendDefinition title(String title) {
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

  public SloBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public SloBackendDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public SloBackendDefinition type(SloBackendDefinitionType type) {
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
  public SloBackendDefinitionType getType() {
    return type;
  }

  public void setType(SloBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SloBackendDefinition viewMode(SloWidgetViewMode viewMode) {
    this.viewMode = viewMode;
    this.unparsed |= !viewMode.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return viewMode
   */
  @JsonProperty(JSON_PROPERTY_VIEW_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SloWidgetViewMode getViewMode() {
    return viewMode;
  }

  public void setViewMode(SloWidgetViewMode viewMode) {
    if (!viewMode.isValid()) {
      this.unparsed = true;
    }
    this.viewMode = viewMode;
  }

  public SloBackendDefinition viewType(SloBackendDefinitionViewType viewType) {
    this.viewType = viewType;
    this.unparsed |= !viewType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return viewType
   */
  @JsonProperty(JSON_PROPERTY_VIEW_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SloBackendDefinitionViewType getViewType() {
    return viewType;
  }

  public void setViewType(SloBackendDefinitionViewType viewType) {
    if (!viewType.isValid()) {
      this.unparsed = true;
    }
    this.viewType = viewType;
  }

  /** Return true if this SloBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SloBackendDefinition sloBackendDefinition = (SloBackendDefinition) o;
    return Objects.equals(this.additionalQueryFilters, sloBackendDefinition.additionalQueryFilters)
        && Objects.equals(this.description, sloBackendDefinition.description)
        && Objects.equals(this.globalTimeTarget, sloBackendDefinition.globalTimeTarget)
        && Objects.equals(this.notes, sloBackendDefinition.notes)
        && Objects.equals(this.showErrorBudget, sloBackendDefinition.showErrorBudget)
        && Objects.equals(this.sloId, sloBackendDefinition.sloId)
        && Objects.equals(this.time, sloBackendDefinition.time)
        && Objects.equals(this.timeWindows, sloBackendDefinition.timeWindows)
        && Objects.equals(this.title, sloBackendDefinition.title)
        && Objects.equals(this.titleAlign, sloBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, sloBackendDefinition.titleSize)
        && Objects.equals(this.type, sloBackendDefinition.type)
        && Objects.equals(this.viewMode, sloBackendDefinition.viewMode)
        && Objects.equals(this.viewType, sloBackendDefinition.viewType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalQueryFilters,
        description,
        globalTimeTarget,
        notes,
        showErrorBudget,
        sloId,
        time,
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
    sb.append("class SloBackendDefinition {\n");
    sb.append("    additionalQueryFilters: ")
        .append(toIndentedString(additionalQueryFilters))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    globalTimeTarget: ").append(toIndentedString(globalTimeTarget)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    showErrorBudget: ").append(toIndentedString(showErrorBudget)).append("\n");
    sb.append("    sloId: ").append(toIndentedString(sloId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeWindows: ").append(toIndentedString(timeWindows)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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
