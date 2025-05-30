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

/**
 * Represents the relationships for an escalation policy, including references to steps and teams.
 */
@JsonPropertyOrder({
  EscalationPolicyDataRelationships.JSON_PROPERTY_STEPS,
  EscalationPolicyDataRelationships.JSON_PROPERTY_TEAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EscalationPolicyDataRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_STEPS = "steps";
  private EscalationPolicyDataRelationshipsSteps steps;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private DataRelationshipsTeams teams;

  public EscalationPolicyDataRelationships() {}

  @JsonCreator
  public EscalationPolicyDataRelationships(
      @JsonProperty(required = true, value = JSON_PROPERTY_STEPS)
          EscalationPolicyDataRelationshipsSteps steps) {
    this.steps = steps;
    this.unparsed |= steps.unparsed;
  }

  public EscalationPolicyDataRelationships steps(EscalationPolicyDataRelationshipsSteps steps) {
    this.steps = steps;
    this.unparsed |= steps.unparsed;
    return this;
  }

  /**
   * Defines the relationship to a collection of steps within an escalation policy. Contains an
   * array of step data references.
   *
   * @return steps
   */
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EscalationPolicyDataRelationshipsSteps getSteps() {
    return steps;
  }

  public void setSteps(EscalationPolicyDataRelationshipsSteps steps) {
    this.steps = steps;
  }

  public EscalationPolicyDataRelationships teams(DataRelationshipsTeams teams) {
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
   * @return EscalationPolicyDataRelationships
   */
  @JsonAnySetter
  public EscalationPolicyDataRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EscalationPolicyDataRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationPolicyDataRelationships escalationPolicyDataRelationships =
        (EscalationPolicyDataRelationships) o;
    return Objects.equals(this.steps, escalationPolicyDataRelationships.steps)
        && Objects.equals(this.teams, escalationPolicyDataRelationships.teams)
        && Objects.equals(
            this.additionalProperties, escalationPolicyDataRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps, teams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationPolicyDataRelationships {\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
