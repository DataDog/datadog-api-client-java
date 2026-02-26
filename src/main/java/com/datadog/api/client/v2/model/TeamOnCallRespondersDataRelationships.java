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

/**
 * Relationship objects linked to a team's on-call responder configuration, including escalations
 * and responders.
 */
@JsonPropertyOrder({
  TeamOnCallRespondersDataRelationships.JSON_PROPERTY_ESCALATIONS,
  TeamOnCallRespondersDataRelationships.JSON_PROPERTY_RESPONDERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamOnCallRespondersDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ESCALATIONS = "escalations";
  private TeamOnCallRespondersDataRelationshipsEscalations escalations;

  public static final String JSON_PROPERTY_RESPONDERS = "responders";
  private TeamOnCallRespondersDataRelationshipsResponders responders;

  public TeamOnCallRespondersDataRelationships escalations(
      TeamOnCallRespondersDataRelationshipsEscalations escalations) {
    this.escalations = escalations;
    this.unparsed |= escalations.unparsed;
    return this;
  }

  /**
   * Defines the escalation policy steps linked to the team's on-call configuration.
   *
   * @return escalations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamOnCallRespondersDataRelationshipsEscalations getEscalations() {
    return escalations;
  }

  public void setEscalations(TeamOnCallRespondersDataRelationshipsEscalations escalations) {
    this.escalations = escalations;
  }

  public TeamOnCallRespondersDataRelationships responders(
      TeamOnCallRespondersDataRelationshipsResponders responders) {
    this.responders = responders;
    this.unparsed |= responders.unparsed;
    return this;
  }

  /**
   * Defines the list of users assigned as on-call responders for the team.
   *
   * @return responders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TeamOnCallRespondersDataRelationshipsResponders getResponders() {
    return responders;
  }

  public void setResponders(TeamOnCallRespondersDataRelationshipsResponders responders) {
    this.responders = responders;
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
   * @return TeamOnCallRespondersDataRelationships
   */
  @JsonAnySetter
  public TeamOnCallRespondersDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamOnCallRespondersDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamOnCallRespondersDataRelationships teamOnCallRespondersDataRelationships =
        (TeamOnCallRespondersDataRelationships) o;
    return Objects.equals(this.escalations, teamOnCallRespondersDataRelationships.escalations)
        && Objects.equals(this.responders, teamOnCallRespondersDataRelationships.responders)
        && Objects.equals(
            this.additionalProperties, teamOnCallRespondersDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escalations, responders, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamOnCallRespondersDataRelationships {\n");
    sb.append("    escalations: ").append(toIndentedString(escalations)).append("\n");
    sb.append("    responders: ").append(toIndentedString(responders)).append("\n");
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
