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
 * The <code>rsyslog</code> destination forwards logs to an external <code>rsyslog</code> server
 * over TCP or UDP using the syslog protocol.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineRsyslogDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineRsyslogDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineRsyslogDestination.JSON_PROPERTY_KEEPALIVE,
  ObservabilityPipelineRsyslogDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineRsyslogDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineRsyslogDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_KEEPALIVE = "keepalive";
  private Long keepalive;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineRsyslogDestinationType type =
      ObservabilityPipelineRsyslogDestinationType.RSYSLOG;

  public ObservabilityPipelineRsyslogDestination() {}

  @JsonCreator
  public ObservabilityPipelineRsyslogDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineRsyslogDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineRsyslogDestination id(String id) {
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

  public ObservabilityPipelineRsyslogDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineRsyslogDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineRsyslogDestination keepalive(Long keepalive) {
    this.keepalive = keepalive;
    return this;
  }

  /**
   * Optional socket keepalive duration in milliseconds. minimum: 0
   *
   * @return keepalive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEPALIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getKeepalive() {
    return keepalive;
  }

  public void setKeepalive(Long keepalive) {
    this.keepalive = keepalive;
  }

  public ObservabilityPipelineRsyslogDestination tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineRsyslogDestination type(
      ObservabilityPipelineRsyslogDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>rsyslog</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineRsyslogDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineRsyslogDestinationType type) {
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
   * @return ObservabilityPipelineRsyslogDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineRsyslogDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineRsyslogDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineRsyslogDestination observabilityPipelineRsyslogDestination =
        (ObservabilityPipelineRsyslogDestination) o;
    return Objects.equals(this.id, observabilityPipelineRsyslogDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineRsyslogDestination.inputs)
        && Objects.equals(this.keepalive, observabilityPipelineRsyslogDestination.keepalive)
        && Objects.equals(this.tls, observabilityPipelineRsyslogDestination.tls)
        && Objects.equals(this.type, observabilityPipelineRsyslogDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineRsyslogDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inputs, keepalive, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineRsyslogDestination {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
