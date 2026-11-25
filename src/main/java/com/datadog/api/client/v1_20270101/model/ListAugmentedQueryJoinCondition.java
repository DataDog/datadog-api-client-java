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
  ListAugmentedQueryJoinCondition.JSON_PROPERTY_AUGMENT_ATTRIBUTE,
  ListAugmentedQueryJoinCondition.JSON_PROPERTY_AUGMENT_ATTRIBUTE_NORMALIZATION,
  ListAugmentedQueryJoinCondition.JSON_PROPERTY_BASE_ATTRIBUTE,
  ListAugmentedQueryJoinCondition.JSON_PROPERTY_IS_NEGATED,
  ListAugmentedQueryJoinCondition.JSON_PROPERTY_JOIN_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListAugmentedQueryJoinCondition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUGMENT_ATTRIBUTE = "augment_attribute";
  private String augmentAttribute;

  public static final String JSON_PROPERTY_AUGMENT_ATTRIBUTE_NORMALIZATION =
      "augment_attribute_normalization";
  private ListAugmentedQueryJoinConditionAugmentAttributeNormalization
      augmentAttributeNormalization;

  public static final String JSON_PROPERTY_BASE_ATTRIBUTE = "base_attribute";
  private String baseAttribute;

  public static final String JSON_PROPERTY_IS_NEGATED = "is_negated";
  private Boolean isNegated;

  public static final String JSON_PROPERTY_JOIN_TYPE = "join_type";
  private JoinType joinType;

  public ListAugmentedQueryJoinCondition() {}

  @JsonCreator
  public ListAugmentedQueryJoinCondition(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUGMENT_ATTRIBUTE)
          String augmentAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_BASE_ATTRIBUTE) String baseAttribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_JOIN_TYPE) JoinType joinType) {
    this.augmentAttribute = augmentAttribute;
    this.baseAttribute = baseAttribute;
    this.joinType = joinType;
    this.unparsed |= !joinType.isValid();
  }

  public ListAugmentedQueryJoinCondition augmentAttribute(String augmentAttribute) {
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

  public ListAugmentedQueryJoinCondition augmentAttributeNormalization(
      ListAugmentedQueryJoinConditionAugmentAttributeNormalization augmentAttributeNormalization) {
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
  public ListAugmentedQueryJoinConditionAugmentAttributeNormalization
      getAugmentAttributeNormalization() {
    return augmentAttributeNormalization;
  }

  public void setAugmentAttributeNormalization(
      ListAugmentedQueryJoinConditionAugmentAttributeNormalization augmentAttributeNormalization) {
    if (!augmentAttributeNormalization.isValid()) {
      this.unparsed = true;
    }
    this.augmentAttributeNormalization = augmentAttributeNormalization;
  }

  public ListAugmentedQueryJoinCondition baseAttribute(String baseAttribute) {
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

  public ListAugmentedQueryJoinCondition isNegated(Boolean isNegated) {
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

  public ListAugmentedQueryJoinCondition joinType(JoinType joinType) {
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

  /** Return true if this ListAugmentedQueryJoinCondition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAugmentedQueryJoinCondition listAugmentedQueryJoinCondition =
        (ListAugmentedQueryJoinCondition) o;
    return Objects.equals(this.augmentAttribute, listAugmentedQueryJoinCondition.augmentAttribute)
        && Objects.equals(
            this.augmentAttributeNormalization,
            listAugmentedQueryJoinCondition.augmentAttributeNormalization)
        && Objects.equals(this.baseAttribute, listAugmentedQueryJoinCondition.baseAttribute)
        && Objects.equals(this.isNegated, listAugmentedQueryJoinCondition.isNegated)
        && Objects.equals(this.joinType, listAugmentedQueryJoinCondition.joinType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        augmentAttribute, augmentAttributeNormalization, baseAttribute, isNegated, joinType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAugmentedQueryJoinCondition {\n");
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
