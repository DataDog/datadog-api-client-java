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

/** A single hop along a network path. */
@JsonPropertyOrder({
  SyntheticsTestResultNetpathHop.JSON_PROPERTY_HOSTNAME,
  SyntheticsTestResultNetpathHop.JSON_PROPERTY_IP_ADDRESS,
  SyntheticsTestResultNetpathHop.JSON_PROPERTY_REACHABLE,
  SyntheticsTestResultNetpathHop.JSON_PROPERTY_RTT,
  SyntheticsTestResultNetpathHop.JSON_PROPERTY_TTL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultNetpathHop {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOSTNAME = "hostname";
  private String hostname;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public static final String JSON_PROPERTY_REACHABLE = "reachable";
  private Boolean reachable;

  public static final String JSON_PROPERTY_RTT = "rtt";
  private Double rtt;

  public static final String JSON_PROPERTY_TTL = "ttl";
  private Long ttl;

  public SyntheticsTestResultNetpathHop hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Resolved hostname of the hop.
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

  public SyntheticsTestResultNetpathHop ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IP address of the hop.
   *
   * @return ipAddress
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public SyntheticsTestResultNetpathHop reachable(Boolean reachable) {
    this.reachable = reachable;
    return this;
  }

  /**
   * Whether this hop was reachable.
   *
   * @return reachable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReachable() {
    return reachable;
  }

  public void setReachable(Boolean reachable) {
    this.reachable = reachable;
  }

  public SyntheticsTestResultNetpathHop rtt(Double rtt) {
    this.rtt = rtt;
    return this;
  }

  /**
   * Round-trip time to this hop in milliseconds.
   *
   * @return rtt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRtt() {
    return rtt;
  }

  public void setRtt(Double rtt) {
    this.rtt = rtt;
  }

  public SyntheticsTestResultNetpathHop ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Time-to-live value of the probe packet at this hop.
   *
   * @return ttl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
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
   * @return SyntheticsTestResultNetpathHop
   */
  @JsonAnySetter
  public SyntheticsTestResultNetpathHop putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultNetpathHop object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultNetpathHop syntheticsTestResultNetpathHop =
        (SyntheticsTestResultNetpathHop) o;
    return Objects.equals(this.hostname, syntheticsTestResultNetpathHop.hostname)
        && Objects.equals(this.ipAddress, syntheticsTestResultNetpathHop.ipAddress)
        && Objects.equals(this.reachable, syntheticsTestResultNetpathHop.reachable)
        && Objects.equals(this.rtt, syntheticsTestResultNetpathHop.rtt)
        && Objects.equals(this.ttl, syntheticsTestResultNetpathHop.ttl)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultNetpathHop.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ipAddress, reachable, rtt, ttl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultNetpathHop {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    reachable: ").append(toIndentedString(reachable)).append("\n");
    sb.append("    rtt: ").append(toIndentedString(rtt)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
