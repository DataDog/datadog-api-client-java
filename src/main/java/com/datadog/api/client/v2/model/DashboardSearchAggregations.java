/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Aggregations of dashboard search results. */
@JsonPropertyOrder({
  DashboardSearchAggregations.JSON_PROPERTY_AUTHOR,
  DashboardSearchAggregations.JSON_PROPERTY_IS_SHARED,
  DashboardSearchAggregations.JSON_PROPERTY_SHARE_TYPE,
  DashboardSearchAggregations.JSON_PROPERTY_SHARED_BY_HANDLE,
  DashboardSearchAggregations.JSON_PROPERTY_STATUS,
  DashboardSearchAggregations.JSON_PROPERTY_TAGS,
  DashboardSearchAggregations.JSON_PROPERTY_TEMPLATE_VARIABLES_NAME,
  DashboardSearchAggregations.JSON_PROPERTY_TYPE,
  DashboardSearchAggregations.JSON_PROPERTY_WIDGETS_METRICS,
  DashboardSearchAggregations.JSON_PROPERTY_WIDGETS_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardSearchAggregations {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private List<DashboardSearchAggregationBucketMultiKey> author = null;

  public static final String JSON_PROPERTY_IS_SHARED = "is_shared";
  private List<DashboardSearchAggregationBucketKey> isShared = null;

  public static final String JSON_PROPERTY_SHARE_TYPE = "share_type";
  private List<DashboardSearchAggregationBucketKey> shareType = null;

  public static final String JSON_PROPERTY_SHARED_BY_HANDLE = "shared_by.handle";
  private List<DashboardSearchAggregationBucketKey> sharedByHandle = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private List<DashboardSearchAggregationBucketKey> status = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<DashboardSearchAggregationBucketKey> tags = null;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES_NAME = "template_variables.name";
  private List<DashboardSearchAggregationBucketKey> templateVariablesName = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private List<DashboardSearchAggregationBucketKey> type = null;

  public static final String JSON_PROPERTY_WIDGETS_METRICS = "widgets.metrics";
  private List<DashboardSearchAggregationBucketKey> widgetsMetrics = null;

  public static final String JSON_PROPERTY_WIDGETS_TYPE = "widgets.type";
  private List<DashboardSearchAggregationBucketKey> widgetsType = null;

  public DashboardSearchAggregations author(List<DashboardSearchAggregationBucketMultiKey> author) {
    this.author = author;
    for (DashboardSearchAggregationBucketMultiKey item : author) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addAuthorItem(
      DashboardSearchAggregationBucketMultiKey authorItem) {
    if (this.author == null) {
      this.author = new ArrayList<>();
    }
    this.author.add(authorItem);
    this.unparsed |= authorItem.unparsed;
    return this;
  }

  /**
   * Aggregation by author.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketMultiKey> getAuthor() {
    return author;
  }

  public void setAuthor(List<DashboardSearchAggregationBucketMultiKey> author) {
    this.author = author;
  }

  public DashboardSearchAggregations isShared(List<DashboardSearchAggregationBucketKey> isShared) {
    this.isShared = isShared;
    for (DashboardSearchAggregationBucketKey item : isShared) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addIsSharedItem(
      DashboardSearchAggregationBucketKey isSharedItem) {
    if (this.isShared == null) {
      this.isShared = new ArrayList<>();
    }
    this.isShared.add(isSharedItem);
    this.unparsed |= isSharedItem.unparsed;
    return this;
  }

  /**
   * Aggregation by share status.
   *
   * @return isShared
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getIsShared() {
    return isShared;
  }

  public void setIsShared(List<DashboardSearchAggregationBucketKey> isShared) {
    this.isShared = isShared;
  }

  public DashboardSearchAggregations shareType(
      List<DashboardSearchAggregationBucketKey> shareType) {
    this.shareType = shareType;
    for (DashboardSearchAggregationBucketKey item : shareType) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addShareTypeItem(
      DashboardSearchAggregationBucketKey shareTypeItem) {
    if (this.shareType == null) {
      this.shareType = new ArrayList<>();
    }
    this.shareType.add(shareTypeItem);
    this.unparsed |= shareTypeItem.unparsed;
    return this;
  }

  /**
   * Aggregation by share type.
   *
   * @return shareType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getShareType() {
    return shareType;
  }

  public void setShareType(List<DashboardSearchAggregationBucketKey> shareType) {
    this.shareType = shareType;
  }

  public DashboardSearchAggregations sharedByHandle(
      List<DashboardSearchAggregationBucketKey> sharedByHandle) {
    this.sharedByHandle = sharedByHandle;
    for (DashboardSearchAggregationBucketKey item : sharedByHandle) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addSharedByHandleItem(
      DashboardSearchAggregationBucketKey sharedByHandleItem) {
    if (this.sharedByHandle == null) {
      this.sharedByHandle = new ArrayList<>();
    }
    this.sharedByHandle.add(sharedByHandleItem);
    this.unparsed |= sharedByHandleItem.unparsed;
    return this;
  }

  /**
   * Aggregation by who shared the dashboard.
   *
   * @return sharedByHandle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_BY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getSharedByHandle() {
    return sharedByHandle;
  }

  public void setSharedByHandle(List<DashboardSearchAggregationBucketKey> sharedByHandle) {
    this.sharedByHandle = sharedByHandle;
  }

  public DashboardSearchAggregations status(List<DashboardSearchAggregationBucketKey> status) {
    this.status = status;
    for (DashboardSearchAggregationBucketKey item : status) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addStatusItem(DashboardSearchAggregationBucketKey statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    this.unparsed |= statusItem.unparsed;
    return this;
  }

  /**
   * Aggregation by status.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getStatus() {
    return status;
  }

  public void setStatus(List<DashboardSearchAggregationBucketKey> status) {
    this.status = status;
  }

  public DashboardSearchAggregations tags(List<DashboardSearchAggregationBucketKey> tags) {
    this.tags = tags;
    for (DashboardSearchAggregationBucketKey item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addTagsItem(DashboardSearchAggregationBucketKey tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * Aggregation by tags.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getTags() {
    return tags;
  }

  public void setTags(List<DashboardSearchAggregationBucketKey> tags) {
    this.tags = tags;
  }

  public DashboardSearchAggregations templateVariablesName(
      List<DashboardSearchAggregationBucketKey> templateVariablesName) {
    this.templateVariablesName = templateVariablesName;
    for (DashboardSearchAggregationBucketKey item : templateVariablesName) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addTemplateVariablesNameItem(
      DashboardSearchAggregationBucketKey templateVariablesNameItem) {
    if (this.templateVariablesName == null) {
      this.templateVariablesName = new ArrayList<>();
    }
    this.templateVariablesName.add(templateVariablesNameItem);
    this.unparsed |= templateVariablesNameItem.unparsed;
    return this;
  }

  /**
   * Aggregation by template variable names.
   *
   * @return templateVariablesName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getTemplateVariablesName() {
    return templateVariablesName;
  }

  public void setTemplateVariablesName(
      List<DashboardSearchAggregationBucketKey> templateVariablesName) {
    this.templateVariablesName = templateVariablesName;
  }

  public DashboardSearchAggregations type(List<DashboardSearchAggregationBucketKey> type) {
    this.type = type;
    for (DashboardSearchAggregationBucketKey item : type) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addTypeItem(DashboardSearchAggregationBucketKey typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    this.unparsed |= typeItem.unparsed;
    return this;
  }

  /**
   * Aggregation by dashboard type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getType() {
    return type;
  }

  public void setType(List<DashboardSearchAggregationBucketKey> type) {
    this.type = type;
  }

  public DashboardSearchAggregations widgetsMetrics(
      List<DashboardSearchAggregationBucketKey> widgetsMetrics) {
    this.widgetsMetrics = widgetsMetrics;
    for (DashboardSearchAggregationBucketKey item : widgetsMetrics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addWidgetsMetricsItem(
      DashboardSearchAggregationBucketKey widgetsMetricsItem) {
    if (this.widgetsMetrics == null) {
      this.widgetsMetrics = new ArrayList<>();
    }
    this.widgetsMetrics.add(widgetsMetricsItem);
    this.unparsed |= widgetsMetricsItem.unparsed;
    return this;
  }

  /**
   * Aggregation by widget metrics.
   *
   * @return widgetsMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGETS_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getWidgetsMetrics() {
    return widgetsMetrics;
  }

  public void setWidgetsMetrics(List<DashboardSearchAggregationBucketKey> widgetsMetrics) {
    this.widgetsMetrics = widgetsMetrics;
  }

  public DashboardSearchAggregations widgetsType(
      List<DashboardSearchAggregationBucketKey> widgetsType) {
    this.widgetsType = widgetsType;
    for (DashboardSearchAggregationBucketKey item : widgetsType) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public DashboardSearchAggregations addWidgetsTypeItem(
      DashboardSearchAggregationBucketKey widgetsTypeItem) {
    if (this.widgetsType == null) {
      this.widgetsType = new ArrayList<>();
    }
    this.widgetsType.add(widgetsTypeItem);
    this.unparsed |= widgetsTypeItem.unparsed;
    return this;
  }

  /**
   * Aggregation by widget type.
   *
   * @return widgetsType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGETS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<DashboardSearchAggregationBucketKey> getWidgetsType() {
    return widgetsType;
  }

  public void setWidgetsType(List<DashboardSearchAggregationBucketKey> widgetsType) {
    this.widgetsType = widgetsType;
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
   * @return DashboardSearchAggregations
   */
  @JsonAnySetter
  public DashboardSearchAggregations putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DashboardSearchAggregations object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSearchAggregations dashboardSearchAggregations = (DashboardSearchAggregations) o;
    return Objects.equals(this.author, dashboardSearchAggregations.author)
        && Objects.equals(this.isShared, dashboardSearchAggregations.isShared)
        && Objects.equals(this.shareType, dashboardSearchAggregations.shareType)
        && Objects.equals(this.sharedByHandle, dashboardSearchAggregations.sharedByHandle)
        && Objects.equals(this.status, dashboardSearchAggregations.status)
        && Objects.equals(this.tags, dashboardSearchAggregations.tags)
        && Objects.equals(
            this.templateVariablesName, dashboardSearchAggregations.templateVariablesName)
        && Objects.equals(this.type, dashboardSearchAggregations.type)
        && Objects.equals(this.widgetsMetrics, dashboardSearchAggregations.widgetsMetrics)
        && Objects.equals(this.widgetsType, dashboardSearchAggregations.widgetsType)
        && Objects.equals(
            this.additionalProperties, dashboardSearchAggregations.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        isShared,
        shareType,
        sharedByHandle,
        status,
        tags,
        templateVariablesName,
        type,
        widgetsMetrics,
        widgetsType,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSearchAggregations {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
    sb.append("    sharedByHandle: ").append(toIndentedString(sharedByHandle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    templateVariablesName: ")
        .append(toIndentedString(templateVariablesName))
        .append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    widgetsMetrics: ").append(toIndentedString(widgetsMetrics)).append("\n");
    sb.append("    widgetsType: ").append(toIndentedString(widgetsType)).append("\n");
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
