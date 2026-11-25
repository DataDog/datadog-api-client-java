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
  FunnelBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  FunnelBackendDefinition.JSON_PROPERTY_GROUPED_DISPLAY,
  FunnelBackendDefinition.JSON_PROPERTY_NOTES,
  FunnelBackendDefinition.JSON_PROPERTY_REQUESTS,
  FunnelBackendDefinition.JSON_PROPERTY_TIME,
  FunnelBackendDefinition.JSON_PROPERTY_TITLE,
  FunnelBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  FunnelBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  FunnelBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUPED_DISPLAY = "grouped_display";
  private FunnelGroupByDisplay groupedDisplay;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<Object> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FunnelBackendDefinitionType type;

  public FunnelBackendDefinition() {}

  @JsonCreator
  public FunnelBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS) List<Object> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) FunnelBackendDefinitionType type) {
    this.requests = requests;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public FunnelBackendDefinition description(String description) {
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

  public FunnelBackendDefinition groupedDisplay(FunnelGroupByDisplay groupedDisplay) {
    this.groupedDisplay = groupedDisplay;
    this.unparsed |= !groupedDisplay.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupedDisplay
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPED_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FunnelGroupByDisplay getGroupedDisplay() {
    return groupedDisplay;
  }

  public void setGroupedDisplay(FunnelGroupByDisplay groupedDisplay) {
    if (!groupedDisplay.isValid()) {
      this.unparsed = true;
    }
    this.groupedDisplay = groupedDisplay;
  }

  public FunnelBackendDefinition notes(String notes) {
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

  public FunnelBackendDefinition requests(List<Object> requests) {
    this.requests = requests;
    return this;
  }

  public FunnelBackendDefinition addRequestsItem(Object requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Object> getRequests() {
    return requests;
  }

  public void setRequests(List<Object> requests) {
    this.requests = requests;
  }

  public FunnelBackendDefinition time(WidgetTime time) {
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

  public FunnelBackendDefinition title(String title) {
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

  public FunnelBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public FunnelBackendDefinition titleSize(String titleSize) {
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

  public FunnelBackendDefinition type(FunnelBackendDefinitionType type) {
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
  public FunnelBackendDefinitionType getType() {
    return type;
  }

  public void setType(FunnelBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this FunnelBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelBackendDefinition funnelBackendDefinition = (FunnelBackendDefinition) o;
    return Objects.equals(this.description, funnelBackendDefinition.description)
        && Objects.equals(this.groupedDisplay, funnelBackendDefinition.groupedDisplay)
        && Objects.equals(this.notes, funnelBackendDefinition.notes)
        && Objects.equals(this.requests, funnelBackendDefinition.requests)
        && Objects.equals(this.time, funnelBackendDefinition.time)
        && Objects.equals(this.title, funnelBackendDefinition.title)
        && Objects.equals(this.titleAlign, funnelBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, funnelBackendDefinition.titleSize)
        && Objects.equals(this.type, funnelBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description, groupedDisplay, notes, requests, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelBackendDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupedDisplay: ").append(toIndentedString(groupedDisplay)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
