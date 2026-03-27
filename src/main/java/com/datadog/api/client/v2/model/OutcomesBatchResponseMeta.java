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

/** Metadata pertaining to the bulk operation. */
@JsonPropertyOrder({
  OutcomesBatchResponseMeta.JSON_PROPERTY_TOTAL_RECEIVED,
  OutcomesBatchResponseMeta.JSON_PROPERTY_TOTAL_UPDATED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OutcomesBatchResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTAL_RECEIVED = "total_received";
  private Long totalReceived;

  public static final String JSON_PROPERTY_TOTAL_UPDATED = "total_updated";
  private Long totalUpdated;

  public OutcomesBatchResponseMeta totalReceived(Long totalReceived) {
    this.totalReceived = totalReceived;
    return this;
  }

  /**
   * Total number of scorecard results received during the bulk operation.
   *
   * @return totalReceived
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalReceived() {
    return totalReceived;
  }

  public void setTotalReceived(Long totalReceived) {
    this.totalReceived = totalReceived;
  }

  public OutcomesBatchResponseMeta totalUpdated(Long totalUpdated) {
    this.totalUpdated = totalUpdated;
    return this;
  }

  /**
   * Total number of scorecard results modified during the bulk operation.
   *
   * @return totalUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalUpdated() {
    return totalUpdated;
  }

  public void setTotalUpdated(Long totalUpdated) {
    this.totalUpdated = totalUpdated;
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
   * @return OutcomesBatchResponseMeta
   */
  @JsonAnySetter
  public OutcomesBatchResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OutcomesBatchResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomesBatchResponseMeta outcomesBatchResponseMeta = (OutcomesBatchResponseMeta) o;
    return Objects.equals(this.totalReceived, outcomesBatchResponseMeta.totalReceived)
        && Objects.equals(this.totalUpdated, outcomesBatchResponseMeta.totalUpdated)
        && Objects.equals(
            this.additionalProperties, outcomesBatchResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalReceived, totalUpdated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomesBatchResponseMeta {\n");
    sb.append("    totalReceived: ").append(toIndentedString(totalReceived)).append("\n");
    sb.append("    totalUpdated: ").append(toIndentedString(totalUpdated)).append("\n");
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
