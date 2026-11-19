/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The attributes to change. Omitted attributes are unchanged. Which ones can change depends on the
 * bandit's status.
 */
@JsonPropertyOrder({
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_BAYESIAN_PRIOR,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_LOOKBACK_SECONDS,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_METRIC_ID,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_REFRESH_SCHEDULE_ID,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_SCHEDULED_END_AT,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_VARIANTS,
  ExperimentsPatchBanditV2RequestDataAttributes.JSON_PROPERTY_WARMUP_SECONDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchBanditV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS =
      "aggregation_window_seconds";
  private JsonNullable<Long> aggregationWindowSeconds = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_BAYESIAN_PRIOR = "bayesian_prior";
  private ExperimentsBanditBayesianPriorInputV2 bayesianPrior;

  public static final String JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION =
      "datadog_flag_configuration";
  private JsonNullable<ExperimentsBanditFlagConfigurationInputV2> datadogFlagConfiguration =
      JsonNullable.<ExperimentsBanditFlagConfigurationInputV2>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID = "exposure_sql_model_id";
  private JsonNullable<UUID> exposureSqlModelId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_LOOKBACK_SECONDS = "lookback_seconds";
  private JsonNullable<Long> lookbackSeconds = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private JsonNullable<UUID> metricId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REFRESH_SCHEDULE_ID = "refresh_schedule_id";
  private String refreshScheduleId;

  public static final String JSON_PROPERTY_SCHEDULED_END_AT = "scheduled_end_at";
  private JsonNullable<OffsetDateTime> scheduledEndAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private JsonNullable<UUID> subjectTypeId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditVariantInputV2> variants = null;

  public static final String JSON_PROPERTY_WARMUP_SECONDS = "warmup_seconds";
  private JsonNullable<Long> warmupSeconds = JsonNullable.<Long>undefined();

  public ExperimentsPatchBanditV2RequestDataAttributes aggregationWindowSeconds(
      Long aggregationWindowSeconds) {
    this.aggregationWindowSeconds = JsonNullable.<Long>of(aggregationWindowSeconds);
    return this;
  }

  /**
   * The aggregation window: how long after an exposure the bandit keeps counting its reward, in
   * seconds. <code>null</code> restores the default of 3600 (1 hour). Only a draft can change it.
   *
   * @return aggregationWindowSeconds
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAggregationWindowSeconds() {
    return aggregationWindowSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAggregationWindowSeconds_JsonNullable() {
    return aggregationWindowSeconds;
  }

  @JsonProperty(JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS)
  public void setAggregationWindowSeconds_JsonNullable(
      JsonNullable<Long> aggregationWindowSeconds) {
    this.aggregationWindowSeconds = aggregationWindowSeconds;
  }

  public void setAggregationWindowSeconds(Long aggregationWindowSeconds) {
    this.aggregationWindowSeconds = JsonNullable.<Long>of(aggregationWindowSeconds);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes bayesianPrior(
      ExperimentsBanditBayesianPriorInputV2 bayesianPrior) {
    this.bayesianPrior = bayesianPrior;
    this.unparsed |= bayesianPrior.unparsed;
    return this;
  }

  /**
   * The prior the bandit's estimates start from, in the metric's units. Omitted fields keep their
   * current values, or their defaults on create. A change takes effect on the next refresh.
   *
   * @return bayesianPrior
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BAYESIAN_PRIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsBanditBayesianPriorInputV2 getBayesianPrior() {
    return bayesianPrior;
  }

  public void setBayesianPrior(ExperimentsBanditBayesianPriorInputV2 bayesianPrior) {
    this.bayesianPrior = bayesianPrior;
    if (bayesianPrior != null) {
      this.unparsed |= bayesianPrior.unparsed;
    }
  }

  public ExperimentsPatchBanditV2RequestDataAttributes datadogFlagConfiguration(
      ExperimentsBanditFlagConfigurationInputV2 datadogFlagConfiguration) {
    this.datadogFlagConfiguration =
        JsonNullable.<ExperimentsBanditFlagConfigurationInputV2>of(datadogFlagConfiguration);
    return this;
  }

  /**
   * The flag and environment the bandit serves on, and who it serves there. The server chooses the
   * rule's <code>allocation_key</code>. On create, <code>feature_flag_id</code> and <code>
   * environment_id</code> are required, and <code>null</code> is the same as omitting it. On
   * update, omitted fields are unchanged, and <code>null</code> takes a draft off its flag, which
   * also clears its variants and scheduled end. Moving a draft to another flag clears its variants
   * unless the request sets them. Only a draft can change it.
   *
   * @return datadogFlagConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsBanditFlagConfigurationInputV2 getDatadogFlagConfiguration() {
    return datadogFlagConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsBanditFlagConfigurationInputV2>
      getDatadogFlagConfiguration_JsonNullable() {
    return datadogFlagConfiguration;
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  public void setDatadogFlagConfiguration_JsonNullable(
      JsonNullable<ExperimentsBanditFlagConfigurationInputV2> datadogFlagConfiguration) {
    this.datadogFlagConfiguration = datadogFlagConfiguration;
  }

  public void setDatadogFlagConfiguration(
      ExperimentsBanditFlagConfigurationInputV2 datadogFlagConfiguration) {
    this.datadogFlagConfiguration =
        JsonNullable.<ExperimentsBanditFlagConfigurationInputV2>of(datadogFlagConfiguration);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The bandit's description.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes exposureSqlModelId(UUID exposureSqlModelId) {
    this.exposureSqlModelId = JsonNullable.<UUID>of(exposureSqlModelId);
    return this;
  }

  /**
   * The exposure SQL model the bandit reads its exposures from. Only a draft can change it.
   *
   * @return exposureSqlModelId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getExposureSqlModelId() {
    return exposureSqlModelId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getExposureSqlModelId_JsonNullable() {
    return exposureSqlModelId;
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
  public void setExposureSqlModelId_JsonNullable(JsonNullable<UUID> exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
  }

  public void setExposureSqlModelId(UUID exposureSqlModelId) {
    this.exposureSqlModelId = JsonNullable.<UUID>of(exposureSqlModelId);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes lookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = JsonNullable.<Long>of(lookbackSeconds);
    return this;
  }

  /**
   * How far back each refresh reads observations, in seconds. <code>null</code> restores the
   * default of 2592000 (30 days). Only a draft can change it.
   *
   * @return lookbackSeconds
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getLookbackSeconds() {
    return lookbackSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOOKBACK_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getLookbackSeconds_JsonNullable() {
    return lookbackSeconds;
  }

  @JsonProperty(JSON_PROPERTY_LOOKBACK_SECONDS)
  public void setLookbackSeconds_JsonNullable(JsonNullable<Long> lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
  }

  public void setLookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = JsonNullable.<Long>of(lookbackSeconds);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes metricId(UUID metricId) {
    this.metricId = JsonNullable.<UUID>of(metricId);
    return this;
  }

  /**
   * The metric the bandit optimizes. It must read a warehouse metric source. Only a draft can
   * change it.
   *
   * @return metricId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getMetricId() {
    return metricId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getMetricId_JsonNullable() {
    return metricId;
  }

  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  public void setMetricId_JsonNullable(JsonNullable<UUID> metricId) {
    this.metricId = metricId;
  }

  public void setMetricId(UUID metricId) {
    this.metricId = JsonNullable.<UUID>of(metricId);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The bandit's name.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes refreshScheduleId(String refreshScheduleId) {
    this.refreshScheduleId = refreshScheduleId;
    return this;
  }

  /**
   * The schedule the bandit refreshes on.
   *
   * @return refreshScheduleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRefreshScheduleId() {
    return refreshScheduleId;
  }

  public void setRefreshScheduleId(String refreshScheduleId) {
    this.refreshScheduleId = refreshScheduleId;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes scheduledEndAt(
      OffsetDateTime scheduledEndAt) {
    this.scheduledEndAt = JsonNullable.<OffsetDateTime>of(scheduledEndAt);
    return this;
  }

  /**
   * When the bandit ends and serves its fallback. Needs a fallback variant. <code>null</code>
   * removes the scheduled end.
   *
   * @return scheduledEndAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getScheduledEndAt() {
    return scheduledEndAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getScheduledEndAt_JsonNullable() {
    return scheduledEndAt;
  }

  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_AT)
  public void setScheduledEndAt_JsonNullable(JsonNullable<OffsetDateTime> scheduledEndAt) {
    this.scheduledEndAt = scheduledEndAt;
  }

  public void setScheduledEndAt(OffsetDateTime scheduledEndAt) {
    this.scheduledEndAt = JsonNullable.<OffsetDateTime>of(scheduledEndAt);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes subjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = JsonNullable.<UUID>of(subjectTypeId);
    return this;
  }

  /**
   * The subject type the bandit randomizes and measures by. Only a draft can change it.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getSubjectTypeId() {
    return subjectTypeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getSubjectTypeId_JsonNullable() {
    return subjectTypeId;
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  public void setSubjectTypeId_JsonNullable(JsonNullable<UUID> subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public void setSubjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = JsonNullable.<UUID>of(subjectTypeId);
  }

  public ExperimentsPatchBanditV2RequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Replaces the bandit's tags and keeps its teams. Allowed in any status.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Replaces the bandit's teams and keeps its tags. Allowed in any status.
   *
   * @return teams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes variants(
      List<ExperimentsBanditVariantInputV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditVariantInputV2 item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchBanditV2RequestDataAttributes addVariantsItem(
      ExperimentsBanditVariantInputV2 variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * Replaces the variants the bandit uses. Once the bandit has started, only <code>is_fallback
   * </code> can change, so send the current arms with a different <code>is_fallback</code>. Only a
   * draft can have an empty list.
   *
   * @return variants
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsBanditVariantInputV2> getVariants() {
    return variants;
  }

  public void setVariants(List<ExperimentsBanditVariantInputV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditVariantInputV2 item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchBanditV2RequestDataAttributes warmupSeconds(Long warmupSeconds) {
    this.warmupSeconds = JsonNullable.<Long>of(warmupSeconds);
    return this;
  }

  /**
   * How long the bandit serves its arms equally after it starts, in seconds. <code>null</code>
   * removes the warmup. Only a draft can change it.
   *
   * @return warmupSeconds
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getWarmupSeconds() {
    return warmupSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WARMUP_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getWarmupSeconds_JsonNullable() {
    return warmupSeconds;
  }

  @JsonProperty(JSON_PROPERTY_WARMUP_SECONDS)
  public void setWarmupSeconds_JsonNullable(JsonNullable<Long> warmupSeconds) {
    this.warmupSeconds = warmupSeconds;
  }

  public void setWarmupSeconds(Long warmupSeconds) {
    this.warmupSeconds = JsonNullable.<Long>of(warmupSeconds);
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
   * @return ExperimentsPatchBanditV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPatchBanditV2RequestDataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsPatchBanditV2RequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchBanditV2RequestDataAttributes experimentsPatchBanditV2RequestDataAttributes =
        (ExperimentsPatchBanditV2RequestDataAttributes) o;
    return Objects.equals(
            this.aggregationWindowSeconds,
            experimentsPatchBanditV2RequestDataAttributes.aggregationWindowSeconds)
        && Objects.equals(
            this.bayesianPrior, experimentsPatchBanditV2RequestDataAttributes.bayesianPrior)
        && Objects.equals(
            this.datadogFlagConfiguration,
            experimentsPatchBanditV2RequestDataAttributes.datadogFlagConfiguration)
        && Objects.equals(
            this.description, experimentsPatchBanditV2RequestDataAttributes.description)
        && Objects.equals(
            this.exposureSqlModelId,
            experimentsPatchBanditV2RequestDataAttributes.exposureSqlModelId)
        && Objects.equals(
            this.lookbackSeconds, experimentsPatchBanditV2RequestDataAttributes.lookbackSeconds)
        && Objects.equals(this.metricId, experimentsPatchBanditV2RequestDataAttributes.metricId)
        && Objects.equals(this.name, experimentsPatchBanditV2RequestDataAttributes.name)
        && Objects.equals(
            this.refreshScheduleId, experimentsPatchBanditV2RequestDataAttributes.refreshScheduleId)
        && Objects.equals(
            this.scheduledEndAt, experimentsPatchBanditV2RequestDataAttributes.scheduledEndAt)
        && Objects.equals(
            this.subjectTypeId, experimentsPatchBanditV2RequestDataAttributes.subjectTypeId)
        && Objects.equals(this.tags, experimentsPatchBanditV2RequestDataAttributes.tags)
        && Objects.equals(this.teams, experimentsPatchBanditV2RequestDataAttributes.teams)
        && Objects.equals(this.variants, experimentsPatchBanditV2RequestDataAttributes.variants)
        && Objects.equals(
            this.warmupSeconds, experimentsPatchBanditV2RequestDataAttributes.warmupSeconds)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchBanditV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregationWindowSeconds,
        bayesianPrior,
        datadogFlagConfiguration,
        description,
        exposureSqlModelId,
        lookbackSeconds,
        metricId,
        name,
        refreshScheduleId,
        scheduledEndAt,
        subjectTypeId,
        tags,
        teams,
        variants,
        warmupSeconds,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchBanditV2RequestDataAttributes {\n");
    sb.append("    aggregationWindowSeconds: ")
        .append(toIndentedString(aggregationWindowSeconds))
        .append("\n");
    sb.append("    bayesianPrior: ").append(toIndentedString(bayesianPrior)).append("\n");
    sb.append("    datadogFlagConfiguration: ")
        .append(toIndentedString(datadogFlagConfiguration))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    exposureSqlModelId: ").append(toIndentedString(exposureSqlModelId)).append("\n");
    sb.append("    lookbackSeconds: ").append(toIndentedString(lookbackSeconds)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    refreshScheduleId: ").append(toIndentedString(refreshScheduleId)).append("\n");
    sb.append("    scheduledEndAt: ").append(toIndentedString(scheduledEndAt)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
