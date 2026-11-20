/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  FormulaDataQualityMetricsQueryAnomalyOptions.JSON_PROPERTY_DIRECTION,
  FormulaDataQualityMetricsQueryAnomalyOptions.JSON_PROPERTY_RULE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FormulaDataQualityMetricsQueryAnomalyOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private FormulaDataQualityMetricsQueryAnomalyOptionsDirection direction;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private Double ruleId;

  public FormulaDataQualityMetricsQueryAnomalyOptions direction(
      FormulaDataQualityMetricsQueryAnomalyOptionsDirection direction) {
    this.direction = direction;
    this.unparsed |= !direction.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return direction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FormulaDataQualityMetricsQueryAnomalyOptionsDirection getDirection() {
    return direction;
  }

  public void setDirection(FormulaDataQualityMetricsQueryAnomalyOptionsDirection direction) {
    if (!direction.isValid()) {
      this.unparsed = true;
    }
    this.direction = direction;
  }

  public FormulaDataQualityMetricsQueryAnomalyOptions ruleId(Double ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return ruleId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getRuleId() {
    return ruleId;
  }

  public void setRuleId(Double ruleId) {
    this.ruleId = ruleId;
  }

  /** Return true if this FormulaDataQualityMetricsQueryAnomalyOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaDataQualityMetricsQueryAnomalyOptions formulaDataQualityMetricsQueryAnomalyOptions =
        (FormulaDataQualityMetricsQueryAnomalyOptions) o;
    return Objects.equals(this.direction, formulaDataQualityMetricsQueryAnomalyOptions.direction)
        && Objects.equals(this.ruleId, formulaDataQualityMetricsQueryAnomalyOptions.ruleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, ruleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaDataQualityMetricsQueryAnomalyOptions {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
