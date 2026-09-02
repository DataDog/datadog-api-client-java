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
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_AUTO_ROUTING,
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_DATASET,
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_DTYPE,
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_NAMESPACE,
  ObservabilityPipelineElasticsearchDestinationDataStream.JSON_PROPERTY_SYNC_FIELDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineElasticsearchDestinationDataStream {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_ROUTING = "auto_routing";
  private Boolean autoRouting;

  public static final String JSON_PROPERTY_DATASET = "dataset";
  private String dataset;

  public static final String JSON_PROPERTY_DTYPE = "dtype";
  private String dtype;

  public static final String JSON_PROPERTY_NAMESPACE = "namespace";
  private String namespace;

  public static final String JSON_PROPERTY_SYNC_FIELDS = "sync_fields";
  private Boolean syncFields;

  public ObservabilityPipelineElasticsearchDestinationDataStream autoRouting(Boolean autoRouting) {
    this.autoRouting = autoRouting;
    return this;
  }

  /**
   * When <code>true</code>, automatically routes events to the appropriate data stream based on the
   * event content.
   *
   * @return autoRouting
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_ROUTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoRouting() {
    return autoRouting;
  }

  public void setAutoRouting(Boolean autoRouting) {
    this.autoRouting = autoRouting;
  }

  public ObservabilityPipelineElasticsearchDestinationDataStream dataset(String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The data stream dataset. This groups events by their source or application.
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
   * The data stream type. This determines how events are categorized within the data stream.
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
   * The data stream namespace. This separates events into different environments or domains.
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

  public ObservabilityPipelineElasticsearchDestinationDataStream syncFields(Boolean syncFields) {
    this.syncFields = syncFields;
    return this;
  }

  /**
   * When <code>true</code>, synchronizes data stream fields with the Elasticsearch index mapping.
   *
   * @return syncFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNC_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSyncFields() {
    return syncFields;
  }

  public void setSyncFields(Boolean syncFields) {
    this.syncFields = syncFields;
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
            this.autoRouting, observabilityPipelineElasticsearchDestinationDataStream.autoRouting)
        && Objects.equals(
            this.dataset, observabilityPipelineElasticsearchDestinationDataStream.dataset)
        && Objects.equals(this.dtype, observabilityPipelineElasticsearchDestinationDataStream.dtype)
        && Objects.equals(
            this.namespace, observabilityPipelineElasticsearchDestinationDataStream.namespace)
        && Objects.equals(
            this.syncFields, observabilityPipelineElasticsearchDestinationDataStream.syncFields)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineElasticsearchDestinationDataStream.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRouting, dataset, dtype, namespace, syncFields, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineElasticsearchDestinationDataStream {\n");
    sb.append("    autoRouting: ").append(toIndentedString(autoRouting)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    dtype: ").append(toIndentedString(dtype)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    syncFields: ").append(toIndentedString(syncFields)).append("\n");
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
