/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY__QUERY_OPTIONS,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_CHANGE_TYPE,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_COMPARE_TO,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_INCREASE_GOOD,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_LIMIT,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_ORDER_BY,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_ORDER_DIR,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_Q,
  ChangeBackendRequest20270101OneOf4454622976.JSON_PROPERTY_SHOW_PRESENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeBackendRequest20270101OneOf4454622976 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY__QUERY_OPTIONS = "_query_options";
  private Map<String, DashboardInlineSchema8> QueryOptions = null;

  public static final String JSON_PROPERTY_CHANGE_TYPE = "change_type";
  private ChangeTypeOptions changeType;

  public static final String JSON_PROPERTY_COMPARE_TO = "compare_to";
  private CompareToOptions compareTo;

  public static final String JSON_PROPERTY_INCREASE_GOOD = "increase_good";
  private Boolean increaseGood;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Double limit;

  public static final String JSON_PROPERTY_ORDER_BY = "order_by";
  private OrderByOptions orderBy;

  public static final String JSON_PROPERTY_ORDER_DIR = "order_dir";
  private QuerySortOrder orderDir;

  public static final String JSON_PROPERTY_Q = "q";
  private String q;

  public static final String JSON_PROPERTY_SHOW_PRESENT = "show_present";
  private Boolean showPresent;

  public ChangeBackendRequest20270101OneOf4454622976() {}

  @JsonCreator
  public ChangeBackendRequest20270101OneOf4454622976(
      @JsonProperty(required = true, value = JSON_PROPERTY_Q) String q) {
    this.q = q;
  }

  public ChangeBackendRequest20270101OneOf4454622976 QueryOptions(
      Map<String, DashboardInlineSchema8> QueryOptions) {
    this.QueryOptions = QueryOptions;
    return this;
  }

  public ChangeBackendRequest20270101OneOf4454622976 putQueryOptionsItem(
      String key, DashboardInlineSchema8 QueryOptionsItem) {
    if (this.QueryOptions == null) {
      this.QueryOptions = new HashMap<>();
    }
    this.QueryOptions.put(key, QueryOptionsItem);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return QueryOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY__QUERY_OPTIONS)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, DashboardInlineSchema8> getQueryOptions() {
    return QueryOptions;
  }

  public void setQueryOptions(Map<String, DashboardInlineSchema8> QueryOptions) {
    this.QueryOptions = QueryOptions;
  }

  public ChangeBackendRequest20270101OneOf4454622976 changeType(ChangeTypeOptions changeType) {
    this.changeType = changeType;
    this.unparsed |= !changeType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return changeType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChangeTypeOptions getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeOptions changeType) {
    if (!changeType.isValid()) {
      this.unparsed = true;
    }
    this.changeType = changeType;
  }

  public ChangeBackendRequest20270101OneOf4454622976 compareTo(CompareToOptions compareTo) {
    this.compareTo = compareTo;
    this.unparsed |= !compareTo.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return compareTo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CompareToOptions getCompareTo() {
    return compareTo;
  }

  public void setCompareTo(CompareToOptions compareTo) {
    if (!compareTo.isValid()) {
      this.unparsed = true;
    }
    this.compareTo = compareTo;
  }

  public ChangeBackendRequest20270101OneOf4454622976 increaseGood(Boolean increaseGood) {
    this.increaseGood = increaseGood;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return increaseGood
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCREASE_GOOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncreaseGood() {
    return increaseGood;
  }

  public void setIncreaseGood(Boolean increaseGood) {
    this.increaseGood = increaseGood;
  }

  public ChangeBackendRequest20270101OneOf4454622976 limit(Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getLimit() {
    return limit;
  }

  public void setLimit(Double limit) {
    this.limit = limit;
  }

  public ChangeBackendRequest20270101OneOf4454622976 orderBy(OrderByOptions orderBy) {
    this.orderBy = orderBy;
    this.unparsed |= !orderBy.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrderByOptions getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(OrderByOptions orderBy) {
    if (!orderBy.isValid()) {
      this.unparsed = true;
    }
    this.orderBy = orderBy;
  }

  public ChangeBackendRequest20270101OneOf4454622976 orderDir(QuerySortOrder orderDir) {
    this.orderDir = orderDir;
    this.unparsed |= !orderDir.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return orderDir
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_DIR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public QuerySortOrder getOrderDir() {
    return orderDir;
  }

  public void setOrderDir(QuerySortOrder orderDir) {
    if (!orderDir.isValid()) {
      this.unparsed = true;
    }
    this.orderDir = orderDir;
  }

  public ChangeBackendRequest20270101OneOf4454622976 q(String q) {
    this.q = q;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return q
   */
  @JsonProperty(JSON_PROPERTY_Q)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQ() {
    return q;
  }

  public void setQ(String q) {
    this.q = q;
  }

  public ChangeBackendRequest20270101OneOf4454622976 showPresent(Boolean showPresent) {
    this.showPresent = showPresent;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return showPresent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOW_PRESENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getShowPresent() {
    return showPresent;
  }

  public void setShowPresent(Boolean showPresent) {
    this.showPresent = showPresent;
  }

  /** Return true if this ChangeBackendRequest20270101OneOf4454622976 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeBackendRequest20270101OneOf4454622976 changeBackendRequest20270101OneOf4454622976 =
        (ChangeBackendRequest20270101OneOf4454622976) o;
    return Objects.equals(
            this.QueryOptions, changeBackendRequest20270101OneOf4454622976.QueryOptions)
        && Objects.equals(this.changeType, changeBackendRequest20270101OneOf4454622976.changeType)
        && Objects.equals(this.compareTo, changeBackendRequest20270101OneOf4454622976.compareTo)
        && Objects.equals(
            this.increaseGood, changeBackendRequest20270101OneOf4454622976.increaseGood)
        && Objects.equals(this.limit, changeBackendRequest20270101OneOf4454622976.limit)
        && Objects.equals(this.orderBy, changeBackendRequest20270101OneOf4454622976.orderBy)
        && Objects.equals(this.orderDir, changeBackendRequest20270101OneOf4454622976.orderDir)
        && Objects.equals(this.q, changeBackendRequest20270101OneOf4454622976.q)
        && Objects.equals(
            this.showPresent, changeBackendRequest20270101OneOf4454622976.showPresent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        QueryOptions,
        changeType,
        compareTo,
        increaseGood,
        limit,
        orderBy,
        orderDir,
        q,
        showPresent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeBackendRequest20270101OneOf4454622976 {\n");
    sb.append("    QueryOptions: ").append(toIndentedString(QueryOptions)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    compareTo: ").append(toIndentedString(compareTo)).append("\n");
    sb.append("    increaseGood: ").append(toIndentedString(increaseGood)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    orderDir: ").append(toIndentedString(orderDir)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    showPresent: ").append(toIndentedString(showPresent)).append("\n");
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
