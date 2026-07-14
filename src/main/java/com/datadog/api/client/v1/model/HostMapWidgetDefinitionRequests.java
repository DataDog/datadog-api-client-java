/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 * Query definition for the host map widget. Supports three mutually exclusive formats distinguished
 * by <code>request_type</code>: the deprecated legacy metric-based format (<code>fill</code>/<code>
 * size</code>, no <code>request_type</code>), the infrastructure-backed format (<code>
 * request_type: infrastructure_hostmap</code>), and the DDSQL published-dataset format (<code>
 * request_type: data_projection</code>).
 */
@JsonPropertyOrder({
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_CHILD,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_CONDITIONAL_FORMATS,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_ENRICHMENTS,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_FILL,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_FILTER,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_GROUP_BY,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_LIMIT,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_NO_GROUP_HOSTS,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_NO_METRIC_HOSTS,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_NODE_TYPE,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_PROJECTION,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_QUERY,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_REQUEST_TYPE,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_SIZE,
  HostMapWidgetDefinitionRequests.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostMapWidgetDefinitionRequests {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD = "child";
  private HostMapWidgetInfrastructureRequest child;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<WidgetConditionalFormat> conditionalFormats = null;

  public static final String JSON_PROPERTY_ENRICHMENTS = "enrichments";
  private List<HostMapWidgetScalarRequest> enrichments = null;

  public static final String JSON_PROPERTY_FILL = "fill";
  private HostMapRequest fill;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<HostMapWidgetGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_NO_GROUP_HOSTS = "no_group_hosts";
  private Boolean noGroupHosts;

  public static final String JSON_PROPERTY_NO_METRIC_HOSTS = "no_metric_hosts";
  private Boolean noMetricHosts;

  public static final String JSON_PROPERTY_NODE_TYPE = "node_type";
  private HostMapWidgetNodeType nodeType;

  public static final String JSON_PROPERTY_PROJECTION = "projection";
  private HostMapWidgetProjection projection;

  public static final String JSON_PROPERTY_QUERY = "query";
  private DatasetListQuery query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private HostMapWidgetDefinitionRequestType requestType;

  public static final String JSON_PROPERTY_SIZE = "size";
  private HostMapRequest size;

  public static final String JSON_PROPERTY_STYLE = "style";
  private HostMapWidgetInfrastructureStyle style;

  public HostMapWidgetDefinitionRequests child(HostMapWidgetInfrastructureRequest child) {
    this.child = child;
    this.unparsed |= child.unparsed;
    return this;
  }

  /**
   * Infrastructure-backed request for the host map widget. Supports entity-based visualization with
   * metric query enrichments, tag-based filtering, flexible grouping, and hierarchical views.
   *
   * @return child
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapWidgetInfrastructureRequest getChild() {
    return child;
  }

  public void setChild(HostMapWidgetInfrastructureRequest child) {
    this.child = child;
    if (child != null) {
      this.unparsed |= child.unparsed;
    }
  }

  public HostMapWidgetDefinitionRequests conditionalFormats(
      List<WidgetConditionalFormat> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (WidgetConditionalFormat item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HostMapWidgetDefinitionRequests addConditionalFormatsItem(
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
    if (conditionalFormats != null) {
      for (WidgetConditionalFormat item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HostMapWidgetDefinitionRequests enrichments(List<HostMapWidgetScalarRequest> enrichments) {
    this.enrichments = enrichments;
    if (enrichments != null) {
      for (HostMapWidgetScalarRequest item : enrichments) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HostMapWidgetDefinitionRequests addEnrichmentsItem(
      HostMapWidgetScalarRequest enrichmentsItem) {
    if (this.enrichments == null) {
      this.enrichments = new ArrayList<>();
    }
    this.enrichments.add(enrichmentsItem);
    this.unparsed |= enrichmentsItem.unparsed;
    return this;
  }

  /**
   * Metric or event queries joined to the entity set. Each formula specifies a visual dimension.
   * Only used by the infrastructure-backed format.
   *
   * @return enrichments
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENRICHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HostMapWidgetScalarRequest> getEnrichments() {
    return enrichments;
  }

  public void setEnrichments(List<HostMapWidgetScalarRequest> enrichments) {
    this.enrichments = enrichments;
    if (enrichments != null) {
      for (HostMapWidgetScalarRequest item : enrichments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HostMapWidgetDefinitionRequests fill(HostMapRequest fill) {
    this.fill = fill;
    this.unparsed |= fill.unparsed;
    return this;
  }

  /**
   * Deprecated - Legacy metric-based host map request. Use the infrastructure-backed (<code>
   * request_type: infrastructure_hostmap</code>) or DDSQL (<code>request_type: data_projection
   * </code>) format instead.
   *
   * @return fill
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapRequest getFill() {
    return fill;
  }

  @Deprecated
  public void setFill(HostMapRequest fill) {
    this.fill = fill;
    if (fill != null) {
      this.unparsed |= fill.unparsed;
    }
  }

  public HostMapWidgetDefinitionRequests filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Filter string for the entity set in tag format (for example, <code>env:prod</code>). Only used
   * by the infrastructure-backed format.
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

  public HostMapWidgetDefinitionRequests groupBy(List<HostMapWidgetGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (HostMapWidgetGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HostMapWidgetDefinitionRequests addGroupByItem(HostMapWidgetGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Defines how entities are grouped into tiles. The ordering of entries implies the grouping
   * hierarchy. Only used by the infrastructure-backed format.
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
    if (groupBy != null) {
      for (HostMapWidgetGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HostMapWidgetDefinitionRequests limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of rows to return from the dataset query. Only used by the DDSQL format.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public HostMapWidgetDefinitionRequests noGroupHosts(Boolean noGroupHosts) {
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

  public HostMapWidgetDefinitionRequests noMetricHosts(Boolean noMetricHosts) {
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

  public HostMapWidgetDefinitionRequests nodeType(HostMapWidgetNodeType nodeType) {
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    return this;
  }

  /**
   * Which type of infrastructure entity to visualize in the host map.
   *
   * @return nodeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapWidgetNodeType getNodeType() {
    return nodeType;
  }

  public void setNodeType(HostMapWidgetNodeType nodeType) {
    if (!nodeType.isValid()) {
      this.unparsed = true;
    }
    this.nodeType = nodeType;
  }

  public HostMapWidgetDefinitionRequests projection(HostMapWidgetProjection projection) {
    this.projection = projection;
    this.unparsed |= projection.unparsed;
    return this;
  }

  /**
   * Projection for the DDSQL host map request. Maps dataset columns to map dimensions: <code>node
   * </code> identifies the entity, repeated <code>group</code> entries define the grouping
   * hierarchy (outermost first), and <code>fill</code>/<code>size</code> drive the tile color and
   * size.
   *
   * @return projection
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapWidgetProjection getProjection() {
    return projection;
  }

  public void setProjection(HostMapWidgetProjection projection) {
    this.projection = projection;
    if (projection != null) {
      this.unparsed |= projection.unparsed;
    }
  }

  public HostMapWidgetDefinitionRequests query(DatasetListQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Query that lists the rows of a published dataset (a DDSQL query) without aggregation.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DatasetListQuery getQuery() {
    return query;
  }

  public void setQuery(DatasetListQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public HostMapWidgetDefinitionRequests requestType(
      HostMapWidgetDefinitionRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Identifies which host map request format the sibling fields on <code>
   * HostMapWidgetDefinitionRequests</code> describe: an infrastructure-backed request or a DDSQL
   * published-dataset request.
   *
   * @return requestType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapWidgetDefinitionRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(HostMapWidgetDefinitionRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public HostMapWidgetDefinitionRequests size(HostMapRequest size) {
    this.size = size;
    this.unparsed |= size.unparsed;
    return this;
  }

  /**
   * Deprecated - Legacy metric-based host map request. Use the infrastructure-backed (<code>
   * request_type: infrastructure_hostmap</code>) or DDSQL (<code>request_type: data_projection
   * </code>) format instead.
   *
   * @return size
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostMapRequest getSize() {
    return size;
  }

  @Deprecated
  public void setSize(HostMapRequest size) {
    this.size = size;
    if (size != null) {
      this.unparsed |= size.unparsed;
    }
  }

  public HostMapWidgetDefinitionRequests style(HostMapWidgetInfrastructureStyle style) {
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
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
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
   * @return HostMapWidgetDefinitionRequests
   */
  @JsonAnySetter
  public HostMapWidgetDefinitionRequests putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HostMapWidgetDefinitionRequests object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMapWidgetDefinitionRequests hostMapWidgetDefinitionRequests =
        (HostMapWidgetDefinitionRequests) o;
    return Objects.equals(this.child, hostMapWidgetDefinitionRequests.child)
        && Objects.equals(
            this.conditionalFormats, hostMapWidgetDefinitionRequests.conditionalFormats)
        && Objects.equals(this.enrichments, hostMapWidgetDefinitionRequests.enrichments)
        && Objects.equals(this.fill, hostMapWidgetDefinitionRequests.fill)
        && Objects.equals(this.filter, hostMapWidgetDefinitionRequests.filter)
        && Objects.equals(this.groupBy, hostMapWidgetDefinitionRequests.groupBy)
        && Objects.equals(this.limit, hostMapWidgetDefinitionRequests.limit)
        && Objects.equals(this.noGroupHosts, hostMapWidgetDefinitionRequests.noGroupHosts)
        && Objects.equals(this.noMetricHosts, hostMapWidgetDefinitionRequests.noMetricHosts)
        && Objects.equals(this.nodeType, hostMapWidgetDefinitionRequests.nodeType)
        && Objects.equals(this.projection, hostMapWidgetDefinitionRequests.projection)
        && Objects.equals(this.query, hostMapWidgetDefinitionRequests.query)
        && Objects.equals(this.requestType, hostMapWidgetDefinitionRequests.requestType)
        && Objects.equals(this.size, hostMapWidgetDefinitionRequests.size)
        && Objects.equals(this.style, hostMapWidgetDefinitionRequests.style)
        && Objects.equals(
            this.additionalProperties, hostMapWidgetDefinitionRequests.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        child,
        conditionalFormats,
        enrichments,
        fill,
        filter,
        groupBy,
        limit,
        noGroupHosts,
        noMetricHosts,
        nodeType,
        projection,
        query,
        requestType,
        size,
        style,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMapWidgetDefinitionRequests {\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    conditionalFormats: ").append(toIndentedString(conditionalFormats)).append("\n");
    sb.append("    enrichments: ").append(toIndentedString(enrichments)).append("\n");
    sb.append("    fill: ").append(toIndentedString(fill)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    noGroupHosts: ").append(toIndentedString(noGroupHosts)).append("\n");
    sb.append("    noMetricHosts: ").append(toIndentedString(noMetricHosts)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    projection: ").append(toIndentedString(projection)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
