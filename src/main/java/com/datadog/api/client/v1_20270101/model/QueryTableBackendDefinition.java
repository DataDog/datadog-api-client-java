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
  QueryTableBackendDefinition.JSON_PROPERTY_AUTO_HORIZONTAL_SCROLLING,
  QueryTableBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  QueryTableBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  QueryTableBackendDefinition.JSON_PROPERTY_HAS_SEARCH_BAR,
  QueryTableBackendDefinition.JSON_PROPERTY_NOTES,
  QueryTableBackendDefinition.JSON_PROPERTY_NUM_STICKY_COLUMNS,
  QueryTableBackendDefinition.JSON_PROPERTY_REQUESTS,
  QueryTableBackendDefinition.JSON_PROPERTY_TIME,
  QueryTableBackendDefinition.JSON_PROPERTY_TITLE,
  QueryTableBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  QueryTableBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  QueryTableBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryTableBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_HORIZONTAL_SCROLLING = "auto_horizontal_scrolling";
  private Boolean autoHorizontalScrolling;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HAS_SEARCH_BAR = "has_search_bar";
  private HasSearchBar hasSearchBar;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_NUM_STICKY_COLUMNS = "num_sticky_columns";
  private Double numStickyColumns;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<QueryTableBackendRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private QueryTableBackendDefinitionType type;

  public QueryTableBackendDefinition() {}

  @JsonCreator
  public QueryTableBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<QueryTableBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          QueryTableBackendDefinitionType type) {
    this.requests = requests;
    for (QueryTableBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public QueryTableBackendDefinition autoHorizontalScrolling(Boolean autoHorizontalScrolling) {
    this.autoHorizontalScrolling = autoHorizontalScrolling;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return autoHorizontalScrolling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_HORIZONTAL_SCROLLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoHorizontalScrolling() {
    return autoHorizontalScrolling;
  }

  public void setAutoHorizontalScrolling(Boolean autoHorizontalScrolling) {
    this.autoHorizontalScrolling = autoHorizontalScrolling;
  }

  public QueryTableBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryTableBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }

  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public QueryTableBackendDefinition description(String description) {
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

  public QueryTableBackendDefinition hasSearchBar(HasSearchBar hasSearchBar) {
    this.hasSearchBar = hasSearchBar;
    this.unparsed |= !hasSearchBar.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hasSearchBar
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_SEARCH_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HasSearchBar getHasSearchBar() {
    return hasSearchBar;
  }

  public void setHasSearchBar(HasSearchBar hasSearchBar) {
    if (!hasSearchBar.isValid()) {
      this.unparsed = true;
    }
    this.hasSearchBar = hasSearchBar;
  }

  public QueryTableBackendDefinition notes(String notes) {
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

  public QueryTableBackendDefinition numStickyColumns(Double numStickyColumns) {
    this.numStickyColumns = numStickyColumns;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return numStickyColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_STICKY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getNumStickyColumns() {
    return numStickyColumns;
  }

  public void setNumStickyColumns(Double numStickyColumns) {
    this.numStickyColumns = numStickyColumns;
  }

  public QueryTableBackendDefinition requests(List<QueryTableBackendRequest> requests) {
    this.requests = requests;
    for (QueryTableBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryTableBackendDefinition addRequestsItem(QueryTableBackendRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<QueryTableBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<QueryTableBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (QueryTableBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public QueryTableBackendDefinition time(WidgetTime time) {
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

  public QueryTableBackendDefinition title(String title) {
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

  public QueryTableBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public QueryTableBackendDefinition titleSize(String titleSize) {
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

  public QueryTableBackendDefinition type(QueryTableBackendDefinitionType type) {
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
  public QueryTableBackendDefinitionType getType() {
    return type;
  }

  public void setType(QueryTableBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this QueryTableBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTableBackendDefinition queryTableBackendDefinition = (QueryTableBackendDefinition) o;
    return Objects.equals(
            this.autoHorizontalScrolling, queryTableBackendDefinition.autoHorizontalScrolling)
        && Objects.equals(this.customLinks, queryTableBackendDefinition.customLinks)
        && Objects.equals(this.description, queryTableBackendDefinition.description)
        && Objects.equals(this.hasSearchBar, queryTableBackendDefinition.hasSearchBar)
        && Objects.equals(this.notes, queryTableBackendDefinition.notes)
        && Objects.equals(this.numStickyColumns, queryTableBackendDefinition.numStickyColumns)
        && Objects.equals(this.requests, queryTableBackendDefinition.requests)
        && Objects.equals(this.time, queryTableBackendDefinition.time)
        && Objects.equals(this.title, queryTableBackendDefinition.title)
        && Objects.equals(this.titleAlign, queryTableBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, queryTableBackendDefinition.titleSize)
        && Objects.equals(this.type, queryTableBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoHorizontalScrolling,
        customLinks,
        description,
        hasSearchBar,
        notes,
        numStickyColumns,
        requests,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTableBackendDefinition {\n");
    sb.append("    autoHorizontalScrolling: ")
        .append(toIndentedString(autoHorizontalScrolling))
        .append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasSearchBar: ").append(toIndentedString(hasSearchBar)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numStickyColumns: ").append(toIndentedString(numStickyColumns)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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
