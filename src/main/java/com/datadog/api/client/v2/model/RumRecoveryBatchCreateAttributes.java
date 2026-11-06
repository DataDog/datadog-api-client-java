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

/**
 * Recover sessions selected by a query. The range cannot exceed 180 days; from cannot be more than
 * 4 years ago and to cannot be more than 1 hour in the future. Session availability depends on the
 * configured archive retention.
 */
@JsonPropertyOrder({
  RumRecoveryBatchCreateAttributes.JSON_PROPERTY_ESTIMATED_COUNT,
  RumRecoveryBatchCreateAttributes.JSON_PROPERTY_FROM,
  RumRecoveryBatchCreateAttributes.JSON_PROPERTY_QUERY,
  RumRecoveryBatchCreateAttributes.JSON_PROPERTY_REQUEST_TYPE,
  RumRecoveryBatchCreateAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumRecoveryBatchCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ESTIMATED_COUNT = "estimated_count";
  private Long estimatedCount;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_REQUEST_TYPE = "request_type";
  private RumRecoveryBatchRequestType requestType;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public RumRecoveryBatchCreateAttributes() {}

  @JsonCreator
  public RumRecoveryBatchCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST_TYPE)
          RumRecoveryBatchRequestType requestType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    this.to = to;
  }

  public RumRecoveryBatchCreateAttributes estimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
    return this;
  }

  /**
   * Optional client estimate. Creation validates and stores a fresh server estimate instead of this
   * value. minimum: 0
   *
   * @return estimatedCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEstimatedCount() {
    return estimatedCount;
  }

  public void setEstimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
  }

  public RumRecoveryBatchCreateAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the range in Unix milliseconds. Must be positive and earlier than to. minimum: 1
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public RumRecoveryBatchCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * RUM search query. Not blank, at most 4096 bytes for batch creation and count.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public RumRecoveryBatchCreateAttributes requestType(RumRecoveryBatchRequestType requestType) {
    this.requestType = requestType;
    this.unparsed |= !requestType.isValid();
    return this;
  }

  /**
   * Query-based batch recovery.
   *
   * @return requestType
   */
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RumRecoveryBatchRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(RumRecoveryBatchRequestType requestType) {
    if (!requestType.isValid()) {
      this.unparsed = true;
    }
    this.requestType = requestType;
  }

  public RumRecoveryBatchCreateAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the range in Unix milliseconds. minimum: 1
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
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
   * @return RumRecoveryBatchCreateAttributes
   */
  @JsonAnySetter
  public RumRecoveryBatchCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumRecoveryBatchCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumRecoveryBatchCreateAttributes rumRecoveryBatchCreateAttributes =
        (RumRecoveryBatchCreateAttributes) o;
    return Objects.equals(this.estimatedCount, rumRecoveryBatchCreateAttributes.estimatedCount)
        && Objects.equals(this.from, rumRecoveryBatchCreateAttributes.from)
        && Objects.equals(this.query, rumRecoveryBatchCreateAttributes.query)
        && Objects.equals(this.requestType, rumRecoveryBatchCreateAttributes.requestType)
        && Objects.equals(this.to, rumRecoveryBatchCreateAttributes.to)
        && Objects.equals(
            this.additionalProperties, rumRecoveryBatchCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedCount, from, query, requestType, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumRecoveryBatchCreateAttributes {\n");
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
