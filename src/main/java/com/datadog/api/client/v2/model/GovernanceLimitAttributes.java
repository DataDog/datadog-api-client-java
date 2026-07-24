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

/** The attributes of a governance limit. */
@JsonPropertyOrder({
  GovernanceLimitAttributes.JSON_PROPERTY_DESCRIPTION,
  GovernanceLimitAttributes.JSON_PROPERTY_DISPLAY_NAME,
  GovernanceLimitAttributes.JSON_PROPERTY_LIMIT_TYPE,
  GovernanceLimitAttributes.JSON_PROPERTY_PRODUCT,
  GovernanceLimitAttributes.JSON_PROPERTY_QUERY,
  GovernanceLimitAttributes.JSON_PROPERTY_QUERY_CONFIG,
  GovernanceLimitAttributes.JSON_PROPERTY_TIME_RANGE,
  GovernanceLimitAttributes.JSON_PROPERTY_TIMES_HIT_LIMIT,
  GovernanceLimitAttributes.JSON_PROPERTY_UNIT_NAME,
  GovernanceLimitAttributes.JSON_PROPERTY_USAGE_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceLimitAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_LIMIT_TYPE = "limit_type";
  private String limitType;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_QUERY = "query";
  private GovernanceLimitQuery query;

  public static final String JSON_PROPERTY_QUERY_CONFIG = "query_config";
  private GovernanceLimitQueryConfig queryConfig;

  public static final String JSON_PROPERTY_TIME_RANGE = "time_range";
  private String timeRange;

  public static final String JSON_PROPERTY_TIMES_HIT_LIMIT = "times_hit_limit";
  private Double timesHitLimit;

  public static final String JSON_PROPERTY_UNIT_NAME = "unit_name";
  private String unitName;

  public static final String JSON_PROPERTY_USAGE_STATUS = "usage_status";
  private String usageStatus;

  public GovernanceLimitAttributes() {}

  @JsonCreator
  public GovernanceLimitAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT_TYPE) String limitType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) GovernanceLimitQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_CONFIG)
          GovernanceLimitQueryConfig queryConfig,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_RANGE) String timeRange,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMES_HIT_LIMIT) Double timesHitLimit,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT_NAME) String unitName,
      @JsonProperty(required = true, value = JSON_PROPERTY_USAGE_STATUS) String usageStatus) {
    this.description = description;
    this.displayName = displayName;
    this.limitType = limitType;
    this.product = product;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.queryConfig = queryConfig;
    this.unparsed |= queryConfig.unparsed;
    this.timeRange = timeRange;
    this.timesHitLimit = timesHitLimit;
    this.unitName = unitName;
    this.usageStatus = usageStatus;
  }

  public GovernanceLimitAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the limit measures.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GovernanceLimitAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name of the limit.
   *
   * @return displayName
   */
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public GovernanceLimitAttributes limitType(String limitType) {
    this.limitType = limitType;
    return this;
  }

  /**
   * The type of limit, such as a rate limit or a usage limit.
   *
   * @return limitType
   */
  @JsonProperty(JSON_PROPERTY_LIMIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLimitType() {
    return limitType;
  }

  public void setLimitType(String limitType) {
    this.limitType = limitType;
  }

  public GovernanceLimitAttributes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The Datadog product the limit belongs to.
   *
   * @return product
   */
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public GovernanceLimitAttributes query(GovernanceLimitQuery query) {
    this.query = query;
    this.unparsed |= query.unparsed;
    return this;
  }

  /**
   * A metric query used to compute usage against a limit.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceLimitQuery getQuery() {
    return query;
  }

  public void setQuery(GovernanceLimitQuery query) {
    this.query = query;
  }

  public GovernanceLimitAttributes queryConfig(GovernanceLimitQueryConfig queryConfig) {
    this.queryConfig = queryConfig;
    this.unparsed |= queryConfig.unparsed;
    return this;
  }

  /**
   * The query execution context used to visualize a limit and its usage.
   *
   * @return queryConfig
   */
  @JsonProperty(JSON_PROPERTY_QUERY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceLimitQueryConfig getQueryConfig() {
    return queryConfig;
  }

  public void setQueryConfig(GovernanceLimitQueryConfig queryConfig) {
    this.queryConfig = queryConfig;
  }

  public GovernanceLimitAttributes timeRange(String timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * The time range over which usage against the limit is measured.
   *
   * @return timeRange
   */
  @JsonProperty(JSON_PROPERTY_TIME_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimeRange() {
    return timeRange;
  }

  public void setTimeRange(String timeRange) {
    this.timeRange = timeRange;
  }

  public GovernanceLimitAttributes timesHitLimit(Double timesHitLimit) {
    this.timesHitLimit = timesHitLimit;
    return this;
  }

  /**
   * The number of times usage has reached the limit within the measured time range.
   *
   * @return timesHitLimit
   */
  @JsonProperty(JSON_PROPERTY_TIMES_HIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getTimesHitLimit() {
    return timesHitLimit;
  }

  public void setTimesHitLimit(Double timesHitLimit) {
    this.timesHitLimit = timesHitLimit;
  }

  public GovernanceLimitAttributes unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  /**
   * The unit in which the limit and its usage are measured.
   *
   * @return unitName
   */
  @JsonProperty(JSON_PROPERTY_UNIT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public GovernanceLimitAttributes usageStatus(String usageStatus) {
    this.usageStatus = usageStatus;
    return this;
  }

  /**
   * The current usage status of the limit relative to its threshold.
   *
   * @return usageStatus
   */
  @JsonProperty(JSON_PROPERTY_USAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUsageStatus() {
    return usageStatus;
  }

  public void setUsageStatus(String usageStatus) {
    this.usageStatus = usageStatus;
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
   * @return GovernanceLimitAttributes
   */
  @JsonAnySetter
  public GovernanceLimitAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceLimitAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceLimitAttributes governanceLimitAttributes = (GovernanceLimitAttributes) o;
    return Objects.equals(this.description, governanceLimitAttributes.description)
        && Objects.equals(this.displayName, governanceLimitAttributes.displayName)
        && Objects.equals(this.limitType, governanceLimitAttributes.limitType)
        && Objects.equals(this.product, governanceLimitAttributes.product)
        && Objects.equals(this.query, governanceLimitAttributes.query)
        && Objects.equals(this.queryConfig, governanceLimitAttributes.queryConfig)
        && Objects.equals(this.timeRange, governanceLimitAttributes.timeRange)
        && Objects.equals(this.timesHitLimit, governanceLimitAttributes.timesHitLimit)
        && Objects.equals(this.unitName, governanceLimitAttributes.unitName)
        && Objects.equals(this.usageStatus, governanceLimitAttributes.usageStatus)
        && Objects.equals(
            this.additionalProperties, governanceLimitAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        displayName,
        limitType,
        product,
        query,
        queryConfig,
        timeRange,
        timesHitLimit,
        unitName,
        usageStatus,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceLimitAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryConfig: ").append(toIndentedString(queryConfig)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    timesHitLimit: ").append(toIndentedString(timesHitLimit)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    usageStatus: ").append(toIndentedString(usageStatus)).append("\n");
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
