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
   * <p>The <code>syslog_ng</code> source listens for logs over TCP or UDP from a <code>syslog-ng</code> server using the syslog protocol.</p>
   * <p><strong>Supported pipeline types:</strong> logs</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineSyslogNgSource.JSON_PROPERTY_ADDRESS_KEY,
  ObservabilityPipelineSyslogNgSource.JSON_PROPERTY_ID,
  ObservabilityPipelineSyslogNgSource.JSON_PROPERTY_MODE,
  ObservabilityPipelineSyslogNgSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineSyslogNgSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineSyslogNgSource {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDRESS_KEY = "address_key";
  private String addressKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MODE = "mode";
  private ObservabilityPipelineSyslogSourceMode mode;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineSyslogNgSourceType type = ObservabilityPipelineSyslogNgSourceType.SYSLOG_NG;

  public ObservabilityPipelineSyslogNgSource() {}

  @JsonCreator
  public ObservabilityPipelineSyslogNgSource(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODE)ObservabilityPipelineSyslogSourceMode mode,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)ObservabilityPipelineSyslogNgSourceType type) {
        this.id = id;
        this.mode = mode;
        this.unparsed |= !mode.isValid();
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public ObservabilityPipelineSyslogNgSource addressKey(String addressKey) {
    this.addressKey = addressKey;
    return this;
  }

  /**
   * <p>Name of the environment variable or secret that holds the listen address for the syslog-ng receiver.</p>
   * @return addressKey
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ADDRESS_KEY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAddressKey() {
        return addressKey;
      }
  public void setAddressKey(String addressKey) {
    this.addressKey = addressKey;
  }
  public ObservabilityPipelineSyslogNgSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The unique identifier for this component. Used in other parts of the pipeline to reference this component (for example, as the <code>input</code> to downstream components).</p>
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
  public ObservabilityPipelineSyslogNgSource mode(ObservabilityPipelineSyslogSourceMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * <p>Protocol used by the syslog source to receive messages.</p>
   * @return mode
  **/
      @JsonProperty(JSON_PROPERTY_MODE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSyslogSourceMode getMode() {
        return mode;
      }
  public void setMode(ObservabilityPipelineSyslogSourceMode mode) {
    if (!mode.isValid()) {
        this.unparsed = true;
    }
    this.mode = mode;
  }
  public ObservabilityPipelineSyslogNgSource tls(ObservabilityPipelineTls tls) {
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
  public ObservabilityPipelineSyslogNgSource type(ObservabilityPipelineSyslogNgSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The source type. The value should always be <code>syslog_ng</code>.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineSyslogNgSourceType getType() {
        return type;
      }
  public void setType(ObservabilityPipelineSyslogNgSourceType type) {
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
   * @return ObservabilityPipelineSyslogNgSource
   */
  @JsonAnySetter
  public ObservabilityPipelineSyslogNgSource putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineSyslogNgSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineSyslogNgSource observabilityPipelineSyslogNgSource = (ObservabilityPipelineSyslogNgSource) o;
    return Objects.equals(this.addressKey, observabilityPipelineSyslogNgSource.addressKey) && Objects.equals(this.id, observabilityPipelineSyslogNgSource.id) && Objects.equals(this.mode, observabilityPipelineSyslogNgSource.mode) && Objects.equals(this.tls, observabilityPipelineSyslogNgSource.tls) && Objects.equals(this.type, observabilityPipelineSyslogNgSource.type) && Objects.equals(this.additionalProperties, observabilityPipelineSyslogNgSource.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(addressKey,id,mode,tls,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineSyslogNgSource {\n");
    sb.append("    addressKey: ").append(toIndentedString(addressKey)).append("\n");
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
