/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.model;

import com.datadog.api.v1.client.JSON;
import com.datadog.api.v1.client.model.UsageBillableSummaryKeys;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response with monthly summary of data billed by Datadog.
 */
@ApiModel(description = "Response with monthly summary of data billed by Datadog.")
@JsonPropertyOrder(
    {
        UsageBillableSummaryHour.JSON_PROPERTY_BILLING_PLAN,
        UsageBillableSummaryHour.JSON_PROPERTY_END_DATE,
        UsageBillableSummaryHour.JSON_PROPERTY_NUM_ORGS,
        UsageBillableSummaryHour.JSON_PROPERTY_ORG_NAME,
        UsageBillableSummaryHour.JSON_PROPERTY_PUBLIC_ID,
        UsageBillableSummaryHour.JSON_PROPERTY_RATIO_IN_MONTH,
        UsageBillableSummaryHour.JSON_PROPERTY_START_DATE,
        UsageBillableSummaryHour.JSON_PROPERTY_USAGE
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageBillableSummaryHour {

    @JsonIgnore
    public boolean unparsed = false;

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
    private Long ratioInMonth;

    public static final String JSON_PROPERTY_START_DATE = "start_date";
    private OffsetDateTime startDate;

    public static final String JSON_PROPERTY_USAGE = "usage";
    private UsageBillableSummaryKeys usage;

    public UsageBillableSummaryHour billingPlan(String billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * The billing plan.
     * @return billingPlan
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The billing plan.")
    @JsonProperty(JSON_PROPERTY_BILLING_PLAN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Shows the last date of usage.
     * @return endDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Shows the last date of usage.")
    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * The number of organizations.
     * @return numOrgs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The number of organizations.")
    @JsonProperty(JSON_PROPERTY_NUM_ORGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * The organization name.
     * @return orgName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The organization name.")
    @JsonProperty(JSON_PROPERTY_ORG_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * The organization public ID.
     * @return publicId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The organization public ID.")
    @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public UsageBillableSummaryHour ratioInMonth(Long ratioInMonth) {
        this.ratioInMonth = ratioInMonth;
        return this;
    }

    /**
     * Shows usage aggregation for a billing period.
     * @return ratioInMonth
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Shows usage aggregation for a billing period.")
    @JsonProperty(JSON_PROPERTY_RATIO_IN_MONTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getRatioInMonth() {
        return ratioInMonth;
    }

    public void setRatioInMonth(Long ratioInMonth) {
        this.ratioInMonth = ratioInMonth;
    }

    public UsageBillableSummaryHour startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Shows the first date of usage.
     * @return startDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Shows the first date of usage.")
    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     * Get usage
     * @return usage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UsageBillableSummaryKeys getUsage() {
        return usage;
    }

    public void setUsage(UsageBillableSummaryKeys usage) {
        this.usage = usage;
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
        return (
            Objects.equals(this.billingPlan, usageBillableSummaryHour.billingPlan) &&
            Objects.equals(this.endDate, usageBillableSummaryHour.endDate) &&
            Objects.equals(this.numOrgs, usageBillableSummaryHour.numOrgs) &&
            Objects.equals(this.orgName, usageBillableSummaryHour.orgName) &&
            Objects.equals(this.publicId, usageBillableSummaryHour.publicId) &&
            Objects.equals(this.ratioInMonth, usageBillableSummaryHour.ratioInMonth) &&
            Objects.equals(this.startDate, usageBillableSummaryHour.startDate) &&
            Objects.equals(this.usage, usageBillableSummaryHour.usage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingPlan, endDate, numOrgs, orgName, publicId, ratioInMonth, startDate, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageBillableSummaryHour {\n");
        sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    numOrgs: ").append(toIndentedString(numOrgs)).append("\n");
        sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
        sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
        sb.append("    ratioInMonth: ").append(toIndentedString(ratioInMonth)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("}");
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
