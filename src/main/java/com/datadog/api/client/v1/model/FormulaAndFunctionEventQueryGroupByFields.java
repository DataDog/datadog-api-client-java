/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Flat group by using multiple event facets. */
@JsonPropertyOrder({
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_FIELDS,
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_LIMIT,
  FormulaAndFunctionEventQueryGroupByFields.JSON_PROPERTY_SORT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaAndFunctionEventQueryGroupByFields {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = new ArrayList<>();

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SORT = "sort";
  private FormulaAndFunctionEventQueryGroupBySort sort;

  public FormulaAndFunctionEventQueryGroupByFields() {}

  @JsonCreator
  public FormulaAndFunctionEventQueryGroupByFields(
      @JsonProperty(required = true, value = JSON_PROPERTY_FIELDS) List<String> fields) {
    this.fields = fields;
  }

  public FormulaAndFunctionEventQueryGroupByFields fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public FormulaAndFunctionEventQueryGroupByFields addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * List of event facets to group by.
   *
   * @return fields
   */
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public FormulaAndFunctionEventQueryGroupByFields limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Number of groups to return.
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public FormulaAndFunctionEventQueryGroupByFields sort(
      FormulaAndFunctionEventQueryGroupBySort sort) {
    this.sort = sort;
    this.unparsed |= sort.unparsed;
    return this;
  }

  /**
   * Options for sorting group by results.
   *
   * @return sort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaAndFunctionEventQueryGroupBySort getSort() {
    return sort;
  }

  public void setSort(FormulaAndFunctionEventQueryGroupBySort sort) {
    this.sort = sort;
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
   * @return FormulaAndFunctionEventQueryGroupByFields
   */
  @JsonAnySetter
  public FormulaAndFunctionEventQueryGroupByFields putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FormulaAndFunctionEventQueryGroupByFields object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaAndFunctionEventQueryGroupByFields formulaAndFunctionEventQueryGroupByFields =
        (FormulaAndFunctionEventQueryGroupByFields) o;
    return Objects.equals(this.fields, formulaAndFunctionEventQueryGroupByFields.fields)
        && Objects.equals(this.limit, formulaAndFunctionEventQueryGroupByFields.limit)
        && Objects.equals(this.sort, formulaAndFunctionEventQueryGroupByFields.sort)
        && Objects.equals(
            this.additionalProperties,
            formulaAndFunctionEventQueryGroupByFields.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, limit, sort, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaAndFunctionEventQueryGroupByFields {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
