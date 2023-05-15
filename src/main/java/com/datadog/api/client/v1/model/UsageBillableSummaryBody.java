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
import org.openapitools.jackson.nullable.JsonNullable;

/** Response with properties for each aggregated usage type. */
@JsonPropertyOrder({
  UsageBillableSummaryBody.JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE,
  UsageBillableSummaryBody.JSON_PROPERTY_ELAPSED_USAGE_HOURS,
  UsageBillableSummaryBody.JSON_PROPERTY_FIRST_BILLABLE_USAGE_HOUR,
  UsageBillableSummaryBody.JSON_PROPERTY_LAST_BILLABLE_USAGE_HOUR,
  UsageBillableSummaryBody.JSON_PROPERTY_ORG_BILLABLE_USAGE,
  UsageBillableSummaryBody.JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT,
  UsageBillableSummaryBody.JSON_PROPERTY_USAGE_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageBillableSummaryBody {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE = "account_billable_usage";
  private JsonNullable<Long> accountBillableUsage = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_ELAPSED_USAGE_HOURS = "elapsed_usage_hours";
  private JsonNullable<Long> elapsedUsageHours = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_FIRST_BILLABLE_USAGE_HOUR = "first_billable_usage_hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime firstBillableUsageHour;

  public static final String JSON_PROPERTY_LAST_BILLABLE_USAGE_HOUR = "last_billable_usage_hour";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime lastBillableUsageHour;

  public static final String JSON_PROPERTY_ORG_BILLABLE_USAGE = "org_billable_usage";
  private JsonNullable<Long> orgBillableUsage = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT = "percentage_in_account";
  private JsonNullable<Double> percentageInAccount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_USAGE_UNIT = "usage_unit";
  private String usageUnit;

  public UsageBillableSummaryBody accountBillableUsage(Long accountBillableUsage) {
    this.accountBillableUsage = JsonNullable.<Long>of(accountBillableUsage);
    return this;
  }

  /**
   * The total account usage.
   *
   * @return accountBillableUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getAccountBillableUsage() {
    return accountBillableUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getAccountBillableUsage_JsonNullable() {
    return accountBillableUsage;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE)
  public void setAccountBillableUsage_JsonNullable(JsonNullable<Long> accountBillableUsage) {
    this.accountBillableUsage = accountBillableUsage;
  }

  public void setAccountBillableUsage(Long accountBillableUsage) {
    this.accountBillableUsage = JsonNullable.<Long>of(accountBillableUsage);
  }

  public UsageBillableSummaryBody elapsedUsageHours(Long elapsedUsageHours) {
    this.elapsedUsageHours = JsonNullable.<Long>of(elapsedUsageHours);
    return this;
  }

  /**
   * Elapsed usage hours for some billable product.
   *
   * @return elapsedUsageHours
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getElapsedUsageHours() {
    return elapsedUsageHours.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ELAPSED_USAGE_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getElapsedUsageHours_JsonNullable() {
    return elapsedUsageHours;
  }

  @JsonProperty(JSON_PROPERTY_ELAPSED_USAGE_HOURS)
  public void setElapsedUsageHours_JsonNullable(JsonNullable<Long> elapsedUsageHours) {
    this.elapsedUsageHours = elapsedUsageHours;
  }

  public void setElapsedUsageHours(Long elapsedUsageHours) {
    this.elapsedUsageHours = JsonNullable.<Long>of(elapsedUsageHours);
  }

  public UsageBillableSummaryBody firstBillableUsageHour(OffsetDateTime firstBillableUsageHour) {
    this.firstBillableUsageHour = firstBillableUsageHour;
    return this;
  }

  /**
   * The first billable hour for the org.
   *
   * @return firstBillableUsageHour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_BILLABLE_USAGE_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFirstBillableUsageHour() {
    return firstBillableUsageHour;
  }

  public void setFirstBillableUsageHour(OffsetDateTime firstBillableUsageHour) {
    this.firstBillableUsageHour = firstBillableUsageHour;
  }

  public UsageBillableSummaryBody lastBillableUsageHour(OffsetDateTime lastBillableUsageHour) {
    this.lastBillableUsageHour = lastBillableUsageHour;
    return this;
  }

  /**
   * The last billable hour for the org.
   *
   * @return lastBillableUsageHour
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_BILLABLE_USAGE_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastBillableUsageHour() {
    return lastBillableUsageHour;
  }

  public void setLastBillableUsageHour(OffsetDateTime lastBillableUsageHour) {
    this.lastBillableUsageHour = lastBillableUsageHour;
  }

  public UsageBillableSummaryBody orgBillableUsage(Long orgBillableUsage) {
    this.orgBillableUsage = JsonNullable.<Long>of(orgBillableUsage);
    return this;
  }

  /**
   * The number of units used within the billable timeframe.
   *
   * @return orgBillableUsage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getOrgBillableUsage() {
    return orgBillableUsage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORG_BILLABLE_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getOrgBillableUsage_JsonNullable() {
    return orgBillableUsage;
  }

  @JsonProperty(JSON_PROPERTY_ORG_BILLABLE_USAGE)
  public void setOrgBillableUsage_JsonNullable(JsonNullable<Long> orgBillableUsage) {
    this.orgBillableUsage = orgBillableUsage;
  }

  public void setOrgBillableUsage(Long orgBillableUsage) {
    this.orgBillableUsage = JsonNullable.<Long>of(orgBillableUsage);
  }

  public UsageBillableSummaryBody percentageInAccount(Double percentageInAccount) {
    this.percentageInAccount = JsonNullable.<Double>of(percentageInAccount);
    return this;
  }

  /**
   * The percentage of account usage the org represents.
   *
   * @return percentageInAccount
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getPercentageInAccount() {
    return percentageInAccount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPercentageInAccount_JsonNullable() {
    return percentageInAccount;
  }

  @JsonProperty(JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT)
  public void setPercentageInAccount_JsonNullable(JsonNullable<Double> percentageInAccount) {
    this.percentageInAccount = percentageInAccount;
  }

  public void setPercentageInAccount(Double percentageInAccount) {
    this.percentageInAccount = JsonNullable.<Double>of(percentageInAccount);
  }

  public UsageBillableSummaryBody usageUnit(String usageUnit) {
    this.usageUnit = usageUnit;
    return this;
  }

  /**
   * Units pertaining to the usage.
   *
   * @return usageUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUsageUnit() {
    return usageUnit;
  }

  public void setUsageUnit(String usageUnit) {
    this.usageUnit = usageUnit;
  }

  /** Return true if this UsageBillableSummaryBody object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageBillableSummaryBody usageBillableSummaryBody = (UsageBillableSummaryBody) o;
    return Objects.equals(this.accountBillableUsage, usageBillableSummaryBody.accountBillableUsage)
        && Objects.equals(this.elapsedUsageHours, usageBillableSummaryBody.elapsedUsageHours)
        && Objects.equals(
            this.firstBillableUsageHour, usageBillableSummaryBody.firstBillableUsageHour)
        && Objects.equals(
            this.lastBillableUsageHour, usageBillableSummaryBody.lastBillableUsageHour)
        && Objects.equals(this.orgBillableUsage, usageBillableSummaryBody.orgBillableUsage)
        && Objects.equals(this.percentageInAccount, usageBillableSummaryBody.percentageInAccount)
        && Objects.equals(this.usageUnit, usageBillableSummaryBody.usageUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountBillableUsage,
        elapsedUsageHours,
        firstBillableUsageHour,
        lastBillableUsageHour,
        orgBillableUsage,
        percentageInAccount,
        usageUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBillableSummaryBody {\n");
    sb.append("    accountBillableUsage: ")
        .append(toIndentedString(accountBillableUsage))
        .append("\n");
    sb.append("    elapsedUsageHours: ").append(toIndentedString(elapsedUsageHours)).append("\n");
    sb.append("    firstBillableUsageHour: ")
        .append(toIndentedString(firstBillableUsageHour))
        .append("\n");
    sb.append("    lastBillableUsageHour: ")
        .append(toIndentedString(lastBillableUsageHour))
        .append("\n");
    sb.append("    orgBillableUsage: ").append(toIndentedString(orgBillableUsage)).append("\n");
    sb.append("    percentageInAccount: ")
        .append(toIndentedString(percentageInAccount))
        .append("\n");
    sb.append("    usageUnit: ").append(toIndentedString(usageUnit)).append("\n");
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
