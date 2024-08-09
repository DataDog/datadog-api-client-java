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

/** Attributes to create a DORA deployment event. */
@JsonPropertyOrder({
  DORADeploymentRequestAttributes.JSON_PROPERTY_ENV,
  DORADeploymentRequestAttributes.JSON_PROPERTY_FINISHED_AT,
  DORADeploymentRequestAttributes.JSON_PROPERTY_GIT,
  DORADeploymentRequestAttributes.JSON_PROPERTY_ID,
  DORADeploymentRequestAttributes.JSON_PROPERTY_SERVICE,
  DORADeploymentRequestAttributes.JSON_PROPERTY_STARTED_AT,
  DORADeploymentRequestAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private Long finishedAt;

  public static final String JSON_PROPERTY_GIT = "git";
  private DORAGitInfo git;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private Long startedAt;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DORADeploymentRequestAttributes() {}

  @JsonCreator
  public DORADeploymentRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FINISHED_AT) Long finishedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) Long startedAt) {
    this.finishedAt = finishedAt;
    this.service = service;
    this.startedAt = startedAt;
  }

  public DORADeploymentRequestAttributes env(String env) {
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

  public DORADeploymentRequestAttributes finishedAt(Long finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Unix timestamp when the deployment finished. It must be in nanoseconds, milliseconds, or
   * seconds, and it should not be older than 1 hour.
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

  public DORADeploymentRequestAttributes git(DORAGitInfo git) {
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

  public DORADeploymentRequestAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Deployment ID.
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

  public DORADeploymentRequestAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service name from a service available in the Service Catalog.
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

  public DORADeploymentRequestAttributes startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Unix timestamp when the deployment started. It must be in nanoseconds, milliseconds, or
   * seconds.
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

  public DORADeploymentRequestAttributes version(String version) {
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
   * @return DORADeploymentRequestAttributes
   */
  @JsonAnySetter
  public DORADeploymentRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DORADeploymentRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DORADeploymentRequestAttributes doraDeploymentRequestAttributes =
        (DORADeploymentRequestAttributes) o;
    return Objects.equals(this.env, doraDeploymentRequestAttributes.env)
        && Objects.equals(this.finishedAt, doraDeploymentRequestAttributes.finishedAt)
        && Objects.equals(this.git, doraDeploymentRequestAttributes.git)
        && Objects.equals(this.id, doraDeploymentRequestAttributes.id)
        && Objects.equals(this.service, doraDeploymentRequestAttributes.service)
        && Objects.equals(this.startedAt, doraDeploymentRequestAttributes.startedAt)
        && Objects.equals(this.version, doraDeploymentRequestAttributes.version)
        && Objects.equals(
            this.additionalProperties, doraDeploymentRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        env, finishedAt, git, id, service, startedAt, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentRequestAttributes {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
