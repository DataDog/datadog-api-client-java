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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** DNS resolution details recorded during the test execution. */
@JsonPropertyOrder({
  SyntheticsTestResultDnsResolution.JSON_PROPERTY_ATTEMPTS,
  SyntheticsTestResultDnsResolution.JSON_PROPERTY_RESOLVED_IP,
  SyntheticsTestResultDnsResolution.JSON_PROPERTY_RESOLVED_PORT,
  SyntheticsTestResultDnsResolution.JSON_PROPERTY_SERVER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultDnsResolution {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTEMPTS = "attempts";
  private List<Map<String, String>> attempts = null;

  public static final String JSON_PROPERTY_RESOLVED_IP = "resolved_ip";
  private String resolvedIp;

  public static final String JSON_PROPERTY_RESOLVED_PORT = "resolved_port";
  private String resolvedPort;

  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public SyntheticsTestResultDnsResolution attempts(List<Map<String, String>> attempts) {
    this.attempts = attempts;
    return this;
  }

  public SyntheticsTestResultDnsResolution addAttemptsItem(Map<String, String> attemptsItem) {
    if (this.attempts == null) {
      this.attempts = new ArrayList<>();
    }
    this.attempts.add(attemptsItem);
    return this;
  }

  /**
   * DNS resolution attempts made during the test.
   *
   * @return attempts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, String>> getAttempts() {
    return attempts;
  }

  public void setAttempts(List<Map<String, String>> attempts) {
    this.attempts = attempts;
  }

  public SyntheticsTestResultDnsResolution resolvedIp(String resolvedIp) {
    this.resolvedIp = resolvedIp;
    return this;
  }

  /**
   * Resolved IP address for the target host.
   *
   * @return resolvedIp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResolvedIp() {
    return resolvedIp;
  }

  public void setResolvedIp(String resolvedIp) {
    this.resolvedIp = resolvedIp;
  }

  public SyntheticsTestResultDnsResolution resolvedPort(String resolvedPort) {
    this.resolvedPort = resolvedPort;
    return this;
  }

  /**
   * Resolved port for the target service.
   *
   * @return resolvedPort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResolvedPort() {
    return resolvedPort;
  }

  public void setResolvedPort(String resolvedPort) {
    this.resolvedPort = resolvedPort;
  }

  public SyntheticsTestResultDnsResolution server(String server) {
    this.server = server;
    return this;
  }

  /**
   * DNS server used for the resolution.
   *
   * @return server
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
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
   * @return SyntheticsTestResultDnsResolution
   */
  @JsonAnySetter
  public SyntheticsTestResultDnsResolution putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultDnsResolution object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultDnsResolution syntheticsTestResultDnsResolution =
        (SyntheticsTestResultDnsResolution) o;
    return Objects.equals(this.attempts, syntheticsTestResultDnsResolution.attempts)
        && Objects.equals(this.resolvedIp, syntheticsTestResultDnsResolution.resolvedIp)
        && Objects.equals(this.resolvedPort, syntheticsTestResultDnsResolution.resolvedPort)
        && Objects.equals(this.server, syntheticsTestResultDnsResolution.server)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultDnsResolution.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, resolvedIp, resolvedPort, server, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultDnsResolution {\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    resolvedIp: ").append(toIndentedString(resolvedIp)).append("\n");
    sb.append("    resolvedPort: ").append(toIndentedString(resolvedPort)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
