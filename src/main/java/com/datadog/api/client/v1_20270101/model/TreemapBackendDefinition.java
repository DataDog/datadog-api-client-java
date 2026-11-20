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
  TreemapBackendDefinition.JSON_PROPERTY_COLOR_BY,
  TreemapBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  TreemapBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  TreemapBackendDefinition.JSON_PROPERTY_GROUP_BY,
  TreemapBackendDefinition.JSON_PROPERTY_NOTES,
  TreemapBackendDefinition.JSON_PROPERTY_REQUESTS,
  TreemapBackendDefinition.JSON_PROPERTY_SIZE_BY,
  TreemapBackendDefinition.JSON_PROPERTY_TIME,
  TreemapBackendDefinition.JSON_PROPERTY_TITLE,
  TreemapBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  TreemapBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  TreemapBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreemapBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY = "color_by";
  private TreemapBackendDefinitionColorBy colorBy;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private TreemapBackendDefinitionGroupBy groupBy;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TreemapBackendRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SIZE_BY = "size_by";
  private TreemapBackendDefinitionSizeBy sizeBy;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TreemapBackendDefinitionType type;

  public TreemapBackendDefinition() {}

  @JsonCreator
  public TreemapBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TreemapBackendRequest> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TreemapBackendDefinitionType type) {
    this.requests = requests;
    for (TreemapBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TreemapBackendDefinition colorBy(TreemapBackendDefinitionColorBy colorBy) {
    this.colorBy = colorBy;
    this.unparsed |= !colorBy.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return colorBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreemapBackendDefinitionColorBy getColorBy() {
    return colorBy;
  }

  public void setColorBy(TreemapBackendDefinitionColorBy colorBy) {
    if (!colorBy.isValid()) {
      this.unparsed = true;
    }
    this.colorBy = colorBy;
  }

  public TreemapBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TreemapBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public TreemapBackendDefinition description(String description) {
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

  public TreemapBackendDefinition groupBy(TreemapBackendDefinitionGroupBy groupBy) {
    this.groupBy = groupBy;
    this.unparsed |= !groupBy.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreemapBackendDefinitionGroupBy getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(TreemapBackendDefinitionGroupBy groupBy) {
    if (!groupBy.isValid()) {
      this.unparsed = true;
    }
    this.groupBy = groupBy;
  }

  public TreemapBackendDefinition notes(String notes) {
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

  public TreemapBackendDefinition requests(List<TreemapBackendRequest> requests) {
    this.requests = requests;
    for (TreemapBackendRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TreemapBackendDefinition addRequestsItem(TreemapBackendRequest requestsItem) {
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
  public List<TreemapBackendRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<TreemapBackendRequest> requests) {
    this.requests = requests;
    if (requests != null) {
      for (TreemapBackendRequest item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TreemapBackendDefinition sizeBy(TreemapBackendDefinitionSizeBy sizeBy) {
    this.sizeBy = sizeBy;
    this.unparsed |= !sizeBy.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return sizeBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TreemapBackendDefinitionSizeBy getSizeBy() {
    return sizeBy;
  }

  public void setSizeBy(TreemapBackendDefinitionSizeBy sizeBy) {
    if (!sizeBy.isValid()) {
      this.unparsed = true;
    }
    this.sizeBy = sizeBy;
  }

  public TreemapBackendDefinition time(WidgetTime time) {
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

  public TreemapBackendDefinition title(String title) {
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

  public TreemapBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public TreemapBackendDefinition titleSize(String titleSize) {
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

  public TreemapBackendDefinition type(TreemapBackendDefinitionType type) {
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
  public TreemapBackendDefinitionType getType() {
    return type;
  }

  public void setType(TreemapBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TreemapBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreemapBackendDefinition treemapBackendDefinition = (TreemapBackendDefinition) o;
    return Objects.equals(this.colorBy, treemapBackendDefinition.colorBy)
        && Objects.equals(this.customLinks, treemapBackendDefinition.customLinks)
        && Objects.equals(this.description, treemapBackendDefinition.description)
        && Objects.equals(this.groupBy, treemapBackendDefinition.groupBy)
        && Objects.equals(this.notes, treemapBackendDefinition.notes)
        && Objects.equals(this.requests, treemapBackendDefinition.requests)
        && Objects.equals(this.sizeBy, treemapBackendDefinition.sizeBy)
        && Objects.equals(this.time, treemapBackendDefinition.time)
        && Objects.equals(this.title, treemapBackendDefinition.title)
        && Objects.equals(this.titleAlign, treemapBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, treemapBackendDefinition.titleSize)
        && Objects.equals(this.type, treemapBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        colorBy,
        customLinks,
        description,
        groupBy,
        notes,
        requests,
        sizeBy,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreemapBackendDefinition {\n");
    sb.append("    colorBy: ").append(toIndentedString(colorBy)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    sizeBy: ").append(toIndentedString(sizeBy)).append("\n");
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
