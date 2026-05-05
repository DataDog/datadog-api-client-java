/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** This widget displays a Cloudcraft topology of cloud resources for the selected provider. */
@JsonPropertyOrder({
  CloudcraftWidgetDefinition.JSON_PROPERTY_CUSTOM_LINKS,
  CloudcraftWidgetDefinition.JSON_PROPERTY_DESCRIPTION,
  CloudcraftWidgetDefinition.JSON_PROPERTY_GROUP_BY,
  CloudcraftWidgetDefinition.JSON_PROPERTY_HIGHLIGHTED,
  CloudcraftWidgetDefinition.JSON_PROPERTY_OVERLAY,
  CloudcraftWidgetDefinition.JSON_PROPERTY_OVERLAY_FILTER,
  CloudcraftWidgetDefinition.JSON_PROPERTY_PROJECTION,
  CloudcraftWidgetDefinition.JSON_PROPERTY_PROVIDER,
  CloudcraftWidgetDefinition.JSON_PROPERTY_QUERY_STRING,
  CloudcraftWidgetDefinition.JSON_PROPERTY_SHOW_EMPTY_GROUPS,
  CloudcraftWidgetDefinition.JSON_PROPERTY_TITLE,
  CloudcraftWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  CloudcraftWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  CloudcraftWidgetDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudcraftWidgetDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_LINKS = "custom_links";
  private List<WidgetCustomLink> customLinks = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<String> groupBy = new ArrayList<>();

  public static final String JSON_PROPERTY_HIGHLIGHTED = "highlighted";
  private String highlighted;

  public static final String JSON_PROPERTY_OVERLAY = "overlay";
  private CloudcraftWidgetDefinitionOverlay overlay;

  public static final String JSON_PROPERTY_OVERLAY_FILTER = "overlay_filter";
  private String overlayFilter;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private CloudcraftWidgetDefinitionProjection projection;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private CloudcraftWidgetDefinitionProvider provider;

  public static final String JSON_PROPERTY_QUERY_STRING = "query_string";
  private String queryString;

  public static final String JSON_PROPERTY_SHOW_EMPTY_GROUPS = "show_empty_groups";
  private Boolean showEmptyGroups;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudcraftWidgetDefinitionType type = CloudcraftWidgetDefinitionType.CLOUDCRAFT;

  public CloudcraftWidgetDefinition() {}

  @JsonCreator
  public CloudcraftWidgetDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_GROUP_BY) List<String> groupBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIGHLIGHTED) String highlighted,
      @JsonProperty(required = true, value = JSON_PROPERTY_OVERLAY)
          CloudcraftWidgetDefinitionOverlay overlay,
      @JsonProperty(required = true, value = JSON_PROPERTY_OVERLAY_FILTER) String overlayFilter,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECTION)
          CloudcraftWidgetDefinitionProjection projection,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER)
          CloudcraftWidgetDefinitionProvider provider,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_STRING) String queryString,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHOW_EMPTY_GROUPS)
          Boolean showEmptyGroups,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CloudcraftWidgetDefinitionType type) {
    this.groupBy = groupBy;
    this.highlighted = highlighted;
    this.overlay = overlay;
    this.unparsed |= !overlay.isValid();
    this.overlayFilter = overlayFilter;
    this.projection = projection;
    this.unparsed |= !projection.isValid();
    this.provider = provider;
    this.unparsed |= !provider.isValid();
    this.queryString = queryString;
    this.showEmptyGroups = showEmptyGroups;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CloudcraftWidgetDefinition customLinks(List<WidgetCustomLink> customLinks) {
    this.customLinks = customLinks;
    for (WidgetCustomLink item : customLinks) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CloudcraftWidgetDefinition addCustomLinksItem(WidgetCustomLink customLinksItem) {
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
  }

  public CloudcraftWidgetDefinition description(String description) {
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

  public CloudcraftWidgetDefinition groupBy(List<String> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public CloudcraftWidgetDefinition addGroupByItem(String groupByItem) {
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * List of tags or attributes used to group the cloud resources in the widget.
   *
   * @return groupBy
   */
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }

  public CloudcraftWidgetDefinition highlighted(String highlighted) {
    this.highlighted = highlighted;
    return this;
  }

  /**
   * Search query that visually highlights matching resources in the diagram.
   *
   * @return highlighted
   */
  @JsonProperty(JSON_PROPERTY_HIGHLIGHTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHighlighted() {
    return highlighted;
  }

  public void setHighlighted(String highlighted) {
    this.highlighted = highlighted;
  }

  public CloudcraftWidgetDefinition overlay(CloudcraftWidgetDefinitionOverlay overlay) {
    this.overlay = overlay;
    this.unparsed |= !overlay.isValid();
    return this;
  }

  /**
   * Overlay applied on top of the Cloudcraft topology.
   *
   * @return overlay
   */
  @JsonProperty(JSON_PROPERTY_OVERLAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudcraftWidgetDefinitionOverlay getOverlay() {
    return overlay;
  }

  public void setOverlay(CloudcraftWidgetDefinitionOverlay overlay) {
    if (!overlay.isValid()) {
      this.unparsed = true;
    }
    this.overlay = overlay;
  }

  public CloudcraftWidgetDefinition overlayFilter(String overlayFilter) {
    this.overlayFilter = overlayFilter;
    return this;
  }

  /**
   * Filter applied to the selected overlay.
   *
   * @return overlayFilter
   */
  @JsonProperty(JSON_PROPERTY_OVERLAY_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOverlayFilter() {
    return overlayFilter;
  }

  public void setOverlayFilter(String overlayFilter) {
    this.overlayFilter = overlayFilter;
  }

  public CloudcraftWidgetDefinition projection(CloudcraftWidgetDefinitionProjection projection) {
    this.projection = projection;
    this.unparsed |= !projection.isValid();
    return this;
  }

  /**
   * Projection used to render the Cloudcraft topology.
   *
   * @return projection
   */
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudcraftWidgetDefinitionProjection getProjection() {
    return projection;
  }

  public void setProjection(CloudcraftWidgetDefinitionProjection projection) {
    if (!projection.isValid()) {
      this.unparsed = true;
    }
    this.projection = projection;
  }

  public CloudcraftWidgetDefinition provider(CloudcraftWidgetDefinitionProvider provider) {
    this.provider = provider;
    this.unparsed |= !provider.isValid();
    return this;
  }

  /**
   * Cloud provider for the Cloudcraft widget.
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudcraftWidgetDefinitionProvider getProvider() {
    return provider;
  }

  public void setProvider(CloudcraftWidgetDefinitionProvider provider) {
    if (!provider.isValid()) {
      this.unparsed = true;
    }
    this.provider = provider;
  }

  public CloudcraftWidgetDefinition queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }

  /**
   * Query string used to filter the cloud resources displayed in the widget.
   *
   * @return queryString
   */
  @JsonProperty(JSON_PROPERTY_QUERY_STRING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQueryString() {
    return queryString;
  }

  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }

  public CloudcraftWidgetDefinition showEmptyGroups(Boolean showEmptyGroups) {
    this.showEmptyGroups = showEmptyGroups;
    return this;
  }

  /**
   * Whether to show empty outline groups in the diagram.
   *
   * @return showEmptyGroups
   */
  @JsonProperty(JSON_PROPERTY_SHOW_EMPTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getShowEmptyGroups() {
    return showEmptyGroups;
  }

  public void setShowEmptyGroups(Boolean showEmptyGroups) {
    this.showEmptyGroups = showEmptyGroups;
  }

  public CloudcraftWidgetDefinition title(String title) {
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

  public CloudcraftWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
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

  public CloudcraftWidgetDefinition titleSize(String titleSize) {
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

  public CloudcraftWidgetDefinition type(CloudcraftWidgetDefinitionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of Cloudcraft widget.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudcraftWidgetDefinitionType getType() {
    return type;
  }

  public void setType(CloudcraftWidgetDefinitionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CloudcraftWidgetDefinition
   */
  @JsonAnySetter
  public CloudcraftWidgetDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CloudcraftWidgetDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudcraftWidgetDefinition cloudcraftWidgetDefinition = (CloudcraftWidgetDefinition) o;
    return Objects.equals(this.customLinks, cloudcraftWidgetDefinition.customLinks)
        && Objects.equals(this.description, cloudcraftWidgetDefinition.description)
        && Objects.equals(this.groupBy, cloudcraftWidgetDefinition.groupBy)
        && Objects.equals(this.highlighted, cloudcraftWidgetDefinition.highlighted)
        && Objects.equals(this.overlay, cloudcraftWidgetDefinition.overlay)
        && Objects.equals(this.overlayFilter, cloudcraftWidgetDefinition.overlayFilter)
        && Objects.equals(this.projection, cloudcraftWidgetDefinition.projection)
        && Objects.equals(this.provider, cloudcraftWidgetDefinition.provider)
        && Objects.equals(this.queryString, cloudcraftWidgetDefinition.queryString)
        && Objects.equals(this.showEmptyGroups, cloudcraftWidgetDefinition.showEmptyGroups)
        && Objects.equals(this.title, cloudcraftWidgetDefinition.title)
        && Objects.equals(this.titleAlign, cloudcraftWidgetDefinition.titleAlign)
        && Objects.equals(this.titleSize, cloudcraftWidgetDefinition.titleSize)
        && Objects.equals(this.type, cloudcraftWidgetDefinition.type)
        && Objects.equals(
            this.additionalProperties, cloudcraftWidgetDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customLinks,
        description,
        groupBy,
        highlighted,
        overlay,
        overlayFilter,
        projection,
        provider,
        queryString,
        showEmptyGroups,
        title,
        titleAlign,
        titleSize,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudcraftWidgetDefinition {\n");
    sb.append("    customLinks: ").append(toIndentedString(customLinks)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    highlighted: ").append(toIndentedString(highlighted)).append("\n");
    sb.append("    overlay: ").append(toIndentedString(overlay)).append("\n");
    sb.append("    overlayFilter: ").append(toIndentedString(overlayFilter)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    showEmptyGroups: ").append(toIndentedString(showEmptyGroups)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
