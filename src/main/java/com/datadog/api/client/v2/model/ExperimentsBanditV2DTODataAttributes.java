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

/** A bandit's setup, the policy it serves, and its latest refresh. */
@JsonPropertyOrder({
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_ACTIVE_POLICY,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_BAYESIAN_PRIOR,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_CONFIG_VERSION,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_ENDED_AT,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_LATEST_REFRESH,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_LOOKBACK_SECONDS,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_METRIC_ID,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_OPTIMAL_VARIANT_KEY,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_REFRESH_SCHEDULE_ID,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_SCHEDULED_END_AT,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_SCHEDULED_END_FAILURE,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_STARTED_AT,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_STATUS,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_UPDATED_AT,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_VARIANTS,
  ExperimentsBanditV2DTODataAttributes.JSON_PROPERTY_WARMUP_SECONDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTIVE_POLICY = "active_policy";
  private ExperimentsBanditPolicyV2 activePolicy;

  public static final String JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS =
      "aggregation_window_seconds";
  private Long aggregationWindowSeconds;

  public static final String JSON_PROPERTY_BAYESIAN_PRIOR = "bayesian_prior";
  private ExperimentsBanditBayesianPriorV2 bayesianPrior;

  public static final String JSON_PROPERTY_CONFIG_VERSION = "config_version";
  private Long configVersion;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION =
      "datadog_flag_configuration";
  private ExperimentsBanditFlagConfigurationV2 datadogFlagConfiguration;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private OffsetDateTime endedAt;

  public static final String JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID = "exposure_sql_model_id";
  private UUID exposureSqlModelId;

  public static final String JSON_PROPERTY_LATEST_REFRESH = "latest_refresh";
  private ExperimentsBanditRefreshV2 latestRefresh;

  public static final String JSON_PROPERTY_LOOKBACK_SECONDS = "lookback_seconds";
  private Long lookbackSeconds;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private UUID metricId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIMAL_VARIANT_KEY = "optimal_variant_key";
  private String optimalVariantKey;

  public static final String JSON_PROPERTY_OPTIMAL_VARIANT_UNAVAILABLE_REASON =
      "optimal_variant_unavailable_reason";
  private ExperimentsBanditOptimalVariantUnavailableReason optimalVariantUnavailableReason;

  public static final String JSON_PROPERTY_REFRESH_SCHEDULE_ID = "refresh_schedule_id";
  private String refreshScheduleId;

  public static final String JSON_PROPERTY_SCHEDULED_END_AT = "scheduled_end_at";
  private OffsetDateTime scheduledEndAt;

  public static final String JSON_PROPERTY_SCHEDULED_END_FAILURE = "scheduled_end_failure";
  private ExperimentsBanditScheduledEndFailureV2 scheduledEndFailure;

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

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditVariantV2> variants = new ArrayList<>();

  public static final String JSON_PROPERTY_WARMUP_SECONDS = "warmup_seconds";
  private Long warmupSeconds;

  public ExperimentsBanditV2DTODataAttributes() {}

  @JsonCreator
  public ExperimentsBanditV2DTODataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTIVE_POLICY)
          ExperimentsBanditPolicyV2 activePolicy,
      @JsonProperty(required = true, value = JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS)
          Long aggregationWindowSeconds,
      @JsonProperty(required = true, value = JSON_PROPERTY_BAYESIAN_PRIOR)
          ExperimentsBanditBayesianPriorV2 bayesianPrior,
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG_VERSION) Long configVersion,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDED_AT) OffsetDateTime endedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
          UUID exposureSqlModelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LATEST_REFRESH)
          ExperimentsBanditRefreshV2 latestRefresh,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOOKBACK_SECONDS) Long lookbackSeconds,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_ID) UUID metricId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIMAL_VARIANT_KEY)
          String optimalVariantKey,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFRESH_SCHEDULE_ID)
          String refreshScheduleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCHEDULED_END_AT)
          OffsetDateTime scheduledEndAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) ExperimentsBanditStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPE_ID) UUID subjectTypeId,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAGS) List<String> tags,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEAMS) List<String> teams,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_VARIANTS)
          List<ExperimentsBanditVariantV2> variants,
      @JsonProperty(required = true, value = JSON_PROPERTY_WARMUP_SECONDS) Long warmupSeconds) {
    this.activePolicy = activePolicy;
    if (activePolicy != null) {
      this.unparsed |= activePolicy.unparsed;
    }
    this.aggregationWindowSeconds = aggregationWindowSeconds;
    this.bayesianPrior = bayesianPrior;
    this.unparsed |= bayesianPrior.unparsed;
    this.configVersion = configVersion;
    this.createdAt = createdAt;
    this.description = description;
    this.endedAt = endedAt;
    if (endedAt != null) {}
    this.exposureSqlModelId = exposureSqlModelId;
    if (exposureSqlModelId != null) {}
    this.latestRefresh = latestRefresh;
    if (latestRefresh != null) {
      this.unparsed |= latestRefresh.unparsed;
    }
    this.lookbackSeconds = lookbackSeconds;
    this.metricId = metricId;
    if (metricId != null) {}
    this.name = name;
    this.optimalVariantKey = optimalVariantKey;
    if (optimalVariantKey != null) {}
    this.refreshScheduleId = refreshScheduleId;
    if (refreshScheduleId != null) {}
    this.scheduledEndAt = scheduledEndAt;
    if (scheduledEndAt != null) {}
    this.startedAt = startedAt;
    if (startedAt != null) {}
    this.status = status;
    this.unparsed |= !status.isValid();
    this.subjectTypeId = subjectTypeId;
    if (subjectTypeId != null) {}
    this.tags = tags;
    this.teams = teams;
    this.updatedAt = updatedAt;
    this.variants = variants;
    for (ExperimentsBanditVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
    this.warmupSeconds = warmupSeconds;
    if (warmupSeconds != null) {}
  }

  public ExperimentsBanditV2DTODataAttributes activePolicy(ExperimentsBanditPolicyV2 activePolicy) {
    this.activePolicy = activePolicy;
    if (activePolicy != null) {
      this.unparsed |= activePolicy.unparsed;
    }
    return this;
  }

  /**
   * The policy the bandit serves. Null until the bandit starts.
   *
   * @return activePolicy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditPolicyV2 getActivePolicy() {
    return activePolicy;
  }

  public void setActivePolicy(ExperimentsBanditPolicyV2 activePolicy) {
    this.activePolicy = activePolicy;
    if (activePolicy != null) {
      this.unparsed |= activePolicy.unparsed;
    }
  }

  public ExperimentsBanditV2DTODataAttributes aggregationWindowSeconds(
      Long aggregationWindowSeconds) {
    this.aggregationWindowSeconds = aggregationWindowSeconds;
    return this;
  }

  /**
   * How long after an exposure its reward is counted, in seconds.
   *
   * @return aggregationWindowSeconds
   */
  @JsonProperty(JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAggregationWindowSeconds() {
    return aggregationWindowSeconds;
  }

  public void setAggregationWindowSeconds(Long aggregationWindowSeconds) {
    this.aggregationWindowSeconds = aggregationWindowSeconds;
  }

  public ExperimentsBanditV2DTODataAttributes bayesianPrior(
      ExperimentsBanditBayesianPriorV2 bayesianPrior) {
    this.bayesianPrior = bayesianPrior;
    this.unparsed |= bayesianPrior.unparsed;
    return this;
  }

  /**
   * The prior the bandit's estimates start from.
   *
   * @return bayesianPrior
   */
  @JsonProperty(JSON_PROPERTY_BAYESIAN_PRIOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditBayesianPriorV2 getBayesianPrior() {
    return bayesianPrior;
  }

  public void setBayesianPrior(ExperimentsBanditBayesianPriorV2 bayesianPrior) {
    this.bayesianPrior = bayesianPrior;
    if (bayesianPrior != null) {
      this.unparsed |= bayesianPrior.unparsed;
    }
  }

  public ExperimentsBanditV2DTODataAttributes configVersion(Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * The version of the bandit's configuration. Each saved change adds one.
   *
   * @return configVersion
   */
  @JsonProperty(JSON_PROPERTY_CONFIG_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(Long configVersion) {
    this.configVersion = configVersion;
  }

  public ExperimentsBanditV2DTODataAttributes createdAt(OffsetDateTime createdAt) {
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

  public ExperimentsBanditV2DTODataAttributes datadogFlagConfiguration(
      ExperimentsBanditFlagConfigurationV2 datadogFlagConfiguration) {
    this.datadogFlagConfiguration = datadogFlagConfiguration;
    this.unparsed |= datadogFlagConfiguration.unparsed;
    return this;
  }

  /**
   * The flag rule the bandit serves through. Absent until a draft is put on a flag, and when the
   * caller lacks feature flag and environment read permissions (<code>meta.warnings</code> then
   * says so).
   *
   * @return datadogFlagConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditFlagConfigurationV2 getDatadogFlagConfiguration() {
    return datadogFlagConfiguration;
  }

  public void setDatadogFlagConfiguration(
      ExperimentsBanditFlagConfigurationV2 datadogFlagConfiguration) {
    this.datadogFlagConfiguration = datadogFlagConfiguration;
    if (datadogFlagConfiguration != null) {
      this.unparsed |= datadogFlagConfiguration.unparsed;
    }
  }

  public ExperimentsBanditV2DTODataAttributes description(String description) {
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

  public ExperimentsBanditV2DTODataAttributes endedAt(OffsetDateTime endedAt) {
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

  public ExperimentsBanditV2DTODataAttributes exposureSqlModelId(UUID exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
    if (exposureSqlModelId != null) {}
    return this;
  }

  /**
   * The exposure SQL model the bandit reads its exposures from. Null until set on a draft.
   *
   * @return exposureSqlModelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getExposureSqlModelId() {
    return exposureSqlModelId;
  }

  public void setExposureSqlModelId(UUID exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
  }

  public ExperimentsBanditV2DTODataAttributes latestRefresh(
      ExperimentsBanditRefreshV2 latestRefresh) {
    this.latestRefresh = latestRefresh;
    if (latestRefresh != null) {
      this.unparsed |= latestRefresh.unparsed;
    }
    return this;
  }

  /**
   * The most recently started refresh. Null until one starts.
   *
   * @return latestRefresh
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATEST_REFRESH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditRefreshV2 getLatestRefresh() {
    return latestRefresh;
  }

  public void setLatestRefresh(ExperimentsBanditRefreshV2 latestRefresh) {
    this.latestRefresh = latestRefresh;
    if (latestRefresh != null) {
      this.unparsed |= latestRefresh.unparsed;
    }
  }

  public ExperimentsBanditV2DTODataAttributes lookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
    return this;
  }

  /**
   * How far back each refresh reads observations, in seconds.
   *
   * @return lookbackSeconds
   */
  @JsonProperty(JSON_PROPERTY_LOOKBACK_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLookbackSeconds() {
    return lookbackSeconds;
  }

  public void setLookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
  }

  public ExperimentsBanditV2DTODataAttributes metricId(UUID metricId) {
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

  public ExperimentsBanditV2DTODataAttributes name(String name) {
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

  public ExperimentsBanditV2DTODataAttributes optimalVariantKey(String optimalVariantKey) {
    this.optimalVariantKey = optimalVariantKey;
    if (optimalVariantKey != null) {}
    return this;
  }

  /**
   * The key of the arm most likely to be best, when one arm leads and the bandit is outside warmup.
   * Null otherwise. Matches Get bandit results.
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

  public ExperimentsBanditV2DTODataAttributes optimalVariantUnavailableReason(
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

  public ExperimentsBanditV2DTODataAttributes refreshScheduleId(String refreshScheduleId) {
    this.refreshScheduleId = refreshScheduleId;
    if (refreshScheduleId != null) {}
    return this;
  }

  /**
   * The schedule the bandit refreshes on.
   *
   * @return refreshScheduleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRefreshScheduleId() {
    return refreshScheduleId;
  }

  public void setRefreshScheduleId(String refreshScheduleId) {
    this.refreshScheduleId = refreshScheduleId;
  }

  public ExperimentsBanditV2DTODataAttributes scheduledEndAt(OffsetDateTime scheduledEndAt) {
    this.scheduledEndAt = scheduledEndAt;
    if (scheduledEndAt != null) {}
    return this;
  }

  /**
   * When the bandit ends and serves its fallback. Null when it has no scheduled end.
   *
   * @return scheduledEndAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getScheduledEndAt() {
    return scheduledEndAt;
  }

  public void setScheduledEndAt(OffsetDateTime scheduledEndAt) {
    this.scheduledEndAt = scheduledEndAt;
  }

  public ExperimentsBanditV2DTODataAttributes scheduledEndFailure(
      ExperimentsBanditScheduledEndFailureV2 scheduledEndFailure) {
    this.scheduledEndFailure = scheduledEndFailure;
    this.unparsed |= scheduledEndFailure.unparsed;
    return this;
  }

  /**
   * Why the scheduled end couldn't run. It isn't retried until the end or fallback changes. Absent
   * when there's no failure.
   *
   * @return scheduledEndFailure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditScheduledEndFailureV2 getScheduledEndFailure() {
    return scheduledEndFailure;
  }

  public void setScheduledEndFailure(ExperimentsBanditScheduledEndFailureV2 scheduledEndFailure) {
    this.scheduledEndFailure = scheduledEndFailure;
    if (scheduledEndFailure != null) {
      this.unparsed |= scheduledEndFailure.unparsed;
    }
  }

  public ExperimentsBanditV2DTODataAttributes startedAt(OffsetDateTime startedAt) {
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

  public ExperimentsBanditV2DTODataAttributes status(ExperimentsBanditStatus status) {
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

  public ExperimentsBanditV2DTODataAttributes subjectTypeId(UUID subjectTypeId) {
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

  public ExperimentsBanditV2DTODataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsBanditV2DTODataAttributes addTagsItem(String tagsItem) {
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

  public ExperimentsBanditV2DTODataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsBanditV2DTODataAttributes addTeamsItem(String teamsItem) {
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

  public ExperimentsBanditV2DTODataAttributes updatedAt(OffsetDateTime updatedAt) {
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

  public ExperimentsBanditV2DTODataAttributes variants(List<ExperimentsBanditVariantV2> variants) {
    this.variants = variants;
    for (ExperimentsBanditVariantV2 item : variants) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditV2DTODataAttributes addVariantsItem(
      ExperimentsBanditVariantV2 variantsItem) {
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * The flag variants the bandit uses: its arms in arm order, then its fallback when the fallback
   * isn't an arm.
   *
   * @return variants
   */
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditVariantV2> getVariants() {
    return variants;
  }

  public void setVariants(List<ExperimentsBanditVariantV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditVariantV2 item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsBanditV2DTODataAttributes warmupSeconds(Long warmupSeconds) {
    this.warmupSeconds = warmupSeconds;
    if (warmupSeconds != null) {}
    return this;
  }

  /**
   * How long after starting the bandit serves its arms equally, in seconds. Null when it has no
   * warmup.
   *
   * @return warmupSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARMUP_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getWarmupSeconds() {
    return warmupSeconds;
  }

  public void setWarmupSeconds(Long warmupSeconds) {
    this.warmupSeconds = warmupSeconds;
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
   * @return ExperimentsBanditV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsBanditV2DTODataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditV2DTODataAttributes experimentsBanditV2DtoDataAttributes =
        (ExperimentsBanditV2DTODataAttributes) o;
    return Objects.equals(this.activePolicy, experimentsBanditV2DtoDataAttributes.activePolicy)
        && Objects.equals(
            this.aggregationWindowSeconds,
            experimentsBanditV2DtoDataAttributes.aggregationWindowSeconds)
        && Objects.equals(this.bayesianPrior, experimentsBanditV2DtoDataAttributes.bayesianPrior)
        && Objects.equals(this.configVersion, experimentsBanditV2DtoDataAttributes.configVersion)
        && Objects.equals(this.createdAt, experimentsBanditV2DtoDataAttributes.createdAt)
        && Objects.equals(
            this.datadogFlagConfiguration,
            experimentsBanditV2DtoDataAttributes.datadogFlagConfiguration)
        && Objects.equals(this.description, experimentsBanditV2DtoDataAttributes.description)
        && Objects.equals(this.endedAt, experimentsBanditV2DtoDataAttributes.endedAt)
        && Objects.equals(
            this.exposureSqlModelId, experimentsBanditV2DtoDataAttributes.exposureSqlModelId)
        && Objects.equals(this.latestRefresh, experimentsBanditV2DtoDataAttributes.latestRefresh)
        && Objects.equals(
            this.lookbackSeconds, experimentsBanditV2DtoDataAttributes.lookbackSeconds)
        && Objects.equals(this.metricId, experimentsBanditV2DtoDataAttributes.metricId)
        && Objects.equals(this.name, experimentsBanditV2DtoDataAttributes.name)
        && Objects.equals(
            this.optimalVariantKey, experimentsBanditV2DtoDataAttributes.optimalVariantKey)
        && Objects.equals(
            this.optimalVariantUnavailableReason,
            experimentsBanditV2DtoDataAttributes.optimalVariantUnavailableReason)
        && Objects.equals(
            this.refreshScheduleId, experimentsBanditV2DtoDataAttributes.refreshScheduleId)
        && Objects.equals(this.scheduledEndAt, experimentsBanditV2DtoDataAttributes.scheduledEndAt)
        && Objects.equals(
            this.scheduledEndFailure, experimentsBanditV2DtoDataAttributes.scheduledEndFailure)
        && Objects.equals(this.startedAt, experimentsBanditV2DtoDataAttributes.startedAt)
        && Objects.equals(this.status, experimentsBanditV2DtoDataAttributes.status)
        && Objects.equals(this.subjectTypeId, experimentsBanditV2DtoDataAttributes.subjectTypeId)
        && Objects.equals(this.tags, experimentsBanditV2DtoDataAttributes.tags)
        && Objects.equals(this.teams, experimentsBanditV2DtoDataAttributes.teams)
        && Objects.equals(this.updatedAt, experimentsBanditV2DtoDataAttributes.updatedAt)
        && Objects.equals(this.variants, experimentsBanditV2DtoDataAttributes.variants)
        && Objects.equals(this.warmupSeconds, experimentsBanditV2DtoDataAttributes.warmupSeconds)
        && Objects.equals(
            this.additionalProperties, experimentsBanditV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activePolicy,
        aggregationWindowSeconds,
        bayesianPrior,
        configVersion,
        createdAt,
        datadogFlagConfiguration,
        description,
        endedAt,
        exposureSqlModelId,
        latestRefresh,
        lookbackSeconds,
        metricId,
        name,
        optimalVariantKey,
        optimalVariantUnavailableReason,
        refreshScheduleId,
        scheduledEndAt,
        scheduledEndFailure,
        startedAt,
        status,
        subjectTypeId,
        tags,
        teams,
        updatedAt,
        variants,
        warmupSeconds,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditV2DTODataAttributes {\n");
    sb.append("    activePolicy: ").append(toIndentedString(activePolicy)).append("\n");
    sb.append("    aggregationWindowSeconds: ")
        .append(toIndentedString(aggregationWindowSeconds))
        .append("\n");
    sb.append("    bayesianPrior: ").append(toIndentedString(bayesianPrior)).append("\n");
    sb.append("    configVersion: ").append(toIndentedString(configVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datadogFlagConfiguration: ")
        .append(toIndentedString(datadogFlagConfiguration))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    exposureSqlModelId: ").append(toIndentedString(exposureSqlModelId)).append("\n");
    sb.append("    latestRefresh: ").append(toIndentedString(latestRefresh)).append("\n");
    sb.append("    lookbackSeconds: ").append(toIndentedString(lookbackSeconds)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimalVariantKey: ").append(toIndentedString(optimalVariantKey)).append("\n");
    sb.append("    optimalVariantUnavailableReason: ")
        .append(toIndentedString(optimalVariantUnavailableReason))
        .append("\n");
    sb.append("    refreshScheduleId: ").append(toIndentedString(refreshScheduleId)).append("\n");
    sb.append("    scheduledEndAt: ").append(toIndentedString(scheduledEndAt)).append("\n");
    sb.append("    scheduledEndFailure: ")
        .append(toIndentedString(scheduledEndFailure))
        .append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    warmupSeconds: ").append(toIndentedString(warmupSeconds)).append("\n");
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
