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
   * <p>Response with monthly summary of data billed by Datadog.</p>
 */
@JsonPropertyOrder({
  UsageBillableSummaryHour.JSON_PROPERTY_ACCOUNT_NAME,
  UsageBillableSummaryHour.JSON_PROPERTY_ACCOUNT_PUBLIC_ID,
  UsageBillableSummaryHour.JSON_PROPERTY_BILLING_PLAN,
  UsageBillableSummaryHour.JSON_PROPERTY_END_DATE,
  UsageBillableSummaryHour.JSON_PROPERTY_NUM_ORGS,
  UsageBillableSummaryHour.JSON_PROPERTY_ORG_NAME,
  UsageBillableSummaryHour.JSON_PROPERTY_PUBLIC_ID,
  UsageBillableSummaryHour.JSON_PROPERTY_RATIO_IN_MONTH,
  UsageBillableSummaryHour.JSON_PROPERTY_REGION,
  UsageBillableSummaryHour.JSON_PROPERTY_START_DATE,
  UsageBillableSummaryHour.JSON_PROPERTY_USAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageBillableSummaryHour {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_PUBLIC_ID = "account_public_id";
  private String accountPublicId;

  public static final String JSON_PROPERTY_BILLING_PLAN = "billing_plan";
  private String billingPlan;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_NUM_ORGS = "num_orgs";
  private Long numOrgs;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_RATIO_IN_MONTH = "ratio_in_month";
  private Double ratioInMonth;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private UsageBillableSummaryKeys usage;

  public UsageBillableSummaryHour accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * <p>The account name.</p>
   * @return accountName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccountName() {
        return accountName;
      }
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }
  public UsageBillableSummaryHour accountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
    return this;
  }

  /**
   * <p>The account public ID.</p>
   * @return accountPublicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ACCOUNT_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAccountPublicId() {
        return accountPublicId;
      }
  public void setAccountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
  }
  public UsageBillableSummaryHour billingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

  /**
   * <p>The billing plan.</p>
   * @return billingPlan
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BILLING_PLAN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getBillingPlan() {
        return billingPlan;
      }
  public void setBillingPlan(String billingPlan) {
    this.billingPlan = billingPlan;
  }
  public UsageBillableSummaryHour endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <p>Shows the last date of usage.</p>
   * @return endDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getEndDate() {
        return endDate;
      }
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }
  public UsageBillableSummaryHour numOrgs(Long numOrgs) {
    this.numOrgs = numOrgs;
    return this;
  }

  /**
   * <p>The number of organizations.</p>
   * @return numOrgs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NUM_ORGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNumOrgs() {
        return numOrgs;
      }
  public void setNumOrgs(Long numOrgs) {
    this.numOrgs = numOrgs;
  }
  public UsageBillableSummaryHour orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * <p>The organization name.</p>
   * @return orgName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getOrgName() {
        return orgName;
      }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }
  public UsageBillableSummaryHour publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The organization public ID.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }
  public UsageBillableSummaryHour ratioInMonth(Double ratioInMonth) {
    this.ratioInMonth = ratioInMonth;
    return this;
  }

  /**
   * <p>Shows usage aggregation for a billing period.</p>
   * @return ratioInMonth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RATIO_IN_MONTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getRatioInMonth() {
        return ratioInMonth;
      }
  public void setRatioInMonth(Double ratioInMonth) {
    this.ratioInMonth = ratioInMonth;
  }
  public UsageBillableSummaryHour region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>The region of the organization.</p>
   * @return region
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRegion() {
        return region;
      }
  public void setRegion(String region) {
    this.region = region;
  }
  public UsageBillableSummaryHour startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <p>Shows the first date of usage.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getStartDate() {
        return startDate;
      }
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }
  public UsageBillableSummaryHour usage(UsageBillableSummaryKeys usage) {
    this.usage = usage;
    this.unparsed |= usage.unparsed;
    return this;
  }

  /**
   * <p>Response with aggregated usage types.</p>
   * @return usage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageBillableSummaryKeys getUsage() {
        return usage;
      }
  public void setUsage(UsageBillableSummaryKeys usage) {
    this.usage = usage;
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
   * @return UsageBillableSummaryHour
   */
  @JsonAnySetter
  public UsageBillableSummaryHour putAdditionalProperty(String key, Object value) {
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
   * Return true if this UsageBillableSummaryHour object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageBillableSummaryHour usageBillableSummaryHour = (UsageBillableSummaryHour) o;
    return Objects.equals(this.accountName, usageBillableSummaryHour.accountName) && Objects.equals(this.accountPublicId, usageBillableSummaryHour.accountPublicId) && Objects.equals(this.billingPlan, usageBillableSummaryHour.billingPlan) && Objects.equals(this.endDate, usageBillableSummaryHour.endDate) && Objects.equals(this.numOrgs, usageBillableSummaryHour.numOrgs) && Objects.equals(this.orgName, usageBillableSummaryHour.orgName) && Objects.equals(this.publicId, usageBillableSummaryHour.publicId) && Objects.equals(this.ratioInMonth, usageBillableSummaryHour.ratioInMonth) && Objects.equals(this.region, usageBillableSummaryHour.region) && Objects.equals(this.startDate, usageBillableSummaryHour.startDate) && Objects.equals(this.usage, usageBillableSummaryHour.usage) && Objects.equals(this.additionalProperties, usageBillableSummaryHour.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountName,accountPublicId,billingPlan,endDate,numOrgs,orgName,publicId,ratioInMonth,region,startDate,usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBillableSummaryHour {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPublicId: ").append(toIndentedString(accountPublicId)).append("\n");
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    numOrgs: ").append(toIndentedString(numOrgs)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    ratioInMonth: ").append(toIndentedString(ratioInMonth)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
