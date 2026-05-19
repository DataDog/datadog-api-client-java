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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Data object for an LLM Observability experiment run. */
@JsonPropertyOrder({
  LLMObsExperimentRunDataResponse.JSON_PROPERTY_AGGREGATE_DATA,
  LLMObsExperimentRunDataResponse.JSON_PROPERTY_CREATED_AT,
  LLMObsExperimentRunDataResponse.JSON_PROPERTY_EXPERIMENT_ID,
  LLMObsExperimentRunDataResponse.JSON_PROPERTY_ID,
  LLMObsExperimentRunDataResponse.JSON_PROPERTY_RUN_NUMBER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsExperimentRunDataResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AGGREGATE_DATA = "aggregate_data";
  private JsonNullable<Map<String, Object>> aggregateData =
      JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPERIMENT_ID = "experiment_id";
  private String experimentId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RUN_NUMBER = "run_number";
  private Integer runNumber;

  public LLMObsExperimentRunDataResponse aggregateData(Map<String, Object> aggregateData) {
    this.aggregateData = JsonNullable.<Map<String, Object>>of(aggregateData);
    return this;
  }

  public LLMObsExperimentRunDataResponse putAggregateDataItem(
      String key, Object aggregateDataItem) {
    if (this.aggregateData == null || !this.aggregateData.isPresent()) {
      this.aggregateData = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.aggregateData.get().put(key, aggregateDataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Aggregated metric data for this run.
   *
   * @return aggregateData
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getAggregateData() {
    return aggregateData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGGREGATE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getAggregateData_JsonNullable() {
    return aggregateData;
  }

  @JsonProperty(JSON_PROPERTY_AGGREGATE_DATA)
  public void setAggregateData_JsonNullable(JsonNullable<Map<String, Object>> aggregateData) {
    this.aggregateData = aggregateData;
  }

  public void setAggregateData(Map<String, Object> aggregateData) {
    this.aggregateData = JsonNullable.<Map<String, Object>>of(aggregateData);
  }

  public LLMObsExperimentRunDataResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the run was created.
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

  public LLMObsExperimentRunDataResponse experimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * Identifier of the experiment this run belongs to.
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

  public LLMObsExperimentRunDataResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the experiment run.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsExperimentRunDataResponse runNumber(Integer runNumber) {
    this.runNumber = runNumber;
    return this;
  }

  /**
   * Sequential number of this run within the experiment. maximum: 2147483647
   *
   * @return runNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRunNumber() {
    return runNumber;
  }

  public void setRunNumber(Integer runNumber) {
    this.runNumber = runNumber;
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
   * @return LLMObsExperimentRunDataResponse
   */
  @JsonAnySetter
  public LLMObsExperimentRunDataResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsExperimentRunDataResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsExperimentRunDataResponse llmObsExperimentRunDataResponse =
        (LLMObsExperimentRunDataResponse) o;
    return Objects.equals(this.aggregateData, llmObsExperimentRunDataResponse.aggregateData)
        && Objects.equals(this.createdAt, llmObsExperimentRunDataResponse.createdAt)
        && Objects.equals(this.experimentId, llmObsExperimentRunDataResponse.experimentId)
        && Objects.equals(this.id, llmObsExperimentRunDataResponse.id)
        && Objects.equals(this.runNumber, llmObsExperimentRunDataResponse.runNumber)
        && Objects.equals(
            this.additionalProperties, llmObsExperimentRunDataResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        aggregateData, createdAt, experimentId, id, runNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsExperimentRunDataResponse {\n");
    sb.append("    aggregateData: ").append(toIndentedString(aggregateData)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    runNumber: ").append(toIndentedString(runNumber)).append("\n");
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
