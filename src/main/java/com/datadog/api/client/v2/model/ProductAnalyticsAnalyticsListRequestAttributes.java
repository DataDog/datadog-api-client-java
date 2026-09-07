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

/** Attributes for an analytics list request. */
@JsonPropertyOrder({
  ProductAnalyticsAnalyticsListRequestAttributes.JSON_PROPERTY_FROM,
  ProductAnalyticsAnalyticsListRequestAttributes.JSON_PROPERTY_QUERY,
  ProductAnalyticsAnalyticsListRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsAnalyticsListRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsAnalyticsListQuery query;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public ProductAnalyticsAnalyticsListRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsAnalyticsListRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          ProductAnalyticsAnalyticsListQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.to = to;
  }

  public ProductAnalyticsAnalyticsListRequestAttributes from(Long from) {
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

  public ProductAnalyticsAnalyticsListRequestAttributes query(
      ProductAnalyticsAnalyticsListQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * The analytics list query definition. It selects the events to return with <code>query</code>,
   * then chooses the columns on each event row, the sort applied to those rows, and a row limit.
   * Unlike the scalar and timeseries queries, a list query returns raw event rows rather than
   * aggregates, so it takes no compute or group-by rule.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsAnalyticsListQuery getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsAnalyticsListQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public ProductAnalyticsAnalyticsListRequestAttributes to(Long to) {
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
   * @return ProductAnalyticsAnalyticsListRequestAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsAnalyticsListRequestAttributes putAdditionalProperty(
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

  /** Return true if this ProductAnalyticsAnalyticsListRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsAnalyticsListRequestAttributes productAnalyticsAnalyticsListRequestAttributes =
        (ProductAnalyticsAnalyticsListRequestAttributes) o;
    return Objects.equals(this.from, productAnalyticsAnalyticsListRequestAttributes.from)
        && Objects.equals(this.query, productAnalyticsAnalyticsListRequestAttributes.query)
        && Objects.equals(this.to, productAnalyticsAnalyticsListRequestAttributes.to)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsAnalyticsListRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, query, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsAnalyticsListRequestAttributes {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
