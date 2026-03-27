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

/** Attributes for a deployment gate evaluation request. */
@JsonPropertyOrder({
  DeploymentGatesEvaluationRequestAttributes.JSON_PROPERTY_ENV,
  DeploymentGatesEvaluationRequestAttributes.JSON_PROPERTY_IDENTIFIER,
  DeploymentGatesEvaluationRequestAttributes.JSON_PROPERTY_PRIMARY_TAG,
  DeploymentGatesEvaluationRequestAttributes.JSON_PROPERTY_SERVICE,
  DeploymentGatesEvaluationRequestAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesEvaluationRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier = "default";

  public static final String JSON_PROPERTY_PRIMARY_TAG = "primary_tag";
  private String primaryTag;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DeploymentGatesEvaluationRequestAttributes() {}

  @JsonCreator
  public DeploymentGatesEvaluationRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service) {
    this.env = env;
    this.service = service;
  }

  public DeploymentGatesEvaluationRequestAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment of the deployment.
   *
   * @return env
   */
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public DeploymentGatesEvaluationRequestAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The identifier of the deployment gate. Defaults to "default".
   *
   * @return identifier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DeploymentGatesEvaluationRequestAttributes primaryTag(String primaryTag) {
    this.primaryTag = primaryTag;
    return this;
  }

  /**
   * A primary tag to scope APM Faulty Deployment Detection rules.
   *
   * @return primaryTag
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryTag() {
    return primaryTag;
  }

  public void setPrimaryTag(String primaryTag) {
    this.primaryTag = primaryTag;
  }

  public DeploymentGatesEvaluationRequestAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The service being deployed.
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

  public DeploymentGatesEvaluationRequestAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the deployment. Required for APM Faulty Deployment Detection rules.
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
   * @return DeploymentGatesEvaluationRequestAttributes
   */
  @JsonAnySetter
  public DeploymentGatesEvaluationRequestAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this DeploymentGatesEvaluationRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGatesEvaluationRequestAttributes deploymentGatesEvaluationRequestAttributes =
        (DeploymentGatesEvaluationRequestAttributes) o;
    return Objects.equals(this.env, deploymentGatesEvaluationRequestAttributes.env)
        && Objects.equals(this.identifier, deploymentGatesEvaluationRequestAttributes.identifier)
        && Objects.equals(this.primaryTag, deploymentGatesEvaluationRequestAttributes.primaryTag)
        && Objects.equals(this.service, deploymentGatesEvaluationRequestAttributes.service)
        && Objects.equals(this.version, deploymentGatesEvaluationRequestAttributes.version)
        && Objects.equals(
            this.additionalProperties,
            deploymentGatesEvaluationRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, identifier, primaryTag, service, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGatesEvaluationRequestAttributes {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    primaryTag: ").append(toIndentedString(primaryTag)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
