/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A single ECS remediation investigation: a detected issue together with its proposed plan,
 * history, and ECS workload metadata.
 */
@JsonPropertyOrder({
  RemediationInvestigation.JSON_PROPERTY_CODE_SESSION,
  RemediationInvestigation.JSON_PROPERTY_CREATED_AT_MS,
  RemediationInvestigation.JSON_PROPERTY_GUARDRAIL_DECISION,
  RemediationInvestigation.JSON_PROPERTY_HISTORY,
  RemediationInvestigation.JSON_PROPERTY_ID,
  RemediationInvestigation.JSON_PROPERTY_ISSUE_TYPE,
  RemediationInvestigation.JSON_PROPERTY_LAST_ACTION_AT_MS,
  RemediationInvestigation.JSON_PROPERTY_METADATA,
  RemediationInvestigation.JSON_PROPERTY_ORG_ID,
  RemediationInvestigation.JSON_PROPERTY_PLAN,
  RemediationInvestigation.JSON_PROPERTY_RESOURCE_ARN,
  RemediationInvestigation.JSON_PROPERTY_STATUS,
  RemediationInvestigation.JSON_PROPERTY_UPDATED_AT_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RemediationInvestigation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_SESSION = "code_session";
  private RemediationCodeSession codeSession;

  public static final String JSON_PROPERTY_CREATED_AT_MS = "created_at_ms";
  private String createdAtMs;

  public static final String JSON_PROPERTY_GUARDRAIL_DECISION = "guardrail_decision";
  private RemediationGuardrailDecision guardrailDecision;

  public static final String JSON_PROPERTY_HISTORY = "history";
  private List<RemediationHistoryEvent> history = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ISSUE_TYPE = "issue_type";
  private String issueType;

  public static final String JSON_PROPERTY_LAST_ACTION_AT_MS = "last_action_at_ms";
  private String lastActionAtMs;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private RemediationEcsMetadata metadata;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private String orgId;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private RemediationPlan plan;

  public static final String JSON_PROPERTY_RESOURCE_ARN = "resource_arn";
  private String resourceArn;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RemediationInvestigationStatus status;

  public static final String JSON_PROPERTY_UPDATED_AT_MS = "updated_at_ms";
  private String updatedAtMs;

  public RemediationInvestigation codeSession(RemediationCodeSession codeSession) {
    this.codeSession = codeSession;
    this.unparsed |= codeSession.unparsed;
    return this;
  }

  /**
   * A linked code session (for example, a pull request) for the investigation.
   *
   * @return codeSession
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationCodeSession getCodeSession() {
    return codeSession;
  }

  public void setCodeSession(RemediationCodeSession codeSession) {
    this.codeSession = codeSession;
  }

  public RemediationInvestigation createdAtMs(String createdAtMs) {
    this.createdAtMs = createdAtMs;
    return this;
  }

  /**
   * Creation time in epoch milliseconds (64-bit integer encoded as a string).
   *
   * @return createdAtMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCreatedAtMs() {
    return createdAtMs;
  }

  public void setCreatedAtMs(String createdAtMs) {
    this.createdAtMs = createdAtMs;
  }

  public RemediationInvestigation guardrailDecision(
      RemediationGuardrailDecision guardrailDecision) {
    this.guardrailDecision = guardrailDecision;
    this.unparsed |= guardrailDecision.unparsed;
    return this;
  }

  /**
   * The guardrail decision applied to a plan or investigation.
   *
   * @return guardrailDecision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUARDRAIL_DECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationGuardrailDecision getGuardrailDecision() {
    return guardrailDecision;
  }

  public void setGuardrailDecision(RemediationGuardrailDecision guardrailDecision) {
    this.guardrailDecision = guardrailDecision;
  }

  public RemediationInvestigation history(List<RemediationHistoryEvent> history) {
    this.history = history;
    for (RemediationHistoryEvent item : history) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public RemediationInvestigation addHistoryItem(RemediationHistoryEvent historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    this.unparsed |= historyItem.unparsed;
    return this;
  }

  /**
   * Ordered list of history events for the investigation.
   *
   * @return history
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RemediationHistoryEvent> getHistory() {
    return history;
  }

  public void setHistory(List<RemediationHistoryEvent> history) {
    this.history = history;
  }

  public RemediationInvestigation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique investigation ID.
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

  public RemediationInvestigation issueType(String issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * The detected issue type.
   *
   * @return issueType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueType() {
    return issueType;
  }

  public void setIssueType(String issueType) {
    this.issueType = issueType;
  }

  public RemediationInvestigation lastActionAtMs(String lastActionAtMs) {
    this.lastActionAtMs = lastActionAtMs;
    return this;
  }

  /**
   * Time of the last action in epoch milliseconds (64-bit integer encoded as a string).
   *
   * @return lastActionAtMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ACTION_AT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastActionAtMs() {
    return lastActionAtMs;
  }

  public void setLastActionAtMs(String lastActionAtMs) {
    this.lastActionAtMs = lastActionAtMs;
  }

  public RemediationInvestigation metadata(RemediationEcsMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * ECS-specific context for the investigation.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationEcsMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(RemediationEcsMetadata metadata) {
    this.metadata = metadata;
  }

  public RemediationInvestigation orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Datadog organization ID that owns the investigation (64-bit integer encoded as a string).
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public RemediationInvestigation plan(RemediationPlan plan) {
    this.plan = plan;
    this.unparsed |= plan.unparsed;
    return this;
  }

  /**
   * The remediation plan proposed by the ECS remediation agent.
   *
   * @return plan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationPlan getPlan() {
    return plan;
  }

  public void setPlan(RemediationPlan plan) {
    this.plan = plan;
  }

  public RemediationInvestigation resourceArn(String resourceArn) {
    this.resourceArn = resourceArn;
    return this;
  }

  /**
   * ARN of the ECS resource the investigation is about.
   *
   * @return resourceArn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceArn() {
    return resourceArn;
  }

  public void setResourceArn(String resourceArn) {
    this.resourceArn = resourceArn;
  }

  public RemediationInvestigation status(RemediationInvestigationStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Investigation status.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RemediationInvestigationStatus getStatus() {
    return status;
  }

  public void setStatus(RemediationInvestigationStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public RemediationInvestigation updatedAtMs(String updatedAtMs) {
    this.updatedAtMs = updatedAtMs;
    return this;
  }

  /**
   * Last update time in epoch milliseconds (64-bit integer encoded as a string).
   *
   * @return updatedAtMs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT_MS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedAtMs() {
    return updatedAtMs;
  }

  public void setUpdatedAtMs(String updatedAtMs) {
    this.updatedAtMs = updatedAtMs;
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
   * @return RemediationInvestigation
   */
  @JsonAnySetter
  public RemediationInvestigation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RemediationInvestigation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemediationInvestigation remediationInvestigation = (RemediationInvestigation) o;
    return Objects.equals(this.codeSession, remediationInvestigation.codeSession)
        && Objects.equals(this.createdAtMs, remediationInvestigation.createdAtMs)
        && Objects.equals(this.guardrailDecision, remediationInvestigation.guardrailDecision)
        && Objects.equals(this.history, remediationInvestigation.history)
        && Objects.equals(this.id, remediationInvestigation.id)
        && Objects.equals(this.issueType, remediationInvestigation.issueType)
        && Objects.equals(this.lastActionAtMs, remediationInvestigation.lastActionAtMs)
        && Objects.equals(this.metadata, remediationInvestigation.metadata)
        && Objects.equals(this.orgId, remediationInvestigation.orgId)
        && Objects.equals(this.plan, remediationInvestigation.plan)
        && Objects.equals(this.resourceArn, remediationInvestigation.resourceArn)
        && Objects.equals(this.status, remediationInvestigation.status)
        && Objects.equals(this.updatedAtMs, remediationInvestigation.updatedAtMs)
        && Objects.equals(this.additionalProperties, remediationInvestigation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        codeSession,
        createdAtMs,
        guardrailDecision,
        history,
        id,
        issueType,
        lastActionAtMs,
        metadata,
        orgId,
        plan,
        resourceArn,
        status,
        updatedAtMs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemediationInvestigation {\n");
    sb.append("    codeSession: ").append(toIndentedString(codeSession)).append("\n");
    sb.append("    createdAtMs: ").append(toIndentedString(createdAtMs)).append("\n");
    sb.append("    guardrailDecision: ").append(toIndentedString(guardrailDecision)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    lastActionAtMs: ").append(toIndentedString(lastActionAtMs)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    resourceArn: ").append(toIndentedString(resourceArn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAtMs: ").append(toIndentedString(updatedAtMs)).append("\n");
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
