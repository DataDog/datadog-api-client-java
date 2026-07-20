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

/** Topology map widget backed by the data streams data source. */
@JsonPropertyOrder({
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_CUSTOM_LINKS,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_DESCRIPTION,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_REQUESTS,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_TIME,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_TITLE,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_TITLE_ALIGN,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_TITLE_SIZE,
  TopologyMapWidgetDefinitionDataStreams.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TopologyMapWidgetDefinitionDataStreams {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TopologyRequestDataStreams> requests = new ArrayList<>();

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

  public TopologyMapWidgetDefinitionDataStreams() {}

  @JsonCreator
  public TopologyMapWidgetDefinitionDataStreams(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          List<TopologyRequestDataStreams> requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TopologyMapWidgetDefinitionType type) {
    this.requests = requests;
    for (TopologyRequestDataStreams item : requests) {
      this.unparsed |= item.unparsed;
    }
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TopologyMapWidgetDefinitionDataStreams customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TopologyMapWidgetDefinitionDataStreams addCustomLinksItem(
      WidgetCustomLink customLinksItem) {
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

  public TopologyMapWidgetDefinitionDataStreams description(String description) {
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

  public TopologyMapWidgetDefinitionDataStreams requests(
      List<TopologyRequestDataStreams> requests) {
    this.requests = requests;
    for (TopologyRequestDataStreams item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TopologyMapWidgetDefinitionDataStreams addRequestsItem(
      TopologyRequestDataStreams requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * One Topology request.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TopologyRequestDataStreams> getRequests() {
    return requests;
  }

  public void setRequests(List<TopologyRequestDataStreams> requests) {
    this.requests = requests;
    if (requests != null) {
      for (TopologyRequestDataStreams item : requests) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TopologyMapWidgetDefinitionDataStreams time(WidgetTime time) {
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

  public TopologyMapWidgetDefinitionDataStreams title(String title) {
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

  public TopologyMapWidgetDefinitionDataStreams titleAlign(WidgetTextAlign titleAlign) {
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

  public TopologyMapWidgetDefinitionDataStreams titleSize(String titleSize) {
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

  public TopologyMapWidgetDefinitionDataStreams type(TopologyMapWidgetDefinitionType type) {
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

  /** Return true if this TopologyMapWidgetDefinitionDataStreams object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyMapWidgetDefinitionDataStreams topologyMapWidgetDefinitionDataStreams =
        (TopologyMapWidgetDefinitionDataStreams) o;
    return Objects.equals(this.customLinks, topologyMapWidgetDefinitionDataStreams.customLinks)
        && Objects.equals(this.description, topologyMapWidgetDefinitionDataStreams.description)
        && Objects.equals(this.requests, topologyMapWidgetDefinitionDataStreams.requests)
        && Objects.equals(this.time, topologyMapWidgetDefinitionDataStreams.time)
        && Objects.equals(this.title, topologyMapWidgetDefinitionDataStreams.title)
        && Objects.equals(this.titleAlign, topologyMapWidgetDefinitionDataStreams.titleAlign)
        && Objects.equals(this.titleSize, topologyMapWidgetDefinitionDataStreams.titleSize)
        && Objects.equals(this.type, topologyMapWidgetDefinitionDataStreams.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks, description, requests, time, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyMapWidgetDefinitionDataStreams {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
