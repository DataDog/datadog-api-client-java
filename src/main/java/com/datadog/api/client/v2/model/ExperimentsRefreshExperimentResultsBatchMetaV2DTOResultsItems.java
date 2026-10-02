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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Refresh outcome for one experiment. */
@JsonPropertyOrder({
  ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems.JSON_PROPERTY_EXPERIMENT_ID,
  ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems.JSON_PROPERTY_OUTCOME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private String experimentId;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItemsOutcome outcome;

  public ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems experimentId(
      String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * ID of the experiment associated with this result.
   *
   * @return experimentId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPERIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExperimentId() {
    return experimentId;
  }

  public void setExperimentId(String experimentId) {
    this.experimentId = experimentId;
  }

  public ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems outcome(
      ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItemsOutcome outcome) {
    this.outcome = outcome;
    this.unparsed |= !outcome.isValid();
    return this;
  }

  /**
   * Outcome of attempting to refresh one experiment.
   *
   * @return outcome
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItemsOutcome getOutcome() {
    return outcome;
  }

  public void setOutcome(
      ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItemsOutcome outcome) {
    if (!outcome.isValid()) {
      this.unparsed = true;
    }
    this.outcome = outcome;
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
   * @return ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems
   */
  @JsonAnySetter
  public ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems putAdditionalProperty(
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
   * Return true if this ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems
        experimentsRefreshExperimentResultsBatchMetaV2DtoResultsItems =
            (ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems) o;
    return Objects.equals(
            this.experimentId,
            experimentsRefreshExperimentResultsBatchMetaV2DtoResultsItems.experimentId)
        && Objects.equals(
            this.outcome, experimentsRefreshExperimentResultsBatchMetaV2DtoResultsItems.outcome)
        && Objects.equals(
            this.additionalProperties,
            experimentsRefreshExperimentResultsBatchMetaV2DtoResultsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, outcome, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsRefreshExperimentResultsBatchMetaV2DTOResultsItems {\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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
