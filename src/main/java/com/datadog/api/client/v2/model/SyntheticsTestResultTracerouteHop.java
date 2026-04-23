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

/** A network probe result, used for traceroute hops and ping summaries. */
@JsonPropertyOrder({
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_HOST,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_LATENCY,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_PACKET_LOSS_PERCENTAGE,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_PACKET_SIZE,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_PACKETS_RECEIVED,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_PACKETS_SENT,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_RESOLVED_IP,
  SyntheticsTestResultTracerouteHop.JSON_PROPERTY_ROUTERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultTracerouteHop {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_LATENCY = "latency";
  private SyntheticsTestResultNetworkLatency latency;

  public static final String JSON_PROPERTY_PACKET_LOSS_PERCENTAGE = "packet_loss_percentage";
  private Double packetLossPercentage;

  public static final String JSON_PROPERTY_PACKET_SIZE = "packet_size";
  private Long packetSize;

  public static final String JSON_PROPERTY_PACKETS_RECEIVED = "packets_received";
  private Long packetsReceived;

  public static final String JSON_PROPERTY_PACKETS_SENT = "packets_sent";
  private Long packetsSent;

  public static final String JSON_PROPERTY_RESOLVED_IP = "resolved_ip";
  private String resolvedIp;

  public static final String JSON_PROPERTY_ROUTERS = "routers";
  private List<SyntheticsTestResultRouter> routers = null;

  public SyntheticsTestResultTracerouteHop host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Target hostname.
   *
   * @return host
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SyntheticsTestResultTracerouteHop latency(SyntheticsTestResultNetworkLatency latency) {
    this.latency = latency;
    this.unparsed |= latency.unparsed;
    return this;
  }

  /**
   * Latency statistics for a network probe.
   *
   * @return latency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LATENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultNetworkLatency getLatency() {
    return latency;
  }

  public void setLatency(SyntheticsTestResultNetworkLatency latency) {
    this.latency = latency;
  }

  public SyntheticsTestResultTracerouteHop packetLossPercentage(Double packetLossPercentage) {
    this.packetLossPercentage = packetLossPercentage;
    return this;
  }

  /**
   * Percentage of probe packets lost.
   *
   * @return packetLossPercentage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKET_LOSS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getPacketLossPercentage() {
    return packetLossPercentage;
  }

  public void setPacketLossPercentage(Double packetLossPercentage) {
    this.packetLossPercentage = packetLossPercentage;
  }

  public SyntheticsTestResultTracerouteHop packetSize(Long packetSize) {
    this.packetSize = packetSize;
    return this;
  }

  /**
   * Size of each probe packet in bytes.
   *
   * @return packetSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKET_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPacketSize() {
    return packetSize;
  }

  public void setPacketSize(Long packetSize) {
    this.packetSize = packetSize;
  }

  public SyntheticsTestResultTracerouteHop packetsReceived(Long packetsReceived) {
    this.packetsReceived = packetsReceived;
    return this;
  }

  /**
   * Number of probe packets received.
   *
   * @return packetsReceived
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKETS_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPacketsReceived() {
    return packetsReceived;
  }

  public void setPacketsReceived(Long packetsReceived) {
    this.packetsReceived = packetsReceived;
  }

  public SyntheticsTestResultTracerouteHop packetsSent(Long packetsSent) {
    this.packetsSent = packetsSent;
    return this;
  }

  /**
   * Number of probe packets sent.
   *
   * @return packetsSent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKETS_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPacketsSent() {
    return packetsSent;
  }

  public void setPacketsSent(Long packetsSent) {
    this.packetsSent = packetsSent;
  }

  public SyntheticsTestResultTracerouteHop resolvedIp(String resolvedIp) {
    this.resolvedIp = resolvedIp;
    return this;
  }

  /**
   * Resolved IP address for the target.
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

  public SyntheticsTestResultTracerouteHop routers(List<SyntheticsTestResultRouter> routers) {
    this.routers = routers;
    for (SyntheticsTestResultRouter item : routers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultTracerouteHop addRoutersItem(SyntheticsTestResultRouter routersItem) {
    if (this.routers == null) {
      this.routers = new ArrayList<>();
    }
    this.routers.add(routersItem);
    this.unparsed |= routersItem.unparsed;
    return this;
  }

  /**
   * List of intermediate routers for the traceroute.
   *
   * @return routers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultRouter> getRouters() {
    return routers;
  }

  public void setRouters(List<SyntheticsTestResultRouter> routers) {
    this.routers = routers;
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
   * @return SyntheticsTestResultTracerouteHop
   */
  @JsonAnySetter
  public SyntheticsTestResultTracerouteHop putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultTracerouteHop object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultTracerouteHop syntheticsTestResultTracerouteHop =
        (SyntheticsTestResultTracerouteHop) o;
    return Objects.equals(this.host, syntheticsTestResultTracerouteHop.host)
        && Objects.equals(this.latency, syntheticsTestResultTracerouteHop.latency)
        && Objects.equals(
            this.packetLossPercentage, syntheticsTestResultTracerouteHop.packetLossPercentage)
        && Objects.equals(this.packetSize, syntheticsTestResultTracerouteHop.packetSize)
        && Objects.equals(this.packetsReceived, syntheticsTestResultTracerouteHop.packetsReceived)
        && Objects.equals(this.packetsSent, syntheticsTestResultTracerouteHop.packetsSent)
        && Objects.equals(this.resolvedIp, syntheticsTestResultTracerouteHop.resolvedIp)
        && Objects.equals(this.routers, syntheticsTestResultTracerouteHop.routers)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultTracerouteHop.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        host,
        latency,
        packetLossPercentage,
        packetSize,
        packetsReceived,
        packetsSent,
        resolvedIp,
        routers,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultTracerouteHop {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    packetLossPercentage: ")
        .append(toIndentedString(packetLossPercentage))
        .append("\n");
    sb.append("    packetSize: ").append(toIndentedString(packetSize)).append("\n");
    sb.append("    packetsReceived: ").append(toIndentedString(packetsReceived)).append("\n");
    sb.append("    packetsSent: ").append(toIndentedString(packetsSent)).append("\n");
    sb.append("    resolvedIp: ").append(toIndentedString(resolvedIp)).append("\n");
    sb.append("    routers: ").append(toIndentedString(routers)).append("\n");
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
