/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * GitHub Actions OIDC claims to match against. Each field is a regular expression. The <code>sub
 * </code> claim is required; all other claims are optional. A token matches only when all provided
 * patterns match simultaneously (AND semantics).
 */
@JsonPropertyOrder({
  GitHubOIDCClaimPatterns.JSON_PROPERTY_ACTOR,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_ACTOR_ID,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_ENTERPRISE,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_ENTERPRISE_ID,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_ENVIRONMENT,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_EVENT_NAME,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_JOB_WORKFLOW_REF,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REF,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REF_TYPE,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REPOSITORY,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REPOSITORY_ID,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REPOSITORY_OWNER,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REPOSITORY_OWNER_ID,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_REPOSITORY_VISIBILITY,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_RUNNER_ENVIRONMENT,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_SUB,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_WORKFLOW,
  GitHubOIDCClaimPatterns.JSON_PROPERTY_WORKFLOW_REF
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GitHubOIDCClaimPatterns {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTOR = "actor";
  private String actor;

  public static final String JSON_PROPERTY_ACTOR_ID = "actor_id";
  private String actorId;

  public static final String JSON_PROPERTY_ENTERPRISE = "enterprise";
  private String enterprise;

  public static final String JSON_PROPERTY_ENTERPRISE_ID = "enterprise_id";
  private String enterpriseId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  public static final String JSON_PROPERTY_EVENT_NAME = "event_name";
  private String eventName;

  public static final String JSON_PROPERTY_JOB_WORKFLOW_REF = "job_workflow_ref";
  private String jobWorkflowRef;

  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_REF_TYPE = "ref_type";
  private String refType;

  public static final String JSON_PROPERTY_REPOSITORY = "repository";
  private String repository;

  public static final String JSON_PROPERTY_REPOSITORY_ID = "repository_id";
  private String repositoryId;

  public static final String JSON_PROPERTY_REPOSITORY_OWNER = "repository_owner";
  private String repositoryOwner;

  public static final String JSON_PROPERTY_REPOSITORY_OWNER_ID = "repository_owner_id";
  private String repositoryOwnerId;

  public static final String JSON_PROPERTY_REPOSITORY_VISIBILITY = "repository_visibility";
  private String repositoryVisibility;

  public static final String JSON_PROPERTY_RUNNER_ENVIRONMENT = "runner_environment";
  private String runnerEnvironment;

  public static final String JSON_PROPERTY_SUB = "sub";
  private String sub;

  public static final String JSON_PROPERTY_WORKFLOW = "workflow";
  private String workflow;

  public static final String JSON_PROPERTY_WORKFLOW_REF = "workflow_ref";
  private String workflowRef;

  public GitHubOIDCClaimPatterns() {}

  @JsonCreator
  public GitHubOIDCClaimPatterns(
      @JsonProperty(required = true, value = JSON_PROPERTY_SUB) String sub) {
    this.sub = sub;
  }

  public GitHubOIDCClaimPatterns actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Regular expression matched against the <code>actor</code> claim.
   *
   * @return actor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public GitHubOIDCClaimPatterns actorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  /**
   * Regular expression matched against the <code>actor_id</code> claim.
   *
   * @return actorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActorId() {
    return actorId;
  }

  public void setActorId(String actorId) {
    this.actorId = actorId;
  }

  public GitHubOIDCClaimPatterns enterprise(String enterprise) {
    this.enterprise = enterprise;
    return this;
  }

  /**
   * Regular expression matched against the <code>enterprise</code> claim.
   *
   * @return enterprise
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnterprise() {
    return enterprise;
  }

  public void setEnterprise(String enterprise) {
    this.enterprise = enterprise;
  }

  public GitHubOIDCClaimPatterns enterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
    return this;
  }

  /**
   * Regular expression matched against the <code>enterprise_id</code> claim.
   *
   * @return enterpriseId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnterpriseId() {
    return enterpriseId;
  }

  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }

  public GitHubOIDCClaimPatterns environment(String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Regular expression matched against the <code>environment</code> claim.
   *
   * @return environment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public GitHubOIDCClaimPatterns eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Regular expression matched against the <code>event_name</code> claim.
   *
   * @return eventName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public GitHubOIDCClaimPatterns jobWorkflowRef(String jobWorkflowRef) {
    this.jobWorkflowRef = jobWorkflowRef;
    return this;
  }

  /**
   * Regular expression matched against the <code>job_workflow_ref</code> claim.
   *
   * @return jobWorkflowRef
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JOB_WORKFLOW_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getJobWorkflowRef() {
    return jobWorkflowRef;
  }

  public void setJobWorkflowRef(String jobWorkflowRef) {
    this.jobWorkflowRef = jobWorkflowRef;
  }

  public GitHubOIDCClaimPatterns ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Regular expression matched against the <code>ref</code> claim.
   *
   * @return ref
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public GitHubOIDCClaimPatterns refType(String refType) {
    this.refType = refType;
    return this;
  }

  /**
   * Regular expression matched against the <code>ref_type</code> claim.
   *
   * @return refType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRefType() {
    return refType;
  }

  public void setRefType(String refType) {
    this.refType = refType;
  }

  public GitHubOIDCClaimPatterns repository(String repository) {
    this.repository = repository;
    return this;
  }

  /**
   * Regular expression matched against the <code>repository</code> claim.
   *
   * @return repository
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepository() {
    return repository;
  }

  public void setRepository(String repository) {
    this.repository = repository;
  }

  public GitHubOIDCClaimPatterns repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * Regular expression matched against the <code>repository_id</code> claim.
   *
   * @return repositoryId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }

  public GitHubOIDCClaimPatterns repositoryOwner(String repositoryOwner) {
    this.repositoryOwner = repositoryOwner;
    return this;
  }

  /**
   * Regular expression matched against the <code>repository_owner</code> claim.
   *
   * @return repositoryOwner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryOwner() {
    return repositoryOwner;
  }

  public void setRepositoryOwner(String repositoryOwner) {
    this.repositoryOwner = repositoryOwner;
  }

  public GitHubOIDCClaimPatterns repositoryOwnerId(String repositoryOwnerId) {
    this.repositoryOwnerId = repositoryOwnerId;
    return this;
  }

  /**
   * Regular expression matched against the <code>repository_owner_id</code> claim.
   *
   * @return repositoryOwnerId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryOwnerId() {
    return repositoryOwnerId;
  }

  public void setRepositoryOwnerId(String repositoryOwnerId) {
    this.repositoryOwnerId = repositoryOwnerId;
  }

  public GitHubOIDCClaimPatterns repositoryVisibility(String repositoryVisibility) {
    this.repositoryVisibility = repositoryVisibility;
    return this;
  }

  /**
   * Regular expression matched against the <code>repository_visibility</code> claim.
   *
   * @return repositoryVisibility
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRepositoryVisibility() {
    return repositoryVisibility;
  }

  public void setRepositoryVisibility(String repositoryVisibility) {
    this.repositoryVisibility = repositoryVisibility;
  }

  public GitHubOIDCClaimPatterns runnerEnvironment(String runnerEnvironment) {
    this.runnerEnvironment = runnerEnvironment;
    return this;
  }

  /**
   * Regular expression matched against the <code>runner_environment</code> claim.
   *
   * @return runnerEnvironment
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUNNER_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRunnerEnvironment() {
    return runnerEnvironment;
  }

  public void setRunnerEnvironment(String runnerEnvironment) {
    this.runnerEnvironment = runnerEnvironment;
  }

  public GitHubOIDCClaimPatterns sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * Regular expression matched against the entire <code>sub</code> (subject) claim, the primary
   * GitHub Actions OIDC identifier (for example, <code>
   * repo:&lt;OWNER&gt;/&lt;REPO&gt;:ref:refs/heads/main</code>). The pattern must begin with <code>
   * repo:&lt;OWNER&gt;/</code>, where <code>&lt;OWNER&gt;</code> is a literal repository-owner name
   * rather than a regular expression.
   *
   * @return sub
   */
  @JsonProperty(JSON_PROPERTY_SUB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public GitHubOIDCClaimPatterns workflow(String workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * Regular expression matched against the <code>workflow</code> claim.
   *
   * @return workflow
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkflow() {
    return workflow;
  }

  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }

  public GitHubOIDCClaimPatterns workflowRef(String workflowRef) {
    this.workflowRef = workflowRef;
    return this;
  }

  /**
   * Regular expression matched against the <code>workflow_ref</code> claim.
   *
   * @return workflowRef
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORKFLOW_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getWorkflowRef() {
    return workflowRef;
  }

  public void setWorkflowRef(String workflowRef) {
    this.workflowRef = workflowRef;
  }

  /** Return true if this GitHubOIDCClaimPatterns object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitHubOIDCClaimPatterns gitHubOidcClaimPatterns = (GitHubOIDCClaimPatterns) o;
    return Objects.equals(this.actor, gitHubOidcClaimPatterns.actor)
        && Objects.equals(this.actorId, gitHubOidcClaimPatterns.actorId)
        && Objects.equals(this.enterprise, gitHubOidcClaimPatterns.enterprise)
        && Objects.equals(this.enterpriseId, gitHubOidcClaimPatterns.enterpriseId)
        && Objects.equals(this.environment, gitHubOidcClaimPatterns.environment)
        && Objects.equals(this.eventName, gitHubOidcClaimPatterns.eventName)
        && Objects.equals(this.jobWorkflowRef, gitHubOidcClaimPatterns.jobWorkflowRef)
        && Objects.equals(this.ref, gitHubOidcClaimPatterns.ref)
        && Objects.equals(this.refType, gitHubOidcClaimPatterns.refType)
        && Objects.equals(this.repository, gitHubOidcClaimPatterns.repository)
        && Objects.equals(this.repositoryId, gitHubOidcClaimPatterns.repositoryId)
        && Objects.equals(this.repositoryOwner, gitHubOidcClaimPatterns.repositoryOwner)
        && Objects.equals(this.repositoryOwnerId, gitHubOidcClaimPatterns.repositoryOwnerId)
        && Objects.equals(this.repositoryVisibility, gitHubOidcClaimPatterns.repositoryVisibility)
        && Objects.equals(this.runnerEnvironment, gitHubOidcClaimPatterns.runnerEnvironment)
        && Objects.equals(this.sub, gitHubOidcClaimPatterns.sub)
        && Objects.equals(this.workflow, gitHubOidcClaimPatterns.workflow)
        && Objects.equals(this.workflowRef, gitHubOidcClaimPatterns.workflowRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actor,
        actorId,
        enterprise,
        enterpriseId,
        environment,
        eventName,
        jobWorkflowRef,
        ref,
        refType,
        repository,
        repositoryId,
        repositoryOwner,
        repositoryOwnerId,
        repositoryVisibility,
        runnerEnvironment,
        sub,
        workflow,
        workflowRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitHubOIDCClaimPatterns {\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    jobWorkflowRef: ").append(toIndentedString(jobWorkflowRef)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
    sb.append("    repositoryOwner: ").append(toIndentedString(repositoryOwner)).append("\n");
    sb.append("    repositoryOwnerId: ").append(toIndentedString(repositoryOwnerId)).append("\n");
    sb.append("    repositoryVisibility: ")
        .append(toIndentedString(repositoryVisibility))
        .append("\n");
    sb.append("    runnerEnvironment: ").append(toIndentedString(runnerEnvironment)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    workflowRef: ").append(toIndentedString(workflowRef)).append("\n");
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
