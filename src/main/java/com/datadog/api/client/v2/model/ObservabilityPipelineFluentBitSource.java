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
 * The <code>fluent_bit</code> source ingests logs from Fluent Bit.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineFluentBitSource.JSON_PROPERTY_ADDRESS_KEY,
  ObservabilityPipelineFluentBitSource.JSON_PROPERTY_ID,
  ObservabilityPipelineFluentBitSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineFluentBitSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineFluentBitSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDRESS_KEY = "address_key";
  private String addressKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineFluentBitSourceType type =
      ObservabilityPipelineFluentBitSourceType.FLUENT_BIT;

  public ObservabilityPipelineFluentBitSource() {}

  @JsonCreator
  public ObservabilityPipelineFluentBitSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineFluentBitSourceType type) {
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineFluentBitSource addressKey(String addressKey) {
    this.addressKey = addressKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the listen address for the Fluent Bit
   * receiver.
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

  public ObservabilityPipelineFluentBitSource id(String id) {
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

  public ObservabilityPipelineFluentBitSource tls(ObservabilityPipelineTls tls) {
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

  public ObservabilityPipelineFluentBitSource type(ObservabilityPipelineFluentBitSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>fluent_bit</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineFluentBitSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineFluentBitSourceType type) {
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
   * @return ObservabilityPipelineFluentBitSource
   */
  @JsonAnySetter
  public ObservabilityPipelineFluentBitSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineFluentBitSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineFluentBitSource observabilityPipelineFluentBitSource =
        (ObservabilityPipelineFluentBitSource) o;
    return Objects.equals(this.addressKey, observabilityPipelineFluentBitSource.addressKey)
        && Objects.equals(this.id, observabilityPipelineFluentBitSource.id)
        && Objects.equals(this.tls, observabilityPipelineFluentBitSource.tls)
        && Objects.equals(this.type, observabilityPipelineFluentBitSource.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineFluentBitSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressKey, id, tls, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineFluentBitSource {\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
