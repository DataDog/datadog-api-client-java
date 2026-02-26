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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Relationship between a user team permission and a team */
@JsonPropertyOrder({
  RelationshipToUserTeamPermission.JSON_PROPERTY_DATA,
  RelationshipToUserTeamPermission.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RelationshipToUserTeamPermission {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<RelationshipToUserTeamPermissionData> data =
      JsonNullable.<RelationshipToUserTeamPermissionData>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private TeamRelationshipsLinks links;

  public RelationshipToUserTeamPermission data(RelationshipToUserTeamPermissionData data) {
    this.data = JsonNullable.<RelationshipToUserTeamPermissionData>of(data);
    return this;
  }

  /**
   * Related user team permission data
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public RelationshipToUserTeamPermissionData getData() {
    return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<RelationshipToUserTeamPermissionData> getData_JsonNullable() {
    return data;
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<RelationshipToUserTeamPermissionData> data) {
    this.data = data;
  }

  public void setData(RelationshipToUserTeamPermissionData data) {
    this.data = JsonNullable.<RelationshipToUserTeamPermissionData>of(data);
  }

  public RelationshipToUserTeamPermission links(TeamRelationshipsLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links attributes.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamRelationshipsLinks getLinks() {
    return links;
  }

  public void setLinks(TeamRelationshipsLinks links) {
    this.links = links;
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
   * @return RelationshipToUserTeamPermission
   */
  @JsonAnySetter
  public RelationshipToUserTeamPermission putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RelationshipToUserTeamPermission object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipToUserTeamPermission relationshipToUserTeamPermission =
        (RelationshipToUserTeamPermission) o;
    return Objects.equals(this.data, relationshipToUserTeamPermission.data)
        && Objects.equals(this.links, relationshipToUserTeamPermission.links)
        && Objects.equals(
            this.additionalProperties, relationshipToUserTeamPermission.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipToUserTeamPermission {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
