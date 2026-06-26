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

/** The attributes of a governance resource limit. */
@JsonPropertyOrder({
  GovernanceResourceLimitAttributes.JSON_PROPERTY_CURRENT_LIMIT,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_CURRENT_VALUE,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_DEEP_LINK,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_DEFAULT_CURRENT_VALUE,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_DEFAULT_LIMIT_VALUE,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_DESCRIPTION,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_DISPLAY_NAME,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_LIMIT_QUERY,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_PRODUCT,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_QUERY,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_QUERY_CONFIG,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_TIME_RANGE,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_UNIT_NAME,
  GovernanceResourceLimitAttributes.JSON_PROPERTY_USAGE_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceResourceLimitAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CURRENT_LIMIT = "current_limit";
  private Double currentLimit;

  public static final String JSON_PROPERTY_CURRENT_VALUE = "current_value";
  private Double currentValue;

  public static final String JSON_PROPERTY_DEEP_LINK = "deep_link";
  private String deepLink;

  public static final String JSON_PROPERTY_DEFAULT_CURRENT_VALUE = "default_current_value";
  private Double defaultCurrentValue;

  public static final String JSON_PROPERTY_DEFAULT_LIMIT_VALUE = "default_limit_value";
  private Double defaultLimitValue;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_LIMIT_QUERY = "limit_query";
  private GovernanceLimitQuery limitQuery;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_QUERY = "query";
  private GovernanceLimitQuery query;

  public static final String JSON_PROPERTY_QUERY_CONFIG = "query_config";
  private GovernanceLimitQueryConfig queryConfig;

  public static final String JSON_PROPERTY_TIME_RANGE = "time_range";
  private String timeRange;

  public static final String JSON_PROPERTY_UNIT_NAME = "unit_name";
  private String unitName;

  public static final String JSON_PROPERTY_USAGE_STATUS = "usage_status";
  private String usageStatus;

  public GovernanceResourceLimitAttributes() {}

  @JsonCreator
  public GovernanceResourceLimitAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_LIMIT) Double currentLimit,
      @JsonProperty(required = true, value = JSON_PROPERTY_CURRENT_VALUE) Double currentValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEEP_LINK) String deepLink,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_CURRENT_VALUE)
          Double defaultCurrentValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_LIMIT_VALUE)
          Double defaultLimitValue,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMIT_QUERY)
          GovernanceLimitQuery limitQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) GovernanceLimitQuery query,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY_CONFIG)
          GovernanceLimitQueryConfig queryConfig,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_RANGE) String timeRange,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT_NAME) String unitName,
      @JsonProperty(required = true, value = JSON_PROPERTY_USAGE_STATUS) String usageStatus) {
    this.currentLimit = currentLimit;
    this.currentValue = currentValue;
    this.deepLink = deepLink;
    this.defaultCurrentValue = defaultCurrentValue;
    this.defaultLimitValue = defaultLimitValue;
    this.description = description;
    this.displayName = displayName;
    this.limitQuery = limitQuery;
    this.unparsed |= limitQuery.unparsed;
    this.product = product;
    this.query = query;
    this.unparsed |= query.unparsed;
    this.queryConfig = queryConfig;
    this.unparsed |= queryConfig.unparsed;
    this.timeRange = timeRange;
    this.unitName = unitName;
    this.usageStatus = usageStatus;
  }

  public GovernanceResourceLimitAttributes currentLimit(Double currentLimit) {
    this.currentLimit = currentLimit;
    return this;
  }

  /**
   * The current limit configured for the resource.
   *
   * @return currentLimit
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCurrentLimit() {
    return currentLimit;
  }

  public void setCurrentLimit(Double currentLimit) {
    this.currentLimit = currentLimit;
  }

  public GovernanceResourceLimitAttributes currentValue(Double currentValue) {
    this.currentValue = currentValue;
    return this;
  }

  /**
   * The current value of the resource.
   *
   * @return currentValue
   */
  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(Double currentValue) {
    this.currentValue = currentValue;
  }

  public GovernanceResourceLimitAttributes deepLink(String deepLink) {
    this.deepLink = deepLink;
    return this;
  }

  /**
   * A link to the Datadog page where the resource and its limit can be managed.
   *
   * @return deepLink
   */
  @JsonProperty(JSON_PROPERTY_DEEP_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDeepLink() {
    return deepLink;
  }

  public void setDeepLink(String deepLink) {
    this.deepLink = deepLink;
  }

  public GovernanceResourceLimitAttributes defaultCurrentValue(Double defaultCurrentValue) {
    this.defaultCurrentValue = defaultCurrentValue;
    return this;
  }

  /**
   * The default current value used when the resource value cannot be computed from the query.
   *
   * @return defaultCurrentValue
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getDefaultCurrentValue() {
    return defaultCurrentValue;
  }

  public void setDefaultCurrentValue(Double defaultCurrentValue) {
    this.defaultCurrentValue = defaultCurrentValue;
  }

  public GovernanceResourceLimitAttributes defaultLimitValue(Double defaultLimitValue) {
    this.defaultLimitValue = defaultLimitValue;
    return this;
  }

  /**
   * The default limit value used when the limit cannot be computed from the query.
   *
   * @return defaultLimitValue
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_LIMIT_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getDefaultLimitValue() {
    return defaultLimitValue;
  }

  public void setDefaultLimitValue(Double defaultLimitValue) {
    this.defaultLimitValue = defaultLimitValue;
  }

  public GovernanceResourceLimitAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the resource limit measures.
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

  public GovernanceResourceLimitAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The human-readable name of the resource limit.
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

  public GovernanceResourceLimitAttributes limitQuery(GovernanceLimitQuery limitQuery) {
    this.limitQuery = limitQuery;
    this.unparsed |= limitQuery.unparsed;
    return this;
  }

  /**
   * A metric query used to compute usage against a limit.
   *
   * @return limitQuery
   */
  @JsonProperty(JSON_PROPERTY_LIMIT_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public GovernanceLimitQuery getLimitQuery() {
    return limitQuery;
  }

  public void setLimitQuery(GovernanceLimitQuery limitQuery) {
    this.limitQuery = limitQuery;
  }

  public GovernanceResourceLimitAttributes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The Datadog product the resource limit belongs to.
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

  public GovernanceResourceLimitAttributes query(GovernanceLimitQuery query) {
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

  public GovernanceResourceLimitAttributes queryConfig(GovernanceLimitQueryConfig queryConfig) {
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

  public GovernanceResourceLimitAttributes timeRange(String timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * The time range over which the resource value is measured.
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

  public GovernanceResourceLimitAttributes unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  /**
   * The unit in which the resource value and limit are measured.
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

  public GovernanceResourceLimitAttributes usageStatus(String usageStatus) {
    this.usageStatus = usageStatus;
    return this;
  }

  /**
   * The current usage status of the resource relative to its limit.
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
   * @return GovernanceResourceLimitAttributes
   */
  @JsonAnySetter
  public GovernanceResourceLimitAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceResourceLimitAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceResourceLimitAttributes governanceResourceLimitAttributes =
        (GovernanceResourceLimitAttributes) o;
    return Objects.equals(this.currentLimit, governanceResourceLimitAttributes.currentLimit)
        && Objects.equals(this.currentValue, governanceResourceLimitAttributes.currentValue)
        && Objects.equals(this.deepLink, governanceResourceLimitAttributes.deepLink)
        && Objects.equals(
            this.defaultCurrentValue, governanceResourceLimitAttributes.defaultCurrentValue)
        && Objects.equals(
            this.defaultLimitValue, governanceResourceLimitAttributes.defaultLimitValue)
        && Objects.equals(this.description, governanceResourceLimitAttributes.description)
        && Objects.equals(this.displayName, governanceResourceLimitAttributes.displayName)
        && Objects.equals(this.limitQuery, governanceResourceLimitAttributes.limitQuery)
        && Objects.equals(this.product, governanceResourceLimitAttributes.product)
        && Objects.equals(this.query, governanceResourceLimitAttributes.query)
        && Objects.equals(this.queryConfig, governanceResourceLimitAttributes.queryConfig)
        && Objects.equals(this.timeRange, governanceResourceLimitAttributes.timeRange)
        && Objects.equals(this.unitName, governanceResourceLimitAttributes.unitName)
        && Objects.equals(this.usageStatus, governanceResourceLimitAttributes.usageStatus)
        && Objects.equals(
            this.additionalProperties, governanceResourceLimitAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        currentLimit,
        currentValue,
        deepLink,
        defaultCurrentValue,
        defaultLimitValue,
        description,
        displayName,
        limitQuery,
        product,
        query,
        queryConfig,
        timeRange,
        unitName,
        usageStatus,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceResourceLimitAttributes {\n");
    sb.append("    currentLimit: ").append(toIndentedString(currentLimit)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
    sb.append("    defaultCurrentValue: ")
        .append(toIndentedString(defaultCurrentValue))
        .append("\n");
    sb.append("    defaultLimitValue: ").append(toIndentedString(defaultLimitValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    limitQuery: ").append(toIndentedString(limitQuery)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryConfig: ").append(toIndentedString(queryConfig)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
