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
 * Who should fix the group: the code owners of the group's findings, from their <code>
 * @git.codeowners</code> attribute, and their Datadog teams, from their <code>team</code> tag. A
 * group with no owners has empty <code>items</code> and a <code>total</code> of 0.
 */
@JsonPropertyOrder({
  RemediationGroupOwners.JSON_PROPERTY_CODEOWNERS,
  RemediationGroupOwners.JSON_PROPERTY_TEAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationGroupOwners {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODEOWNERS = "codeowners";
  private RemediationGroupOwnerList codeowners;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private RemediationGroupOwnerList teams;

  public RemediationGroupOwners() {}

  @JsonCreator
  public RemediationGroupOwners(
      @JsonProperty(required = true, value = JSON_PROPERTY_CODEOWNERS)
          RemediationGroupOwnerList codeowners,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS) RemediationGroupOwnerList teams) {
    this.codeowners = codeowners;
    this.unparsed |= codeowners.unparsed;
    this.teams = teams;
    this.unparsed |= teams.unparsed;
  }

  public RemediationGroupOwners codeowners(RemediationGroupOwnerList codeowners) {
    this.codeowners = codeowners;
    this.unparsed |= codeowners.unparsed;
    return this;
  }

  /**
   * Owners of the group's open findings. <code>items</code> lists at most 5 owners, the owners of
   * the most findings first, then by name. <code>total</code> counts every distinct owner, so the
   * list is cut when <code>total</code> is larger than the number of items.
   *
   * @return codeowners
   */
  @JsonProperty(JSON_PROPERTY_CODEOWNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RemediationGroupOwnerList getCodeowners() {
    return codeowners;
  }

  public void setCodeowners(RemediationGroupOwnerList codeowners) {
    this.codeowners = codeowners;
    if (codeowners != null) {
      this.unparsed |= codeowners.unparsed;
    }
  }

  public RemediationGroupOwners teams(RemediationGroupOwnerList teams) {
    this.teams = teams;
    this.unparsed |= teams.unparsed;
    return this;
  }

  /**
   * Owners of the group's open findings. <code>items</code> lists at most 5 owners, the owners of
   * the most findings first, then by name. <code>total</code> counts every distinct owner, so the
   * list is cut when <code>total</code> is larger than the number of items.
   *
   * @return teams
   */
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RemediationGroupOwnerList getTeams() {
    return teams;
  }

  public void setTeams(RemediationGroupOwnerList teams) {
    this.teams = teams;
    if (teams != null) {
      this.unparsed |= teams.unparsed;
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
   * @return RemediationGroupOwners
   */
  @JsonAnySetter
  public RemediationGroupOwners putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationGroupOwners object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationGroupOwners remediationGroupOwners = (RemediationGroupOwners) o;
    return Objects.equals(this.codeowners, remediationGroupOwners.codeowners)
        && Objects.equals(this.teams, remediationGroupOwners.teams)
        && Objects.equals(this.additionalProperties, remediationGroupOwners.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeowners, teams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationGroupOwners {\n");
    sb.append("    codeowners: ").append(toIndentedString(codeowners)).append("\n");
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
