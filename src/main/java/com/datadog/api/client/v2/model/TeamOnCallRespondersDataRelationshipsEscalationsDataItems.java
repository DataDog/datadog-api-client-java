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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Represents a link to a specific escalation policy step associated with the on-call team. */
@JsonPropertyOrder({
  TeamOnCallRespondersDataRelationshipsEscalationsDataItems.JSON_PROPERTY_ID,
  TeamOnCallRespondersDataRelationshipsEscalationsDataItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamOnCallRespondersDataRelationshipsEscalationsDataItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType type =
      TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType.ESCALATION_POLICY_STEPS;

  public TeamOnCallRespondersDataRelationshipsEscalationsDataItems() {}

  @JsonCreator
  public TeamOnCallRespondersDataRelationshipsEscalationsDataItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public TeamOnCallRespondersDataRelationshipsEscalationsDataItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the escalation step.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TeamOnCallRespondersDataRelationshipsEscalationsDataItems type(
      TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Identifies the resource type for escalation policy steps linked to a team's on-call
   * configuration.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType getType() {
    return type;
  }

  public void setType(TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return TeamOnCallRespondersDataRelationshipsEscalationsDataItems
   */
  @JsonAnySetter
  public TeamOnCallRespondersDataRelationshipsEscalationsDataItems putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this TeamOnCallRespondersDataRelationshipsEscalationsDataItems object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamOnCallRespondersDataRelationshipsEscalationsDataItems
        teamOnCallRespondersDataRelationshipsEscalationsDataItems =
            (TeamOnCallRespondersDataRelationshipsEscalationsDataItems) o;
    return Objects.equals(this.id, teamOnCallRespondersDataRelationshipsEscalationsDataItems.id)
        && Objects.equals(this.type, teamOnCallRespondersDataRelationshipsEscalationsDataItems.type)
        && Objects.equals(
            this.additionalProperties,
            teamOnCallRespondersDataRelationshipsEscalationsDataItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamOnCallRespondersDataRelationshipsEscalationsDataItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
