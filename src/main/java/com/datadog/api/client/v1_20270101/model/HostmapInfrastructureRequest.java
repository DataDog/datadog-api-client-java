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
  HostmapInfrastructureRequest.JSON_PROPERTY_CHILD,
  HostmapInfrastructureRequest.JSON_PROPERTY_CONDITIONAL_FORMATS,
  HostmapInfrastructureRequest.JSON_PROPERTY_ENRICHMENTS,
  HostmapInfrastructureRequest.JSON_PROPERTY_FILTER,
  HostmapInfrastructureRequest.JSON_PROPERTY_GROUP_BY,
  HostmapInfrastructureRequest.JSON_PROPERTY_NO_GROUP_HOSTS,
  HostmapInfrastructureRequest.JSON_PROPERTY_NO_METRIC_HOSTS,
  HostmapInfrastructureRequest.JSON_PROPERTY_NODE_TYPE,
  HostmapInfrastructureRequest.JSON_PROPERTY_REQUEST_TYPE,
  HostmapInfrastructureRequest.JSON_PROPERTY_STYLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HostmapInfrastructureRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD = "child";
  private HostmapInfrastructureRequest child;

  public static final String JSON_PROPERTY_CONDITIONAL_FORMATS = "conditional_formats";
  private List<ThresholdFormattingRule> conditionalFormats = null;

  public static final String JSON_PROPERTY_ENRICHMENTS = "enrichments";
  private List<HostmapScalarFormulaRequest> enrichments = new ArrayList<>();

  public static final String JSON_PROPERTY_FILTER = "filter";
  private String filter;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<HostmapGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_NO_GROUP_HOSTS = "no_group_hosts";
  private Boolean noGroupHosts;

  public static final String JSON_PROPERTY_NO_METRIC_HOSTS = "no_metric_hosts";
  private Boolean noMetricHosts;

  public static final String JSON_PROPERTY_NODE_TYPE = "node_type";
  private HostmapNodeType nodeType;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private HostmapInfrastructureRequestRequestType requestType;

  public static final String JSON_PROPERTY_STYLE = "style";
  private HostmapStyle style;

  public HostmapInfrastructureRequest() {}

  @JsonCreator
  public HostmapInfrastructureRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENRICHMENTS)
          List<HostmapScalarFormulaRequest> enrichments,
      @JsonProperty(required = true, value = JSON_PROPERTY_NODE_TYPE) HostmapNodeType nodeType,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          HostmapInfrastructureRequestRequestType requestType) {
    this.enrichments = enrichments;
    for (HostmapScalarFormulaRequest item : enrichments) {
      this.unparsed |= item.unparsed;
    }
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
  }

  public HostmapInfrastructureRequest child(HostmapInfrastructureRequest child) {
    this.child = child;
    this.unparsed |= child.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return child
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HostmapInfrastructureRequest getChild() {
    return child;
  }

  public void setChild(HostmapInfrastructureRequest child) {
    this.child = child;
    if (child != null) {
      this.unparsed |= child.unparsed;
    }
  }

  public HostmapInfrastructureRequest conditionalFormats(
      List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HostmapInfrastructureRequest addConditionalFormatsItem(
      ThresholdFormattingRule conditionalFormatsItem) {
    if (this.conditionalFormats == null) {
      this.conditionalFormats = new ArrayList<>();
    }
    this.conditionalFormats.add(conditionalFormatsItem);
    this.unparsed |= conditionalFormatsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return conditionalFormats
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONAL_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ThresholdFormattingRule> getConditionalFormats() {
    return conditionalFormats;
  }

  public void setConditionalFormats(List<ThresholdFormattingRule> conditionalFormats) {
    this.conditionalFormats = conditionalFormats;
    if (conditionalFormats != null) {
      for (ThresholdFormattingRule item : conditionalFormats) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HostmapInfrastructureRequest enrichments(List<HostmapScalarFormulaRequest> enrichments) {
    this.enrichments = enrichments;
    for (HostmapScalarFormulaRequest item : enrichments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HostmapInfrastructureRequest addEnrichmentsItem(
      HostmapScalarFormulaRequest enrichmentsItem) {
    this.enrichments.add(enrichmentsItem);
    this.unparsed |= enrichmentsItem.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return enrichments
   */
  @JsonProperty(JSON_PROPERTY_ENRICHMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HostmapScalarFormulaRequest> getEnrichments() {
    return enrichments;
  }

  public void setEnrichments(List<HostmapScalarFormulaRequest> enrichments) {
    this.enrichments = enrichments;
    if (enrichments != null) {
      for (HostmapScalarFormulaRequest item : enrichments) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HostmapInfrastructureRequest filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public HostmapInfrastructureRequest groupBy(List<HostmapGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (HostmapGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public HostmapInfrastructureRequest addGroupByItem(HostmapGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
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
  public List<HostmapGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<HostmapGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (HostmapGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public HostmapInfrastructureRequest noGroupHosts(Boolean noGroupHosts) {
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

  public HostmapInfrastructureRequest noMetricHosts(Boolean noMetricHosts) {
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

  public HostmapInfrastructureRequest nodeType(HostmapNodeType nodeType) {
    this.nodeType = nodeType;
    this.unparsed |= !nodeType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return nodeType
   */
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostmapNodeType getNodeType() {
    return nodeType;
  }

  public void setNodeType(HostmapNodeType nodeType) {
    if (!nodeType.isValid()) {
      this.unparsed = true;
    }
    this.nodeType = nodeType;
  }

  public HostmapInfrastructureRequest requestType(
      HostmapInfrastructureRequestRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HostmapInfrastructureRequestRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(HostmapInfrastructureRequestRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public HostmapInfrastructureRequest style(HostmapStyle style) {
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
  public HostmapStyle getStyle() {
    return style;
  }

  public void setStyle(HostmapStyle style) {
    this.style = style;
    if (style != null) {
      this.unparsed |= style.unparsed;
    }
  }

  /** Return true if this HostmapInfrastructureRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostmapInfrastructureRequest hostmapInfrastructureRequest = (HostmapInfrastructureRequest) o;
    return Objects.equals(this.child, hostmapInfrastructureRequest.child)
        && Objects.equals(this.conditionalFormats, hostmapInfrastructureRequest.conditionalFormats)
        && Objects.equals(this.enrichments, hostmapInfrastructureRequest.enrichments)
        && Objects.equals(this.filter, hostmapInfrastructureRequest.filter)
        && Objects.equals(this.groupBy, hostmapInfrastructureRequest.groupBy)
        && Objects.equals(this.noGroupHosts, hostmapInfrastructureRequest.noGroupHosts)
        && Objects.equals(this.noMetricHosts, hostmapInfrastructureRequest.noMetricHosts)
        && Objects.equals(this.nodeType, hostmapInfrastructureRequest.nodeType)
        && Objects.equals(this.requestType, hostmapInfrastructureRequest.requestType)
        && Objects.equals(this.style, hostmapInfrastructureRequest.style);
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
        style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostmapInfrastructureRequest {\n");
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
