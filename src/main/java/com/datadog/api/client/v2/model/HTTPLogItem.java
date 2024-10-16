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

/** Logs that are sent over HTTP. */
@JsonPropertyOrder({
  HTTPLogItem.JSON_PROPERTY_DDSOURCE,
  HTTPLogItem.JSON_PROPERTY_DDTAGS,
  HTTPLogItem.JSON_PROPERTY_HOSTNAME,
  HTTPLogItem.JSON_PROPERTY_MESSAGE,
  HTTPLogItem.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HTTPLogItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DDSOURCE = "ddsource";
  private String ddsource;

  public static final String JSON_PROPERTY_DDTAGS = "ddtags";
  private String ddtags;

  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public HTTPLogItem() {}

  @JsonCreator
  public HTTPLogItem(@JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message) {
    this.message = message;
  }

  public HTTPLogItem ddsource(String ddsource) {
    this.ddsource = ddsource;
    return this;
  }

  /**
   * The integration name associated with your log: the technology from which the log originated.
   * When it matches an integration name, Datadog automatically installs the corresponding parsers
   * and facets. See <a
   * href="https://docs.datadoghq.com/logs/log_configuration/attributes_naming_convention/#reserved-attributes">reserved
   * attributes</a>.
   *
   * @return ddsource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DDSOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdsource() {
    return ddsource;
  }

  public void setDdsource(String ddsource) {
    this.ddsource = ddsource;
  }

  public HTTPLogItem ddtags(String ddtags) {
    this.ddtags = ddtags;
    return this;
  }

  /**
   * Tags associated with your logs.
   *
   * @return ddtags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DDTAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDdtags() {
    return ddtags;
  }

  public void setDdtags(String ddtags) {
    this.ddtags = ddtags;
  }

  public HTTPLogItem hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The name of the originating host of the log.
   *
   * @return hostname
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public HTTPLogItem message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message <a
   * href="https://docs.datadoghq.com/logs/log_configuration/attributes_naming_convention/#reserved-attributes">reserved
   * attribute</a> of your log. By default, Datadog ingests the value of the message attribute as
   * the body of the log entry. That value is then highlighted and displayed in the Logstream, where
   * it is indexed for full text search.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HTTPLogItem service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The name of the application or service generating the log events. It is used to switch from
   * Logs to APM, so make sure you define the same value when you use both products. See <a
   * href="https://docs.datadoghq.com/logs/log_configuration/attributes_naming_convention/#reserved-attributes">reserved
   * attributes</a>.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
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
   * @return HTTPLogItem
   */
  @JsonAnySetter
  public HTTPLogItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HTTPLogItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPLogItem httpLogItem = (HTTPLogItem) o;
    return Objects.equals(this.ddsource, httpLogItem.ddsource)
        && Objects.equals(this.ddtags, httpLogItem.ddtags)
        && Objects.equals(this.hostname, httpLogItem.hostname)
        && Objects.equals(this.message, httpLogItem.message)
        && Objects.equals(this.service, httpLogItem.service)
        && Objects.equals(this.additionalProperties, httpLogItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddsource, ddtags, hostname, message, service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPLogItem {\n");
    sb.append("    ddsource: ").append(toIndentedString(ddsource)).append("\n");
    sb.append("    ddtags: ").append(toIndentedString(ddtags)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
