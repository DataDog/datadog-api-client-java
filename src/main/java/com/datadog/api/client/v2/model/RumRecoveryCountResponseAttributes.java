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

/** Approximate recoverable count. */
@JsonPropertyOrder({
  RumRecoveryCountResponseAttributes.JSON_PROPERTY_ESTIMATED_COUNT,
  RumRecoveryCountResponseAttributes.JSON_PROPERTY_MAX_RECOVERABLE_SESSIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveryCountResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ESTIMATED_COUNT = "estimated_count";
  private Long estimatedCount;

  public static final String JSON_PROPERTY_MAX_RECOVERABLE_SESSIONS = "max_recoverable_sessions";
  private Long maxRecoverableSessions;

  public RumRecoveryCountResponseAttributes() {}

  @JsonCreator
  public RumRecoveryCountResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ESTIMATED_COUNT) Long estimatedCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_MAX_RECOVERABLE_SESSIONS)
          Long maxRecoverableSessions) {
    this.estimatedCount = estimatedCount;
    this.maxRecoverableSessions = maxRecoverableSessions;
  }

  public RumRecoveryCountResponseAttributes estimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
    return this;
  }

  /**
   * Estimated distinct recoverable sessions not already retained in hot storage. The full estimate
   * is returned without capping it at max_recoverable_sessions. minimum: 0
   *
   * @return estimatedCount
   */
  @JsonProperty(JSON_PROPERTY_ESTIMATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEstimatedCount() {
    return estimatedCount;
  }

  public void setEstimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
  }

  public RumRecoveryCountResponseAttributes maxRecoverableSessions(Long maxRecoverableSessions) {
    this.maxRecoverableSessions = maxRecoverableSessions;
    return this;
  }

  /**
   * Configured maximum estimated recoverable sessions per batch (100,000 by default). Estimates
   * equal to this value are accepted at creation. minimum: 1 maximum: 2147483647
   *
   * @return maxRecoverableSessions
   */
  @JsonProperty(JSON_PROPERTY_MAX_RECOVERABLE_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMaxRecoverableSessions() {
    return maxRecoverableSessions;
  }

  public void setMaxRecoverableSessions(Long maxRecoverableSessions) {
    this.maxRecoverableSessions = maxRecoverableSessions;
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
   * @return RumRecoveryCountResponseAttributes
   */
  @JsonAnySetter
  public RumRecoveryCountResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveryCountResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveryCountResponseAttributes rumRecoveryCountResponseAttributes =
        (RumRecoveryCountResponseAttributes) o;
    return Objects.equals(this.estimatedCount, rumRecoveryCountResponseAttributes.estimatedCount)
        && Objects.equals(
            this.maxRecoverableSessions, rumRecoveryCountResponseAttributes.maxRecoverableSessions)
        && Objects.equals(
            this.additionalProperties, rumRecoveryCountResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedCount, maxRecoverableSessions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveryCountResponseAttributes {\n");
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
    sb.append("    maxRecoverableSessions: ")
        .append(toIndentedString(maxRecoverableSessions))
        .append("\n");
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
