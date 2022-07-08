/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Object containing logs usage data broken down by retention period. */
@JsonPropertyOrder({
  LogsByRetention.JSON_PROPERTY_ORGS,
  LogsByRetention.JSON_PROPERTY_USAGE,
  LogsByRetention.JSON_PROPERTY_USAGE_BY_MONTH
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsByRetention {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ORGS = "orgs";
  private LogsByRetentionOrgs orgs;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<LogsRetentionAggSumUsage> usage = null;

  public static final String JSON_PROPERTY_USAGE_BY_MONTH = "usage_by_month";
  private LogsByRetentionMonthlyUsage usageByMonth;

  public LogsByRetention orgs(LogsByRetentionOrgs orgs) {
    this.orgs = orgs;
    this.unparsed |= orgs.unparsed;
    return this;
  }

  /**
   * Indexed logs usage summary for each organization for each retention period with usage.
   *
   * @return orgs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsByRetentionOrgs getOrgs() {
    return orgs;
  }

  public void setOrgs(LogsByRetentionOrgs orgs) {
    this.orgs = orgs;
  }

  public LogsByRetention usage(List<LogsRetentionAggSumUsage> usage) {
    this.usage = usage;
    for (LogsRetentionAggSumUsage item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LogsByRetention addUsageItem(LogsRetentionAggSumUsage usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * Aggregated index logs usage for each retention period with usage.
   *
   * @return usage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LogsRetentionAggSumUsage> getUsage() {
    return usage;
  }

  public void setUsage(List<LogsRetentionAggSumUsage> usage) {
    this.usage = usage;
  }

  public LogsByRetention usageByMonth(LogsByRetentionMonthlyUsage usageByMonth) {
    this.usageByMonth = usageByMonth;
    this.unparsed |= usageByMonth.unparsed;
    return this;
  }

  /**
   * Object containing a summary of indexed logs usage by retention period for a single month.
   *
   * @return usageByMonth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_BY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LogsByRetentionMonthlyUsage getUsageByMonth() {
    return usageByMonth;
  }

  public void setUsageByMonth(LogsByRetentionMonthlyUsage usageByMonth) {
    this.usageByMonth = usageByMonth;
  }

  /** Return true if this LogsByRetention object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsByRetention logsByRetention = (LogsByRetention) o;
    return Objects.equals(this.orgs, logsByRetention.orgs)
        && Objects.equals(this.usage, logsByRetention.usage)
        && Objects.equals(this.usageByMonth, logsByRetention.usageByMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgs, usage, usageByMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsByRetention {\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    usageByMonth: ").append(toIndentedString(usageByMonth)).append("\n");
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
