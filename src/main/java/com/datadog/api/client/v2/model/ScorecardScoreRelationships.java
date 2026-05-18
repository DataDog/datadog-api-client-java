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

/** Relationships for a scorecard score, depending on the aggregation type. */
@JsonPropertyOrder({
  ScorecardScoreRelationships.JSON_PROPERTY_ENTITY,
  ScorecardScoreRelationships.JSON_PROPERTY_RULE,
  ScorecardScoreRelationships.JSON_PROPERTY_SCORECARD,
  ScorecardScoreRelationships.JSON_PROPERTY_SERVICE,
  ScorecardScoreRelationships.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScorecardScoreRelationships {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTITY = "entity";
  private ScorecardScoreRelationshipItem entity;

  public static final String JSON_PROPERTY_RULE = "rule";
  private ScorecardScoreRelationshipItem rule;

  public static final String JSON_PROPERTY_SCORECARD = "scorecard";
  private ScorecardScoreRelationshipItem scorecard;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private ScorecardScoreRelationshipItem service;

  public static final String JSON_PROPERTY_TEAM = "team";
  private ScorecardScoreRelationshipItem team;

  public ScorecardScoreRelationships entity(ScorecardScoreRelationshipItem entity) {
    this.entity = entity;
    this.unparsed |= entity.unparsed;
    return this;
  }

  /**
   * A relationship item for a score.
   *
   * @return entity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScorecardScoreRelationshipItem getEntity() {
    return entity;
  }

  public void setEntity(ScorecardScoreRelationshipItem entity) {
    this.entity = entity;
  }

  public ScorecardScoreRelationships rule(ScorecardScoreRelationshipItem rule) {
    this.rule = rule;
    this.unparsed |= rule.unparsed;
    return this;
  }

  /**
   * A relationship item for a score.
   *
   * @return rule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScorecardScoreRelationshipItem getRule() {
    return rule;
  }

  public void setRule(ScorecardScoreRelationshipItem rule) {
    this.rule = rule;
  }

  public ScorecardScoreRelationships scorecard(ScorecardScoreRelationshipItem scorecard) {
    this.scorecard = scorecard;
    this.unparsed |= scorecard.unparsed;
    return this;
  }

  /**
   * A relationship item for a score.
   *
   * @return scorecard
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORECARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScorecardScoreRelationshipItem getScorecard() {
    return scorecard;
  }

  public void setScorecard(ScorecardScoreRelationshipItem scorecard) {
    this.scorecard = scorecard;
  }

  public ScorecardScoreRelationships service(ScorecardScoreRelationshipItem service) {
    this.service = service;
    this.unparsed |= service.unparsed;
    return this;
  }

  /**
   * A relationship item for a score.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScorecardScoreRelationshipItem getService() {
    return service;
  }

  public void setService(ScorecardScoreRelationshipItem service) {
    this.service = service;
  }

  public ScorecardScoreRelationships team(ScorecardScoreRelationshipItem team) {
    this.team = team;
    this.unparsed |= team.unparsed;
    return this;
  }

  /**
   * A relationship item for a score.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScorecardScoreRelationshipItem getTeam() {
    return team;
  }

  public void setTeam(ScorecardScoreRelationshipItem team) {
    this.team = team;
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
   * @return ScorecardScoreRelationships
   */
  @JsonAnySetter
  public ScorecardScoreRelationships putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScorecardScoreRelationships object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScorecardScoreRelationships scorecardScoreRelationships = (ScorecardScoreRelationships) o;
    return Objects.equals(this.entity, scorecardScoreRelationships.entity)
        && Objects.equals(this.rule, scorecardScoreRelationships.rule)
        && Objects.equals(this.scorecard, scorecardScoreRelationships.scorecard)
        && Objects.equals(this.service, scorecardScoreRelationships.service)
        && Objects.equals(this.team, scorecardScoreRelationships.team)
        && Objects.equals(
            this.additionalProperties, scorecardScoreRelationships.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, rule, scorecard, service, team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScorecardScoreRelationships {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    scorecard: ").append(toIndentedString(scorecard)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
