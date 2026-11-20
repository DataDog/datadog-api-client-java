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
  LogStreamDefinition.JSON_PROPERTY_COLUMNS,
  LogStreamDefinition.JSON_PROPERTY_CROSS_ORG_UUIDS,
  LogStreamDefinition.JSON_PROPERTY_DESCRIPTION,
  LogStreamDefinition.JSON_PROPERTY_INDEXES,
  LogStreamDefinition.JSON_PROPERTY_MESSAGE_DISPLAY,
  LogStreamDefinition.JSON_PROPERTY_NOTES,
  LogStreamDefinition.JSON_PROPERTY_QUERY,
  LogStreamDefinition.JSON_PROPERTY_SHOW_DATE_COLUMN,
  LogStreamDefinition.JSON_PROPERTY_SHOW_MESSAGE_COLUMN,
  LogStreamDefinition.JSON_PROPERTY_SORT,
  LogStreamDefinition.JSON_PROPERTY_STORAGE,
  LogStreamDefinition.JSON_PROPERTY_TIME,
  LogStreamDefinition.JSON_PROPERTY_TITLE,
  LogStreamDefinition.JSON_PROPERTY_TITLE_ALIGN,
  LogStreamDefinition.JSON_PROPERTY_TITLE_SIZE,
  LogStreamDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogStreamDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<String> columns = null;

  public static final String JSON_PROPERTY_CROSS_ORG_UUIDS = "cross_org_uuids";
  private List<String> crossOrgUuids = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_MESSAGE_DISPLAY = "message_display";
  private MessageDisplay messageDisplay;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_SHOW_DATE_COLUMN = "show_date_column";
  private Boolean showDateColumn;

  public static final String JSON_PROPERTY_SHOW_MESSAGE_COLUMN = "show_message_column";
  private Boolean showMessageColumn;

  public static final String JSON_PROPERTY_SORT = "sort";
  private SortPair sort;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private StorageType storage;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LogStreamDefinitionType type;

  public LogStreamDefinition() {}

  @JsonCreator
  public LogStreamDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) LogStreamDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public LogStreamDefinition columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public LogStreamDefinition addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public LogStreamDefinition crossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
    return this;
  }

  public LogStreamDefinition addCrossOrgUuidsItem(String crossOrgUuidsItem) {
    if (this.crossOrgUuids == null) {
      this.crossOrgUuids = new ArrayList<>();
    }
    this.crossOrgUuids.add(crossOrgUuidsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return crossOrgUuids
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CROSS_ORG_UUIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCrossOrgUuids() {
    return crossOrgUuids;
  }

  public void setCrossOrgUuids(List<String> crossOrgUuids) {
    this.crossOrgUuids = crossOrgUuids;
  }

  public LogStreamDefinition description(String description) {
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

  public LogStreamDefinition indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }

  public LogStreamDefinition addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public LogStreamDefinition messageDisplay(MessageDisplay messageDisplay) {
    this.messageDisplay = messageDisplay;
    this.unparsed |= !messageDisplay.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return messageDisplay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MessageDisplay getMessageDisplay() {
    return messageDisplay;
  }

  public void setMessageDisplay(MessageDisplay messageDisplay) {
    if (!messageDisplay.isValid()) {
      this.unparsed = true;
    }
    this.messageDisplay = messageDisplay;
  }

  public LogStreamDefinition notes(String notes) {
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

  public LogStreamDefinition query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public LogStreamDefinition showDateColumn(Boolean showDateColumn) {
    this.showDateColumn = showDateColumn;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public LogStreamDefinition showMessageColumn(Boolean showMessageColumn) {
    this.showMessageColumn = showMessageColumn;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public LogStreamDefinition sort(SortPair sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
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
  public SortPair getSort() {
    return sort;
  }

  public void setSort(SortPair sort) {
    this.sort = sort;
    if (sort != null) {
      this.unparsed |= sort.unparsed;
    }
  }

  public LogStreamDefinition storage(StorageType storage) {
    this.storage = storage;
    this.unparsed |= !storage.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return storage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StorageType getStorage() {
    return storage;
  }

  public void setStorage(StorageType storage) {
    if (!storage.isValid()) {
      this.unparsed = true;
    }
    this.storage = storage;
  }

  public LogStreamDefinition time(WidgetTime time) {
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

  public LogStreamDefinition title(String title) {
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

  public LogStreamDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public LogStreamDefinition titleSize(String titleSize) {
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

  public LogStreamDefinition type(LogStreamDefinitionType type) {
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
  public LogStreamDefinitionType getType() {
    return type;
  }

  public void setType(LogStreamDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this LogStreamDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogStreamDefinition logStreamDefinition = (LogStreamDefinition) o;
    return Objects.equals(this.columns, logStreamDefinition.columns)
        && Objects.equals(this.crossOrgUuids, logStreamDefinition.crossOrgUuids)
        && Objects.equals(this.description, logStreamDefinition.description)
        && Objects.equals(this.indexes, logStreamDefinition.indexes)
        && Objects.equals(this.messageDisplay, logStreamDefinition.messageDisplay)
        && Objects.equals(this.notes, logStreamDefinition.notes)
        && Objects.equals(this.query, logStreamDefinition.query)
        && Objects.equals(this.showDateColumn, logStreamDefinition.showDateColumn)
        && Objects.equals(this.showMessageColumn, logStreamDefinition.showMessageColumn)
        && Objects.equals(this.sort, logStreamDefinition.sort)
        && Objects.equals(this.storage, logStreamDefinition.storage)
        && Objects.equals(this.time, logStreamDefinition.time)
        && Objects.equals(this.title, logStreamDefinition.title)
        && Objects.equals(this.titleAlign, logStreamDefinition.titleAlign)
        && Objects.equals(this.titleSize, logStreamDefinition.titleSize)
        && Objects.equals(this.type, logStreamDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columns,
        crossOrgUuids,
        description,
        indexes,
        messageDisplay,
        notes,
        query,
        showDateColumn,
        showMessageColumn,
        sort,
        storage,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogStreamDefinition {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    crossOrgUuids: ").append(toIndentedString(crossOrgUuids)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    messageDisplay: ").append(toIndentedString(messageDisplay)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    showDateColumn: ").append(toIndentedString(showDateColumn)).append("\n");
    sb.append("    showMessageColumn: ").append(toIndentedString(showMessageColumn)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
