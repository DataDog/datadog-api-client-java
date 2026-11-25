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
  QueryValueBackendDefinition.JSON_PROPERTY_AUTOSCALE,
  QueryValueBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  QueryValueBackendDefinition.JSON_PROPERTY_CUSTOM_UNIT,
  QueryValueBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  QueryValueBackendDefinition.JSON_PROPERTY_NOTES,
  QueryValueBackendDefinition.JSON_PROPERTY_PRECISION,
  QueryValueBackendDefinition.JSON_PROPERTY_REQUESTS,
  QueryValueBackendDefinition.JSON_PROPERTY_TEXT_ALIGN,
  QueryValueBackendDefinition.JSON_PROPERTY_TIME,
  QueryValueBackendDefinition.JSON_PROPERTY_TIMESERIES_BACKGROUND,
  QueryValueBackendDefinition.JSON_PROPERTY_TITLE,
  QueryValueBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  QueryValueBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  QueryValueBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryValueBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTOSCALE = "autoscale";
  private Boolean autoscale;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_CUSTOM_UNIT = "custom_unit";
  private String customUnit;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Double precision;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<QueryValueBackendRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT_ALIGN = "text_align";
  private WidgetTextAlign textAlign;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TIMESERIES_BACKGROUND = "timeseries_background";
  private TimeseriesBackground timeseriesBackground;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private QueryValueBackendDefinitionType type;

  public QueryValueBackendDefinition() {}

  @JsonCreator
  public QueryValueBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<QueryValueBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          QueryValueBackendDefinitionType type) {
    this.requests = requests;
    for (QueryValueBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public QueryValueBackendDefinition autoscale(Boolean autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return autoscale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOSCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoscale() {
    return autoscale;
  }

  public void setAutoscale(Boolean autoscale) {
    this.autoscale = autoscale;
  }

  public QueryValueBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public QueryValueBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public QueryValueBackendDefinition customUnit(String customUnit) {
    this.customUnit = customUnit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return customUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomUnit() {
    return customUnit;
  }

  public void setCustomUnit(String customUnit) {
    this.customUnit = customUnit;
  }

  public QueryValueBackendDefinition description(String description) {
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

  public QueryValueBackendDefinition notes(String notes) {
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

  public QueryValueBackendDefinition precision(Double precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return precision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPrecision() {
    return precision;
  }

  public void setPrecision(Double precision) {
    this.precision = precision;
  }

  public QueryValueBackendDefinition requests(List<QueryValueBackendRequest> requests) {
    this.requests = requests;
    for (QueryValueBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public QueryValueBackendDefinition addRequestsItem(QueryValueBackendRequest requestsItem) {
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
  public List<QueryValueBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<QueryValueBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (QueryValueBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public QueryValueBackendDefinition textAlign(WidgetTextAlign textAlign) {
    this.textAlign = textAlign;
    this.unparsed |= !textAlign.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return textAlign
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetTextAlign getTextAlign() {
    return textAlign;
  }

  public void setTextAlign(WidgetTextAlign textAlign) {
    if (!textAlign.isValid()) {
      this.unparsed = true;
    }
    this.textAlign = textAlign;
  }

  public QueryValueBackendDefinition time(WidgetTime time) {
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

  public QueryValueBackendDefinition timeseriesBackground(
      TimeseriesBackground timeseriesBackground) {
    this.timeseriesBackground = timeseriesBackground;
    this.unparsed |= timeseriesBackground.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return timeseriesBackground
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESERIES_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TimeseriesBackground getTimeseriesBackground() {
    return timeseriesBackground;
  }

  public void setTimeseriesBackground(TimeseriesBackground timeseriesBackground) {
    this.timeseriesBackground = timeseriesBackground;
    if (timeseriesBackground != null) {
      this.unparsed |= timeseriesBackground.unparsed;
    }
  }

  public QueryValueBackendDefinition title(String title) {
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

  public QueryValueBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public QueryValueBackendDefinition titleSize(String titleSize) {
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

  public QueryValueBackendDefinition type(QueryValueBackendDefinitionType type) {
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
  public QueryValueBackendDefinitionType getType() {
    return type;
  }

  public void setType(QueryValueBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this QueryValueBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValueBackendDefinition queryValueBackendDefinition = (QueryValueBackendDefinition) o;
    return Objects.equals(this.autoscale, queryValueBackendDefinition.autoscale)
        && Objects.equals(this.customLinks, queryValueBackendDefinition.customLinks)
        && Objects.equals(this.customUnit, queryValueBackendDefinition.customUnit)
        && Objects.equals(this.description, queryValueBackendDefinition.description)
        && Objects.equals(this.notes, queryValueBackendDefinition.notes)
        && Objects.equals(this.precision, queryValueBackendDefinition.precision)
        && Objects.equals(this.requests, queryValueBackendDefinition.requests)
        && Objects.equals(this.textAlign, queryValueBackendDefinition.textAlign)
        && Objects.equals(this.time, queryValueBackendDefinition.time)
        && Objects.equals(
            this.timeseriesBackground, queryValueBackendDefinition.timeseriesBackground)
        && Objects.equals(this.title, queryValueBackendDefinition.title)
        && Objects.equals(this.titleAlign, queryValueBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, queryValueBackendDefinition.titleSize)
        && Objects.equals(this.type, queryValueBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        autoscale,
        customLinks,
        customUnit,
        description,
        notes,
        precision,
        requests,
        textAlign,
        time,
        timeseriesBackground,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValueBackendDefinition {\n");
    sb.append("    autoscale: ").append(toIndentedString(autoscale)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    customUnit: ").append(toIndentedString(customUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    textAlign: ").append(toIndentedString(textAlign)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeseriesBackground: ")
        .append(toIndentedString(timeseriesBackground))
        .append("\n");
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
