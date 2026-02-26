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

/** Groups the relationships for a schedule object, referencing layers and teams. */
@JsonPropertyOrder({
  ScheduleDataRelationships.JSON_PROPERTY_LAYERS,
  ScheduleDataRelationships.JSON_PROPERTY_TEAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAYERS = "layers";
  private ScheduleDataRelationshipsLayers layers;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private DataRelationshipsTeams teams;

  public ScheduleDataRelationships layers(ScheduleDataRelationshipsLayers layers) {
    this.layers = layers;
    this.unparsed |= layers.unparsed;
    return this;
  }

  /**
   * Associates layers with this schedule in a data structure.
   *
   * @return layers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScheduleDataRelationshipsLayers getLayers() {
    return layers;
  }

  public void setLayers(ScheduleDataRelationshipsLayers layers) {
    this.layers = layers;
  }

  public ScheduleDataRelationships teams(DataRelationshipsTeams teams) {
    this.teams = teams;
    this.unparsed |= teams.unparsed;
    return this;
  }

  /**
   * Associates teams with this schedule in a data structure.
   *
   * @return teams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DataRelationshipsTeams getTeams() {
    return teams;
  }

  public void setTeams(DataRelationshipsTeams teams) {
    this.teams = teams;
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
   * @return ScheduleDataRelationships
   */
  @JsonAnySetter
  public ScheduleDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScheduleDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDataRelationships scheduleDataRelationships = (ScheduleDataRelationships) o;
    return Objects.equals(this.layers, scheduleDataRelationships.layers)
        && Objects.equals(this.teams, scheduleDataRelationships.teams)
        && Objects.equals(
            this.additionalProperties, scheduleDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layers, teams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDataRelationships {\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
