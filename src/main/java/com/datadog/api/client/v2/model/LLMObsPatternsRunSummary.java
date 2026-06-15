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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Summary of an LLM Observability patterns run. */
@JsonPropertyOrder({
  LLMObsPatternsRunSummary.JSON_PROPERTY_COMPLETED_AT,
  LLMObsPatternsRunSummary.JSON_PROPERTY_CONFIG_SNAPSHOT,
  LLMObsPatternsRunSummary.JSON_PROPERTY_CREATED_AT,
  LLMObsPatternsRunSummary.JSON_PROPERTY_ID,
  LLMObsPatternsRunSummary.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsRunSummary {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONFIG_SNAPSHOT = "config_snapshot";
  private LLMObsPatternsConfigSnapshot configSnapshot;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public LLMObsPatternsRunSummary() {}

  @JsonCreator
  public LLMObsPatternsRunSummary(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status) {
    this.createdAt = createdAt;
    this.id = id;
    this.status = status;
  }

  public LLMObsPatternsRunSummary completedAt(OffsetDateTime completedAt) {
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

  public LLMObsPatternsRunSummary configSnapshot(LLMObsPatternsConfigSnapshot configSnapshot) {
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
  }

  public LLMObsPatternsRunSummary createdAt(OffsetDateTime createdAt) {
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

  public LLMObsPatternsRunSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the run.
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

  public LLMObsPatternsRunSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the run.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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
   * @return LLMObsPatternsRunSummary
   */
  @JsonAnySetter
  public LLMObsPatternsRunSummary putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsRunSummary object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsRunSummary llmObsPatternsRunSummary = (LLMObsPatternsRunSummary) o;
    return Objects.equals(this.completedAt, llmObsPatternsRunSummary.completedAt)
        && Objects.equals(this.configSnapshot, llmObsPatternsRunSummary.configSnapshot)
        && Objects.equals(this.createdAt, llmObsPatternsRunSummary.createdAt)
        && Objects.equals(this.id, llmObsPatternsRunSummary.id)
        && Objects.equals(this.status, llmObsPatternsRunSummary.status)
        && Objects.equals(this.additionalProperties, llmObsPatternsRunSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, configSnapshot, createdAt, id, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsRunSummary {\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    configSnapshot: ").append(toIndentedString(configSnapshot)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
