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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Replace a published protocol template. Omitted optional template fields are cleared. Omitted
 * enforcement and migration_metadata are preserved. Enabled limits require their values; allocation
 * settings require environment_id.
 */
@JsonPropertyOrder({
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ANALYSIS_PLAN,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes
      .JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ASSIGNMENT_SOURCE_ID,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_DEFAULT_DURATION_DAYS,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ENFORCEMENT,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_EXPOSURE_SCHEDULE,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes
      .JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes
      .JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_METRIC_GROUPS,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_METRIC_LIMIT,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MINIMUM_DURATION_UNIT,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MINIMUM_DURATION_VALUE,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_PRIMARY_METRIC_ID,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsReplaceExperimentProtocolRequestDataAttributes.JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsReplaceExperimentProtocolRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYSIS_PLAN = "analysis_plan";
  private JsonNullable<ExperimentsProtocolAnalysisPlanInput> analysisPlan =
      JsonNullable.<ExperimentsProtocolAnalysisPlanInput>undefined();

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES =
      "assignment_source_default_properties";
  private List<
          ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
      assignmentSourceDefaultProperties = null;

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE_ID = "assignment_source_id";
  private JsonNullable<UUID> assignmentSourceId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_DEFAULT_DURATION_DAYS = "default_duration_days";
  private JsonNullable<Long> defaultDurationDays = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ENFORCEMENT = "enforcement";
  private ExperimentsReplaceProtocolEnforcementInput enforcement;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private JsonNullable<UUID> environmentId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_EXPOSURE_SCHEDULE = "exposure_schedule";
  private JsonNullable<ExperimentsProtocolExposureScheduleInput> exposureSchedule =
      JsonNullable.<ExperimentsProtocolExposureScheduleInput>undefined();

  public static final String JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START =
      "is_duration_required_to_start";
  private Boolean isDurationRequiredToStart;

  public static final String JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED = "is_equal_split_enforced";
  private Boolean isEqualSplitEnforced;

  public static final String JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED = "is_metric_limit_enabled";
  private Boolean isMetricLimitEnabled;

  public static final String JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED =
      "is_minimum_duration_enabled";
  private Boolean isMinimumDurationEnabled;

  public static final String JSON_PROPERTY_METRIC_GROUPS = "metric_groups";
  private List<ExperimentsProtocolMetricGroupInput> metricGroups = new ArrayList<>();

  public static final String JSON_PROPERTY_METRIC_LIMIT = "metric_limit";
  private JsonNullable<Long> metricLimit = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private JsonNullable<Map<String, Object>> migrationMetadata =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_MINIMUM_DURATION_UNIT = "minimum_duration_unit";
  private JsonNullable<String> minimumDurationUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MINIMUM_DURATION_VALUE = "minimum_duration_value";
  private JsonNullable<Long> minimumDurationValue = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PRIMARY_METRIC_ID = "primary_metric_id";
  private JsonNullable<UUID> primaryMetricId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private UUID subjectTypeId;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<ExperimentsProtocolTargetingRuleInput> targetingRules = null;

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes() {}

  @JsonCreator
  public ExperimentsReplaceExperimentProtocolRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START)
          Boolean isDurationRequiredToStart,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED)
          Boolean isEqualSplitEnforced,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED)
          Boolean isMetricLimitEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED)
          Boolean isMinimumDurationEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_GROUPS)
          List<ExperimentsProtocolMetricGroupInput> metricGroups,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPE_ID) UUID subjectTypeId) {
    this.isDurationRequiredToStart = isDurationRequiredToStart;
    this.isEqualSplitEnforced = isEqualSplitEnforced;
    this.isMetricLimitEnabled = isMetricLimitEnabled;
    this.isMinimumDurationEnabled = isMinimumDurationEnabled;
    this.metricGroups = metricGroups;
    for (ExperimentsProtocolMetricGroupInput item : metricGroups) {
      this.unparsed |= item.unparsed;
    }
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes analysisPlan(
      ExperimentsProtocolAnalysisPlanInput analysisPlan) {
    this.analysisPlan = JsonNullable.<ExperimentsProtocolAnalysisPlanInput>of(analysisPlan);
    return this;
  }

  /**
   * Statistical settings. Use <code>default_duration_days</code> for duration; <code>
   * target_duration_days</code> is not accepted here.
   *
   * @return analysisPlan
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsProtocolAnalysisPlanInput getAnalysisPlan() {
    return analysisPlan.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANALYSIS_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsProtocolAnalysisPlanInput> getAnalysisPlan_JsonNullable() {
    return analysisPlan;
  }

  @JsonProperty(JSON_PROPERTY_ANALYSIS_PLAN)
  public void setAnalysisPlan_JsonNullable(
      JsonNullable<ExperimentsProtocolAnalysisPlanInput> analysisPlan) {
    this.analysisPlan = analysisPlan;
  }

  public void setAnalysisPlan(ExperimentsProtocolAnalysisPlanInput analysisPlan) {
    this.analysisPlan = JsonNullable.<ExperimentsProtocolAnalysisPlanInput>of(analysisPlan);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes
      assignmentSourceDefaultProperties(
          List<
                  ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
              assignmentSourceDefaultProperties) {
    this.assignmentSourceDefaultProperties = assignmentSourceDefaultProperties;
    if (assignmentSourceDefaultProperties != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems
          item : assignmentSourceDefaultProperties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes
      addAssignmentSourceDefaultPropertiesItem(
          ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems
              assignmentSourceDefaultPropertiesItem) {
    if (this.assignmentSourceDefaultProperties == null) {
      this.assignmentSourceDefaultProperties = new ArrayList<>();
    }
    this.assignmentSourceDefaultProperties.add(assignmentSourceDefaultPropertiesItem);
    this.unparsed |= assignmentSourceDefaultPropertiesItem.unparsed;
    return this;
  }

  /**
   * Assignment properties.
   *
   * @return assignmentSourceDefaultProperties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
      getAssignmentSourceDefaultProperties() {
    return assignmentSourceDefaultProperties;
  }

  public void setAssignmentSourceDefaultProperties(
      List<ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
          assignmentSourceDefaultProperties) {
    this.assignmentSourceDefaultProperties = assignmentSourceDefaultProperties;
    if (assignmentSourceDefaultProperties != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems
          item : assignmentSourceDefaultProperties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes assignmentSourceId(
      UUID assignmentSourceId) {
    this.assignmentSourceId = JsonNullable.<UUID>of(assignmentSourceId);
    return this;
  }

  /**
   * ID of the assignment source selected by the protocol.
   *
   * @return assignmentSourceId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getAssignmentSourceId() {
    return assignmentSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getAssignmentSourceId_JsonNullable() {
    return assignmentSourceId;
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_ID)
  public void setAssignmentSourceId_JsonNullable(JsonNullable<UUID> assignmentSourceId) {
    this.assignmentSourceId = assignmentSourceId;
  }

  public void setAssignmentSourceId(UUID assignmentSourceId) {
    this.assignmentSourceId = JsonNullable.<UUID>of(assignmentSourceId);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes defaultDurationDays(
      Long defaultDurationDays) {
    this.defaultDurationDays = JsonNullable.<Long>of(defaultDurationDays);
    return this;
  }

  /**
   * Default experiment duration supplied by the protocol, in days. minimum: 0
   *
   * @return defaultDurationDays
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getDefaultDurationDays() {
    return defaultDurationDays.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_DURATION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getDefaultDurationDays_JsonNullable() {
    return defaultDurationDays;
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_DURATION_DAYS)
  public void setDefaultDurationDays_JsonNullable(JsonNullable<Long> defaultDurationDays) {
    this.defaultDurationDays = defaultDurationDays;
  }

  public void setDefaultDurationDays(Long defaultDurationDays) {
    this.defaultDurationDays = JsonNullable.<Long>of(defaultDurationDays);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes enforcement(
      ExperimentsReplaceProtocolEnforcementInput enforcement) {
    this.enforcement = enforcement;
    this.unparsed |= enforcement.unparsed;
    return this;
  }

  /**
   * Complete lock map. Omit this object to preserve current locks. Null is rejected; every field is
   * required.
   *
   * @return enforcement
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsReplaceProtocolEnforcementInput getEnforcement() {
    return enforcement;
  }

  public void setEnforcement(ExperimentsReplaceProtocolEnforcementInput enforcement) {
    this.enforcement = enforcement;
    if (enforcement != null) {
      this.unparsed |= enforcement.unparsed;
    }
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes environmentId(
      UUID environmentId) {
    this.environmentId = JsonNullable.<UUID>of(environmentId);
    return this;
  }

  /**
   * ID of the feature flag environment used by the experiment.
   *
   * @return environmentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getEnvironmentId() {
    return environmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getEnvironmentId_JsonNullable() {
    return environmentId;
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  public void setEnvironmentId_JsonNullable(JsonNullable<UUID> environmentId) {
    this.environmentId = environmentId;
  }

  public void setEnvironmentId(UUID environmentId) {
    this.environmentId = JsonNullable.<UUID>of(environmentId);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes exposureSchedule(
      ExperimentsProtocolExposureScheduleInput exposureSchedule) {
    this.exposureSchedule =
        JsonNullable.<ExperimentsProtocolExposureScheduleInput>of(exposureSchedule);
    return this;
  }

  /**
   * Traffic schedule. Publishing and replacement require <code>NO_ROLLOUT</code> with exactly one
   * step, or <code>UNIFORM_INTERVALS</code> with a positive selection interval and at least one
   * step. Requires <code>environment_id</code>.
   *
   * @return exposureSchedule
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsProtocolExposureScheduleInput getExposureSchedule() {
    return exposureSchedule.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsProtocolExposureScheduleInput> getExposureSchedule_JsonNullable() {
    return exposureSchedule;
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  public void setExposureSchedule_JsonNullable(
      JsonNullable<ExperimentsProtocolExposureScheduleInput> exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
  }

  public void setExposureSchedule(ExperimentsProtocolExposureScheduleInput exposureSchedule) {
    this.exposureSchedule =
        JsonNullable.<ExperimentsProtocolExposureScheduleInput>of(exposureSchedule);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes isDurationRequiredToStart(
      Boolean isDurationRequiredToStart) {
    this.isDurationRequiredToStart = isDurationRequiredToStart;
    return this;
  }

  /**
   * Whether the protocol requires a duration before an experiment can start.
   *
   * @return isDurationRequiredToStart
   */
  @JsonProperty(JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsDurationRequiredToStart() {
    return isDurationRequiredToStart;
  }

  public void setIsDurationRequiredToStart(Boolean isDurationRequiredToStart) {
    this.isDurationRequiredToStart = isDurationRequiredToStart;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes isEqualSplitEnforced(
      Boolean isEqualSplitEnforced) {
    this.isEqualSplitEnforced = isEqualSplitEnforced;
    return this;
  }

  /**
   * Whether the protocol requires equal traffic allocation across variants.
   *
   * @return isEqualSplitEnforced
   */
  @JsonProperty(JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsEqualSplitEnforced() {
    return isEqualSplitEnforced;
  }

  public void setIsEqualSplitEnforced(Boolean isEqualSplitEnforced) {
    this.isEqualSplitEnforced = isEqualSplitEnforced;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes isMetricLimitEnabled(
      Boolean isMetricLimitEnabled) {
    this.isMetricLimitEnabled = isMetricLimitEnabled;
    return this;
  }

  /**
   * Whether the protocol limits the number of metrics.
   *
   * @return isMetricLimitEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMetricLimitEnabled() {
    return isMetricLimitEnabled;
  }

  public void setIsMetricLimitEnabled(Boolean isMetricLimitEnabled) {
    this.isMetricLimitEnabled = isMetricLimitEnabled;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes isMinimumDurationEnabled(
      Boolean isMinimumDurationEnabled) {
    this.isMinimumDurationEnabled = isMinimumDurationEnabled;
    return this;
  }

  /**
   * Whether the protocol enforces a minimum experiment duration.
   *
   * @return isMinimumDurationEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsMinimumDurationEnabled() {
    return isMinimumDurationEnabled;
  }

  public void setIsMinimumDurationEnabled(Boolean isMinimumDurationEnabled) {
    this.isMinimumDurationEnabled = isMinimumDurationEnabled;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes metricGroups(
      List<ExperimentsProtocolMetricGroupInput> metricGroups) {
    this.metricGroups = metricGroups;
    for (ExperimentsProtocolMetricGroupInput item : metricGroups) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes addMetricGroupsItem(
      ExperimentsProtocolMetricGroupInput metricGroupsItem) {
    this.metricGroups.add(metricGroupsItem);
    this.unparsed |= metricGroupsItem.unparsed;
    return this;
  }

  /**
   * Metric groups.
   *
   * @return metricGroups
   */
  @JsonProperty(JSON_PROPERTY_METRIC_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsProtocolMetricGroupInput> getMetricGroups() {
    return metricGroups;
  }

  public void setMetricGroups(List<ExperimentsProtocolMetricGroupInput> metricGroups) {
    this.metricGroups = metricGroups;
    if (metricGroups != null) {
      for (ExperimentsProtocolMetricGroupInput item : metricGroups) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes metricLimit(Long metricLimit) {
    this.metricLimit = JsonNullable.<Long>of(metricLimit);
    return this;
  }

  /**
   * Maximum number of metrics allowed by the protocol. minimum: 0
   *
   * @return metricLimit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMetricLimit() {
    return metricLimit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMetricLimit_JsonNullable() {
    return metricLimit;
  }

  @JsonProperty(JSON_PROPERTY_METRIC_LIMIT)
  public void setMetricLimit_JsonNullable(JsonNullable<Long> metricLimit) {
    this.metricLimit = metricLimit;
  }

  public void setMetricLimit(Long metricLimit) {
    this.metricLimit = JsonNullable.<Long>of(metricLimit);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes migrationMetadata(
      Map<String, Object> migrationMetadata) {
    this.migrationMetadata = JsonNullable.<Map<String, Object>>of(migrationMetadata);
    return this;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes putMigrationMetadataItem(
      String key, Object migrationMetadataItem) {
    if (this.migrationMetadata == null || !this.migrationMetadata.isPresent()) {
      this.migrationMetadata = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.migrationMetadata.get().put(key, migrationMetadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Metadata for imported resources. Must encode to at most 4096 bytes. Null clears it; omission
   * preserves it on update.
   *
   * @return migrationMetadata
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMigrationMetadata() {
    return migrationMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getMigrationMetadata_JsonNullable() {
    return migrationMetadata;
  }

  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  public void setMigrationMetadata_JsonNullable(
      JsonNullable<Map<String, Object>> migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
  }

  public void setMigrationMetadata(Map<String, Object> migrationMetadata) {
    this.migrationMetadata = JsonNullable.<Map<String, Object>>of(migrationMetadata);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes minimumDurationUnit(
      String minimumDurationUnit) {
    this.minimumDurationUnit = JsonNullable.<String>of(minimumDurationUnit);
    return this;
  }

  /**
   * Minimum duration unit, DAYS or WEEKS.
   *
   * @return minimumDurationUnit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMinimumDurationUnit() {
    return minimumDurationUnit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM_DURATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMinimumDurationUnit_JsonNullable() {
    return minimumDurationUnit;
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM_DURATION_UNIT)
  public void setMinimumDurationUnit_JsonNullable(JsonNullable<String> minimumDurationUnit) {
    this.minimumDurationUnit = minimumDurationUnit;
  }

  public void setMinimumDurationUnit(String minimumDurationUnit) {
    this.minimumDurationUnit = JsonNullable.<String>of(minimumDurationUnit);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes minimumDurationValue(
      Long minimumDurationValue) {
    this.minimumDurationValue = JsonNullable.<Long>of(minimumDurationValue);
    return this;
  }

  /**
   * Minimum experiment duration in the specified unit. minimum: 0
   *
   * @return minimumDurationValue
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getMinimumDurationValue() {
    return minimumDurationValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM_DURATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getMinimumDurationValue_JsonNullable() {
    return minimumDurationValue;
  }

  @JsonProperty(JSON_PROPERTY_MINIMUM_DURATION_VALUE)
  public void setMinimumDurationValue_JsonNullable(JsonNullable<Long> minimumDurationValue) {
    this.minimumDurationValue = minimumDurationValue;
  }

  public void setMinimumDurationValue(Long minimumDurationValue) {
    this.minimumDurationValue = JsonNullable.<Long>of(minimumDurationValue);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes primaryMetricId(
      UUID primaryMetricId) {
    this.primaryMetricId = JsonNullable.<UUID>of(primaryMetricId);
    return this;
  }

  /**
   * ID of the primary metric supplied by the protocol.
   *
   * @return primaryMetricId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public UUID getPrimaryMetricId() {
    return primaryMetricId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<UUID> getPrimaryMetricId_JsonNullable() {
    return primaryMetricId;
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC_ID)
  public void setPrimaryMetricId_JsonNullable(JsonNullable<UUID> primaryMetricId) {
    this.primaryMetricId = primaryMetricId;
  }

  public void setPrimaryMetricId(UUID primaryMetricId) {
    this.primaryMetricId = JsonNullable.<UUID>of(primaryMetricId);
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes subjectTypeId(
      UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * ID of the subject type used by this configuration.
   *
   * @return subjectTypeId
   */
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes targetingRules(
      List<ExperimentsProtocolTargetingRuleInput> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsProtocolTargetingRuleInput item : targetingRules) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsReplaceExperimentProtocolRequestDataAttributes addTargetingRulesItem(
      ExperimentsProtocolTargetingRuleInput targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new ArrayList<>();
    }
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Targeting rules.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsProtocolTargetingRuleInput> getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(List<ExperimentsProtocolTargetingRuleInput> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsProtocolTargetingRuleInput item : targetingRules) {
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
   * @return ExperimentsReplaceExperimentProtocolRequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsReplaceExperimentProtocolRequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsReplaceExperimentProtocolRequestDataAttributes object is equal
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
    ExperimentsReplaceExperimentProtocolRequestDataAttributes
        experimentsReplaceExperimentProtocolRequestDataAttributes =
            (ExperimentsReplaceExperimentProtocolRequestDataAttributes) o;
    return Objects.equals(
            this.analysisPlan,
            experimentsReplaceExperimentProtocolRequestDataAttributes.analysisPlan)
        && Objects.equals(
            this.assignmentSourceDefaultProperties,
            experimentsReplaceExperimentProtocolRequestDataAttributes
                .assignmentSourceDefaultProperties)
        && Objects.equals(
            this.assignmentSourceId,
            experimentsReplaceExperimentProtocolRequestDataAttributes.assignmentSourceId)
        && Objects.equals(
            this.defaultDurationDays,
            experimentsReplaceExperimentProtocolRequestDataAttributes.defaultDurationDays)
        && Objects.equals(
            this.enforcement, experimentsReplaceExperimentProtocolRequestDataAttributes.enforcement)
        && Objects.equals(
            this.environmentId,
            experimentsReplaceExperimentProtocolRequestDataAttributes.environmentId)
        && Objects.equals(
            this.exposureSchedule,
            experimentsReplaceExperimentProtocolRequestDataAttributes.exposureSchedule)
        && Objects.equals(
            this.isDurationRequiredToStart,
            experimentsReplaceExperimentProtocolRequestDataAttributes.isDurationRequiredToStart)
        && Objects.equals(
            this.isEqualSplitEnforced,
            experimentsReplaceExperimentProtocolRequestDataAttributes.isEqualSplitEnforced)
        && Objects.equals(
            this.isMetricLimitEnabled,
            experimentsReplaceExperimentProtocolRequestDataAttributes.isMetricLimitEnabled)
        && Objects.equals(
            this.isMinimumDurationEnabled,
            experimentsReplaceExperimentProtocolRequestDataAttributes.isMinimumDurationEnabled)
        && Objects.equals(
            this.metricGroups,
            experimentsReplaceExperimentProtocolRequestDataAttributes.metricGroups)
        && Objects.equals(
            this.metricLimit, experimentsReplaceExperimentProtocolRequestDataAttributes.metricLimit)
        && Objects.equals(
            this.migrationMetadata,
            experimentsReplaceExperimentProtocolRequestDataAttributes.migrationMetadata)
        && Objects.equals(
            this.minimumDurationUnit,
            experimentsReplaceExperimentProtocolRequestDataAttributes.minimumDurationUnit)
        && Objects.equals(
            this.minimumDurationValue,
            experimentsReplaceExperimentProtocolRequestDataAttributes.minimumDurationValue)
        && Objects.equals(
            this.primaryMetricId,
            experimentsReplaceExperimentProtocolRequestDataAttributes.primaryMetricId)
        && Objects.equals(
            this.subjectTypeId,
            experimentsReplaceExperimentProtocolRequestDataAttributes.subjectTypeId)
        && Objects.equals(
            this.targetingRules,
            experimentsReplaceExperimentProtocolRequestDataAttributes.targetingRules)
        && Objects.equals(
            this.additionalProperties,
            experimentsReplaceExperimentProtocolRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        analysisPlan,
        assignmentSourceDefaultProperties,
        assignmentSourceId,
        defaultDurationDays,
        enforcement,
        environmentId,
        exposureSchedule,
        isDurationRequiredToStart,
        isEqualSplitEnforced,
        isMetricLimitEnabled,
        isMinimumDurationEnabled,
        metricGroups,
        metricLimit,
        migrationMetadata,
        minimumDurationUnit,
        minimumDurationValue,
        primaryMetricId,
        subjectTypeId,
        targetingRules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsReplaceExperimentProtocolRequestDataAttributes {\n");
    sb.append("    analysisPlan: ").append(toIndentedString(analysisPlan)).append("\n");
    sb.append("    assignmentSourceDefaultProperties: ")
        .append(toIndentedString(assignmentSourceDefaultProperties))
        .append("\n");
    sb.append("    assignmentSourceId: ").append(toIndentedString(assignmentSourceId)).append("\n");
    sb.append("    defaultDurationDays: ")
        .append(toIndentedString(defaultDurationDays))
        .append("\n");
    sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    exposureSchedule: ").append(toIndentedString(exposureSchedule)).append("\n");
    sb.append("    isDurationRequiredToStart: ")
        .append(toIndentedString(isDurationRequiredToStart))
        .append("\n");
    sb.append("    isEqualSplitEnforced: ")
        .append(toIndentedString(isEqualSplitEnforced))
        .append("\n");
    sb.append("    isMetricLimitEnabled: ")
        .append(toIndentedString(isMetricLimitEnabled))
        .append("\n");
    sb.append("    isMinimumDurationEnabled: ")
        .append(toIndentedString(isMinimumDurationEnabled))
        .append("\n");
    sb.append("    metricGroups: ").append(toIndentedString(metricGroups)).append("\n");
    sb.append("    metricLimit: ").append(toIndentedString(metricLimit)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    minimumDurationUnit: ")
        .append(toIndentedString(minimumDurationUnit))
        .append("\n");
    sb.append("    minimumDurationValue: ")
        .append(toIndentedString(minimumDurationValue))
        .append("\n");
    sb.append("    primaryMetricId: ").append(toIndentedString(primaryMetricId)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
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
