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
   * <p>Relationship between the issue and an assignee, case and/or teams.</p>
 */
@JsonPropertyOrder({
  IssueRelationships.JSON_PROPERTY_ASSIGNEE,
  IssueRelationships.JSON_PROPERTY_CASE,
  IssueRelationships.JSON_PROPERTY_TEAM_OWNERS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueRelationships {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNEE = "assignee";
  private IssueAssigneeRelationship assignee;

  public static final String JSON_PROPERTY_CASE = "case";
  private IssueCaseRelationship _case;

  public static final String JSON_PROPERTY_TEAM_OWNERS = "team_owners";
  private IssueTeamOwnersRelationship teamOwners;

  public IssueRelationships assignee(IssueAssigneeRelationship assignee) {
    this.assignee = assignee;
    this.unparsed |= assignee.unparsed;
    return this;
  }

  /**
   * <p>Relationship between the issue and assignee.</p>
   * @return assignee
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ASSIGNEE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IssueAssigneeRelationship getAssignee() {
        return assignee;
      }
  public void setAssignee(IssueAssigneeRelationship assignee) {
    this.assignee = assignee;
  }
  public IssueRelationships _case(IssueCaseRelationship _case) {
    this._case = _case;
    this.unparsed |= _case.unparsed;
    return this;
  }

  /**
   * <p>Relationship between the issue and case.</p>
   * @return _case
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CASE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IssueCaseRelationship getCase() {
        return _case;
      }
  public void setCase(IssueCaseRelationship _case) {
    this._case = _case;
  }
  public IssueRelationships teamOwners(IssueTeamOwnersRelationship teamOwners) {
    this.teamOwners = teamOwners;
    this.unparsed |= teamOwners.unparsed;
    return this;
  }

  /**
   * <p>Relationship between the issue and teams.</p>
   * @return teamOwners
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TEAM_OWNERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public IssueTeamOwnersRelationship getTeamOwners() {
        return teamOwners;
      }
  public void setTeamOwners(IssueTeamOwnersRelationship teamOwners) {
    this.teamOwners = teamOwners;
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
   * @return IssueRelationships
   */
  @JsonAnySetter
  public IssueRelationships putAdditionalProperty(String key, Object value) {
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
   * Return true if this IssueRelationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueRelationships issueRelationships = (IssueRelationships) o;
    return Objects.equals(this.assignee, issueRelationships.assignee) && Objects.equals(this._case, issueRelationships._case) && Objects.equals(this.teamOwners, issueRelationships.teamOwners) && Objects.equals(this.additionalProperties, issueRelationships.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assignee,_case,teamOwners, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRelationships {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
    sb.append("    teamOwners: ").append(toIndentedString(teamOwners)).append("\n");
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
