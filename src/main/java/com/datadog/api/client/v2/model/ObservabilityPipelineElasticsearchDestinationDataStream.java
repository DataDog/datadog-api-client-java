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

/** Configuration options for writing to Elasticsearch Data Streams instead of a fixed index. */
@JsonPropertyOrder({
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_DATASET,
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_DTYPE,
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_NAMESPACE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineElasticsearchDestinationDataStream {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET = "dataset";
  private String dataset;

  public static final String JSON_PROPERTY_DTYPE = "dtype";
  private String dtype;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public ObservabilityPipelineElasticsearchDestinationDataStream dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The data stream dataset for your logs. This groups logs by their source or application.
   *
   * @return dataset
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataset() {
    return dataset;
  }

  public void setDataset(String dataset) {
    this.dataset = dataset;
  }

  public ObservabilityPipelineElasticsearchDestinationDataStream dtype(String dtype) {
    this.dtype = dtype;
    return this;
  }

  /**
   * The data stream type for your logs. This determines how logs are categorized within the data
   * stream.
   *
   * @return dtype
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDtype() {
    return dtype;
  }

  public void setDtype(String dtype) {
    this.dtype = dtype;
  }

  public ObservabilityPipelineElasticsearchDestinationDataStream namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The data stream namespace for your logs. This separates logs into different environments or
   * domains.
   *
   * @return namespace
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
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
   * @return ObservabilityPipelineElasticsearchDestinationDataStream
   */
  @JsonAnySetter
  public ObservabilityPipelineElasticsearchDestinationDataStream putAdditionalProperty(
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
   * Return true if this ObservabilityPipelineElasticsearchDestinationDataStream object is equal to
   * o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineElasticsearchDestinationDataStream
        observabilityPipelineElasticsearchDestinationDataStream =
            (ObservabilityPipelineElasticsearchDestinationDataStream) o;
    return Objects.equals(
            this.dataset, observabilityPipelineElasticsearchDestinationDataStream.dataset)
        && Objects.equals(this.dtype, observabilityPipelineElasticsearchDestinationDataStream.dtype)
        && Objects.equals(
            this.namespace, observabilityPipelineElasticsearchDestinationDataStream.namespace)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineElasticsearchDestinationDataStream.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, dtype, namespace, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineElasticsearchDestinationDataStream {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    dtype: ").append(toIndentedString(dtype)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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
