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

/** Summary fields for an experiment returned in a list. */
@JsonPropertyOrder({
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_ASSIGNMENTS_END_DATE,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_ASSIGNMENTS_START_DATE,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_CONCLUDED_AT,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_CONCLUSION,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_CREATED_AT,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_EVENTS_END_DATE,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_EVENTS_START_DATE,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_EXPERIMENT_TYPE,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_HYPOTHESIS,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_MIGRATION_METADATA,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_PIPELINE_TABLE_SUFFIX,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_PROTOCOL_ID,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_RELATED_LINKS,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_RESULTS_LAST_UPDATED,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_STATUS,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_STRUCTURED_METADATA,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_SUMMARY,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_TAGS,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_TEAMS,
  ExperimentsExperimentV2ListDTODataAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentV2ListDTODataAttributes {
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

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ExperimentsExperimentV2ListDTODataAttributes assignmentsEndDate(
      OffsetDateTime assignmentsEndDate) {
    this.assignmentsEndDate = JsonNullable.<OffsetDateTime>of(assignmentsEndDate);
    return this;
  }

  /**
   * End of the window used to read experiment assignments.
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

  public ExperimentsExperimentV2ListDTODataAttributes assignmentsStartDate(
      OffsetDateTime assignmentsStartDate) {
    this.assignmentsStartDate = JsonNullable.<OffsetDateTime>of(assignmentsStartDate);
    return this;
  }

  /**
   * Start of the window used to read experiment assignments.
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

  public ExperimentsExperimentV2ListDTODataAttributes concludedAt(OffsetDateTime concludedAt) {
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

  public ExperimentsExperimentV2ListDTODataAttributes conclusion(
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

  public ExperimentsExperimentV2ListDTODataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the experiment was created.
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

  public ExperimentsExperimentV2ListDTODataAttributes eventsEndDate(OffsetDateTime eventsEndDate) {
    this.eventsEndDate = JsonNullable.<OffsetDateTime>of(eventsEndDate);
    return this;
  }

  /**
   * End of the window used to read metric events.
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

  public ExperimentsExperimentV2ListDTODataAttributes eventsStartDate(
      OffsetDateTime eventsStartDate) {
    this.eventsStartDate = JsonNullable.<OffsetDateTime>of(eventsStartDate);
    return this;
  }

  /**
   * Start of the window used to read metric events.
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

  public ExperimentsExperimentV2ListDTODataAttributes experimentType(String experimentType) {
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

  public ExperimentsExperimentV2ListDTODataAttributes hypothesis(String hypothesis) {
    this.hypothesis = hypothesis;
    return this;
  }

  /**
   * Expected effect that the experiment is designed to test.
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

  public ExperimentsExperimentV2ListDTODataAttributes migrationMetadata(Object migrationMetadata) {
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

  public ExperimentsExperimentV2ListDTODataAttributes name(String name) {
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

  public ExperimentsExperimentV2ListDTODataAttributes pipelineTableSuffix(
      String pipelineTableSuffix) {
    this.pipelineTableSuffix = pipelineTableSuffix;
    return this;
  }

  /**
   * Suffix used for the experiment tables in the analysis pipeline.
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

  public ExperimentsExperimentV2ListDTODataAttributes protocolId(String protocolId) {
    this.protocolId = protocolId;
    return this;
  }

  /**
   * Identifier of the protocol associated with the experiment.
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

  public ExperimentsExperimentV2ListDTODataAttributes relatedLinks(
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

  public ExperimentsExperimentV2ListDTODataAttributes addRelatedLinksItem(
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

  public ExperimentsExperimentV2ListDTODataAttributes resultsLastUpdated(
      OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = JsonNullable.<OffsetDateTime>of(resultsLastUpdated);
    return this;
  }

  /**
   * Time when the experiment results were last updated.
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

  public ExperimentsExperimentV2ListDTODataAttributes status(
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

  public ExperimentsExperimentV2ListDTODataAttributes structuredMetadata(
      List<ExperimentsStructuredMetadataResponse> structuredMetadata) {
    this.structuredMetadata = structuredMetadata;
    if (structuredMetadata != null) {
      for (ExperimentsStructuredMetadataResponse item : structuredMetadata) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsExperimentV2ListDTODataAttributes addStructuredMetadataItem(
      ExperimentsStructuredMetadataResponse structuredMetadataItem) {
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

  public ExperimentsExperimentV2ListDTODataAttributes subjectTypeId(String subjectTypeId) {
    this.subjectTypeId = JsonNullable.<String>of(subjectTypeId);
    return this;
  }

  /**
   * Identifier of the subject type used for experiment assignments.
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

  public ExperimentsExperimentV2ListDTODataAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Free-form summary of the experiment.
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

  public ExperimentsExperimentV2ListDTODataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExperimentsExperimentV2ListDTODataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tag names associated with the experiment.
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

  public ExperimentsExperimentV2ListDTODataAttributes teams(List<String> teams) {
    this.teams = teams;
    return this;
  }

  public ExperimentsExperimentV2ListDTODataAttributes addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * Team handles associated with the experiment.
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

  public ExperimentsExperimentV2ListDTODataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the experiment was last updated.
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
   * @return ExperimentsExperimentV2ListDTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsExperimentV2ListDTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsExperimentV2ListDTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentV2ListDTODataAttributes experimentsExperimentV2ListDtoDataAttributes =
        (ExperimentsExperimentV2ListDTODataAttributes) o;
    return Objects.equals(
            this.assignmentsEndDate,
            experimentsExperimentV2ListDtoDataAttributes.assignmentsEndDate)
        && Objects.equals(
            this.assignmentsStartDate,
            experimentsExperimentV2ListDtoDataAttributes.assignmentsStartDate)
        && Objects.equals(
            this.concludedAt, experimentsExperimentV2ListDtoDataAttributes.concludedAt)
        && Objects.equals(this.conclusion, experimentsExperimentV2ListDtoDataAttributes.conclusion)
        && Objects.equals(this.createdAt, experimentsExperimentV2ListDtoDataAttributes.createdAt)
        && Objects.equals(
            this.eventsEndDate, experimentsExperimentV2ListDtoDataAttributes.eventsEndDate)
        && Objects.equals(
            this.eventsStartDate, experimentsExperimentV2ListDtoDataAttributes.eventsStartDate)
        && Objects.equals(
            this.experimentType, experimentsExperimentV2ListDtoDataAttributes.experimentType)
        && Objects.equals(this.hypothesis, experimentsExperimentV2ListDtoDataAttributes.hypothesis)
        && Objects.equals(
            this.migrationMetadata, experimentsExperimentV2ListDtoDataAttributes.migrationMetadata)
        && Objects.equals(this.name, experimentsExperimentV2ListDtoDataAttributes.name)
        && Objects.equals(
            this.pipelineTableSuffix,
            experimentsExperimentV2ListDtoDataAttributes.pipelineTableSuffix)
        && Objects.equals(this.protocolId, experimentsExperimentV2ListDtoDataAttributes.protocolId)
        && Objects.equals(
            this.relatedLinks, experimentsExperimentV2ListDtoDataAttributes.relatedLinks)
        && Objects.equals(
            this.resultsLastUpdated,
            experimentsExperimentV2ListDtoDataAttributes.resultsLastUpdated)
        && Objects.equals(this.status, experimentsExperimentV2ListDtoDataAttributes.status)
        && Objects.equals(
            this.structuredMetadata,
            experimentsExperimentV2ListDtoDataAttributes.structuredMetadata)
        && Objects.equals(
            this.subjectTypeId, experimentsExperimentV2ListDtoDataAttributes.subjectTypeId)
        && Objects.equals(this.summary, experimentsExperimentV2ListDtoDataAttributes.summary)
        && Objects.equals(this.tags, experimentsExperimentV2ListDtoDataAttributes.tags)
        && Objects.equals(this.teams, experimentsExperimentV2ListDtoDataAttributes.teams)
        && Objects.equals(this.updatedAt, experimentsExperimentV2ListDtoDataAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentV2ListDtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        assignmentsEndDate,
        assignmentsStartDate,
        concludedAt,
        conclusion,
        createdAt,
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
        status,
        structuredMetadata,
        subjectTypeId,
        summary,
        tags,
        teams,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentV2ListDTODataAttributes {\n");
    sb.append("    assignmentsEndDate: ").append(toIndentedString(assignmentsEndDate)).append("\n");
    sb.append("    assignmentsStartDate: ")
        .append(toIndentedString(assignmentsStartDate))
        .append("\n");
    sb.append("    concludedAt: ").append(toIndentedString(concludedAt)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    structuredMetadata: ").append(toIndentedString(structuredMetadata)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
