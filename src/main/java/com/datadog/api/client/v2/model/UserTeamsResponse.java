/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Team memberships response</p>
 */
@JsonPropertyOrder({
  UserTeamsResponse.JSON_PROPERTY_DATA,
  UserTeamsResponse.JSON_PROPERTY_INCLUDED,
  UserTeamsResponse.JSON_PROPERTY_LINKS,
  UserTeamsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserTeamsResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<UserTeam> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<UserTeamIncluded> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private TeamsResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private TeamsResponseMeta meta;

  public UserTeamsResponse data(List<UserTeam> data) {
    this.data = data;
    for (UserTeam item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UserTeamsResponse addDataItem(UserTeam dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>Team memberships response data</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<UserTeam> getData() {
        return data;
      }
  public void setData(List<UserTeam> data) {
    this.data = data;
  }
  public UserTeamsResponse included(List<UserTeamIncluded> included) {
    this.included = included;
    for (UserTeamIncluded item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UserTeamsResponse addIncludedItem(UserTeamIncluded includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * <p>Resources related to the team memberships</p>
   * @return included
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<UserTeamIncluded> getIncluded() {
        return included;
      }
  public void setIncluded(List<UserTeamIncluded> included) {
    this.included = included;
  }
  public UserTeamsResponse links(TeamsResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * <p>Teams response links.</p>
   * @return links
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamsResponseLinks getLinks() {
        return links;
      }
  public void setLinks(TeamsResponseLinks links) {
    this.links = links;
  }
  public UserTeamsResponse meta(TeamsResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Teams response metadata.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamsResponseMeta getMeta() {
        return meta;
      }
  public void setMeta(TeamsResponseMeta meta) {
    this.meta = meta;
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
   * @return UserTeamsResponse
   */
  @JsonAnySetter
  public UserTeamsResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this UserTeamsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTeamsResponse userTeamsResponse = (UserTeamsResponse) o;
    return Objects.equals(this.data, userTeamsResponse.data) && Objects.equals(this.included, userTeamsResponse.included) && Objects.equals(this.links, userTeamsResponse.links) && Objects.equals(this.meta, userTeamsResponse.meta) && Objects.equals(this.additionalProperties, userTeamsResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,included,links,meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTeamsResponse {\n");
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
