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

/**
 * A topic discovered by an LLM Observability patterns run, including the clustered points attached
 * to leaf topics.
 */
@JsonPropertyOrder({
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_CLUSTER_POINTS,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_CREATED_AT,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_DESCRIPTION,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_FIRST_SEEN_AT,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_HIERARCHY_LEVEL,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_ID,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_IS_VALIDATED,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_NAME,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_PARENT_TOPIC_ID,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_POINT_COUNT,
  LLMObsPatternsTopicWithClusteredPoints.JSON_PROPERTY_RUN_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsTopicWithClusteredPoints {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CLUSTER_POINTS = "cluster_points";
  private List<LLMObsPatternsClusteredPointRef> clusterPoints = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FIRST_SEEN_AT = "first_seen_at";
  private OffsetDateTime firstSeenAt;

  public static final String JSON_PROPERTY_HIERARCHY_LEVEL = "hierarchy_level";
  private Long hierarchyLevel;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_VALIDATED = "is_validated";
  private Boolean isValidated;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARENT_TOPIC_ID = "parent_topic_id";
  private String parentTopicId;

  public static final String JSON_PROPERTY_POINT_COUNT = "point_count";
  private Long pointCount;

  public static final String JSON_PROPERTY_RUN_ID = "run_id";
  private String runId;

  public LLMObsPatternsTopicWithClusteredPoints() {}

  @JsonCreator
  public LLMObsPatternsTopicWithClusteredPoints(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_FIRST_SEEN_AT)
          OffsetDateTime firstSeenAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIERARCHY_LEVEL) Long hierarchyLevel,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_VALIDATED) Boolean isValidated,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PARENT_TOPIC_ID) String parentTopicId,
      @JsonProperty(required = true, value = JSON_PROPERTY_POINT_COUNT) Long pointCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUN_ID) String runId) {
    this.createdAt = createdAt;
    this.description = description;
    this.firstSeenAt = firstSeenAt;
    this.hierarchyLevel = hierarchyLevel;
    this.id = id;
    this.isValidated = isValidated;
    this.name = name;
    this.parentTopicId = parentTopicId;
    this.pointCount = pointCount;
    this.runId = runId;
  }

  public LLMObsPatternsTopicWithClusteredPoints clusterPoints(
      List<LLMObsPatternsClusteredPointRef> clusterPoints) {
    this.clusterPoints = clusterPoints;
    if (clusterPoints != null) {
      for (LLMObsPatternsClusteredPointRef item : clusterPoints) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsPatternsTopicWithClusteredPoints addClusterPointsItem(
      LLMObsPatternsClusteredPointRef clusterPointsItem) {
    if (this.clusterPoints == null) {
      this.clusterPoints = new ArrayList<>();
    }
    this.clusterPoints.add(clusterPointsItem);
    this.unparsed |= clusterPointsItem.unparsed;
    return this;
  }

  /**
   * List of clustered points attached to a topic.
   *
   * @return clusterPoints
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLUSTER_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsPatternsClusteredPointRef> getClusterPoints() {
    return clusterPoints;
  }

  public void setClusterPoints(List<LLMObsPatternsClusteredPointRef> clusterPoints) {
    this.clusterPoints = clusterPoints;
    if (clusterPoints != null) {
      for (LLMObsPatternsClusteredPointRef item : clusterPoints) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsPatternsTopicWithClusteredPoints createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the topic was created.
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

  public LLMObsPatternsTopicWithClusteredPoints description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the topic.
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

  public LLMObsPatternsTopicWithClusteredPoints firstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
    return this;
  }

  /**
   * Timestamp when the topic was first seen.
   *
   * @return firstSeenAt
   */
  @JsonProperty(JSON_PROPERTY_FIRST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getFirstSeenAt() {
    return firstSeenAt;
  }

  public void setFirstSeenAt(OffsetDateTime firstSeenAt) {
    this.firstSeenAt = firstSeenAt;
  }

  public LLMObsPatternsTopicWithClusteredPoints hierarchyLevel(Long hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

  /**
   * Level of the topic in the hierarchy. Level 0 is a leaf topic.
   *
   * @return hierarchyLevel
   */
  @JsonProperty(JSON_PROPERTY_HIERARCHY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(Long hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  public LLMObsPatternsTopicWithClusteredPoints id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the topic.
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

  public LLMObsPatternsTopicWithClusteredPoints isValidated(Boolean isValidated) {
    this.isValidated = isValidated;
    return this;
  }

  /**
   * Whether the topic has been validated.
   *
   * @return isValidated
   */
  @JsonProperty(JSON_PROPERTY_IS_VALIDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsValidated() {
    return isValidated;
  }

  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }

  public LLMObsPatternsTopicWithClusteredPoints name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the topic.
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

  public LLMObsPatternsTopicWithClusteredPoints parentTopicId(String parentTopicId) {
    this.parentTopicId = parentTopicId;
    return this;
  }

  /**
   * Identifier of the parent topic. Empty for top-level topics.
   *
   * @return parentTopicId
   */
  @JsonProperty(JSON_PROPERTY_PARENT_TOPIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getParentTopicId() {
    return parentTopicId;
  }

  public void setParentTopicId(String parentTopicId) {
    this.parentTopicId = parentTopicId;
  }

  public LLMObsPatternsTopicWithClusteredPoints pointCount(Long pointCount) {
    this.pointCount = pointCount;
    return this;
  }

  /**
   * Number of data points assigned to the topic.
   *
   * @return pointCount
   */
  @JsonProperty(JSON_PROPERTY_POINT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getPointCount() {
    return pointCount;
  }

  public void setPointCount(Long pointCount) {
    this.pointCount = pointCount;
  }

  public LLMObsPatternsTopicWithClusteredPoints runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Identifier of the run that produced the topic.
   *
   * @return runId
   */
  @JsonProperty(JSON_PROPERTY_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
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
   * @return LLMObsPatternsTopicWithClusteredPoints
   */
  @JsonAnySetter
  public LLMObsPatternsTopicWithClusteredPoints putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsTopicWithClusteredPoints object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsTopicWithClusteredPoints llmObsPatternsTopicWithClusteredPoints =
        (LLMObsPatternsTopicWithClusteredPoints) o;
    return Objects.equals(this.clusterPoints, llmObsPatternsTopicWithClusteredPoints.clusterPoints)
        && Objects.equals(this.createdAt, llmObsPatternsTopicWithClusteredPoints.createdAt)
        && Objects.equals(this.description, llmObsPatternsTopicWithClusteredPoints.description)
        && Objects.equals(this.firstSeenAt, llmObsPatternsTopicWithClusteredPoints.firstSeenAt)
        && Objects.equals(
            this.hierarchyLevel, llmObsPatternsTopicWithClusteredPoints.hierarchyLevel)
        && Objects.equals(this.id, llmObsPatternsTopicWithClusteredPoints.id)
        && Objects.equals(this.isValidated, llmObsPatternsTopicWithClusteredPoints.isValidated)
        && Objects.equals(this.name, llmObsPatternsTopicWithClusteredPoints.name)
        && Objects.equals(this.parentTopicId, llmObsPatternsTopicWithClusteredPoints.parentTopicId)
        && Objects.equals(this.pointCount, llmObsPatternsTopicWithClusteredPoints.pointCount)
        && Objects.equals(this.runId, llmObsPatternsTopicWithClusteredPoints.runId)
        && Objects.equals(
            this.additionalProperties, llmObsPatternsTopicWithClusteredPoints.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clusterPoints,
        createdAt,
        description,
        firstSeenAt,
        hierarchyLevel,
        id,
        isValidated,
        name,
        parentTopicId,
        pointCount,
        runId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsTopicWithClusteredPoints {\n");
    sb.append("    clusterPoints: ").append(toIndentedString(clusterPoints)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstSeenAt: ").append(toIndentedString(firstSeenAt)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isValidated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTopicId: ").append(toIndentedString(parentTopicId)).append("\n");
    sb.append("    pointCount: ").append(toIndentedString(pointCount)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
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
