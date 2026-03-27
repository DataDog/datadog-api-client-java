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
   * <p>Attributes for a deployment gate evaluation result response.</p>
 */
@JsonPropertyOrder({
  DeploymentGatesEvaluationResultResponseAttributes.JSON_PROPERTY_DRY_RUN,
  DeploymentGatesEvaluationResultResponseAttributes.JSON_PROPERTY_EVALUATION_ID,
  DeploymentGatesEvaluationResultResponseAttributes.JSON_PROPERTY_EVALUATION_URL,
  DeploymentGatesEvaluationResultResponseAttributes.JSON_PROPERTY_GATE_ID,
  DeploymentGatesEvaluationResultResponseAttributes.JSON_PROPERTY_GATE_STATUS,
  DeploymentGatesEvaluationResultResponseAttributes.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentGatesEvaluationResultResponseAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_EVALUATION_ID = "evaluation_id";
  private String evaluationId;

  public static final String JSON_PROPERTY_EVALUATION_URL = "evaluation_url";
  private String evaluationUrl;

  public static final String JSON_PROPERTY_GATE_ID = "gate_id";
  private UUID gateId;

  public static final String JSON_PROPERTY_GATE_STATUS = "gate_status";
  private DeploymentGatesEvaluationResultResponseAttributesGateStatus gateStatus;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<DeploymentGatesRuleResponse> rules = new ArrayList<>();

  public DeploymentGatesEvaluationResultResponseAttributes() {}

  @JsonCreator
  public DeploymentGatesEvaluationResultResponseAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DRY_RUN)Boolean dryRun,
            @JsonProperty(required=true, value=JSON_PROPERTY_EVALUATION_ID)String evaluationId,
            @JsonProperty(required=true, value=JSON_PROPERTY_EVALUATION_URL)String evaluationUrl,
            @JsonProperty(required=true, value=JSON_PROPERTY_GATE_ID)UUID gateId,
            @JsonProperty(required=true, value=JSON_PROPERTY_GATE_STATUS)DeploymentGatesEvaluationResultResponseAttributesGateStatus gateStatus,
            @JsonProperty(required=true, value=JSON_PROPERTY_RULES)List<DeploymentGatesRuleResponse> rules) {
        this.dryRun = dryRun;
        this.evaluationId = evaluationId;
        this.evaluationUrl = evaluationUrl;
        this.gateId = gateId;
        this.gateStatus = gateStatus;
        this.unparsed |= !gateStatus.isValid();
        this.rules = rules;
  }
  public DeploymentGatesEvaluationResultResponseAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * <p>Whether the gate was evaluated in dry-run mode.</p>
   * @return dryRun
  **/
      @JsonProperty(JSON_PROPERTY_DRY_RUN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getDryRun() {
        return dryRun;
      }
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }
  public DeploymentGatesEvaluationResultResponseAttributes evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * <p>The unique identifier of the gate evaluation.</p>
   * @return evaluationId
  **/
      @JsonProperty(JSON_PROPERTY_EVALUATION_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEvaluationId() {
        return evaluationId;
      }
  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }
  public DeploymentGatesEvaluationResultResponseAttributes evaluationUrl(String evaluationUrl) {
    this.evaluationUrl = evaluationUrl;
    return this;
  }

  /**
   * <p>A URL to view the evaluation details in the Datadog UI.</p>
   * @return evaluationUrl
  **/
      @JsonProperty(JSON_PROPERTY_EVALUATION_URL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getEvaluationUrl() {
        return evaluationUrl;
      }
  public void setEvaluationUrl(String evaluationUrl) {
    this.evaluationUrl = evaluationUrl;
  }
  public DeploymentGatesEvaluationResultResponseAttributes gateId(UUID gateId) {
    this.gateId = gateId;
    return this;
  }

  /**
   * <p>The unique identifier of the deployment gate.</p>
   * @return gateId
  **/
      @JsonProperty(JSON_PROPERTY_GATE_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public UUID getGateId() {
        return gateId;
      }
  public void setGateId(UUID gateId) {
    this.gateId = gateId;
  }
  public DeploymentGatesEvaluationResultResponseAttributes gateStatus(DeploymentGatesEvaluationResultResponseAttributesGateStatus gateStatus) {
    this.gateStatus = gateStatus;
    this.unparsed |= !gateStatus.isValid();
    return this;
  }

  /**
   * <p>The overall status of the gate evaluation.
   * - <code>in_progress</code>: The evaluation is still running.
   * - <code>pass</code>: All rules passed successfully and the deployment is allowed to proceed.
   * - <code>fail</code>: One or more rules did not pass; the deployment should not proceed.</p>
   * @return gateStatus
  **/
      @JsonProperty(JSON_PROPERTY_GATE_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DeploymentGatesEvaluationResultResponseAttributesGateStatus getGateStatus() {
        return gateStatus;
      }
  public void setGateStatus(DeploymentGatesEvaluationResultResponseAttributesGateStatus gateStatus) {
    if (!gateStatus.isValid()) {
        this.unparsed = true;
    }
    this.gateStatus = gateStatus;
  }
  public DeploymentGatesEvaluationResultResponseAttributes rules(List<DeploymentGatesRuleResponse> rules) {
    this.rules = rules;
    for (DeploymentGatesRuleResponse item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public DeploymentGatesEvaluationResultResponseAttributes addRulesItem(DeploymentGatesRuleResponse rulesItem) {
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * <p>The results of individual rule evaluations.</p>
   * @return rules
  **/
      @JsonProperty(JSON_PROPERTY_RULES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<DeploymentGatesRuleResponse> getRules() {
        return rules;
      }
  public void setRules(List<DeploymentGatesRuleResponse> rules) {
    this.rules = rules;
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
   * @return DeploymentGatesEvaluationResultResponseAttributes
   */
  @JsonAnySetter
  public DeploymentGatesEvaluationResultResponseAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DeploymentGatesEvaluationResultResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentGatesEvaluationResultResponseAttributes deploymentGatesEvaluationResultResponseAttributes = (DeploymentGatesEvaluationResultResponseAttributes) o;
    return Objects.equals(this.dryRun, deploymentGatesEvaluationResultResponseAttributes.dryRun) && Objects.equals(this.evaluationId, deploymentGatesEvaluationResultResponseAttributes.evaluationId) && Objects.equals(this.evaluationUrl, deploymentGatesEvaluationResultResponseAttributes.evaluationUrl) && Objects.equals(this.gateId, deploymentGatesEvaluationResultResponseAttributes.gateId) && Objects.equals(this.gateStatus, deploymentGatesEvaluationResultResponseAttributes.gateStatus) && Objects.equals(this.rules, deploymentGatesEvaluationResultResponseAttributes.rules) && Objects.equals(this.additionalProperties, deploymentGatesEvaluationResultResponseAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dryRun,evaluationId,evaluationUrl,gateId,gateStatus,rules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentGatesEvaluationResultResponseAttributes {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationUrl: ").append(toIndentedString(evaluationUrl)).append("\n");
    sb.append("    gateId: ").append(toIndentedString(gateId)).append("\n");
    sb.append("    gateStatus: ").append(toIndentedString(gateStatus)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
