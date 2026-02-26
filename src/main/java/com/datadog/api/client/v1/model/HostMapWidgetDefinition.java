/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The host map widget graphs any metric across your hosts using the same visualization available from the main Host Map page.</p>
 */
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
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
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

  public HostMapWidgetDefinition() {}

  @JsonCreator
  public HostMapWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)HostMapWidgetDefinitionRequests requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)HostMapWidgetDefinitionType type) {
        this.requests = requests;
        this.unparsed |= requests.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public HostMapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public HostMapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
    if (this.customLinks == null) {
      this.customLinks = new ArrayList<>();
    }
    this.customLinks.add(customLinksItem);
    this.unparsed |= customLinksItem.unparsed;
    return this;
  }

  /**
   * <p>List of custom links.</p>
   * @return customLinks
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>List of tag prefixes to group by.</p>
   * @return group
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the hosts that don’t fit in a group.</p>
   * @return noGroupHosts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NO_GROUP_HOSTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether to show the hosts with no metrics.</p>
   * @return noMetricHosts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NO_METRIC_HOSTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getNoMetricHosts() {
        return noMetricHosts;
      }
  public void setNoMetricHosts(Boolean noMetricHosts) {
    this.noMetricHosts = noMetricHosts;
  }
  public HostMapWidgetDefinition nodeType(WidgetNodeType nodeType) {
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    return this;
  }

  /**
   * <p>Which type of node to use in the map.</p>
   * @return nodeType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NODE_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetNodeType getNodeType() {
        return nodeType;
      }
  public void setNodeType(WidgetNodeType nodeType) {
    if (!nodeType.isValid()) {
        this.unparsed = true;
    }
    this.nodeType = nodeType;
  }
  public HostMapWidgetDefinition notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * <p>Notes on the title.</p>
   * @return notes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NOTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getNotes() {
        return notes;
      }
  public void setNotes(String notes) {
    this.notes = notes;
  }
  public HostMapWidgetDefinition requests(HostMapWidgetDefinitionRequests requests) {
    this.requests = requests;
    this.unparsed |= requests.unparsed;
    return this;
  }

  /**
   * <p>List of definitions.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * <p>List of tags used to filter the map.</p>
   * @return scope
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCOPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getScope() {
        return scope;
      }
  public void setScope(List<String> scope) {
    this.scope = scope;
  }
  public HostMapWidgetDefinition style(HostMapWidgetDefinitionStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * <p>The style to apply to the widget.</p>
   * @return style
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STYLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Title of the widget.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
  }
  public HostMapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
    this.unparsed |= !titleAlign.isValid();
    return this;
  }

  /**
   * <p>How to align the text on the widget.</p>
   * @return titleAlign
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTextAlign getTitleAlign() {
        return titleAlign;
      }
  public void setTitleAlign(WidgetTextAlign titleAlign) {
    if (!titleAlign.isValid()) {
        this.unparsed = true;
    }
    this.titleAlign = titleAlign;
  }
  public HostMapWidgetDefinition titleSize(String titleSize) {
    this.titleSize = titleSize;
    return this;
  }

  /**
   * <p>Size of the title.</p>
   * @return titleSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitleSize() {
        return titleSize;
      }
  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }
  public HostMapWidgetDefinition type(HostMapWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the host map widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public HostMapWidgetDefinitionType getType() {
        return type;
      }
  public void setType(HostMapWidgetDefinitionType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return HostMapWidgetDefinition
   */
  @JsonAnySetter
  public HostMapWidgetDefinition putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
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
    return Objects.equals(this.customLinks, hostMapWidgetDefinition.customLinks) && Objects.equals(this.group, hostMapWidgetDefinition.group) && Objects.equals(this.noGroupHosts, hostMapWidgetDefinition.noGroupHosts) && Objects.equals(this.noMetricHosts, hostMapWidgetDefinition.noMetricHosts) && Objects.equals(this.nodeType, hostMapWidgetDefinition.nodeType) && Objects.equals(this.notes, hostMapWidgetDefinition.notes) && Objects.equals(this.requests, hostMapWidgetDefinition.requests) && Objects.equals(this.scope, hostMapWidgetDefinition.scope) && Objects.equals(this.style, hostMapWidgetDefinition.style) && Objects.equals(this.title, hostMapWidgetDefinition.title) && Objects.equals(this.titleAlign, hostMapWidgetDefinition.titleAlign) && Objects.equals(this.titleSize, hostMapWidgetDefinition.titleSize) && Objects.equals(this.type, hostMapWidgetDefinition.type) && Objects.equals(this.additionalProperties, hostMapWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(customLinks,group,noGroupHosts,noMetricHosts,nodeType,notes,requests,scope,style,title,titleAlign,titleSize,type, additionalProperties);
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
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
