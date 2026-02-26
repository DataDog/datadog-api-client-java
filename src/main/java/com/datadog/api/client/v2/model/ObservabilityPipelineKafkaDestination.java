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
   * <p>The <code>kafka</code> destination sends logs to Apache Kafka topics.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_BOOTSTRAP_SERVERS_KEY,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_HEADERS_KEY,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_KEY_FIELD,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_LIBRDKAFKA_OPTIONS,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_MESSAGE_TIMEOUT_MS,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_RATE_LIMIT_DURATION_SECS,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_RATE_LIMIT_NUM,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_SASL,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_SOCKET_TIMEOUT_MS,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_TOPIC,
  ObservabilityPipelineKafkaDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineKafkaDestination {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BOOTSTRAP_SERVERS_KEY = "bootstrap_servers_key";
  private String bootstrapServersKey;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineKafkaDestinationCompression compression;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineKafkaDestinationEncoding encoding;

  public static final String JSON_PROPERTY_HEADERS_KEY = "headers_key";
  private String headersKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_KEY_FIELD = "key_field";
  private String keyField;

  public static final String JSON_PROPERTY_LIBRDKAFKA_OPTIONS = "librdkafka_options";
  private List<ObservabilityPipelineKafkaLibrdkafkaOption> librdkafkaOptions = null;

  public static final String JSON_PROPERTY_MESSAGE_TIMEOUT_MS = "message_timeout_ms";
  private Long messageTimeoutMs;

  public static final String JSON_PROPERTY_RATE_LIMIT_DURATION_SECS = "rate_limit_duration_secs";
  private Long rateLimitDurationSecs;

  public static final String JSON_PROPERTY_RATE_LIMIT_NUM = "rate_limit_num";
  private Long rateLimitNum;

  public static final String JSON_PROPERTY_SASL = "sasl";
  private ObservabilityPipelineKafkaSasl sasl;

  public static final String JSON_PROPERTY_SOCKET_TIMEOUT_MS = "socket_timeout_ms";
  private Long socketTimeoutMs;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineKafkaDestinationType type = ObservabilityPipelineKafkaDestinationType.KAFKA;

  public ObservabilityPipelineKafkaDestination() {}

  @JsonCreator
  public ObservabilityPipelineKafkaDestination(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENCODING)ObservabilityPipelineKafkaDestinationEncoding encoding,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_INPUTS)List<String> inputs,
            @JsonProperty(required=true, value=JSON_PROPERTY_TOPIC)String topic,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineKafkaDestinationType type) {
        this.encoding = encoding;
        this.unparsed |= !encoding.isValid();
        this.id = id;
        this.inputs = inputs;
        this.topic = topic;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineKafkaDestination bootstrapServersKey(String bootstrapServersKey) {
    this.bootstrapServersKey = bootstrapServersKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the Kafka bootstrap servers list.</p>
   * @return bootstrapServersKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVERS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBootstrapServersKey() {
        return bootstrapServersKey;
      }
  public void setBootstrapServersKey(String bootstrapServersKey) {
    this.bootstrapServersKey = bootstrapServersKey;
  }
  public ObservabilityPipelineKafkaDestination compression(ObservabilityPipelineKafkaDestinationCompression compression) {
    this.compression = compression;
    this.unparsed |= !compression.isValid();
    return this;
  }

  /**
   * <p>Compression codec for Kafka messages.</p>
   * @return compression
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPRESSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineKafkaDestinationCompression getCompression() {
        return compression;
      }
  public void setCompression(ObservabilityPipelineKafkaDestinationCompression compression) {
    if (!compression.isValid()) {
        this.unparsed = true;
    }
    this.compression = compression;
  }
  public ObservabilityPipelineKafkaDestination encoding(ObservabilityPipelineKafkaDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * <p>Encoding format for log events.</p>
   * @return encoding
  **/
      @JsonProperty(JSON_PROPERTY_ENCODING)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineKafkaDestinationEncoding getEncoding() {
        return encoding;
      }
  public void setEncoding(ObservabilityPipelineKafkaDestinationEncoding encoding) {
    if (!encoding.isValid()) {
        this.unparsed = true;
    }
    this.encoding = encoding;
  }
  public ObservabilityPipelineKafkaDestination headersKey(String headersKey) {
    this.headersKey = headersKey;
    return this;
  }

  /**
   * <p>The field name to use for Kafka message headers.</p>
   * @return headersKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HEADERS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getHeadersKey() {
        return headersKey;
      }
  public void setHeadersKey(String headersKey) {
    this.headersKey = headersKey;
  }
  public ObservabilityPipelineKafkaDestination id(String id) {
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
  public ObservabilityPipelineKafkaDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }
  public ObservabilityPipelineKafkaDestination addInputsItem(String inputsItem) {
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
  public ObservabilityPipelineKafkaDestination keyField(String keyField) {
    this.keyField = keyField;
    return this;
  }

  /**
   * <p>The field name to use as the Kafka message key.</p>
   * @return keyField
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_KEY_FIELD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getKeyField() {
        return keyField;
      }
  public void setKeyField(String keyField) {
    this.keyField = keyField;
  }
  public ObservabilityPipelineKafkaDestination librdkafkaOptions(List<ObservabilityPipelineKafkaLibrdkafkaOption> librdkafkaOptions) {
    this.librdkafkaOptions = librdkafkaOptions;
    for (ObservabilityPipelineKafkaLibrdkafkaOption item : librdkafkaOptions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ObservabilityPipelineKafkaDestination addLibrdkafkaOptionsItem(ObservabilityPipelineKafkaLibrdkafkaOption librdkafkaOptionsItem) {
    if (this.librdkafkaOptions == null) {
      this.librdkafkaOptions = new ArrayList<>();
    }
    this.librdkafkaOptions.add(librdkafkaOptionsItem);
    this.unparsed |= librdkafkaOptionsItem.unparsed;
    return this;
  }

  /**
   * <p>Optional list of advanced Kafka producer configuration options, defined as key-value pairs.</p>
   * @return librdkafkaOptions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIBRDKAFKA_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ObservabilityPipelineKafkaLibrdkafkaOption> getLibrdkafkaOptions() {
        return librdkafkaOptions;
      }
  public void setLibrdkafkaOptions(List<ObservabilityPipelineKafkaLibrdkafkaOption> librdkafkaOptions) {
    this.librdkafkaOptions = librdkafkaOptions;
  }
  public ObservabilityPipelineKafkaDestination messageTimeoutMs(Long messageTimeoutMs) {
    this.messageTimeoutMs = messageTimeoutMs;
    return this;
  }

  /**
   * <p>Maximum time in milliseconds to wait for message delivery confirmation.</p>
   * minimum: 1
   * @return messageTimeoutMs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE_TIMEOUT_MS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMessageTimeoutMs() {
        return messageTimeoutMs;
      }
  public void setMessageTimeoutMs(Long messageTimeoutMs) {
    this.messageTimeoutMs = messageTimeoutMs;
  }
  public ObservabilityPipelineKafkaDestination rateLimitDurationSecs(Long rateLimitDurationSecs) {
    this.rateLimitDurationSecs = rateLimitDurationSecs;
    return this;
  }

  /**
   * <p>Duration in seconds for the rate limit window.</p>
   * minimum: 1
   * @return rateLimitDurationSecs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RATE_LIMIT_DURATION_SECS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRateLimitDurationSecs() {
        return rateLimitDurationSecs;
      }
  public void setRateLimitDurationSecs(Long rateLimitDurationSecs) {
    this.rateLimitDurationSecs = rateLimitDurationSecs;
  }
  public ObservabilityPipelineKafkaDestination rateLimitNum(Long rateLimitNum) {
    this.rateLimitNum = rateLimitNum;
    return this;
  }

  /**
   * <p>Maximum number of messages allowed per rate limit duration.</p>
   * minimum: 1
   * @return rateLimitNum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RATE_LIMIT_NUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getRateLimitNum() {
        return rateLimitNum;
      }
  public void setRateLimitNum(Long rateLimitNum) {
    this.rateLimitNum = rateLimitNum;
  }
  public ObservabilityPipelineKafkaDestination sasl(ObservabilityPipelineKafkaSasl sasl) {
    this.sasl = sasl;
    this.unparsed |= sasl.unparsed;
    return this;
  }

  /**
   * <p>Specifies the SASL mechanism for authenticating with a Kafka cluster.</p>
   * @return sasl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SASL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ObservabilityPipelineKafkaSasl getSasl() {
        return sasl;
      }
  public void setSasl(ObservabilityPipelineKafkaSasl sasl) {
    this.sasl = sasl;
  }
  public ObservabilityPipelineKafkaDestination socketTimeoutMs(Long socketTimeoutMs) {
    this.socketTimeoutMs = socketTimeoutMs;
    return this;
  }

  /**
   * <p>Socket timeout in milliseconds for network requests.</p>
   * minimum: 10
   * maximum: 300000
   * @return socketTimeoutMs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOCKET_TIMEOUT_MS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getSocketTimeoutMs() {
        return socketTimeoutMs;
      }
  public void setSocketTimeoutMs(Long socketTimeoutMs) {
    this.socketTimeoutMs = socketTimeoutMs;
  }
  public ObservabilityPipelineKafkaDestination tls(ObservabilityPipelineTls tls) {
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
  public ObservabilityPipelineKafkaDestination topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * <p>The Kafka topic name to publish logs to.</p>
   * @return topic
  **/
      @JsonProperty(JSON_PROPERTY_TOPIC)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getTopic() {
        return topic;
      }
  public void setTopic(String topic) {
    this.topic = topic;
  }
  public ObservabilityPipelineKafkaDestination type(ObservabilityPipelineKafkaDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The destination type. The value should always be <code>kafka</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineKafkaDestinationType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineKafkaDestinationType type) {
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
   * @return ObservabilityPipelineKafkaDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineKafkaDestination putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineKafkaDestination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineKafkaDestination observabilityPipelineKafkaDestination = (ObservabilityPipelineKafkaDestination) o;
    return Objects.equals(this.bootstrapServersKey, observabilityPipelineKafkaDestination.bootstrapServersKey) && Objects.equals(this.compression, observabilityPipelineKafkaDestination.compression) && Objects.equals(this.encoding, observabilityPipelineKafkaDestination.encoding) && Objects.equals(this.headersKey, observabilityPipelineKafkaDestination.headersKey) && Objects.equals(this.id, observabilityPipelineKafkaDestination.id) && Objects.equals(this.inputs, observabilityPipelineKafkaDestination.inputs) && Objects.equals(this.keyField, observabilityPipelineKafkaDestination.keyField) && Objects.equals(this.librdkafkaOptions, observabilityPipelineKafkaDestination.librdkafkaOptions) && Objects.equals(this.messageTimeoutMs, observabilityPipelineKafkaDestination.messageTimeoutMs) && Objects.equals(this.rateLimitDurationSecs, observabilityPipelineKafkaDestination.rateLimitDurationSecs) && Objects.equals(this.rateLimitNum, observabilityPipelineKafkaDestination.rateLimitNum) && Objects.equals(this.sasl, observabilityPipelineKafkaDestination.sasl) && Objects.equals(this.socketTimeoutMs, observabilityPipelineKafkaDestination.socketTimeoutMs) && Objects.equals(this.tls, observabilityPipelineKafkaDestination.tls) && Objects.equals(this.topic, observabilityPipelineKafkaDestination.topic) && Objects.equals(this.type, observabilityPipelineKafkaDestination.type) && Objects.equals(this.additionalProperties, observabilityPipelineKafkaDestination.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(bootstrapServersKey,compression,encoding,headersKey,id,inputs,keyField,librdkafkaOptions,messageTimeoutMs,rateLimitDurationSecs,rateLimitNum,sasl,socketTimeoutMs,tls,topic,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineKafkaDestination {\n");
    sb.append("    bootstrapServersKey: ").append(toIndentedString(bootstrapServersKey)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    headersKey: ").append(toIndentedString(headersKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    keyField: ").append(toIndentedString(keyField)).append("\n");
    sb.append("    librdkafkaOptions: ").append(toIndentedString(librdkafkaOptions)).append("\n");
    sb.append("    messageTimeoutMs: ").append(toIndentedString(messageTimeoutMs)).append("\n");
    sb.append("    rateLimitDurationSecs: ").append(toIndentedString(rateLimitDurationSecs)).append("\n");
    sb.append("    rateLimitNum: ").append(toIndentedString(rateLimitNum)).append("\n");
    sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
    sb.append("    socketTimeoutMs: ").append(toIndentedString(socketTimeoutMs)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
