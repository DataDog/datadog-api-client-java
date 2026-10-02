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

/** Settings and defaults supplied by the protocol. */
@JsonPropertyOrder({
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_ANALYSIS_PLAN,
  ExperimentsPublicProtocolResponseDataAttributes
      .JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_ASSIGNMENT_SOURCE_ID,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_DEFAULT_DURATION_DAYS,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_ENFORCEMENT,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_ENVIRONMENT_ID,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_EXPOSURE_SCHEDULE,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_METRIC_GROUPS,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_METRIC_LIMIT,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_MINIMUM_DURATION_UNIT,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_MINIMUM_DURATION_VALUE,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_PRIMARY_METRIC,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_PRIMARY_METRIC_ID,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_PUBLISHED_AT,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_STATUS,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_SUBJECT_TYPE,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_TARGETING_RULES,
  ExperimentsPublicProtocolResponseDataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPublicProtocolResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANALYSIS_PLAN = "analysis_plan";
  private ExperimentsPublicProtocolResponseDataAttributesAnalysisPlan analysisPlan;

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE_DEFAULT_PROPERTIES =
      "assignment_source_default_properties";
  private List<
          ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
      assignmentSourceDefaultProperties = null;

  public static final String JSON_PROPERTY_ASSIGNMENT_SOURCE_ID = "assignment_source_id";
  private String assignmentSourceId;

  public static final String JSON_PROPERTY_DEFAULT_DURATION_DAYS = "default_duration_days";
  private Long defaultDurationDays;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENFORCEMENT = "enforcement";
  private ExperimentsPublicProtocolResponseDataAttributesEnforcement enforcement;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environment_id";
  private String environmentId;

  public static final String JSON_PROPERTY_EXPOSURE_SCHEDULE = "exposure_schedule";
  private ExperimentsPublicProtocolResponseDataAttributesExposureSchedule exposureSchedule;

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
  private List<ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems> metricGroups =
      new ArrayList<>();

  public static final String JSON_PROPERTY_METRIC_LIMIT = "metric_limit";
  private Long metricLimit;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_MINIMUM_DURATION_UNIT = "minimum_duration_unit";
  private String minimumDurationUnit;

  public static final String JSON_PROPERTY_MINIMUM_DURATION_VALUE = "minimum_duration_value";
  private Long minimumDurationValue;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRIMARY_METRIC = "primary_metric";
  private ExperimentsPublicProtocolResponseDataAttributesSubjectType primaryMetric;

  public static final String JSON_PROPERTY_PRIMARY_METRIC_ID = "primary_metric_id";
  private String primaryMetricId;

  public static final String JSON_PROPERTY_PUBLISHED_AT = "published_at";
  private OffsetDateTime publishedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ExperimentsPublicProtocolResponseDataAttributesStatus status;

  public static final String JSON_PROPERTY_SUBJECT_TYPE = "subject_type";
  private ExperimentsPublicProtocolResponseDataAttributesSubjectType subjectType;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private String subjectTypeId;

  public static final String JSON_PROPERTY_TARGETING_RULES = "targeting_rules";
  private List<ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems> targetingRules =
      null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public ExperimentsPublicProtocolResponseDataAttributes() {}

  @JsonCreator
  public ExperimentsPublicProtocolResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_DURATION_REQUIRED_TO_START)
          Boolean isDurationRequiredToStart,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_EQUAL_SPLIT_ENFORCED)
          Boolean isEqualSplitEnforced,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_METRIC_LIMIT_ENABLED)
          Boolean isMetricLimitEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_MINIMUM_DURATION_ENABLED)
          Boolean isMinimumDurationEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC_GROUPS)
          List<ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems> metricGroups,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ExperimentsPublicProtocolResponseDataAttributesStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) String updatedAt) {
    this.isDurationRequiredToStart = isDurationRequiredToStart;
    this.isEqualSplitEnforced = isEqualSplitEnforced;
    this.isMetricLimitEnabled = isMetricLimitEnabled;
    this.isMinimumDurationEnabled = isMinimumDurationEnabled;
    this.metricGroups = metricGroups;
    for (ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems item : metricGroups) {
      this.unparsed |= item.unparsed;
    }
    this.name = name;
    this.status = status;
    this.unparsed |= !status.isValid();
    this.updatedAt = updatedAt;
  }

  public ExperimentsPublicProtocolResponseDataAttributes analysisPlan(
      ExperimentsPublicProtocolResponseDataAttributesAnalysisPlan analysisPlan) {
    this.analysisPlan = analysisPlan;
    this.unparsed |= analysisPlan.unparsed;
    return this;
  }

  /**
   * Default statistical settings supplied by the protocol.
   *
   * @return analysisPlan
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYSIS_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesAnalysisPlan getAnalysisPlan() {
    return analysisPlan;
  }

  public void setAnalysisPlan(
      ExperimentsPublicProtocolResponseDataAttributesAnalysisPlan analysisPlan) {
    this.analysisPlan = analysisPlan;
    if (analysisPlan != null) {
      this.unparsed |= analysisPlan.unparsed;
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes assignmentSourceDefaultProperties(
      List<ExperimentsPublicProtocolResponseDataAttributesAssignmentSourceDefaultPropertiesItems>
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

  public ExperimentsPublicProtocolResponseDataAttributes addAssignmentSourceDefaultPropertiesItem(
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
   * Default properties supplied by the protocol's assignment source.
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

  public ExperimentsPublicProtocolResponseDataAttributes assignmentSourceId(
      String assignmentSourceId) {
    this.assignmentSourceId = assignmentSourceId;
    return this;
  }

  /**
   * ID of the assignment source selected by the protocol.
   *
   * @return assignmentSourceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSIGNMENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAssignmentSourceId() {
    return assignmentSourceId;
  }

  public void setAssignmentSourceId(String assignmentSourceId) {
    this.assignmentSourceId = assignmentSourceId;
  }

  public ExperimentsPublicProtocolResponseDataAttributes defaultDurationDays(
      Long defaultDurationDays) {
    this.defaultDurationDays = defaultDurationDays;
    return this;
  }

  /**
   * Default experiment duration supplied by the protocol, in days.
   *
   * @return defaultDurationDays
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_DURATION_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDefaultDurationDays() {
    return defaultDurationDays;
  }

  public void setDefaultDurationDays(Long defaultDurationDays) {
    this.defaultDurationDays = defaultDurationDays;
  }

  public ExperimentsPublicProtocolResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text that explains the protocol.
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

  public ExperimentsPublicProtocolResponseDataAttributes enforcement(
      ExperimentsPublicProtocolResponseDataAttributesEnforcement enforcement) {
    this.enforcement = enforcement;
    this.unparsed |= enforcement.unparsed;
    return this;
  }

  /**
   * Controls that determine which protocol settings can be changed in an experiment.
   *
   * @return enforcement
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesEnforcement getEnforcement() {
    return enforcement;
  }

  public void setEnforcement(
      ExperimentsPublicProtocolResponseDataAttributesEnforcement enforcement) {
    this.enforcement = enforcement;
    if (enforcement != null) {
      this.unparsed |= enforcement.unparsed;
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * ID of the feature flag environment used by the experiment.
   *
   * @return environmentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public ExperimentsPublicProtocolResponseDataAttributes exposureSchedule(
      ExperimentsPublicProtocolResponseDataAttributesExposureSchedule exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
    this.unparsed |= exposureSchedule.unparsed;
    return this;
  }

  /**
   * Schedule that controls traffic exposure for experiments created from the protocol.
   *
   * @return exposureSchedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPOSURE_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesExposureSchedule getExposureSchedule() {
    return exposureSchedule;
  }

  public void setExposureSchedule(
      ExperimentsPublicProtocolResponseDataAttributesExposureSchedule exposureSchedule) {
    this.exposureSchedule = exposureSchedule;
    if (exposureSchedule != null) {
      this.unparsed |= exposureSchedule.unparsed;
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes isDurationRequiredToStart(
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

  public ExperimentsPublicProtocolResponseDataAttributes isEqualSplitEnforced(
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

  public ExperimentsPublicProtocolResponseDataAttributes isMetricLimitEnabled(
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

  public ExperimentsPublicProtocolResponseDataAttributes isMinimumDurationEnabled(
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

  public ExperimentsPublicProtocolResponseDataAttributes metricGroups(
      List<ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems> metricGroups) {
    this.metricGroups = metricGroups;
    for (ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems item : metricGroups) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsPublicProtocolResponseDataAttributes addMetricGroupsItem(
      ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems metricGroupsItem) {
    this.metricGroups.add(metricGroupsItem);
    this.unparsed |= metricGroupsItem.unparsed;
    return this;
  }

  /**
   * Metric groups supplied by the protocol.
   *
   * @return metricGroups
   */
  @JsonProperty(JSON_PROPERTY_METRIC_GROUPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems> getMetricGroups() {
    return metricGroups;
  }

  public void setMetricGroups(
      List<ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems> metricGroups) {
    this.metricGroups = metricGroups;
    if (metricGroups != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesMetricGroupsItems item : metricGroups) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes metricLimit(Long metricLimit) {
    this.metricLimit = metricLimit;
    return this;
  }

  /**
   * Maximum number of metrics allowed by the protocol.
   *
   * @return metricLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMetricLimit() {
    return metricLimit;
  }

  public void setMetricLimit(Long metricLimit) {
    this.metricLimit = metricLimit;
  }

  public ExperimentsPublicProtocolResponseDataAttributes migrationMetadata(
      Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Metadata retained for resources imported from another system.
   *
   * @return migrationMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMigrationMetadata() {
    return migrationMetadata;
  }

  public void setMigrationMetadata(Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
  }

  public ExperimentsPublicProtocolResponseDataAttributes minimumDurationUnit(
      String minimumDurationUnit) {
    this.minimumDurationUnit = minimumDurationUnit;
    return this;
  }

  /**
   * Unit used to express the protocol's minimum duration.
   *
   * @return minimumDurationUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_DURATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMinimumDurationUnit() {
    return minimumDurationUnit;
  }

  public void setMinimumDurationUnit(String minimumDurationUnit) {
    this.minimumDurationUnit = minimumDurationUnit;
  }

  public ExperimentsPublicProtocolResponseDataAttributes minimumDurationValue(
      Long minimumDurationValue) {
    this.minimumDurationValue = minimumDurationValue;
    return this;
  }

  /**
   * Minimum experiment duration in the specified unit.
   *
   * @return minimumDurationValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMUM_DURATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMinimumDurationValue() {
    return minimumDurationValue;
  }

  public void setMinimumDurationValue(Long minimumDurationValue) {
    this.minimumDurationValue = minimumDurationValue;
  }

  public ExperimentsPublicProtocolResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the protocol.
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

  public ExperimentsPublicProtocolResponseDataAttributes primaryMetric(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType primaryMetric) {
    this.primaryMetric = primaryMetric;
    this.unparsed |= primaryMetric.unparsed;
    return this;
  }

  /**
   * Subject type selected by the protocol.
   *
   * @return primaryMetric
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesSubjectType getPrimaryMetric() {
    return primaryMetric;
  }

  public void setPrimaryMetric(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType primaryMetric) {
    this.primaryMetric = primaryMetric;
    if (primaryMetric != null) {
      this.unparsed |= primaryMetric.unparsed;
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes primaryMetricId(String primaryMetricId) {
    this.primaryMetricId = primaryMetricId;
    return this;
  }

  /**
   * ID of the primary metric supplied by the protocol.
   *
   * @return primaryMetricId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPrimaryMetricId() {
    return primaryMetricId;
  }

  public void setPrimaryMetricId(String primaryMetricId) {
    this.primaryMetricId = primaryMetricId;
  }

  public ExperimentsPublicProtocolResponseDataAttributes publishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Time when the protocol was published.
   *
   * @return publishedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }

  public ExperimentsPublicProtocolResponseDataAttributes status(
      ExperimentsPublicProtocolResponseDataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Publication status of the protocol.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsPublicProtocolResponseDataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(ExperimentsPublicProtocolResponseDataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ExperimentsPublicProtocolResponseDataAttributes subjectType(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType subjectType) {
    this.subjectType = subjectType;
    this.unparsed |= subjectType.unparsed;
    return this;
  }

  /**
   * Subject type selected by the protocol.
   *
   * @return subjectType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPublicProtocolResponseDataAttributesSubjectType getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(
      ExperimentsPublicProtocolResponseDataAttributesSubjectType subjectType) {
    this.subjectType = subjectType;
    if (subjectType != null) {
      this.unparsed |= subjectType.unparsed;
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes subjectTypeId(String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * ID of the subject type used by this configuration.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsPublicProtocolResponseDataAttributes targetingRules(
      List<ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems item :
          targetingRules) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPublicProtocolResponseDataAttributes addTargetingRulesItem(
      ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems targetingRulesItem) {
    if (this.targetingRules == null) {
      this.targetingRules = new ArrayList<>();
    }
    this.targetingRules.add(targetingRulesItem);
    this.unparsed |= targetingRulesItem.unparsed;
    return this;
  }

  /**
   * Rules that select subjects for the experiment.
   *
   * @return targetingRules
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems>
      getTargetingRules() {
    return targetingRules;
  }

  public void setTargetingRules(
      List<ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems> targetingRules) {
    this.targetingRules = targetingRules;
    if (targetingRules != null) {
      for (ExperimentsPublicProtocolResponseDataAttributesTargetingRulesItems item :
          targetingRules) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPublicProtocolResponseDataAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * RFC3339 update time. Preserve all fractional seconds when passing this value as
   * expected_updated_at.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
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
   * @return ExperimentsPublicProtocolResponseDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPublicProtocolResponseDataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsPublicProtocolResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPublicProtocolResponseDataAttributes
        experimentsPublicProtocolResponseDataAttributes =
            (ExperimentsPublicProtocolResponseDataAttributes) o;
    return Objects.equals(
            this.analysisPlan, experimentsPublicProtocolResponseDataAttributes.analysisPlan)
        && Objects.equals(
            this.assignmentSourceDefaultProperties,
            experimentsPublicProtocolResponseDataAttributes.assignmentSourceDefaultProperties)
        && Objects.equals(
            this.assignmentSourceId,
            experimentsPublicProtocolResponseDataAttributes.assignmentSourceId)
        && Objects.equals(
            this.defaultDurationDays,
            experimentsPublicProtocolResponseDataAttributes.defaultDurationDays)
        && Objects.equals(
            this.description, experimentsPublicProtocolResponseDataAttributes.description)
        && Objects.equals(
            this.enforcement, experimentsPublicProtocolResponseDataAttributes.enforcement)
        && Objects.equals(
            this.environmentId, experimentsPublicProtocolResponseDataAttributes.environmentId)
        && Objects.equals(
            this.exposureSchedule, experimentsPublicProtocolResponseDataAttributes.exposureSchedule)
        && Objects.equals(
            this.isDurationRequiredToStart,
            experimentsPublicProtocolResponseDataAttributes.isDurationRequiredToStart)
        && Objects.equals(
            this.isEqualSplitEnforced,
            experimentsPublicProtocolResponseDataAttributes.isEqualSplitEnforced)
        && Objects.equals(
            this.isMetricLimitEnabled,
            experimentsPublicProtocolResponseDataAttributes.isMetricLimitEnabled)
        && Objects.equals(
            this.isMinimumDurationEnabled,
            experimentsPublicProtocolResponseDataAttributes.isMinimumDurationEnabled)
        && Objects.equals(
            this.metricGroups, experimentsPublicProtocolResponseDataAttributes.metricGroups)
        && Objects.equals(
            this.metricLimit, experimentsPublicProtocolResponseDataAttributes.metricLimit)
        && Objects.equals(
            this.migrationMetadata,
            experimentsPublicProtocolResponseDataAttributes.migrationMetadata)
        && Objects.equals(
            this.minimumDurationUnit,
            experimentsPublicProtocolResponseDataAttributes.minimumDurationUnit)
        && Objects.equals(
            this.minimumDurationValue,
            experimentsPublicProtocolResponseDataAttributes.minimumDurationValue)
        && Objects.equals(this.name, experimentsPublicProtocolResponseDataAttributes.name)
        && Objects.equals(
            this.primaryMetric, experimentsPublicProtocolResponseDataAttributes.primaryMetric)
        && Objects.equals(
            this.primaryMetricId, experimentsPublicProtocolResponseDataAttributes.primaryMetricId)
        && Objects.equals(
            this.publishedAt, experimentsPublicProtocolResponseDataAttributes.publishedAt)
        && Objects.equals(this.status, experimentsPublicProtocolResponseDataAttributes.status)
        && Objects.equals(
            this.subjectType, experimentsPublicProtocolResponseDataAttributes.subjectType)
        && Objects.equals(
            this.subjectTypeId, experimentsPublicProtocolResponseDataAttributes.subjectTypeId)
        && Objects.equals(
            this.targetingRules, experimentsPublicProtocolResponseDataAttributes.targetingRules)
        && Objects.equals(this.updatedAt, experimentsPublicProtocolResponseDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            experimentsPublicProtocolResponseDataAttributes.additionalProperties);
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
        primaryMetric,
        primaryMetricId,
        publishedAt,
        status,
        subjectType,
        subjectTypeId,
        targetingRules,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPublicProtocolResponseDataAttributes {\n");
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
    sb.append("    primaryMetric: ").append(toIndentedString(primaryMetric)).append("\n");
    sb.append("    primaryMetricId: ").append(toIndentedString(primaryMetricId)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    targetingRules: ").append(toIndentedString(targetingRules)).append("\n");
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
