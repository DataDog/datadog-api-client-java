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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The attributes of a budget. */
@JsonPropertyOrder({
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
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetAttributes {
  @JsonIgnore public boolean unparsed = false;
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

  public BudgetAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the budget was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The id of the user that created the budget.
   *
   * @return createdBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The month when the budget ends.
   *
   * @return endMonth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEndMonth() {
    return endMonth;
  }

  public void setEndMonth(Long endMonth) {
    this.endMonth = endMonth;
  }

  public BudgetAttributes entries(List<BudgetWithEntriesDataAttributesEntriesItems> entries) {
    this.entries = entries;
    for (BudgetWithEntriesDataAttributesEntriesItems item : entries) {
      this.unparsed |= item.unparsed;
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
   * Getentries
   *
   * @return entries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BudgetWithEntriesDataAttributesEntriesItems> getEntries() {
    return entries;
  }

  public void setEntries(List<BudgetWithEntriesDataAttributesEntriesItems> entries) {
    this.entries = entries;
  }

  public BudgetAttributes metricsQuery(String metricsQuery) {
    this.metricsQuery = metricsQuery;
    return this;
  }

  /**
   * The cost query used to track against the budget.
   *
   * @return metricsQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The name of the budget.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The id of the org the budget belongs to.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The month when the budget starts.
   *
   * @return startMonth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The sum of all budget entries' amounts.
   *
   * @return totalAmount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The timestamp when the budget was last updated.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * The id of the user that created the budget.
   *
   * @return updatedBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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

  /** Return true if this BudgetAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetAttributes budgetAttributes = (BudgetAttributes) o;
    return Objects.equals(this.createdAt, budgetAttributes.createdAt)
        && Objects.equals(this.createdBy, budgetAttributes.createdBy)
        && Objects.equals(this.endMonth, budgetAttributes.endMonth)
        && Objects.equals(this.entries, budgetAttributes.entries)
        && Objects.equals(this.metricsQuery, budgetAttributes.metricsQuery)
        && Objects.equals(this.name, budgetAttributes.name)
        && Objects.equals(this.orgId, budgetAttributes.orgId)
        && Objects.equals(this.startMonth, budgetAttributes.startMonth)
        && Objects.equals(this.totalAmount, budgetAttributes.totalAmount)
        && Objects.equals(this.updatedAt, budgetAttributes.updatedAt)
        && Objects.equals(this.updatedBy, budgetAttributes.updatedBy)
        && Objects.equals(this.additionalProperties, budgetAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        endMonth,
        entries,
        metricsQuery,
        name,
        orgId,
        startMonth,
        totalAmount,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetAttributes {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
