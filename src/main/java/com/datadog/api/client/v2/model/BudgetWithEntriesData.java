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

/** A budget and all it's entries. */
@JsonPropertyOrder({
  BudgetWithEntriesData.JSON_PROPERTY_CREATED_AT,
  BudgetWithEntriesData.JSON_PROPERTY_CREATED_BY,
  BudgetWithEntriesData.JSON_PROPERTY_END_MONTH,
  BudgetWithEntriesData.JSON_PROPERTY_ENTRIES,
  BudgetWithEntriesData.JSON_PROPERTY_ID,
  BudgetWithEntriesData.JSON_PROPERTY_METRICS_QUERY,
  BudgetWithEntriesData.JSON_PROPERTY_NAME,
  BudgetWithEntriesData.JSON_PROPERTY_ORG_ID,
  BudgetWithEntriesData.JSON_PROPERTY_START_MONTH,
  BudgetWithEntriesData.JSON_PROPERTY_TAGS,
  BudgetWithEntriesData.JSON_PROPERTY_TOTAL_AMOUNT,
  BudgetWithEntriesData.JSON_PROPERTY_UPDATED_AT,
  BudgetWithEntriesData.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetWithEntriesData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_END_MONTH = "end_month";
  private Long endMonth;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<BudgetEntry> entries = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_METRICS_QUERY = "metrics_query";
  private String metricsQuery;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_START_MONTH = "start_month";
  private Long startMonth;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "total_amount";
  private Double totalAmount;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public BudgetWithEntriesData createdAt(Long createdAt) {
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

  public BudgetWithEntriesData createdBy(String createdBy) {
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

  public BudgetWithEntriesData endMonth(Long endMonth) {
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

  public BudgetWithEntriesData entries(List<BudgetEntry> entries) {
    this.entries = entries;
    for (BudgetEntry item : entries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public BudgetWithEntriesData addEntriesItem(BudgetEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    this.unparsed |= entriesItem.unparsed;
    return this;
  }

  /**
   * The entries of the budget.
   *
   * @return entries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<BudgetEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<BudgetEntry> entries) {
    this.entries = entries;
  }

  public BudgetWithEntriesData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The <code>BudgetWithEntriesData</code> <code>id</code>.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BudgetWithEntriesData metricsQuery(String metricsQuery) {
    this.metricsQuery = metricsQuery;
    return this;
  }

  /**
   * The cost query for to track against the budget.
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

  public BudgetWithEntriesData name(String name) {
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

  public BudgetWithEntriesData orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The Id of the Org the budget belongs to.
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

  public BudgetWithEntriesData startMonth(Long startMonth) {
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

  public BudgetWithEntriesData tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BudgetWithEntriesData addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * The tags for which the budget is created.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public BudgetWithEntriesData totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * The sum of all budget entries amounts.
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

  public BudgetWithEntriesData updatedAt(Long updatedAt) {
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

  public BudgetWithEntriesData updatedBy(String updatedBy) {
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
   * @return BudgetWithEntriesData
   */
  @JsonAnySetter
  public BudgetWithEntriesData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this BudgetWithEntriesData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetWithEntriesData budgetWithEntriesData = (BudgetWithEntriesData) o;
    return Objects.equals(this.createdAt, budgetWithEntriesData.createdAt)
        && Objects.equals(this.createdBy, budgetWithEntriesData.createdBy)
        && Objects.equals(this.endMonth, budgetWithEntriesData.endMonth)
        && Objects.equals(this.entries, budgetWithEntriesData.entries)
        && Objects.equals(this.id, budgetWithEntriesData.id)
        && Objects.equals(this.metricsQuery, budgetWithEntriesData.metricsQuery)
        && Objects.equals(this.name, budgetWithEntriesData.name)
        && Objects.equals(this.orgId, budgetWithEntriesData.orgId)
        && Objects.equals(this.startMonth, budgetWithEntriesData.startMonth)
        && Objects.equals(this.tags, budgetWithEntriesData.tags)
        && Objects.equals(this.totalAmount, budgetWithEntriesData.totalAmount)
        && Objects.equals(this.updatedAt, budgetWithEntriesData.updatedAt)
        && Objects.equals(this.updatedBy, budgetWithEntriesData.updatedBy)
        && Objects.equals(this.additionalProperties, budgetWithEntriesData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        endMonth,
        entries,
        id,
        metricsQuery,
        name,
        orgId,
        startMonth,
        tags,
        totalAmount,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetWithEntriesData {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    endMonth: ").append(toIndentedString(endMonth)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metricsQuery: ").append(toIndentedString(metricsQuery)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
