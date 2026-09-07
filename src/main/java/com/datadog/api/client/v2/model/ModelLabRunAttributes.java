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

/** Attributes of a Model Lab run. */
@JsonPropertyOrder({
  ModelLabRunAttributes.JSON_PROPERTY_COMPLETED_AT,
  ModelLabRunAttributes.JSON_PROPERTY_CREATED_AT,
  ModelLabRunAttributes.JSON_PROPERTY_DELETED_AT,
  ModelLabRunAttributes.JSON_PROPERTY_DESCENDANT_MATCH,
  ModelLabRunAttributes.JSON_PROPERTY_DESCRIPTION,
  ModelLabRunAttributes.JSON_PROPERTY_DURATION,
  ModelLabRunAttributes.JSON_PROPERTY_EXTERNAL_URL,
  ModelLabRunAttributes.JSON_PROPERTY_HAS_CHILDREN,
  ModelLabRunAttributes.JSON_PROPERTY_IS_PINNED,
  ModelLabRunAttributes.JSON_PROPERTY_METRIC_SUMMARIES,
  ModelLabRunAttributes.JSON_PROPERTY_MLFLOW_ARTIFACT_LOCATION,
  ModelLabRunAttributes.JSON_PROPERTY_NAME,
  ModelLabRunAttributes.JSON_PROPERTY_OWNER_ID,
  ModelLabRunAttributes.JSON_PROPERTY_PARAMS,
  ModelLabRunAttributes.JSON_PROPERTY_PROJECT_ID,
  ModelLabRunAttributes.JSON_PROPERTY_STARTED_AT,
  ModelLabRunAttributes.JSON_PROPERTY_STATUS,
  ModelLabRunAttributes.JSON_PROPERTY_TAGS,
  ModelLabRunAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ModelLabRunAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private JsonNullable<OffsetDateTime> deletedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DESCENDANT_MATCH = "descendant_match";
  private Boolean descendantMatch;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private JsonNullable<Double> duration = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_URL = "external_url";
  private JsonNullable<String> externalUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_CHILDREN = "has_children";
  private Boolean hasChildren;

  public static final String JSON_PROPERTY_IS_PINNED = "is_pinned";
  private Boolean isPinned;

  public static final String JSON_PROPERTY_METRIC_SUMMARIES = "metric_summaries";
  private List<ModelLabMetricSummary> metricSummaries = new ArrayList<>();

  public static final String JSON_PROPERTY_MLFLOW_ARTIFACT_LOCATION = "mlflow_artifact_location";
  private String mlflowArtifactLocation;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER_ID = "owner_id";
  private JsonNullable<String> ownerId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAMS = "params";
  private List<ModelLabRunParam> params = new ArrayList<>();

  public static final String JSON_PROPERTY_PROJECT_ID = "project_id";
  private Long projectId;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ModelLabRunStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<ModelLabTag> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ModelLabRunAttributes() {}

  @JsonCreator
  public ModelLabRunAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCENDANT_MATCH)
          Boolean descendantMatch,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_HAS_CHILDREN) Boolean hasChildren,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PINNED) Boolean isPinned,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_SUMMARIES)
          List<ModelLabMetricSummary> metricSummaries,
      @JsonProperty(required = true, value = JSON_PROPERTY_MLFLOW_ARTIFACT_LOCATION)
          String mlflowArtifactLocation,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARAMS) List<ModelLabRunParam> params,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT_ID) Long projectId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) ModelLabRunStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<ModelLabTag> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.descendantMatch = descendantMatch;
    this.description = description;
    this.hasChildren = hasChildren;
    this.isPinned = isPinned;
    this.metricSummaries = metricSummaries;
    for (ModelLabMetricSummary item : metricSummaries) {
      this.unparsed |= item.unparsed;
    }
    this.mlflowArtifactLocation = mlflowArtifactLocation;
    this.name = name;
    this.params = params;
    if (params != null) {
      for (ModelLabRunParam item : params) {
        this.unparsed |= item.unparsed;
      }
    }
    this.projectId = projectId;
    this.startedAt = startedAt;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.tags = tags;
    for (ModelLabTag item : tags) {
      this.unparsed |= item.unparsed;
    }
    this.updatedAt = updatedAt;
  }

  public ModelLabRunAttributes completedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.<OffsetDateTime>of(completedAt);
    return this;
  }

  /**
   * The date and time the run completed.
   *
   * @return completedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getCompletedAt() {
    return completedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getCompletedAt_JsonNullable() {
    return completedAt;
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  public void setCompletedAt_JsonNullable(JsonNullable<OffsetDateTime> completedAt) {
    this.completedAt = completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.<OffsetDateTime>of(completedAt);
  }

  public ModelLabRunAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time the run was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ModelLabRunAttributes deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
    return this;
  }

  /**
   * The date and time the run was soft-deleted.
   *
   * @return deletedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getDeletedAt() {
    return deletedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getDeletedAt_JsonNullable() {
    return deletedAt;
  }

  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  public void setDeletedAt_JsonNullable(JsonNullable<OffsetDateTime> deletedAt) {
    this.deletedAt = deletedAt;
  }

  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = JsonNullable.<OffsetDateTime>of(deletedAt);
  }

  public ModelLabRunAttributes descendantMatch(Boolean descendantMatch) {
    this.descendantMatch = descendantMatch;
    return this;
  }

  /**
   * Whether a descendant run matched the applied filters.
   *
   * @return descendantMatch
   */
  @JsonProperty(JSON_PROPERTY_DESCENDANT_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDescendantMatch() {
    return descendantMatch;
  }

  public void setDescendantMatch(Boolean descendantMatch) {
    this.descendantMatch = descendantMatch;
  }

  public ModelLabRunAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the run.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModelLabRunAttributes duration(Double duration) {
    this.duration = JsonNullable.<Double>of(duration);
    return this;
  }

  /**
   * The duration of the run in seconds.
   *
   * @return duration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getDuration() {
    return duration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getDuration_JsonNullable() {
    return duration;
  }

  @JsonProperty(JSON_PROPERTY_DURATION)
  public void setDuration_JsonNullable(JsonNullable<Double> duration) {
    this.duration = duration;
  }

  public void setDuration(Double duration) {
    this.duration = JsonNullable.<Double>of(duration);
  }

  public ModelLabRunAttributes externalUrl(String externalUrl) {
    this.externalUrl = JsonNullable.<String>of(externalUrl);
    return this;
  }

  /**
   * An optional external URL associated with the run.
   *
   * @return externalUrl
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getExternalUrl() {
    return externalUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExternalUrl_JsonNullable() {
    return externalUrl;
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_URL)
  public void setExternalUrl_JsonNullable(JsonNullable<String> externalUrl) {
    this.externalUrl = externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = JsonNullable.<String>of(externalUrl);
  }

  public ModelLabRunAttributes hasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
    return this;
  }

  /**
   * Whether the run has child runs.
   *
   * @return hasChildren
   */
  @JsonProperty(JSON_PROPERTY_HAS_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getHasChildren() {
    return hasChildren;
  }

  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }

  public ModelLabRunAttributes isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * Whether the run is pinned by the current user.
   *
   * @return isPinned
   */
  @JsonProperty(JSON_PROPERTY_IS_PINNED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public ModelLabRunAttributes metricSummaries(List<ModelLabMetricSummary> metricSummaries) {
    this.metricSummaries = metricSummaries;
    for (ModelLabMetricSummary item : metricSummaries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ModelLabRunAttributes addMetricSummariesItem(ModelLabMetricSummary metricSummariesItem) {
    this.metricSummaries.add(metricSummariesItem);
    this.unparsed |= metricSummariesItem.unparsed;
    return this;
  }

  /**
   * Summary statistics for metrics recorded during the run.
   *
   * @return metricSummaries
   */
  @JsonProperty(JSON_PROPERTY_METRIC_SUMMARIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ModelLabMetricSummary> getMetricSummaries() {
    return metricSummaries;
  }

  public void setMetricSummaries(List<ModelLabMetricSummary> metricSummaries) {
    this.metricSummaries = metricSummaries;
    if (metricSummaries != null) {
      for (ModelLabMetricSummary item : metricSummaries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ModelLabRunAttributes mlflowArtifactLocation(String mlflowArtifactLocation) {
    this.mlflowArtifactLocation = mlflowArtifactLocation;
    return this;
  }

  /**
   * The MLflow artifact storage location for this run.
   *
   * @return mlflowArtifactLocation
   */
  @JsonProperty(JSON_PROPERTY_MLFLOW_ARTIFACT_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMlflowArtifactLocation() {
    return mlflowArtifactLocation;
  }

  public void setMlflowArtifactLocation(String mlflowArtifactLocation) {
    this.mlflowArtifactLocation = mlflowArtifactLocation;
  }

  public ModelLabRunAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the run.
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

  public ModelLabRunAttributes ownerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
    return this;
  }

  /**
   * The UUID of the run owner.
   *
   * @return ownerId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getOwnerId() {
    return ownerId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getOwnerId_JsonNullable() {
    return ownerId;
  }

  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  public void setOwnerId_JsonNullable(JsonNullable<String> ownerId) {
    this.ownerId = ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = JsonNullable.<String>of(ownerId);
  }

  public ModelLabRunAttributes params(List<ModelLabRunParam> params) {
    this.params = params;
    for (ModelLabRunParam item : params) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ModelLabRunAttributes addParamsItem(ModelLabRunParam paramsItem) {
    this.params.add(paramsItem);
    this.unparsed |= paramsItem.unparsed;
    return this;
  }

  /**
   * The list of parameters used for the run.
   *
   * @return params
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ModelLabRunParam> getParams() {
    return params;
  }

  public void setParams(List<ModelLabRunParam> params) {
    this.params = params;
    if (params != null) {
      for (ModelLabRunParam item : params) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ModelLabRunAttributes projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project this run belongs to.
   *
   * @return projectId
   */
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ModelLabRunAttributes startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * The date and time the run started.
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

  public ModelLabRunAttributes status(ModelLabRunStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of a Model Lab run.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ModelLabRunStatus getStatus() {
    return status;
  }

  public void setStatus(ModelLabRunStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ModelLabRunAttributes tags(List<ModelLabTag> tags) {
    this.tags = tags;
    for (ModelLabTag item : tags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ModelLabRunAttributes addTagsItem(ModelLabTag tagsItem) {
    this.tags.add(tagsItem);
    this.unparsed |= tagsItem.unparsed;
    return this;
  }

  /**
   * The list of tags associated with the run.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ModelLabTag> getTags() {
    return tags;
  }

  public void setTags(List<ModelLabTag> tags) {
    this.tags = tags;
    if (tags != null) {
      for (ModelLabTag item : tags) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ModelLabRunAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date and time the run was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return ModelLabRunAttributes
   */
  @JsonAnySetter
  public ModelLabRunAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ModelLabRunAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLabRunAttributes modelLabRunAttributes = (ModelLabRunAttributes) o;
    return Objects.equals(this.completedAt, modelLabRunAttributes.completedAt)
        && Objects.equals(this.createdAt, modelLabRunAttributes.createdAt)
        && Objects.equals(this.deletedAt, modelLabRunAttributes.deletedAt)
        && Objects.equals(this.descendantMatch, modelLabRunAttributes.descendantMatch)
        && Objects.equals(this.description, modelLabRunAttributes.description)
        && Objects.equals(this.duration, modelLabRunAttributes.duration)
        && Objects.equals(this.externalUrl, modelLabRunAttributes.externalUrl)
        && Objects.equals(this.hasChildren, modelLabRunAttributes.hasChildren)
        && Objects.equals(this.isPinned, modelLabRunAttributes.isPinned)
        && Objects.equals(this.metricSummaries, modelLabRunAttributes.metricSummaries)
        && Objects.equals(this.mlflowArtifactLocation, modelLabRunAttributes.mlflowArtifactLocation)
        && Objects.equals(this.name, modelLabRunAttributes.name)
        && Objects.equals(this.ownerId, modelLabRunAttributes.ownerId)
        && Objects.equals(this.params, modelLabRunAttributes.params)
        && Objects.equals(this.projectId, modelLabRunAttributes.projectId)
        && Objects.equals(this.startedAt, modelLabRunAttributes.startedAt)
        && Objects.equals(this.status, modelLabRunAttributes.status)
        && Objects.equals(this.tags, modelLabRunAttributes.tags)
        && Objects.equals(this.updatedAt, modelLabRunAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, modelLabRunAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        completedAt,
        createdAt,
        deletedAt,
        descendantMatch,
        description,
        duration,
        externalUrl,
        hasChildren,
        isPinned,
        metricSummaries,
        mlflowArtifactLocation,
        name,
        ownerId,
        params,
        projectId,
        startedAt,
        status,
        tags,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLabRunAttributes {\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    descendantMatch: ").append(toIndentedString(descendantMatch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    metricSummaries: ").append(toIndentedString(metricSummaries)).append("\n");
    sb.append("    mlflowArtifactLocation: ")
        .append(toIndentedString(mlflowArtifactLocation))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
