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

/** Attributes of a journey funnel request. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyFunnelRequestAttributes.JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC,
  ProductAnalyticsJourneyFunnelRequestAttributes.JSON_PROPERTY_FROM,
  ProductAnalyticsJourneyFunnelRequestAttributes.JSON_PROPERTY_QUERY,
  ProductAnalyticsJourneyFunnelRequestAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyFunnelRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC = "exclude_anonymous_traffic";
  private Boolean excludeAnonymousTraffic = false;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_QUERY = "query";
  private ProductAnalyticsJourneyFunnelQuery query;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public ProductAnalyticsJourneyFunnelRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsJourneyFunnelRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY)
          ProductAnalyticsJourneyFunnelQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.from = from;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.to = to;
  }

  public ProductAnalyticsJourneyFunnelRequestAttributes excludeAnonymousTraffic(
      Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
    return this;
  }

  /**
   * Whether to exclude sessions that are not tied to an identified user.
   *
   * @return excludeAnonymousTraffic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeAnonymousTraffic() {
    return excludeAnonymousTraffic;
  }

  public void setExcludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
  }

  public ProductAnalyticsJourneyFunnelRequestAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the query window, in epoch milliseconds.
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

  public ProductAnalyticsJourneyFunnelRequestAttributes query(
      ProductAnalyticsJourneyFunnelQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * Query definition for a journey funnel request.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneyFunnelQuery getQuery() {
    return query;
  }

  public void setQuery(ProductAnalyticsJourneyFunnelQuery query) {
    this.query = query;
    if (query != null) {
      this.unparsed |= query.unparsed;
    }
  }

  public ProductAnalyticsJourneyFunnelRequestAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the query window, in epoch milliseconds.
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
   * @return ProductAnalyticsJourneyFunnelRequestAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyFunnelRequestAttributes putAdditionalProperty(
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

  /** Return true if this ProductAnalyticsJourneyFunnelRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyFunnelRequestAttributes productAnalyticsJourneyFunnelRequestAttributes =
        (ProductAnalyticsJourneyFunnelRequestAttributes) o;
    return Objects.equals(
            this.excludeAnonymousTraffic,
            productAnalyticsJourneyFunnelRequestAttributes.excludeAnonymousTraffic)
        && Objects.equals(this.from, productAnalyticsJourneyFunnelRequestAttributes.from)
        && Objects.equals(this.query, productAnalyticsJourneyFunnelRequestAttributes.query)
        && Objects.equals(this.to, productAnalyticsJourneyFunnelRequestAttributes.to)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsJourneyFunnelRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeAnonymousTraffic, from, query, to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyFunnelRequestAttributes {\n");
    sb.append("    excludeAnonymousTraffic: ")
        .append(toIndentedString(excludeAnonymousTraffic))
        .append("\n");
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
