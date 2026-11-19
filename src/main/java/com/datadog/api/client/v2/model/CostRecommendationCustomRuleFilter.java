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

/** A tag filter. A rule applies to a resource only when every filter of the rule matches. */
@JsonPropertyOrder({
  CostRecommendationCustomRuleFilter.JSON_PROPERTY_FILTER_TYPE,
  CostRecommendationCustomRuleFilter.JSON_PROPERTY_TAG,
  CostRecommendationCustomRuleFilter.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CostRecommendationCustomRuleFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTER_TYPE = "filter_type";
  private CostRecommendationCustomRuleFilterType filterType;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = null;

  public CostRecommendationCustomRuleFilter() {}

  @JsonCreator
  public CostRecommendationCustomRuleFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_FILTER_TYPE)
          CostRecommendationCustomRuleFilterType filterType,
      @JsonProperty(required = true, value = JSON_PROPERTY_TAG) String tag) {
    this.filterType = filterType;
    this.unparsed |= !filterType.isValid();
    this.tag = tag;
  }

  public CostRecommendationCustomRuleFilter filterType(
      CostRecommendationCustomRuleFilterType filterType) {
    this.filterType = filterType;
    this.unparsed |= !filterType.isValid();
    return this;
  }

  /**
   * How the filter compares the tag. <code>is</code>, <code>is_not</code>, <code>contains</code>,
   * <code>does_not_contain</code>, <code>like</code> (glob), and <code>not_like</code> compare the
   * tag values with <code>values</code>. <code>all</code> matches resources that have the tag and
   * <code>untagged</code> matches resources that do not, so both ignore <code>values</code>.
   *
   * @return filterType
   */
  @JsonProperty(JSON_PROPERTY_FILTER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CostRecommendationCustomRuleFilterType getFilterType() {
    return filterType;
  }

  public void setFilterType(CostRecommendationCustomRuleFilterType filterType) {
    if (!filterType.isValid()) {
      this.unparsed = true;
    }
    this.filterType = filterType;
  }

  public CostRecommendationCustomRuleFilter tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The tag key the filter compares.
   *
   * @return tag
   */
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public CostRecommendationCustomRuleFilter values(List<String> values) {
    this.values = values;
    return this;
  }

  public CostRecommendationCustomRuleFilter addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Tag values the filter compares. Required unless <code>filter_type</code> is <code>all</code> or
   * <code>untagged</code>.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
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
   * @return CostRecommendationCustomRuleFilter
   */
  @JsonAnySetter
  public CostRecommendationCustomRuleFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CostRecommendationCustomRuleFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostRecommendationCustomRuleFilter costRecommendationCustomRuleFilter =
        (CostRecommendationCustomRuleFilter) o;
    return Objects.equals(this.filterType, costRecommendationCustomRuleFilter.filterType)
        && Objects.equals(this.tag, costRecommendationCustomRuleFilter.tag)
        && Objects.equals(this.values, costRecommendationCustomRuleFilter.values)
        && Objects.equals(
            this.additionalProperties, costRecommendationCustomRuleFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, tag, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostRecommendationCustomRuleFilter {\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
