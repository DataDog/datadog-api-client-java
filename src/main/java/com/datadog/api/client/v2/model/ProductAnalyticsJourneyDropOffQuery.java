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

/** Query definition for a journey drop-off analysis request. */
@JsonPropertyOrder({
  ProductAnalyticsJourneyDropOffQuery.JSON_PROPERTY_SAMPLING,
  ProductAnalyticsJourneyDropOffQuery.JSON_PROPERTY_SEARCH,
  ProductAnalyticsJourneyDropOffQuery.JSON_PROPERTY_TARGET,
  ProductAnalyticsJourneyDropOffQuery.JSON_PROPERTY_TOP_ISSUE_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsJourneyDropOffQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SAMPLING = "sampling";
  private ProductAnalyticsSampling sampling;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsJourneySearch search;

  public static final String JSON_PROPERTY_TARGET = "target";
  private ProductAnalyticsJourneyNodeTarget target;

  public static final String JSON_PROPERTY_TOP_ISSUE_COUNT = "top_issue_count";
  private Long topIssueCount = 5l;

  public ProductAnalyticsJourneyDropOffQuery() {}

  @JsonCreator
  public ProductAnalyticsJourneyDropOffQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsJourneySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
  }

  public ProductAnalyticsJourneyDropOffQuery sampling(ProductAnalyticsSampling sampling) {
    this.sampling = sampling;
    this.unparsed |= sampling.unparsed;
    return this;
  }

  /**
   * Sampling configuration for a query.
   *
   * @return sampling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsSampling getSampling() {
    return sampling;
  }

  public void setSampling(ProductAnalyticsSampling sampling) {
    this.sampling = sampling;
    if (sampling != null) {
      this.unparsed |= sampling.unparsed;
    }
  }

  public ProductAnalyticsJourneyDropOffQuery search(ProductAnalyticsJourneySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Defines the steps of the journey and the filters applied to it.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsJourneySearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsJourneySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public ProductAnalyticsJourneyDropOffQuery target(ProductAnalyticsJourneyNodeTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * A reference to a single step of the journey.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneyNodeTarget getTarget() {
    return target;
  }

  public void setTarget(ProductAnalyticsJourneyNodeTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
  }

  public ProductAnalyticsJourneyDropOffQuery topIssueCount(Long topIssueCount) {
    this.topIssueCount = topIssueCount;
    return this;
  }

  /**
   * Maximum number of issues to return. minimum: 1 maximum: 100
   *
   * @return topIssueCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOP_ISSUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTopIssueCount() {
    return topIssueCount;
  }

  public void setTopIssueCount(Long topIssueCount) {
    this.topIssueCount = topIssueCount;
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
   * @return ProductAnalyticsJourneyDropOffQuery
   */
  @JsonAnySetter
  public ProductAnalyticsJourneyDropOffQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsJourneyDropOffQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsJourneyDropOffQuery productAnalyticsJourneyDropOffQuery =
        (ProductAnalyticsJourneyDropOffQuery) o;
    return Objects.equals(this.sampling, productAnalyticsJourneyDropOffQuery.sampling)
        && Objects.equals(this.search, productAnalyticsJourneyDropOffQuery.search)
        && Objects.equals(this.target, productAnalyticsJourneyDropOffQuery.target)
        && Objects.equals(this.topIssueCount, productAnalyticsJourneyDropOffQuery.topIssueCount)
        && Objects.equals(
            this.additionalProperties, productAnalyticsJourneyDropOffQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampling, search, target, topIssueCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsJourneyDropOffQuery {\n");
    sb.append("    sampling: ").append(toIndentedString(sampling)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    topIssueCount: ").append(toIndentedString(topIssueCount)).append("\n");
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
