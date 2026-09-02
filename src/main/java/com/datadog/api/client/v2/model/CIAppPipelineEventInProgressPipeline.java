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

/** Details of a running pipeline. */
@JsonPropertyOrder({
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_ERROR,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_GIT,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_IS_MANUAL,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_IS_RESUMED,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_LEVEL,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_METRICS,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_NAME,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_NODE,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_PARAMETERS,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_PARENT_PIPELINE,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_PARTIAL_RETRY,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_PIPELINE_ID,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_PREVIOUS_ATTEMPT,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_QUEUE_TIME,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_START,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_STATUS,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_TAGS,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_UNIQUE_ID,
  CIAppPipelineEventInProgressPipeline.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventInProgressPipeline {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<CIAppCIError> error = JsonNullable.<CIAppCIError>undefined();

  public static final String JSON_PROPERTY_GIT = "git";
  private JsonNullable<CIAppGitInfo> git = JsonNullable.<CIAppGitInfo>undefined();

  public static final String JSON_PROPERTY_IS_MANUAL = "is_manual";
  private JsonNullable<Boolean> isManual = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_RESUMED = "is_resumed";
  private JsonNullable<Boolean> isResumed = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_LEVEL = "level";
  private CIAppPipelineEventPipelineLevel level = CIAppPipelineEventPipelineLevel.PIPELINE;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private JsonNullable<List<String>> metrics = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE = "node";
  private JsonNullable<CIAppHostInfo> node = JsonNullable.<CIAppHostInfo>undefined();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private JsonNullable<Map<String, String>> parameters =
      JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_PARENT_PIPELINE = "parent_pipeline";
  private JsonNullable<CIAppPipelineEventParentPipeline> parentPipeline =
      JsonNullable.<CIAppPipelineEventParentPipeline>undefined();

  public static final String JSON_PROPERTY_PARTIAL_RETRY = "partial_retry";
  private Boolean partialRetry;

  public static final String JSON_PROPERTY_PIPELINE_ID = "pipeline_id";
  private String pipelineId;

  public static final String JSON_PROPERTY_PREVIOUS_ATTEMPT = "previous_attempt";
  private JsonNullable<CIAppPipelineEventPreviousPipeline> previousAttempt =
      JsonNullable.<CIAppPipelineEventPreviousPipeline>undefined();

  public static final String JSON_PROPERTY_QUEUE_TIME = "queue_time";
  private JsonNullable<Long> queueTime = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CIAppPipelineEventPipelineInProgressStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_UNIQUE_ID = "unique_id";
  private String uniqueId;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CIAppPipelineEventInProgressPipeline() {}

  @JsonCreator
  public CIAppPipelineEventInProgressPipeline(
      @JsonProperty(required = true, value = JSON_PROPERTY_LEVEL)
          CIAppPipelineEventPipelineLevel level,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARTIAL_RETRY) Boolean partialRetry,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) OffsetDateTime start,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          CIAppPipelineEventPipelineInProgressStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIQUE_ID) String uniqueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.level = level;
    this.unparsed |= !level.isValid();
    this.name = name;
    this.partialRetry = partialRetry;
    this.start = start;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.uniqueId = uniqueId;
    this.url = url;
  }

  public CIAppPipelineEventInProgressPipeline error(CIAppCIError error) {
    this.error = JsonNullable.<CIAppCIError>of(error);
    return this;
  }

  /**
   * Contains information of the CI error.
   *
   * @return error
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public CIAppCIError getError() {
    return error.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppCIError> getError_JsonNullable() {
    return error;
  }

  @JsonProperty(JSON_PROPERTY_ERROR)
  public void setError_JsonNullable(JsonNullable<CIAppCIError> error) {
    this.error = error;
  }

  public void setError(CIAppCIError error) {
    this.error = JsonNullable.<CIAppCIError>of(error);
  }

  public CIAppPipelineEventInProgressPipeline git(CIAppGitInfo git) {
    this.git = JsonNullable.<CIAppGitInfo>of(git);
    return this;
  }

  /**
   * If pipelines are triggered due to actions to a Git repository, then all payloads must contain
   * this. Note that either <code>tag</code> or <code>branch</code> has to be provided, but not
   * both.
   *
   * @return git
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public CIAppGitInfo getGit() {
    return git.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppGitInfo> getGit_JsonNullable() {
    return git;
  }

  @JsonProperty(JSON_PROPERTY_GIT)
  public void setGit_JsonNullable(JsonNullable<CIAppGitInfo> git) {
    this.git = git;
  }

  public void setGit(CIAppGitInfo git) {
    this.git = JsonNullable.<CIAppGitInfo>of(git);
  }

  public CIAppPipelineEventInProgressPipeline isManual(Boolean isManual) {
    this.isManual = JsonNullable.<Boolean>of(isManual);
    return this;
  }

  /**
   * Whether or not the pipeline was triggered manually by the user.
   *
   * @return isManual
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsManual() {
    return isManual.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsManual_JsonNullable() {
    return isManual;
  }

  @JsonProperty(JSON_PROPERTY_IS_MANUAL)
  public void setIsManual_JsonNullable(JsonNullable<Boolean> isManual) {
    this.isManual = isManual;
  }

  public void setIsManual(Boolean isManual) {
    this.isManual = JsonNullable.<Boolean>of(isManual);
  }

  public CIAppPipelineEventInProgressPipeline isResumed(Boolean isResumed) {
    this.isResumed = JsonNullable.<Boolean>of(isResumed);
    return this;
  }

  /**
   * Whether or not the pipeline was resumed after being blocked.
   *
   * @return isResumed
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsResumed() {
    return isResumed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_RESUMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsResumed_JsonNullable() {
    return isResumed;
  }

  @JsonProperty(JSON_PROPERTY_IS_RESUMED)
  public void setIsResumed_JsonNullable(JsonNullable<Boolean> isResumed) {
    this.isResumed = isResumed;
  }

  public void setIsResumed(Boolean isResumed) {
    this.isResumed = JsonNullable.<Boolean>of(isResumed);
  }

  public CIAppPipelineEventInProgressPipeline level(CIAppPipelineEventPipelineLevel level) {
    this.level = level;
    this.unparsed |= !level.isValid();
    return this;
  }

  /**
   * Used to distinguish between pipelines, stages, jobs, and steps.
   *
   * @return level
   */
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CIAppPipelineEventPipelineLevel getLevel() {
    return level;
  }

  public void setLevel(CIAppPipelineEventPipelineLevel level) {
    if (!level.isValid()) {
      this.unparsed = true;
    }
    this.level = level;
  }

  public CIAppPipelineEventInProgressPipeline metrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
    return this;
  }

  public CIAppPipelineEventInProgressPipeline addMetricsItem(String metricsItem) {
    if (this.metrics == null || !this.metrics.isPresent()) {
      this.metrics = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.metrics.get().add(metricsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of user-defined metrics. The metrics must follow the <code>key:value</code> pattern and
   * the value must be numeric.
   *
   * @return metrics
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getMetrics() {
    return metrics.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getMetrics_JsonNullable() {
    return metrics;
  }

  @JsonProperty(JSON_PROPERTY_METRICS)
  public void setMetrics_JsonNullable(JsonNullable<List<String>> metrics) {
    this.metrics = metrics;
  }

  public void setMetrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
  }

  public CIAppPipelineEventInProgressPipeline name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the pipeline. All pipeline runs for the builds should have the same name.
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

  public CIAppPipelineEventInProgressPipeline node(CIAppHostInfo node) {
    this.node = JsonNullable.<CIAppHostInfo>of(node);
    return this;
  }

  /**
   * Contains information of the host running the pipeline, stage, job, or step.
   *
   * @return node
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public CIAppHostInfo getNode() {
    return node.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppHostInfo> getNode_JsonNullable() {
    return node;
  }

  @JsonProperty(JSON_PROPERTY_NODE)
  public void setNode_JsonNullable(JsonNullable<CIAppHostInfo> node) {
    this.node = node;
  }

  public void setNode(CIAppHostInfo node) {
    this.node = JsonNullable.<CIAppHostInfo>of(node);
  }

  public CIAppPipelineEventInProgressPipeline parameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
    return this;
  }

  public CIAppPipelineEventInProgressPipeline putParametersItem(String key, String parametersItem) {
    if (this.parameters == null || !this.parameters.isPresent()) {
      this.parameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.parameters.get().put(key, parametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A map of key-value parameters or environment variables that were defined for the pipeline.
   *
   * @return parameters
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, String> getParameters() {
    return parameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, String>> getParameters_JsonNullable() {
    return parameters;
  }

  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  public void setParameters_JsonNullable(JsonNullable<Map<String, String>> parameters) {
    this.parameters = parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
  }

  public CIAppPipelineEventInProgressPipeline parentPipeline(
      CIAppPipelineEventParentPipeline parentPipeline) {
    this.parentPipeline = JsonNullable.<CIAppPipelineEventParentPipeline>of(parentPipeline);
    return this;
  }

  /**
   * If the pipeline is triggered as child of another pipeline, this should contain the details of
   * the parent pipeline.
   *
   * @return parentPipeline
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public CIAppPipelineEventParentPipeline getParentPipeline() {
    return parentPipeline.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_PIPELINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppPipelineEventParentPipeline> getParentPipeline_JsonNullable() {
    return parentPipeline;
  }

  @JsonProperty(JSON_PROPERTY_PARENT_PIPELINE)
  public void setParentPipeline_JsonNullable(
      JsonNullable<CIAppPipelineEventParentPipeline> parentPipeline) {
    this.parentPipeline = parentPipeline;
  }

  public void setParentPipeline(CIAppPipelineEventParentPipeline parentPipeline) {
    this.parentPipeline = JsonNullable.<CIAppPipelineEventParentPipeline>of(parentPipeline);
  }

  public CIAppPipelineEventInProgressPipeline partialRetry(Boolean partialRetry) {
    this.partialRetry = partialRetry;
    return this;
  }

  /**
   * Whether or not the pipeline was a partial retry of a previous attempt. A partial retry is one
   * which only runs a subset of the original jobs.
   *
   * @return partialRetry
   */
  @JsonProperty(JSON_PROPERTY_PARTIAL_RETRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getPartialRetry() {
    return partialRetry;
  }

  public void setPartialRetry(Boolean partialRetry) {
    this.partialRetry = partialRetry;
  }

  public CIAppPipelineEventInProgressPipeline pipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

  /**
   * Any ID used in the provider to identify the pipeline run even if it is not unique across
   * retries. If the <code>pipeline_id</code> is unique, then both <code>unique_id</code> and <code>
   * pipeline_id</code> can be set to the same value.
   *
   * @return pipelineId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPipelineId() {
    return pipelineId;
  }

  public void setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
  }

  public CIAppPipelineEventInProgressPipeline previousAttempt(
      CIAppPipelineEventPreviousPipeline previousAttempt) {
    this.previousAttempt = JsonNullable.<CIAppPipelineEventPreviousPipeline>of(previousAttempt);
    return this;
  }

  /**
   * If the pipeline is a retry, this should contain the details of the previous attempt.
   *
   * @return previousAttempt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public CIAppPipelineEventPreviousPipeline getPreviousAttempt() {
    return previousAttempt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppPipelineEventPreviousPipeline> getPreviousAttempt_JsonNullable() {
    return previousAttempt;
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS_ATTEMPT)
  public void setPreviousAttempt_JsonNullable(
      JsonNullable<CIAppPipelineEventPreviousPipeline> previousAttempt) {
    this.previousAttempt = previousAttempt;
  }

  public void setPreviousAttempt(CIAppPipelineEventPreviousPipeline previousAttempt) {
    this.previousAttempt = JsonNullable.<CIAppPipelineEventPreviousPipeline>of(previousAttempt);
  }

  public CIAppPipelineEventInProgressPipeline queueTime(Long queueTime) {
    this.queueTime = JsonNullable.<Long>of(queueTime);
    return this;
  }

  /**
   * The queue time in milliseconds, if applicable. minimum: 0
   *
   * @return queueTime
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getQueueTime() {
    return queueTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUEUE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getQueueTime_JsonNullable() {
    return queueTime;
  }

  @JsonProperty(JSON_PROPERTY_QUEUE_TIME)
  public void setQueueTime_JsonNullable(JsonNullable<Long> queueTime) {
    this.queueTime = queueTime;
  }

  public void setQueueTime(Long queueTime) {
    this.queueTime = JsonNullable.<Long>of(queueTime);
  }

  public CIAppPipelineEventInProgressPipeline start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Time when the pipeline run started (it should not include any queue time). The time format must
   * be RFC3339.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public CIAppPipelineEventInProgressPipeline status(
      CIAppPipelineEventPipelineInProgressStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The in progress status of the pipeline.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CIAppPipelineEventPipelineInProgressStatus getStatus() {
    return status;
  }

  public void setStatus(CIAppPipelineEventPipelineInProgressStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public CIAppPipelineEventInProgressPipeline tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public CIAppPipelineEventInProgressPipeline addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of user-defined tags. The tags must follow the <code>key:value</code> pattern.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public CIAppPipelineEventInProgressPipeline uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * UUID of the pipeline run. The ID has to be the same as the finished pipeline.
   *
   * @return uniqueId
   */
  @JsonProperty(JSON_PROPERTY_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public CIAppPipelineEventInProgressPipeline url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to look at the pipeline in the CI provider UI.
   *
   * @return url
   */
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return CIAppPipelineEventInProgressPipeline
   */
  @JsonAnySetter
  public CIAppPipelineEventInProgressPipeline putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CIAppPipelineEventInProgressPipeline object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventInProgressPipeline ciAppPipelineEventInProgressPipeline =
        (CIAppPipelineEventInProgressPipeline) o;
    return Objects.equals(this.error, ciAppPipelineEventInProgressPipeline.error)
        && Objects.equals(this.git, ciAppPipelineEventInProgressPipeline.git)
        && Objects.equals(this.isManual, ciAppPipelineEventInProgressPipeline.isManual)
        && Objects.equals(this.isResumed, ciAppPipelineEventInProgressPipeline.isResumed)
        && Objects.equals(this.level, ciAppPipelineEventInProgressPipeline.level)
        && Objects.equals(this.metrics, ciAppPipelineEventInProgressPipeline.metrics)
        && Objects.equals(this.name, ciAppPipelineEventInProgressPipeline.name)
        && Objects.equals(this.node, ciAppPipelineEventInProgressPipeline.node)
        && Objects.equals(this.parameters, ciAppPipelineEventInProgressPipeline.parameters)
        && Objects.equals(this.parentPipeline, ciAppPipelineEventInProgressPipeline.parentPipeline)
        && Objects.equals(this.partialRetry, ciAppPipelineEventInProgressPipeline.partialRetry)
        && Objects.equals(this.pipelineId, ciAppPipelineEventInProgressPipeline.pipelineId)
        && Objects.equals(
            this.previousAttempt, ciAppPipelineEventInProgressPipeline.previousAttempt)
        && Objects.equals(this.queueTime, ciAppPipelineEventInProgressPipeline.queueTime)
        && Objects.equals(this.start, ciAppPipelineEventInProgressPipeline.start)
        && Objects.equals(this.status, ciAppPipelineEventInProgressPipeline.status)
        && Objects.equals(this.tags, ciAppPipelineEventInProgressPipeline.tags)
        && Objects.equals(this.uniqueId, ciAppPipelineEventInProgressPipeline.uniqueId)
        && Objects.equals(this.url, ciAppPipelineEventInProgressPipeline.url)
        && Objects.equals(
            this.additionalProperties, ciAppPipelineEventInProgressPipeline.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        error,
        git,
        isManual,
        isResumed,
        level,
        metrics,
        name,
        node,
        parameters,
        parentPipeline,
        partialRetry,
        pipelineId,
        previousAttempt,
        queueTime,
        start,
        status,
        tags,
        uniqueId,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventInProgressPipeline {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    isManual: ").append(toIndentedString(isManual)).append("\n");
    sb.append("    isResumed: ").append(toIndentedString(isResumed)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    parentPipeline: ").append(toIndentedString(parentPipeline)).append("\n");
    sb.append("    partialRetry: ").append(toIndentedString(partialRetry)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    previousAttempt: ").append(toIndentedString(previousAttempt)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
