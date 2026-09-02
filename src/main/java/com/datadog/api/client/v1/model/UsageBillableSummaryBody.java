/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Response with properties for each aggregated usage type.</p>
 */
@JsonPropertyOrder({
  UsageBillableSummaryBody.JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE,
  UsageBillableSummaryBody.JSON_PROPERTY_ACCOUNT_COMMITTED_USAGE,
  UsageBillableSummaryBody.JSON_PROPERTY_ACCOUNT_ON_DEMAND_USAGE,
  UsageBillableSummaryBody.JSON_PROPERTY_ELAPSED_USAGE_HOURS,
  UsageBillableSummaryBody.JSON_PROPERTY_FIRST_BILLABLE_USAGE_HOUR,
  UsageBillableSummaryBody.JSON_PROPERTY_LAST_BILLABLE_USAGE_HOUR,
  UsageBillableSummaryBody.JSON_PROPERTY_ORG_BILLABLE_USAGE,
  UsageBillableSummaryBody.JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT,
  UsageBillableSummaryBody.JSON_PROPERTY_USAGE_UNIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageBillableSummaryBody {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE = "account_billable_usage";
  private Long accountBillableUsage;

  public static final String JSON_PROPERTY_ACCOUNT_COMMITTED_USAGE = "account_committed_usage";
  private Long accountCommittedUsage;

  public static final String JSON_PROPERTY_ACCOUNT_ON_DEMAND_USAGE = "account_on_demand_usage";
  private Long accountOnDemandUsage;

  public static final String JSON_PROPERTY_ELAPSED_USAGE_HOURS = "elapsed_usage_hours";
  private Long elapsedUsageHours;

  public static final String JSON_PROPERTY_FIRST_BILLABLE_USAGE_HOUR = "first_billable_usage_hour";
  private OffsetDateTime firstBillableUsageHour;

  public static final String JSON_PROPERTY_LAST_BILLABLE_USAGE_HOUR = "last_billable_usage_hour";
  private OffsetDateTime lastBillableUsageHour;

  public static final String JSON_PROPERTY_ORG_BILLABLE_USAGE = "org_billable_usage";
  private Long orgBillableUsage;

  public static final String JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT = "percentage_in_account";
  private Double percentageInAccount;

  public static final String JSON_PROPERTY_USAGE_UNIT = "usage_unit";
  private String usageUnit;

  public UsageBillableSummaryBody accountBillableUsage(Long accountBillableUsage) {
    this.accountBillableUsage = accountBillableUsage;
    return this;
  }

  /**
   * <p>The total account usage.</p>
   * @return accountBillableUsage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_BILLABLE_USAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getAccountBillableUsage() {
        return accountBillableUsage;
      }
  public void setAccountBillableUsage(Long accountBillableUsage) {
    this.accountBillableUsage = accountBillableUsage;
  }
  public UsageBillableSummaryBody accountCommittedUsage(Long accountCommittedUsage) {
    this.accountCommittedUsage = accountCommittedUsage;
    return this;
  }

  /**
   * <p>The total account committed usage.</p>
   * @return accountCommittedUsage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_COMMITTED_USAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getAccountCommittedUsage() {
        return accountCommittedUsage;
      }
  public void setAccountCommittedUsage(Long accountCommittedUsage) {
    this.accountCommittedUsage = accountCommittedUsage;
  }
  public UsageBillableSummaryBody accountOnDemandUsage(Long accountOnDemandUsage) {
    this.accountOnDemandUsage = accountOnDemandUsage;
    return this;
  }

  /**
   * <p>The total account on-demand usage.</p>
   * @return accountOnDemandUsage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_ON_DEMAND_USAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getAccountOnDemandUsage() {
        return accountOnDemandUsage;
      }
  public void setAccountOnDemandUsage(Long accountOnDemandUsage) {
    this.accountOnDemandUsage = accountOnDemandUsage;
  }
  public UsageBillableSummaryBody elapsedUsageHours(Long elapsedUsageHours) {
    this.elapsedUsageHours = elapsedUsageHours;
    return this;
  }

  /**
   * <p>Elapsed usage hours for some billable product.</p>
   * @return elapsedUsageHours
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELAPSED_USAGE_HOURS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getElapsedUsageHours() {
        return elapsedUsageHours;
      }
  public void setElapsedUsageHours(Long elapsedUsageHours) {
    this.elapsedUsageHours = elapsedUsageHours;
  }
  public UsageBillableSummaryBody firstBillableUsageHour(OffsetDateTime firstBillableUsageHour) {
    this.firstBillableUsageHour = firstBillableUsageHour;
    return this;
  }

  /**
   * <p>The first billable hour for the org.</p>
   * @return firstBillableUsageHour
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FIRST_BILLABLE_USAGE_HOUR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The last billable hour for the org.</p>
   * @return lastBillableUsageHour
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_BILLABLE_USAGE_HOUR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getLastBillableUsageHour() {
        return lastBillableUsageHour;
      }
  public void setLastBillableUsageHour(OffsetDateTime lastBillableUsageHour) {
    this.lastBillableUsageHour = lastBillableUsageHour;
  }
  public UsageBillableSummaryBody orgBillableUsage(Long orgBillableUsage) {
    this.orgBillableUsage = orgBillableUsage;
    return this;
  }

  /**
   * <p>The number of units used within the billable timeframe.</p>
   * @return orgBillableUsage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_BILLABLE_USAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrgBillableUsage() {
        return orgBillableUsage;
      }
  public void setOrgBillableUsage(Long orgBillableUsage) {
    this.orgBillableUsage = orgBillableUsage;
  }
  public UsageBillableSummaryBody percentageInAccount(Double percentageInAccount) {
    this.percentageInAccount = percentageInAccount;
    return this;
  }

  /**
   * <p>The percentage of account usage the org represents.</p>
   * @return percentageInAccount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PERCENTAGE_IN_ACCOUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getPercentageInAccount() {
        return percentageInAccount;
      }
  public void setPercentageInAccount(Double percentageInAccount) {
    this.percentageInAccount = percentageInAccount;
  }
  public UsageBillableSummaryBody usageUnit(String usageUnit) {
    this.usageUnit = usageUnit;
    return this;
  }

  /**
   * <p>Units pertaining to the usage.</p>
   * @return usageUnit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USAGE_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUsageUnit() {
        return usageUnit;
      }
  public void setUsageUnit(String usageUnit) {
    this.usageUnit = usageUnit;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return UsageBillableSummaryBody
   */
  @JsonAnySetter
  public UsageBillableSummaryBody putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this UsageBillableSummaryBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageBillableSummaryBody usageBillableSummaryBody = (UsageBillableSummaryBody) o;
    return Objects.equals(this.accountBillableUsage, usageBillableSummaryBody.accountBillableUsage) && Objects.equals(this.accountCommittedUsage, usageBillableSummaryBody.accountCommittedUsage) && Objects.equals(this.accountOnDemandUsage, usageBillableSummaryBody.accountOnDemandUsage) && Objects.equals(this.elapsedUsageHours, usageBillableSummaryBody.elapsedUsageHours) && Objects.equals(this.firstBillableUsageHour, usageBillableSummaryBody.firstBillableUsageHour) && Objects.equals(this.lastBillableUsageHour, usageBillableSummaryBody.lastBillableUsageHour) && Objects.equals(this.orgBillableUsage, usageBillableSummaryBody.orgBillableUsage) && Objects.equals(this.percentageInAccount, usageBillableSummaryBody.percentageInAccount) && Objects.equals(this.usageUnit, usageBillableSummaryBody.usageUnit) && Objects.equals(this.additionalProperties, usageBillableSummaryBody.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountBillableUsage,accountCommittedUsage,accountOnDemandUsage,elapsedUsageHours,firstBillableUsageHour,lastBillableUsageHour,orgBillableUsage,percentageInAccount,usageUnit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBillableSummaryBody {\n");
    sb.append("    accountBillableUsage: ").append(toIndentedString(accountBillableUsage)).append("\n");
    sb.append("    accountCommittedUsage: ").append(toIndentedString(accountCommittedUsage)).append("\n");
    sb.append("    accountOnDemandUsage: ").append(toIndentedString(accountOnDemandUsage)).append("\n");
    sb.append("    elapsedUsageHours: ").append(toIndentedString(elapsedUsageHours)).append("\n");
    sb.append("    firstBillableUsageHour: ").append(toIndentedString(firstBillableUsageHour)).append("\n");
    sb.append("    lastBillableUsageHour: ").append(toIndentedString(lastBillableUsageHour)).append("\n");
    sb.append("    orgBillableUsage: ").append(toIndentedString(orgBillableUsage)).append("\n");
    sb.append("    percentageInAccount: ").append(toIndentedString(percentageInAccount)).append("\n");
    sb.append("    usageUnit: ").append(toIndentedString(usageUnit)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
