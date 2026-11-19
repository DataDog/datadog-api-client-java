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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The new draft's setup. Only <code>name</code> is required. Whether the draft is ready to run is
 * checked when it starts.
 */
@JsonPropertyOrder({
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_BAYESIAN_PRIOR,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_LOOKBACK_SECONDS,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_METRIC_ID,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_REFRESH_SCHEDULE_ID,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_SCHEDULED_END_AT,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_VARIANTS,
  ExperimentsCreateBanditV2RequestDataAttributes.JSON_PROPERTY_WARMUP_SECONDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateBanditV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS =
      "aggregation_window_seconds";
  private Long aggregationWindowSeconds;

  public static final String JSON_PROPERTY_BAYESIAN_PRIOR = "bayesian_prior";
  private ExperimentsBanditBayesianPriorInputV2 bayesianPrior;

  public static final String JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION =
      "datadog_flag_configuration";
  private JsonNullable<ExperimentsBanditFlagConfigurationInputV2> datadogFlagConfiguration =
      JsonNullable.<ExperimentsBanditFlagConfigurationInputV2>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID = "exposure_sql_model_id";
  private UUID exposureSqlModelId;

  public static final String JSON_PROPERTY_LOOKBACK_SECONDS = "lookback_seconds";
  private Long lookbackSeconds;

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private UUID metricId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REFRESH_SCHEDULE_ID = "refresh_schedule_id";
  private String refreshScheduleId;

  public static final String JSON_PROPERTY_SCHEDULED_END_AT = "scheduled_end_at";
  private OffsetDateTime scheduledEndAt;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private UUID subjectTypeId;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsBanditVariantInputV2> variants = null;

  public static final String JSON_PROPERTY_WARMUP_SECONDS = "warmup_seconds";
  private Long warmupSeconds;

  public ExperimentsCreateBanditV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsCreateBanditV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes aggregationWindowSeconds(
      Long aggregationWindowSeconds) {
    this.aggregationWindowSeconds = aggregationWindowSeconds;
    return this;
  }

  /**
   * The aggregation window: how long after an exposure the bandit keeps counting its reward, in
   * seconds. Defaults to 3600 (1 hour).
   *
   * @return aggregationWindowSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGGREGATION_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAggregationWindowSeconds() {
    return aggregationWindowSeconds;
  }

  public void setAggregationWindowSeconds(Long aggregationWindowSeconds) {
    this.aggregationWindowSeconds = aggregationWindowSeconds;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes bayesianPrior(
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

  public ExperimentsCreateBanditV2RequestDataAttributes datadogFlagConfiguration(
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

  public ExperimentsCreateBanditV2RequestDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The bandit's description. Defaults to empty.
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

  public ExperimentsCreateBanditV2RequestDataAttributes exposureSqlModelId(
      UUID exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
    return this;
  }

  /**
   * The exposure SQL model the bandit reads its exposures from.
   *
   * @return exposureSqlModelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_SQL_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getExposureSqlModelId() {
    return exposureSqlModelId;
  }

  public void setExposureSqlModelId(UUID exposureSqlModelId) {
    this.exposureSqlModelId = exposureSqlModelId;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes lookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
    return this;
  }

  /**
   * How far back each refresh reads observations, in seconds. Defaults to 2592000 (30 days).
   *
   * @return lookbackSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOOKBACK_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLookbackSeconds() {
    return lookbackSeconds;
  }

  public void setLookbackSeconds(Long lookbackSeconds) {
    this.lookbackSeconds = lookbackSeconds;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes metricId(UUID metricId) {
    this.metricId = metricId;
    return this;
  }

  /**
   * The metric the bandit optimizes. It must read a warehouse metric source.
   *
   * @return metricId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getMetricId() {
    return metricId;
  }

  public void setMetricId(UUID metricId) {
    this.metricId = metricId;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes name(String name) {
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

  public ExperimentsCreateBanditV2RequestDataAttributes refreshScheduleId(
      String refreshScheduleId) {
    this.refreshScheduleId = refreshScheduleId;
    return this;
  }

  /**
   * The schedule the bandit refreshes on. Defaults to the organization's default schedule.
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

  public ExperimentsCreateBanditV2RequestDataAttributes scheduledEndAt(
      OffsetDateTime scheduledEndAt) {
    this.scheduledEndAt = scheduledEndAt;
    return this;
  }

  /**
   * When the bandit ends and serves its fallback. Needs a fallback variant.
   *
   * @return scheduledEndAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getScheduledEndAt() {
    return scheduledEndAt;
  }

  public void setScheduledEndAt(OffsetDateTime scheduledEndAt) {
    this.scheduledEndAt = scheduledEndAt;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes subjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * The subject type the bandit randomizes and measures by.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for the bandit. The flag's tags are added too.
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

  public ExperimentsCreateBanditV2RequestDataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Handles of the teams that own the bandit.
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

  public ExperimentsCreateBanditV2RequestDataAttributes variants(
      List<ExperimentsBanditVariantInputV2> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsBanditVariantInputV2 item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsCreateBanditV2RequestDataAttributes addVariantsItem(
      ExperimentsBanditVariantInputV2 variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * The flag variants the bandit uses. Needs <code>datadog_flag_configuration</code>. The server
   * fills in each variant's <code>key</code> and <code>name</code> from the flag.
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

  public ExperimentsCreateBanditV2RequestDataAttributes warmupSeconds(Long warmupSeconds) {
    this.warmupSeconds = warmupSeconds;
    return this;
  }

  /**
   * How long the bandit serves its arms equally after it starts, in seconds. Defaults to no warmup.
   *
   * @return warmupSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARMUP_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * @return ExperimentsCreateBanditV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsCreateBanditV2RequestDataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsCreateBanditV2RequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateBanditV2RequestDataAttributes experimentsCreateBanditV2RequestDataAttributes =
        (ExperimentsCreateBanditV2RequestDataAttributes) o;
    return Objects.equals(
            this.aggregationWindowSeconds,
            experimentsCreateBanditV2RequestDataAttributes.aggregationWindowSeconds)
        && Objects.equals(
            this.bayesianPrior, experimentsCreateBanditV2RequestDataAttributes.bayesianPrior)
        && Objects.equals(
            this.datadogFlagConfiguration,
            experimentsCreateBanditV2RequestDataAttributes.datadogFlagConfiguration)
        && Objects.equals(
            this.description, experimentsCreateBanditV2RequestDataAttributes.description)
        && Objects.equals(
            this.exposureSqlModelId,
            experimentsCreateBanditV2RequestDataAttributes.exposureSqlModelId)
        && Objects.equals(
            this.lookbackSeconds, experimentsCreateBanditV2RequestDataAttributes.lookbackSeconds)
        && Objects.equals(this.metricId, experimentsCreateBanditV2RequestDataAttributes.metricId)
        && Objects.equals(this.name, experimentsCreateBanditV2RequestDataAttributes.name)
        && Objects.equals(
            this.refreshScheduleId,
            experimentsCreateBanditV2RequestDataAttributes.refreshScheduleId)
        && Objects.equals(
            this.scheduledEndAt, experimentsCreateBanditV2RequestDataAttributes.scheduledEndAt)
        && Objects.equals(
            this.subjectTypeId, experimentsCreateBanditV2RequestDataAttributes.subjectTypeId)
        && Objects.equals(this.tags, experimentsCreateBanditV2RequestDataAttributes.tags)
        && Objects.equals(this.teams, experimentsCreateBanditV2RequestDataAttributes.teams)
        && Objects.equals(this.variants, experimentsCreateBanditV2RequestDataAttributes.variants)
        && Objects.equals(
            this.warmupSeconds, experimentsCreateBanditV2RequestDataAttributes.warmupSeconds)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateBanditV2RequestDataAttributes.additionalProperties);
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
    sb.append("class ExperimentsCreateBanditV2RequestDataAttributes {\n");
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
