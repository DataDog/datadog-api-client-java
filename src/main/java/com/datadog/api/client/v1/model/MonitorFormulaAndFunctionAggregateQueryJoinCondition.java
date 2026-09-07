/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Join condition for aggregate augmented queries. */
@JsonPropertyOrder({
  MonitorFormulaAndFunctionAggregateQueryJoinCondition.JSON_PROPERTY_AUGMENT_ATTRIBUTE,
  MonitorFormulaAndFunctionAggregateQueryJoinCondition.JSON_PROPERTY_BASE_ATTRIBUTE,
  MonitorFormulaAndFunctionAggregateQueryJoinCondition.JSON_PROPERTY_JOIN_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorFormulaAndFunctionAggregateQueryJoinCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUGMENT_ATTRIBUTE = "augment_attribute";
  private String augmentAttribute;

  public static final String JSON_PROPERTY_BASE_ATTRIBUTE = "base_attribute";
  private String baseAttribute;

  public static final String JSON_PROPERTY_JOIN_TYPE = "join_type";
  private MonitorFormulaAndFunctionAggregateQueryJoinType joinType;

  public MonitorFormulaAndFunctionAggregateQueryJoinCondition() {}

  @JsonCreator
  public MonitorFormulaAndFunctionAggregateQueryJoinCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUGMENT_ATTRIBUTE)
          String augmentAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_ATTRIBUTE) String baseAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_TYPE)
          MonitorFormulaAndFunctionAggregateQueryJoinType joinType) {
    this.augmentAttribute = augmentAttribute;
    this.baseAttribute = baseAttribute;
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
  }

  public MonitorFormulaAndFunctionAggregateQueryJoinCondition augmentAttribute(
      String augmentAttribute) {
    this.augmentAttribute = augmentAttribute;
    return this;
  }

  /**
   * Attribute from the augment query to join on.
   *
   * @return augmentAttribute
   */
  @JsonProperty(JSON_PROPERTY_AUGMENT_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAugmentAttribute() {
    return augmentAttribute;
  }

  public void setAugmentAttribute(String augmentAttribute) {
    this.augmentAttribute = augmentAttribute;
  }

  public MonitorFormulaAndFunctionAggregateQueryJoinCondition baseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
    return this;
  }

  /**
   * Attribute from the base query to join on.
   *
   * @return baseAttribute
   */
  @JsonProperty(JSON_PROPERTY_BASE_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBaseAttribute() {
    return baseAttribute;
  }

  public void setBaseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
  }

  public MonitorFormulaAndFunctionAggregateQueryJoinCondition joinType(
      MonitorFormulaAndFunctionAggregateQueryJoinType joinType) {
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
    return this;
  }

  /**
   * Join type for aggregate query join conditions.
   *
   * @return joinType
   */
  @JsonProperty(JSON_PROPERTY_JOIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MonitorFormulaAndFunctionAggregateQueryJoinType getJoinType() {
    return joinType;
  }

  public void setJoinType(MonitorFormulaAndFunctionAggregateQueryJoinType joinType) {
    if (!joinType.isValid()) {
      this.unparsed = true;
    }
    this.joinType = joinType;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionAggregateQueryJoinCondition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorFormulaAndFunctionAggregateQueryJoinCondition
        monitorFormulaAndFunctionAggregateQueryJoinCondition =
            (MonitorFormulaAndFunctionAggregateQueryJoinCondition) o;
    return Objects.equals(
            this.augmentAttribute,
            monitorFormulaAndFunctionAggregateQueryJoinCondition.augmentAttribute)
        && Objects.equals(
            this.baseAttribute, monitorFormulaAndFunctionAggregateQueryJoinCondition.baseAttribute)
        && Objects.equals(
            this.joinType, monitorFormulaAndFunctionAggregateQueryJoinCondition.joinType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(augmentAttribute, baseAttribute, joinType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorFormulaAndFunctionAggregateQueryJoinCondition {\n");
    sb.append("    augmentAttribute: ").append(toIndentedString(augmentAttribute)).append("\n");
    sb.append("    baseAttribute: ").append(toIndentedString(baseAttribute)).append("\n");
    sb.append("    joinType: ").append(toIndentedString(joinType)).append("\n");
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
