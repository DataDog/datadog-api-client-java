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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes to create a DORA incident event. */
@JsonPropertyOrder({
  DORAFailureRequestAttributes.JSON_PROPERTY_CUSTOM_TAGS,
  DORAFailureRequestAttributes.JSON_PROPERTY_ENV,
  DORAFailureRequestAttributes.JSON_PROPERTY_FINISHED_AT,
  DORAFailureRequestAttributes.JSON_PROPERTY_GIT,
  DORAFailureRequestAttributes.JSON_PROPERTY_ID,
  DORAFailureRequestAttributes.JSON_PROPERTY_NAME,
  DORAFailureRequestAttributes.JSON_PROPERTY_SERVICES,
  DORAFailureRequestAttributes.JSON_PROPERTY_SEVERITY,
  DORAFailureRequestAttributes.JSON_PROPERTY_STARTED_AT,
  DORAFailureRequestAttributes.JSON_PROPERTY_TEAM,
  DORAFailureRequestAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORAFailureRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TAGS = "custom_tags";
  private JsonNullable<List<String>> customTags = JsonNullable.<List<String>>undefined();

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

  public DORAFailureRequestAttributes() {}

  @JsonCreator
  public DORAFailureRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) Long startedAt) {
    this.startedAt = startedAt;
  }

  public DORAFailureRequestAttributes customTags(List<String> customTags) {
    this.customTags = JsonNullable.<List<String>>of(customTags);
    return this;
  }

  public DORAFailureRequestAttributes addCustomTagsItem(String customTagsItem) {
    if (this.customTags == null || !this.customTags.isPresent()) {
      this.customTags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.customTags.get().add(customTagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of user-defined tags. The tags must follow the <code>key:value</code> pattern. Up to 100
   * may be added per event.
   *
   * @return customTags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getCustomTags() {
    return customTags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getCustomTags_JsonNullable() {
    return customTags;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_TAGS)
  public void setCustomTags_JsonNullable(JsonNullable<List<String>> customTags) {
    this.customTags = customTags;
  }

  public void setCustomTags(List<String> customTags) {
    this.customTags = JsonNullable.<List<String>>of(customTags);
  }

  public DORAFailureRequestAttributes env(String env) {
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

  public DORAFailureRequestAttributes finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Unix timestamp when the incident finished. It must be in nanoseconds, milliseconds, or seconds.
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

  public DORAFailureRequestAttributes git(DORAGitInfo git) {
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

  public DORAFailureRequestAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Incident ID. Must be 16-128 characters and contain only alphanumeric characters, hyphens,
   * underscores, periods, and colons (a-z, A-Z, 0-9, -, _, ., :).
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

  public DORAFailureRequestAttributes name(String name) {
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

  public DORAFailureRequestAttributes services(List<String> services) {
    this.services = services;
    return this;
  }

  public DORAFailureRequestAttributes addServicesItem(String servicesItem) {
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

  public DORAFailureRequestAttributes severity(String severity) {
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

  public DORAFailureRequestAttributes startedAt(Long startedAt) {
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

  public DORAFailureRequestAttributes team(String team) {
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

  public DORAFailureRequestAttributes version(String version) {
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
   * @return DORAFailureRequestAttributes
   */
  @JsonAnySetter
  public DORAFailureRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORAFailureRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORAFailureRequestAttributes doraFailureRequestAttributes = (DORAFailureRequestAttributes) o;
    return Objects.equals(this.customTags, doraFailureRequestAttributes.customTags)
        && Objects.equals(this.env, doraFailureRequestAttributes.env)
        && Objects.equals(this.finishedAt, doraFailureRequestAttributes.finishedAt)
        && Objects.equals(this.git, doraFailureRequestAttributes.git)
        && Objects.equals(this.id, doraFailureRequestAttributes.id)
        && Objects.equals(this.name, doraFailureRequestAttributes.name)
        && Objects.equals(this.services, doraFailureRequestAttributes.services)
        && Objects.equals(this.severity, doraFailureRequestAttributes.severity)
        && Objects.equals(this.startedAt, doraFailureRequestAttributes.startedAt)
        && Objects.equals(this.team, doraFailureRequestAttributes.team)
        && Objects.equals(this.version, doraFailureRequestAttributes.version)
        && Objects.equals(
            this.additionalProperties, doraFailureRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customTags,
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
    sb.append("class DORAFailureRequestAttributes {\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
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
