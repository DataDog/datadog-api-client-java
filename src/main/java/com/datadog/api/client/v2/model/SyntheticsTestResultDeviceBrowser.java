/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Browser information for the device used to run the test. */
@JsonPropertyOrder({
  SyntheticsTestResultDeviceBrowser.JSON_PROPERTY_TYPE,
  SyntheticsTestResultDeviceBrowser.JSON_PROPERTY_USER_AGENT,
  SyntheticsTestResultDeviceBrowser.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultDeviceBrowser {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER_AGENT = "user_agent";
  private String userAgent;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public SyntheticsTestResultDeviceBrowser type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Browser type (for example, <code>chrome</code>, <code>firefox</code>).
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SyntheticsTestResultDeviceBrowser userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * User agent string reported by the browser.
   *
   * @return userAgent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public SyntheticsTestResultDeviceBrowser version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Browser version.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
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
   * @return SyntheticsTestResultDeviceBrowser
   */
  @JsonAnySetter
  public SyntheticsTestResultDeviceBrowser putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultDeviceBrowser object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultDeviceBrowser syntheticsTestResultDeviceBrowser =
        (SyntheticsTestResultDeviceBrowser) o;
    return Objects.equals(this.type, syntheticsTestResultDeviceBrowser.type)
        && Objects.equals(this.userAgent, syntheticsTestResultDeviceBrowser.userAgent)
        && Objects.equals(this.version, syntheticsTestResultDeviceBrowser.version)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultDeviceBrowser.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userAgent, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultDeviceBrowser {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
