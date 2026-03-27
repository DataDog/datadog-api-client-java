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
 * The <code>azure_storage</code> destination forwards logs to an Azure Blob Storage container.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  AzureStorageDestination.JSON_PROPERTY_BLOB_PREFIX,
  AzureStorageDestination.JSON_PROPERTY_BUFFER,
  AzureStorageDestination.JSON_PROPERTY_CONNECTION_STRING_KEY,
  AzureStorageDestination.JSON_PROPERTY_CONTAINER_NAME,
  AzureStorageDestination.JSON_PROPERTY_ID,
  AzureStorageDestination.JSON_PROPERTY_INPUTS,
  AzureStorageDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AzureStorageDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BLOB_PREFIX = "blob_prefix";
  private String blobPrefix;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_CONNECTION_STRING_KEY = "connection_string_key";
  private String connectionStringKey;

  public static final String JSON_PROPERTY_CONTAINER_NAME = "container_name";
  private String containerName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private AzureStorageDestinationType type = AzureStorageDestinationType.AZURE_STORAGE;

  public AzureStorageDestination() {}

  @JsonCreator
  public AzureStorageDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTAINER_NAME) String containerName,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) AzureStorageDestinationType type) {
    this.containerName = containerName;
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public AzureStorageDestination blobPrefix(String blobPrefix) {
    this.blobPrefix = blobPrefix;
    return this;
  }

  /**
   * Optional prefix for blobs written to the container.
   *
   * @return blobPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOB_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBlobPrefix() {
    return blobPrefix;
  }

  public void setBlobPrefix(String blobPrefix) {
    this.blobPrefix = blobPrefix;
  }

  public AzureStorageDestination buffer(ObservabilityPipelineBufferOptions buffer) {
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

  public AzureStorageDestination connectionStringKey(String connectionStringKey) {
    this.connectionStringKey = connectionStringKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Azure Storage connection string.
   *
   * @return connectionStringKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConnectionStringKey() {
    return connectionStringKey;
  }

  public void setConnectionStringKey(String connectionStringKey) {
    this.connectionStringKey = connectionStringKey;
  }

  public AzureStorageDestination containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

  /**
   * The name of the Azure Blob Storage container to store logs in.
   *
   * @return containerName
   */
  @JsonProperty(JSON_PROPERTY_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public AzureStorageDestination id(String id) {
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

  public AzureStorageDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public AzureStorageDestination addInputsItem(String inputsItem) {
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

  public AzureStorageDestination type(AzureStorageDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>azure_storage</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AzureStorageDestinationType getType() {
    return type;
  }

  public void setType(AzureStorageDestinationType type) {
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
   * @return AzureStorageDestination
   */
  @JsonAnySetter
  public AzureStorageDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AzureStorageDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureStorageDestination azureStorageDestination = (AzureStorageDestination) o;
    return Objects.equals(this.blobPrefix, azureStorageDestination.blobPrefix)
        && Objects.equals(this.buffer, azureStorageDestination.buffer)
        && Objects.equals(this.connectionStringKey, azureStorageDestination.connectionStringKey)
        && Objects.equals(this.containerName, azureStorageDestination.containerName)
        && Objects.equals(this.id, azureStorageDestination.id)
        && Objects.equals(this.inputs, azureStorageDestination.inputs)
        && Objects.equals(this.type, azureStorageDestination.type)
        && Objects.equals(this.additionalProperties, azureStorageDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        blobPrefix,
        buffer,
        connectionStringKey,
        containerName,
        id,
        inputs,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureStorageDestination {\n");
    sb.append("    blobPrefix: ").append(toIndentedString(blobPrefix)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    connectionStringKey: ")
        .append(toIndentedString(connectionStringKey))
        .append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
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
