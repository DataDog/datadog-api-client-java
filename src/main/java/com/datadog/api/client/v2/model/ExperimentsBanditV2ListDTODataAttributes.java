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
import java.util.UUID;

/** Summary of a bandit. Use Get bandit for its setup, active policy, and latest refresh. */
@JsonPropertyOrder({
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_ENDED_AT,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_METRIC_ID,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_OPTIMAL_VARIANT_KEY,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_STARTED_AT,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_STATUS,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsBanditV2ListDTODataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditV2ListDTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private OffsetDateTime endedAt;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private UUID metricId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIMAL_VARIANT_KEY = "optimal_variant_key";
  private String optimalVariantKey;

  public static final String JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON =
      "optimal_variant_unavailable_reason";
  private ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ExperimentsBanditStatus status;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private UUID subjectTypeId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ExperimentsBanditV2ListDTODataAttributes() {}

  @JsonCreator
  public ExperimentsBanditV2ListDTODataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDED_AT) OffsetDateTime endedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_ID) UUID metricId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIMAL_VARIANT_KEY)
          String optimalVariantKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) ExperimentsBanditStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPE_ID) UUID subjectTypeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS) List<String> teams,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.description = description;
    this.endedAt = endedAt;
    if (endedAt != null) {}
    this.metricId = metricId;
    if (metricId != null) {}
    this.name = name;
    this.optimalVariantKey = optimalVariantKey;
    if (optimalVariantKey != null) {}
    this.startedAt = startedAt;
    if (startedAt != null) {}
    this.status = status;
    this.unparsed |= !status.isValid();
    this.subjectTypeId = subjectTypeId;
    if (subjectTypeId != null) {}
    this.tags = tags;
    this.teams = teams;
    this.updatedAt = updatedAt;
  }

  public ExperimentsBanditV2ListDTODataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the bandit was created.
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

  public ExperimentsBanditV2ListDTODataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The bandit's description.
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

  public ExperimentsBanditV2ListDTODataAttributes endedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
    if (endedAt != null) {}
    return this;
  }

  /**
   * When the bandit was stopped or reached its scheduled end. Null while it hasn't ended.
   *
   * @return endedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }

  public ExperimentsBanditV2ListDTODataAttributes metricId(UUID metricId) {
    this.metricId = metricId;
    if (metricId != null) {}
    return this;
  }

  /**
   * The metric the bandit optimizes. Null until set on a draft.
   *
   * @return metricId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getMetricId() {
    return metricId;
  }

  public void setMetricId(UUID metricId) {
    this.metricId = metricId;
  }

  public ExperimentsBanditV2ListDTODataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The bandit's name.
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

  public ExperimentsBanditV2ListDTODataAttributes optimalVariantKey(String optimalVariantKey) {
    this.optimalVariantKey = optimalVariantKey;
    if (optimalVariantKey != null) {}
    return this;
  }

  /**
   * The key of the arm most likely to be best, when one arm leads and the bandit is outside warmup.
   * Null otherwise.
   *
   * @return optimalVariantKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMAL_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOptimalVariantKey() {
    return optimalVariantKey;
  }

  public void setOptimalVariantKey(String optimalVariantKey) {
    this.optimalVariantKey = optimalVariantKey;
  }

  public ExperimentsBanditV2ListDTODataAttributes optimalVariantUnavailableReason(
      ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason) {
    this.optimalVariantUnavailableReason = optimalVariantUnavailableReason;
    this.unparsed |= !optimalVariantUnavailableReason.isValid();
    return this;
  }

  /**
   * Why no optimal variant is reported. Absent when one is, or when the cause isn't known.
   *
   * @return optimalVariantUnavailableReason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditOptimalVariantUnavailableReason getOptimalVariantUnavailableReason() {
    return optimalVariantUnavailableReason;
  }

  public void setOptimalVariantUnavailableReason(
      ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason) {
    if (!optimalVariantUnavailableReason.isValid()) {
      this.unparsed = true;
    }
    this.optimalVariantUnavailableReason = optimalVariantUnavailableReason;
  }

  public ExperimentsBanditV2ListDTODataAttributes startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    if (startedAt != null) {}
    return this;
  }

  /**
   * When the bandit started. Null until it starts.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public ExperimentsBanditV2ListDTODataAttributes status(ExperimentsBanditStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The bandit's status. STOPPED means the bandit was stopped and serves the variant chosen then.
   * COMPLETED means it reached its scheduled end and serves its fallback.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditStatus getStatus() {
    return status;
  }

  public void setStatus(ExperimentsBanditStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ExperimentsBanditV2ListDTODataAttributes subjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    if (subjectTypeId != null) {}
    return this;
  }

  /**
   * The subject type the bandit randomizes and measures by. Null until set on a draft.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsBanditV2ListDTODataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsBanditV2ListDTODataAttributes addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The bandit's tags, without team tags.
   *
   * @return tags
   */
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ExperimentsBanditV2ListDTODataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsBanditV2ListDTODataAttributes addTeamsItem(String teamsItem) {
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Handles of the teams that own the bandit.
   *
   * @return teams
   */
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  public ExperimentsBanditV2ListDTODataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the bandit was last changed.
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
   * @return ExperimentsBanditV2ListDTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsBanditV2ListDTODataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditV2ListDTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditV2ListDTODataAttributes experimentsBanditV2ListDtoDataAttributes =
        (ExperimentsBanditV2ListDTODataAttributes) o;
    return Objects.equals(this.createdAt, experimentsBanditV2ListDtoDataAttributes.createdAt)
        && Objects.equals(this.description, experimentsBanditV2ListDtoDataAttributes.description)
        && Objects.equals(this.endedAt, experimentsBanditV2ListDtoDataAttributes.endedAt)
        && Objects.equals(this.metricId, experimentsBanditV2ListDtoDataAttributes.metricId)
        && Objects.equals(this.name, experimentsBanditV2ListDtoDataAttributes.name)
        && Objects.equals(
            this.optimalVariantKey, experimentsBanditV2ListDtoDataAttributes.optimalVariantKey)
        && Objects.equals(
            this.optimalVariantUnavailableReason,
            experimentsBanditV2ListDtoDataAttributes.optimalVariantUnavailableReason)
        && Objects.equals(this.startedAt, experimentsBanditV2ListDtoDataAttributes.startedAt)
        && Objects.equals(this.status, experimentsBanditV2ListDtoDataAttributes.status)
        && Objects.equals(
            this.subjectTypeId, experimentsBanditV2ListDtoDataAttributes.subjectTypeId)
        && Objects.equals(this.tags, experimentsBanditV2ListDtoDataAttributes.tags)
        && Objects.equals(this.teams, experimentsBanditV2ListDtoDataAttributes.teams)
        && Objects.equals(this.updatedAt, experimentsBanditV2ListDtoDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            experimentsBanditV2ListDtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        endedAt,
        metricId,
        name,
        optimalVariantKey,
        optimalVariantUnavailableReason,
        startedAt,
        status,
        subjectTypeId,
        tags,
        teams,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditV2ListDTODataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimalVariantKey: ").append(toIndentedString(optimalVariantKey)).append("\n");
    sb.append("    optimalVariantUnavailableReason: ")
        .append(toIndentedString(optimalVariantUnavailableReason))
        .append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
