/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Projected Cost attributes data. */
@JsonPropertyOrder({
  ProjectedCostAttributes.JSON_PROPERTY_ACCOUNT_NAME,
  ProjectedCostAttributes.JSON_PROPERTY_ACCOUNT_PUBLIC_ID,
  ProjectedCostAttributes.JSON_PROPERTY_CHARGES,
  ProjectedCostAttributes.JSON_PROPERTY_DATE,
  ProjectedCostAttributes.JSON_PROPERTY_ORG_NAME,
  ProjectedCostAttributes.JSON_PROPERTY_PROJECTED_TOTAL_COST,
  ProjectedCostAttributes.JSON_PROPERTY_PUBLIC_ID,
  ProjectedCostAttributes.JSON_PROPERTY_REGION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProjectedCostAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_NAME = "account_name";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_PUBLIC_ID = "account_public_id";
  private String accountPublicId;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<ChargebackBreakdown> charges = null;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PROJECTED_TOTAL_COST = "projected_total_cost";
  private Double projectedTotalCost;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public ProjectedCostAttributes accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The account name.
   *
   * @return accountName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public ProjectedCostAttributes accountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
    return this;
  }

  /**
   * The account public ID.
   *
   * @return accountPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountPublicId() {
    return accountPublicId;
  }

  public void setAccountPublicId(String accountPublicId) {
    this.accountPublicId = accountPublicId;
  }

  public ProjectedCostAttributes charges(List<ChargebackBreakdown> charges) {
    this.charges = charges;
    for (ChargebackBreakdown item : charges) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ProjectedCostAttributes addChargesItem(ChargebackBreakdown chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    this.unparsed |= chargesItem.unparsed;
    return this;
  }

  /**
   * List of charges data reported for the requested month.
   *
   * @return charges
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ChargebackBreakdown> getCharges() {
    return charges;
  }

  public void setCharges(List<ChargebackBreakdown> charges) {
    this.charges = charges;
  }

  public ProjectedCostAttributes date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * The month requested.
   *
   * @return date
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ProjectedCostAttributes orgName(String orgName) {
    this.orgName = orgName;
    return this;
  }

  /**
   * The organization name.
   *
   * @return orgName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public ProjectedCostAttributes projectedTotalCost(Double projectedTotalCost) {
    this.projectedTotalCost = projectedTotalCost;
    return this;
  }

  /**
   * The total projected cost of products for the month.
   *
   * @return projectedTotalCost
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROJECTED_TOTAL_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getProjectedTotalCost() {
    return projectedTotalCost;
  }

  public void setProjectedTotalCost(Double projectedTotalCost) {
    this.projectedTotalCost = projectedTotalCost;
  }

  public ProjectedCostAttributes publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The organization public ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public ProjectedCostAttributes region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region of the Datadog instance that the organization belongs to.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
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
   * @return ProjectedCostAttributes
   */
  @JsonAnySetter
  public ProjectedCostAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProjectedCostAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectedCostAttributes projectedCostAttributes = (ProjectedCostAttributes) o;
    return Objects.equals(this.accountName, projectedCostAttributes.accountName)
        && Objects.equals(this.accountPublicId, projectedCostAttributes.accountPublicId)
        && Objects.equals(this.charges, projectedCostAttributes.charges)
        && Objects.equals(this.date, projectedCostAttributes.date)
        && Objects.equals(this.orgName, projectedCostAttributes.orgName)
        && Objects.equals(this.projectedTotalCost, projectedCostAttributes.projectedTotalCost)
        && Objects.equals(this.publicId, projectedCostAttributes.publicId)
        && Objects.equals(this.region, projectedCostAttributes.region)
        && Objects.equals(this.additionalProperties, projectedCostAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountName,
        accountPublicId,
        charges,
        date,
        orgName,
        projectedTotalCost,
        publicId,
        region,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectedCostAttributes {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPublicId: ").append(toIndentedString(accountPublicId)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    projectedTotalCost: ").append(toIndentedString(projectedTotalCost)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
