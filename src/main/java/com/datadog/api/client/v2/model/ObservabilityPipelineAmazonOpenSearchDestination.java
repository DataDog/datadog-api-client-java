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
   * <p>The <code>amazon_opensearch</code> destination writes logs to Amazon OpenSearch.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineAmazonOpenSearchDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineAmazonOpenSearchDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineAmazonOpenSearchDestination.JSON_PROPERTY_BULK_INDEX,
  ObservabilityPipelineAmazonOpenSearchDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineAmazonOpenSearchDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAmazonOpenSearchDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAmazonOpenSearchDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineAmazonOpenSearchDestinationAuth auth;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_BULK_INDEX = "bulk_index";
  private String bulkIndex;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAmazonOpenSearchDestinationType type = ObservabilityPipelineAmazonOpenSearchDestinationType.AMAZON_OPENSEARCH;

  public ObservabilityPipelineAmazonOpenSearchDestination() {}

  @JsonCreator
  public ObservabilityPipelineAmazonOpenSearchDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_AUTH)ObservabilityPipelineAmazonOpenSearchDestinationAuth auth,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineAmazonOpenSearchDestinationType type) {
        this.auth = auth;
        this.unparsed |= auth.unparsed;
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineAmazonOpenSearchDestination auth(ObservabilityPipelineAmazonOpenSearchDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * <p>Authentication settings for the Amazon OpenSearch destination.
   * The <code>strategy</code> field determines whether basic or AWS-based authentication is used.</p>
   * @return auth
  **/
      @JsonProperty(JSON_PROPERTY_AUTH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonOpenSearchDestinationAuth getAuth() {
        return auth;
      }
  public void setAuth(ObservabilityPipelineAmazonOpenSearchDestinationAuth auth) {
    this.auth = auth;
  }
  public ObservabilityPipelineAmazonOpenSearchDestination buffer(ObservabilityPipelineBufferOptions buffer) {
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
  public ObservabilityPipelineAmazonOpenSearchDestination bulkIndex(String bulkIndex) {
    this.bulkIndex = bulkIndex;
    return this;
  }

  /**
   * <p>The index to write logs to.</p>
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
  public ObservabilityPipelineAmazonOpenSearchDestination id(String id) {
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
  public ObservabilityPipelineAmazonOpenSearchDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineAmazonOpenSearchDestination addInputsItem(String inputsItem) {
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
  public ObservabilityPipelineAmazonOpenSearchDestination type(ObservabilityPipelineAmazonOpenSearchDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>amazon_opensearch</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineAmazonOpenSearchDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineAmazonOpenSearchDestinationType type) {
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
   * @return ObservabilityPipelineAmazonOpenSearchDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineAmazonOpenSearchDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineAmazonOpenSearchDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAmazonOpenSearchDestination observabilityPipelineAmazonOpenSearchDestination = (ObservabilityPipelineAmazonOpenSearchDestination) o;
    return Objects.equals(this.auth, observabilityPipelineAmazonOpenSearchDestination.auth) && Objects.equals(this.buffer, observabilityPipelineAmazonOpenSearchDestination.buffer) && Objects.equals(this.bulkIndex, observabilityPipelineAmazonOpenSearchDestination.bulkIndex) && Objects.equals(this.id, observabilityPipelineAmazonOpenSearchDestination.id) && Objects.equals(this.inputs, observabilityPipelineAmazonOpenSearchDestination.inputs) && Objects.equals(this.type, observabilityPipelineAmazonOpenSearchDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineAmazonOpenSearchDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(auth,buffer,bulkIndex,id,inputs,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAmazonOpenSearchDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    bulkIndex: ").append(toIndentedString(bulkIndex)).append("\n");
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
