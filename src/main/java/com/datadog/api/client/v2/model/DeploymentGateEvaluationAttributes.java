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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/** Attributes of a deployment gate evaluation. */
@JsonPropertyOrder({
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_DRY_RUN,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_DURATION_SECONDS,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_ENV,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_EVALUATION_ID,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_FINISHED_AT,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_GATE_ID,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_IDENTIFIER,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_SERVICE,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_STARTED_AT,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_STATUS,
  DeploymentGateEvaluationAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateEvaluationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_DURATION_SECONDS = "duration_seconds";
  private Long durationSeconds;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluation_id";
  private UUID evaluationId;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private OffsetDateTime finishedAt;

  public static final String JSON_PROPERTY_GATE_ID = "gate_id";
  private UUID gateId;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DeploymentGatesEvaluationResultResponseAttributesGateStatus status;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DeploymentGateEvaluationAttributes() {}

  @JsonCreator
  public DeploymentGateEvaluationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DRY_RUN) Boolean dryRun,
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION_SECONDS) Long durationSeconds,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVALUATION_ID) UUID evaluationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINISHED_AT) OffsetDateTime finishedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_GATE_ID) UUID gateId,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDENTIFIER) String identifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          DeploymentGatesEvaluationResultResponseAttributesGateStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.dryRun = dryRun;
    this.durationSeconds = durationSeconds;
    if (durationSeconds != null) {}
    this.env = env;
    this.evaluationId = evaluationId;
    this.finishedAt = finishedAt;
    if (finishedAt != null) {}
    this.gateId = gateId;
    if (gateId != null) {}
    this.identifier = identifier;
    this.service = service;
    this.startedAt = startedAt;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.version = version;
  }

  public DeploymentGateEvaluationAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Whether this evaluation used gate-level dry run.
   *
   * @return dryRun
   */
  @JsonProperty(JSON_PROPERTY_DRY_RUN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public DeploymentGateEvaluationAttributes durationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
    if (durationSeconds != null) {}
    return this;
  }

  /**
   * Evaluation duration in seconds. Null while it is in progress.
   *
   * @return durationSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  public DeploymentGateEvaluationAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Deployment environment evaluated by the gate.
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

  public DeploymentGateEvaluationAttributes evaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * Gate evaluation UUID. Matches the resource <code>id</code>.
   *
   * @return evaluationId
   */
  @JsonProperty(JSON_PROPERTY_EVALUATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
  }

  public DeploymentGateEvaluationAttributes finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    if (finishedAt != null) {}
    return this;
  }

  /**
   * Time the evaluation finished. Null while it is in progress.
   *
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public DeploymentGateEvaluationAttributes gateId(UUID gateId) {
    this.gateId = gateId;
    if (gateId != null) {}
    return this;
  }

  /**
   * Configured deployment gate UUID. Null for just-in-time evaluations.
   *
   * @return gateId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getGateId() {
    return gateId;
  }

  public void setGateId(UUID gateId) {
    this.gateId = gateId;
  }

  public DeploymentGateEvaluationAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Deployment gate identifier.
   *
   * @return identifier
   */
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DeploymentGateEvaluationAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Service evaluated by the deployment gate.
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

  public DeploymentGateEvaluationAttributes startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time the evaluation started.
   *
   * @return startedAt
   */
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public DeploymentGateEvaluationAttributes status(
      DeploymentGatesEvaluationResultResponseAttributesGateStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The recorded result of a gate or rule evaluation. - <code>in_progress</code>: The evaluation is
   * still running. - <code>pass</code>: All rules passed successfully. - <code>fail</code>: One or
   * more rules did not pass.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeploymentGatesEvaluationResultResponseAttributesGateStatus getStatus() {
    return status;
  }

  public void setStatus(DeploymentGatesEvaluationResultResponseAttributesGateStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public DeploymentGateEvaluationAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Evaluated deployment version. Empty when no version was provided.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return DeploymentGateEvaluationAttributes
   */
  @JsonAnySetter
  public DeploymentGateEvaluationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeploymentGateEvaluationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateEvaluationAttributes deploymentGateEvaluationAttributes =
        (DeploymentGateEvaluationAttributes) o;
    return Objects.equals(this.dryRun, deploymentGateEvaluationAttributes.dryRun)
        && Objects.equals(this.durationSeconds, deploymentGateEvaluationAttributes.durationSeconds)
        && Objects.equals(this.env, deploymentGateEvaluationAttributes.env)
        && Objects.equals(this.evaluationId, deploymentGateEvaluationAttributes.evaluationId)
        && Objects.equals(this.finishedAt, deploymentGateEvaluationAttributes.finishedAt)
        && Objects.equals(this.gateId, deploymentGateEvaluationAttributes.gateId)
        && Objects.equals(this.identifier, deploymentGateEvaluationAttributes.identifier)
        && Objects.equals(this.service, deploymentGateEvaluationAttributes.service)
        && Objects.equals(this.startedAt, deploymentGateEvaluationAttributes.startedAt)
        && Objects.equals(this.status, deploymentGateEvaluationAttributes.status)
        && Objects.equals(this.version, deploymentGateEvaluationAttributes.version)
        && Objects.equals(
            this.additionalProperties, deploymentGateEvaluationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dryRun,
        durationSeconds,
        env,
        evaluationId,
        finishedAt,
        gateId,
        identifier,
        service,
        startedAt,
        status,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateEvaluationAttributes {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    gateId: ").append(toIndentedString(gateId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
