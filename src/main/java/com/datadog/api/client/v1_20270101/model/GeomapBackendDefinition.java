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
  GeomapBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  GeomapBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  GeomapBackendDefinition.JSON_PROPERTY_NOTES,
  GeomapBackendDefinition.JSON_PROPERTY_REQUESTS,
  GeomapBackendDefinition.JSON_PROPERTY_STYLE,
  GeomapBackendDefinition.JSON_PROPERTY_TIME,
  GeomapBackendDefinition.JSON_PROPERTY_TITLE,
  GeomapBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  GeomapBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  GeomapBackendDefinition.JSON_PROPERTY_TYPE,
  GeomapBackendDefinition.JSON_PROPERTY_VIEW
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GeomapBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<GeomapBackendRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_STYLE = "style";
  private GeomapStyle style;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private GeomapBackendDefinitionType type;

  public static final String JSON_PROPERTY_VIEW = "view";
  private GeomapView view;

  public GeomapBackendDefinition() {}

  @JsonCreator
  public GeomapBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<GeomapBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_STYLE) GeomapStyle style,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) GeomapBackendDefinitionType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VIEW) GeomapView view) {
    this.requests = requests;
    for (GeomapBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.style = style;
    this.unparsed |= style.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.view = view;
    this.unparsed |= view.unparsed;
  }

  public GeomapBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public GeomapBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public GeomapBackendDefinition description(String description) {
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

  public GeomapBackendDefinition notes(String notes) {
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

  public GeomapBackendDefinition requests(List<GeomapBackendRequest> requests) {
    this.requests = requests;
    for (GeomapBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GeomapBackendDefinition addRequestsItem(GeomapBackendRequest requestsItem) {
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
  public List<GeomapBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<GeomapBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (GeomapBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public GeomapBackendDefinition style(GeomapStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapStyle getStyle() {
    return style;
  }

  public void setStyle(GeomapStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  public GeomapBackendDefinition time(WidgetTime time) {
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

  public GeomapBackendDefinition title(String title) {
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

  public GeomapBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public GeomapBackendDefinition titleSize(String titleSize) {
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

  public GeomapBackendDefinition type(GeomapBackendDefinitionType type) {
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
  public GeomapBackendDefinitionType getType() {
    return type;
  }

  public void setType(GeomapBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public GeomapBackendDefinition view(GeomapView view) {
    this.view = view;
    this.unparsed |= view.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return view
   */
  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GeomapView getView() {
    return view;
  }

  public void setView(GeomapView view) {
    this.view = view;
    if (view != null) {
      this.unparsed |= view.unparsed;
    }
  }

  /** Return true if this GeomapBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeomapBackendDefinition geomapBackendDefinition = (GeomapBackendDefinition) o;
    return Objects.equals(this.customLinks, geomapBackendDefinition.customLinks)
        && Objects.equals(this.description, geomapBackendDefinition.description)
        && Objects.equals(this.notes, geomapBackendDefinition.notes)
        && Objects.equals(this.requests, geomapBackendDefinition.requests)
        && Objects.equals(this.style, geomapBackendDefinition.style)
        && Objects.equals(this.time, geomapBackendDefinition.time)
        && Objects.equals(this.title, geomapBackendDefinition.title)
        && Objects.equals(this.titleAlign, geomapBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, geomapBackendDefinition.titleSize)
        && Objects.equals(this.type, geomapBackendDefinition.type)
        && Objects.equals(this.view, geomapBackendDefinition.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
        notes,
        requests,
        style,
        time,
        title,
        titleAlign,
        titleSize,
        type,
        view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeomapBackendDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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
