/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  AggregateAugmentedQueryJoinCondition.JSON_PROPERTY_AUGMENT_ATTRIBUTE,
  AggregateAugmentedQueryJoinCondition.JSON_PROPERTY_AUGMENT_ATTRIBUTE_NORMALIZATION,
  AggregateAugmentedQueryJoinCondition.JSON_PROPERTY_BASE_ATTRIBUTE,
  AggregateAugmentedQueryJoinCondition.JSON_PROPERTY_IS_NEGATED,
  AggregateAugmentedQueryJoinCondition.JSON_PROPERTY_JOIN_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AggregateAugmentedQueryJoinCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUGMENT_ATTRIBUTE = "augment_attribute";
  private String augmentAttribute;

  public static final String JSON_PROPERTY_AUGMENT_ATTRIBUTE_NORMALIZATION =
      "augment_attribute_normalization";
  private AggregateAugmentedQueryJoinConditionAugmentAttributeNormalization
      augmentAttributeNormalization;

  public static final String JSON_PROPERTY_BASE_ATTRIBUTE = "base_attribute";
  private String baseAttribute;

  public static final String JSON_PROPERTY_IS_NEGATED = "is_negated";
  private Boolean isNegated;

  public static final String JSON_PROPERTY_JOIN_TYPE = "join_type";
  private JoinType joinType;

  public AggregateAugmentedQueryJoinCondition() {}

  @JsonCreator
  public AggregateAugmentedQueryJoinCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUGMENT_ATTRIBUTE)
          String augmentAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_ATTRIBUTE) String baseAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_TYPE) JoinType joinType) {
    this.augmentAttribute = augmentAttribute;
    this.baseAttribute = baseAttribute;
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
  }

  public AggregateAugmentedQueryJoinCondition augmentAttribute(String augmentAttribute) {
    this.augmentAttribute = augmentAttribute;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AggregateAugmentedQueryJoinCondition augmentAttributeNormalization(
      AggregateAugmentedQueryJoinConditionAugmentAttributeNormalization
          augmentAttributeNormalization) {
    this.augmentAttributeNormalization = augmentAttributeNormalization;
    this.unparsed |= !augmentAttributeNormalization.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return augmentAttributeNormalization
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUGMENT_ATTRIBUTE_NORMALIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AggregateAugmentedQueryJoinConditionAugmentAttributeNormalization
      getAugmentAttributeNormalization() {
    return augmentAttributeNormalization;
  }

  public void setAugmentAttributeNormalization(
      AggregateAugmentedQueryJoinConditionAugmentAttributeNormalization
          augmentAttributeNormalization) {
    if (!augmentAttributeNormalization.isValid()) {
      this.unparsed = true;
    }
    this.augmentAttributeNormalization = augmentAttributeNormalization;
  }

  public AggregateAugmentedQueryJoinCondition baseAttribute(String baseAttribute) {
    this.baseAttribute = baseAttribute;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
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

  public AggregateAugmentedQueryJoinCondition isNegated(Boolean isNegated) {
    this.isNegated = isNegated;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return isNegated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_NEGATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsNegated() {
    return isNegated;
  }

  public void setIsNegated(Boolean isNegated) {
    this.isNegated = isNegated;
  }

  public AggregateAugmentedQueryJoinCondition joinType(JoinType joinType) {
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return joinType
   */
  @JsonProperty(JSON_PROPERTY_JOIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JoinType getJoinType() {
    return joinType;
  }

  public void setJoinType(JoinType joinType) {
    if (!joinType.isValid()) {
      this.unparsed = true;
    }
    this.joinType = joinType;
  }

  /** Return true if this AggregateAugmentedQueryJoinCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregateAugmentedQueryJoinCondition aggregateAugmentedQueryJoinCondition =
        (AggregateAugmentedQueryJoinCondition) o;
    return Objects.equals(
            this.augmentAttribute, aggregateAugmentedQueryJoinCondition.augmentAttribute)
        && Objects.equals(
            this.augmentAttributeNormalization,
            aggregateAugmentedQueryJoinCondition.augmentAttributeNormalization)
        && Objects.equals(this.baseAttribute, aggregateAugmentedQueryJoinCondition.baseAttribute)
        && Objects.equals(this.isNegated, aggregateAugmentedQueryJoinCondition.isNegated)
        && Objects.equals(this.joinType, aggregateAugmentedQueryJoinCondition.joinType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        augmentAttribute, augmentAttributeNormalization, baseAttribute, isNegated, joinType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregateAugmentedQueryJoinCondition {\n");
    sb.append("    augmentAttribute: ").append(toIndentedString(augmentAttribute)).append("\n");
    sb.append("    augmentAttributeNormalization: ")
        .append(toIndentedString(augmentAttributeNormalization))
        .append("\n");
    sb.append("    baseAttribute: ").append(toIndentedString(baseAttribute)).append("\n");
    sb.append("    isNegated: ").append(toIndentedString(isNegated)).append("\n");
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
