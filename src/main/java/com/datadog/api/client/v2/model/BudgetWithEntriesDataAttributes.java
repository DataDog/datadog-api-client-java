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

 */
@JsonPropertyOrder({
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_CREATED_AT,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_CREATED_BY,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_END_MONTH,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_ENTRIES,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_METRICS_QUERY,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_NAME,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_ORG_ID,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_START_MONTH,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_TOTAL_AMOUNT,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_UPDATED_AT,
  BudgetWithEntriesDataAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BudgetWithEntriesDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
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

  public BudgetWithEntriesDataAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>GetcreatedAt</p>
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
  public BudgetWithEntriesDataAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>GetcreatedBy</p>
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
  public BudgetWithEntriesDataAttributes endMonth(Long endMonth) {
    this.endMonth = endMonth;
    return this;
  }

  /**
   * <p>GetendMonth</p>
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
  public BudgetWithEntriesDataAttributes entries(List<BudgetWithEntriesDataAttributesEntriesItems> entries) {
    this.entries = entries;
    for (BudgetWithEntriesDataAttributesEntriesItems item : entries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public BudgetWithEntriesDataAttributes addEntriesItem(BudgetWithEntriesDataAttributesEntriesItems entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    this.unparsed |= entriesItem.unparsed;
    return this;
  }

  /**
   * <p>Getentries</p>
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
  }
  public BudgetWithEntriesDataAttributes metricsQuery(String metricsQuery) {
    this.metricsQuery = metricsQuery;
    return this;
  }

  /**
   * <p>GetmetricsQuery</p>
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
  public BudgetWithEntriesDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getname</p>
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
  public BudgetWithEntriesDataAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>GetorgId</p>
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
  public BudgetWithEntriesDataAttributes startMonth(Long startMonth) {
    this.startMonth = startMonth;
    return this;
  }

  /**
   * <p>GetstartMonth</p>
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
  public BudgetWithEntriesDataAttributes totalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * <p>GettotalAmount</p>
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
  public BudgetWithEntriesDataAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>GetupdatedAt</p>
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
  public BudgetWithEntriesDataAttributes updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>GetupdatedBy</p>
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
   * @return BudgetWithEntriesDataAttributes
   */
  @JsonAnySetter
  public BudgetWithEntriesDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this BudgetWithEntriesDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetWithEntriesDataAttributes budgetWithEntriesDataAttributes = (BudgetWithEntriesDataAttributes) o;
    return Objects.equals(this.createdAt, budgetWithEntriesDataAttributes.createdAt) && Objects.equals(this.createdBy, budgetWithEntriesDataAttributes.createdBy) && Objects.equals(this.endMonth, budgetWithEntriesDataAttributes.endMonth) && Objects.equals(this.entries, budgetWithEntriesDataAttributes.entries) && Objects.equals(this.metricsQuery, budgetWithEntriesDataAttributes.metricsQuery) && Objects.equals(this.name, budgetWithEntriesDataAttributes.name) && Objects.equals(this.orgId, budgetWithEntriesDataAttributes.orgId) && Objects.equals(this.startMonth, budgetWithEntriesDataAttributes.startMonth) && Objects.equals(this.totalAmount, budgetWithEntriesDataAttributes.totalAmount) && Objects.equals(this.updatedAt, budgetWithEntriesDataAttributes.updatedAt) && Objects.equals(this.updatedBy, budgetWithEntriesDataAttributes.updatedBy) && Objects.equals(this.additionalProperties, budgetWithEntriesDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,endMonth,entries,metricsQuery,name,orgId,startMonth,totalAmount,updatedAt,updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetWithEntriesDataAttributes {\n");
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
