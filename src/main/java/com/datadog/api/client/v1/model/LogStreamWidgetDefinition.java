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
 * The Log Stream displays a log flow matching the defined query. Only available on FREE layout
 * dashboards.
 */
@JsonPropertyOrder({
  LogStreamWidgetDefinition.JSON_PROPERTY_COLUMNS,
  LogStreamWidgetDefinition.JSON_PROPERTY_INDEXES,
  LogStreamWidgetDefinition.JSON_PROPERTY_LOGSET,
  LogStreamWidgetDefinition.JSON_PROPERTY_MESSAGE_DISPLAY,
  LogStreamWidgetDefinition.JSON_PROPERTY_QUERY,
  LogStreamWidgetDefinition.JSON_PROPERTY_SHOW_DATE_COLUMN,
  LogStreamWidgetDefinition.JSON_PROPERTY_SHOW_MESSAGE_COLUMN,
  LogStreamWidgetDefinition.JSON_PROPERTY_SORT,
  LogStreamWidgetDefinition.JSON_PROPERTY_TIME,
  LogStreamWidgetDefinition.JSON_PROPERTY_TITLE,
  LogStreamWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  LogStreamWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  LogStreamWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogStreamWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<String> columns = null;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_LOGSET = "logset";
  private String logset;

  public static final String JSON_PROPERTY_MESSAGE_DISPLAY = "message_display";
  private WidgetMessageDisplay messageDisplay;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SHOW_DATE_COLUMN = "show_date_column";
  private Boolean showDateColumn;

  public static final String JSON_PROPERTY_SHOW_MESSAGE_COLUMN = "show_message_column";
  private Boolean showMessageColumn;

  public static final String JSON_PROPERTY_SORT = "sort";
  private WidgetFieldSort sort;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogStreamWidgetDefinitionType type = LogStreamWidgetDefinitionType.LOG_STREAM;

  public LogStreamWidgetDefinition() {}

  @JsonCreator
  public LogStreamWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          LogStreamWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogStreamWidgetDefinition columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public LogStreamWidgetDefinition addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Which columns to display on the widget.
   *
   * @return columns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public LogStreamWidgetDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public LogStreamWidgetDefinition addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * An array of index names to query in the stream. Use [] to query all indexes at once.
   *
   * @return indexes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIndexes() {
    return indexes;
  }

  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }

  public LogStreamWidgetDefinition logset(String logset) {
    this.logset = logset;
    return this;
  }

  /**
   * ID of the log set to use.
   *
   * @return logset
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogset() {
    return logset;
  }

  @Deprecated
  public void setLogset(String logset) {
    this.logset = logset;
  }

  public LogStreamWidgetDefinition messageDisplay(WidgetMessageDisplay messageDisplay) {
    this.messageDisplay = messageDisplay;
    this.unparsed |= !messageDisplay.isValid();
    return this;
  }

  /**
   * Amount of log lines to display
   *
   * @return messageDisplay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetMessageDisplay getMessageDisplay() {
    return messageDisplay;
  }

  public void setMessageDisplay(WidgetMessageDisplay messageDisplay) {
    if (!messageDisplay.isValid()) {
      this.unparsed = true;
    }
    this.messageDisplay = messageDisplay;
  }

  public LogStreamWidgetDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Query to filter the log stream with.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public LogStreamWidgetDefinition showDateColumn(Boolean showDateColumn) {
    this.showDateColumn = showDateColumn;
    return this;
  }

  /**
   * Whether to show the date column or not
   *
   * @return showDateColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_DATE_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowDateColumn() {
    return showDateColumn;
  }

  public void setShowDateColumn(Boolean showDateColumn) {
    this.showDateColumn = showDateColumn;
  }

  public LogStreamWidgetDefinition showMessageColumn(Boolean showMessageColumn) {
    this.showMessageColumn = showMessageColumn;
    return this;
  }

  /**
   * Whether to show the message column or not
   *
   * @return showMessageColumn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_MESSAGE_COLUMN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowMessageColumn() {
    return showMessageColumn;
  }

  public void setShowMessageColumn(Boolean showMessageColumn) {
    this.showMessageColumn = showMessageColumn;
  }

  public LogStreamWidgetDefinition sort(WidgetFieldSort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Which column and order to sort by
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetFieldSort getSort() {
    return sort;
  }

  public void setSort(WidgetFieldSort sort) {
    this.sort = sort;
  }

  public LogStreamWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time setting for the widget.
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
  }

  public LogStreamWidgetDefinition title(String title) {
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

  public LogStreamWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public LogStreamWidgetDefinition titleSize(String titleSize) {
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

  public LogStreamWidgetDefinition type(LogStreamWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the log stream widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LogStreamWidgetDefinitionType getType() {
    return type;
  }

  public void setType(LogStreamWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return LogStreamWidgetDefinition
   */
  @JsonAnySetter
  public LogStreamWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LogStreamWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogStreamWidgetDefinition logStreamWidgetDefinition = (LogStreamWidgetDefinition) o;
    return Objects.equals(this.columns, logStreamWidgetDefinition.columns)
        && Objects.equals(this.indexes, logStreamWidgetDefinition.indexes)
        && Objects.equals(this.logset, logStreamWidgetDefinition.logset)
        && Objects.equals(this.messageDisplay, logStreamWidgetDefinition.messageDisplay)
        && Objects.equals(this.query, logStreamWidgetDefinition.query)
        && Objects.equals(this.showDateColumn, logStreamWidgetDefinition.showDateColumn)
        && Objects.equals(this.showMessageColumn, logStreamWidgetDefinition.showMessageColumn)
        && Objects.equals(this.sort, logStreamWidgetDefinition.sort)
        && Objects.equals(this.time, logStreamWidgetDefinition.time)
        && Objects.equals(this.title, logStreamWidgetDefinition.title)
        && Objects.equals(this.titleAlign, logStreamWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, logStreamWidgetDefinition.titleSize)
        && Objects.equals(this.type, logStreamWidgetDefinition.type)
        && Objects.equals(
            this.additionalProperties, logStreamWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        indexes,
        logset,
        messageDisplay,
        query,
        showDateColumn,
        showMessageColumn,
        sort,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogStreamWidgetDefinition {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    logset: ").append(toIndentedString(logset)).append("\n");
    sb.append("    messageDisplay: ").append(toIndentedString(messageDisplay)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    showDateColumn: ").append(toIndentedString(showDateColumn)).append("\n");
    sb.append("    showMessageColumn: ").append(toIndentedString(showMessageColumn)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
