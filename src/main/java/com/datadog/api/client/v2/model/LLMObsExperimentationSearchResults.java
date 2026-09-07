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

/** The matching experimentation entities grouped by type. */
@JsonPropertyOrder({
  LLMObsExperimentationSearchResults.JSON_PROPERTY_DATASET_RECORDS,
  LLMObsExperimentationSearchResults.JSON_PROPERTY_DATASETS,
  LLMObsExperimentationSearchResults.JSON_PROPERTY_EXPERIMENT_RUNS,
  LLMObsExperimentationSearchResults.JSON_PROPERTY_EXPERIMENTS,
  LLMObsExperimentationSearchResults.JSON_PROPERTY_PROJECTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentationSearchResults {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_RECORDS = "dataset_records";
  private JsonNullable<List<LLMObsDatasetRecordDataResponse>> datasetRecords =
      JsonNullable.<List<LLMObsDatasetRecordDataResponse>>undefined();

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private JsonNullable<List<LLMObsDatasetDataResponse>> datasets =
      JsonNullable.<List<LLMObsDatasetDataResponse>>undefined();

  public static final String JSON_PROPERTY_EXPERIMENT_RUNS = "experiment_runs";
  private JsonNullable<List<LLMObsExperimentRunDataResponse>> experimentRuns =
      JsonNullable.<List<LLMObsExperimentRunDataResponse>>undefined();

  public static final String JSON_PROPERTY_EXPERIMENTS = "experiments";
  private JsonNullable<List<LLMObsExperimentDataAttributesResponse>> experiments =
      JsonNullable.<List<LLMObsExperimentDataAttributesResponse>>undefined();

  public static final String JSON_PROPERTY_PROJECTS = "projects";
  private JsonNullable<List<LLMObsProjectDataResponse>> projects =
      JsonNullable.<List<LLMObsProjectDataResponse>>undefined();

  public LLMObsExperimentationSearchResults datasetRecords(
      List<LLMObsDatasetRecordDataResponse> datasetRecords) {
    this.datasetRecords = JsonNullable.<List<LLMObsDatasetRecordDataResponse>>of(datasetRecords);
    return this;
  }

  public LLMObsExperimentationSearchResults addDatasetRecordsItem(
      LLMObsDatasetRecordDataResponse datasetRecordsItem) {
    if (this.datasetRecords == null || !this.datasetRecords.isPresent()) {
      this.datasetRecords =
          JsonNullable.<List<LLMObsDatasetRecordDataResponse>>of(new ArrayList<>());
    }
    try {
      this.datasetRecords.get().add(datasetRecordsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Matching dataset records. Present when <code>dataset_records</code> is included in <code>
   * filter.scope</code>.
   *
   * @return datasetRecords
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LLMObsDatasetRecordDataResponse> getDatasetRecords() {
    return datasetRecords.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATASET_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LLMObsDatasetRecordDataResponse>> getDatasetRecords_JsonNullable() {
    return datasetRecords;
  }

  @JsonProperty(JSON_PROPERTY_DATASET_RECORDS)
  public void setDatasetRecords_JsonNullable(
      JsonNullable<List<LLMObsDatasetRecordDataResponse>> datasetRecords) {
    this.datasetRecords = datasetRecords;
  }

  public void setDatasetRecords(List<LLMObsDatasetRecordDataResponse> datasetRecords) {
    this.datasetRecords = JsonNullable.<List<LLMObsDatasetRecordDataResponse>>of(datasetRecords);
  }

  public LLMObsExperimentationSearchResults datasets(List<LLMObsDatasetDataResponse> datasets) {
    this.datasets = JsonNullable.<List<LLMObsDatasetDataResponse>>of(datasets);
    return this;
  }

  public LLMObsExperimentationSearchResults addDatasetsItem(
      LLMObsDatasetDataResponse datasetsItem) {
    if (this.datasets == null || !this.datasets.isPresent()) {
      this.datasets = JsonNullable.<List<LLMObsDatasetDataResponse>>of(new ArrayList<>());
    }
    try {
      this.datasets.get().add(datasetsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Matching datasets. Present when <code>datasets</code> is included in <code>filter.scope</code>.
   *
   * @return datasets
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LLMObsDatasetDataResponse> getDatasets() {
    return datasets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATASETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LLMObsDatasetDataResponse>> getDatasets_JsonNullable() {
    return datasets;
  }

  @JsonProperty(JSON_PROPERTY_DATASETS)
  public void setDatasets_JsonNullable(JsonNullable<List<LLMObsDatasetDataResponse>> datasets) {
    this.datasets = datasets;
  }

  public void setDatasets(List<LLMObsDatasetDataResponse> datasets) {
    this.datasets = JsonNullable.<List<LLMObsDatasetDataResponse>>of(datasets);
  }

  public LLMObsExperimentationSearchResults experimentRuns(
      List<LLMObsExperimentRunDataResponse> experimentRuns) {
    this.experimentRuns = JsonNullable.<List<LLMObsExperimentRunDataResponse>>of(experimentRuns);
    return this;
  }

  public LLMObsExperimentationSearchResults addExperimentRunsItem(
      LLMObsExperimentRunDataResponse experimentRunsItem) {
    if (this.experimentRuns == null || !this.experimentRuns.isPresent()) {
      this.experimentRuns =
          JsonNullable.<List<LLMObsExperimentRunDataResponse>>of(new ArrayList<>());
    }
    try {
      this.experimentRuns.get().add(experimentRunsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Matching experiment runs. Present when <code>experiment_runs</code> is included in <code>
   * filter.scope</code>.
   *
   * @return experimentRuns
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LLMObsExperimentRunDataResponse> getExperimentRuns() {
    return experimentRuns.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LLMObsExperimentRunDataResponse>> getExperimentRuns_JsonNullable() {
    return experimentRuns;
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENT_RUNS)
  public void setExperimentRuns_JsonNullable(
      JsonNullable<List<LLMObsExperimentRunDataResponse>> experimentRuns) {
    this.experimentRuns = experimentRuns;
  }

  public void setExperimentRuns(List<LLMObsExperimentRunDataResponse> experimentRuns) {
    this.experimentRuns = JsonNullable.<List<LLMObsExperimentRunDataResponse>>of(experimentRuns);
  }

  public LLMObsExperimentationSearchResults experiments(
      List<LLMObsExperimentDataAttributesResponse> experiments) {
    this.experiments = JsonNullable.<List<LLMObsExperimentDataAttributesResponse>>of(experiments);
    return this;
  }

  public LLMObsExperimentationSearchResults addExperimentsItem(
      LLMObsExperimentDataAttributesResponse experimentsItem) {
    if (this.experiments == null || !this.experiments.isPresent()) {
      this.experiments =
          JsonNullable.<List<LLMObsExperimentDataAttributesResponse>>of(new ArrayList<>());
    }
    try {
      this.experiments.get().add(experimentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Matching experiments. Present when <code>experiments</code> is included in <code>filter.scope
   * </code>.
   *
   * @return experiments
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LLMObsExperimentDataAttributesResponse> getExperiments() {
    return experiments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LLMObsExperimentDataAttributesResponse>> getExperiments_JsonNullable() {
    return experiments;
  }

  @JsonProperty(JSON_PROPERTY_EXPERIMENTS)
  public void setExperiments_JsonNullable(
      JsonNullable<List<LLMObsExperimentDataAttributesResponse>> experiments) {
    this.experiments = experiments;
  }

  public void setExperiments(List<LLMObsExperimentDataAttributesResponse> experiments) {
    this.experiments = JsonNullable.<List<LLMObsExperimentDataAttributesResponse>>of(experiments);
  }

  public LLMObsExperimentationSearchResults projects(List<LLMObsProjectDataResponse> projects) {
    this.projects = JsonNullable.<List<LLMObsProjectDataResponse>>of(projects);
    return this;
  }

  public LLMObsExperimentationSearchResults addProjectsItem(
      LLMObsProjectDataResponse projectsItem) {
    if (this.projects == null || !this.projects.isPresent()) {
      this.projects = JsonNullable.<List<LLMObsProjectDataResponse>>of(new ArrayList<>());
    }
    try {
      this.projects.get().add(projectsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Matching projects. Present when <code>projects</code> is included in <code>filter.scope</code>.
   *
   * @return projects
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LLMObsProjectDataResponse> getProjects() {
    return projects.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LLMObsProjectDataResponse>> getProjects_JsonNullable() {
    return projects;
  }

  @JsonProperty(JSON_PROPERTY_PROJECTS)
  public void setProjects_JsonNullable(JsonNullable<List<LLMObsProjectDataResponse>> projects) {
    this.projects = projects;
  }

  public void setProjects(List<LLMObsProjectDataResponse> projects) {
    this.projects = JsonNullable.<List<LLMObsProjectDataResponse>>of(projects);
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
   * @return LLMObsExperimentationSearchResults
   */
  @JsonAnySetter
  public LLMObsExperimentationSearchResults putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentationSearchResults object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentationSearchResults llmObsExperimentationSearchResults =
        (LLMObsExperimentationSearchResults) o;
    return Objects.equals(this.datasetRecords, llmObsExperimentationSearchResults.datasetRecords)
        && Objects.equals(this.datasets, llmObsExperimentationSearchResults.datasets)
        && Objects.equals(this.experimentRuns, llmObsExperimentationSearchResults.experimentRuns)
        && Objects.equals(this.experiments, llmObsExperimentationSearchResults.experiments)
        && Objects.equals(this.projects, llmObsExperimentationSearchResults.projects)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentationSearchResults.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        datasetRecords, datasets, experimentRuns, experiments, projects, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentationSearchResults {\n");
    sb.append("    datasetRecords: ").append(toIndentedString(datasetRecords)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    experimentRuns: ").append(toIndentedString(experimentRuns)).append("\n");
    sb.append("    experiments: ").append(toIndentedString(experiments)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
