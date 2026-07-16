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

/** Attributes of an LLM Observability patterns topics-with-clustered-points response. */
@JsonPropertyOrder({
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_COMPLETED_AT,
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_CONFIG_ID,
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_CONFIG_SNAPSHOT,
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_CREATED_AT,
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_PREVIOUS_RUN_ID,
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_RUN_ID,
  LLMObsPatternsTopicsWithClusteredPointsResponseAttributes.JSON_PROPERTY_TOPICS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsTopicsWithClusteredPointsResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONFIG_ID = "config_id";
  private String configId;

  public static final String JSON_PROPERTY_CONFIG_SNAPSHOT = "config_snapshot";
  private LLMObsPatternsConfigSnapshot configSnapshot;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PREVIOUS_RUN_ID = "previous_run_id";
  private String previousRunId;

  public static final String JSON_PROPERTY_RUN_ID = "run_id";
  private String runId;

  public static final String JSON_PROPERTY_TOPICS = "topics";
  private List<LLMObsPatternsTopicWithClusteredPoints> topics = new ArrayList<>();

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes() {}

  @JsonCreator
  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_ID) String configId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREVIOUS_RUN_ID) String previousRunId,
      @JsonProperty(required = true, value = JSON_PROPERTY_RUN_ID) String runId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOPICS)
          List<LLMObsPatternsTopicWithClusteredPoints> topics) {
    this.configId = configId;
    this.createdAt = createdAt;
    this.previousRunId = previousRunId;
    this.runId = runId;
    this.topics = topics;
    for (LLMObsPatternsTopicWithClusteredPoints item : topics) {
      this.unparsed |= item.unparsed;
    }
  }

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes completedAt(
      OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.<OffsetDateTime>of(completedAt);
    return this;
  }

  /**
   * Timestamp when the run completed. Null if the run has not completed.
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

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes configId(String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * Identifier of the configuration that produced the run.
   *
   * @return configId
   */
  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConfigId() {
    return configId;
  }

  public void setConfigId(String configId) {
    this.configId = configId;
  }

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes configSnapshot(
      LLMObsPatternsConfigSnapshot configSnapshot) {
    this.configSnapshot = configSnapshot;
    this.unparsed |= configSnapshot.unparsed;
    return this;
  }

  /**
   * Snapshot of the configuration used for a patterns run.
   *
   * @return configSnapshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsPatternsConfigSnapshot getConfigSnapshot() {
    return configSnapshot;
  }

  public void setConfigSnapshot(LLMObsPatternsConfigSnapshot configSnapshot) {
    this.configSnapshot = configSnapshot;
    if (configSnapshot != null) {
      this.unparsed |= configSnapshot.unparsed;
    }
  }

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes createdAt(
      OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the run was created.
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

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes previousRunId(
      String previousRunId) {
    this.previousRunId = previousRunId;
    return this;
  }

  /**
   * Identifier of the run that completed immediately before this one. Empty if none.
   *
   * @return previousRunId
   */
  @JsonProperty(JSON_PROPERTY_PREVIOUS_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPreviousRunId() {
    return previousRunId;
  }

  public void setPreviousRunId(String previousRunId) {
    this.previousRunId = previousRunId;
  }

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Identifier of the run that produced the topics.
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

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes topics(
      List<LLMObsPatternsTopicWithClusteredPoints> topics) {
    this.topics = topics;
    for (LLMObsPatternsTopicWithClusteredPoints item : topics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes addTopicsItem(
      LLMObsPatternsTopicWithClusteredPoints topicsItem) {
    this.topics.add(topicsItem);
    this.unparsed |= topicsItem.unparsed;
    return this;
  }

  /**
   * List of discovered topics with their clustered points.
   *
   * @return topics
   */
  @JsonProperty(JSON_PROPERTY_TOPICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsPatternsTopicWithClusteredPoints> getTopics() {
    return topics;
  }

  public void setTopics(List<LLMObsPatternsTopicWithClusteredPoints> topics) {
    this.topics = topics;
    if (topics != null) {
      for (LLMObsPatternsTopicWithClusteredPoints item : topics) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return LLMObsPatternsTopicsWithClusteredPointsResponseAttributes
   */
  @JsonAnySetter
  public LLMObsPatternsTopicsWithClusteredPointsResponseAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this LLMObsPatternsTopicsWithClusteredPointsResponseAttributes object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsTopicsWithClusteredPointsResponseAttributes
        llmObsPatternsTopicsWithClusteredPointsResponseAttributes =
            (LLMObsPatternsTopicsWithClusteredPointsResponseAttributes) o;
    return Objects.equals(
            this.completedAt, llmObsPatternsTopicsWithClusteredPointsResponseAttributes.completedAt)
        && Objects.equals(
            this.configId, llmObsPatternsTopicsWithClusteredPointsResponseAttributes.configId)
        && Objects.equals(
            this.configSnapshot,
            llmObsPatternsTopicsWithClusteredPointsResponseAttributes.configSnapshot)
        && Objects.equals(
            this.createdAt, llmObsPatternsTopicsWithClusteredPointsResponseAttributes.createdAt)
        && Objects.equals(
            this.previousRunId,
            llmObsPatternsTopicsWithClusteredPointsResponseAttributes.previousRunId)
        && Objects.equals(
            this.runId, llmObsPatternsTopicsWithClusteredPointsResponseAttributes.runId)
        && Objects.equals(
            this.topics, llmObsPatternsTopicsWithClusteredPointsResponseAttributes.topics)
        && Objects.equals(
            this.additionalProperties,
            llmObsPatternsTopicsWithClusteredPointsResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        completedAt,
        configId,
        configSnapshot,
        createdAt,
        previousRunId,
        runId,
        topics,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsTopicsWithClusteredPointsResponseAttributes {\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    configSnapshot: ").append(toIndentedString(configSnapshot)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    previousRunId: ").append(toIndentedString(previousRunId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
