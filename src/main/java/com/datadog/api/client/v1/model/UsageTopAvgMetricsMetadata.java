/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.Objects;

/** The object containing document metadata. */
@JsonPropertyOrder({
  UsageTopAvgMetricsMetadata.JSON_PROPERTY_DAY,
  UsageTopAvgMetricsMetadata.JSON_PROPERTY_MONTH,
  UsageTopAvgMetricsMetadata.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageTopAvgMetricsMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DAY = "day";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime day;

  public static final String JSON_PROPERTY_MONTH = "month";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime month;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private UsageTopAvgMetricsPagination pagination;

  public UsageTopAvgMetricsMetadata day(OffsetDateTime day) {
    this.day = day;
    return this;
  }

  /**
   * The day value from the user request that contains the returned usage data. (If day was used the
   * request)
   *
   * @return day
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDay() {
    return day;
  }

  public void setDay(OffsetDateTime day) {
    this.day = day;
  }

  public UsageTopAvgMetricsMetadata month(OffsetDateTime month) {
    this.month = month;
    return this;
  }

  /**
   * The month value from the user request that contains the returned usage data. (If month was used
   * the request)
   *
   * @return month
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getMonth() {
    return month;
  }

  public void setMonth(OffsetDateTime month) {
    this.month = month;
  }

  public UsageTopAvgMetricsMetadata pagination(UsageTopAvgMetricsPagination pagination) {
    this.pagination = pagination;
    this.unparsed |= pagination.unparsed;
    return this;
  }

  /**
   * The metadata for the current pagination.
   *
   * @return pagination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageTopAvgMetricsPagination getPagination() {
    return pagination;
  }

  public void setPagination(UsageTopAvgMetricsPagination pagination) {
    this.pagination = pagination;
  }

  /** Return true if this UsageTopAvgMetricsMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTopAvgMetricsMetadata usageTopAvgMetricsMetadata = (UsageTopAvgMetricsMetadata) o;
    return Objects.equals(this.day, usageTopAvgMetricsMetadata.day)
        && Objects.equals(this.month, usageTopAvgMetricsMetadata.month)
        && Objects.equals(this.pagination, usageTopAvgMetricsMetadata.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, month, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTopAvgMetricsMetadata {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("}");
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
