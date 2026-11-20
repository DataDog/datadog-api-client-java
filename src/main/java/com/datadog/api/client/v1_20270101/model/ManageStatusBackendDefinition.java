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
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ManageStatusBackendDefinition.JSON_PROPERTY_COLOR_PREFERENCE,
  ManageStatusBackendDefinition.JSON_PROPERTY_COUNT,
  ManageStatusBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  ManageStatusBackendDefinition.JSON_PROPERTY_DISPLAY_FORMAT,
  ManageStatusBackendDefinition.JSON_PROPERTY_HIDE_ZERO_COUNTS,
  ManageStatusBackendDefinition.JSON_PROPERTY_LAST_TRIGGERED_FORMAT,
  ManageStatusBackendDefinition.JSON_PROPERTY_NOTES,
  ManageStatusBackendDefinition.JSON_PROPERTY_QUERY,
  ManageStatusBackendDefinition.JSON_PROPERTY_SHOW_INVESTIGATION,
  ManageStatusBackendDefinition.JSON_PROPERTY_SHOW_LAST_TRIGGERED,
  ManageStatusBackendDefinition.JSON_PROPERTY_SHOW_PRIORITY,
  ManageStatusBackendDefinition.JSON_PROPERTY_SHOW_STATUS,
  ManageStatusBackendDefinition.JSON_PROPERTY_SORT,
  ManageStatusBackendDefinition.JSON_PROPERTY_START,
  ManageStatusBackendDefinition.JSON_PROPERTY_SUMMARY_TYPE,
  ManageStatusBackendDefinition.JSON_PROPERTY_TITLE,
  ManageStatusBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  ManageStatusBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  ManageStatusBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ManageStatusBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_PREFERENCE = "color_preference";
  private ManageStatusBackendDefinitionColorPreference colorPreference;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Double count;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_FORMAT = "display_format";
  private ManageStatusBackendDefinitionDisplayFormat displayFormat;

  public static final String JSON_PROPERTY_HIDE_ZERO_COUNTS = "hide_zero_counts";
  private Boolean hideZeroCounts;

  public static final String JSON_PROPERTY_LAST_TRIGGERED_FORMAT = "last_triggered_format";
  private ManageStatusBackendDefinitionLastTriggeredFormat lastTriggeredFormat;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SHOW_INVESTIGATION = "show_investigation";
  private Boolean showInvestigation;

  public static final String JSON_PROPERTY_SHOW_LAST_TRIGGERED = "show_last_triggered";
  private Boolean showLastTriggered;

  public static final String JSON_PROPERTY_SHOW_PRIORITY = "show_priority";
  private Boolean showPriority;

  public static final String JSON_PROPERTY_SHOW_STATUS = "show_status";
  private Boolean showStatus;

  public static final String JSON_PROPERTY_SORT = "sort";
  private String sort;

  public static final String JSON_PROPERTY_START = "start";
  private Double start;

  public static final String JSON_PROPERTY_SUMMARY_TYPE = "summary_type";
  private ManageStatusBackendDefinitionSummaryType summaryType;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ManageStatusBackendDefinitionType type;

  public ManageStatusBackendDefinition() {}

  @JsonCreator
  public ManageStatusBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ManageStatusBackendDefinitionType type) {
    this.query = query;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ManageStatusBackendDefinition colorPreference(
      ManageStatusBackendDefinitionColorPreference colorPreference) {
    this.colorPreference = colorPreference;
    this.unparsed |= !colorPreference.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return colorPreference
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ManageStatusBackendDefinitionColorPreference getColorPreference() {
    return colorPreference;
  }

  public void setColorPreference(ManageStatusBackendDefinitionColorPreference colorPreference) {
    if (!colorPreference.isValid()) {
      this.unparsed = true;
    }
    this.colorPreference = colorPreference;
  }

  public ManageStatusBackendDefinition count(Double count) {
    this.count = count;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return count
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getCount() {
    return count;
  }

  public void setCount(Double count) {
    this.count = count;
  }

  public ManageStatusBackendDefinition description(String description) {
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

  public ManageStatusBackendDefinition displayFormat(
      ManageStatusBackendDefinitionDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
    this.unparsed |= !displayFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return displayFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ManageStatusBackendDefinitionDisplayFormat getDisplayFormat() {
    return displayFormat;
  }

  public void setDisplayFormat(ManageStatusBackendDefinitionDisplayFormat displayFormat) {
    if (!displayFormat.isValid()) {
      this.unparsed = true;
    }
    this.displayFormat = displayFormat;
  }

  public ManageStatusBackendDefinition hideZeroCounts(Boolean hideZeroCounts) {
    this.hideZeroCounts = hideZeroCounts;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hideZeroCounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_ZERO_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideZeroCounts() {
    return hideZeroCounts;
  }

  public void setHideZeroCounts(Boolean hideZeroCounts) {
    this.hideZeroCounts = hideZeroCounts;
  }

  public ManageStatusBackendDefinition lastTriggeredFormat(
      ManageStatusBackendDefinitionLastTriggeredFormat lastTriggeredFormat) {
    this.lastTriggeredFormat = lastTriggeredFormat;
    this.unparsed |= !lastTriggeredFormat.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return lastTriggeredFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_TRIGGERED_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ManageStatusBackendDefinitionLastTriggeredFormat getLastTriggeredFormat() {
    return lastTriggeredFormat;
  }

  public void setLastTriggeredFormat(
      ManageStatusBackendDefinitionLastTriggeredFormat lastTriggeredFormat) {
    if (!lastTriggeredFormat.isValid()) {
      this.unparsed = true;
    }
    this.lastTriggeredFormat = lastTriggeredFormat;
  }

  public ManageStatusBackendDefinition notes(String notes) {
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

  public ManageStatusBackendDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public ManageStatusBackendDefinition showInvestigation(Boolean showInvestigation) {
    this.showInvestigation = showInvestigation;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showInvestigation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_INVESTIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowInvestigation() {
    return showInvestigation;
  }

  public void setShowInvestigation(Boolean showInvestigation) {
    this.showInvestigation = showInvestigation;
  }

  public ManageStatusBackendDefinition showLastTriggered(Boolean showLastTriggered) {
    this.showLastTriggered = showLastTriggered;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showLastTriggered
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_LAST_TRIGGERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowLastTriggered() {
    return showLastTriggered;
  }

  public void setShowLastTriggered(Boolean showLastTriggered) {
    this.showLastTriggered = showLastTriggered;
  }

  public ManageStatusBackendDefinition showPriority(Boolean showPriority) {
    this.showPriority = showPriority;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showPriority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPriority() {
    return showPriority;
  }

  public void setShowPriority(Boolean showPriority) {
    this.showPriority = showPriority;
  }

  public ManageStatusBackendDefinition showStatus(Boolean showStatus) {
    this.showStatus = showStatus;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showStatus
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowStatus() {
    return showStatus;
  }

  public void setShowStatus(Boolean showStatus) {
    this.showStatus = showStatus;
  }

  public ManageStatusBackendDefinition sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public ManageStatusBackendDefinition start(Double start) {
    this.start = start;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getStart() {
    return start;
  }

  public void setStart(Double start) {
    this.start = start;
  }

  public ManageStatusBackendDefinition summaryType(
      ManageStatusBackendDefinitionSummaryType summaryType) {
    this.summaryType = summaryType;
    this.unparsed |= !summaryType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return summaryType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ManageStatusBackendDefinitionSummaryType getSummaryType() {
    return summaryType;
  }

  public void setSummaryType(ManageStatusBackendDefinitionSummaryType summaryType) {
    if (!summaryType.isValid()) {
      this.unparsed = true;
    }
    this.summaryType = summaryType;
  }

  public ManageStatusBackendDefinition title(String title) {
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

  public ManageStatusBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public ManageStatusBackendDefinition titleSize(String titleSize) {
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

  public ManageStatusBackendDefinition type(ManageStatusBackendDefinitionType type) {
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
  public ManageStatusBackendDefinitionType getType() {
    return type;
  }

  public void setType(ManageStatusBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ManageStatusBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManageStatusBackendDefinition manageStatusBackendDefinition = (ManageStatusBackendDefinition) o;
    return Objects.equals(this.colorPreference, manageStatusBackendDefinition.colorPreference)
        && Objects.equals(this.count, manageStatusBackendDefinition.count)
        && Objects.equals(this.description, manageStatusBackendDefinition.description)
        && Objects.equals(this.displayFormat, manageStatusBackendDefinition.displayFormat)
        && Objects.equals(this.hideZeroCounts, manageStatusBackendDefinition.hideZeroCounts)
        && Objects.equals(
            this.lastTriggeredFormat, manageStatusBackendDefinition.lastTriggeredFormat)
        && Objects.equals(this.notes, manageStatusBackendDefinition.notes)
        && Objects.equals(this.query, manageStatusBackendDefinition.query)
        && Objects.equals(this.showInvestigation, manageStatusBackendDefinition.showInvestigation)
        && Objects.equals(this.showLastTriggered, manageStatusBackendDefinition.showLastTriggered)
        && Objects.equals(this.showPriority, manageStatusBackendDefinition.showPriority)
        && Objects.equals(this.showStatus, manageStatusBackendDefinition.showStatus)
        && Objects.equals(this.sort, manageStatusBackendDefinition.sort)
        && Objects.equals(this.start, manageStatusBackendDefinition.start)
        && Objects.equals(this.summaryType, manageStatusBackendDefinition.summaryType)
        && Objects.equals(this.title, manageStatusBackendDefinition.title)
        && Objects.equals(this.titleAlign, manageStatusBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, manageStatusBackendDefinition.titleSize)
        && Objects.equals(this.type, manageStatusBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        colorPreference,
        count,
        description,
        displayFormat,
        hideZeroCounts,
        lastTriggeredFormat,
        notes,
        query,
        showInvestigation,
        showLastTriggered,
        showPriority,
        showStatus,
        sort,
        start,
        summaryType,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageStatusBackendDefinition {\n");
    sb.append("    colorPreference: ").append(toIndentedString(colorPreference)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
    sb.append("    hideZeroCounts: ").append(toIndentedString(hideZeroCounts)).append("\n");
    sb.append("    lastTriggeredFormat: ")
        .append(toIndentedString(lastTriggeredFormat))
        .append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    showInvestigation: ").append(toIndentedString(showInvestigation)).append("\n");
    sb.append("    showLastTriggered: ").append(toIndentedString(showLastTriggered)).append("\n");
    sb.append("    showPriority: ").append(toIndentedString(showPriority)).append("\n");
    sb.append("    showStatus: ").append(toIndentedString(showStatus)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
