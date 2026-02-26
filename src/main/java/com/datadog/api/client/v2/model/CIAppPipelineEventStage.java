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
   * <p>Details of a CI stage.</p>
 */
@JsonPropertyOrder({
  CIAppPipelineEventStage.JSON_PROPERTY_DEPENDENCIES,
  CIAppPipelineEventStage.JSON_PROPERTY_END,
  CIAppPipelineEventStage.JSON_PROPERTY_ERROR,
  CIAppPipelineEventStage.JSON_PROPERTY_GIT,
  CIAppPipelineEventStage.JSON_PROPERTY_ID,
  CIAppPipelineEventStage.JSON_PROPERTY_LEVEL,
  CIAppPipelineEventStage.JSON_PROPERTY_METRICS,
  CIAppPipelineEventStage.JSON_PROPERTY_NAME,
  CIAppPipelineEventStage.JSON_PROPERTY_NODE,
  CIAppPipelineEventStage.JSON_PROPERTY_PARAMETERS,
  CIAppPipelineEventStage.JSON_PROPERTY_PIPELINE_NAME,
  CIAppPipelineEventStage.JSON_PROPERTY_PIPELINE_UNIQUE_ID,
  CIAppPipelineEventStage.JSON_PROPERTY_QUEUE_TIME,
  CIAppPipelineEventStage.JSON_PROPERTY_START,
  CIAppPipelineEventStage.JSON_PROPERTY_STATUS,
  CIAppPipelineEventStage.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppPipelineEventStage {
  @JsonIgnore
  public boolean unparsed = false;
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
  private CIAppPipelineEventStageLevel level = CIAppPipelineEventStageLevel.STAGE;

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

  public static final String JSON_PROPERTY_QUEUE_TIME = "queue_time";
  private JsonNullable<Long> queueTime = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_START = "start";
  private OffsetDateTime start;

  public static final String JSON_PROPERTY_STATUS = "status";
  private CIAppPipelineEventStageStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public CIAppPipelineEventStage() {}

  @JsonCreator
  public CIAppPipelineEventStage(
            @JsonProperty(required=true, value=JSON_PROPERTY_END)OffsetDateTime end,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_LEVEL)CIAppPipelineEventStageLevel level,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PIPELINE_NAME)String pipelineName,
            @JsonProperty(required=true, value=JSON_PROPERTY_PIPELINE_UNIQUE_ID)String pipelineUniqueId,
            @JsonProperty(required=true, value=JSON_PROPERTY_START)OffsetDateTime start,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)CIAppPipelineEventStageStatus status) {
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
  public CIAppPipelineEventStage dependencies(List<String> dependencies) {
    this.dependencies = JsonNullable.<List<String>>of(dependencies);
    return this;
  }
  public CIAppPipelineEventStage addDependenciesItem(String dependenciesItem) {
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
   * <p>A list of stage IDs that this stage depends on.</p>
   * @return dependencies
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public List<String> getDependencies() {
        return dependencies.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getDependencies_JsonNullable() {
    return dependencies;
  }
  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)public void setDependencies_JsonNullable(JsonNullable<List<String>> dependencies) {
    this.dependencies = dependencies;
  }
  public void setDependencies(List<String> dependencies) {
    this.dependencies = JsonNullable.<List<String>>of(dependencies);
  }
  public CIAppPipelineEventStage end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  /**
   * <p>Time when the stage run finished. The time format must be RFC3339.</p>
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
  public CIAppPipelineEventStage error(CIAppCIError error) {
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
  public CIAppPipelineEventStage git(CIAppGitInfo git) {
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
  public CIAppPipelineEventStage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>UUID for the stage. It has to be unique at least in the pipeline scope.</p>
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
  public CIAppPipelineEventStage level(CIAppPipelineEventStageLevel level) {
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
      public CIAppPipelineEventStageLevel getLevel() {
        return level;
      }
  public void setLevel(CIAppPipelineEventStageLevel level) {
    if (!level.isValid()) {
        this.unparsed = true;
    }
    this.level = level;
  }
  public CIAppPipelineEventStage metrics(List<String> metrics) {
    this.metrics = JsonNullable.<List<String>>of(metrics);
    return this;
  }
  public CIAppPipelineEventStage addMetricsItem(String metricsItem) {
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
  public CIAppPipelineEventStage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name for the stage.</p>
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
  public CIAppPipelineEventStage node(CIAppHostInfo node) {
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
  public CIAppPipelineEventStage parameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
    return this;
  }
  public CIAppPipelineEventStage putParametersItem(String key, String parametersItem) {
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
  public CIAppPipelineEventStage pipelineName(String pipelineName) {
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
  public CIAppPipelineEventStage pipelineUniqueId(String pipelineUniqueId) {
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
  public CIAppPipelineEventStage queueTime(Long queueTime) {
    this.queueTime = JsonNullable.<Long>of(queueTime);
    return this;
  }

  /**
   * <p>The queue time in milliseconds, if applicable.</p>
   * minimum: 0
   * @return queueTime
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getQueueTime() {
        return queueTime.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_QUEUE_TIME)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getQueueTime_JsonNullable() {
    return queueTime;
  }
  @JsonProperty(JSON_PROPERTY_QUEUE_TIME)public void setQueueTime_JsonNullable(JsonNullable<Long> queueTime) {
    this.queueTime = queueTime;
  }
  public void setQueueTime(Long queueTime) {
    this.queueTime = JsonNullable.<Long>of(queueTime);
  }
  public CIAppPipelineEventStage start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * <p>Time when the stage run started (it should not include any queue time). The time format must be RFC3339.</p>
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
  public CIAppPipelineEventStage status(CIAppPipelineEventStageStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The final status of the stage.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CIAppPipelineEventStageStatus getStatus() {
        return status;
      }
  public void setStatus(CIAppPipelineEventStageStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public CIAppPipelineEventStage tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }
  public CIAppPipelineEventStage addTagsItem(String tagsItem) {
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
   * @return CIAppPipelineEventStage
   */
  @JsonAnySetter
  public CIAppPipelineEventStage putAdditionalProperty(String key, Object value) {
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
   * Return true if this CIAppPipelineEventStage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppPipelineEventStage ciAppPipelineEventStage = (CIAppPipelineEventStage) o;
    return Objects.equals(this.dependencies, ciAppPipelineEventStage.dependencies) && Objects.equals(this.end, ciAppPipelineEventStage.end) && Objects.equals(this.error, ciAppPipelineEventStage.error) && Objects.equals(this.git, ciAppPipelineEventStage.git) && Objects.equals(this.id, ciAppPipelineEventStage.id) && Objects.equals(this.level, ciAppPipelineEventStage.level) && Objects.equals(this.metrics, ciAppPipelineEventStage.metrics) && Objects.equals(this.name, ciAppPipelineEventStage.name) && Objects.equals(this.node, ciAppPipelineEventStage.node) && Objects.equals(this.parameters, ciAppPipelineEventStage.parameters) && Objects.equals(this.pipelineName, ciAppPipelineEventStage.pipelineName) && Objects.equals(this.pipelineUniqueId, ciAppPipelineEventStage.pipelineUniqueId) && Objects.equals(this.queueTime, ciAppPipelineEventStage.queueTime) && Objects.equals(this.start, ciAppPipelineEventStage.start) && Objects.equals(this.status, ciAppPipelineEventStage.status) && Objects.equals(this.tags, ciAppPipelineEventStage.tags) && Objects.equals(this.additionalProperties, ciAppPipelineEventStage.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dependencies,end,error,git,id,level,metrics,name,node,parameters,pipelineName,pipelineUniqueId,queueTime,start,status,tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppPipelineEventStage {\n");
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
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
