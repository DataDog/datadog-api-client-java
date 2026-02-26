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
   * <p>The treemap visualization enables you to display hierarchical and nested data. It is well suited for queries that describe part-whole relationships, such as resource usage by availability zone, data center, or team.</p>
 */
@JsonPropertyOrder({
  TreeMapWidgetDefinition.JSON_PROPERTY_COLOR_BY,
  TreeMapWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  TreeMapWidgetDefinition.JSON_PROPERTY_GROUP_BY,
  TreeMapWidgetDefinition.JSON_PROPERTY_REQUESTS,
  TreeMapWidgetDefinition.JSON_PROPERTY_SIZE_BY,
  TreeMapWidgetDefinition.JSON_PROPERTY_TIME,
  TreeMapWidgetDefinition.JSON_PROPERTY_TITLE,
  TreeMapWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TreeMapWidgetDefinition {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLOR_BY = "color_by";
  private TreeMapColorBy colorBy = TreeMapColorBy.USER;

  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private TreeMapGroupBy groupBy;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<TreeMapWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SIZE_BY = "size_by";
  private TreeMapSizeBy sizeBy;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TreeMapWidgetDefinitionType type = TreeMapWidgetDefinitionType.TREEMAP;

  public TreeMapWidgetDefinition() {}

  @JsonCreator
  public TreeMapWidgetDefinition(
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUESTS)List<TreeMapWidgetRequest> requests,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)TreeMapWidgetDefinitionType type) {
        this.requests = requests;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public TreeMapWidgetDefinition colorBy(TreeMapColorBy colorBy) {
    this.colorBy = colorBy;
    this.unparsed |= !colorBy.isValid();
    return this;
  }

  /**
   * <p>(deprecated) The attribute formerly used to determine color in the widget.</p>
   * @return colorBy
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COLOR_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TreeMapColorBy getColorBy() {
        return colorBy;
      }
  @Deprecated
  public void setColorBy(TreeMapColorBy colorBy) {
    if (!colorBy.isValid()) {
        this.unparsed = true;
    }
    this.colorBy = colorBy;
  }
  public TreeMapWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public TreeMapWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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
  public TreeMapWidgetDefinition groupBy(TreeMapGroupBy groupBy) {
    this.groupBy = groupBy;
    this.unparsed |= !groupBy.isValid();
    return this;
  }

  /**
   * <p>(deprecated) The attribute formerly used to group elements in the widget.</p>
   * @return groupBy
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TreeMapGroupBy getGroupBy() {
        return groupBy;
      }
  @Deprecated
  public void setGroupBy(TreeMapGroupBy groupBy) {
    if (!groupBy.isValid()) {
        this.unparsed = true;
    }
    this.groupBy = groupBy;
  }
  public TreeMapWidgetDefinition requests(List<TreeMapWidgetRequest> requests) {
    this.requests = requests;
    for (TreeMapWidgetRequest item : requests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public TreeMapWidgetDefinition addRequestsItem(TreeMapWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    this.unparsed |= requestsItem.unparsed;
    return this;
  }

  /**
   * <p>List of treemap widget requests.</p>
   * @return requests
  **/
      @JsonProperty(JSON_PROPERTY_REQUESTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<TreeMapWidgetRequest> getRequests() {
        return requests;
      }
  public void setRequests(List<TreeMapWidgetRequest> requests) {
    this.requests = requests;
  }
  public TreeMapWidgetDefinition sizeBy(TreeMapSizeBy sizeBy) {
    this.sizeBy = sizeBy;
    this.unparsed |= !sizeBy.isValid();
    return this;
  }

  /**
   * <p>(deprecated) The attribute formerly used to determine size in the widget.</p>
   * @return sizeBy
   * @deprecated
  **/
      @Deprecated
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TreeMapSizeBy getSizeBy() {
        return sizeBy;
      }
  @Deprecated
  public void setSizeBy(TreeMapSizeBy sizeBy) {
    if (!sizeBy.isValid()) {
        this.unparsed = true;
    }
    this.sizeBy = sizeBy;
  }
  public TreeMapWidgetDefinition time(WidgetTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>Time setting for the widget.</p>
   * @return time
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public WidgetTime getTime() {
        return time;
      }
  public void setTime(WidgetTime time) {
    this.time = time;
  }
  public TreeMapWidgetDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Title of your widget.</p>
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
  public TreeMapWidgetDefinition type(TreeMapWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Type of the treemap widget.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public TreeMapWidgetDefinitionType getType() {
        return type;
      }
  public void setType(TreeMapWidgetDefinitionType type) {
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
   * @return TreeMapWidgetDefinition
   */
  @JsonAnySetter
  public TreeMapWidgetDefinition putAdditionalProperty(String key, Object value) {
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
   * Return true if this TreeMapWidgetDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeMapWidgetDefinition treeMapWidgetDefinition = (TreeMapWidgetDefinition) o;
    return Objects.equals(this.colorBy, treeMapWidgetDefinition.colorBy) && Objects.equals(this.customLinks, treeMapWidgetDefinition.customLinks) && Objects.equals(this.groupBy, treeMapWidgetDefinition.groupBy) && Objects.equals(this.requests, treeMapWidgetDefinition.requests) && Objects.equals(this.sizeBy, treeMapWidgetDefinition.sizeBy) && Objects.equals(this.time, treeMapWidgetDefinition.time) && Objects.equals(this.title, treeMapWidgetDefinition.title) && Objects.equals(this.type, treeMapWidgetDefinition.type) && Objects.equals(this.additionalProperties, treeMapWidgetDefinition.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(colorBy,customLinks,groupBy,requests,sizeBy,time,title,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeMapWidgetDefinition {\n");
    sb.append("    colorBy: ").append(toIndentedString(colorBy)).append("\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    sizeBy: ").append(toIndentedString(sizeBy)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
