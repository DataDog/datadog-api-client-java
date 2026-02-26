/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Cost attributes data.</p>
 */
@JsonPropertyOrder({
  CostByOrgAttributes.JSON_PROPERTY_ACCOUNT_NAME,
  CostByOrgAttributes.JSON_PROPERTY_ACCOUNT_PUBLIC_ID,
  CostByOrgAttributes.JSON_PROPERTY_CHARGES,
  CostByOrgAttributes.JSON_PROPERTY_DATE,
  CostByOrgAttributes.JSON_PROPERTY_ORG_NAME,
  CostByOrgAttributes.JSON_PROPERTY_PUBLIC_ID,
  CostByOrgAttributes.JSON_PROPERTY_REGION,
  CostByOrgAttributes.JSON_PROPERTY_TOTAL_COST
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostByOrgAttributes {
  @JsonIgnore
  public boolean unparsed = false;
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

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TOTAL_COST = "total_cost";
  private Double totalCost;

  public CostByOrgAttributes accountName(String accountName) {
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
  public CostByOrgAttributes accountPublicId(String accountPublicId) {
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
  public CostByOrgAttributes charges(List<ChargebackBreakdown> charges) {
    this.charges = charges;
    for (ChargebackBreakdown item : charges) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CostByOrgAttributes addChargesItem(ChargebackBreakdown chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    this.unparsed |= chargesItem.unparsed;
    return this;
  }

  /**
   * <p>List of charges data reported for the requested month.</p>
   * @return charges
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHARGES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<ChargebackBreakdown> getCharges() {
        return charges;
      }
  public void setCharges(List<ChargebackBreakdown> charges) {
    this.charges = charges;
  }
  public CostByOrgAttributes date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * <p>The month requested.</p>
   * @return date
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getDate() {
        return date;
      }
  public void setDate(OffsetDateTime date) {
    this.date = date;
  }
  public CostByOrgAttributes orgName(String orgName) {
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
  public CostByOrgAttributes publicId(String publicId) {
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
  public CostByOrgAttributes region(String region) {
    this.region = region;
    return this;
  }

  /**
   * <p>The region of the Datadog instance that the organization belongs to.</p>
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
  public CostByOrgAttributes totalCost(Double totalCost) {
    this.totalCost = totalCost;
    return this;
  }

  /**
   * <p>The total cost of products for the month.</p>
   * @return totalCost
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_COST)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getTotalCost() {
        return totalCost;
      }
  public void setTotalCost(Double totalCost) {
    this.totalCost = totalCost;
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
   * @return CostByOrgAttributes
   */
  @JsonAnySetter
  public CostByOrgAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CostByOrgAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostByOrgAttributes costByOrgAttributes = (CostByOrgAttributes) o;
    return Objects.equals(this.accountName, costByOrgAttributes.accountName) && Objects.equals(this.accountPublicId, costByOrgAttributes.accountPublicId) && Objects.equals(this.charges, costByOrgAttributes.charges) && Objects.equals(this.date, costByOrgAttributes.date) && Objects.equals(this.orgName, costByOrgAttributes.orgName) && Objects.equals(this.publicId, costByOrgAttributes.publicId) && Objects.equals(this.region, costByOrgAttributes.region) && Objects.equals(this.totalCost, costByOrgAttributes.totalCost) && Objects.equals(this.additionalProperties, costByOrgAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(accountName,accountPublicId,charges,date,orgName,publicId,region,totalCost, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostByOrgAttributes {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPublicId: ").append(toIndentedString(accountPublicId)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
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
