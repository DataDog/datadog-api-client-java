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

/**
 * Infrastructure-backed request for the host map widget. Supports entity-based visualization with
 * metric query enrichments, tag-based filtering, flexible grouping, and hierarchical views.
 */
@JsonPropertyOrder({
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_CHILD,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_ENRICHMENTS,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_FILTER,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_GROUP_BY,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_NO_GROUP_HOSTS,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_NO_METRIC_HOSTS,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_NODE_TYPE,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_REQUEST_TYPE,
  HostMapWidgetInfrastructureRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetInfrastructureRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD = "child";
  private HostMapWidgetInfrastructureRequestLeaf child;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_ENRICHMENTS = "enrichments";
  private List<HostMapWidgetScalarRequest> enrichments = new ArrayList<>();

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<HostMapWidgetGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NO_GROUP_HOSTS = "no_group_hosts";
  private Boolean noGroupHosts;

  public static final String JSON_PROPERTY_NO_METRIC_HOSTS = "no_metric_hosts";
  private Boolean noMetricHosts;

  public static final String JSON_PROPERTY_NODE_TYPE = "node_type";
  private HostMapWidgetNodeType nodeType;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private HostMapWidgetInfrastructureRequestRequestType requestType;

  public static final String JSON_PROPERTY_STYLE = "style";
  private HostMapWidgetInfrastructureStyle style;

  public HostMapWidgetInfrastructureRequest() {}

  @JsonCreator
  public HostMapWidgetInfrastructureRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENRICHMENTS)
          List<HostMapWidgetScalarRequest> enrichments,
      @JsonProperty(required = true, value = JSON_PROPERTY_NODE_TYPE)
          HostMapWidgetNodeType nodeType,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          HostMapWidgetInfrastructureRequestRequestType requestType) {
    this.enrichments = enrichments;
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public HostMapWidgetInfrastructureRequest child(HostMapWidgetInfrastructureRequestLeaf child) {
    this.child = child;
    this.unparsed |= child.unparsed;
    return this;
  }

  /**
   * Infrastructure-backed host map child request (leaf node, no further nesting supported).
   *
   * @return child
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapWidgetInfrastructureRequestLeaf getChild() {
    return child;
  }

  public void setChild(HostMapWidgetInfrastructureRequestLeaf child) {
    this.child = child;
  }

  public HostMapWidgetInfrastructureRequest conditionalFormats(
      List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    for (WidgetConditionalFormat item : conditionalFormats) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostMapWidgetInfrastructureRequest addConditionalFormatsItem(
      WidgetConditionalFormat conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * List of conditional formatting rules applied to fill values.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WidgetConditionalFormat> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
  }

  public HostMapWidgetInfrastructureRequest enrichments(
      List<HostMapWidgetScalarRequest> enrichments) {
    this.enrichments = enrichments;
    for (HostMapWidgetScalarRequest item : enrichments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostMapWidgetInfrastructureRequest addEnrichmentsItem(
      HostMapWidgetScalarRequest enrichmentsItem) {
    this.enrichments.add(enrichmentsItem);
    this.unparsed |= enrichmentsItem.unparsed;
    return this;
  }

  /**
   * Metric or event queries joined to the entity set. Each formula specifies a visual dimension.
   *
   * @return enrichments
   */
  @JsonProperty(JSON_PROPERTY_ENRICHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HostMapWidgetScalarRequest> getEnrichments() {
    return enrichments;
  }

  public void setEnrichments(List<HostMapWidgetScalarRequest> enrichments) {
    this.enrichments = enrichments;
  }

  public HostMapWidgetInfrastructureRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Filter string for the entity set in tag format (for example, <code>env:prod</code>).
   *
   * @return filter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public HostMapWidgetInfrastructureRequest groupBy(List<HostMapWidgetGroupBy> groupBy) {
    this.groupBy = groupBy;
    for (HostMapWidgetGroupBy item : groupBy) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostMapWidgetInfrastructureRequest addGroupByItem(HostMapWidgetGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Defines how entities are grouped into tiles. The ordering of entries implies the grouping
   * hierarchy.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HostMapWidgetGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<HostMapWidgetGroupBy> groupBy) {
    this.groupBy = groupBy;
  }

  public HostMapWidgetInfrastructureRequest noGroupHosts(Boolean noGroupHosts) {
    this.noGroupHosts = noGroupHosts;
    return this;
  }

  /**
   * Whether to hide entities that have no group assignment.
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

  public HostMapWidgetInfrastructureRequest noMetricHosts(Boolean noMetricHosts) {
    this.noMetricHosts = noMetricHosts;
    return this;
  }

  /**
   * Whether to hide entities that have no enrichment data.
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

  public HostMapWidgetInfrastructureRequest nodeType(HostMapWidgetNodeType nodeType) {
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    return this;
  }

  /**
   * Which type of infrastructure entity to visualize in the host map.
   *
   * @return nodeType
   */
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostMapWidgetNodeType getNodeType() {
    return nodeType;
  }

  public void setNodeType(HostMapWidgetNodeType nodeType) {
    if (!nodeType.isValid()) {
      this.unparsed = true;
    }
    this.nodeType = nodeType;
  }

  public HostMapWidgetInfrastructureRequest requestType(
      HostMapWidgetInfrastructureRequestRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Identifies this as an infrastructure-backed host map request.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostMapWidgetInfrastructureRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(HostMapWidgetInfrastructureRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public HostMapWidgetInfrastructureRequest style(HostMapWidgetInfrastructureStyle style) {
    this.style = style;
    this.unparsed |= style.unparsed;
    return this;
  }

  /**
   * Style configuration for the infrastructure host map.
   *
   * @return style
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapWidgetInfrastructureStyle getStyle() {
    return style;
  }

  public void setStyle(HostMapWidgetInfrastructureStyle style) {
    this.style = style;
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
   * @return HostMapWidgetInfrastructureRequest
   */
  @JsonAnySetter
  public HostMapWidgetInfrastructureRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMapWidgetInfrastructureRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetInfrastructureRequest hostMapWidgetInfrastructureRequest =
        (HostMapWidgetInfrastructureRequest) o;
    return Objects.equals(this.child, hostMapWidgetInfrastructureRequest.child)
        && Objects.equals(
            this.conditionalFormats, hostMapWidgetInfrastructureRequest.conditionalFormats)
        && Objects.equals(this.enrichments, hostMapWidgetInfrastructureRequest.enrichments)
        && Objects.equals(this.filter, hostMapWidgetInfrastructureRequest.filter)
        && Objects.equals(this.groupBy, hostMapWidgetInfrastructureRequest.groupBy)
        && Objects.equals(this.noGroupHosts, hostMapWidgetInfrastructureRequest.noGroupHosts)
        && Objects.equals(this.noMetricHosts, hostMapWidgetInfrastructureRequest.noMetricHosts)
        && Objects.equals(this.nodeType, hostMapWidgetInfrastructureRequest.nodeType)
        && Objects.equals(this.requestType, hostMapWidgetInfrastructureRequest.requestType)
        && Objects.equals(this.style, hostMapWidgetInfrastructureRequest.style)
        && Objects.equals(
            this.additionalProperties, hostMapWidgetInfrastructureRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        child,
        conditionalFormats,
        enrichments,
        filter,
        groupBy,
        noGroupHosts,
        noMetricHosts,
        nodeType,
        requestType,
        style,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetInfrastructureRequest {\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    enrichments: ").append(toIndentedString(enrichments)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    noGroupHosts: ").append(toIndentedString(noGroupHosts)).append("\n");
    sb.append("    noMetricHosts: ").append(toIndentedString(noMetricHosts)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
