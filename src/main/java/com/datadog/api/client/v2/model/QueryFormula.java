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
   * <p>A formula for calculation based on one or more queries.</p>
 */
@JsonPropertyOrder({
  QueryFormula.JSON_PROPERTY_FORMULA,
  QueryFormula.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class QueryFormula {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORMULA = "formula";
  private String formula;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private FormulaLimit limit;

  public QueryFormula() {}

  @JsonCreator
  public QueryFormula(
            @JsonProperty(required=true, value=JSON_PROPERTY_FORMULA)String formula) {
        this.formula = formula;
  }
  public QueryFormula formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * <p>Formula string, referencing one or more queries with their name property.</p>
   * @return formula
  **/
      @JsonProperty(JSON_PROPERTY_FORMULA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getFormula() {
        return formula;
      }
  public void setFormula(String formula) {
    this.formula = formula;
  }
  public QueryFormula limit(FormulaLimit limit) {
    this.limit = limit;
    this.unparsed |= limit.unparsed;
    return this;
  }

  /**
   * <p>Message for specifying limits to the number of values returned by a query.</p>
   * @return limit
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public FormulaLimit getLimit() {
        return limit;
      }
  public void setLimit(FormulaLimit limit) {
    this.limit = limit;
  }

  /**
   * Return true if this QueryFormula object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryFormula queryFormula = (QueryFormula) o;
    return Objects.equals(this.formula, queryFormula.formula) && Objects.equals(this.limit, queryFormula.limit);
  }


  @Override
  public int hashCode() {
    return Objects.hash(formula,limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryFormula {\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
