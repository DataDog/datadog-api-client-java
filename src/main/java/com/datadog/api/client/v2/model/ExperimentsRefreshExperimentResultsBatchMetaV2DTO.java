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

/** Summary of refresh outcomes across the organization's experiments. */
@JsonPropertyOrder({
  ExperimentsRefreshExperimentResultsBatchMetaV2DTO.JSON_PROPERTY_EXPERIMENTS_UPDATED,
  ExperimentsRefreshExperimentResultsBatchMetaV2DTO.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsRefreshExperimentResultsBatchMetaV2DTO {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPERIMENTS_UPDATED = "experiments_updated";
  private Long experimentsUpdated;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems> results = null;

  public ExperimentsRefreshExperimentResultsBatchMetaV2DTO experimentsUpdated(
      Long experimentsUpdated) {
    this.experimentsUpdated = experimentsUpdated;
    return this;
  }

  /**
   * Number of experiments updated by the refresh request.
   *
   * @return experimentsUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENTS_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExperimentsUpdated() {
    return experimentsUpdated;
  }

  public void setExperimentsUpdated(Long experimentsUpdated) {
    this.experimentsUpdated = experimentsUpdated;
  }

  public ExperimentsRefreshExperimentResultsBatchMetaV2DTO results(
      List<ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems> results) {
    this.results = results;
    if (results != null) {
      for (ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems item : results) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsRefreshExperimentResultsBatchMetaV2DTO addResultsItem(
      ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    this.unparsed |= resultsItem.unparsed;
    return this;
  }

  /**
   * Refresh outcome reported for each experiment.
   *
   * @return results
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems> getResults() {
    return results;
  }

  public void setResults(
      List<ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems> results) {
    this.results = results;
    if (results != null) {
      for (ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems item : results) {
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
   * @return ExperimentsRefreshExperimentResultsBatchMetaV2DTO
   */
  @JsonAnySetter
  public ExperimentsRefreshExperimentResultsBatchMetaV2DTO putAdditionalProperty(
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

  /** Return true if this ExperimentsRefreshExperimentResultsBatchMetaV2DTO object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsRefreshExperimentResultsBatchMetaV2DTO
        experimentsRefreshExperimentResultsBatchMetaV2Dto =
            (ExperimentsRefreshExperimentResultsBatchMetaV2DTO) o;
    return Objects.equals(
            this.experimentsUpdated,
            experimentsRefreshExperimentResultsBatchMetaV2Dto.experimentsUpdated)
        && Objects.equals(this.results, experimentsRefreshExperimentResultsBatchMetaV2Dto.results)
        && Objects.equals(
            this.additionalProperties,
            experimentsRefreshExperimentResultsBatchMetaV2Dto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentsUpdated, results, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsRefreshExperimentResultsBatchMetaV2DTO {\n");
    sb.append("    experimentsUpdated: ").append(toIndentedString(experimentsUpdated)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
