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

/** Details of a CI job. */
@JsonPropertyOrder({
  CIAppPipelineEventJob.JSON_PROPERTY_DEPENDENCIES,
  CIAppPipelineEventJob.JSON_PROPERTY_END,
  CIAppPipelineEventJob.JSON_PROPERTY_ERROR,
  CIAppPipelineEventJob.JSON_PROPERTY_GIT,
  CIAppPipelineEventJob.JSON_PROPERTY_ID,
  CIAppPipelineEventJob.JSON_PROPERTY_LEVEL,
  CIAppPipelineEventJob.JSON_PROPERTY_METRICS,
  CIAppPipelineEventJob.JSON_PROPERTY_NAME,
  CIAppPipelineEventJob.JSON_PROPERTY_NODE,
  CIAppPipelineEventJob.JSON_PROPERTY_PARAMETERS,
  CIAppPipelineEventJob.JSON_PROPERTY_PIPELINE_NAME,
  CIAppPipelineEventJob.JSON_PROPERTY_PIPELINE_UNIQUE_ID,
  CIAppPipelineEventJob.JSON_PROPERTY_QUEUE_TIME,
  CIAppPipelineEventJob.JSON_PROPERTY_STAGE_ID,
  CIAppPipelineEventJob.JSON_PROPERTY_STAGE_NAME,
  CIAppPipelineEventJob.JSON_PROPERTY_START,
  CIAppPipelineEventJob.JSON_PROPERTY_STATUS,
  CIAppPipelineEventJob.JSON_PROPERTY_TAGS,
  CIAppPipelineEventJob.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventJob {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEPENDENCIES = "dependencies";
  private JsonNullable<List<String>> dependencies = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<CIAppCIError> error = JsonNullable.<CIAppCIError>undefined();

  public static final String JSON_PROPERTY_GIT = "git";
  private JsonNullable<CIAppGitInfo> git = JsonNullable.<CIAppGitInfo>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private CIAppPipelineEventJobLevel level = CIAppPipelineEventJobLevel.JOB;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private JsonNullable<List<String>> metrics = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE = "node";
  private JsonNullable<CIAppHostInfo> node = JsonNullable.<CIAppHostInfo>undefined();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private JsonNullable<Map<String, String>> parameters =
      JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_PIPELINE_NAME = "pipeline_name";
  private String pipelineName;

  public static final String JSON_PROPERTY_PIPELINE_UNIQUE_ID = "pipeline_unique_id";
  private String pipelineUniqueId;

  public static final String JSON_PROPERTY_QUEUE_TIME = "queue_time";
  private JsonNullable<Long> queueTime = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_STAGE_ID = "stage_id";
  private JsonNullable<String> stageId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STAGE_NAME = "stage_name";
  private JsonNullable<String> stageName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CIAppPipelineEventJobStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CIAppPipelineEventJob() {}

  @JsonCreator
  public CIAppPipelineEventJob(
      @JsonProperty(required = true, value = JSON_PROPERTY_END) OffsetDateTime end,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_LEVEL) CIAppPipelineEventJobLevel level,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PIPELINE_NAME) String pipelineName,
      @JsonProperty(required = true, value = JSON_PROPERTY_PIPELINE_UNIQUE_ID)
          String pipelineUniqueId,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) OffsetDateTime start,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          CIAppPipelineEventJobStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_URL) String url) {
    this.end = end;
    this.id = id;
    this.level = level;
    this.unparsed |= !level.isValid();
    this.name = name;
    this.pipelineName = pipelineName;
    this.pipelineUniqueId = pipelineUniqueId;
    this.start = start;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.url = url;
  }

  public CIAppPipelineEventJob dependencies(List<String> dependencies) {
    this.dependencies = JsonNullable.<List<String>>of(dependencies);
    return this;
  }

  public CIAppPipelineEventJob addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null || !this.dependencies.isPresent()) {
      this.dependencies = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.dependencies.get().add(dependenciesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * A list of job IDs that this job depends on.
   *
   * @return dependencies
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getDependencies() {
    return dependencies.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getDependencies_JsonNullable() {
    return dependencies;
  }

  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  public void setDependencies_JsonNullable(JsonNullable<List<String>> dependencies) {
    this.dependencies = dependencies;
  }

  public void setDependencies(List<String> dependencies) {
    this.dependencies = JsonNullable.<List<String>>of(dependencies);
  }

  public CIAppPipelineEventJob end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * Time when the job run finished. The time format must be RFC3339.
   *
   * @return end
   */
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public CIAppPipelineEventJob error(CIAppCIError error) {
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

  public CIAppPipelineEventJob git(CIAppGitInfo git) {
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

  public CIAppPipelineEventJob id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The UUID for the job. It has to be unique within each pipeline execution.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CIAppPipelineEventJob level(CIAppPipelineEventJobLevel level) {
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
  public CIAppPipelineEventJobLevel getLevel() {
    return level;
  }

  public void setLevel(CIAppPipelineEventJobLevel level) {
    if (!level.isValid()) {
      this.unparsed = true;
    }
    this.level = level;
  }

  public CIAppPipelineEventJob metrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
    return this;
  }

  public CIAppPipelineEventJob addMetricsItem(String metricsItem) {
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

  public CIAppPipelineEventJob name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for the job.
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

  public CIAppPipelineEventJob node(CIAppHostInfo node) {
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

  public CIAppPipelineEventJob parameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
    return this;
  }

  public CIAppPipelineEventJob putParametersItem(String key, String parametersItem) {
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

  public CIAppPipelineEventJob pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  /**
   * The parent pipeline name.
   *
   * @return pipelineName
   */
  @JsonProperty(JSON_PROPERTY_PIPELINE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPipelineName() {
    return pipelineName;
  }

  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }

  public CIAppPipelineEventJob pipelineUniqueId(String pipelineUniqueId) {
    this.pipelineUniqueId = pipelineUniqueId;
    return this;
  }

  /**
   * The parent pipeline UUID.
   *
   * @return pipelineUniqueId
   */
  @JsonProperty(JSON_PROPERTY_PIPELINE_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPipelineUniqueId() {
    return pipelineUniqueId;
  }

  public void setPipelineUniqueId(String pipelineUniqueId) {
    this.pipelineUniqueId = pipelineUniqueId;
  }

  public CIAppPipelineEventJob queueTime(Long queueTime) {
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

  public CIAppPipelineEventJob stageId(String stageId) {
    this.stageId = JsonNullable.<String>of(stageId);
    return this;
  }

  /**
   * The parent stage UUID (if applicable).
   *
   * @return stageId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getStageId() {
    return stageId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStageId_JsonNullable() {
    return stageId;
  }

  @JsonProperty(JSON_PROPERTY_STAGE_ID)
  public void setStageId_JsonNullable(JsonNullable<String> stageId) {
    this.stageId = stageId;
  }

  public void setStageId(String stageId) {
    this.stageId = JsonNullable.<String>of(stageId);
  }

  public CIAppPipelineEventJob stageName(String stageName) {
    this.stageName = JsonNullable.<String>of(stageName);
    return this;
  }

  /**
   * The parent stage name (if applicable).
   *
   * @return stageName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getStageName() {
    return stageName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStageName_JsonNullable() {
    return stageName;
  }

  @JsonProperty(JSON_PROPERTY_STAGE_NAME)
  public void setStageName_JsonNullable(JsonNullable<String> stageName) {
    this.stageName = stageName;
  }

  public void setStageName(String stageName) {
    this.stageName = JsonNullable.<String>of(stageName);
  }

  public CIAppPipelineEventJob start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Time when the job run instance started (it should not include any queue time). The time format
   * must be RFC3339.
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

  public CIAppPipelineEventJob status(CIAppPipelineEventJobStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The final status of the job.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CIAppPipelineEventJobStatus getStatus() {
    return status;
  }

  public void setStatus(CIAppPipelineEventJobStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public CIAppPipelineEventJob tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public CIAppPipelineEventJob addTagsItem(String tagsItem) {
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

  public CIAppPipelineEventJob url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL to look at the job in the CI provider UI.
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
   * @return CIAppPipelineEventJob
   */
  @JsonAnySetter
  public CIAppPipelineEventJob putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CIAppPipelineEventJob object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventJob ciAppPipelineEventJob = (CIAppPipelineEventJob) o;
    return Objects.equals(this.dependencies, ciAppPipelineEventJob.dependencies)
        && Objects.equals(this.end, ciAppPipelineEventJob.end)
        && Objects.equals(this.error, ciAppPipelineEventJob.error)
        && Objects.equals(this.git, ciAppPipelineEventJob.git)
        && Objects.equals(this.id, ciAppPipelineEventJob.id)
        && Objects.equals(this.level, ciAppPipelineEventJob.level)
        && Objects.equals(this.metrics, ciAppPipelineEventJob.metrics)
        && Objects.equals(this.name, ciAppPipelineEventJob.name)
        && Objects.equals(this.node, ciAppPipelineEventJob.node)
        && Objects.equals(this.parameters, ciAppPipelineEventJob.parameters)
        && Objects.equals(this.pipelineName, ciAppPipelineEventJob.pipelineName)
        && Objects.equals(this.pipelineUniqueId, ciAppPipelineEventJob.pipelineUniqueId)
        && Objects.equals(this.queueTime, ciAppPipelineEventJob.queueTime)
        && Objects.equals(this.stageId, ciAppPipelineEventJob.stageId)
        && Objects.equals(this.stageName, ciAppPipelineEventJob.stageName)
        && Objects.equals(this.start, ciAppPipelineEventJob.start)
        && Objects.equals(this.status, ciAppPipelineEventJob.status)
        && Objects.equals(this.tags, ciAppPipelineEventJob.tags)
        && Objects.equals(this.url, ciAppPipelineEventJob.url)
        && Objects.equals(this.additionalProperties, ciAppPipelineEventJob.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dependencies,
        end,
        error,
        git,
        id,
        level,
        metrics,
        name,
        node,
        parameters,
        pipelineName,
        pipelineUniqueId,
        queueTime,
        stageId,
        stageName,
        start,
        status,
        tags,
        url,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventJob {\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    pipelineUniqueId: ").append(toIndentedString(pipelineUniqueId)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
    sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
    sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
