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

/** Aggregated network statistics from the test execution. */
@JsonPropertyOrder({
  SyntheticsTestResultNetstats.JSON_PROPERTY_HOPS,
  SyntheticsTestResultNetstats.JSON_PROPERTY_JITTER,
  SyntheticsTestResultNetstats.JSON_PROPERTY_LATENCY,
  SyntheticsTestResultNetstats.JSON_PROPERTY_PACKET_LOSS_PERCENTAGE,
  SyntheticsTestResultNetstats.JSON_PROPERTY_PACKETS_RECEIVED,
  SyntheticsTestResultNetstats.JSON_PROPERTY_PACKETS_SENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultNetstats {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HOPS = "hops";
  private SyntheticsTestResultNetstatsHops hops;

  public static final String JSON_PROPERTY_JITTER = "jitter";
  private Double jitter;

  public static final String JSON_PROPERTY_LATENCY = "latency";
  private SyntheticsTestResultNetworkLatency latency;

  public static final String JSON_PROPERTY_PACKET_LOSS_PERCENTAGE = "packet_loss_percentage";
  private Double packetLossPercentage;

  public static final String JSON_PROPERTY_PACKETS_RECEIVED = "packets_received";
  private Long packetsReceived;

  public static final String JSON_PROPERTY_PACKETS_SENT = "packets_sent";
  private Long packetsSent;

  public SyntheticsTestResultNetstats hops(SyntheticsTestResultNetstatsHops hops) {
    this.hops = hops;
    this.unparsed |= hops.unparsed;
    return this;
  }

  /**
   * Statistics about the number of hops for a network test.
   *
   * @return hops
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultNetstatsHops getHops() {
    return hops;
  }

  public void setHops(SyntheticsTestResultNetstatsHops hops) {
    this.hops = hops;
  }

  public SyntheticsTestResultNetstats jitter(Double jitter) {
    this.jitter = jitter;
    return this;
  }

  /**
   * Network jitter in milliseconds.
   *
   * @return jitter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JITTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getJitter() {
    return jitter;
  }

  public void setJitter(Double jitter) {
    this.jitter = jitter;
  }

  public SyntheticsTestResultNetstats latency(SyntheticsTestResultNetworkLatency latency) {
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

  public SyntheticsTestResultNetstats packetLossPercentage(Double packetLossPercentage) {
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

  public SyntheticsTestResultNetstats packetsReceived(Long packetsReceived) {
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

  public SyntheticsTestResultNetstats packetsSent(Long packetsSent) {
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
   * @return SyntheticsTestResultNetstats
   */
  @JsonAnySetter
  public SyntheticsTestResultNetstats putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultNetstats object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultNetstats syntheticsTestResultNetstats = (SyntheticsTestResultNetstats) o;
    return Objects.equals(this.hops, syntheticsTestResultNetstats.hops)
        && Objects.equals(this.jitter, syntheticsTestResultNetstats.jitter)
        && Objects.equals(this.latency, syntheticsTestResultNetstats.latency)
        && Objects.equals(
            this.packetLossPercentage, syntheticsTestResultNetstats.packetLossPercentage)
        && Objects.equals(this.packetsReceived, syntheticsTestResultNetstats.packetsReceived)
        && Objects.equals(this.packetsSent, syntheticsTestResultNetstats.packetsSent)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultNetstats.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hops,
        jitter,
        latency,
        packetLossPercentage,
        packetsReceived,
        packetsSent,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultNetstats {\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
    sb.append("    jitter: ").append(toIndentedString(jitter)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    packetLossPercentage: ")
        .append(toIndentedString(packetLossPercentage))
        .append("\n");
    sb.append("    packetsReceived: ").append(toIndentedString(packetsReceived)).append("\n");
    sb.append("    packetsSent: ").append(toIndentedString(packetsSent)).append("\n");
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
