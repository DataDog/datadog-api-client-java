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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>opensearch</code> destination writes logs to an OpenSearch cluster.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineOpenSearchDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineOpenSearchDestination.JSON_PROPERTY_BULK_INDEX,
  ObservabilityPipelineOpenSearchDestination.JSON_PROPERTY_DATA_STREAM,
  ObservabilityPipelineOpenSearchDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineOpenSearchDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineOpenSearchDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineOpenSearchDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_BULK_INDEX = "bulk_index";
  private String bulkIndex;

  public static final String JSON_PROPERTY_DATA_STREAM = "data_stream";
  private ObservabilityPipelineOpenSearchDestinationDataStream dataStream;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineOpenSearchDestinationType type =
      ObservabilityPipelineOpenSearchDestinationType.OPENSEARCH;

  public ObservabilityPipelineOpenSearchDestination() {}

  @JsonCreator
  public ObservabilityPipelineOpenSearchDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineOpenSearchDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineOpenSearchDestination buffer(
      ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * Configuration for buffer settings on destination components.
   *
   * @return buffer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptions getBuffer() {
    return buffer;
  }

  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }

  public ObservabilityPipelineOpenSearchDestination bulkIndex(String bulkIndex) {
    this.bulkIndex = bulkIndex;
    return this;
  }

  /**
   * The index to write logs to.
   *
   * @return bulkIndex
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BULK_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBulkIndex() {
    return bulkIndex;
  }

  public void setBulkIndex(String bulkIndex) {
    this.bulkIndex = bulkIndex;
  }

  public ObservabilityPipelineOpenSearchDestination dataStream(
      ObservabilityPipelineOpenSearchDestinationDataStream dataStream) {
    this.dataStream = dataStream;
    this.unparsed |= dataStream.unparsed;
    return this;
  }

  /**
   * Configuration options for writing to OpenSearch Data Streams instead of a fixed index.
   *
   * @return dataStream
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_STREAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineOpenSearchDestinationDataStream getDataStream() {
    return dataStream;
  }

  public void setDataStream(ObservabilityPipelineOpenSearchDestinationDataStream dataStream) {
    this.dataStream = dataStream;
  }

  public ObservabilityPipelineOpenSearchDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component.
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

  public ObservabilityPipelineOpenSearchDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineOpenSearchDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineOpenSearchDestination type(
      ObservabilityPipelineOpenSearchDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>opensearch</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineOpenSearchDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineOpenSearchDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineOpenSearchDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineOpenSearchDestination putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineOpenSearchDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineOpenSearchDestination observabilityPipelineOpenSearchDestination =
        (ObservabilityPipelineOpenSearchDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineOpenSearchDestination.buffer)
        && Objects.equals(this.bulkIndex, observabilityPipelineOpenSearchDestination.bulkIndex)
        && Objects.equals(this.dataStream, observabilityPipelineOpenSearchDestination.dataStream)
        && Objects.equals(this.id, observabilityPipelineOpenSearchDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineOpenSearchDestination.inputs)
        && Objects.equals(this.type, observabilityPipelineOpenSearchDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineOpenSearchDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buffer, bulkIndex, dataStream, id, inputs, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineOpenSearchDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    bulkIndex: ").append(toIndentedString(bulkIndex)).append("\n");
    sb.append("    dataStream: ").append(toIndentedString(dataStream)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
