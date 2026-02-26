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
   * <p>The monitor summary widget displays a summary view of all your Datadog monitors, or a subset based on a query. Only available on FREE layout dashboards.</p>
 */
@JsonPropertyOrder({
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_COLOR_PREFERENCE,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_COUNT,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_DISPLAY_FORMAT,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_HIDE_ZERO_COUNTS,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_QUERY,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_SHOW_LAST_TRIGGERED,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_SHOW_PRIORITY,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_SORT,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_START,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_SUMMARY_TYPE,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_TITLE,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  MonitorSummaryWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSummaryWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_PREFERENCE = "color_preference";
  private WidgetColorPreference colorPreference;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_DISPLAY_FORMAT = "display_format";
  private WidgetMonitorSummaryDisplayFormat displayFormat;

  public static final String JSON_PROPERTY_HIDE_ZERO_COUNTS = "hide_zero_counts";
  private Boolean hideZeroCounts;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SHOW_LAST_TRIGGERED = "show_last_triggered";
  private Boolean showLastTriggered;

  public static final String JSON_PROPERTY_SHOW_PRIORITY = "show_priority";
  private Boolean showPriority = false;

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetMonitorSummarySort sort;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_SUMMARY_TYPE = "summary_type";
  private WidgetSummaryType summaryType;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MonitorSummaryWidgetDefinitionType type = MonitorSummaryWidgetDefinitionType.MANAGE_STATUS;

  public MonitorSummaryWidgetDefinition() {}

  @JsonCreator
  public MonitorSummaryWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)MonitorSummaryWidgetDefinitionType type) {
        this.query = query;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public MonitorSummaryWidgetDefinition colorPreference(WidgetColorPreference colorPreference) {
    this.colorPreference = colorPreference;
    this.unparsed |= !colorPreference.isValid();
    return this;
  }

  /**
   * <p>Which color to use on the widget.</p>
   * @return colorPreference
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLOR_PREFERENCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetColorPreference getColorPreference() {
        return colorPreference;
      }
  public void setColorPreference(WidgetColorPreference colorPreference) {
    if (!colorPreference.isValid()) {
        this.unparsed = true;
    }
    this.colorPreference = colorPreference;
  }
  public MonitorSummaryWidgetDefinition count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * <p>The number of monitors to display.</p>
   * @return count
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCount() {
        return count;
      }
  @Deprecated
  public void setCount(Long count) {
    this.count = count;
  }
  public MonitorSummaryWidgetDefinition displayFormat(WidgetMonitorSummaryDisplayFormat displayFormat) {
    this.displayFormat = displayFormat;
    this.unparsed |= !displayFormat.isValid();
    return this;
  }

  /**
   * <p>What to display on the widget.</p>
   * @return displayFormat
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DISPLAY_FORMAT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetMonitorSummaryDisplayFormat getDisplayFormat() {
        return displayFormat;
      }
  public void setDisplayFormat(WidgetMonitorSummaryDisplayFormat displayFormat) {
    if (!displayFormat.isValid()) {
        this.unparsed = true;
    }
    this.displayFormat = displayFormat;
  }
  public MonitorSummaryWidgetDefinition hideZeroCounts(Boolean hideZeroCounts) {
    this.hideZeroCounts = hideZeroCounts;
    return this;
  }

  /**
   * <p>Whether to show counts of 0 or not.</p>
   * @return hideZeroCounts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HIDE_ZERO_COUNTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHideZeroCounts() {
        return hideZeroCounts;
      }
  public void setHideZeroCounts(Boolean hideZeroCounts) {
    this.hideZeroCounts = hideZeroCounts;
  }
  public MonitorSummaryWidgetDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Query to filter the monitors with.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public MonitorSummaryWidgetDefinition showLastTriggered(Boolean showLastTriggered) {
    this.showLastTriggered = showLastTriggered;
    return this;
  }

  /**
   * <p>Whether to show the time that has elapsed since the monitor/group triggered.</p>
   * @return showLastTriggered
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_LAST_TRIGGERED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShowLastTriggered() {
        return showLastTriggered;
      }
  public void setShowLastTriggered(Boolean showLastTriggered) {
    this.showLastTriggered = showLastTriggered;
  }
  public MonitorSummaryWidgetDefinition showPriority(Boolean showPriority) {
    this.showPriority = showPriority;
    return this;
  }

  /**
   * <p>Whether to show the priorities column.</p>
   * @return showPriority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOW_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShowPriority() {
        return showPriority;
      }
  public void setShowPriority(Boolean showPriority) {
    this.showPriority = showPriority;
  }
  public MonitorSummaryWidgetDefinition sort(WidgetMonitorSummarySort sort) {
    this.sort = sort;
    this.unparsed |= !sort.isValid();
    return this;
  }

  /**
   * <p>Widget sorting methods.</p>
   * @return sort
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SORT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetMonitorSummarySort getSort() {
        return sort;
      }
  public void setSort(WidgetMonitorSummarySort sort) {
    if (!sort.isValid()) {
        this.unparsed = true;
    }
    this.sort = sort;
  }
  public MonitorSummaryWidgetDefinition start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * <p>The start of the list. Typically 0.</p>
   * @return start
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStart() {
        return start;
      }
  @Deprecated
  public void setStart(Long start) {
    this.start = start;
  }
  public MonitorSummaryWidgetDefinition summaryType(WidgetSummaryType summaryType) {
    this.summaryType = summaryType;
    this.unparsed |= !summaryType.isValid();
    return this;
  }

  /**
   * <p>Which summary type should be used.</p>
   * @return summaryType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUMMARY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetSummaryType getSummaryType() {
        return summaryType;
      }
  public void setSummaryType(WidgetSummaryType summaryType) {
    if (!summaryType.isValid()) {
        this.unparsed = true;
    }
    this.summaryType = summaryType;
  }
  public MonitorSummaryWidgetDefinition title(String title) {
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
  public MonitorSummaryWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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
  public MonitorSummaryWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitleSize() {
        return titleSize;
      }
  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }
  public MonitorSummaryWidgetDefinition type(MonitorSummaryWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the monitor summary widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MonitorSummaryWidgetDefinitionType getType() {
        return type;
      }
  public void setType(MonitorSummaryWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return MonitorSummaryWidgetDefinition
   */
  @JsonAnySetter
  public MonitorSummaryWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this MonitorSummaryWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSummaryWidgetDefinition monitorSummaryWidgetDefinition = (MonitorSummaryWidgetDefinition) o;
    return Objects.equals(this.colorPreference, monitorSummaryWidgetDefinition.colorPreference) && Objects.equals(this.count, monitorSummaryWidgetDefinition.count) && Objects.equals(this.displayFormat, monitorSummaryWidgetDefinition.displayFormat) && Objects.equals(this.hideZeroCounts, monitorSummaryWidgetDefinition.hideZeroCounts) && Objects.equals(this.query, monitorSummaryWidgetDefinition.query) && Objects.equals(this.showLastTriggered, monitorSummaryWidgetDefinition.showLastTriggered) && Objects.equals(this.showPriority, monitorSummaryWidgetDefinition.showPriority) && Objects.equals(this.sort, monitorSummaryWidgetDefinition.sort) && Objects.equals(this.start, monitorSummaryWidgetDefinition.start) && Objects.equals(this.summaryType, monitorSummaryWidgetDefinition.summaryType) && Objects.equals(this.title, monitorSummaryWidgetDefinition.title) && Objects.equals(this.titleAlign, monitorSummaryWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, monitorSummaryWidgetDefinition.titleSize) && Objects.equals(this.type, monitorSummaryWidgetDefinition.type) && Objects.equals(this.additionalProperties, monitorSummaryWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(colorPreference,count,displayFormat,hideZeroCounts,query,showLastTriggered,showPriority,sort,start,summaryType,title,titleAlign,titleSize,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSummaryWidgetDefinition {\n");
    sb.append("    colorPreference: ").append(toIndentedString(colorPreference)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
    sb.append("    hideZeroCounts: ").append(toIndentedString(hideZeroCounts)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    showLastTriggered: ").append(toIndentedString(showLastTriggered)).append("\n");
    sb.append("    showPriority: ").append(toIndentedString(showPriority)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
