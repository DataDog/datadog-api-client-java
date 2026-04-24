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

/** A CDN resource encountered while executing a browser step. */
@JsonPropertyOrder({
  SyntheticsTestResultCdnResource.JSON_PROPERTY_CDN,
  SyntheticsTestResultCdnResource.JSON_PROPERTY_RESOLVED_IP,
  SyntheticsTestResultCdnResource.JSON_PROPERTY_TIMESTAMP,
  SyntheticsTestResultCdnResource.JSON_PROPERTY_TIMINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultCdnResource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CDN = "cdn";
  private SyntheticsTestResultCdnProviderInfo cdn;

  public static final String JSON_PROPERTY_RESOLVED_IP = "resolved_ip";
  private String resolvedIp;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private Map<String, Object> timings = null;

  public SyntheticsTestResultCdnResource cdn(SyntheticsTestResultCdnProviderInfo cdn) {
    this.cdn = cdn;
    this.unparsed |= cdn.unparsed;
    return this;
  }

  /**
   * CDN provider details inferred from response headers.
   *
   * @return cdn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCdnProviderInfo getCdn() {
    return cdn;
  }

  public void setCdn(SyntheticsTestResultCdnProviderInfo cdn) {
    this.cdn = cdn;
  }

  public SyntheticsTestResultCdnResource resolvedIp(String resolvedIp) {
    this.resolvedIp = resolvedIp;
    return this;
  }

  /**
   * Resolved IP address for the CDN resource.
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

  public SyntheticsTestResultCdnResource timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Unix timestamp (ms) of when the resource was fetched.
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public SyntheticsTestResultCdnResource timings(Map<String, Object> timings) {
    this.timings = timings;
    return this;
  }

  public SyntheticsTestResultCdnResource putTimingsItem(String key, Object timingsItem) {
    if (this.timings == null) {
      this.timings = new HashMap<>();
    }
    this.timings.put(key, timingsItem);
    return this;
  }

  /**
   * Timing breakdown for fetching the CDN resource.
   *
   * @return timings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getTimings() {
    return timings;
  }

  public void setTimings(Map<String, Object> timings) {
    this.timings = timings;
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
   * @return SyntheticsTestResultCdnResource
   */
  @JsonAnySetter
  public SyntheticsTestResultCdnResource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultCdnResource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultCdnResource syntheticsTestResultCdnResource =
        (SyntheticsTestResultCdnResource) o;
    return Objects.equals(this.cdn, syntheticsTestResultCdnResource.cdn)
        && Objects.equals(this.resolvedIp, syntheticsTestResultCdnResource.resolvedIp)
        && Objects.equals(this.timestamp, syntheticsTestResultCdnResource.timestamp)
        && Objects.equals(this.timings, syntheticsTestResultCdnResource.timings)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultCdnResource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdn, resolvedIp, timestamp, timings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultCdnResource {\n");
    sb.append("    cdn: ").append(toIndentedString(cdn)).append("\n");
    sb.append("    resolvedIp: ").append(toIndentedString(resolvedIp)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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
