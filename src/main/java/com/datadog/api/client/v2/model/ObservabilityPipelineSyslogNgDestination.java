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
   * <p>The <code>syslog_ng</code> destination forwards logs to an external <code>syslog-ng</code> server over TCP or UDP using the syslog protocol.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_KEEPALIVE,
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineSyslogNgDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSyslogNgDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_KEEPALIVE = "keepalive";
  private Long keepalive;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSyslogNgDestinationType type = ObservabilityPipelineSyslogNgDestinationType.SYSLOG_NG;

  public ObservabilityPipelineSyslogNgDestination() {}

  @JsonCreator
  public ObservabilityPipelineSyslogNgDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineSyslogNgDestinationType type) {
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineSyslogNgDestination buffer(ObservabilityPipelineBufferOptions buffer) {
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
  public ObservabilityPipelineSyslogNgDestination endpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the syslog-ng server endpoint URL.</p>
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
  public ObservabilityPipelineSyslogNgDestination id(String id) {
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
  public ObservabilityPipelineSyslogNgDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineSyslogNgDestination addInputsItem(String inputsItem) {
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
  public ObservabilityPipelineSyslogNgDestination keepalive(Long keepalive) {
    this.keepalive = keepalive;
    return this;
  }

  /**
   * <p>Optional socket keepalive duration in milliseconds.</p>
   * minimum: 0
   * @return keepalive
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEEPALIVE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getKeepalive() {
        return keepalive;
      }
  public void setKeepalive(Long keepalive) {
    this.keepalive = keepalive;
  }
  public ObservabilityPipelineSyslogNgDestination tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * <p>Configuration for enabling TLS encryption between the pipeline component and external services.</p>
   * @return tls
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TLS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineTls getTls() {
        return tls;
      }
  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }
  public ObservabilityPipelineSyslogNgDestination type(ObservabilityPipelineSyslogNgDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>syslog_ng</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSyslogNgDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineSyslogNgDestinationType type) {
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
   * @return ObservabilityPipelineSyslogNgDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineSyslogNgDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineSyslogNgDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSyslogNgDestination observabilityPipelineSyslogNgDestination = (ObservabilityPipelineSyslogNgDestination) o;
    return Objects.equals(this.buffer, observabilityPipelineSyslogNgDestination.buffer) && Objects.equals(this.endpointUrlKey, observabilityPipelineSyslogNgDestination.endpointUrlKey) && Objects.equals(this.id, observabilityPipelineSyslogNgDestination.id) && Objects.equals(this.inputs, observabilityPipelineSyslogNgDestination.inputs) && Objects.equals(this.keepalive, observabilityPipelineSyslogNgDestination.keepalive) && Objects.equals(this.tls, observabilityPipelineSyslogNgDestination.tls) && Objects.equals(this.type, observabilityPipelineSyslogNgDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineSyslogNgDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(buffer,endpointUrlKey,id,inputs,keepalive,tls,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSyslogNgDestination {\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    keepalive: ").append(toIndentedString(keepalive)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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
