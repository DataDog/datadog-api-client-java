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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for an aggregated connection. */
@JsonPropertyOrder({
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_BYTES_SENT_BY_CLIENT,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_BYTES_SENT_BY_SERVER,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_GROUP_BYS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_PACKETS_SENT_BY_CLIENT,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_PACKETS_SENT_BY_SERVER,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_RTT_MICRO_SECONDS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_TCP_CLOSED_CONNECTIONS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_TCP_ESTABLISHED_CONNECTIONS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_TCP_REFUSALS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_TCP_RESETS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_TCP_RETRANSMITS,
  SingleAggregatedConnectionResponseDataAttributes.JSON_PROPERTY_TCP_TIMEOUTS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SingleAggregatedConnectionResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BYTES_SENT_BY_CLIENT = "bytes_sent_by_client";
  private Long bytesSentByClient;

  public static final String JSON_PROPERTY_BYTES_SENT_BY_SERVER = "bytes_sent_by_server";
  private Long bytesSentByServer;

  public static final String JSON_PROPERTY_GROUP_BYS = "group_bys";
  private Map<String, List<String>> groupBys = null;

  public static final String JSON_PROPERTY_PACKETS_SENT_BY_CLIENT = "packets_sent_by_client";
  private Long packetsSentByClient;

  public static final String JSON_PROPERTY_PACKETS_SENT_BY_SERVER = "packets_sent_by_server";
  private Long packetsSentByServer;

  public static final String JSON_PROPERTY_RTT_MICRO_SECONDS = "rtt_micro_seconds";
  private Long rttMicroSeconds;

  public static final String JSON_PROPERTY_TCP_CLOSED_CONNECTIONS = "tcp_closed_connections";
  private Long tcpClosedConnections;

  public static final String JSON_PROPERTY_TCP_ESTABLISHED_CONNECTIONS =
      "tcp_established_connections";
  private Long tcpEstablishedConnections;

  public static final String JSON_PROPERTY_TCP_REFUSALS = "tcp_refusals";
  private Long tcpRefusals;

  public static final String JSON_PROPERTY_TCP_RESETS = "tcp_resets";
  private Long tcpResets;

  public static final String JSON_PROPERTY_TCP_RETRANSMITS = "tcp_retransmits";
  private Long tcpRetransmits;

  public static final String JSON_PROPERTY_TCP_TIMEOUTS = "tcp_timeouts";
  private Long tcpTimeouts;

  public SingleAggregatedConnectionResponseDataAttributes bytesSentByClient(
      Long bytesSentByClient) {
    this.bytesSentByClient = bytesSentByClient;
    return this;
  }

  /**
   * The total number of bytes sent by the client over the given period.
   *
   * @return bytesSentByClient
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTES_SENT_BY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBytesSentByClient() {
    return bytesSentByClient;
  }

  public void setBytesSentByClient(Long bytesSentByClient) {
    this.bytesSentByClient = bytesSentByClient;
  }

  public SingleAggregatedConnectionResponseDataAttributes bytesSentByServer(
      Long bytesSentByServer) {
    this.bytesSentByServer = bytesSentByServer;
    return this;
  }

  /**
   * The total number of bytes sent by the server over the given period.
   *
   * @return bytesSentByServer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYTES_SENT_BY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBytesSentByServer() {
    return bytesSentByServer;
  }

  public void setBytesSentByServer(Long bytesSentByServer) {
    this.bytesSentByServer = bytesSentByServer;
  }

  public SingleAggregatedConnectionResponseDataAttributes groupBys(
      Map<String, List<String>> groupBys) {
    this.groupBys = groupBys;
    return this;
  }

  public SingleAggregatedConnectionResponseDataAttributes putGroupBysItem(
      String key, List<String> groupBysItem) {
    if (this.groupBys == null) {
      this.groupBys = new HashMap<>();
    }
    this.groupBys.put(key, groupBysItem);
    return this;
  }

  /**
   * The key, value pairs for each group by.
   *
   * @return groupBys
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getGroupBys() {
    return groupBys;
  }

  public void setGroupBys(Map<String, List<String>> groupBys) {
    this.groupBys = groupBys;
  }

  public SingleAggregatedConnectionResponseDataAttributes packetsSentByClient(
      Long packetsSentByClient) {
    this.packetsSentByClient = packetsSentByClient;
    return this;
  }

  /**
   * The total number of packets sent by the client over the given period.
   *
   * @return packetsSentByClient
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKETS_SENT_BY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPacketsSentByClient() {
    return packetsSentByClient;
  }

  public void setPacketsSentByClient(Long packetsSentByClient) {
    this.packetsSentByClient = packetsSentByClient;
  }

  public SingleAggregatedConnectionResponseDataAttributes packetsSentByServer(
      Long packetsSentByServer) {
    this.packetsSentByServer = packetsSentByServer;
    return this;
  }

  /**
   * The total number of packets sent by the server over the given period.
   *
   * @return packetsSentByServer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKETS_SENT_BY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPacketsSentByServer() {
    return packetsSentByServer;
  }

  public void setPacketsSentByServer(Long packetsSentByServer) {
    this.packetsSentByServer = packetsSentByServer;
  }

  public SingleAggregatedConnectionResponseDataAttributes rttMicroSeconds(Long rttMicroSeconds) {
    this.rttMicroSeconds = rttMicroSeconds;
    return this;
  }

  /**
   * Measured as TCP smoothed round trip time in microseconds (the time between a TCP frame being
   * sent and acknowledged).
   *
   * @return rttMicroSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RTT_MICRO_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRttMicroSeconds() {
    return rttMicroSeconds;
  }

  public void setRttMicroSeconds(Long rttMicroSeconds) {
    this.rttMicroSeconds = rttMicroSeconds;
  }

  public SingleAggregatedConnectionResponseDataAttributes tcpClosedConnections(
      Long tcpClosedConnections) {
    this.tcpClosedConnections = tcpClosedConnections;
    return this;
  }

  /**
   * The number of TCP connections in a closed state. Measured in connections per second from the
   * client.
   *
   * @return tcpClosedConnections
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_CLOSED_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTcpClosedConnections() {
    return tcpClosedConnections;
  }

  public void setTcpClosedConnections(Long tcpClosedConnections) {
    this.tcpClosedConnections = tcpClosedConnections;
  }

  public SingleAggregatedConnectionResponseDataAttributes tcpEstablishedConnections(
      Long tcpEstablishedConnections) {
    this.tcpEstablishedConnections = tcpEstablishedConnections;
    return this;
  }

  /**
   * The number of TCP connections in an established state. Measured in connections per second from
   * the client.
   *
   * @return tcpEstablishedConnections
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_ESTABLISHED_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTcpEstablishedConnections() {
    return tcpEstablishedConnections;
  }

  public void setTcpEstablishedConnections(Long tcpEstablishedConnections) {
    this.tcpEstablishedConnections = tcpEstablishedConnections;
  }

  public SingleAggregatedConnectionResponseDataAttributes tcpRefusals(Long tcpRefusals) {
    this.tcpRefusals = tcpRefusals;
    return this;
  }

  /**
   * The number of TCP connections that were refused by the server. Typically this indicates an
   * attempt to connect to an IP/port that is not receiving connections, or a firewall/security
   * misconfiguration.
   *
   * @return tcpRefusals
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_REFUSALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTcpRefusals() {
    return tcpRefusals;
  }

  public void setTcpRefusals(Long tcpRefusals) {
    this.tcpRefusals = tcpRefusals;
  }

  public SingleAggregatedConnectionResponseDataAttributes tcpResets(Long tcpResets) {
    this.tcpResets = tcpResets;
    return this;
  }

  /**
   * The number of TCP connections that were reset by the server.
   *
   * @return tcpResets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_RESETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTcpResets() {
    return tcpResets;
  }

  public void setTcpResets(Long tcpResets) {
    this.tcpResets = tcpResets;
  }

  public SingleAggregatedConnectionResponseDataAttributes tcpRetransmits(Long tcpRetransmits) {
    this.tcpRetransmits = tcpRetransmits;
    return this;
  }

  /**
   * TCP Retransmits represent detected failures that are retransmitted to ensure delivery. Measured
   * in count of retransmits from the client.
   *
   * @return tcpRetransmits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_RETRANSMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTcpRetransmits() {
    return tcpRetransmits;
  }

  public void setTcpRetransmits(Long tcpRetransmits) {
    this.tcpRetransmits = tcpRetransmits;
  }

  public SingleAggregatedConnectionResponseDataAttributes tcpTimeouts(Long tcpTimeouts) {
    this.tcpTimeouts = tcpTimeouts;
    return this;
  }

  /**
   * The number of TCP connections that timed out from the perspective of the operating system. This
   * can indicate general connectivity and latency issues.
   *
   * @return tcpTimeouts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP_TIMEOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTcpTimeouts() {
    return tcpTimeouts;
  }

  public void setTcpTimeouts(Long tcpTimeouts) {
    this.tcpTimeouts = tcpTimeouts;
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
   * @return SingleAggregatedConnectionResponseDataAttributes
   */
  @JsonAnySetter
  public SingleAggregatedConnectionResponseDataAttributes putAdditionalProperty(
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

  /** Return true if this SingleAggregatedConnectionResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleAggregatedConnectionResponseDataAttributes
        singleAggregatedConnectionResponseDataAttributes =
            (SingleAggregatedConnectionResponseDataAttributes) o;
    return Objects.equals(
            this.bytesSentByClient,
            singleAggregatedConnectionResponseDataAttributes.bytesSentByClient)
        && Objects.equals(
            this.bytesSentByServer,
            singleAggregatedConnectionResponseDataAttributes.bytesSentByServer)
        && Objects.equals(this.groupBys, singleAggregatedConnectionResponseDataAttributes.groupBys)
        && Objects.equals(
            this.packetsSentByClient,
            singleAggregatedConnectionResponseDataAttributes.packetsSentByClient)
        && Objects.equals(
            this.packetsSentByServer,
            singleAggregatedConnectionResponseDataAttributes.packetsSentByServer)
        && Objects.equals(
            this.rttMicroSeconds, singleAggregatedConnectionResponseDataAttributes.rttMicroSeconds)
        && Objects.equals(
            this.tcpClosedConnections,
            singleAggregatedConnectionResponseDataAttributes.tcpClosedConnections)
        && Objects.equals(
            this.tcpEstablishedConnections,
            singleAggregatedConnectionResponseDataAttributes.tcpEstablishedConnections)
        && Objects.equals(
            this.tcpRefusals, singleAggregatedConnectionResponseDataAttributes.tcpRefusals)
        && Objects.equals(
            this.tcpResets, singleAggregatedConnectionResponseDataAttributes.tcpResets)
        && Objects.equals(
            this.tcpRetransmits, singleAggregatedConnectionResponseDataAttributes.tcpRetransmits)
        && Objects.equals(
            this.tcpTimeouts, singleAggregatedConnectionResponseDataAttributes.tcpTimeouts)
        && Objects.equals(
            this.additionalProperties,
            singleAggregatedConnectionResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bytesSentByClient,
        bytesSentByServer,
        groupBys,
        packetsSentByClient,
        packetsSentByServer,
        rttMicroSeconds,
        tcpClosedConnections,
        tcpEstablishedConnections,
        tcpRefusals,
        tcpResets,
        tcpRetransmits,
        tcpTimeouts,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleAggregatedConnectionResponseDataAttributes {\n");
    sb.append("    bytesSentByClient: ").append(toIndentedString(bytesSentByClient)).append("\n");
    sb.append("    bytesSentByServer: ").append(toIndentedString(bytesSentByServer)).append("\n");
    sb.append("    groupBys: ").append(toIndentedString(groupBys)).append("\n");
    sb.append("    packetsSentByClient: ")
        .append(toIndentedString(packetsSentByClient))
        .append("\n");
    sb.append("    packetsSentByServer: ")
        .append(toIndentedString(packetsSentByServer))
        .append("\n");
    sb.append("    rttMicroSeconds: ").append(toIndentedString(rttMicroSeconds)).append("\n");
    sb.append("    tcpClosedConnections: ")
        .append(toIndentedString(tcpClosedConnections))
        .append("\n");
    sb.append("    tcpEstablishedConnections: ")
        .append(toIndentedString(tcpEstablishedConnections))
        .append("\n");
    sb.append("    tcpRefusals: ").append(toIndentedString(tcpRefusals)).append("\n");
    sb.append("    tcpResets: ").append(toIndentedString(tcpResets)).append("\n");
    sb.append("    tcpRetransmits: ").append(toIndentedString(tcpRetransmits)).append("\n");
    sb.append("    tcpTimeouts: ").append(toIndentedString(tcpTimeouts)).append("\n");
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
