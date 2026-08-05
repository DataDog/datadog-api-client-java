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
 * The attributes of a governance insight. Exactly one of <code>metric_query</code>, <code>
 * event_query</code>, <code>usage_query</code>, <code>audit_query</code>, or <code>percentage_query
 * </code> is populated, depending on the data source the insight is computed from; the rest are
 * <code>null</code>.
 */
@JsonPropertyOrder({
  GovernanceInsightAttributes.JSON_PROPERTY_AUDIT_QUERY,
  GovernanceInsightAttributes.JSON_PROPERTY_DESCRIPTION,
  GovernanceInsightAttributes.JSON_PROPERTY_DISPLAY_NAME,
  GovernanceInsightAttributes.JSON_PROPERTY_EVENT_QUERY,
  GovernanceInsightAttributes.JSON_PROPERTY_METRIC_QUERY,
  GovernanceInsightAttributes.JSON_PROPERTY_PERCENTAGE_QUERY,
  GovernanceInsightAttributes.JSON_PROPERTY_PRODUCT,
  GovernanceInsightAttributes.JSON_PROPERTY_QUERY_CONFIG,
  GovernanceInsightAttributes.JSON_PROPERTY_SUB_PRODUCT,
  GovernanceInsightAttributes.JSON_PROPERTY_TIME_RANGE,
  GovernanceInsightAttributes.JSON_PROPERTY_UNIT_NAME,
  GovernanceInsightAttributes.JSON_PROPERTY_USAGE_QUERY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GovernanceInsightAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUDIT_QUERY = "audit_query";
  private GovernanceInsightAuditQuery auditQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_EVENT_QUERY = "event_query";
  private GovernanceInsightEventQuery eventQuery;

  public static final String JSON_PROPERTY_METRIC_QUERY = "metric_query";
  private GovernanceInsightMetricQuery metricQuery;

  public static final String JSON_PROPERTY_PERCENTAGE_QUERY = "percentage_query";
  private GovernanceInsightPercentageQuery percentageQuery;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_QUERY_CONFIG = "query_config";
  private GovernanceInsightQueryConfig queryConfig;

  public static final String JSON_PROPERTY_SUB_PRODUCT = "sub_product";
  private String subProduct;

  public static final String JSON_PROPERTY_TIME_RANGE = "time_range";
  private String timeRange;

  public static final String JSON_PROPERTY_UNIT_NAME = "unit_name";
  private String unitName;

  public static final String JSON_PROPERTY_USAGE_QUERY = "usage_query";
  private GovernanceInsightUsageQuery usageQuery;

  public GovernanceInsightAttributes() {}

  @JsonCreator
  public GovernanceInsightAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISPLAY_NAME) String displayName,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUB_PRODUCT) String subProduct,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME_RANGE) String timeRange,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT_NAME) String unitName) {
    this.description = description;
    this.displayName = displayName;
    this.product = product;
    this.subProduct = subProduct;
    this.timeRange = timeRange;
    this.unitName = unitName;
  }

  public GovernanceInsightAttributes auditQuery(GovernanceInsightAuditQuery auditQuery) {
    this.auditQuery = auditQuery;
    this.unparsed |= auditQuery.unparsed;
    return this;
  }

  /**
   * An audit log query used to compute an insight value.
   *
   * @return auditQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUDIT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceInsightAuditQuery getAuditQuery() {
    return auditQuery;
  }

  public void setAuditQuery(GovernanceInsightAuditQuery auditQuery) {
    this.auditQuery = auditQuery;
    if (auditQuery != null) {
      this.unparsed |= auditQuery.unparsed;
    }
  }

  public GovernanceInsightAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-readable description of what the insight measures.
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

  public GovernanceInsightAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Human-readable name of the insight.
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

  public GovernanceInsightAttributes eventQuery(GovernanceInsightEventQuery eventQuery) {
    this.eventQuery = eventQuery;
    this.unparsed |= eventQuery.unparsed;
    return this;
  }

  /**
   * An event query used to compute an insight value.
   *
   * @return eventQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceInsightEventQuery getEventQuery() {
    return eventQuery;
  }

  public void setEventQuery(GovernanceInsightEventQuery eventQuery) {
    this.eventQuery = eventQuery;
    if (eventQuery != null) {
      this.unparsed |= eventQuery.unparsed;
    }
  }

  public GovernanceInsightAttributes metricQuery(GovernanceInsightMetricQuery metricQuery) {
    this.metricQuery = metricQuery;
    this.unparsed |= metricQuery.unparsed;
    return this;
  }

  /**
   * A metric query used to compute an insight value.
   *
   * @return metricQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceInsightMetricQuery getMetricQuery() {
    return metricQuery;
  }

  public void setMetricQuery(GovernanceInsightMetricQuery metricQuery) {
    this.metricQuery = metricQuery;
    if (metricQuery != null) {
      this.unparsed |= metricQuery.unparsed;
    }
  }

  public GovernanceInsightAttributes percentageQuery(
      GovernanceInsightPercentageQuery percentageQuery) {
    this.percentageQuery = percentageQuery;
    this.unparsed |= percentageQuery.unparsed;
    return this;
  }

  /**
   * A percentage query that computes an insight value as a ratio of two metric queries.
   *
   * @return percentageQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceInsightPercentageQuery getPercentageQuery() {
    return percentageQuery;
  }

  public void setPercentageQuery(GovernanceInsightPercentageQuery percentageQuery) {
    this.percentageQuery = percentageQuery;
    if (percentageQuery != null) {
      this.unparsed |= percentageQuery.unparsed;
    }
  }

  public GovernanceInsightAttributes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * The product the insight belongs to.
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

  public GovernanceInsightAttributes queryConfig(GovernanceInsightQueryConfig queryConfig) {
    this.queryConfig = queryConfig;
    this.unparsed |= queryConfig.unparsed;
    return this;
  }

  /**
   * Query execution context for running insight queries directly.
   *
   * @return queryConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceInsightQueryConfig getQueryConfig() {
    return queryConfig;
  }

  public void setQueryConfig(GovernanceInsightQueryConfig queryConfig) {
    this.queryConfig = queryConfig;
    if (queryConfig != null) {
      this.unparsed |= queryConfig.unparsed;
    }
  }

  public GovernanceInsightAttributes subProduct(String subProduct) {
    this.subProduct = subProduct;
    return this;
  }

  /**
   * The sub-product the insight belongs to, if any.
   *
   * @return subProduct
   */
  @JsonProperty(JSON_PROPERTY_SUB_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubProduct() {
    return subProduct;
  }

  public void setSubProduct(String subProduct) {
    this.subProduct = subProduct;
  }

  public GovernanceInsightAttributes timeRange(String timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  /**
   * The time range the insight value is computed over, if applicable.
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

  public GovernanceInsightAttributes unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

  /**
   * The unit that the insight's value is measured in.
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

  public GovernanceInsightAttributes usageQuery(GovernanceInsightUsageQuery usageQuery) {
    this.usageQuery = usageQuery;
    this.unparsed |= usageQuery.unparsed;
    return this;
  }

  /**
   * A usage query used to compute an insight value.
   *
   * @return usageQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GovernanceInsightUsageQuery getUsageQuery() {
    return usageQuery;
  }

  public void setUsageQuery(GovernanceInsightUsageQuery usageQuery) {
    this.usageQuery = usageQuery;
    if (usageQuery != null) {
      this.unparsed |= usageQuery.unparsed;
    }
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
   * @return GovernanceInsightAttributes
   */
  @JsonAnySetter
  public GovernanceInsightAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GovernanceInsightAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GovernanceInsightAttributes governanceInsightAttributes = (GovernanceInsightAttributes) o;
    return Objects.equals(this.auditQuery, governanceInsightAttributes.auditQuery)
        && Objects.equals(this.description, governanceInsightAttributes.description)
        && Objects.equals(this.displayName, governanceInsightAttributes.displayName)
        && Objects.equals(this.eventQuery, governanceInsightAttributes.eventQuery)
        && Objects.equals(this.metricQuery, governanceInsightAttributes.metricQuery)
        && Objects.equals(this.percentageQuery, governanceInsightAttributes.percentageQuery)
        && Objects.equals(this.product, governanceInsightAttributes.product)
        && Objects.equals(this.queryConfig, governanceInsightAttributes.queryConfig)
        && Objects.equals(this.subProduct, governanceInsightAttributes.subProduct)
        && Objects.equals(this.timeRange, governanceInsightAttributes.timeRange)
        && Objects.equals(this.unitName, governanceInsightAttributes.unitName)
        && Objects.equals(this.usageQuery, governanceInsightAttributes.usageQuery)
        && Objects.equals(
            this.additionalProperties, governanceInsightAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auditQuery,
        description,
        displayName,
        eventQuery,
        metricQuery,
        percentageQuery,
        product,
        queryConfig,
        subProduct,
        timeRange,
        unitName,
        usageQuery,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GovernanceInsightAttributes {\n");
    sb.append("    auditQuery: ").append(toIndentedString(auditQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    eventQuery: ").append(toIndentedString(eventQuery)).append("\n");
    sb.append("    metricQuery: ").append(toIndentedString(metricQuery)).append("\n");
    sb.append("    percentageQuery: ").append(toIndentedString(percentageQuery)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    queryConfig: ").append(toIndentedString(queryConfig)).append("\n");
    sb.append("    subProduct: ").append(toIndentedString(subProduct)).append("\n");
    sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    usageQuery: ").append(toIndentedString(usageQuery)).append("\n");
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
