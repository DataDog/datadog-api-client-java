/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Response containing a list of report schedules. */
@JsonPropertyOrder({
  ReportScheduleListResponse.JSON_PROPERTY_DATA,
  ReportScheduleListResponse.JSON_PROPERTY_INCLUDED,
  ReportScheduleListResponse.JSON_PROPERTY_LINKS,
  ReportScheduleListResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportScheduleListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ReportScheduleListResponseData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<ReportScheduleIncludedResource> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private ReportScheduleListResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private ReportScheduleListResponseMeta meta;

  public ReportScheduleListResponse() {}

  @JsonCreator
  public ReportScheduleListResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<ReportScheduleListResponseData> data) {
    this.data = data;
    for (ReportScheduleListResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
  }

  public ReportScheduleListResponse data(List<ReportScheduleListResponseData> data) {
    this.data = data;
    for (ReportScheduleListResponseData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ReportScheduleListResponse addDataItem(ReportScheduleListResponseData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * The list of report schedules.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ReportScheduleListResponseData> getData() {
    return data;
  }

  public void setData(List<ReportScheduleListResponseData> data) {
    this.data = data;
    if (data != null) {
      for (ReportScheduleListResponseData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ReportScheduleListResponse included(List<ReportScheduleIncludedResource> included) {
    this.included = included;
    if (included != null) {
      for (ReportScheduleIncludedResource item : included) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ReportScheduleListResponse addIncludedItem(ReportScheduleIncludedResource includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Related resources included with the report schedules, such as authors and rendered resources.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ReportScheduleIncludedResource> getIncluded() {
    return included;
  }

  public void setIncluded(List<ReportScheduleIncludedResource> included) {
    this.included = included;
    if (included != null) {
      for (ReportScheduleIncludedResource item : included) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ReportScheduleListResponse links(ReportScheduleListResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Pagination links for navigating a report schedule list response.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReportScheduleListResponseLinks getLinks() {
    return links;
  }

  public void setLinks(ReportScheduleListResponseLinks links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }

  public ReportScheduleListResponse meta(ReportScheduleListResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata for a paginated report schedule list response.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReportScheduleListResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(ReportScheduleListResponseMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
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
   * @return ReportScheduleListResponse
   */
  @JsonAnySetter
  public ReportScheduleListResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReportScheduleListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleListResponse reportScheduleListResponse = (ReportScheduleListResponse) o;
    return Objects.equals(this.data, reportScheduleListResponse.data)
        && Objects.equals(this.included, reportScheduleListResponse.included)
        && Objects.equals(this.links, reportScheduleListResponse.links)
        && Objects.equals(this.meta, reportScheduleListResponse.meta)
        && Objects.equals(
            this.additionalProperties, reportScheduleListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
