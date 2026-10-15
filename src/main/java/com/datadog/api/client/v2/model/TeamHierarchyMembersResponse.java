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

/** Direct and inherited members of the requested team. */
@JsonPropertyOrder({
  TeamHierarchyMembersResponse.JSON_PROPERTY_DATA,
  TeamHierarchyMembersResponse.JSON_PROPERTY_INCLUDED,
  TeamHierarchyMembersResponse.JSON_PROPERTY_LINKS,
  TeamHierarchyMembersResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamHierarchyMembersResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TeamHierarchyMember> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<TeamHierarchyMemberIncluded> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private TeamHierarchyMembersResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private TeamHierarchyMembersResponseMeta meta;

  public TeamHierarchyMembersResponse() {}

  @JsonCreator
  public TeamHierarchyMembersResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<TeamHierarchyMember> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_LINKS)
          TeamHierarchyMembersResponseLinks links,
      @JsonProperty(required = true, value = JSON_PROPERTY_META)
          TeamHierarchyMembersResponseMeta meta) {
    this.data = data;
    for (TeamHierarchyMember item : data) {
      this.unparsed |= item.unparsed;
    }
    this.links = links;
    this.unparsed |= links.unparsed;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public TeamHierarchyMembersResponse data(List<TeamHierarchyMember> data) {
    this.data = data;
    for (TeamHierarchyMember item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public TeamHierarchyMembersResponse addDataItem(TeamHierarchyMember dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * One relationship per user.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TeamHierarchyMember> getData() {
    return data;
  }

  public void setData(List<TeamHierarchyMember> data) {
    this.data = data;
    if (data != null) {
      for (TeamHierarchyMember item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TeamHierarchyMembersResponse included(List<TeamHierarchyMemberIncluded> included) {
    this.included = included;
    if (included != null) {
      for (TeamHierarchyMemberIncluded item : included) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TeamHierarchyMembersResponse addIncludedItem(TeamHierarchyMemberIncluded includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Requested users and the team. May be absent when the result is empty, even if requested.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TeamHierarchyMemberIncluded> getIncluded() {
    return included;
  }

  public void setIncluded(List<TeamHierarchyMemberIncluded> included) {
    this.included = included;
    if (included != null) {
      for (TeamHierarchyMemberIncluded item : included) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TeamHierarchyMembersResponse links(TeamHierarchyMembersResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Page navigation links. Unavailable links are omitted.
   *
   * @return links
   */
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyMembersResponseLinks getLinks() {
    return links;
  }

  public void setLinks(TeamHierarchyMembersResponseLinks links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }

  public TeamHierarchyMembersResponse meta(TeamHierarchyMembersResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Pagination metadata for the filtered members.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamHierarchyMembersResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(TeamHierarchyMembersResponseMeta meta) {
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
   * @return TeamHierarchyMembersResponse
   */
  @JsonAnySetter
  public TeamHierarchyMembersResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamHierarchyMembersResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamHierarchyMembersResponse teamHierarchyMembersResponse = (TeamHierarchyMembersResponse) o;
    return Objects.equals(this.data, teamHierarchyMembersResponse.data)
        && Objects.equals(this.included, teamHierarchyMembersResponse.included)
        && Objects.equals(this.links, teamHierarchyMembersResponse.links)
        && Objects.equals(this.meta, teamHierarchyMembersResponse.meta)
        && Objects.equals(
            this.additionalProperties, teamHierarchyMembersResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamHierarchyMembersResponse {\n");
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
