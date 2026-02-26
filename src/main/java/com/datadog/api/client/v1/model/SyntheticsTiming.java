/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Object containing all metrics and their values collected for a Synthetic API test. See the <a
 * href="https://docs.datadoghq.com/synthetics/metrics/">Synthetic Monitoring Metrics
 * documentation</a>.
 */
@JsonPropertyOrder({
  SyntheticsTiming.JSON_PROPERTY_DNS,
  SyntheticsTiming.JSON_PROPERTY_DOWNLOAD,
  SyntheticsTiming.JSON_PROPERTY_FIRST_BYTE,
  SyntheticsTiming.JSON_PROPERTY_HANDSHAKE,
  SyntheticsTiming.JSON_PROPERTY_REDIRECT,
  SyntheticsTiming.JSON_PROPERTY_SSL,
  SyntheticsTiming.JSON_PROPERTY_TCP,
  SyntheticsTiming.JSON_PROPERTY_TOTAL,
  SyntheticsTiming.JSON_PROPERTY_WAIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTiming {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DNS = "dns";
  private Double dns;

  public static final String JSON_PROPERTY_DOWNLOAD = "download";
  private Double download;

  public static final String JSON_PROPERTY_FIRST_BYTE = "firstByte";
  private Double firstByte;

  public static final String JSON_PROPERTY_HANDSHAKE = "handshake";
  private Double handshake;

  public static final String JSON_PROPERTY_REDIRECT = "redirect";
  private Double redirect;

  public static final String JSON_PROPERTY_SSL = "ssl";
  private Double ssl;

  public static final String JSON_PROPERTY_TCP = "tcp";
  private Double tcp;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Double total;

  public static final String JSON_PROPERTY_WAIT = "wait";
  private Double wait;

  public SyntheticsTiming dns(Double dns) {
    this.dns = dns;
    return this;
  }

  /**
   * The duration in millisecond of the DNS lookup.
   *
   * @return dns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDns() {
    return dns;
  }

  public void setDns(Double dns) {
    this.dns = dns;
  }

  public SyntheticsTiming download(Double download) {
    this.download = download;
    return this;
  }

  /**
   * The time in millisecond to download the response.
   *
   * @return download
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getDownload() {
    return download;
  }

  public void setDownload(Double download) {
    this.download = download;
  }

  public SyntheticsTiming firstByte(Double firstByte) {
    this.firstByte = firstByte;
    return this;
  }

  /**
   * The time in millisecond to first byte.
   *
   * @return firstByte
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_BYTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getFirstByte() {
    return firstByte;
  }

  public void setFirstByte(Double firstByte) {
    this.firstByte = firstByte;
  }

  public SyntheticsTiming handshake(Double handshake) {
    this.handshake = handshake;
    return this;
  }

  /**
   * The duration in millisecond of the TLS handshake.
   *
   * @return handshake
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDSHAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getHandshake() {
    return handshake;
  }

  public void setHandshake(Double handshake) {
    this.handshake = handshake;
  }

  public SyntheticsTiming redirect(Double redirect) {
    this.redirect = redirect;
    return this;
  }

  /**
   * The time in millisecond spent during redirections.
   *
   * @return redirect
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRedirect() {
    return redirect;
  }

  public void setRedirect(Double redirect) {
    this.redirect = redirect;
  }

  public SyntheticsTiming ssl(Double ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * The duration in millisecond of the TLS handshake.
   *
   * @return ssl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSsl() {
    return ssl;
  }

  public void setSsl(Double ssl) {
    this.ssl = ssl;
  }

  public SyntheticsTiming tcp(Double tcp) {
    this.tcp = tcp;
    return this;
  }

  /**
   * Time in millisecond to establish the TCP connection.
   *
   * @return tcp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TCP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTcp() {
    return tcp;
  }

  public void setTcp(Double tcp) {
    this.tcp = tcp;
  }

  public SyntheticsTiming total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * The overall time in millisecond the request took to be processed.
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public SyntheticsTiming wait(Double wait) {
    this.wait = wait;
    return this;
  }

  /**
   * Time spent in millisecond waiting for a response.
   *
   * @return wait
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getWait() {
    return wait;
  }

  public void setWait(Double wait) {
    this.wait = wait;
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
   * @return SyntheticsTiming
   */
  @JsonAnySetter
  public SyntheticsTiming putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTiming object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTiming syntheticsTiming = (SyntheticsTiming) o;
    return Objects.equals(this.dns, syntheticsTiming.dns)
        && Objects.equals(this.download, syntheticsTiming.download)
        && Objects.equals(this.firstByte, syntheticsTiming.firstByte)
        && Objects.equals(this.handshake, syntheticsTiming.handshake)
        && Objects.equals(this.redirect, syntheticsTiming.redirect)
        && Objects.equals(this.ssl, syntheticsTiming.ssl)
        && Objects.equals(this.tcp, syntheticsTiming.tcp)
        && Objects.equals(this.total, syntheticsTiming.total)
        && Objects.equals(this.wait, syntheticsTiming.wait)
        && Objects.equals(this.additionalProperties, syntheticsTiming.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dns, download, firstByte, handshake, redirect, ssl, tcp, total, wait, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTiming {\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    firstByte: ").append(toIndentedString(firstByte)).append("\n");
    sb.append("    handshake: ").append(toIndentedString(handshake)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    tcp: ").append(toIndentedString(tcp)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    wait: ").append(toIndentedString(wait)).append("\n");
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
