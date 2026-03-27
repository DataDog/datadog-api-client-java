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
   * <p>The <code>google_chronicle</code> destination sends logs to Google Chronicle.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_CUSTOMER_ID,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_LOG_TYPE,
  ObservabilityPipelineGoogleChronicleDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGoogleChronicleDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineGcpAuth auth;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customer_id";
  private String customerId;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineGoogleChronicleDestinationEncoding encoding;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_LOG_TYPE = "log_type";
  private String logType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineGoogleChronicleDestinationType type = ObservabilityPipelineGoogleChronicleDestinationType.GOOGLE_CHRONICLE;

  public ObservabilityPipelineGoogleChronicleDestination() {}

  @JsonCreator
  public ObservabilityPipelineGoogleChronicleDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_CUSTOMER_ID)String customerId,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineGoogleChronicleDestinationType type) {
        this.customerId = customerId;
        this.id = id;
        this.inputs = inputs;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineGoogleChronicleDestination auth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * <p>Google Cloud credentials used to authenticate with Google Cloud Storage.</p>
   * @return auth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AUTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineGcpAuth getAuth() {
        return auth;
      }
  public void setAuth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
  }
  public ObservabilityPipelineGoogleChronicleDestination buffer(ObservabilityPipelineBufferOptions buffer) {
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
  public ObservabilityPipelineGoogleChronicleDestination customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * <p>The Google Chronicle customer ID.</p>
   * @return customerId
  **/
      @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCustomerId() {
        return customerId;
      }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }
  public ObservabilityPipelineGoogleChronicleDestination encoding(ObservabilityPipelineGoogleChronicleDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * <p>The encoding format for the logs sent to Chronicle.</p>
   * @return encoding
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENCODING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineGoogleChronicleDestinationEncoding getEncoding() {
        return encoding;
      }
  public void setEncoding(ObservabilityPipelineGoogleChronicleDestinationEncoding encoding) {
    if (!encoding.isValid()) {
        this.unparsed = true;
    }
    this.encoding = encoding;
  }
  public ObservabilityPipelineGoogleChronicleDestination endpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the Google Chronicle endpoint URL.</p>
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
  public ObservabilityPipelineGoogleChronicleDestination id(String id) {
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
  public ObservabilityPipelineGoogleChronicleDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineGoogleChronicleDestination addInputsItem(String inputsItem) {
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
  public ObservabilityPipelineGoogleChronicleDestination logType(String logType) {
    this.logType = logType;
    return this;
  }

  /**
   * <p>The log type metadata associated with the Chronicle destination.</p>
   * @return logType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOG_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLogType() {
        return logType;
      }
  public void setLogType(String logType) {
    this.logType = logType;
  }
  public ObservabilityPipelineGoogleChronicleDestination type(ObservabilityPipelineGoogleChronicleDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>google_chronicle</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineGoogleChronicleDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineGoogleChronicleDestinationType type) {
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
   * @return ObservabilityPipelineGoogleChronicleDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineGoogleChronicleDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineGoogleChronicleDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGoogleChronicleDestination observabilityPipelineGoogleChronicleDestination = (ObservabilityPipelineGoogleChronicleDestination) o;
    return Objects.equals(this.auth, observabilityPipelineGoogleChronicleDestination.auth) && Objects.equals(this.buffer, observabilityPipelineGoogleChronicleDestination.buffer) && Objects.equals(this.customerId, observabilityPipelineGoogleChronicleDestination.customerId) && Objects.equals(this.encoding, observabilityPipelineGoogleChronicleDestination.encoding) && Objects.equals(this.endpointUrlKey, observabilityPipelineGoogleChronicleDestination.endpointUrlKey) && Objects.equals(this.id, observabilityPipelineGoogleChronicleDestination.id) && Objects.equals(this.inputs, observabilityPipelineGoogleChronicleDestination.inputs) && Objects.equals(this.logType, observabilityPipelineGoogleChronicleDestination.logType) && Objects.equals(this.type, observabilityPipelineGoogleChronicleDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineGoogleChronicleDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(auth,buffer,customerId,encoding,endpointUrlKey,id,inputs,logType,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGoogleChronicleDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
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
