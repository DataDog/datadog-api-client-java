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
import org.openapitools.jackson.nullable.JsonNullable;

/** Details of the experiment. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_ASSIGNMENTS_END_DATE,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_ASSIGNMENTS_START_DATE,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_CONCLUDED_AT,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_CONCLUSION,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_DECISION_METRICS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_DECISION_VARIANT_KEY,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_EVENTS_END_DATE,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_EVENTS_START_DATE,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_EXPERIMENT_TYPE,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_HYPOTHESIS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_PIPELINE_TABLE_SUFFIX,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_PROTOCOL_ID,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_RELATED_LINKS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_RESULTS_LAST_UPDATED,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_SPLIT_BY_PROPERTIES,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_STATUS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_STRUCTURED_METADATA,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_SUMMARY,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_TRAFFIC_EXPOSURE,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_UPDATED_AT,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_VARIANTS,
  ExperimentsPatchExperimentV2ResponseDataAttributes.JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentV2ResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENTS_END_DATE = "assignments_end_date";
  private JsonNullable<OffsetDateTime> assignmentsEndDate =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ASSIGNMENTS_START_DATE = "assignments_start_date";
  private JsonNullable<OffsetDateTime> assignmentsStartDate =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONCLUDED_AT = "concluded_at";
  private JsonNullable<OffsetDateTime> concludedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CONCLUSION = "conclusion";
  private ExperimentsPatchExperimentV2ResponseDataAttributesConclusion conclusion;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION =
      "datadog_flag_configuration";
  private JsonNullable<ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration>
      datadogFlagConfiguration =
          JsonNullable
              .<ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration>
                  undefined();

  public static final String JSON_PROPERTY_DECISION_METRICS = "decision_metrics";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems>
      decisionMetrics = null;

  public static final String JSON_PROPERTY_DECISION_VARIANT_KEY = "decision_variant_key";
  private String decisionVariantKey;

  public static final String JSON_PROPERTY_EVENTS_END_DATE = "events_end_date";
  private JsonNullable<OffsetDateTime> eventsEndDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EVENTS_START_DATE = "events_start_date";
  private JsonNullable<OffsetDateTime> eventsStartDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EXPERIMENT_TYPE = "experiment_type";
  private String experimentType;

  public static final String JSON_PROPERTY_HYPOTHESIS = "hypothesis";
  private String hypothesis;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PIPELINE_TABLE_SUFFIX = "pipeline_table_suffix";
  private String pipelineTableSuffix;

  public static final String JSON_PROPERTY_PROTOCOL_ID = "protocol_id";
  private String protocolId;

  public static final String JSON_PROPERTY_RELATED_LINKS = "related_links";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems> relatedLinks =
      null;

  public static final String JSON_PROPERTY_RESULTS_LAST_UPDATED = "results_last_updated";
  private JsonNullable<OffsetDateTime> resultsLastUpdated =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SPLIT_BY_PROPERTIES = "split_by_properties";
  private List<ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems> splitByProperties =
      null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ExperimentsExperimentV2DTODataAttributesStatus status;

  public static final String JSON_PROPERTY_STRUCTURED_METADATA = "structured_metadata";
  private List<ExperimentsStructuredMetadataResponse> structuredMetadata = null;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private JsonNullable<String> subjectTypeId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public static final String JSON_PROPERTY_TRAFFIC_EXPOSURE = "traffic_exposure";
  private ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure trafficExposure;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsExperimentV2DTODataAttributesVariantsItems> variants = null;

  public static final String JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION =
      "warehouse_exposure_configuration";
  private JsonNullable<
          ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration>
      warehouseExposureConfiguration =
          JsonNullable
              .<ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration>
                  undefined();

  public ExperimentsPatchExperimentV2ResponseDataAttributes assignmentsEndDate(
      OffsetDateTime assignmentsEndDate) {
    this.assignmentsEndDate = JsonNullable.<OffsetDateTime>of(assignmentsEndDate);
    return this;
  }

  /**
   * End of the time window for experiment assignments.
   *
   * @return assignmentsEndDate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getAssignmentsEndDate() {
    return assignmentsEndDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getAssignmentsEndDate_JsonNullable() {
    return assignmentsEndDate;
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS_END_DATE)
  public void setAssignmentsEndDate_JsonNullable(JsonNullable<OffsetDateTime> assignmentsEndDate) {
    this.assignmentsEndDate = assignmentsEndDate;
  }

  public void setAssignmentsEndDate(OffsetDateTime assignmentsEndDate) {
    this.assignmentsEndDate = JsonNullable.<OffsetDateTime>of(assignmentsEndDate);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes assignmentsStartDate(
      OffsetDateTime assignmentsStartDate) {
    this.assignmentsStartDate = JsonNullable.<OffsetDateTime>of(assignmentsStartDate);
    return this;
  }

  /**
   * Start of the time window for experiment assignments.
   *
   * @return assignmentsStartDate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getAssignmentsStartDate() {
    return assignmentsStartDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getAssignmentsStartDate_JsonNullable() {
    return assignmentsStartDate;
  }

  @JsonProperty(JSON_PROPERTY_ASSIGNMENTS_START_DATE)
  public void setAssignmentsStartDate_JsonNullable(
      JsonNullable<OffsetDateTime> assignmentsStartDate) {
    this.assignmentsStartDate = assignmentsStartDate;
  }

  public void setAssignmentsStartDate(OffsetDateTime assignmentsStartDate) {
    this.assignmentsStartDate = JsonNullable.<OffsetDateTime>of(assignmentsStartDate);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes concludedAt(
      OffsetDateTime concludedAt) {
    this.concludedAt = JsonNullable.<OffsetDateTime>of(concludedAt);
    return this;
  }

  /**
   * Time when the experiment was concluded.
   *
   * @return concludedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getConcludedAt() {
    return concludedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONCLUDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getConcludedAt_JsonNullable() {
    return concludedAt;
  }

  @JsonProperty(JSON_PROPERTY_CONCLUDED_AT)
  public void setConcludedAt_JsonNullable(JsonNullable<OffsetDateTime> concludedAt) {
    this.concludedAt = concludedAt;
  }

  public void setConcludedAt(OffsetDateTime concludedAt) {
    this.concludedAt = JsonNullable.<OffsetDateTime>of(concludedAt);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes conclusion(
      ExperimentsPatchExperimentV2ResponseDataAttributesConclusion conclusion) {
    this.conclusion = conclusion;
    this.unparsed |= conclusion.unparsed;
    return this;
  }

  /**
   * Outcome and supporting text recorded when the experiment is concluded.
   *
   * @return conclusion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONCLUSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPatchExperimentV2ResponseDataAttributesConclusion getConclusion() {
    return conclusion;
  }

  public void setConclusion(
      ExperimentsPatchExperimentV2ResponseDataAttributesConclusion conclusion) {
    this.conclusion = conclusion;
    if (conclusion != null) {
      this.unparsed |= conclusion.unparsed;
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when this resource was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes datadogFlagConfiguration(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
          datadogFlagConfiguration) {
    this.datadogFlagConfiguration =
        JsonNullable.<ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration>of(
            datadogFlagConfiguration);
    return this;
  }

  /**
   * Feature flag, environment, and targeting configuration for the experiment.
   *
   * @return datadogFlagConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
      getDatadogFlagConfiguration() {
    return datadogFlagConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration>
      getDatadogFlagConfiguration_JsonNullable() {
    return datadogFlagConfiguration;
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  public void setDatadogFlagConfiguration_JsonNullable(
      JsonNullable<ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration>
          datadogFlagConfiguration) {
    this.datadogFlagConfiguration = datadogFlagConfiguration;
  }

  public void setDatadogFlagConfiguration(
      ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration
          datadogFlagConfiguration) {
    this.datadogFlagConfiguration =
        JsonNullable.<ExperimentsPatchExperimentV2ResponseDataAttributesDatadogFlagConfiguration>of(
            datadogFlagConfiguration);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes decisionMetrics(
      List<ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems>
          decisionMetrics) {
    this.decisionMetrics = decisionMetrics;
    if (decisionMetrics != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems item :
          decisionMetrics) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addDecisionMetricsItem(
      ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems decisionMetricsItem) {
    if (this.decisionMetrics == null) {
      this.decisionMetrics = new ArrayList<>();
    }
    this.decisionMetrics.add(decisionMetricsItem);
    this.unparsed |= decisionMetricsItem.unparsed;
    return this;
  }

  /**
   * Metrics used to decide the experiment outcome.
   *
   * @return decisionMetrics
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems>
      getDecisionMetrics() {
    return decisionMetrics;
  }

  public void setDecisionMetrics(
      List<ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems>
          decisionMetrics) {
    this.decisionMetrics = decisionMetrics;
    if (decisionMetrics != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems item :
          decisionMetrics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes decisionVariantKey(
      String decisionVariantKey) {
    this.decisionVariantKey = decisionVariantKey;
    return this;
  }

  /**
   * Key of the variant selected in the experiment decision.
   *
   * @return decisionVariantKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECISION_VARIANT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDecisionVariantKey() {
    return decisionVariantKey;
  }

  public void setDecisionVariantKey(String decisionVariantKey) {
    this.decisionVariantKey = decisionVariantKey;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes eventsEndDate(
      OffsetDateTime eventsEndDate) {
    this.eventsEndDate = JsonNullable.<OffsetDateTime>of(eventsEndDate);
    return this;
  }

  /**
   * End of the time window for metric events.
   *
   * @return eventsEndDate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEventsEndDate() {
    return eventsEndDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENTS_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEventsEndDate_JsonNullable() {
    return eventsEndDate;
  }

  @JsonProperty(JSON_PROPERTY_EVENTS_END_DATE)
  public void setEventsEndDate_JsonNullable(JsonNullable<OffsetDateTime> eventsEndDate) {
    this.eventsEndDate = eventsEndDate;
  }

  public void setEventsEndDate(OffsetDateTime eventsEndDate) {
    this.eventsEndDate = JsonNullable.<OffsetDateTime>of(eventsEndDate);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes eventsStartDate(
      OffsetDateTime eventsStartDate) {
    this.eventsStartDate = JsonNullable.<OffsetDateTime>of(eventsStartDate);
    return this;
  }

  /**
   * Start of the time window for metric events.
   *
   * @return eventsStartDate
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEventsStartDate() {
    return eventsStartDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENTS_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEventsStartDate_JsonNullable() {
    return eventsStartDate;
  }

  @JsonProperty(JSON_PROPERTY_EVENTS_START_DATE)
  public void setEventsStartDate_JsonNullable(JsonNullable<OffsetDateTime> eventsStartDate) {
    this.eventsStartDate = eventsStartDate;
  }

  public void setEventsStartDate(OffsetDateTime eventsStartDate) {
    this.eventsStartDate = JsonNullable.<OffsetDateTime>of(eventsStartDate);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes experimentType(String experimentType) {
    this.experimentType = experimentType;
    return this;
  }

  /**
   * Kind of experiment. STANDARD is an ordinary experiment. Other values, such as CANARY and
   * HOLDOUT, identify experiments owned by another workflow. New kinds may be added; treat unknown
   * values as non-standard.
   *
   * @return experimentType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExperimentType() {
    return experimentType;
  }

  public void setExperimentType(String experimentType) {
    this.experimentType = experimentType;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes hypothesis(String hypothesis) {
    this.hypothesis = hypothesis;
    return this;
  }

  /**
   * Expected effect that the experiment is intended to test.
   *
   * @return hypothesis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HYPOTHESIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHypothesis() {
    return hypothesis;
  }

  public void setHypothesis(String hypothesis) {
    this.hypothesis = hypothesis;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes migrationMetadata(
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

  public ExperimentsPatchExperimentV2ResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the experiment.
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

  public ExperimentsPatchExperimentV2ResponseDataAttributes pipelineTableSuffix(
      String pipelineTableSuffix) {
    this.pipelineTableSuffix = pipelineTableSuffix;
    return this;
  }

  /**
   * Suffix used to identify the experiment's pipeline output table.
   *
   * @return pipelineTableSuffix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINE_TABLE_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPipelineTableSuffix() {
    return pipelineTableSuffix;
  }

  public void setPipelineTableSuffix(String pipelineTableSuffix) {
    this.pipelineTableSuffix = pipelineTableSuffix;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes protocolId(String protocolId) {
    this.protocolId = protocolId;
    return this;
  }

  /**
   * ID of the protocol associated with the experiment.
   *
   * @return protocolId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProtocolId() {
    return protocolId;
  }

  public void setProtocolId(String protocolId) {
    this.protocolId = protocolId;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes relatedLinks(
      List<ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems> relatedLinks) {
    this.relatedLinks = relatedLinks;
    if (relatedLinks != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems item :
          relatedLinks) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addRelatedLinksItem(
      ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems relatedLinksItem) {
    if (this.relatedLinks == null) {
      this.relatedLinks = new ArrayList<>();
    }
    this.relatedLinks.add(relatedLinksItem);
    this.unparsed |= relatedLinksItem.unparsed;
    return this;
  }

  /**
   * Links to supporting material for the experiment.
   *
   * @return relatedLinks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems>
      getRelatedLinks() {
    return relatedLinks;
  }

  public void setRelatedLinks(
      List<ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems> relatedLinks) {
    this.relatedLinks = relatedLinks;
    if (relatedLinks != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems item :
          relatedLinks) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes resultsLastUpdated(
      OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = JsonNullable.<OffsetDateTime>of(resultsLastUpdated);
    return this;
  }

  /**
   * Time of the most recent update to the experiment's results.
   *
   * @return resultsLastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getResultsLastUpdated() {
    return resultsLastUpdated.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESULTS_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getResultsLastUpdated_JsonNullable() {
    return resultsLastUpdated;
  }

  @JsonProperty(JSON_PROPERTY_RESULTS_LAST_UPDATED)
  public void setResultsLastUpdated_JsonNullable(JsonNullable<OffsetDateTime> resultsLastUpdated) {
    this.resultsLastUpdated = resultsLastUpdated;
  }

  public void setResultsLastUpdated(OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = JsonNullable.<OffsetDateTime>of(resultsLastUpdated);
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes splitByProperties(
      List<ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems> splitByProperties) {
    this.splitByProperties = splitByProperties;
    if (splitByProperties != null) {
      for (ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems item :
          splitByProperties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addSplitByPropertiesItem(
      ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems splitByPropertiesItem) {
    if (this.splitByProperties == null) {
      this.splitByProperties = new ArrayList<>();
    }
    this.splitByProperties.add(splitByPropertiesItem);
    this.unparsed |= splitByPropertiesItem.unparsed;
    return this;
  }

  /**
   * Properties used to split the experiment results into groups.
   *
   * @return splitByProperties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPLIT_BY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems>
      getSplitByProperties() {
    return splitByProperties;
  }

  public void setSplitByProperties(
      List<ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems> splitByProperties) {
    this.splitByProperties = splitByProperties;
    if (splitByProperties != null) {
      for (ExperimentsExperimentV2DTODataAttributesSplitByPropertiesItems item :
          splitByProperties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes status(
      ExperimentsExperimentV2DTODataAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Current stage in the experiment lifecycle.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsExperimentV2DTODataAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(ExperimentsExperimentV2DTODataAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes structuredMetadata(
      List<ExperimentsStructuredMetadataResponse> structuredMetadata) {
    this.structuredMetadata = structuredMetadata;
    if (structuredMetadata != null) {
      for (ExperimentsStructuredMetadataResponse item : structuredMetadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addStructuredMetadataItem(
      ExperimentsStructuredMetadataResponse structuredMetadataItem) {
    if (this.structuredMetadata == null) {
      this.structuredMetadata = new ArrayList<>();
    }
    this.structuredMetadata.add(structuredMetadataItem);
    this.unparsed |= structuredMetadataItem.unparsed;
    return this;
  }

  /**
   * Values of structured metadata fields attached to the experiment.
   *
   * @return structuredMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRUCTURED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsStructuredMetadataResponse> getStructuredMetadata() {
    return structuredMetadata;
  }

  public void setStructuredMetadata(
      List<ExperimentsStructuredMetadataResponse> structuredMetadata) {
    this.structuredMetadata = structuredMetadata;
    if (structuredMetadata != null) {
      for (ExperimentsStructuredMetadataResponse item : structuredMetadata) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes subjectTypeId(String subjectTypeId) {
    this.subjectTypeId = JsonNullable.<String>of(subjectTypeId);
    return this;
  }

  /**
   * ID of the subject type used by this configuration.
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

  public ExperimentsPatchExperimentV2ResponseDataAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Summary text recorded for the experiment.
   *
   * @return summary
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags attached to the experiment.
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

  public ExperimentsPatchExperimentV2ResponseDataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Teams associated with the experiment.
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

  public ExperimentsPatchExperimentV2ResponseDataAttributes trafficExposure(
      ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure trafficExposure) {
    this.trafficExposure = trafficExposure;
    this.unparsed |= trafficExposure.unparsed;
    return this;
  }

  /**
   * Traffic exposure fraction or schedule configured for the experiment.
   *
   * @return trafficExposure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_EXPOSURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure getTrafficExposure() {
    return trafficExposure;
  }

  public void setTrafficExposure(
      ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure trafficExposure) {
    this.trafficExposure = trafficExposure;
    if (trafficExposure != null) {
      this.unparsed |= trafficExposure.unparsed;
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when this resource was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes variants(
      List<ExperimentsExperimentV2DTODataAttributesVariantsItems> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsExperimentV2DTODataAttributesVariantsItems item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes addVariantsItem(
      ExperimentsExperimentV2DTODataAttributesVariantsItems variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * Variants configured for the experiment.
   *
   * @return variants
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsExperimentV2DTODataAttributesVariantsItems> getVariants() {
    return variants;
  }

  public void setVariants(List<ExperimentsExperimentV2DTODataAttributesVariantsItems> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsExperimentV2DTODataAttributesVariantsItems item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsPatchExperimentV2ResponseDataAttributes warehouseExposureConfiguration(
      ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
          warehouseExposureConfiguration) {
    this.warehouseExposureConfiguration =
        JsonNullable
            .<ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration>of(
                warehouseExposureConfiguration);
    return this;
  }

  /**
   * Warehouse exposure model and settings used to identify experiment assignments.
   *
   * @return warehouseExposureConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
      getWarehouseExposureConfiguration() {
    return warehouseExposureConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<
          ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration>
      getWarehouseExposureConfiguration_JsonNullable() {
    return warehouseExposureConfiguration;
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION)
  public void setWarehouseExposureConfiguration_JsonNullable(
      JsonNullable<ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration>
          warehouseExposureConfiguration) {
    this.warehouseExposureConfiguration = warehouseExposureConfiguration;
  }

  public void setWarehouseExposureConfiguration(
      ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration
          warehouseExposureConfiguration) {
    this.warehouseExposureConfiguration =
        JsonNullable
            .<ExperimentsPatchExperimentV2ResponseDataAttributesWarehouseExposureConfiguration>of(
                warehouseExposureConfiguration);
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
   * @return ExperimentsPatchExperimentV2ResponseDataAttributes
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentV2ResponseDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsPatchExperimentV2ResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchExperimentV2ResponseDataAttributes
        experimentsPatchExperimentV2ResponseDataAttributes =
            (ExperimentsPatchExperimentV2ResponseDataAttributes) o;
    return Objects.equals(
            this.assignmentsEndDate,
            experimentsPatchExperimentV2ResponseDataAttributes.assignmentsEndDate)
        && Objects.equals(
            this.assignmentsStartDate,
            experimentsPatchExperimentV2ResponseDataAttributes.assignmentsStartDate)
        && Objects.equals(
            this.concludedAt, experimentsPatchExperimentV2ResponseDataAttributes.concludedAt)
        && Objects.equals(
            this.conclusion, experimentsPatchExperimentV2ResponseDataAttributes.conclusion)
        && Objects.equals(
            this.createdAt, experimentsPatchExperimentV2ResponseDataAttributes.createdAt)
        && Objects.equals(
            this.datadogFlagConfiguration,
            experimentsPatchExperimentV2ResponseDataAttributes.datadogFlagConfiguration)
        && Objects.equals(
            this.decisionMetrics,
            experimentsPatchExperimentV2ResponseDataAttributes.decisionMetrics)
        && Objects.equals(
            this.decisionVariantKey,
            experimentsPatchExperimentV2ResponseDataAttributes.decisionVariantKey)
        && Objects.equals(
            this.eventsEndDate, experimentsPatchExperimentV2ResponseDataAttributes.eventsEndDate)
        && Objects.equals(
            this.eventsStartDate,
            experimentsPatchExperimentV2ResponseDataAttributes.eventsStartDate)
        && Objects.equals(
            this.experimentType, experimentsPatchExperimentV2ResponseDataAttributes.experimentType)
        && Objects.equals(
            this.hypothesis, experimentsPatchExperimentV2ResponseDataAttributes.hypothesis)
        && Objects.equals(
            this.migrationMetadata,
            experimentsPatchExperimentV2ResponseDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsPatchExperimentV2ResponseDataAttributes.name)
        && Objects.equals(
            this.pipelineTableSuffix,
            experimentsPatchExperimentV2ResponseDataAttributes.pipelineTableSuffix)
        && Objects.equals(
            this.protocolId, experimentsPatchExperimentV2ResponseDataAttributes.protocolId)
        && Objects.equals(
            this.relatedLinks, experimentsPatchExperimentV2ResponseDataAttributes.relatedLinks)
        && Objects.equals(
            this.resultsLastUpdated,
            experimentsPatchExperimentV2ResponseDataAttributes.resultsLastUpdated)
        && Objects.equals(
            this.splitByProperties,
            experimentsPatchExperimentV2ResponseDataAttributes.splitByProperties)
        && Objects.equals(this.status, experimentsPatchExperimentV2ResponseDataAttributes.status)
        && Objects.equals(
            this.structuredMetadata,
            experimentsPatchExperimentV2ResponseDataAttributes.structuredMetadata)
        && Objects.equals(
            this.subjectTypeId, experimentsPatchExperimentV2ResponseDataAttributes.subjectTypeId)
        && Objects.equals(this.summary, experimentsPatchExperimentV2ResponseDataAttributes.summary)
        && Objects.equals(this.tags, experimentsPatchExperimentV2ResponseDataAttributes.tags)
        && Objects.equals(this.teams, experimentsPatchExperimentV2ResponseDataAttributes.teams)
        && Objects.equals(
            this.trafficExposure,
            experimentsPatchExperimentV2ResponseDataAttributes.trafficExposure)
        && Objects.equals(
            this.updatedAt, experimentsPatchExperimentV2ResponseDataAttributes.updatedAt)
        && Objects.equals(
            this.variants, experimentsPatchExperimentV2ResponseDataAttributes.variants)
        && Objects.equals(
            this.warehouseExposureConfiguration,
            experimentsPatchExperimentV2ResponseDataAttributes.warehouseExposureConfiguration)
        && Objects.equals(
            this.additionalProperties,
            experimentsPatchExperimentV2ResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentsEndDate,
        assignmentsStartDate,
        concludedAt,
        conclusion,
        createdAt,
        datadogFlagConfiguration,
        decisionMetrics,
        decisionVariantKey,
        eventsEndDate,
        eventsStartDate,
        experimentType,
        hypothesis,
        migrationMetadata,
        name,
        pipelineTableSuffix,
        protocolId,
        relatedLinks,
        resultsLastUpdated,
        splitByProperties,
        status,
        structuredMetadata,
        subjectTypeId,
        summary,
        tags,
        teams,
        trafficExposure,
        updatedAt,
        variants,
        warehouseExposureConfiguration,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchExperimentV2ResponseDataAttributes {\n");
    sb.append("    assignmentsEndDate: ").append(toIndentedString(assignmentsEndDate)).append("\n");
    sb.append("    assignmentsStartDate: ")
        .append(toIndentedString(assignmentsStartDate))
        .append("\n");
    sb.append("    concludedAt: ").append(toIndentedString(concludedAt)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datadogFlagConfiguration: ")
        .append(toIndentedString(datadogFlagConfiguration))
        .append("\n");
    sb.append("    decisionMetrics: ").append(toIndentedString(decisionMetrics)).append("\n");
    sb.append("    decisionVariantKey: ").append(toIndentedString(decisionVariantKey)).append("\n");
    sb.append("    eventsEndDate: ").append(toIndentedString(eventsEndDate)).append("\n");
    sb.append("    eventsStartDate: ").append(toIndentedString(eventsStartDate)).append("\n");
    sb.append("    experimentType: ").append(toIndentedString(experimentType)).append("\n");
    sb.append("    hypothesis: ").append(toIndentedString(hypothesis)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pipelineTableSuffix: ")
        .append(toIndentedString(pipelineTableSuffix))
        .append("\n");
    sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
    sb.append("    relatedLinks: ").append(toIndentedString(relatedLinks)).append("\n");
    sb.append("    resultsLastUpdated: ").append(toIndentedString(resultsLastUpdated)).append("\n");
    sb.append("    splitByProperties: ").append(toIndentedString(splitByProperties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    structuredMetadata: ").append(toIndentedString(structuredMetadata)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    trafficExposure: ").append(toIndentedString(trafficExposure)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    warehouseExposureConfiguration: ")
        .append(toIndentedString(warehouseExposureConfiguration))
        .append("\n");
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
