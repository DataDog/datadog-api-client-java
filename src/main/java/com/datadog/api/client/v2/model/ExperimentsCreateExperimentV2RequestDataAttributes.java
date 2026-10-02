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

/** Configuration and descriptive fields for the new experiment draft. */
@JsonPropertyOrder({
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_ASSIGNMENTS_END_DATE,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_ASSIGNMENTS_START_DATE,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_DECISION_METRICS,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_EVENTS_END_DATE,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_EVENTS_START_DATE,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_HYPOTHESIS,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_NAME,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_PROTOCOL_ID,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_RELATED_LINKS,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_SPLIT_BY_PROPERTIES,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_STRUCTURED_METADATA,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_SUMMARY,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_TRAFFIC_EXPOSURE,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_VARIANTS,
  ExperimentsCreateExperimentV2RequestDataAttributes.JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExperimentV2RequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNMENTS_END_DATE = "assignments_end_date";
  private JsonNullable<OffsetDateTime> assignmentsEndDate =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ASSIGNMENTS_START_DATE = "assignments_start_date";
  private JsonNullable<OffsetDateTime> assignmentsStartDate =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION =
      "datadog_flag_configuration";
  private JsonNullable<ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration>
      datadogFlagConfiguration =
          JsonNullable
              .<ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration>
                  undefined();

  public static final String JSON_PROPERTY_DECISION_METRICS = "decision_metrics";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems>
      decisionMetrics = null;

  public static final String JSON_PROPERTY_EVENTS_END_DATE = "events_end_date";
  private JsonNullable<OffsetDateTime> eventsEndDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_EVENTS_START_DATE = "events_start_date";
  private JsonNullable<OffsetDateTime> eventsStartDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_HYPOTHESIS = "hypothesis";
  private String hypothesis;

  public static final String JSON_PROPERTY_MIGRATION_METADATA = "migration_metadata";
  private Object migrationMetadata = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROTOCOL_ID = "protocol_id";
  private String protocolId;

  public static final String JSON_PROPERTY_RELATED_LINKS = "related_links";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems> relatedLinks =
      null;

  public static final String JSON_PROPERTY_SPLIT_BY_PROPERTIES = "split_by_properties";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems>
      splitByProperties = null;

  public static final String JSON_PROPERTY_STRUCTURED_METADATA = "structured_metadata";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems>
      structuredMetadata = null;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private UUID subjectTypeId;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEAMS = "teams";
  private List<String> teams = null;

  public static final String JSON_PROPERTY_TRAFFIC_EXPOSURE = "traffic_exposure";
  private ExperimentsPatchExperimentV2ResponseDataAttributesTrafficExposure trafficExposure;

  public static final String JSON_PROPERTY_VARIANTS = "variants";
  private List<ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems> variants = null;

  public static final String JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION =
      "warehouse_exposure_configuration";
  private JsonNullable<
          ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration>
      warehouseExposureConfiguration =
          JsonNullable
              .<ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration>
                  undefined();

  public ExperimentsCreateExperimentV2RequestDataAttributes() {}

  @JsonCreator
  public ExperimentsCreateExperimentV2RequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes assignmentsEndDate(
      OffsetDateTime assignmentsEndDate) {
    this.assignmentsEndDate = JsonNullable.<OffsetDateTime>of(assignmentsEndDate);
    return this;
  }

  /**
   * End of the window assignments are read from. Optional; must be after assignments_start_date.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes assignmentsStartDate(
      OffsetDateTime assignmentsStartDate) {
    this.assignmentsStartDate = JsonNullable.<OffsetDateTime>of(assignmentsStartDate);
    return this;
  }

  /**
   * Start of the window assignments are read from. Optional.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes datadogFlagConfiguration(
      ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
          datadogFlagConfiguration) {
    this.datadogFlagConfiguration =
        JsonNullable.<ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration>of(
            datadogFlagConfiguration);
    return this;
  }

  /**
   * Feature flag, environment, and targeting configuration for a Datadog experiment.
   *
   * @return datadogFlagConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
      getDatadogFlagConfiguration() {
    return datadogFlagConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration>
      getDatadogFlagConfiguration_JsonNullable() {
    return datadogFlagConfiguration;
  }

  @JsonProperty(JSON_PROPERTY_DATADOG_FLAG_CONFIGURATION)
  public void setDatadogFlagConfiguration_JsonNullable(
      JsonNullable<ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration>
          datadogFlagConfiguration) {
    this.datadogFlagConfiguration = datadogFlagConfiguration;
  }

  public void setDatadogFlagConfiguration(
      ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration
          datadogFlagConfiguration) {
    this.datadogFlagConfiguration =
        JsonNullable.<ExperimentsCreateExperimentV2RequestDataAttributesDatadogFlagConfiguration>of(
            datadogFlagConfiguration);
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes decisionMetrics(
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

  public ExperimentsCreateExperimentV2RequestDataAttributes addDecisionMetricsItem(
      ExperimentsCreateExperimentV2RequestDataAttributesDecisionMetricsItems decisionMetricsItem) {
    if (this.decisionMetrics == null) {
      this.decisionMetrics = new ArrayList<>();
    }
    this.decisionMetrics.add(decisionMetricsItem);
    this.unparsed |= decisionMetricsItem.unparsed;
    return this;
  }

  /**
   * Metrics selected to support the experiment decision.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes eventsEndDate(
      OffsetDateTime eventsEndDate) {
    this.eventsEndDate = JsonNullable.<OffsetDateTime>of(eventsEndDate);
    return this;
  }

  /**
   * End of the window metric events are read from. Optional; must be after events_start_date.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes eventsStartDate(
      OffsetDateTime eventsStartDate) {
    this.eventsStartDate = JsonNullable.<OffsetDateTime>of(eventsStartDate);
    return this;
  }

  /**
   * Start of the window metric events are read from. Optional; must fall within the assignments
   * window.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes hypothesis(String hypothesis) {
    this.hypothesis = hypothesis;
    return this;
  }

  /**
   * What the experiment is expected to show. Optional and free-form.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes migrationMetadata(
      Object migrationMetadata) {
    this.migrationMetadata = migrationMetadata;
    return this;
  }

  /**
   * Metadata associated with migration of this resource.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name for the experiment. The only required attribute: a request carrying nothing but a
   * name is accepted.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes protocolId(String protocolId) {
    this.protocolId = protocolId;
    return this;
  }

  /**
   * Published protocol whose defaults create this draft. May be combined with hypothesis, tags,
   * teams, related links, and date overrides. Omit subject_type_id, decision_metrics, variants,
   * warehouse_exposure_configuration, datadog_flag_configuration, traffic_exposure, and
   * structured_metadata.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes relatedLinks(
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

  public ExperimentsCreateExperimentV2RequestDataAttributes addRelatedLinksItem(
      ExperimentsCreateExperimentV2RequestDataAttributesRelatedLinksItems relatedLinksItem) {
    if (this.relatedLinks == null) {
      this.relatedLinks = new ArrayList<>();
    }
    this.relatedLinks.add(relatedLinksItem);
    this.unparsed |= relatedLinksItem.unparsed;
    return this;
  }

  /**
   * External links associated with the experiment.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes splitByProperties(
      List<ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems>
          splitByProperties) {
    this.splitByProperties = splitByProperties;
    if (splitByProperties != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems item :
          splitByProperties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes addSplitByPropertiesItem(
      ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems
          splitByPropertiesItem) {
    if (this.splitByProperties == null) {
      this.splitByProperties = new ArrayList<>();
    }
    this.splitByProperties.add(splitByPropertiesItem);
    this.unparsed |= splitByPropertiesItem.unparsed;
    return this;
  }

  /**
   * Complete Datadog split-by selection. Identify each property by column_name. Omit this field to
   * copy organization defaults.
   *
   * @return splitByProperties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPLIT_BY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems>
      getSplitByProperties() {
    return splitByProperties;
  }

  public void setSplitByProperties(
      List<ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems>
          splitByProperties) {
    this.splitByProperties = splitByProperties;
    if (splitByProperties != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesSplitByPropertiesItems item :
          splitByProperties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes structuredMetadata(
      List<ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems>
          structuredMetadata) {
    this.structuredMetadata = structuredMetadata;
    if (structuredMetadata != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems item :
          structuredMetadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes addStructuredMetadataItem(
      ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems
          structuredMetadataItem) {
    if (this.structuredMetadata == null) {
      this.structuredMetadata = new ArrayList<>();
    }
    this.structuredMetadata.add(structuredMetadataItem);
    this.unparsed |= structuredMetadataItem.unparsed;
    return this;
  }

  /**
   * Custom metadata fields and their values for the experiment.
   *
   * @return structuredMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRUCTURED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems>
      getStructuredMetadata() {
    return structuredMetadata;
  }

  public void setStructuredMetadata(
      List<ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems>
          structuredMetadata) {
    this.structuredMetadata = structuredMetadata;
    if (structuredMetadata != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesStructuredMetadataItems item :
          structuredMetadata) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes subjectTypeId(UUID subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * Canonical ID of an existing subject type. Optional; defaults to the organization default.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Summary of the experiment. Optional and free-form.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Non-team tag names to apply. Optional.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Team handles that own the experiment. Optional.
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

  public ExperimentsCreateExperimentV2RequestDataAttributes trafficExposure(
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

  public ExperimentsCreateExperimentV2RequestDataAttributes variants(
      List<ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes addVariantsItem(
      ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    this.unparsed |= variantsItem.unparsed;
    return this;
  }

  /**
   * Variants selected for the experiment and their traffic allocations.
   *
   * @return variants
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems> getVariants() {
    return variants;
  }

  public void setVariants(
      List<ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems> variants) {
    this.variants = variants;
    if (variants != null) {
      for (ExperimentsCreateExperimentV2RequestDataAttributesVariantsItems item : variants) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsCreateExperimentV2RequestDataAttributes warehouseExposureConfiguration(
      ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration
          warehouseExposureConfiguration) {
    this.warehouseExposureConfiguration =
        JsonNullable
            .<ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration>of(
                warehouseExposureConfiguration);
    return this;
  }

  /**
   * Warehouse model and experiment key used to read assignment data.
   *
   * @return warehouseExposureConfiguration
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration
      getWarehouseExposureConfiguration() {
    return warehouseExposureConfiguration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<
          ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration>
      getWarehouseExposureConfiguration_JsonNullable() {
    return warehouseExposureConfiguration;
  }

  @JsonProperty(JSON_PROPERTY_WAREHOUSE_EXPOSURE_CONFIGURATION)
  public void setWarehouseExposureConfiguration_JsonNullable(
      JsonNullable<ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration>
          warehouseExposureConfiguration) {
    this.warehouseExposureConfiguration = warehouseExposureConfiguration;
  }

  public void setWarehouseExposureConfiguration(
      ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration
          warehouseExposureConfiguration) {
    this.warehouseExposureConfiguration =
        JsonNullable
            .<ExperimentsCreateExperimentV2RequestDataAttributesWarehouseExposureConfiguration>of(
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
   * @return ExperimentsCreateExperimentV2RequestDataAttributes
   */
  @JsonAnySetter
  public ExperimentsCreateExperimentV2RequestDataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsCreateExperimentV2RequestDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExperimentV2RequestDataAttributes
        experimentsCreateExperimentV2RequestDataAttributes =
            (ExperimentsCreateExperimentV2RequestDataAttributes) o;
    return Objects.equals(
            this.assignmentsEndDate,
            experimentsCreateExperimentV2RequestDataAttributes.assignmentsEndDate)
        && Objects.equals(
            this.assignmentsStartDate,
            experimentsCreateExperimentV2RequestDataAttributes.assignmentsStartDate)
        && Objects.equals(
            this.datadogFlagConfiguration,
            experimentsCreateExperimentV2RequestDataAttributes.datadogFlagConfiguration)
        && Objects.equals(
            this.decisionMetrics,
            experimentsCreateExperimentV2RequestDataAttributes.decisionMetrics)
        && Objects.equals(
            this.eventsEndDate, experimentsCreateExperimentV2RequestDataAttributes.eventsEndDate)
        && Objects.equals(
            this.eventsStartDate,
            experimentsCreateExperimentV2RequestDataAttributes.eventsStartDate)
        && Objects.equals(
            this.hypothesis, experimentsCreateExperimentV2RequestDataAttributes.hypothesis)
        && Objects.equals(
            this.migrationMetadata,
            experimentsCreateExperimentV2RequestDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsCreateExperimentV2RequestDataAttributes.name)
        && Objects.equals(
            this.protocolId, experimentsCreateExperimentV2RequestDataAttributes.protocolId)
        && Objects.equals(
            this.relatedLinks, experimentsCreateExperimentV2RequestDataAttributes.relatedLinks)
        && Objects.equals(
            this.splitByProperties,
            experimentsCreateExperimentV2RequestDataAttributes.splitByProperties)
        && Objects.equals(
            this.structuredMetadata,
            experimentsCreateExperimentV2RequestDataAttributes.structuredMetadata)
        && Objects.equals(
            this.subjectTypeId, experimentsCreateExperimentV2RequestDataAttributes.subjectTypeId)
        && Objects.equals(this.summary, experimentsCreateExperimentV2RequestDataAttributes.summary)
        && Objects.equals(this.tags, experimentsCreateExperimentV2RequestDataAttributes.tags)
        && Objects.equals(this.teams, experimentsCreateExperimentV2RequestDataAttributes.teams)
        && Objects.equals(
            this.trafficExposure,
            experimentsCreateExperimentV2RequestDataAttributes.trafficExposure)
        && Objects.equals(
            this.variants, experimentsCreateExperimentV2RequestDataAttributes.variants)
        && Objects.equals(
            this.warehouseExposureConfiguration,
            experimentsCreateExperimentV2RequestDataAttributes.warehouseExposureConfiguration)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExperimentV2RequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentsEndDate,
        assignmentsStartDate,
        datadogFlagConfiguration,
        decisionMetrics,
        eventsEndDate,
        eventsStartDate,
        hypothesis,
        migrationMetadata,
        name,
        protocolId,
        relatedLinks,
        splitByProperties,
        structuredMetadata,
        subjectTypeId,
        summary,
        tags,
        teams,
        trafficExposure,
        variants,
        warehouseExposureConfiguration,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsCreateExperimentV2RequestDataAttributes {\n");
    sb.append("    assignmentsEndDate: ").append(toIndentedString(assignmentsEndDate)).append("\n");
    sb.append("    assignmentsStartDate: ")
        .append(toIndentedString(assignmentsStartDate))
        .append("\n");
    sb.append("    datadogFlagConfiguration: ")
        .append(toIndentedString(datadogFlagConfiguration))
        .append("\n");
    sb.append("    decisionMetrics: ").append(toIndentedString(decisionMetrics)).append("\n");
    sb.append("    eventsEndDate: ").append(toIndentedString(eventsEndDate)).append("\n");
    sb.append("    eventsStartDate: ").append(toIndentedString(eventsStartDate)).append("\n");
    sb.append("    hypothesis: ").append(toIndentedString(hypothesis)).append("\n");
    sb.append("    migrationMetadata: ").append(toIndentedString(migrationMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
    sb.append("    relatedLinks: ").append(toIndentedString(relatedLinks)).append("\n");
    sb.append("    splitByProperties: ").append(toIndentedString(splitByProperties)).append("\n");
    sb.append("    structuredMetadata: ").append(toIndentedString(structuredMetadata)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    trafficExposure: ").append(toIndentedString(trafficExposure)).append("\n");
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
