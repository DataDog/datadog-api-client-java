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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** A record update payload for an LLM Observability dataset. */
@JsonPropertyOrder({
  LLMObsDatasetRecordUpdateItem.JSON_PROPERTY_EXPECTED_OUTPUT,
  LLMObsDatasetRecordUpdateItem.JSON_PROPERTY_ID,
  LLMObsDatasetRecordUpdateItem.JSON_PROPERTY_INPUT,
  LLMObsDatasetRecordUpdateItem.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDatasetRecordUpdateItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPECTED_OUTPUT = "expected_output";
  private JsonNullable<AnyValue> expectedOutput = JsonNullable.<AnyValue>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUT = "input";
  private JsonNullable<AnyValue> input = JsonNullable.<AnyValue>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public LLMObsDatasetRecordUpdateItem() {}

  @JsonCreator
  public LLMObsDatasetRecordUpdateItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id) {
    this.id = id;
  }

  public LLMObsDatasetRecordUpdateItem expectedOutput(AnyValue expectedOutput) {
    this.expectedOutput = JsonNullable.<AnyValue>of(expectedOutput);
    return this;
  }

  /**
   * Represents any valid JSON value.
   *
   * @return expectedOutput
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AnyValue getExpectedOutput() {
    return expectedOutput.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPECTED_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AnyValue> getExpectedOutput_JsonNullable() {
    return expectedOutput;
  }

  @JsonProperty(JSON_PROPERTY_EXPECTED_OUTPUT)
  public void setExpectedOutput_JsonNullable(JsonNullable<AnyValue> expectedOutput) {
    this.expectedOutput = expectedOutput;
  }

  public void setExpectedOutput(AnyValue expectedOutput) {
    this.expectedOutput = JsonNullable.<AnyValue>of(expectedOutput);
  }

  public LLMObsDatasetRecordUpdateItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the record to update.
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

  public LLMObsDatasetRecordUpdateItem input(AnyValue input) {
    this.input = JsonNullable.<AnyValue>of(input);
    return this;
  }

  /**
   * Represents any valid JSON value.
   *
   * @return input
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public AnyValue getInput() {
    return input.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<AnyValue> getInput_JsonNullable() {
    return input;
  }

  @JsonProperty(JSON_PROPERTY_INPUT)
  public void setInput_JsonNullable(JsonNullable<AnyValue> input) {
    this.input = input;
  }

  public void setInput(AnyValue input) {
    this.input = JsonNullable.<AnyValue>of(input);
  }

  public LLMObsDatasetRecordUpdateItem metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public LLMObsDatasetRecordUpdateItem putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Updated metadata associated with the record.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
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
   * @return LLMObsDatasetRecordUpdateItem
   */
  @JsonAnySetter
  public LLMObsDatasetRecordUpdateItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDatasetRecordUpdateItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDatasetRecordUpdateItem llmObsDatasetRecordUpdateItem = (LLMObsDatasetRecordUpdateItem) o;
    return Objects.equals(this.expectedOutput, llmObsDatasetRecordUpdateItem.expectedOutput)
        && Objects.equals(this.id, llmObsDatasetRecordUpdateItem.id)
        && Objects.equals(this.input, llmObsDatasetRecordUpdateItem.input)
        && Objects.equals(this.metadata, llmObsDatasetRecordUpdateItem.metadata)
        && Objects.equals(
            this.additionalProperties, llmObsDatasetRecordUpdateItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedOutput, id, input, metadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDatasetRecordUpdateItem {\n");
    sb.append("    expectedOutput: ").append(toIndentedString(expectedOutput)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
