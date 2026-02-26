/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The <code>elasticsearch</code> destination writes logs to an Elasticsearch cluster.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_API_VERSION,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_BULK_INDEX,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_DATA_STREAM,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineElasticsearchDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineElasticsearchDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_API_VERSION = "api_version";
  private ObservabilityPipelineElasticsearchDestinationApiVersion apiVersion;

  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineElasticsearchDestinationAuth auth;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_BULK_INDEX = "bulk_index";
  private String bulkIndex;

  public static final String JSON_PROPERTY_DATA_STREAM = "data_stream";
  private ObservabilityPipelineElasticsearchDestinationDataStream dataStream;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineElasticsearchDestinationType type = ObservabilityPipelineElasticsearchDestinationType.ELASTICSEARCH;

  public ObservabilityPipelineElasticsearchDestination() {}

  @JsonCreator
  public ObservabilityPipelineElasticsearchDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineElasticsearchDestinationType type) {
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineElasticsearchDestination apiVersion(ObservabilityPipelineElasticsearchDestinationApiVersion apiVersion) {
    this.apiVersion = apiVersion;
    this.unparsed |= !apiVersion.isValid();
    return this;
  }

  /**
   * <p>The Elasticsearch API version to use. Set to <code>auto</code> to auto-detect.</p>
   * @return apiVersion
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_API_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineElasticsearchDestinationApiVersion getApiVersion() {
        return apiVersion;
      }
  public void setApiVersion(ObservabilityPipelineElasticsearchDestinationApiVersion apiVersion) {
    if (!apiVersion.isValid()) {
        this.unparsed = true;
    }
    this.apiVersion = apiVersion;
  }
  public ObservabilityPipelineElasticsearchDestination auth(ObservabilityPipelineElasticsearchDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * <p>Authentication settings for the Elasticsearch destination.
   * When <code>strategy</code> is <code>basic</code>, use <code>username_key</code> and <code>password_key</code> to reference credentials stored in environment variables or secrets.</p>
   * @return auth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineElasticsearchDestinationAuth getAuth() {
        return auth;
      }
  public void setAuth(ObservabilityPipelineElasticsearchDestinationAuth auth) {
    this.auth = auth;
  }
  public ObservabilityPipelineElasticsearchDestination buffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * <p>Configuration for buffer settings on destination components.</p>
   * @return buffer
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BUFFER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineBufferOptions getBuffer() {
        return buffer;
      }
  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }
  public ObservabilityPipelineElasticsearchDestination bulkIndex(String bulkIndex) {
    this.bulkIndex = bulkIndex;
    return this;
  }

  /**
   * <p>The index to write logs to in Elasticsearch.</p>
   * @return bulkIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BULK_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBulkIndex() {
        return bulkIndex;
      }
  public void setBulkIndex(String bulkIndex) {
    this.bulkIndex = bulkIndex;
  }
  public ObservabilityPipelineElasticsearchDestination dataStream(ObservabilityPipelineElasticsearchDestinationDataStream dataStream) {
    this.dataStream = dataStream;
    this.unparsed |= dataStream.unparsed;
    return this;
  }

  /**
   * <p>Configuration options for writing to Elasticsearch Data Streams instead of a fixed index.</p>
   * @return dataStream
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA_STREAM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineElasticsearchDestinationDataStream getDataStream() {
        return dataStream;
      }
  public void setDataStream(ObservabilityPipelineElasticsearchDestinationDataStream dataStream) {
    this.dataStream = dataStream;
  }
  public ObservabilityPipelineElasticsearchDestination endpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the Elasticsearch endpoint URL.</p>
   * @return endpointUrlKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENDPOINT_URL_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEndpointUrlKey() {
        return endpointUrlKey;
      }
  public void setEndpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
  }
  public ObservabilityPipelineElasticsearchDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this component.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ObservabilityPipelineElasticsearchDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineElasticsearchDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * <p>A list of component IDs whose output is used as the <code>input</code> for this component.</p>
   * @return inputs
  **/
      @JsonProperty(JSON_PROPERTY_INPUTS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getInputs() {
        return inputs;
      }
  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }
  public ObservabilityPipelineElasticsearchDestination type(ObservabilityPipelineElasticsearchDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>elasticsearch</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineElasticsearchDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineElasticsearchDestinationType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ObservabilityPipelineElasticsearchDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineElasticsearchDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineElasticsearchDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineElasticsearchDestination observabilityPipelineElasticsearchDestination = (ObservabilityPipelineElasticsearchDestination) o;
    return Objects.equals(this.apiVersion, observabilityPipelineElasticsearchDestination.apiVersion) && Objects.equals(this.auth, observabilityPipelineElasticsearchDestination.auth) && Objects.equals(this.buffer, observabilityPipelineElasticsearchDestination.buffer) && Objects.equals(this.bulkIndex, observabilityPipelineElasticsearchDestination.bulkIndex) && Objects.equals(this.dataStream, observabilityPipelineElasticsearchDestination.dataStream) && Objects.equals(this.endpointUrlKey, observabilityPipelineElasticsearchDestination.endpointUrlKey) && Objects.equals(this.id, observabilityPipelineElasticsearchDestination.id) && Objects.equals(this.inputs, observabilityPipelineElasticsearchDestination.inputs) && Objects.equals(this.type, observabilityPipelineElasticsearchDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineElasticsearchDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(apiVersion,auth,buffer,bulkIndex,dataStream,endpointUrlKey,id,inputs,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineElasticsearchDestination {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    bulkIndex: ").append(toIndentedString(bulkIndex)).append("\n");
    sb.append("    dataStream: ").append(toIndentedString(dataStream)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
