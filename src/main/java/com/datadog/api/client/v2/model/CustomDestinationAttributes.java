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

/** The custom destination attributes. */
@JsonPropertyOrder({
  CustomDestinationAttributes.JSON_PROPERTY_BUFFER_MAX_BYTES,
  CustomDestinationAttributes.JSON_PROPERTY_BUFFER_TIMEOUT_SECONDS,
  CustomDestinationAttributes.JSON_PROPERTY_COMPRESSION,
  CustomDestinationAttributes.JSON_PROPERTY_ENABLED,
  CustomDestinationAttributes.JSON_PROPERTY_FALLBACK_DESTINATION,
  CustomDestinationAttributes.JSON_PROPERTY_FORWARDER_DESTINATION,
  CustomDestinationAttributes.JSON_PROPERTY_MAX_RETRY_DURATION_SECONDS,
  CustomDestinationAttributes.JSON_PROPERTY_NAME,
  CustomDestinationAttributes.JSON_PROPERTY_QUERY,
  CustomDestinationAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUFFER_MAX_BYTES = "bufferMaxBytes";
  private Long bufferMaxBytes;

  public static final String JSON_PROPERTY_BUFFER_TIMEOUT_SECONDS = "bufferTimeoutSeconds";
  private Long bufferTimeoutSeconds;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private CustomDestinationCompressionType compression;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_FALLBACK_DESTINATION = "fallbackDestination";
  private CustomDestinationFallbackDestination fallbackDestination;

  public static final String JSON_PROPERTY_FORWARDER_DESTINATION = "forwarderDestination";
  private CustomDestinationForwarderDestination forwarderDestination;

  public static final String JSON_PROPERTY_MAX_RETRY_DURATION_SECONDS = "maxRetryDurationSeconds";
  private Long maxRetryDurationSeconds;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public CustomDestinationAttributes() {}

  @JsonCreator
  public CustomDestinationAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORWARDER_DESTINATION)
          CustomDestinationForwarderDestination forwarderDestination,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.forwarderDestination = forwarderDestination;
    this.unparsed |= forwarderDestination.unparsed;
    this.name = name;
    this.version = version;
  }

  public CustomDestinationAttributes bufferMaxBytes(Long bufferMaxBytes) {
    this.bufferMaxBytes = bufferMaxBytes;
    return this;
  }

  /**
   * The max amount of bytes to buffer for the custom destination.
   *
   * @return bufferMaxBytes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER_MAX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBufferMaxBytes() {
    return bufferMaxBytes;
  }

  public void setBufferMaxBytes(Long bufferMaxBytes) {
    this.bufferMaxBytes = bufferMaxBytes;
  }

  public CustomDestinationAttributes bufferTimeoutSeconds(Long bufferTimeoutSeconds) {
    this.bufferTimeoutSeconds = bufferTimeoutSeconds;
    return this;
  }

  /**
   * The timeout amount in seconds to buffer for the custom destination.
   *
   * @return bufferTimeoutSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER_TIMEOUT_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBufferTimeoutSeconds() {
    return bufferTimeoutSeconds;
  }

  public void setBufferTimeoutSeconds(Long bufferTimeoutSeconds) {
    this.bufferTimeoutSeconds = bufferTimeoutSeconds;
  }

  public CustomDestinationAttributes compression(CustomDestinationCompressionType compression) {
    this.compression = compression;
    this.unparsed |= !compression.isValid();
    return this;
  }

  /**
   * The compression method used for the custom destination.
   *
   * @return compression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomDestinationCompressionType getCompression() {
    return compression;
  }

  public void setCompression(CustomDestinationCompressionType compression) {
    if (!compression.isValid()) {
      this.unparsed = true;
    }
    this.compression = compression;
  }

  public CustomDestinationAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The enabled status of the custom destination.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CustomDestinationAttributes fallbackDestination(
      CustomDestinationFallbackDestination fallbackDestination) {
    this.fallbackDestination = fallbackDestination;
    this.unparsed |= fallbackDestination.unparsed;
    return this;
  }

  /**
   * The archiving destination to fall back to.
   *
   * @return fallbackDestination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FALLBACK_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomDestinationFallbackDestination getFallbackDestination() {
    return fallbackDestination;
  }

  public void setFallbackDestination(CustomDestinationFallbackDestination fallbackDestination) {
    this.fallbackDestination = fallbackDestination;
  }

  public CustomDestinationAttributes forwarderDestination(
      CustomDestinationForwarderDestination forwarderDestination) {
    this.forwarderDestination = forwarderDestination;
    this.unparsed |= forwarderDestination.unparsed;
    return this;
  }

  /**
   * The destination to forward events to.
   *
   * @return forwarderDestination
   */
  @JsonProperty(JSON_PROPERTY_FORWARDER_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationForwarderDestination getForwarderDestination() {
    return forwarderDestination;
  }

  public void setForwarderDestination(CustomDestinationForwarderDestination forwarderDestination) {
    this.forwarderDestination = forwarderDestination;
  }

  public CustomDestinationAttributes maxRetryDurationSeconds(Long maxRetryDurationSeconds) {
    this.maxRetryDurationSeconds = maxRetryDurationSeconds;
    return this;
  }

  /**
   * The retry duration in seconds for the custom destination.
   *
   * @return maxRetryDurationSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_RETRY_DURATION_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMaxRetryDurationSeconds() {
    return maxRetryDurationSeconds;
  }

  public void setMaxRetryDurationSeconds(Long maxRetryDurationSeconds) {
    this.maxRetryDurationSeconds = maxRetryDurationSeconds;
  }

  public CustomDestinationAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom destination.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomDestinationAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The search query of the custom destination.
   *
   * @return query
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public CustomDestinationAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the custom destination to prevent concurrent changes.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
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
   * @return CustomDestinationAttributes
   */
  @JsonAnySetter
  public CustomDestinationAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomDestinationAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationAttributes customDestinationAttributes = (CustomDestinationAttributes) o;
    return Objects.equals(this.bufferMaxBytes, customDestinationAttributes.bufferMaxBytes)
        && Objects.equals(
            this.bufferTimeoutSeconds, customDestinationAttributes.bufferTimeoutSeconds)
        && Objects.equals(this.compression, customDestinationAttributes.compression)
        && Objects.equals(this.enabled, customDestinationAttributes.enabled)
        && Objects.equals(this.fallbackDestination, customDestinationAttributes.fallbackDestination)
        && Objects.equals(
            this.forwarderDestination, customDestinationAttributes.forwarderDestination)
        && Objects.equals(
            this.maxRetryDurationSeconds, customDestinationAttributes.maxRetryDurationSeconds)
        && Objects.equals(this.name, customDestinationAttributes.name)
        && Objects.equals(this.query, customDestinationAttributes.query)
        && Objects.equals(this.version, customDestinationAttributes.version)
        && Objects.equals(
            this.additionalProperties, customDestinationAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bufferMaxBytes,
        bufferTimeoutSeconds,
        compression,
        enabled,
        fallbackDestination,
        forwarderDestination,
        maxRetryDurationSeconds,
        name,
        query,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationAttributes {\n");
    sb.append("    bufferMaxBytes: ").append(toIndentedString(bufferMaxBytes)).append("\n");
    sb.append("    bufferTimeoutSeconds: ")
        .append(toIndentedString(bufferTimeoutSeconds))
        .append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fallbackDestination: ")
        .append(toIndentedString(fallbackDestination))
        .append("\n");
    sb.append("    forwarderDestination: ")
        .append(toIndentedString(forwarderDestination))
        .append("\n");
    sb.append("    maxRetryDurationSeconds: ")
        .append(toIndentedString(maxRetryDurationSeconds))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
