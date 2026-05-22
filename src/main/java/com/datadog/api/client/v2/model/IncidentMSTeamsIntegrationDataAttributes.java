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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Microsoft Teams integration metadata. */
@JsonPropertyOrder({
  IncidentMSTeamsIntegrationDataAttributes.JSON_PROPERTY_CREATED,
  IncidentMSTeamsIntegrationDataAttributes.JSON_PROPERTY_INTEGRATION_TYPE,
  IncidentMSTeamsIntegrationDataAttributes.JSON_PROPERTY_MODIFIED,
  IncidentMSTeamsIntegrationDataAttributes.JSON_PROPERTY_STATUS,
  IncidentMSTeamsIntegrationDataAttributes.JSON_PROPERTY_TEAMS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentMSTeamsIntegrationDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private String integrationType;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<IncidentMSTeamsChannel> teams = new ArrayList<>();

  public IncidentMSTeamsIntegrationDataAttributes() {}

  @JsonCreator
  public IncidentMSTeamsIntegrationDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTEGRATION_TYPE) String integrationType,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS)
          List<IncidentMSTeamsChannel> teams) {
    this.created = created;
    this.integrationType = integrationType;
    this.modified = modified;
    this.status = status;
    this.teams = teams;
  }

  public IncidentMSTeamsIntegrationDataAttributes created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the integration was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentMSTeamsIntegrationDataAttributes integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * The type of integration.
   *
   * @return integrationType
   */
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }

  public IncidentMSTeamsIntegrationDataAttributes modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the integration was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public IncidentMSTeamsIntegrationDataAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the integration.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IncidentMSTeamsIntegrationDataAttributes teams(List<IncidentMSTeamsChannel> teams) {
    this.teams = teams;
    for (IncidentMSTeamsChannel item : teams) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentMSTeamsIntegrationDataAttributes addTeamsItem(IncidentMSTeamsChannel teamsItem) {
    this.teams.add(teamsItem);
    this.unparsed |= teamsItem.unparsed;
    return this;
  }

  /**
   * List of Microsoft Teams channels.
   *
   * @return teams
   */
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentMSTeamsChannel> getTeams() {
    return teams;
  }

  public void setTeams(List<IncidentMSTeamsChannel> teams) {
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
   * @return IncidentMSTeamsIntegrationDataAttributes
   */
  @JsonAnySetter
  public IncidentMSTeamsIntegrationDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentMSTeamsIntegrationDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentMSTeamsIntegrationDataAttributes incidentMsTeamsIntegrationDataAttributes =
        (IncidentMSTeamsIntegrationDataAttributes) o;
    return Objects.equals(this.created, incidentMsTeamsIntegrationDataAttributes.created)
        && Objects.equals(
            this.integrationType, incidentMsTeamsIntegrationDataAttributes.integrationType)
        && Objects.equals(this.modified, incidentMsTeamsIntegrationDataAttributes.modified)
        && Objects.equals(this.status, incidentMsTeamsIntegrationDataAttributes.status)
        && Objects.equals(this.teams, incidentMsTeamsIntegrationDataAttributes.teams)
        && Objects.equals(
            this.additionalProperties,
            incidentMsTeamsIntegrationDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, integrationType, modified, status, teams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentMSTeamsIntegrationDataAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
