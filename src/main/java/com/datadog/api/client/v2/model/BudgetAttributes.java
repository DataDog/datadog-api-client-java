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
   * <p>The attributes of a budget.</p>
 */
@JsonPropertyOrder({
  BudgetAttributes.JSON_PROPERTY_COSTS,
  BudgetAttributes.JSON_PROPERTY_COSTS_PERIOD_END,
  BudgetAttributes.JSON_PROPERTY_COSTS_PERIOD_START,
  BudgetAttributes.JSON_PROPERTY_COSTS_UNIT,
  BudgetAttributes.JSON_PROPERTY_CREATED_AT,
  BudgetAttributes.JSON_PROPERTY_CREATED_BY,
  BudgetAttributes.JSON_PROPERTY_END_MONTH,
  BudgetAttributes.JSON_PROPERTY_ENTRIES,
  BudgetAttributes.JSON_PROPERTY_METRICS_QUERY,
  BudgetAttributes.JSON_PROPERTY_NAME,
  BudgetAttributes.JSON_PROPERTY_ORG_ID,
  BudgetAttributes.JSON_PROPERTY_START_MONTH,
  BudgetAttributes.JSON_PROPERTY_TOTAL_AMOUNT,
  BudgetAttributes.JSON_PROPERTY_UPDATED_AT,
  BudgetAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COSTS = "costs";
  private BudgetAttributesCosts costs;

  public static final String JSON_PROPERTY_COSTS_PERIOD_END = "costs_period_end";
  private Long costsPeriodEnd;

  public static final String JSON_PROPERTY_COSTS_PERIOD_START = "costs_period_start";
  private Long costsPeriodStart;

  public static final String JSON_PROPERTY_COSTS_UNIT = "costs_unit";
  private BudgetAttributesCostsUnit costsUnit;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_END_MONTH = "end_month";
  private Long endMonth;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<BudgetWithEntriesDataAttributesEntriesItems> entries = null;

  public static final String JSON_PROPERTY_METRICS_QUERY = "metrics_query";
  private String metricsQuery;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_START_MONTH = "start_month";
  private Long startMonth;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "total_amount";
  private Double totalAmount;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public BudgetAttributes costs(BudgetAttributesCosts costs) {
    this.costs = costs;
    this.unparsed |= costs.unparsed;
    return this;
  }

  /**
   * <p>Aggregated cost data for the budget over the requested period.</p>
   * @return costs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COSTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public BudgetAttributesCosts getCosts() {
        return costs;
      }
  public void setCosts(BudgetAttributesCosts costs) {
    this.costs = costs;
    if (costs != null) {
      this.unparsed |= costs.unparsed;
    }
  }
  public BudgetAttributes costsPeriodEnd(Long costsPeriodEnd) {
    this.costsPeriodEnd = costsPeriodEnd;
    return this;
  }

  /**
   * <p>The end of the period used to compute cost data, in milliseconds since epoch.</p>
   * @return costsPeriodEnd
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COSTS_PERIOD_END)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCostsPeriodEnd() {
        return costsPeriodEnd;
      }
  public void setCostsPeriodEnd(Long costsPeriodEnd) {
    this.costsPeriodEnd = costsPeriodEnd;
  }
  public BudgetAttributes costsPeriodStart(Long costsPeriodStart) {
    this.costsPeriodStart = costsPeriodStart;
    return this;
  }

  /**
   * <p>The start of the period used to compute cost data, in milliseconds since epoch.</p>
   * @return costsPeriodStart
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COSTS_PERIOD_START)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCostsPeriodStart() {
        return costsPeriodStart;
      }
  public void setCostsPeriodStart(Long costsPeriodStart) {
    this.costsPeriodStart = costsPeriodStart;
  }
  public BudgetAttributes costsUnit(BudgetAttributesCostsUnit costsUnit) {
    this.costsUnit = costsUnit;
    this.unparsed |= costsUnit.unparsed;
    return this;
  }

  /**
   * <p>The unit used for all cost values in the response.</p>
   * @return costsUnit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COSTS_UNIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public BudgetAttributesCostsUnit getCostsUnit() {
        return costsUnit;
      }
  public void setCostsUnit(BudgetAttributesCostsUnit costsUnit) {
    this.costsUnit = costsUnit;
    if (costsUnit != null) {
      this.unparsed |= costsUnit.unparsed;
    }
  }
  public BudgetAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The timestamp when the budget was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  public BudgetAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>The id of the user that created the budget.</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public BudgetAttributes endMonth(Long endMonth) {
    this.endMonth = endMonth;
    return this;
  }

  /**
   * <p>The month when the budget ends.</p>
   * @return endMonth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_MONTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEndMonth() {
        return endMonth;
      }
  public void setEndMonth(Long endMonth) {
    this.endMonth = endMonth;
  }
  public BudgetAttributes entries(List<BudgetWithEntriesDataAttributesEntriesItems> entries) {
    this.entries = entries;
    if (entries != null) {
    for (BudgetWithEntriesDataAttributesEntriesItems item : entries) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public BudgetAttributes addEntriesItem(BudgetWithEntriesDataAttributesEntriesItems entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    this.unparsed |= entriesItem.unparsed;
    return this;
  }

  /**
   * <p>The list of monthly budget entries.</p>
   * @return entries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENTRIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<BudgetWithEntriesDataAttributesEntriesItems> getEntries() {
        return entries;
      }
  public void setEntries(List<BudgetWithEntriesDataAttributesEntriesItems> entries) {
    this.entries = entries;
    if (entries != null) {
      for (BudgetWithEntriesDataAttributesEntriesItems item : entries) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public BudgetAttributes metricsQuery(String metricsQuery) {
    this.metricsQuery = metricsQuery;
    return this;
  }

  /**
   * <p>The cost query used to track against the budget.</p>
   * @return metricsQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METRICS_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMetricsQuery() {
        return metricsQuery;
      }
  public void setMetricsQuery(String metricsQuery) {
    this.metricsQuery = metricsQuery;
  }
  public BudgetAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the budget.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public BudgetAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>The id of the org the budget belongs to.</p>
   * @return orgId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getOrgId() {
        return orgId;
      }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }
  public BudgetAttributes startMonth(Long startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  /**
   * <p>The month when the budget starts.</p>
   * @return startMonth
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_MONTH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStartMonth() {
        return startMonth;
      }
  public void setStartMonth(Long startMonth) {
    this.startMonth = startMonth;
  }
  public BudgetAttributes totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * <p>The sum of all budget entries' amounts.</p>
   * @return totalAmount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getTotalAmount() {
        return totalAmount;
      }
  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }
  public BudgetAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>The timestamp when the budget was last updated.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }
  public BudgetAttributes updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>The id of the user that created the budget.</p>
   * @return updatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getUpdatedBy() {
        return updatedBy;
      }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return BudgetAttributes
   */
  @JsonAnySetter
  public BudgetAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this BudgetAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetAttributes budgetAttributes = (BudgetAttributes) o;
    return Objects.equals(this.costs, budgetAttributes.costs) && Objects.equals(this.costsPeriodEnd, budgetAttributes.costsPeriodEnd) && Objects.equals(this.costsPeriodStart, budgetAttributes.costsPeriodStart) && Objects.equals(this.costsUnit, budgetAttributes.costsUnit) && Objects.equals(this.createdAt, budgetAttributes.createdAt) && Objects.equals(this.createdBy, budgetAttributes.createdBy) && Objects.equals(this.endMonth, budgetAttributes.endMonth) && Objects.equals(this.entries, budgetAttributes.entries) && Objects.equals(this.metricsQuery, budgetAttributes.metricsQuery) && Objects.equals(this.name, budgetAttributes.name) && Objects.equals(this.orgId, budgetAttributes.orgId) && Objects.equals(this.startMonth, budgetAttributes.startMonth) && Objects.equals(this.totalAmount, budgetAttributes.totalAmount) && Objects.equals(this.updatedAt, budgetAttributes.updatedAt) && Objects.equals(this.updatedBy, budgetAttributes.updatedBy) && Objects.equals(this.additionalProperties, budgetAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(costs,costsPeriodEnd,costsPeriodStart,costsUnit,createdAt,createdBy,endMonth,entries,metricsQuery,name,orgId,startMonth,totalAmount,updatedAt,updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetAttributes {\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("    costsPeriodEnd: ").append(toIndentedString(costsPeriodEnd)).append("\n");
    sb.append("    costsPeriodStart: ").append(toIndentedString(costsPeriodStart)).append("\n");
    sb.append("    costsUnit: ").append(toIndentedString(costsUnit)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    endMonth: ").append(toIndentedString(endMonth)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    metricsQuery: ").append(toIndentedString(metricsQuery)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
