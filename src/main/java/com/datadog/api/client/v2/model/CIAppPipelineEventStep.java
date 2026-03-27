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
   * <p>Details of a CI step.</p>
 */
@JsonPropertyOrder({
  CIAppPipelineEventStep.JSON_PROPERTY_END,
  CIAppPipelineEventStep.JSON_PROPERTY_ERROR,
  CIAppPipelineEventStep.JSON_PROPERTY_GIT,
  CIAppPipelineEventStep.JSON_PROPERTY_ID,
  CIAppPipelineEventStep.JSON_PROPERTY_JOB_ID,
  CIAppPipelineEventStep.JSON_PROPERTY_JOB_NAME,
  CIAppPipelineEventStep.JSON_PROPERTY_LEVEL,
  CIAppPipelineEventStep.JSON_PROPERTY_METRICS,
  CIAppPipelineEventStep.JSON_PROPERTY_NAME,
  CIAppPipelineEventStep.JSON_PROPERTY_NODE,
  CIAppPipelineEventStep.JSON_PROPERTY_PARAMETERS,
  CIAppPipelineEventStep.JSON_PROPERTY_PIPELINE_NAME,
  CIAppPipelineEventStep.JSON_PROPERTY_PIPELINE_UNIQUE_ID,
  CIAppPipelineEventStep.JSON_PROPERTY_STAGE_ID,
  CIAppPipelineEventStep.JSON_PROPERTY_STAGE_NAME,
  CIAppPipelineEventStep.JSON_PROPERTY_START,
  CIAppPipelineEventStep.JSON_PROPERTY_STATUS,
  CIAppPipelineEventStep.JSON_PROPERTY_TAGS,
  CIAppPipelineEventStep.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventStep {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private OffsetDateTime end;

  public static final String JSON_PROPERTY_ERROR = "error";
  private JsonNullable<CIAppCIError> error = JsonNullable.<CIAppCIError>undefined();

  public static final String JSON_PROPERTY_GIT = "git";
  private JsonNullable<CIAppGitInfo> git = JsonNullable.<CIAppGitInfo>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JOB_ID = "job_id";
  private JsonNullable<String> jobId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_NAME = "job_name";
  private JsonNullable<String> jobName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEVEL = "level";
  private CIAppPipelineEventStepLevel level = CIAppPipelineEventStepLevel.STEP;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private JsonNullable<List<String>> metrics = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE = "node";
  private JsonNullable<CIAppHostInfo> node = JsonNullable.<CIAppHostInfo>undefined();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private JsonNullable<Map<String, String>> parameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_PIPELINE_NAME = "pipeline_name";
  private String pipelineName;

  public static final String JSON_PROPERTY_PIPELINE_UNIQUE_ID = "pipeline_unique_id";
  private String pipelineUniqueId;

  public static final String JSON_PROPERTY_STAGE_ID = "stage_id";
  private JsonNullable<String> stageId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STAGE_NAME = "stage_name";
  private JsonNullable<String> stageName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CIAppPipelineEventStepStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public CIAppPipelineEventStep() {}

  @JsonCreator
  public CIAppPipelineEventStep(
            @JsonProperty(required=true, value=JSON_PROPERTY_END)OffsetDateTime end,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_LEVEL)CIAppPipelineEventStepLevel level,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PIPELINE_NAME)String pipelineName,
            @JsonProperty(required=true, value=JSON_PROPERTY_PIPELINE_UNIQUE_ID)String pipelineUniqueId,
            @JsonProperty(required=true, value=JSON_PROPERTY_START)OffsetDateTime start,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)CIAppPipelineEventStepStatus status) {
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
  }
  public CIAppPipelineEventStep end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * <p>Time when the step run finished. The time format must be RFC3339.</p>
   * @return end
  **/
      @JsonProperty(JSON_PROPERTY_END)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getEnd() {
        return end;
      }
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }
  public CIAppPipelineEventStep error(CIAppCIError error) {
    this.error = JsonNullable.<CIAppCIError>of(error);
    return this;
  }

  /**
   * <p>Contains information of the CI error.</p>
   * @return error
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public CIAppCIError getError() {
        return error.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppCIError> getError_JsonNullable() {
    return error;
  }
  @JsonProperty(JSON_PROPERTY_ERROR)public void setError_JsonNullable(JsonNullable<CIAppCIError> error) {
    this.error = error;
  }
  public void setError(CIAppCIError error) {
    this.error = JsonNullable.<CIAppCIError>of(error);
  }
  public CIAppPipelineEventStep git(CIAppGitInfo git) {
    this.git = JsonNullable.<CIAppGitInfo>of(git);
    return this;
  }

  /**
   * <p>If pipelines are triggered due to actions to a Git repository, then all payloads must contain this.
   * Note that either <code>tag</code> or <code>branch</code> has to be provided, but not both.</p>
   * @return git
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public CIAppGitInfo getGit() {
        return git.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_GIT)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppGitInfo> getGit_JsonNullable() {
    return git;
  }
  @JsonProperty(JSON_PROPERTY_GIT)public void setGit_JsonNullable(JsonNullable<CIAppGitInfo> git) {
    this.git = git;
  }
  public void setGit(CIAppGitInfo git) {
    this.git = JsonNullable.<CIAppGitInfo>of(git);
  }
  public CIAppPipelineEventStep id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>UUID for the step. It has to be unique within each pipeline execution.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public CIAppPipelineEventStep jobId(String jobId) {
    this.jobId = JsonNullable.<String>of(jobId);
    return this;
  }

  /**
   * <p>The parent job UUID (if applicable).</p>
   * @return jobId
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getJobId() {
        return jobId.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_JOB_ID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getJobId_JsonNullable() {
    return jobId;
  }
  @JsonProperty(JSON_PROPERTY_JOB_ID)public void setJobId_JsonNullable(JsonNullable<String> jobId) {
    this.jobId = jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = JsonNullable.<String>of(jobId);
  }
  public CIAppPipelineEventStep jobName(String jobName) {
    this.jobName = JsonNullable.<String>of(jobName);
    return this;
  }

  /**
   * <p>The parent job name (if applicable).</p>
   * @return jobName
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getJobName() {
        return jobName.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getJobName_JsonNullable() {
    return jobName;
  }
  @JsonProperty(JSON_PROPERTY_JOB_NAME)public void setJobName_JsonNullable(JsonNullable<String> jobName) {
    this.jobName = jobName;
  }
  public void setJobName(String jobName) {
    this.jobName = JsonNullable.<String>of(jobName);
  }
  public CIAppPipelineEventStep level(CIAppPipelineEventStepLevel level) {
    this.level = level;
    this.unparsed |= !level.isValid();
    return this;
  }

  /**
   * <p>Used to distinguish between pipelines, stages, jobs and steps.</p>
   * @return level
  **/
      @JsonProperty(JSON_PROPERTY_LEVEL)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CIAppPipelineEventStepLevel getLevel() {
        return level;
      }
  public void setLevel(CIAppPipelineEventStepLevel level) {
    if (!level.isValid()) {
        this.unparsed = true;
    }
    this.level = level;
  }
  public CIAppPipelineEventStep metrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
    return this;
  }
  public CIAppPipelineEventStep addMetricsItem(String metricsItem) {
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
   * <p>A list of user-defined metrics. The metrics must follow the <code>key:value</code> pattern and the value must be numeric.</p>
   * @return metrics
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getMetrics() {
        return metrics.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getMetrics_JsonNullable() {
    return metrics;
  }
  @JsonProperty(JSON_PROPERTY_METRICS)public void setMetrics_JsonNullable(JsonNullable<List<String>> metrics) {
    this.metrics = metrics;
  }
  public void setMetrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
  }
  public CIAppPipelineEventStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name for the step.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CIAppPipelineEventStep node(CIAppHostInfo node) {
    this.node = JsonNullable.<CIAppHostInfo>of(node);
    return this;
  }

  /**
   * <p>Contains information of the host running the pipeline, stage, job, or step.</p>
   * @return node
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public CIAppHostInfo getNode() {
        return node.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_NODE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<CIAppHostInfo> getNode_JsonNullable() {
    return node;
  }
  @JsonProperty(JSON_PROPERTY_NODE)public void setNode_JsonNullable(JsonNullable<CIAppHostInfo> node) {
    this.node = node;
  }
  public void setNode(CIAppHostInfo node) {
    this.node = JsonNullable.<CIAppHostInfo>of(node);
  }
  public CIAppPipelineEventStep parameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
    return this;
  }
  public CIAppPipelineEventStep putParametersItem(String key, String parametersItem) {
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
   * <p>A map of key-value parameters or environment variables that were defined for the pipeline.</p>
   * @return parameters
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Map<String, String> getParameters() {
        return parameters.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, String>> getParameters_JsonNullable() {
    return parameters;
  }
  @JsonProperty(JSON_PROPERTY_PARAMETERS)public void setParameters_JsonNullable(JsonNullable<Map<String, String>> parameters) {
    this.parameters = parameters;
  }
  public void setParameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
  }
  public CIAppPipelineEventStep pipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
    return this;
  }

  /**
   * <p>The parent pipeline name.</p>
   * @return pipelineName
  **/
      @JsonProperty(JSON_PROPERTY_PIPELINE_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPipelineName() {
        return pipelineName;
      }
  public void setPipelineName(String pipelineName) {
    this.pipelineName = pipelineName;
  }
  public CIAppPipelineEventStep pipelineUniqueId(String pipelineUniqueId) {
    this.pipelineUniqueId = pipelineUniqueId;
    return this;
  }

  /**
   * <p>The parent pipeline UUID.</p>
   * @return pipelineUniqueId
  **/
      @JsonProperty(JSON_PROPERTY_PIPELINE_UNIQUE_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPipelineUniqueId() {
        return pipelineUniqueId;
      }
  public void setPipelineUniqueId(String pipelineUniqueId) {
    this.pipelineUniqueId = pipelineUniqueId;
  }
  public CIAppPipelineEventStep stageId(String stageId) {
    this.stageId = JsonNullable.<String>of(stageId);
    return this;
  }

  /**
   * <p>The parent stage UUID (if applicable).</p>
   * @return stageId
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getStageId() {
        return stageId.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_STAGE_ID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStageId_JsonNullable() {
    return stageId;
  }
  @JsonProperty(JSON_PROPERTY_STAGE_ID)public void setStageId_JsonNullable(JsonNullable<String> stageId) {
    this.stageId = stageId;
  }
  public void setStageId(String stageId) {
    this.stageId = JsonNullable.<String>of(stageId);
  }
  public CIAppPipelineEventStep stageName(String stageName) {
    this.stageName = JsonNullable.<String>of(stageName);
    return this;
  }

  /**
   * <p>The parent stage name (if applicable).</p>
   * @return stageName
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getStageName() {
        return stageName.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_STAGE_NAME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStageName_JsonNullable() {
    return stageName;
  }
  @JsonProperty(JSON_PROPERTY_STAGE_NAME)public void setStageName_JsonNullable(JsonNullable<String> stageName) {
    this.stageName = stageName;
  }
  public void setStageName(String stageName) {
    this.stageName = JsonNullable.<String>of(stageName);
  }
  public CIAppPipelineEventStep start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Time when the step run started. The time format must be RFC3339.</p>
   * @return start
  **/
      @JsonProperty(JSON_PROPERTY_START)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getStart() {
        return start;
      }
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }
  public CIAppPipelineEventStep status(CIAppPipelineEventStepStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The final status of the step.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CIAppPipelineEventStepStatus getStatus() {
        return status;
      }
  public void setStatus(CIAppPipelineEventStepStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public CIAppPipelineEventStep tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }
  public CIAppPipelineEventStep addTagsItem(String tagsItem) {
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
   * <p>A list of user-defined tags. The tags must follow the <code>key:value</code> pattern.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getTags() {
        return tags.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }
  @JsonProperty(JSON_PROPERTY_TAGS)public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }
  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }
  public CIAppPipelineEventStep url(String url) {
    this.url = JsonNullable.<String>of(url);
    return this;
  }

  /**
   * <p>The URL to look at the step in the CI provider UI.</p>
   * @return url
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getUrl() {
        return url.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  @JsonProperty(JSON_PROPERTY_URL)public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }
  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
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
   * @return CIAppPipelineEventStep
   */
  @JsonAnySetter
  public CIAppPipelineEventStep putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppPipelineEventStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventStep ciAppPipelineEventStep = (CIAppPipelineEventStep) o;
    return Objects.equals(this.end, ciAppPipelineEventStep.end) && Objects.equals(this.error, ciAppPipelineEventStep.error) && Objects.equals(this.git, ciAppPipelineEventStep.git) && Objects.equals(this.id, ciAppPipelineEventStep.id) && Objects.equals(this.jobId, ciAppPipelineEventStep.jobId) && Objects.equals(this.jobName, ciAppPipelineEventStep.jobName) && Objects.equals(this.level, ciAppPipelineEventStep.level) && Objects.equals(this.metrics, ciAppPipelineEventStep.metrics) && Objects.equals(this.name, ciAppPipelineEventStep.name) && Objects.equals(this.node, ciAppPipelineEventStep.node) && Objects.equals(this.parameters, ciAppPipelineEventStep.parameters) && Objects.equals(this.pipelineName, ciAppPipelineEventStep.pipelineName) && Objects.equals(this.pipelineUniqueId, ciAppPipelineEventStep.pipelineUniqueId) && Objects.equals(this.stageId, ciAppPipelineEventStep.stageId) && Objects.equals(this.stageName, ciAppPipelineEventStep.stageName) && Objects.equals(this.start, ciAppPipelineEventStep.start) && Objects.equals(this.status, ciAppPipelineEventStep.status) && Objects.equals(this.tags, ciAppPipelineEventStep.tags) && Objects.equals(this.url, ciAppPipelineEventStep.url) && Objects.equals(this.additionalProperties, ciAppPipelineEventStep.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(end,error,git,id,jobId,jobName,level,metrics,name,node,parameters,pipelineName,pipelineUniqueId,stageId,stageName,start,status,tags,url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventStep {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
    sb.append("    pipelineUniqueId: ").append(toIndentedString(pipelineUniqueId)).append("\n");
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
