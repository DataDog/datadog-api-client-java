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
 * The <code>google_pubsub</code> destination publishes logs to a Google Cloud Pub/Sub topic.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_ENCODING,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_PROJECT,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_TOPIC,
  ObservabilityPipelineGooglePubSubDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineGooglePubSubDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineGcpAuth auth;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private ObservabilityPipelineGooglePubSubDestinationEncoding encoding;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_PROJECT = "project";
  private String project;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineGooglePubSubDestinationType type =
      ObservabilityPipelineGooglePubSubDestinationType.GOOGLE_PUBSUB;

  public ObservabilityPipelineGooglePubSubDestination() {}

  @JsonCreator
  public ObservabilityPipelineGooglePubSubDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENCODING)
          ObservabilityPipelineGooglePubSubDestinationEncoding encoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROJECT) String project,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOPIC) String topic,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineGooglePubSubDestinationType type) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    this.id = id;
    this.inputs = inputs;
    this.project = project;
    this.topic = topic;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineGooglePubSubDestination auth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * Google Cloud credentials used to authenticate with Google Cloud Storage.
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineGcpAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineGcpAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineGooglePubSubDestination buffer(
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

  public ObservabilityPipelineGooglePubSubDestination encoding(
      ObservabilityPipelineGooglePubSubDestinationEncoding encoding) {
    this.encoding = encoding;
    this.unparsed |= !encoding.isValid();
    return this;
  }

  /**
   * Encoding format for log events.
   *
   * @return encoding
   */
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGooglePubSubDestinationEncoding getEncoding() {
    return encoding;
  }

  public void setEncoding(ObservabilityPipelineGooglePubSubDestinationEncoding encoding) {
    if (!encoding.isValid()) {
      this.unparsed = true;
    }
    this.encoding = encoding;
  }

  public ObservabilityPipelineGooglePubSubDestination endpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Google Cloud Pub/Sub endpoint URL.
   *
   * @return endpointUrlKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_URL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpointUrlKey() {
    return endpointUrlKey;
  }

  public void setEndpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
  }

  public ObservabilityPipelineGooglePubSubDestination id(String id) {
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

  public ObservabilityPipelineGooglePubSubDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineGooglePubSubDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineGooglePubSubDestination project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The Google Cloud project ID that owns the Pub/Sub topic.
   *
   * @return project
   */
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public ObservabilityPipelineGooglePubSubDestination tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external services.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }

  public ObservabilityPipelineGooglePubSubDestination topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * The Pub/Sub topic name to publish logs to.
   *
   * @return topic
   */
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public ObservabilityPipelineGooglePubSubDestination type(
      ObservabilityPipelineGooglePubSubDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>google_pubsub</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineGooglePubSubDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineGooglePubSubDestinationType type) {
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
   * @return ObservabilityPipelineGooglePubSubDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineGooglePubSubDestination putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineGooglePubSubDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineGooglePubSubDestination observabilityPipelineGooglePubSubDestination =
        (ObservabilityPipelineGooglePubSubDestination) o;
    return Objects.equals(this.auth, observabilityPipelineGooglePubSubDestination.auth)
        && Objects.equals(this.buffer, observabilityPipelineGooglePubSubDestination.buffer)
        && Objects.equals(this.encoding, observabilityPipelineGooglePubSubDestination.encoding)
        && Objects.equals(
            this.endpointUrlKey, observabilityPipelineGooglePubSubDestination.endpointUrlKey)
        && Objects.equals(this.id, observabilityPipelineGooglePubSubDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineGooglePubSubDestination.inputs)
        && Objects.equals(this.project, observabilityPipelineGooglePubSubDestination.project)
        && Objects.equals(this.tls, observabilityPipelineGooglePubSubDestination.tls)
        && Objects.equals(this.topic, observabilityPipelineGooglePubSubDestination.topic)
        && Objects.equals(this.type, observabilityPipelineGooglePubSubDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineGooglePubSubDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth,
        buffer,
        encoding,
        endpointUrlKey,
        id,
        inputs,
        project,
        tls,
        topic,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineGooglePubSubDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
