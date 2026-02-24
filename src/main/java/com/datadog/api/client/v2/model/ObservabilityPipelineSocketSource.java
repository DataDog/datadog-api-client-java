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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>socket</code> source ingests logs over TCP or UDP.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineSocketSource.JSON_PROPERTY_ADDRESS_KEY,
  ObservabilityPipelineSocketSource.JSON_PROPERTY_FRAMING,
  ObservabilityPipelineSocketSource.JSON_PROPERTY_ID,
  ObservabilityPipelineSocketSource.JSON_PROPERTY_MODE,
  ObservabilityPipelineSocketSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineSocketSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSocketSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDRESS_KEY = "address_key";
  private String addressKey;

  public static final String JSON_PROPERTY_FRAMING = "framing";
  private ObservabilityPipelineSocketSourceFraming framing;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineSocketSourceMode mode;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSocketSourceType type = ObservabilityPipelineSocketSourceType.SOCKET;

  public ObservabilityPipelineSocketSource() {}

  @JsonCreator
  public ObservabilityPipelineSocketSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_FRAMING)
          ObservabilityPipelineSocketSourceFraming framing,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          ObservabilityPipelineSocketSourceMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineSocketSourceType type) {
    this.framing = framing;
    this.unparsed |= framing.unparsed;
    this.id = id;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineSocketSource addressKey(String addressKey) {
    this.addressKey = addressKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the listen address for the socket.
   *
   * @return addressKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAddressKey() {
    return addressKey;
  }

  public void setAddressKey(String addressKey) {
    this.addressKey = addressKey;
  }

  public ObservabilityPipelineSocketSource framing(
      ObservabilityPipelineSocketSourceFraming framing) {
    this.framing = framing;
    this.unparsed |= framing.unparsed;
    return this;
  }

  /**
   * Framing method configuration for the socket source.
   *
   * @return framing
   */
  @JsonProperty(JSON_PROPERTY_FRAMING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketSourceFraming getFraming() {
    return framing;
  }

  public void setFraming(ObservabilityPipelineSocketSourceFraming framing) {
    this.framing = framing;
  }

  public ObservabilityPipelineSocketSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used in other parts of the pipeline to reference this
   * component (for example, as the <code>input</code> to downstream components).
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

  public ObservabilityPipelineSocketSource mode(ObservabilityPipelineSocketSourceMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Protocol used to receive logs.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketSourceMode getMode() {
    return mode;
  }

  public void setMode(ObservabilityPipelineSocketSourceMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public ObservabilityPipelineSocketSource tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineSocketSource type(ObservabilityPipelineSocketSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>socket</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineSocketSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineSocketSourceType type) {
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
   * @return ObservabilityPipelineSocketSource
   */
  @JsonAnySetter
  public ObservabilityPipelineSocketSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineSocketSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSocketSource observabilityPipelineSocketSource =
        (ObservabilityPipelineSocketSource) o;
    return Objects.equals(this.addressKey, observabilityPipelineSocketSource.addressKey)
        && Objects.equals(this.framing, observabilityPipelineSocketSource.framing)
        && Objects.equals(this.id, observabilityPipelineSocketSource.id)
        && Objects.equals(this.mode, observabilityPipelineSocketSource.mode)
        && Objects.equals(this.tls, observabilityPipelineSocketSource.tls)
        && Objects.equals(this.type, observabilityPipelineSocketSource.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineSocketSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressKey, framing, id, mode, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSocketSource {\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
    sb.append("    framing: ").append(toIndentedString(framing)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
