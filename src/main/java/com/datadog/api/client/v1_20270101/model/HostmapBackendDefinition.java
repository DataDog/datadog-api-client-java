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
  HostmapBackendDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  HostmapBackendDefinition.JSON_PROPERTY_DESCRIPTION,
  HostmapBackendDefinition.JSON_PROPERTY_GROUP,
  HostmapBackendDefinition.JSON_PROPERTY_NO_GROUP_HOSTS,
  HostmapBackendDefinition.JSON_PROPERTY_NO_METRIC_HOSTS,
  HostmapBackendDefinition.JSON_PROPERTY_NODE_TYPE,
  HostmapBackendDefinition.JSON_PROPERTY_NOTES,
  HostmapBackendDefinition.JSON_PROPERTY_REQUESTS,
  HostmapBackendDefinition.JSON_PROPERTY_SCOPE,
  HostmapBackendDefinition.JSON_PROPERTY_STYLE,
  HostmapBackendDefinition.JSON_PROPERTY_TIME,
  HostmapBackendDefinition.JSON_PROPERTY_TITLE,
  HostmapBackendDefinition.JSON_PROPERTY_TITLE_ALIGN,
  HostmapBackendDefinition.JSON_PROPERTY_TITLE_SIZE,
  HostmapBackendDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostmapBackendDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP = "group";
  private List<String> group = null;

  public static final String JSON_PROPERTY_NO_GROUP_HOSTS = "no_group_hosts";
  private Boolean noGroupHosts;

  public static final String JSON_PROPERTY_NO_METRIC_HOSTS = "no_metric_hosts";
  private Boolean noMetricHosts;

  public static final String JSON_PROPERTY_NODE_TYPE = "node_type";
  private HostmapBackendDefinitionNodeType nodeType;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private HostmapBackendDefinition20270101Requests requests;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<String> scope = null;

  public static final String JSON_PROPERTY_STYLE = "style";
  private HostmapBackendDefinitionStyle style;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private HostmapBackendDefinitionType type;

  public HostmapBackendDefinition() {}

  @JsonCreator
  public HostmapBackendDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUESTS)
          HostmapBackendDefinition20270101Requests requests,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          HostmapBackendDefinitionType type) {
    this.requests = requests;
    this.unparsed |= requests.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public HostmapBackendDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    if (customLinks != null) {
      for (WidgetCustomLink item : customLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HostmapBackendDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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

  public HostmapBackendDefinition description(String description) {
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

  public HostmapBackendDefinition group(List<String> group) {
    this.group = group;
    return this;
  }

  public HostmapBackendDefinition addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return group
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }

  public HostmapBackendDefinition noGroupHosts(Boolean noGroupHosts) {
    this.noGroupHosts = noGroupHosts;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return noGroupHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_GROUP_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoGroupHosts() {
    return noGroupHosts;
  }

  public void setNoGroupHosts(Boolean noGroupHosts) {
    this.noGroupHosts = noGroupHosts;
  }

  public HostmapBackendDefinition noMetricHosts(Boolean noMetricHosts) {
    this.noMetricHosts = noMetricHosts;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return noMetricHosts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_METRIC_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoMetricHosts() {
    return noMetricHosts;
  }

  public void setNoMetricHosts(Boolean noMetricHosts) {
    this.noMetricHosts = noMetricHosts;
  }

  public HostmapBackendDefinition nodeType(HostmapBackendDefinitionNodeType nodeType) {
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return nodeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostmapBackendDefinitionNodeType getNodeType() {
    return nodeType;
  }

  public void setNodeType(HostmapBackendDefinitionNodeType nodeType) {
    if (!nodeType.isValid()) {
      this.unparsed = true;
    }
    this.nodeType = nodeType;
  }

  public HostmapBackendDefinition notes(String notes) {
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

  public HostmapBackendDefinition requests(HostmapBackendDefinition20270101Requests requests) {
    this.requests = requests;
    this.unparsed |= requests.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requests
   */
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostmapBackendDefinition20270101Requests getRequests() {
    return requests;
  }

  public void setRequests(HostmapBackendDefinition20270101Requests requests) {
    this.requests = requests;
    if (requests != null) {
      this.unparsed |= requests.unparsed;
    }
  }

  public HostmapBackendDefinition scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public HostmapBackendDefinition addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }

  public HostmapBackendDefinition style(HostmapBackendDefinitionStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostmapBackendDefinitionStyle getStyle() {
    return style;
  }

  public void setStyle(HostmapBackendDefinitionStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  public HostmapBackendDefinition time(WidgetTime time) {
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

  public HostmapBackendDefinition title(String title) {
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

  public HostmapBackendDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public HostmapBackendDefinition titleSize(String titleSize) {
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

  public HostmapBackendDefinition type(HostmapBackendDefinitionType type) {
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
  public HostmapBackendDefinitionType getType() {
    return type;
  }

  public void setType(HostmapBackendDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this HostmapBackendDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostmapBackendDefinition hostmapBackendDefinition = (HostmapBackendDefinition) o;
    return Objects.equals(this.customLinks, hostmapBackendDefinition.customLinks)
        && Objects.equals(this.description, hostmapBackendDefinition.description)
        && Objects.equals(this.group, hostmapBackendDefinition.group)
        && Objects.equals(this.noGroupHosts, hostmapBackendDefinition.noGroupHosts)
        && Objects.equals(this.noMetricHosts, hostmapBackendDefinition.noMetricHosts)
        && Objects.equals(this.nodeType, hostmapBackendDefinition.nodeType)
        && Objects.equals(this.notes, hostmapBackendDefinition.notes)
        && Objects.equals(this.requests, hostmapBackendDefinition.requests)
        && Objects.equals(this.scope, hostmapBackendDefinition.scope)
        && Objects.equals(this.style, hostmapBackendDefinition.style)
        && Objects.equals(this.time, hostmapBackendDefinition.time)
        && Objects.equals(this.title, hostmapBackendDefinition.title)
        && Objects.equals(this.titleAlign, hostmapBackendDefinition.titleAlign)
        && Objects.equals(this.titleSize, hostmapBackendDefinition.titleSize)
        && Objects.equals(this.type, hostmapBackendDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
        group,
        noGroupHosts,
        noMetricHosts,
        nodeType,
        notes,
        requests,
        scope,
        style,
        time,
        title,
        titleAlign,
        titleSize,
        type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostmapBackendDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    noGroupHosts: ").append(toIndentedString(noGroupHosts)).append("\n");
    sb.append("    noMetricHosts: ").append(toIndentedString(noMetricHosts)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
