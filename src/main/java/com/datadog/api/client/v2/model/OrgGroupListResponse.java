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

/** Response containing a list of org groups. */
@JsonPropertyOrder({
  OrgGroupListResponse.JSON_PROPERTY_DATA,
  OrgGroupListResponse.JSON_PROPERTY_INCLUDED,
  OrgGroupListResponse.JSON_PROPERTY_LINKS,
  OrgGroupListResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgGroupListResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<OrgGroupData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<OrgGroupMembershipData> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private OrgGroupPaginationLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private OrgGroupPaginationMeta meta;

  public OrgGroupListResponse() {}

  @JsonCreator
  public OrgGroupListResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<OrgGroupData> data) {
    this.data = data;
  }

  public OrgGroupListResponse data(List<OrgGroupData> data) {
    this.data = data;
    for (OrgGroupData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public OrgGroupListResponse addDataItem(OrgGroupData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of org groups.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<OrgGroupData> getData() {
    return data;
  }

  public void setData(List<OrgGroupData> data) {
    this.data = data;
  }

  public OrgGroupListResponse included(List<OrgGroupMembershipData> included) {
    this.included = included;
    for (OrgGroupMembershipData item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public OrgGroupListResponse addIncludedItem(OrgGroupMembershipData includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Related resources included in the response when requested with the <code>include</code>
   * parameter.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OrgGroupMembershipData> getIncluded() {
    return included;
  }

  public void setIncluded(List<OrgGroupMembershipData> included) {
    this.included = included;
  }

  public OrgGroupListResponse links(OrgGroupPaginationLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Pagination links for navigating between pages of an org group list response.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrgGroupPaginationLinks getLinks() {
    return links;
  }

  public void setLinks(OrgGroupPaginationLinks links) {
    this.links = links;
  }

  public OrgGroupListResponse meta(OrgGroupPaginationMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Pagination metadata for org group list responses.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrgGroupPaginationMeta getMeta() {
    return meta;
  }

  public void setMeta(OrgGroupPaginationMeta meta) {
    this.meta = meta;
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
   * @return OrgGroupListResponse
   */
  @JsonAnySetter
  public OrgGroupListResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgGroupListResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgGroupListResponse orgGroupListResponse = (OrgGroupListResponse) o;
    return Objects.equals(this.data, orgGroupListResponse.data)
        && Objects.equals(this.included, orgGroupListResponse.included)
        && Objects.equals(this.links, orgGroupListResponse.links)
        && Objects.equals(this.meta, orgGroupListResponse.meta)
        && Objects.equals(this.additionalProperties, orgGroupListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgGroupListResponse {\n");
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
