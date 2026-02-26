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
   * <p>The <code>sentinel_one</code> destination sends logs to SentinelOne.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineSentinelOneDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineSentinelOneDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineSentinelOneDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineSentinelOneDestination.JSON_PROPERTY_REGION,
  ObservabilityPipelineSentinelOneDestination.JSON_PROPERTY_TOKEN_KEY,
  ObservabilityPipelineSentinelOneDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSentinelOneDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_REGION = "region";
  private ObservabilityPipelineSentinelOneDestinationRegion region;

  public static final String JSON_PROPERTY_TOKEN_KEY = "token_key";
  private String tokenKey;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSentinelOneDestinationType type = ObservabilityPipelineSentinelOneDestinationType.SENTINEL_ONE;

  public ObservabilityPipelineSentinelOneDestination() {}

  @JsonCreator
  public ObservabilityPipelineSentinelOneDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_REGION)ObservabilityPipelineSentinelOneDestinationRegion region,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineSentinelOneDestinationType type) {
        this.id = id;
        this.inputs = inputs;
        this.region = region;
        this.unparsed |= !region.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineSentinelOneDestination buffer(ObservabilityPipelineBufferOptions buffer) {
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
  public ObservabilityPipelineSentinelOneDestination id(String id) {
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
  public ObservabilityPipelineSentinelOneDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineSentinelOneDestination addInputsItem(String inputsItem) {
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
  public ObservabilityPipelineSentinelOneDestination region(ObservabilityPipelineSentinelOneDestinationRegion region) {
    this.region = region;
    this.unparsed |= !region.isValid();
    return this;
  }

  /**
   * <p>The SentinelOne region to send logs to.</p>
   * @return region
  **/
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSentinelOneDestinationRegion getRegion() {
        return region;
      }
  public void setRegion(ObservabilityPipelineSentinelOneDestinationRegion region) {
    if (!region.isValid()) {
        this.unparsed = true;
    }
    this.region = region;
  }
  public ObservabilityPipelineSentinelOneDestination tokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the SentinelOne API token.</p>
   * @return tokenKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOKEN_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTokenKey() {
        return tokenKey;
      }
  public void setTokenKey(String tokenKey) {
    this.tokenKey = tokenKey;
  }
  public ObservabilityPipelineSentinelOneDestination type(ObservabilityPipelineSentinelOneDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>sentinel_one</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSentinelOneDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineSentinelOneDestinationType type) {
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
   * @return ObservabilityPipelineSentinelOneDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineSentinelOneDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineSentinelOneDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSentinelOneDestination observabilityPipelineSentinelOneDestination = (ObservabilityPipelineSentinelOneDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineSentinelOneDestination.buffer) && Objects.equals(this.id, observabilityPipelineSentinelOneDestination.id) && Objects.equals(this.inputs, observabilityPipelineSentinelOneDestination.inputs) && Objects.equals(this.region, observabilityPipelineSentinelOneDestination.region) && Objects.equals(this.tokenKey, observabilityPipelineSentinelOneDestination.tokenKey) && Objects.equals(this.type, observabilityPipelineSentinelOneDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineSentinelOneDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(buffer,id,inputs,region,tokenKey,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSentinelOneDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tokenKey: ").append(toIndentedString(tokenKey)).append("\n");
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
