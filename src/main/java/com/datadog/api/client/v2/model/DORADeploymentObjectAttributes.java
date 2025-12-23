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

/** The attributes of the deployment event. */
@JsonPropertyOrder({
  DORADeploymentObjectAttributes.JSON_PROPERTY_CUSTOM_TAGS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_ENV,
  DORADeploymentObjectAttributes.JSON_PROPERTY_FINISHED_AT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_GIT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_SERVICE,
  DORADeploymentObjectAttributes.JSON_PROPERTY_STARTED_AT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_TEAM,
  DORADeploymentObjectAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentObjectAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM_TAGS = "custom_tags";
  private JsonNullable<List<String>> customTags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_GIT = "git";
  private DORAGitInfo git;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DORADeploymentObjectAttributes() {}

  @JsonCreator
  public DORADeploymentObjectAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FINISHED_AT) Long finishedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) Long startedAt) {
    this.finishedAt = finishedAt;
    this.service = service;
    this.startedAt = startedAt;
  }

  public DORADeploymentObjectAttributes customTags(List<String> customTags) {
    this.customTags = JsonNullable.<List<String>>of(customTags);
    return this;
  }

  public DORADeploymentObjectAttributes addCustomTagsItem(String customTagsItem) {
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

  public DORADeploymentObjectAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Environment name to where the service was deployed.
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

  public DORADeploymentObjectAttributes finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Unix timestamp when the deployment finished.
   *
   * @return finishedAt
   */
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
  }

  public DORADeploymentObjectAttributes git(DORAGitInfo git) {
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

  public DORADeploymentObjectAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service name.
   *
   * @return service
   */
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public DORADeploymentObjectAttributes startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Unix timestamp when the deployment started.
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

  public DORADeploymentObjectAttributes team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Name of the team owning the deployed service.
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

  public DORADeploymentObjectAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version to correlate with APM Deployment Tracking.
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
   * @return DORADeploymentObjectAttributes
   */
  @JsonAnySetter
  public DORADeploymentObjectAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORADeploymentObjectAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORADeploymentObjectAttributes doraDeploymentObjectAttributes =
        (DORADeploymentObjectAttributes) o;
    return Objects.equals(this.customTags, doraDeploymentObjectAttributes.customTags)
        && Objects.equals(this.env, doraDeploymentObjectAttributes.env)
        && Objects.equals(this.finishedAt, doraDeploymentObjectAttributes.finishedAt)
        && Objects.equals(this.git, doraDeploymentObjectAttributes.git)
        && Objects.equals(this.service, doraDeploymentObjectAttributes.service)
        && Objects.equals(this.startedAt, doraDeploymentObjectAttributes.startedAt)
        && Objects.equals(this.team, doraDeploymentObjectAttributes.team)
        && Objects.equals(this.version, doraDeploymentObjectAttributes.version)
        && Objects.equals(
            this.additionalProperties, doraDeploymentObjectAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customTags, env, finishedAt, git, service, startedAt, team, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentObjectAttributes {\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
