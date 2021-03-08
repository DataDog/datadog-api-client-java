/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.HostMapWidgetDefinitionRequests;
import com.datadog.api.v1.client.model.HostMapWidgetDefinitionStyle;
import com.datadog.api.v1.client.model.HostMapWidgetDefinitionType;
import com.datadog.api.v1.client.model.WidgetCustomLink;
import com.datadog.api.v1.client.model.WidgetNodeType;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The host map widget graphs any metric across your hosts using the same visualization available from the main Host Map page.
 */
@ApiModel(description = "The host map widget graphs any metric across your hosts using the same visualization available from the main Host Map page.")
@JsonPropertyOrder({
  HostMapWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  HostMapWidgetDefinition.JSON_PROPERTY_GROUP,
  HostMapWidgetDefinition.JSON_PROPERTY_NO_GROUP_HOSTS,
  HostMapWidgetDefinition.JSON_PROPERTY_NO_METRIC_HOSTS,
  HostMapWidgetDefinition.JSON_PROPERTY_NODE_TYPE,
  HostMapWidgetDefinition.JSON_PROPERTY_NOTES,
  HostMapWidgetDefinition.JSON_PROPERTY_REQUESTS,
  HostMapWidgetDefinition.JSON_PROPERTY_SCOPE,
  HostMapWidgetDefinition.JSON_PROPERTY_STYLE,
  HostMapWidgetDefinition.JSON_PROPERTY_TITLE,
  HostMapWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  HostMapWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  HostMapWidgetDefinition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HostMapWidgetDefinition {
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private List<String> group = null;

  public static final String JSON_PROPERTY_NO_GROUP_HOSTS = "no_group_hosts";
  private Boolean noGroupHosts;

  public static final String JSON_PROPERTY_NO_METRIC_HOSTS = "no_metric_hosts";
  private Boolean noMetricHosts;

  public static final String JSON_PROPERTY_NODE_TYPE = "node_type";
  private WidgetNodeType nodeType;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private HostMapWidgetDefinitionRequests requests;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private List<String> scope = null;

  public static final String JSON_PROPERTY_STYLE = "style";
  private HostMapWidgetDefinitionStyle style;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private HostMapWidgetDefinitionType type = HostMapWidgetDefinitionType.HOSTMAP;


  public HostMapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    return this;
  }

  public HostMapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    return this;
  }

   /**
   * List of custom links.
   * @return customLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of custom links.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetCustomLink> getCustomLinks() {
    return customLinks;
  }


  public void setCustomLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
  }


  public HostMapWidgetDefinition group(List<String> group) {
    this.group = group;
    return this;
  }

  public HostMapWidgetDefinition addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

   /**
   * List of tag prefixes to group by.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tag prefixes to group by.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroup() {
    return group;
  }


  public void setGroup(List<String> group) {
    this.group = group;
  }


  public HostMapWidgetDefinition noGroupHosts(Boolean noGroupHosts) {
    this.noGroupHosts = noGroupHosts;
    return this;
  }

   /**
   * Whether to show the hosts that don’t fit in a group.
   * @return noGroupHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the hosts that don’t fit in a group.")
  @JsonProperty(JSON_PROPERTY_NO_GROUP_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNoGroupHosts() {
    return noGroupHosts;
  }


  public void setNoGroupHosts(Boolean noGroupHosts) {
    this.noGroupHosts = noGroupHosts;
  }


  public HostMapWidgetDefinition noMetricHosts(Boolean noMetricHosts) {
    this.noMetricHosts = noMetricHosts;
    return this;
  }

   /**
   * Whether to show the hosts with no metrics.
   * @return noMetricHosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to show the hosts with no metrics.")
  @JsonProperty(JSON_PROPERTY_NO_METRIC_HOSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNoMetricHosts() {
    return noMetricHosts;
  }


  public void setNoMetricHosts(Boolean noMetricHosts) {
    this.noMetricHosts = noMetricHosts;
  }


  public HostMapWidgetDefinition nodeType(WidgetNodeType nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetNodeType getNodeType() {
    return nodeType;
  }


  public void setNodeType(WidgetNodeType nodeType) {
    this.nodeType = nodeType;
  }


  public HostMapWidgetDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes on the title.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notes on the title.")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public HostMapWidgetDefinition requests(HostMapWidgetDefinitionRequests requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HostMapWidgetDefinitionRequests getRequests() {
    return requests;
  }


  public void setRequests(HostMapWidgetDefinitionRequests requests) {
    this.requests = requests;
  }


  public HostMapWidgetDefinition scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public HostMapWidgetDefinition addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * List of tags used to filter the map.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tags used to filter the map.")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getScope() {
    return scope;
  }


  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  public HostMapWidgetDefinition style(HostMapWidgetDefinitionStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HostMapWidgetDefinitionStyle getStyle() {
    return style;
  }


  public void setStyle(HostMapWidgetDefinitionStyle style) {
    this.style = style;
  }


  public HostMapWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the widget.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public HostMapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    return this;
  }

   /**
   * Get titleAlign
   * @return titleAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }


  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }


  public HostMapWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title.
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title.")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


  public HostMapWidgetDefinition type(HostMapWidgetDefinitionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HostMapWidgetDefinitionType getType() {
    return type;
  }


  public void setType(HostMapWidgetDefinitionType type) {
    this.type = type;
  }


  /**
   * Return true if this HostMapWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetDefinition hostMapWidgetDefinition = (HostMapWidgetDefinition) o;
    return Objects.equals(this.customLinks, hostMapWidgetDefinition.customLinks) &&
        Objects.equals(this.group, hostMapWidgetDefinition.group) &&
        Objects.equals(this.noGroupHosts, hostMapWidgetDefinition.noGroupHosts) &&
        Objects.equals(this.noMetricHosts, hostMapWidgetDefinition.noMetricHosts) &&
        Objects.equals(this.nodeType, hostMapWidgetDefinition.nodeType) &&
        Objects.equals(this.notes, hostMapWidgetDefinition.notes) &&
        Objects.equals(this.requests, hostMapWidgetDefinition.requests) &&
        Objects.equals(this.scope, hostMapWidgetDefinition.scope) &&
        Objects.equals(this.style, hostMapWidgetDefinition.style) &&
        Objects.equals(this.title, hostMapWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, hostMapWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, hostMapWidgetDefinition.titleSize) &&
        Objects.equals(this.type, hostMapWidgetDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customLinks, group, noGroupHosts, noMetricHosts, nodeType, notes, requests, scope, style, title, titleAlign, titleSize, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    noGroupHosts: ").append(toIndentedString(noGroupHosts)).append("\n");
    sb.append("    noMetricHosts: ").append(toIndentedString(noMetricHosts)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

