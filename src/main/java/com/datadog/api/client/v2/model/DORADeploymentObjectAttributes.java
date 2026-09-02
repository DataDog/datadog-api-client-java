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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of the deployment event. */
@JsonPropertyOrder({
  DORADeploymentObjectAttributes.JSON_PROPERTY_AI,
  DORADeploymentObjectAttributes.JSON_PROPERTY_AVERAGED_METRICS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_CHANGE_FAILURE,
  DORADeploymentObjectAttributes.JSON_PROPERTY_COMMITS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_CREATED_AT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_CUSTOM,
  DORADeploymentObjectAttributes.JSON_PROPERTY_CUSTOM_TAGS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_DEPLOYMENT_TYPE,
  DORADeploymentObjectAttributes.JSON_PROPERTY_DURATION,
  DORADeploymentObjectAttributes.JSON_PROPERTY_ENV,
  DORADeploymentObjectAttributes.JSON_PROPERTY_FINISHED_AT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_GIT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_NUMBER_OF_COMMITS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_NUMBER_OF_PULL_REQUESTS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_PULL_REQUESTS,
  DORADeploymentObjectAttributes.JSON_PROPERTY_RECOVERY_TIME_SEC,
  DORADeploymentObjectAttributes.JSON_PROPERTY_REMEDIATION,
  DORADeploymentObjectAttributes.JSON_PROPERTY_SERVICE,
  DORADeploymentObjectAttributes.JSON_PROPERTY_SOURCE,
  DORADeploymentObjectAttributes.JSON_PROPERTY_STARTED_AT,
  DORADeploymentObjectAttributes.JSON_PROPERTY_TEAM,
  DORADeploymentObjectAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DORADeploymentObjectAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AI = "ai";
  private Map<String, Object> ai = null;

  public static final String JSON_PROPERTY_AVERAGED_METRICS = "averaged_metrics";
  private DORADeploymentAveragedMetrics averagedMetrics;

  public static final String JSON_PROPERTY_CHANGE_FAILURE = "change_failure";
  private Boolean changeFailure;

  public static final String JSON_PROPERTY_COMMITS = "commits";
  private List<Map<String, Object>> commits = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Map<String, Object> custom = null;

  public static final String JSON_PROPERTY_CUSTOM_TAGS = "custom_tags";
  private JsonNullable<List<String>> customTags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_DEPLOYMENT_TYPE = "deployment_type";
  private String deploymentType;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private OffsetDateTime finishedAt;

  public static final String JSON_PROPERTY_GIT = "git";
  private DORAGitInfoResponse git;

  public static final String JSON_PROPERTY_NUMBER_OF_COMMITS = "number_of_commits";
  private Long numberOfCommits;

  public static final String JSON_PROPERTY_NUMBER_OF_PULL_REQUESTS = "number_of_pull_requests";
  private Long numberOfPullRequests;

  public static final String JSON_PROPERTY_PULL_REQUESTS = "pull_requests";
  private List<Map<String, Object>> pullRequests = null;

  public static final String JSON_PROPERTY_RECOVERY_TIME_SEC = "recovery_time_sec";
  private Long recoveryTimeSec;

  public static final String JSON_PROPERTY_REMEDIATION = "remediation";
  private DORADeploymentRemediation remediation;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public DORADeploymentObjectAttributes() {}

  @JsonCreator
  public DORADeploymentObjectAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE) String service,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt) {
    this.service = service;
    this.startedAt = startedAt;
  }

  public DORADeploymentObjectAttributes ai(Map<String, Object> ai) {
    this.ai = ai;
    return this;
  }

  public DORADeploymentObjectAttributes putAiItem(String key, Object aiItem) {
    if (this.ai == null) {
      this.ai = new HashMap<>();
    }
    this.ai.put(key, aiItem);
    return this;
  }

  /**
   * AI-assisted development metrics aggregated across the commits and pull requests included in the
   * deployment.
   *
   * @return ai
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getAi() {
    return ai;
  }

  public void setAi(Map<String, Object> ai) {
    this.ai = ai;
  }

  public DORADeploymentObjectAttributes averagedMetrics(
      DORADeploymentAveragedMetrics averagedMetrics) {
    this.averagedMetrics = averagedMetrics;
    this.unparsed |= averagedMetrics.unparsed;
    return this;
  }

  /**
   * Averaged DORA and delivery metrics computed across the commits and pull requests included in
   * the deployment.
   *
   * @return averagedMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGED_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DORADeploymentAveragedMetrics getAveragedMetrics() {
    return averagedMetrics;
  }

  public void setAveragedMetrics(DORADeploymentAveragedMetrics averagedMetrics) {
    this.averagedMetrics = averagedMetrics;
    if (averagedMetrics != null) {
      this.unparsed |= averagedMetrics.unparsed;
    }
  }

  public DORADeploymentObjectAttributes changeFailure(Boolean changeFailure) {
    this.changeFailure = changeFailure;
    return this;
  }

  /**
   * Whether the deployment is flagged as a change failure.
   *
   * @return changeFailure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getChangeFailure() {
    return changeFailure;
  }

  public void setChangeFailure(Boolean changeFailure) {
    this.changeFailure = changeFailure;
  }

  public DORADeploymentObjectAttributes commits(List<Map<String, Object>> commits) {
    this.commits = commits;
    return this;
  }

  public DORADeploymentObjectAttributes addCommitsItem(Map<String, Object> commitsItem) {
    if (this.commits == null) {
      this.commits = new ArrayList<>();
    }
    this.commits.add(commitsItem);
    return this;
  }

  /**
   * The list of commits included in the deployment.
   *
   * @return commits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getCommits() {
    return commits;
  }

  public void setCommits(List<Map<String, Object>> commits) {
    this.commits = commits;
  }

  public DORADeploymentObjectAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time when the deployment event was recorded.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DORADeploymentObjectAttributes custom(Map<String, Object> custom) {
    this.custom = custom;
    return this;
  }

  public DORADeploymentObjectAttributes putCustomItem(String key, Object customItem) {
    if (this.custom == null) {
      this.custom = new HashMap<>();
    }
    this.custom.put(key, customItem);
    return this;
  }

  /**
   * A map of custom metadata associated with the deployment.
   *
   * @return custom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getCustom() {
    return custom;
  }

  public void setCustom(Map<String, Object> custom) {
    this.custom = custom;
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

  public DORADeploymentObjectAttributes deploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

  /**
   * The type of the deployment.
   *
   * @return deploymentType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
  }

  public DORADeploymentObjectAttributes duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the deployment.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
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

  public DORADeploymentObjectAttributes finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * The time when the deployment finished.
   *
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public DORADeploymentObjectAttributes git(DORAGitInfoResponse git) {
    this.git = git;
    this.unparsed |= git.unparsed;
    return this;
  }

  /**
   * Git info returned by DORA Metrics events.
   *
   * @return git
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DORAGitInfoResponse getGit() {
    return git;
  }

  public void setGit(DORAGitInfoResponse git) {
    this.git = git;
    if (git != null) {
      this.unparsed |= git.unparsed;
    }
  }

  public DORADeploymentObjectAttributes numberOfCommits(Long numberOfCommits) {
    this.numberOfCommits = numberOfCommits;
    return this;
  }

  /**
   * The number of commits associated with the deployment.
   *
   * @return numberOfCommits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_COMMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumberOfCommits() {
    return numberOfCommits;
  }

  public void setNumberOfCommits(Long numberOfCommits) {
    this.numberOfCommits = numberOfCommits;
  }

  public DORADeploymentObjectAttributes numberOfPullRequests(Long numberOfPullRequests) {
    this.numberOfPullRequests = numberOfPullRequests;
    return this;
  }

  /**
   * The number of pull requests associated with the deployment.
   *
   * @return numberOfPullRequests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PULL_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumberOfPullRequests() {
    return numberOfPullRequests;
  }

  public void setNumberOfPullRequests(Long numberOfPullRequests) {
    this.numberOfPullRequests = numberOfPullRequests;
  }

  public DORADeploymentObjectAttributes pullRequests(List<Map<String, Object>> pullRequests) {
    this.pullRequests = pullRequests;
    return this;
  }

  public DORADeploymentObjectAttributes addPullRequestsItem(Map<String, Object> pullRequestsItem) {
    if (this.pullRequests == null) {
      this.pullRequests = new ArrayList<>();
    }
    this.pullRequests.add(pullRequestsItem);
    return this;
  }

  /**
   * The list of pull requests included in the deployment.
   *
   * @return pullRequests
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PULL_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getPullRequests() {
    return pullRequests;
  }

  public void setPullRequests(List<Map<String, Object>> pullRequests) {
    this.pullRequests = pullRequests;
  }

  public DORADeploymentObjectAttributes recoveryTimeSec(Long recoveryTimeSec) {
    this.recoveryTimeSec = recoveryTimeSec;
    return this;
  }

  /**
   * The recovery time, in seconds, for a deployment flagged as a change failure.
   *
   * @return recoveryTimeSec
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_TIME_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRecoveryTimeSec() {
    return recoveryTimeSec;
  }

  public void setRecoveryTimeSec(Long recoveryTimeSec) {
    this.recoveryTimeSec = recoveryTimeSec;
  }

  public DORADeploymentObjectAttributes remediation(DORADeploymentRemediation remediation) {
    this.remediation = remediation;
    this.unparsed |= remediation.unparsed;
    return this;
  }

  /**
   * Remediation details for a deployment that was flagged as a change failure.
   *
   * @return remediation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMEDIATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DORADeploymentRemediation getRemediation() {
    return remediation;
  }

  public void setRemediation(DORADeploymentRemediation remediation) {
    this.remediation = remediation;
    if (remediation != null) {
      this.unparsed |= remediation.unparsed;
    }
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

  public DORADeploymentObjectAttributes source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the deployment event.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DORADeploymentObjectAttributes startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * The time when the deployment started.
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
    return Objects.equals(this.ai, doraDeploymentObjectAttributes.ai)
        && Objects.equals(this.averagedMetrics, doraDeploymentObjectAttributes.averagedMetrics)
        && Objects.equals(this.changeFailure, doraDeploymentObjectAttributes.changeFailure)
        && Objects.equals(this.commits, doraDeploymentObjectAttributes.commits)
        && Objects.equals(this.createdAt, doraDeploymentObjectAttributes.createdAt)
        && Objects.equals(this.custom, doraDeploymentObjectAttributes.custom)
        && Objects.equals(this.customTags, doraDeploymentObjectAttributes.customTags)
        && Objects.equals(this.deploymentType, doraDeploymentObjectAttributes.deploymentType)
        && Objects.equals(this.duration, doraDeploymentObjectAttributes.duration)
        && Objects.equals(this.env, doraDeploymentObjectAttributes.env)
        && Objects.equals(this.finishedAt, doraDeploymentObjectAttributes.finishedAt)
        && Objects.equals(this.git, doraDeploymentObjectAttributes.git)
        && Objects.equals(this.numberOfCommits, doraDeploymentObjectAttributes.numberOfCommits)
        && Objects.equals(
            this.numberOfPullRequests, doraDeploymentObjectAttributes.numberOfPullRequests)
        && Objects.equals(this.pullRequests, doraDeploymentObjectAttributes.pullRequests)
        && Objects.equals(this.recoveryTimeSec, doraDeploymentObjectAttributes.recoveryTimeSec)
        && Objects.equals(this.remediation, doraDeploymentObjectAttributes.remediation)
        && Objects.equals(this.service, doraDeploymentObjectAttributes.service)
        && Objects.equals(this.source, doraDeploymentObjectAttributes.source)
        && Objects.equals(this.startedAt, doraDeploymentObjectAttributes.startedAt)
        && Objects.equals(this.team, doraDeploymentObjectAttributes.team)
        && Objects.equals(this.version, doraDeploymentObjectAttributes.version)
        && Objects.equals(
            this.additionalProperties, doraDeploymentObjectAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ai,
        averagedMetrics,
        changeFailure,
        commits,
        createdAt,
        custom,
        customTags,
        deploymentType,
        duration,
        env,
        finishedAt,
        git,
        numberOfCommits,
        numberOfPullRequests,
        pullRequests,
        recoveryTimeSec,
        remediation,
        service,
        source,
        startedAt,
        team,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DORADeploymentObjectAttributes {\n");
    sb.append("    ai: ").append(toIndentedString(ai)).append("\n");
    sb.append("    averagedMetrics: ").append(toIndentedString(averagedMetrics)).append("\n");
    sb.append("    changeFailure: ").append(toIndentedString(changeFailure)).append("\n");
    sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    numberOfCommits: ").append(toIndentedString(numberOfCommits)).append("\n");
    sb.append("    numberOfPullRequests: ")
        .append(toIndentedString(numberOfPullRequests))
        .append("\n");
    sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
    sb.append("    recoveryTimeSec: ").append(toIndentedString(recoveryTimeSec)).append("\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
