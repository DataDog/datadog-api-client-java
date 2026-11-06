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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Batch cancellation acknowledgment. */
@JsonPropertyOrder({
  RumRecoveryCancelResponseAttributes.JSON_PROPERTY_CANCELLED_AT,
  RumRecoveryCancelResponseAttributes.JSON_PROPERTY_CANCELLED_BY,
  RumRecoveryCancelResponseAttributes.JSON_PROPERTY_DISCOVERY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveryCancelResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CANCELLED_AT = "cancelled_at";
  private OffsetDateTime cancelledAt;

  public static final String JSON_PROPERTY_CANCELLED_BY = "cancelled_by";
  private String cancelledBy;

  public static final String JSON_PROPERTY_DISCOVERY_STATUS = "discovery_status";
  private RumRecoveryDiscoveryStatus discoveryStatus;

  public RumRecoveryCancelResponseAttributes() {}

  @JsonCreator
  public RumRecoveryCancelResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CANCELLED_AT) OffsetDateTime cancelledAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CANCELLED_BY) String cancelledBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISCOVERY_STATUS)
          RumRecoveryDiscoveryStatus discoveryStatus) {
    this.cancelledAt = cancelledAt;
    this.cancelledBy = cancelledBy;
    this.discoveryStatus = discoveryStatus;
    this.unparsed |= !discoveryStatus.isValid();
  }

  public RumRecoveryCancelResponseAttributes cancelledAt(OffsetDateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  /**
   * Cancellation time.
   *
   * @return cancelledAt
   */
  @JsonProperty(JSON_PROPERTY_CANCELLED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(OffsetDateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public RumRecoveryCancelResponseAttributes cancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
    return this;
  }

  /**
   * Handle of the user who canceled the batch.
   *
   * @return cancelledBy
   */
  @JsonProperty(JSON_PROPERTY_CANCELLED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCancelledBy() {
    return cancelledBy;
  }

  public void setCancelledBy(String cancelledBy) {
    this.cancelledBy = cancelledBy;
  }

  public RumRecoveryCancelResponseAttributes discoveryStatus(
      RumRecoveryDiscoveryStatus discoveryStatus) {
    this.discoveryStatus = discoveryStatus;
    this.unparsed |= !discoveryStatus.isValid();
    return this;
  }

  /**
   * Batch discovery state. QUEUED indicates that the request is waiting for processing capacity.
   *
   * @return discoveryStatus
   */
  @JsonProperty(JSON_PROPERTY_DISCOVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRecoveryDiscoveryStatus getDiscoveryStatus() {
    return discoveryStatus;
  }

  public void setDiscoveryStatus(RumRecoveryDiscoveryStatus discoveryStatus) {
    if (!discoveryStatus.isValid()) {
      this.unparsed = true;
    }
    this.discoveryStatus = discoveryStatus;
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
   * @return RumRecoveryCancelResponseAttributes
   */
  @JsonAnySetter
  public RumRecoveryCancelResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveryCancelResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveryCancelResponseAttributes rumRecoveryCancelResponseAttributes =
        (RumRecoveryCancelResponseAttributes) o;
    return Objects.equals(this.cancelledAt, rumRecoveryCancelResponseAttributes.cancelledAt)
        && Objects.equals(this.cancelledBy, rumRecoveryCancelResponseAttributes.cancelledBy)
        && Objects.equals(this.discoveryStatus, rumRecoveryCancelResponseAttributes.discoveryStatus)
        && Objects.equals(
            this.additionalProperties, rumRecoveryCancelResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelledAt, cancelledBy, discoveryStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveryCancelResponseAttributes {\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    cancelledBy: ").append(toIndentedString(cancelledBy)).append("\n");
    sb.append("    discoveryStatus: ").append(toIndentedString(discoveryStatus)).append("\n");
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
