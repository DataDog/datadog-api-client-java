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

/** Attributes of a deployment gate rule evaluation. */
@JsonPropertyOrder({
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_CONFIGURATION,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_DRY_RUN,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_DURATION_SECONDS,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_ENV,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_EVALUATION_ID,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_FAILURES,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_FINISHED_AT,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_GATE_DRY_RUN,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_GATE_EVALUATION_ID,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_GATE_ID,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_IDENTIFIER,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_NAME,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_REASON,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_RULE_ID,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_SERVICE,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_STARTED_AT,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_STATUS,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_TYPE,
  DeploymentGateRuleEvaluationAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGateRuleEvaluationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private DeploymentGateRuleEvaluationConfiguration configuration;

  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_DURATION_SECONDS = "duration_seconds";
  private Long durationSeconds;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluation_id";
  private UUID evaluationId;

  public static final String JSON_PROPERTY_FAILURES = "failures";
  private DeploymentGateRuleFailures failures;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private OffsetDateTime finishedAt;

  public static final String JSON_PROPERTY_GATE_DRY_RUN = "gate_dry_run";
  private Boolean gateDryRun;

  public static final String JSON_PROPERTY_GATE_EVALUATION_ID = "gate_evaluation_id";
  private UUID gateEvaluationId;

  public static final String JSON_PROPERTY_GATE_ID = "gate_id";
  private UUID gateId;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private UUID ruleId;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DeploymentGatesEvaluationResultResponseAttributesGateStatus status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DeploymentGateRuleEvaluationType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DeploymentGateRuleEvaluationAttributes() {}

  @JsonCreator
  public DeploymentGateRuleEvaluationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIGURATION)
          DeploymentGateRuleEvaluationConfiguration configuration,
      @JsonProperty(required = true, value = JSON_PROPERTY_DRY_RUN) Boolean dryRun,
      @JsonProperty(required = true, value = JSON_PROPERTY_DURATION_SECONDS) Long durationSeconds,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENV) String env,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVALUATION_ID) UUID evaluationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_FAILURES)
          DeploymentGateRuleFailures failures,
      @JsonProperty(required = true, value = JSON_PROPERTY_FINISHED_AT) OffsetDateTime finishedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_GATE_DRY_RUN) Boolean gateDryRun,
      @JsonProperty(required = true, value = JSON_PROPERTY_GATE_EVALUATION_ID)
          UUID gateEvaluationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_GATE_ID) UUID gateId,
      @JsonProperty(required = true, value = JSON_PROPERTY_IDENTIFIER) String identifier,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REASON) String reason,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) UUID ruleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          DeploymentGatesEvaluationResultResponseAttributesGateStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          DeploymentGateRuleEvaluationType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) String version) {
    this.configuration = configuration;
    this.unparsed |= configuration.unparsed;
    this.dryRun = dryRun;
    this.durationSeconds = durationSeconds;
    if (durationSeconds != null) {}
    this.env = env;
    this.evaluationId = evaluationId;
    this.failures = failures;
    this.unparsed |= failures.unparsed;
    this.finishedAt = finishedAt;
    if (finishedAt != null) {}
    this.gateDryRun = gateDryRun;
    this.gateEvaluationId = gateEvaluationId;
    this.gateId = gateId;
    if (gateId != null) {}
    this.identifier = identifier;
    this.name = name;
    this.reason = reason;
    this.ruleId = ruleId;
    if (ruleId != null) {}
    this.service = service;
    this.startedAt = startedAt;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
    this.version = version;
  }

  public DeploymentGateRuleEvaluationAttributes configuration(
      DeploymentGateRuleEvaluationConfiguration configuration) {
    this.configuration = configuration;
    this.unparsed |= configuration.unparsed;
    return this;
  }

  /**
   * Evaluated rule configuration. Fields depend on rule type and unset fields are omitted. Monitor
   * rules can include <code>duration</code>, <code>query</code>, <code>monitor_ids</code>, <code>
   * warmup</code>, <code>fail_on_no_groups_found</code>, and <code>fail_on_no_data</code>. Faulty
   * deployment detection rules can include <code>duration</code>, <code>allowed_resources</code>,
   * and <code>excluded_resources</code>.
   *
   * @return configuration
   */
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeploymentGateRuleEvaluationConfiguration getConfiguration() {
    return configuration;
  }

  public void setConfiguration(DeploymentGateRuleEvaluationConfiguration configuration) {
    this.configuration = configuration;
    if (configuration != null) {
      this.unparsed |= configuration.unparsed;
    }
  }

  public DeploymentGateRuleEvaluationAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Whether this rule is non-enforcing. A failed dry-run rule is ignored when computing the gate
   * outcome. Independent of <code>gate_dry_run</code>.
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

  public DeploymentGateRuleEvaluationAttributes durationSeconds(Long durationSeconds) {
    this.durationSeconds = durationSeconds;
    if (durationSeconds != null) {}
    return this;
  }

  /**
   * Rule evaluation duration in seconds. Null while it is in progress.
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

  public DeploymentGateRuleEvaluationAttributes env(String env) {
    this.env = env;
    return this;
  }

  /**
   * Evaluated environment.
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

  public DeploymentGateRuleEvaluationAttributes evaluationId(UUID evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * Rule evaluation UUID. Matches the resource <code>id</code>.
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

  public DeploymentGateRuleEvaluationAttributes failures(DeploymentGateRuleFailures failures) {
    this.failures = failures;
    this.unparsed |= failures.unparsed;
    return this;
  }

  /**
   * Rule failure details.
   *
   * @return failures
   */
  @JsonProperty(JSON_PROPERTY_FAILURES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeploymentGateRuleFailures getFailures() {
    return failures;
  }

  public void setFailures(DeploymentGateRuleFailures failures) {
    this.failures = failures;
    if (failures != null) {
      this.unparsed |= failures.unparsed;
    }
  }

  public DeploymentGateRuleEvaluationAttributes finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    if (finishedAt != null) {}
    return this;
  }

  /**
   * Time the rule evaluation finished. Null while it is in progress.
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

  public DeploymentGateRuleEvaluationAttributes gateDryRun(Boolean gateDryRun) {
    this.gateDryRun = gateDryRun;
    return this;
  }

  /**
   * Whether the parent gate is dry-run. A failed dry-run gate blocks but does not stop deployment.
   * Independent of rule-level <code>dry_run</code>.
   *
   * @return gateDryRun
   */
  @JsonProperty(JSON_PROPERTY_GATE_DRY_RUN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getGateDryRun() {
    return gateDryRun;
  }

  public void setGateDryRun(Boolean gateDryRun) {
    this.gateDryRun = gateDryRun;
  }

  public DeploymentGateRuleEvaluationAttributes gateEvaluationId(UUID gateEvaluationId) {
    this.gateEvaluationId = gateEvaluationId;
    return this;
  }

  /**
   * Deployment gate evaluation UUID.
   *
   * @return gateEvaluationId
   */
  @JsonProperty(JSON_PROPERTY_GATE_EVALUATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getGateEvaluationId() {
    return gateEvaluationId;
  }

  public void setGateEvaluationId(UUID gateEvaluationId) {
    this.gateEvaluationId = gateEvaluationId;
  }

  public DeploymentGateRuleEvaluationAttributes gateId(UUID gateId) {
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

  public DeploymentGateRuleEvaluationAttributes identifier(String identifier) {
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

  public DeploymentGateRuleEvaluationAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Rule name.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentGateRuleEvaluationAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the rule result.
   *
   * @return reason
   */
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DeploymentGateRuleEvaluationAttributes ruleId(UUID ruleId) {
    this.ruleId = ruleId;
    if (ruleId != null) {}
    return this;
  }

  /**
   * Configured deployment rule UUID. Null for just-in-time rules.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getRuleId() {
    return ruleId;
  }

  public void setRuleId(UUID ruleId) {
    this.ruleId = ruleId;
  }

  public DeploymentGateRuleEvaluationAttributes service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Evaluated service.
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

  public DeploymentGateRuleEvaluationAttributes startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time the rule evaluation started.
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

  public DeploymentGateRuleEvaluationAttributes status(
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

  public DeploymentGateRuleEvaluationAttributes type(DeploymentGateRuleEvaluationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of deployment gate rule.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DeploymentGateRuleEvaluationType getType() {
    return type;
  }

  public void setType(DeploymentGateRuleEvaluationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public DeploymentGateRuleEvaluationAttributes version(String version) {
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
   * @return DeploymentGateRuleEvaluationAttributes
   */
  @JsonAnySetter
  public DeploymentGateRuleEvaluationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeploymentGateRuleEvaluationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGateRuleEvaluationAttributes deploymentGateRuleEvaluationAttributes =
        (DeploymentGateRuleEvaluationAttributes) o;
    return Objects.equals(this.configuration, deploymentGateRuleEvaluationAttributes.configuration)
        && Objects.equals(this.dryRun, deploymentGateRuleEvaluationAttributes.dryRun)
        && Objects.equals(
            this.durationSeconds, deploymentGateRuleEvaluationAttributes.durationSeconds)
        && Objects.equals(this.env, deploymentGateRuleEvaluationAttributes.env)
        && Objects.equals(this.evaluationId, deploymentGateRuleEvaluationAttributes.evaluationId)
        && Objects.equals(this.failures, deploymentGateRuleEvaluationAttributes.failures)
        && Objects.equals(this.finishedAt, deploymentGateRuleEvaluationAttributes.finishedAt)
        && Objects.equals(this.gateDryRun, deploymentGateRuleEvaluationAttributes.gateDryRun)
        && Objects.equals(
            this.gateEvaluationId, deploymentGateRuleEvaluationAttributes.gateEvaluationId)
        && Objects.equals(this.gateId, deploymentGateRuleEvaluationAttributes.gateId)
        && Objects.equals(this.identifier, deploymentGateRuleEvaluationAttributes.identifier)
        && Objects.equals(this.name, deploymentGateRuleEvaluationAttributes.name)
        && Objects.equals(this.reason, deploymentGateRuleEvaluationAttributes.reason)
        && Objects.equals(this.ruleId, deploymentGateRuleEvaluationAttributes.ruleId)
        && Objects.equals(this.service, deploymentGateRuleEvaluationAttributes.service)
        && Objects.equals(this.startedAt, deploymentGateRuleEvaluationAttributes.startedAt)
        && Objects.equals(this.status, deploymentGateRuleEvaluationAttributes.status)
        && Objects.equals(this.type, deploymentGateRuleEvaluationAttributes.type)
        && Objects.equals(this.version, deploymentGateRuleEvaluationAttributes.version)
        && Objects.equals(
            this.additionalProperties, deploymentGateRuleEvaluationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configuration,
        dryRun,
        durationSeconds,
        env,
        evaluationId,
        failures,
        finishedAt,
        gateDryRun,
        gateEvaluationId,
        gateId,
        identifier,
        name,
        reason,
        ruleId,
        service,
        startedAt,
        status,
        type,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGateRuleEvaluationAttributes {\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    gateDryRun: ").append(toIndentedString(gateDryRun)).append("\n");
    sb.append("    gateEvaluationId: ").append(toIndentedString(gateEvaluationId)).append("\n");
    sb.append("    gateId: ").append(toIndentedString(gateId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
