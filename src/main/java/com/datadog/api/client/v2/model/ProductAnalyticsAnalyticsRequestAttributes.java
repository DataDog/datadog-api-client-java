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

/** Attributes for an analytics request. */
@JsonPropertyOrder({
  ProductAnalyticsAnalyticsRequestAttributes.JSON_PROPERTY_ENFORCED_EXECUTION_TYPE,
  ProductAnalyticsAnalyticsRequestAttributes.JSON_PROPERTY_FROM,
  ProductAnalyticsAnalyticsRequestAttributes.JSON_PROPERTY_QUERY,
  ProductAnalyticsAnalyticsRequestAttributes.JSON_PROPERTY_REQUEST_ID,
  ProductAnalyticsAnalyticsRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsAnalyticsRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENFORCED_EXECUTION_TYPE = "enforced_execution_type";
  private ProductAnalyticsExecutionType enforcedExecutionType;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsAnalyticsQuery query;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public ProductAnalyticsAnalyticsRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsAnalyticsRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          ProductAnalyticsAnalyticsQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.to = to;
  }

  public ProductAnalyticsAnalyticsRequestAttributes enforcedExecutionType(
      ProductAnalyticsExecutionType enforcedExecutionType) {
    this.enforcedExecutionType = enforcedExecutionType;
    this.unparsed |= !enforcedExecutionType.isValid();
    return this;
  }

  /**
   * Override the query execution strategy.
   *
   * @return enforcedExecutionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED_EXECUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsExecutionType getEnforcedExecutionType() {
    return enforcedExecutionType;
  }

  public void setEnforcedExecutionType(ProductAnalyticsExecutionType enforcedExecutionType) {
    if (!enforcedExecutionType.isValid()) {
      this.unparsed = true;
    }
    this.enforcedExecutionType = enforcedExecutionType;
  }

  public ProductAnalyticsAnalyticsRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start time in epoch milliseconds. Must be less than <code>to</code>.
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

  public ProductAnalyticsAnalyticsRequestAttributes query(ProductAnalyticsAnalyticsQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * The analytics query definition containing a base query, compute rule, and optional grouping.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsAnalyticsQuery getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsAnalyticsQuery query) {
    this.query = query;
  }

  public ProductAnalyticsAnalyticsRequestAttributes requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Optional request ID for multi-step query continuation.
   *
   * @return requestId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ProductAnalyticsAnalyticsRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End time in epoch milliseconds.
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
   * @return ProductAnalyticsAnalyticsRequestAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsAnalyticsRequestAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ProductAnalyticsAnalyticsRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsAnalyticsRequestAttributes productAnalyticsAnalyticsRequestAttributes =
        (ProductAnalyticsAnalyticsRequestAttributes) o;
    return Objects.equals(
            this.enforcedExecutionType,
            productAnalyticsAnalyticsRequestAttributes.enforcedExecutionType)
        && Objects.equals(this.from, productAnalyticsAnalyticsRequestAttributes.from)
        && Objects.equals(this.query, productAnalyticsAnalyticsRequestAttributes.query)
        && Objects.equals(this.requestId, productAnalyticsAnalyticsRequestAttributes.requestId)
        && Objects.equals(this.to, productAnalyticsAnalyticsRequestAttributes.to)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsAnalyticsRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforcedExecutionType, from, query, requestId, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsAnalyticsRequestAttributes {\n");
    sb.append("    enforcedExecutionType: ")
        .append(toIndentedString(enforcedExecutionType))
        .append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
