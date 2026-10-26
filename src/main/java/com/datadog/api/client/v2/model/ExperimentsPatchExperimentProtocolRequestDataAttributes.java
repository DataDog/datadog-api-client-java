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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Partial protocol update. Omitted attributes remain unchanged. Published protocols accept only
 * name, description, and migration_metadata; archived protocols reject updates.
 */
@JsonPropertyOrder({
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ANALYSIS_PLAN,
  ExperimentsPatchExperimentProtocolRequestDataAttributes
      .JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ASSIGNMENT_SOURCE_ID,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_DEFAULT_DURATION_DAYS,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ENFORCEMENT,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_EXPOSURE_SCHEDULE,
  ExperimentsPatchExperimentProtocolRequestDataAttributes
      .JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_METRIC_GROUPS,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_METRIC_LIMIT,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MINIMUM_DURATION_UNIT,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_MINIMUM_DURATION_VALUE,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_PRIMARY_METRIC_ID,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsPatchExperimentProtocolRequestDataAttributes.JSON_PROPERTY_TARGETING_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentProtocolRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYSIS_PLAN = "analysis_plan";
  private JsonNullable<ExperimentsPatchProtocolAnalysisPlanInput> analysisPlan =
      JsonNullable.<ExperimentsPatchProtocolAnalysisPlanInput>undefined();

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES =
      "assignment_source_default_properties";
  private JsonNullable<
          List<
              ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
      assignmentSourceDefaultProperties =
          JsonNullable
              .<List<
                      ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
                  undefined();

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE_ID = "assignment_source_id";
  private JsonNullable<String> assignmentSourceId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_DURATION_DAYS = "default_duration_days";
  private JsonNullable<Long> defaultDurationDays = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENFORCEMENT = "enforcement";
  private JsonNullable<ExperimentsPatchProtocolEnforcementInput> enforcement =
      JsonNullable.<ExperimentsPatchProtocolEnforcementInput>undefined();

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private JsonNullable<String> environmentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXPOSURE_SCHEDULE = "exposure_schedule";
  private JsonNullable<ExperimentsPatchProtocolExposureScheduleInput> exposureSchedule =
      JsonNullable.<ExperimentsPatchProtocolExposureScheduleInput>undefined();

  public static final String JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START =
      "is_duration_required_to_start";
  private JsonNullable<Boolean> isDurationRequiredToStart = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED = "is_equal_split_enforced";
  private JsonNullable<Boolean> isEqualSplitEnforced = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED = "is_metric_limit_enabled";
  private JsonNullable<Boolean> isMetricLimitEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED =
      "is_minimum_duration_enabled";
  private JsonNullable<Boolean> isMinimumDurationEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_METRIC_GROUPS = "metric_groups";
  private JsonNullable<List<ExperimentsProtocolMetricGroupInput>> metricGroups =
      JsonNullable.<List<ExperimentsProtocolMetricGroupInput>>undefined();

  public static final String JSON_PROPERTY_METRIC_LIMIT = "metric_limit";
  private JsonNullable<Long> metricLimit = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private JsonNullable<Map<String, Object>> migrationMetadata =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_MINIMUM_DURATION_UNIT = "minimum_duration_unit";
  private JsonNullable<String> minimumDurationUnit = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MINIMUM_DURATION_VALUE = "minimum_duration_value";
  private JsonNullable<Long> minimumDurationValue = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRIMARY_METRIC_ID = "primary_metric_id";
  private JsonNullable<String> primaryMetricId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private JsonNullable<String> subjectTypeId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private JsonNullable<List<ExperimentsProtocolTargetingRuleInput>> targetingRules =
      JsonNullable.<List<ExperimentsProtocolTargetingRuleInput>>undefined();

  public ExperimentsPatchExperimentProtocolRequestDataAttributes analysisPlan(
      ExperimentsPatchProtocolAnalysisPlanInput analysisPlan) {
    this.analysisPlan = JsonNullable.<ExperimentsPatchProtocolAnalysisPlanInput>of(analysisPlan);
    return this;
  }

  /**
   * Partial statistical settings. Omitted fields remain unchanged. Null clears the whole plan. Null
   * clears nullable fields; null or an empty string clears confidence_interval_method.
   *
   * @return analysisPlan
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsPatchProtocolAnalysisPlanInput getAnalysisPlan() {
    return analysisPlan.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANALYSIS_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsPatchProtocolAnalysisPlanInput> getAnalysisPlan_JsonNullable() {
    return analysisPlan;
  }

  @JsonProperty(JSON_PROPERTY_ANALYSIS_PLAN)
  public void setAnalysisPlan_JsonNullable(
      JsonNullable<ExperimentsPatchProtocolAnalysisPlanInput> analysisPlan) {
    this.analysisPlan = analysisPlan;
  }

  public void setAnalysisPlan(ExperimentsPatchProtocolAnalysisPlanInput analysisPlan) {
    this.analysisPlan = JsonNullable.<ExperimentsPatchProtocolAnalysisPlanInput>of(analysisPlan);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes assignmentSourceDefaultProperties(
      List<ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
          assignmentSourceDefaultProperties) {
    this.assignmentSourceDefaultProperties =
        JsonNullable
            .<List<
                    ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
                of(assignmentSourceDefaultProperties);
    return this;
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes
      addAssignmentSourceDefaultPropertiesItem(
          ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems
              assignmentSourceDefaultPropertiesItem) {
    if (this.assignmentSourceDefaultProperties == null
        || !this.assignmentSourceDefaultProperties.isPresent()) {
      this.assignmentSourceDefaultProperties =
          JsonNullable
              .<List<
                      ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
                  of(new ArrayList<>());
    }
    try {
      this.assignmentSourceDefaultProperties.get().add(assignmentSourceDefaultPropertiesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Assignment properties. Omission or null preserves them; an array replaces them.
   *
   * @return assignmentSourceDefaultProperties
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
      getAssignmentSourceDefaultProperties() {
    return assignmentSourceDefaultProperties.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<
          List<
              ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
      getAssignmentSourceDefaultProperties_JsonNullable() {
    return assignmentSourceDefaultProperties;
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES)
  public void setAssignmentSourceDefaultProperties_JsonNullable(
      JsonNullable<
              List<
                  ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
          assignmentSourceDefaultProperties) {
    this.assignmentSourceDefaultProperties = assignmentSourceDefaultProperties;
  }

  public void setAssignmentSourceDefaultProperties(
      List<ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
          assignmentSourceDefaultProperties) {
    this.assignmentSourceDefaultProperties =
        JsonNullable
            .<List<
                    ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>>
                of(assignmentSourceDefaultProperties);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes assignmentSourceId(
      String assignmentSourceId) {
    this.assignmentSourceId = JsonNullable.<String>of(assignmentSourceId);
    return this;
  }

  /**
   * ID of the assignment source selected by the protocol. Omission or null keeps the current value.
   * An empty string clears it.
   *
   * @return assignmentSourceId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAssignmentSourceId() {
    return assignmentSourceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAssignmentSourceId_JsonNullable() {
    return assignmentSourceId;
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_ID)
  public void setAssignmentSourceId_JsonNullable(JsonNullable<String> assignmentSourceId) {
    this.assignmentSourceId = assignmentSourceId;
  }

  public void setAssignmentSourceId(String assignmentSourceId) {
    this.assignmentSourceId = JsonNullable.<String>of(assignmentSourceId);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes defaultDurationDays(
      Long defaultDurationDays) {
    this.defaultDurationDays = JsonNullable.<Long>of(defaultDurationDays);
    return this;
  }

  /**
   * Default experiment duration supplied by the protocol, in days. Omission preserves it; null
   * clears it. Sets analysis_plan.target_duration_days on experiments created from this protocol.
   * minimum: 0
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

  public ExperimentsPatchExperimentProtocolRequestDataAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Description. Empty string clears it; omission or null preserves it.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes enforcement(
      ExperimentsPatchProtocolEnforcementInput enforcement) {
    this.enforcement = JsonNullable.<ExperimentsPatchProtocolEnforcementInput>of(enforcement);
    return this;
  }

  /**
   * Partial lock map. Omitted fields remain unchanged. Null clears the whole map. Empty or null
   * field values become <code>EDITABLE</code>, except <code>subject_type</code>, <code>flag_source
   * </code>, and <code>confidence_interval_method</code>, which remain <code>LOCKED</code>.
   *
   * @return enforcement
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsPatchProtocolEnforcementInput getEnforcement() {
    return enforcement.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENFORCEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsPatchProtocolEnforcementInput> getEnforcement_JsonNullable() {
    return enforcement;
  }

  @JsonProperty(JSON_PROPERTY_ENFORCEMENT)
  public void setEnforcement_JsonNullable(
      JsonNullable<ExperimentsPatchProtocolEnforcementInput> enforcement) {
    this.enforcement = enforcement;
  }

  public void setEnforcement(ExperimentsPatchProtocolEnforcementInput enforcement) {
    this.enforcement = JsonNullable.<ExperimentsPatchProtocolEnforcementInput>of(enforcement);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes environmentId(
      String environmentId) {
    this.environmentId = JsonNullable.<String>of(environmentId);
    return this;
  }

  /**
   * ID of the feature flag environment used by the experiment. Omission or null keeps the current
   * value. An empty string clears it.
   *
   * @return environmentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getEnvironmentId() {
    return environmentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEnvironmentId_JsonNullable() {
    return environmentId;
  }

  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  public void setEnvironmentId_JsonNullable(JsonNullable<String> environmentId) {
    this.environmentId = environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = JsonNullable.<String>of(environmentId);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes exposureSchedule(
      ExperimentsPatchProtocolExposureScheduleInput exposureSchedule) {
    this.exposureSchedule =
        JsonNullable.<ExperimentsPatchProtocolExposureScheduleInput>of(exposureSchedule);
    return this;
  }

  /**
   * Partial traffic schedule. Omitted fields remain unchanged. Null clears the whole schedule. Null
   * clears nullable fields and rollout_steps; null sets strategy to an empty string and <code>
   * autostart</code> to false.
   *
   * @return exposureSchedule
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsPatchProtocolExposureScheduleInput getExposureSchedule() {
    return exposureSchedule.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsPatchProtocolExposureScheduleInput>
      getExposureSchedule_JsonNullable() {
    return exposureSchedule;
  }

  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  public void setExposureSchedule_JsonNullable(
      JsonNullable<ExperimentsPatchProtocolExposureScheduleInput> exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
  }

  public void setExposureSchedule(ExperimentsPatchProtocolExposureScheduleInput exposureSchedule) {
    this.exposureSchedule =
        JsonNullable.<ExperimentsPatchProtocolExposureScheduleInput>of(exposureSchedule);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes isDurationRequiredToStart(
      Boolean isDurationRequiredToStart) {
    this.isDurationRequiredToStart = JsonNullable.<Boolean>of(isDurationRequiredToStart);
    return this;
  }

  /**
   * Whether the protocol requires a duration before an experiment can start. Omission or null
   * preserves it.
   *
   * @return isDurationRequiredToStart
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsDurationRequiredToStart() {
    return isDurationRequiredToStart.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsDurationRequiredToStart_JsonNullable() {
    return isDurationRequiredToStart;
  }

  @JsonProperty(JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START)
  public void setIsDurationRequiredToStart_JsonNullable(
      JsonNullable<Boolean> isDurationRequiredToStart) {
    this.isDurationRequiredToStart = isDurationRequiredToStart;
  }

  public void setIsDurationRequiredToStart(Boolean isDurationRequiredToStart) {
    this.isDurationRequiredToStart = JsonNullable.<Boolean>of(isDurationRequiredToStart);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes isEqualSplitEnforced(
      Boolean isEqualSplitEnforced) {
    this.isEqualSplitEnforced = JsonNullable.<Boolean>of(isEqualSplitEnforced);
    return this;
  }

  /**
   * Whether the protocol requires equal traffic allocation across variants. Omission or null
   * preserves it.
   *
   * @return isEqualSplitEnforced
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsEqualSplitEnforced() {
    return isEqualSplitEnforced.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsEqualSplitEnforced_JsonNullable() {
    return isEqualSplitEnforced;
  }

  @JsonProperty(JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED)
  public void setIsEqualSplitEnforced_JsonNullable(JsonNullable<Boolean> isEqualSplitEnforced) {
    this.isEqualSplitEnforced = isEqualSplitEnforced;
  }

  public void setIsEqualSplitEnforced(Boolean isEqualSplitEnforced) {
    this.isEqualSplitEnforced = JsonNullable.<Boolean>of(isEqualSplitEnforced);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes isMetricLimitEnabled(
      Boolean isMetricLimitEnabled) {
    this.isMetricLimitEnabled = JsonNullable.<Boolean>of(isMetricLimitEnabled);
    return this;
  }

  /**
   * Whether the protocol limits the number of metrics. Omission or null preserves it.
   *
   * @return isMetricLimitEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsMetricLimitEnabled() {
    return isMetricLimitEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsMetricLimitEnabled_JsonNullable() {
    return isMetricLimitEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED)
  public void setIsMetricLimitEnabled_JsonNullable(JsonNullable<Boolean> isMetricLimitEnabled) {
    this.isMetricLimitEnabled = isMetricLimitEnabled;
  }

  public void setIsMetricLimitEnabled(Boolean isMetricLimitEnabled) {
    this.isMetricLimitEnabled = JsonNullable.<Boolean>of(isMetricLimitEnabled);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes isMinimumDurationEnabled(
      Boolean isMinimumDurationEnabled) {
    this.isMinimumDurationEnabled = JsonNullable.<Boolean>of(isMinimumDurationEnabled);
    return this;
  }

  /**
   * Whether the protocol enforces a minimum experiment duration. Omission or null preserves it.
   *
   * @return isMinimumDurationEnabled
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getIsMinimumDurationEnabled() {
    return isMinimumDurationEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getIsMinimumDurationEnabled_JsonNullable() {
    return isMinimumDurationEnabled;
  }

  @JsonProperty(JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED)
  public void setIsMinimumDurationEnabled_JsonNullable(
      JsonNullable<Boolean> isMinimumDurationEnabled) {
    this.isMinimumDurationEnabled = isMinimumDurationEnabled;
  }

  public void setIsMinimumDurationEnabled(Boolean isMinimumDurationEnabled) {
    this.isMinimumDurationEnabled = JsonNullable.<Boolean>of(isMinimumDurationEnabled);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes metricGroups(
      List<ExperimentsProtocolMetricGroupInput> metricGroups) {
    this.metricGroups = JsonNullable.<List<ExperimentsProtocolMetricGroupInput>>of(metricGroups);
    return this;
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes addMetricGroupsItem(
      ExperimentsProtocolMetricGroupInput metricGroupsItem) {
    if (this.metricGroups == null || !this.metricGroups.isPresent()) {
      this.metricGroups =
          JsonNullable.<List<ExperimentsProtocolMetricGroupInput>>of(new ArrayList<>());
    }
    try {
      this.metricGroups.get().add(metricGroupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Metric groups. Omission or null preserves them; an array replaces them.
   *
   * @return metricGroups
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ExperimentsProtocolMetricGroupInput> getMetricGroups() {
    return metricGroups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ExperimentsProtocolMetricGroupInput>> getMetricGroups_JsonNullable() {
    return metricGroups;
  }

  @JsonProperty(JSON_PROPERTY_METRIC_GROUPS)
  public void setMetricGroups_JsonNullable(
      JsonNullable<List<ExperimentsProtocolMetricGroupInput>> metricGroups) {
    this.metricGroups = metricGroups;
  }

  public void setMetricGroups(List<ExperimentsProtocolMetricGroupInput> metricGroups) {
    this.metricGroups = JsonNullable.<List<ExperimentsProtocolMetricGroupInput>>of(metricGroups);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes metricLimit(Long metricLimit) {
    this.metricLimit = JsonNullable.<Long>of(metricLimit);
    return this;
  }

  /**
   * Maximum number of metrics allowed by the protocol. Omission preserves it; null clears it.
   * minimum: 0
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

  public ExperimentsPatchExperimentProtocolRequestDataAttributes migrationMetadata(
      Map<String, Object> migrationMetadata) {
    this.migrationMetadata = JsonNullable.<Map<String, Object>>of(migrationMetadata);
    return this;
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes putMigrationMetadataItem(
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

  public ExperimentsPatchExperimentProtocolRequestDataAttributes minimumDurationUnit(
      String minimumDurationUnit) {
    this.minimumDurationUnit = JsonNullable.<String>of(minimumDurationUnit);
    return this;
  }

  /**
   * Minimum duration unit, <code>DAYS</code> or <code>WEEKS</code>. Empty string clears it.
   * Omission or null preserves it.
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

  public ExperimentsPatchExperimentProtocolRequestDataAttributes minimumDurationValue(
      Long minimumDurationValue) {
    this.minimumDurationValue = JsonNullable.<Long>of(minimumDurationValue);
    return this;
  }

  /**
   * Minimum experiment duration in the specified unit. Omission preserves it; null clears it.
   * minimum: 0
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

  public ExperimentsPatchExperimentProtocolRequestDataAttributes name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * Protocol name. Leading and trailing spaces are removed. The trimmed name must contain 1 to 255
   * characters.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes primaryMetricId(
      String primaryMetricId) {
    this.primaryMetricId = JsonNullable.<String>of(primaryMetricId);
    return this;
  }

  /**
   * ID of the primary metric supplied by the protocol. Omission or null keeps the current value. An
   * empty string clears it.
   *
   * @return primaryMetricId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrimaryMetricId() {
    return primaryMetricId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrimaryMetricId_JsonNullable() {
    return primaryMetricId;
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC_ID)
  public void setPrimaryMetricId_JsonNullable(JsonNullable<String> primaryMetricId) {
    this.primaryMetricId = primaryMetricId;
  }

  public void setPrimaryMetricId(String primaryMetricId) {
    this.primaryMetricId = JsonNullable.<String>of(primaryMetricId);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes subjectTypeId(
      String subjectTypeId) {
    this.subjectTypeId = JsonNullable.<String>of(subjectTypeId);
    return this;
  }

  /**
   * ID of the subject type used by this configuration. Omission or null keeps the current value. An
   * empty string clears it.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSubjectTypeId() {
    return subjectTypeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSubjectTypeId_JsonNullable() {
    return subjectTypeId;
  }

  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  public void setSubjectTypeId_JsonNullable(JsonNullable<String> subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public void setSubjectTypeId(String subjectTypeId) {
    this.subjectTypeId = JsonNullable.<String>of(subjectTypeId);
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes targetingRules(
      List<ExperimentsProtocolTargetingRuleInput> targetingRules) {
    this.targetingRules =
        JsonNullable.<List<ExperimentsProtocolTargetingRuleInput>>of(targetingRules);
    return this;
  }

  public ExperimentsPatchExperimentProtocolRequestDataAttributes addTargetingRulesItem(
      ExperimentsProtocolTargetingRuleInput targetingRulesItem) {
    if (this.targetingRules == null || !this.targetingRules.isPresent()) {
      this.targetingRules =
          JsonNullable.<List<ExperimentsProtocolTargetingRuleInput>>of(new ArrayList<>());
    }
    try {
      this.targetingRules.get().add(targetingRulesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Targeting rules. Omission or null preserves them; an array replaces them.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ExperimentsProtocolTargetingRuleInput> getTargetingRules() {
    return targetingRules.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ExperimentsProtocolTargetingRuleInput>>
      getTargetingRules_JsonNullable() {
    return targetingRules;
  }

  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  public void setTargetingRules_JsonNullable(
      JsonNullable<List<ExperimentsProtocolTargetingRuleInput>> targetingRules) {
    this.targetingRules = targetingRules;
  }

  public void setTargetingRules(List<ExperimentsProtocolTargetingRuleInput> targetingRules) {
    this.targetingRules =
        JsonNullable.<List<ExperimentsProtocolTargetingRuleInput>>of(targetingRules);
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
   * @return ExperimentsPatchExperimentProtocolRequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentProtocolRequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsPatchExperimentProtocolRequestDataAttributes object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchExperimentProtocolRequestDataAttributes
        experimentsPatchExperimentProtocolRequestDataAttributes =
            (ExperimentsPatchExperimentProtocolRequestDataAttributes) o;
    return Objects.equals(
            this.analysisPlan, experimentsPatchExperimentProtocolRequestDataAttributes.analysisPlan)
        && Objects.equals(
            this.assignmentSourceDefaultProperties,
            experimentsPatchExperimentProtocolRequestDataAttributes
                .assignmentSourceDefaultProperties)
        && Objects.equals(
            this.assignmentSourceId,
            experimentsPatchExperimentProtocolRequestDataAttributes.assignmentSourceId)
        && Objects.equals(
            this.defaultDurationDays,
            experimentsPatchExperimentProtocolRequestDataAttributes.defaultDurationDays)
        && Objects.equals(
            this.description, experimentsPatchExperimentProtocolRequestDataAttributes.description)
        && Objects.equals(
            this.enforcement, experimentsPatchExperimentProtocolRequestDataAttributes.enforcement)
        && Objects.equals(
            this.environmentId,
            experimentsPatchExperimentProtocolRequestDataAttributes.environmentId)
        && Objects.equals(
            this.exposureSchedule,
            experimentsPatchExperimentProtocolRequestDataAttributes.exposureSchedule)
        && Objects.equals(
            this.isDurationRequiredToStart,
            experimentsPatchExperimentProtocolRequestDataAttributes.isDurationRequiredToStart)
        && Objects.equals(
            this.isEqualSplitEnforced,
            experimentsPatchExperimentProtocolRequestDataAttributes.isEqualSplitEnforced)
        && Objects.equals(
            this.isMetricLimitEnabled,
            experimentsPatchExperimentProtocolRequestDataAttributes.isMetricLimitEnabled)
        && Objects.equals(
            this.isMinimumDurationEnabled,
            experimentsPatchExperimentProtocolRequestDataAttributes.isMinimumDurationEnabled)
        && Objects.equals(
            this.metricGroups, experimentsPatchExperimentProtocolRequestDataAttributes.metricGroups)
        && Objects.equals(
            this.metricLimit, experimentsPatchExperimentProtocolRequestDataAttributes.metricLimit)
        && Objects.equals(
            this.migrationMetadata,
            experimentsPatchExperimentProtocolRequestDataAttributes.migrationMetadata)
        && Objects.equals(
            this.minimumDurationUnit,
            experimentsPatchExperimentProtocolRequestDataAttributes.minimumDurationUnit)
        && Objects.equals(
            this.minimumDurationValue,
            experimentsPatchExperimentProtocolRequestDataAttributes.minimumDurationValue)
        && Objects.equals(this.name, experimentsPatchExperimentProtocolRequestDataAttributes.name)
        && Objects.equals(
            this.primaryMetricId,
            experimentsPatchExperimentProtocolRequestDataAttributes.primaryMetricId)
        && Objects.equals(
            this.subjectTypeId,
            experimentsPatchExperimentProtocolRequestDataAttributes.subjectTypeId)
        && Objects.equals(
            this.targetingRules,
            experimentsPatchExperimentProtocolRequestDataAttributes.targetingRules)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentProtocolRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        analysisPlan,
        assignmentSourceDefaultProperties,
        assignmentSourceId,
        defaultDurationDays,
        description,
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
        name,
        primaryMetricId,
        subjectTypeId,
        targetingRules,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchExperimentProtocolRequestDataAttributes {\n");
    sb.append("    analysisPlan: ").append(toIndentedString(analysisPlan)).append("\n");
    sb.append("    assignmentSourceDefaultProperties: ")
        .append(toIndentedString(assignmentSourceDefaultProperties))
        .append("\n");
    sb.append("    assignmentSourceId: ").append(toIndentedString(assignmentSourceId)).append("\n");
    sb.append("    defaultDurationDays: ")
        .append(toIndentedString(defaultDurationDays))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
