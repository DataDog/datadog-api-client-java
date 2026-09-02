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

/** Average timing breakdown per network phase for a resource. */
@JsonPropertyOrder({
  AggregatedResourceTimingBreakdown.JSON_PROPERTY_AVG_CONNECT_MS,
  AggregatedResourceTimingBreakdown.JSON_PROPERTY_AVG_DNS_MS,
  AggregatedResourceTimingBreakdown.JSON_PROPERTY_AVG_DOWNLOAD_MS,
  AggregatedResourceTimingBreakdown.JSON_PROPERTY_AVG_FIRST_BYTE_MS,
  AggregatedResourceTimingBreakdown.JSON_PROPERTY_AVG_REDIRECT_MS,
  AggregatedResourceTimingBreakdown.JSON_PROPERTY_AVG_SSL_MS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregatedResourceTimingBreakdown {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AVG_CONNECT_MS = "avg_connect_ms";
  private Double avgConnectMs;

  public static final String JSON_PROPERTY_AVG_DNS_MS = "avg_dns_ms";
  private Double avgDnsMs;

  public static final String JSON_PROPERTY_AVG_DOWNLOAD_MS = "avg_download_ms";
  private Double avgDownloadMs;

  public static final String JSON_PROPERTY_AVG_FIRST_BYTE_MS = "avg_first_byte_ms";
  private Double avgFirstByteMs;

  public static final String JSON_PROPERTY_AVG_REDIRECT_MS = "avg_redirect_ms";
  private Double avgRedirectMs;

  public static final String JSON_PROPERTY_AVG_SSL_MS = "avg_ssl_ms";
  private Double avgSslMs;

  public AggregatedResourceTimingBreakdown() {}

  @JsonCreator
  public AggregatedResourceTimingBreakdown(
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_CONNECT_MS) Double avgConnectMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DNS_MS) Double avgDnsMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_DOWNLOAD_MS) Double avgDownloadMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_FIRST_BYTE_MS) Double avgFirstByteMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_REDIRECT_MS) Double avgRedirectMs,
      @JsonProperty(required = true, value = JSON_PROPERTY_AVG_SSL_MS) Double avgSslMs) {
    this.avgConnectMs = avgConnectMs;
    this.avgDnsMs = avgDnsMs;
    this.avgDownloadMs = avgDownloadMs;
    this.avgFirstByteMs = avgFirstByteMs;
    this.avgRedirectMs = avgRedirectMs;
    this.avgSslMs = avgSslMs;
  }

  public AggregatedResourceTimingBreakdown avgConnectMs(Double avgConnectMs) {
    this.avgConnectMs = avgConnectMs;
    return this;
  }

  /**
   * Average TCP connect duration in milliseconds.
   *
   * @return avgConnectMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_CONNECT_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgConnectMs() {
    return avgConnectMs;
  }

  public void setAvgConnectMs(Double avgConnectMs) {
    this.avgConnectMs = avgConnectMs;
  }

  public AggregatedResourceTimingBreakdown avgDnsMs(Double avgDnsMs) {
    this.avgDnsMs = avgDnsMs;
    return this;
  }

  /**
   * Average DNS resolution duration in milliseconds.
   *
   * @return avgDnsMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_DNS_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgDnsMs() {
    return avgDnsMs;
  }

  public void setAvgDnsMs(Double avgDnsMs) {
    this.avgDnsMs = avgDnsMs;
  }

  public AggregatedResourceTimingBreakdown avgDownloadMs(Double avgDownloadMs) {
    this.avgDownloadMs = avgDownloadMs;
    return this;
  }

  /**
   * Average download phase duration in milliseconds.
   *
   * @return avgDownloadMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_DOWNLOAD_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgDownloadMs() {
    return avgDownloadMs;
  }

  public void setAvgDownloadMs(Double avgDownloadMs) {
    this.avgDownloadMs = avgDownloadMs;
  }

  public AggregatedResourceTimingBreakdown avgFirstByteMs(Double avgFirstByteMs) {
    this.avgFirstByteMs = avgFirstByteMs;
    return this;
  }

  /**
   * Average time to first byte in milliseconds.
   *
   * @return avgFirstByteMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_FIRST_BYTE_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgFirstByteMs() {
    return avgFirstByteMs;
  }

  public void setAvgFirstByteMs(Double avgFirstByteMs) {
    this.avgFirstByteMs = avgFirstByteMs;
  }

  public AggregatedResourceTimingBreakdown avgRedirectMs(Double avgRedirectMs) {
    this.avgRedirectMs = avgRedirectMs;
    return this;
  }

  /**
   * Average redirect phase duration in milliseconds.
   *
   * @return avgRedirectMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_REDIRECT_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgRedirectMs() {
    return avgRedirectMs;
  }

  public void setAvgRedirectMs(Double avgRedirectMs) {
    this.avgRedirectMs = avgRedirectMs;
  }

  public AggregatedResourceTimingBreakdown avgSslMs(Double avgSslMs) {
    this.avgSslMs = avgSslMs;
    return this;
  }

  /**
   * Average SSL handshake duration in milliseconds.
   *
   * @return avgSslMs
   */
  @JsonProperty(JSON_PROPERTY_AVG_SSL_MS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getAvgSslMs() {
    return avgSslMs;
  }

  public void setAvgSslMs(Double avgSslMs) {
    this.avgSslMs = avgSslMs;
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
   * @return AggregatedResourceTimingBreakdown
   */
  @JsonAnySetter
  public AggregatedResourceTimingBreakdown putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AggregatedResourceTimingBreakdown object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedResourceTimingBreakdown aggregatedResourceTimingBreakdown =
        (AggregatedResourceTimingBreakdown) o;
    return Objects.equals(this.avgConnectMs, aggregatedResourceTimingBreakdown.avgConnectMs)
        && Objects.equals(this.avgDnsMs, aggregatedResourceTimingBreakdown.avgDnsMs)
        && Objects.equals(this.avgDownloadMs, aggregatedResourceTimingBreakdown.avgDownloadMs)
        && Objects.equals(this.avgFirstByteMs, aggregatedResourceTimingBreakdown.avgFirstByteMs)
        && Objects.equals(this.avgRedirectMs, aggregatedResourceTimingBreakdown.avgRedirectMs)
        && Objects.equals(this.avgSslMs, aggregatedResourceTimingBreakdown.avgSslMs)
        && Objects.equals(
            this.additionalProperties, aggregatedResourceTimingBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        avgConnectMs,
        avgDnsMs,
        avgDownloadMs,
        avgFirstByteMs,
        avgRedirectMs,
        avgSslMs,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedResourceTimingBreakdown {\n");
    sb.append("    avgConnectMs: ").append(toIndentedString(avgConnectMs)).append("\n");
    sb.append("    avgDnsMs: ").append(toIndentedString(avgDnsMs)).append("\n");
    sb.append("    avgDownloadMs: ").append(toIndentedString(avgDownloadMs)).append("\n");
    sb.append("    avgFirstByteMs: ").append(toIndentedString(avgFirstByteMs)).append("\n");
    sb.append("    avgRedirectMs: ").append(toIndentedString(avgRedirectMs)).append("\n");
    sb.append("    avgSslMs: ").append(toIndentedString(avgSslMs)).append("\n");
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
