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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A single LLM Observability dataset record. */
@JsonPropertyOrder({
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_CREATED_AT,
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_DATASET_ID,
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_EXPECTED_OUTPUT,
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_ID,
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_INPUT,
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_METADATA,
  LLMObsDatasetRecordDataResponse.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDatasetRecordDataResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_EXPECTED_OUTPUT = "expected_output";
  private AnyValue expectedOutput;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUT = "input";
  private AnyValue input;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public LLMObsDatasetRecordDataResponse() {}

  @JsonCreator
  public LLMObsDatasetRecordDataResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPECTED_OUTPUT) AnyValue expectedOutput,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT) AnyValue input,
      @JsonProperty(required = true, value = JSON_PROPERTY_METADATA) Map<String, Object> metadata,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.datasetId = datasetId;
    this.expectedOutput = expectedOutput;
    if (expectedOutput != null) {
      this.unparsed |= expectedOutput.unparsed;
    }
    this.id = id;
    this.input = input;
    if (input != null) {
      this.unparsed |= input.unparsed;
    }
    this.metadata = metadata;
    if (metadata != null) {}
    this.updatedAt = updatedAt;
  }

  public LLMObsDatasetRecordDataResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the record was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LLMObsDatasetRecordDataResponse datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Identifier of the dataset this record belongs to.
   *
   * @return datasetId
   */
  @JsonProperty(JSON_PROPERTY_DATASET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public LLMObsDatasetRecordDataResponse expectedOutput(AnyValue expectedOutput) {
    this.expectedOutput = expectedOutput;
    if (expectedOutput != null) {
      this.unparsed |= expectedOutput.unparsed;
    }
    return this;
  }

  /**
   * Represents any valid JSON value.
   *
   * @return expectedOutput
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnyValue getExpectedOutput() {
    return expectedOutput;
  }

  public void setExpectedOutput(AnyValue expectedOutput) {
    this.expectedOutput = expectedOutput;
  }

  public LLMObsDatasetRecordDataResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the record.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsDatasetRecordDataResponse input(AnyValue input) {
    this.input = input;
    if (input != null) {
      this.unparsed |= input.unparsed;
    }
    return this;
  }

  /**
   * Represents any valid JSON value.
   *
   * @return input
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AnyValue getInput() {
    return input;
  }

  public void setInput(AnyValue input) {
    this.input = input;
  }

  public LLMObsDatasetRecordDataResponse metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    if (metadata != null) {}
    return this;
  }

  public LLMObsDatasetRecordDataResponse putMetadataItem(String key, Object metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Arbitrary metadata associated with the record.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public LLMObsDatasetRecordDataResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the record was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * @return LLMObsDatasetRecordDataResponse
   */
  @JsonAnySetter
  public LLMObsDatasetRecordDataResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDatasetRecordDataResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDatasetRecordDataResponse llmObsDatasetRecordDataResponse =
        (LLMObsDatasetRecordDataResponse) o;
    return Objects.equals(this.createdAt, llmObsDatasetRecordDataResponse.createdAt)
        && Objects.equals(this.datasetId, llmObsDatasetRecordDataResponse.datasetId)
        && Objects.equals(this.expectedOutput, llmObsDatasetRecordDataResponse.expectedOutput)
        && Objects.equals(this.id, llmObsDatasetRecordDataResponse.id)
        && Objects.equals(this.input, llmObsDatasetRecordDataResponse.input)
        && Objects.equals(this.metadata, llmObsDatasetRecordDataResponse.metadata)
        && Objects.equals(this.updatedAt, llmObsDatasetRecordDataResponse.updatedAt)
        && Objects.equals(
            this.additionalProperties, llmObsDatasetRecordDataResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, datasetId, expectedOutput, id, input, metadata, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDatasetRecordDataResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    expectedOutput: ").append(toIndentedString(expectedOutput)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
