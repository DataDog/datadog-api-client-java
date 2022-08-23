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
  CostByOrgAttributes.JSON_PROPERTY_CHARGES,
  CostByOrgAttributes.JSON_PROPERTY_DATE,
  CostByOrgAttributes.JSON_PROPERTY_ORG_NAME,
  CostByOrgAttributes.JSON_PROPERTY_PUBLIC_ID,
  CostByOrgAttributes.JSON_PROPERTY_TOTAL_COST
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostByOrgAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<ChargebackBreakdown> charges = null;

  public static final String JSON_PROPERTY_DATE = "date";
  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ORG_NAME = "org_name";
  private String orgName;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TOTAL_COST = "total_cost";
  private Double totalCost;

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
    return Objects.equals(this.charges, costByOrgAttributes.charges) && Objects.equals(this.date, costByOrgAttributes.date) && Objects.equals(this.orgName, costByOrgAttributes.orgName) && Objects.equals(this.publicId, costByOrgAttributes.publicId) && Objects.equals(this.totalCost, costByOrgAttributes.totalCost);
  }


  @Override
  public int hashCode() {
    return Objects.hash(charges,date,orgName,publicId,totalCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostByOrgAttributes {\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    orgName: ").append(toIndentedString(orgName)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    totalCost: ").append(toIndentedString(totalCost)).append("\n");
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
