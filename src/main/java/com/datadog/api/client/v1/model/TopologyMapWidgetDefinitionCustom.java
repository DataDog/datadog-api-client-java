/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Custom topology map widget. Renders nodes and edges from inline <code>data</code> and from scalar
 * <code>requests</code>. There is one node for each node ID found in <code>data.nodes</code>,
 * <code>data.edges</code>, and <code>requests</code>. When <code>data</code> and several requests
 * set the same field on the same node (such as <code>title</code> or <code>values[0]</code>), the
 * last non-null value wins.
 */
@JsonPropertyOrder({
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_CUSTOM_LINKS,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_DATA,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_DESCRIPTION,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_LAYOUT,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_REQUESTS,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_TIME,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_TITLE,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_TITLE_ALIGN,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_TITLE_SIZE,
  TopologyMapWidgetDefinitionCustom.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapWidgetDefinitionCustom {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DATA = "data";
  private TopologyMapInlineData data;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LAYOUT = "layout";
  private TopologyMapLayout layout;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TopologyRequestCustom> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TopologyMapWidgetDefinitionType type = TopologyMapWidgetDefinitionType.TOPOLOGY_MAP;

  public TopologyMapWidgetDefinitionCustom() {}

  @JsonCreator
  public TopologyMapWidgetDefinitionCustom(
      @JsonProperty(required = true, value = JSON_PROPERTY_LAYOUT) TopologyMapLayout layout,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TopologyRequestCustom> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TopologyMapWidgetDefinitionType type) {
    this.layout = layout;
    this.unparsed |= layout.unparsed;
    this.requests = requests;
    for (TopologyRequestCustom item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TopologyMapWidgetDefinitionCustom customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TopologyMapWidgetDefinitionCustom addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * List of custom links.
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

  public TopologyMapWidgetDefinitionCustom data(TopologyMapInlineData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Static nodes and edges, stored in columns. Within a table, every column must have the same
   * number of values and a unique <code>id</code>.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TopologyMapInlineData getData() {
    return data;
  }

  public void setData(TopologyMapInlineData data) {
    this.data = data;
    if (data != null) {
      this.unparsed |= data.unparsed;
    }
  }

  public TopologyMapWidgetDefinitionCustom description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the widget.
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

  public TopologyMapWidgetDefinitionCustom layout(TopologyMapLayout layout) {
    this.layout = layout;
    this.unparsed |= layout.unparsed;
    return this;
  }

  /**
   * Algorithm that positions nodes and edges. The <code>hierarchical</code> layout places nodes in
   * ranks so edges flow in one direction.
   *
   * @return layout
   */
  @JsonProperty(JSON_PROPERTY_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapLayout getLayout() {
    return layout;
  }

  public void setLayout(TopologyMapLayout layout) {
    this.layout = layout;
    if (layout != null) {
      this.unparsed |= layout.unparsed;
    }
  }

  public TopologyMapWidgetDefinitionCustom requests(List<TopologyRequestCustom> requests) {
    this.requests = requests;
    for (TopologyRequestCustom item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TopologyMapWidgetDefinitionCustom addRequestsItem(TopologyRequestCustom requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * List of scalar requests that supply node data. Can be empty.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TopologyRequestCustom> getRequests() {
    return requests;
  }

  public void setRequests(List<TopologyRequestCustom> requests) {
    this.requests = requests;
    if (requests != null) {
      for (TopologyRequestCustom item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TopologyMapWidgetDefinitionCustom time(WidgetTime time) {
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
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
  }

  public TopologyMapWidgetDefinitionCustom title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of your widget.
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

  public TopologyMapWidgetDefinitionCustom titleAlign(WidgetTextAlign titleAlign) {
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

  public TopologyMapWidgetDefinitionCustom titleSize(String titleSize) {
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

  public TopologyMapWidgetDefinitionCustom type(TopologyMapWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the topology map widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TopologyMapWidgetDefinitionType getType() {
    return type;
  }

  public void setType(TopologyMapWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this TopologyMapWidgetDefinitionCustom object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapWidgetDefinitionCustom topologyMapWidgetDefinitionCustom =
        (TopologyMapWidgetDefinitionCustom) o;
    return Objects.equals(this.customLinks, topologyMapWidgetDefinitionCustom.customLinks)
        && Objects.equals(this.data, topologyMapWidgetDefinitionCustom.data)
        && Objects.equals(this.description, topologyMapWidgetDefinitionCustom.description)
        && Objects.equals(this.layout, topologyMapWidgetDefinitionCustom.layout)
        && Objects.equals(this.requests, topologyMapWidgetDefinitionCustom.requests)
        && Objects.equals(this.time, topologyMapWidgetDefinitionCustom.time)
        && Objects.equals(this.title, topologyMapWidgetDefinitionCustom.title)
        && Objects.equals(this.titleAlign, topologyMapWidgetDefinitionCustom.titleAlign)
        && Objects.equals(this.titleSize, topologyMapWidgetDefinitionCustom.titleSize)
        && Objects.equals(this.type, topologyMapWidgetDefinitionCustom.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks, data, description, layout, requests, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapWidgetDefinitionCustom {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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
