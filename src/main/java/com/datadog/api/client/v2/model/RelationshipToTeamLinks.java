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
   * <p>Relationship between a team and a team link</p>
 */
@JsonPropertyOrder({
  RelationshipToTeamLinks.JSON_PROPERTY_DATA,
  RelationshipToTeamLinks.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationshipToTeamLinks {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<RelationshipToTeamLinkData> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private TeamRelationshipsLinks links;

  public RelationshipToTeamLinks data(List<RelationshipToTeamLinkData> data) {
    this.data = data;
    for (RelationshipToTeamLinkData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RelationshipToTeamLinks addDataItem(RelationshipToTeamLinkData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>Related team links</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<RelationshipToTeamLinkData> getData() {
        return data;
      }
  public void setData(List<RelationshipToTeamLinkData> data) {
    this.data = data;
  }
  public RelationshipToTeamLinks links(TeamRelationshipsLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * <p>Links attributes.</p>
   * @return links
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public TeamRelationshipsLinks getLinks() {
        return links;
      }
  public void setLinks(TeamRelationshipsLinks links) {
    this.links = links;
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
   * @return RelationshipToTeamLinks
   */
  @JsonAnySetter
  public RelationshipToTeamLinks putAdditionalProperty(String key, Object value) {
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
   * Return true if this RelationshipToTeamLinks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToTeamLinks relationshipToTeamLinks = (RelationshipToTeamLinks) o;
    return Objects.equals(this.data, relationshipToTeamLinks.data) && Objects.equals(this.links, relationshipToTeamLinks.links) && Objects.equals(this.additionalProperties, relationshipToTeamLinks.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToTeamLinks {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
