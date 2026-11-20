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
  SunburstBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  SunburstBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  SunburstBackendDefinition.JSON_PROPERTY_HIDE_TOTAL,
  SunburstBackendDefinition.JSON_PROPERTY_LEGEND,
  SunburstBackendDefinition.JSON_PROPERTY_NOTES,
  SunburstBackendDefinition.JSON_PROPERTY_REQUESTS,
  SunburstBackendDefinition.JSON_PROPERTY_TIME,
  SunburstBackendDefinition.JSON_PROPERTY_TITLE,
  SunburstBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  SunburstBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  SunburstBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SunburstBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HIDE_TOTAL = "hide_total";
  private Boolean hideTotal;

  public static final String JSON_PROPERTY_LEGEND = "legend";
  private SunburstLegend legend;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<SunburstBackendRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SunburstBackendDefinitionType type;

  public SunburstBackendDefinition() {}

  @JsonCreator
  public SunburstBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<SunburstBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SunburstBackendDefinitionType type) {
    this.requests = requests;
    for (SunburstBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SunburstBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public SunburstBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public SunburstBackendDefinition description(String description) {
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

  public SunburstBackendDefinition hideTotal(Boolean hideTotal) {
    this.hideTotal = hideTotal;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return hideTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHideTotal() {
    return hideTotal;
  }

  public void setHideTotal(Boolean hideTotal) {
    this.hideTotal = hideTotal;
  }

  public SunburstBackendDefinition legend(SunburstLegend legend) {
    this.legend = legend;
    this.unparsed |= legend.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return legend
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SunburstLegend getLegend() {
    return legend;
  }

  public void setLegend(SunburstLegend legend) {
    this.legend = legend;
    if (legend != null) {
      this.unparsed |= legend.unparsed;
    }
  }

  public SunburstBackendDefinition notes(String notes) {
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

  public SunburstBackendDefinition requests(List<SunburstBackendRequest> requests) {
    this.requests = requests;
    for (SunburstBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SunburstBackendDefinition addRequestsItem(SunburstBackendRequest requestsItem) {
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
  public List<SunburstBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<SunburstBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (SunburstBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SunburstBackendDefinition time(WidgetTime time) {
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

  public SunburstBackendDefinition title(String title) {
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

  public SunburstBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public SunburstBackendDefinition titleSize(String titleSize) {
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

  public SunburstBackendDefinition type(SunburstBackendDefinitionType type) {
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
  public SunburstBackendDefinitionType getType() {
    return type;
  }

  public void setType(SunburstBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SunburstBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SunburstBackendDefinition sunburstBackendDefinition = (SunburstBackendDefinition) o;
    return Objects.equals(this.customLinks, sunburstBackendDefinition.customLinks)
        && Objects.equals(this.description, sunburstBackendDefinition.description)
        && Objects.equals(this.hideTotal, sunburstBackendDefinition.hideTotal)
        && Objects.equals(this.legend, sunburstBackendDefinition.legend)
        && Objects.equals(this.notes, sunburstBackendDefinition.notes)
        && Objects.equals(this.requests, sunburstBackendDefinition.requests)
        && Objects.equals(this.time, sunburstBackendDefinition.time)
        && Objects.equals(this.title, sunburstBackendDefinition.title)
        && Objects.equals(this.titleAlign, sunburstBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, sunburstBackendDefinition.titleSize)
        && Objects.equals(this.type, sunburstBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
        hideTotal,
        legend,
        notes,
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
    sb.append("class SunburstBackendDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hideTotal: ").append(toIndentedString(hideTotal)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
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
