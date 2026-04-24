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

/** Network Path test result capturing the path between source and destination. */
@JsonPropertyOrder({
  SyntheticsTestResultNetpath.JSON_PROPERTY_DESTINATION,
  SyntheticsTestResultNetpath.JSON_PROPERTY_HOPS,
  SyntheticsTestResultNetpath.JSON_PROPERTY_ORIGIN,
  SyntheticsTestResultNetpath.JSON_PROPERTY_PATHTRACE_ID,
  SyntheticsTestResultNetpath.JSON_PROPERTY_PROTOCOL,
  SyntheticsTestResultNetpath.JSON_PROPERTY_SOURCE,
  SyntheticsTestResultNetpath.JSON_PROPERTY_TAGS,
  SyntheticsTestResultNetpath.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultNetpath {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private SyntheticsTestResultNetpathDestination destination;

  public static final String JSON_PROPERTY_HOPS = "hops";
  private List<SyntheticsTestResultNetpathHop> hops = null;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public static final String JSON_PROPERTY_PATHTRACE_ID = "pathtrace_id";
  private String pathtraceId;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private SyntheticsTestResultNetpathEndpoint source;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public SyntheticsTestResultNetpath destination(
      SyntheticsTestResultNetpathDestination destination) {
    this.destination = destination;
    this.unparsed |= destination.unparsed;
    return this;
  }

  /**
   * Destination endpoint of a network path measurement.
   *
   * @return destination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultNetpathDestination getDestination() {
    return destination;
  }

  public void setDestination(SyntheticsTestResultNetpathDestination destination) {
    this.destination = destination;
  }

  public SyntheticsTestResultNetpath hops(List<SyntheticsTestResultNetpathHop> hops) {
    this.hops = hops;
    for (SyntheticsTestResultNetpathHop item : hops) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultNetpath addHopsItem(SyntheticsTestResultNetpathHop hopsItem) {
    if (this.hops == null) {
      this.hops = new ArrayList<>();
    }
    this.hops.add(hopsItem);
    this.unparsed |= hopsItem.unparsed;
    return this;
  }

  /**
   * Hops along the network path.
   *
   * @return hops
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultNetpathHop> getHops() {
    return hops;
  }

  public void setHops(List<SyntheticsTestResultNetpathHop> hops) {
    this.hops = hops;
  }

  public SyntheticsTestResultNetpath origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Origin of the network path (for example, probe source).
   *
   * @return origin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public SyntheticsTestResultNetpath pathtraceId(String pathtraceId) {
    this.pathtraceId = pathtraceId;
    return this;
  }

  /**
   * Identifier of the path trace.
   *
   * @return pathtraceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATHTRACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPathtraceId() {
    return pathtraceId;
  }

  public void setPathtraceId(String pathtraceId) {
    this.pathtraceId = pathtraceId;
  }

  public SyntheticsTestResultNetpath protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol used for the path trace (for example, <code>tcp</code>, <code>udp</code>, <code>icmp
   * </code>).
   *
   * @return protocol
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SyntheticsTestResultNetpath source(SyntheticsTestResultNetpathEndpoint source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * Source endpoint of a network path measurement.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultNetpathEndpoint getSource() {
    return source;
  }

  public void setSource(SyntheticsTestResultNetpathEndpoint source) {
    this.source = source;
  }

  public SyntheticsTestResultNetpath tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SyntheticsTestResultNetpath addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the network path measurement.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public SyntheticsTestResultNetpath timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Unix timestamp (ms) of the network path measurement.
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
   * @return SyntheticsTestResultNetpath
   */
  @JsonAnySetter
  public SyntheticsTestResultNetpath putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultNetpath object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultNetpath syntheticsTestResultNetpath = (SyntheticsTestResultNetpath) o;
    return Objects.equals(this.destination, syntheticsTestResultNetpath.destination)
        && Objects.equals(this.hops, syntheticsTestResultNetpath.hops)
        && Objects.equals(this.origin, syntheticsTestResultNetpath.origin)
        && Objects.equals(this.pathtraceId, syntheticsTestResultNetpath.pathtraceId)
        && Objects.equals(this.protocol, syntheticsTestResultNetpath.protocol)
        && Objects.equals(this.source, syntheticsTestResultNetpath.source)
        && Objects.equals(this.tags, syntheticsTestResultNetpath.tags)
        && Objects.equals(this.timestamp, syntheticsTestResultNetpath.timestamp)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultNetpath.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        destination,
        hops,
        origin,
        pathtraceId,
        protocol,
        source,
        tags,
        timestamp,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultNetpath {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    hops: ").append(toIndentedString(hops)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    pathtraceId: ").append(toIndentedString(pathtraceId)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
