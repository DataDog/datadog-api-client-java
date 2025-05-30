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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes to create a DORA incident event. */
@JsonPropertyOrder({
  DORAIncidentRequestAttributes.JSON_PROPERTY_ENV,
  DORAIncidentRequestAttributes.JSON_PROPERTY_FINISHED_AT,
  DORAIncidentRequestAttributes.JSON_PROPERTY_GIT,
  DORAIncidentRequestAttributes.JSON_PROPERTY_ID,
  DORAIncidentRequestAttributes.JSON_PROPERTY_NAME,
  DORAIncidentRequestAttributes.JSON_PROPERTY_SERVICES,
  DORAIncidentRequestAttributes.JSON_PROPERTY_SEVERITY,
  DORAIncidentRequestAttributes.JSON_PROPERTY_STARTED_AT,
  DORAIncidentRequestAttributes.JSON_PROPERTY_TEAM,
  DORAIncidentRequestAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORAIncidentRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_GIT = "git";
  private DORAGitInfo git;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private List<String> services = null;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DORAIncidentRequestAttributes() {}

  @JsonCreator
  public DORAIncidentRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) Long startedAt) {
    this.startedAt = startedAt;
  }

  public DORAIncidentRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Environment name that was impacted by the incident.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public DORAIncidentRequestAttributes finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Unix timestamp when the incident finished. It must be in nanoseconds, milliseconds, or seconds,
   * and it should not be older than 1 hour.
   *
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
  }

  public DORAIncidentRequestAttributes git(DORAGitInfo git) {
    this.git = git;
    this.unparsed |= git.unparsed;
    return this;
  }

  /**
   * Git info for DORA Metrics events.
   *
   * @return git
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DORAGitInfo getGit() {
    return git;
  }

  public void setGit(DORAGitInfo git) {
    this.git = git;
  }

  public DORAIncidentRequestAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Incident ID. Must have at least 16 characters. Required to update a previously sent incident.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DORAIncidentRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Incident name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DORAIncidentRequestAttributes services(List<String> services) {
    this.services = services;
    return this;
  }

  public DORAIncidentRequestAttributes addServicesItem(String servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Service names impacted by the incident. If possible, use names registered in the Service
   * Catalog. Required when the team field is not provided.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getServices() {
    return services;
  }

  public void setServices(List<String> services) {
    this.services = services;
  }

  public DORAIncidentRequestAttributes severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Incident severity.
   *
   * @return severity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public DORAIncidentRequestAttributes startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Unix timestamp when the incident started. It must be in nanoseconds, milliseconds, or seconds.
   *
   * @return startedAt
   */
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }

  public DORAIncidentRequestAttributes team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Name of the team owning the services impacted. If possible, use team handles registered in
   * Datadog. Required when the services field is not provided.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public DORAIncidentRequestAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version to correlate with <a
   * href="https://docs.datadoghq.com/tracing/services/deployment_tracking/">APM Deployment
   * Tracking</a>.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return DORAIncidentRequestAttributes
   */
  @JsonAnySetter
  public DORAIncidentRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORAIncidentRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORAIncidentRequestAttributes doraIncidentRequestAttributes = (DORAIncidentRequestAttributes) o;
    return Objects.equals(this.env, doraIncidentRequestAttributes.env)
        && Objects.equals(this.finishedAt, doraIncidentRequestAttributes.finishedAt)
        && Objects.equals(this.git, doraIncidentRequestAttributes.git)
        && Objects.equals(this.id, doraIncidentRequestAttributes.id)
        && Objects.equals(this.name, doraIncidentRequestAttributes.name)
        && Objects.equals(this.services, doraIncidentRequestAttributes.services)
        && Objects.equals(this.severity, doraIncidentRequestAttributes.severity)
        && Objects.equals(this.startedAt, doraIncidentRequestAttributes.startedAt)
        && Objects.equals(this.team, doraIncidentRequestAttributes.team)
        && Objects.equals(this.version, doraIncidentRequestAttributes.version)
        && Objects.equals(
            this.additionalProperties, doraIncidentRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        env,
        finishedAt,
        git,
        id,
        name,
        services,
        severity,
        startedAt,
        team,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORAIncidentRequestAttributes {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
