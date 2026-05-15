/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a Cloud Cost Management tag key metadata entry. */
@JsonPropertyOrder({
  CostTagKeyMetadataAttributes.JSON_PROPERTY_CARDINALITY_BY_ACCOUNT,
  CostTagKeyMetadataAttributes.JSON_PROPERTY_COST_COVERED,
  CostTagKeyMetadataAttributes.JSON_PROPERTY_DATE,
  CostTagKeyMetadataAttributes.JSON_PROPERTY_METRIC,
  CostTagKeyMetadataAttributes.JSON_PROPERTY_ROW_COUNT,
  CostTagKeyMetadataAttributes.JSON_PROPERTY_TAG_SOURCES,
  CostTagKeyMetadataAttributes.JSON_PROPERTY_TOP_VALUES_BY_ACCOUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostTagKeyMetadataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CARDINALITY_BY_ACCOUNT = "cardinality_by_account";
  private Map<String, Long> cardinalityByAccount = new HashMap<String, Long>();

  public static final String JSON_PROPERTY_COST_COVERED = "cost_covered";
  private Double costCovered;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  public static final String JSON_PROPERTY_ROW_COUNT = "row_count";
  private Long rowCount;

  public static final String JSON_PROPERTY_TAG_SOURCES = "tag_sources";
  private List<String> tagSources = new ArrayList<>();

  public static final String JSON_PROPERTY_TOP_VALUES_BY_ACCOUNT = "top_values_by_account";
  private Map<String, List<String>> topValuesByAccount = new HashMap<String, List<String>>();

  public CostTagKeyMetadataAttributes() {}

  @JsonCreator
  public CostTagKeyMetadataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CARDINALITY_BY_ACCOUNT)
          Map<String, Long> cardinalityByAccount,
      @JsonProperty(required = true, value = JSON_PROPERTY_COST_COVERED) Double costCovered,
      @JsonProperty(required = true, value = JSON_PROPERTY_METRIC) String metric,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROW_COUNT) Long rowCount,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG_SOURCES) List<String> tagSources,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOP_VALUES_BY_ACCOUNT)
          Map<String, List<String>> topValuesByAccount) {
    this.cardinalityByAccount = cardinalityByAccount;
    this.costCovered = costCovered;
    this.metric = metric;
    this.rowCount = rowCount;
    this.tagSources = tagSources;
    this.topValuesByAccount = topValuesByAccount;
  }

  public CostTagKeyMetadataAttributes cardinalityByAccount(Map<String, Long> cardinalityByAccount) {
    this.cardinalityByAccount = cardinalityByAccount;
    return this;
  }

  public CostTagKeyMetadataAttributes putCardinalityByAccountItem(
      String key, Long cardinalityByAccountItem) {
    this.cardinalityByAccount.put(key, cardinalityByAccountItem);
    return this;
  }

  /**
   * Number of unique tag values observed for this tag key, keyed by cloud account ID.
   *
   * @return cardinalityByAccount
   */
  @JsonProperty(JSON_PROPERTY_CARDINALITY_BY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Long> getCardinalityByAccount() {
    return cardinalityByAccount;
  }

  public void setCardinalityByAccount(Map<String, Long> cardinalityByAccount) {
    this.cardinalityByAccount = cardinalityByAccount;
  }

  public CostTagKeyMetadataAttributes costCovered(Double costCovered) {
    this.costCovered = costCovered;
    return this;
  }

  /**
   * Total cost (in the report currency) of cost line items that carry this tag key for the
   * requested period.
   *
   * @return costCovered
   */
  @JsonProperty(JSON_PROPERTY_COST_COVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCostCovered() {
    return costCovered;
  }

  public void setCostCovered(Double costCovered) {
    this.costCovered = costCovered;
  }

  public CostTagKeyMetadataAttributes date(String date) {
    this.date = date;
    return this;
  }

  /**
   * The day this row corresponds to, in <code>YYYY-MM-DD</code> format. Present only when <code>
   * filter[daily]=true</code>; omitted for the monthly roll-up returned by default.
   *
   * @return date
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public CostTagKeyMetadataAttributes metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The Cloud Cost Management metric this row aggregates, for example <code>aws.cost.net.amortized
   * </code>.
   *
   * @return metric
   */
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public CostTagKeyMetadataAttributes rowCount(Long rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * Number of cost rows that carry this tag key over the requested period.
   *
   * @return rowCount
   */
  @JsonProperty(JSON_PROPERTY_ROW_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRowCount() {
    return rowCount;
  }

  public void setRowCount(Long rowCount) {
    this.rowCount = rowCount;
  }

  public CostTagKeyMetadataAttributes tagSources(List<String> tagSources) {
    this.tagSources = tagSources;
    return this;
  }

  public CostTagKeyMetadataAttributes addTagSourcesItem(String tagSourcesItem) {
    this.tagSources.add(tagSourcesItem);
    return this;
  }

  /**
   * Origins where this tag key was observed (for example, <code>aws-user-defined</code>).
   *
   * @return tagSources
   */
  @JsonProperty(JSON_PROPERTY_TAG_SOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getTagSources() {
    return tagSources;
  }

  public void setTagSources(List<String> tagSources) {
    this.tagSources = tagSources;
  }

  public CostTagKeyMetadataAttributes topValuesByAccount(
      Map<String, List<String>> topValuesByAccount) {
    this.topValuesByAccount = topValuesByAccount;
    return this;
  }

  public CostTagKeyMetadataAttributes putTopValuesByAccountItem(
      String key, List<String> topValuesByAccountItem) {
    this.topValuesByAccount.put(key, topValuesByAccountItem);
    return this;
  }

  /**
   * A sample of the most frequent tag values observed for this tag key, keyed by cloud account ID.
   *
   * @return topValuesByAccount
   */
  @JsonProperty(JSON_PROPERTY_TOP_VALUES_BY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, List<String>> getTopValuesByAccount() {
    return topValuesByAccount;
  }

  public void setTopValuesByAccount(Map<String, List<String>> topValuesByAccount) {
    this.topValuesByAccount = topValuesByAccount;
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
   * @return CostTagKeyMetadataAttributes
   */
  @JsonAnySetter
  public CostTagKeyMetadataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostTagKeyMetadataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostTagKeyMetadataAttributes costTagKeyMetadataAttributes = (CostTagKeyMetadataAttributes) o;
    return Objects.equals(
            this.cardinalityByAccount, costTagKeyMetadataAttributes.cardinalityByAccount)
        && Objects.equals(this.costCovered, costTagKeyMetadataAttributes.costCovered)
        && Objects.equals(this.date, costTagKeyMetadataAttributes.date)
        && Objects.equals(this.metric, costTagKeyMetadataAttributes.metric)
        && Objects.equals(this.rowCount, costTagKeyMetadataAttributes.rowCount)
        && Objects.equals(this.tagSources, costTagKeyMetadataAttributes.tagSources)
        && Objects.equals(this.topValuesByAccount, costTagKeyMetadataAttributes.topValuesByAccount)
        && Objects.equals(
            this.additionalProperties, costTagKeyMetadataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cardinalityByAccount,
        costCovered,
        date,
        metric,
        rowCount,
        tagSources,
        topValuesByAccount,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostTagKeyMetadataAttributes {\n");
    sb.append("    cardinalityByAccount: ")
        .append(toIndentedString(cardinalityByAccount))
        .append("\n");
    sb.append("    costCovered: ").append(toIndentedString(costCovered)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    tagSources: ").append(toIndentedString(tagSources)).append("\n");
    sb.append("    topValuesByAccount: ").append(toIndentedString(topValuesByAccount)).append("\n");
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
