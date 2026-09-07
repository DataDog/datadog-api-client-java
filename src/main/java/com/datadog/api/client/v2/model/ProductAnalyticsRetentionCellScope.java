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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Narrows a retention query to a single cell, at the intersection of one cohort and one return
 * period.
 */
@JsonPropertyOrder({
  ProductAnalyticsRetentionCellScope.JSON_PROPERTY_COHORT_TARGET,
  ProductAnalyticsRetentionCellScope.JSON_PROPERTY_RETURN_PERIOD_TARGET,
  ProductAnalyticsRetentionCellScope.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionCellScope {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COHORT_TARGET = "cohort_target";
  private ProductAnalyticsRetentionCohortTarget cohortTarget;

  public static final String JSON_PROPERTY_RETURN_PERIOD_TARGET = "return_period_target";
  private ProductAnalyticsRetentionIndexTarget returnPeriodTarget;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ProductAnalyticsRetentionCellScopeType type;

  public ProductAnalyticsRetentionCellScope() {}

  @JsonCreator
  public ProductAnalyticsRetentionCellScope(
      @JsonProperty(required = true, value = JSON_PROPERTY_COHORT_TARGET)
          ProductAnalyticsRetentionCohortTarget cohortTarget,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETURN_PERIOD_TARGET)
          ProductAnalyticsRetentionIndexTarget returnPeriodTarget,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ProductAnalyticsRetentionCellScopeType type) {
    this.cohortTarget = cohortTarget;
    this.unparsed |= cohortTarget.unparsed;
    this.returnPeriodTarget = returnPeriodTarget;
    this.unparsed |= returnPeriodTarget.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ProductAnalyticsRetentionCellScope cohortTarget(
      ProductAnalyticsRetentionCohortTarget cohortTarget) {
    this.cohortTarget = cohortTarget;
    this.unparsed |= cohortTarget.unparsed;
    return this;
  }

  /**
   * Selects a cohort, either by index or by the aggregation that rolls all cohorts together.
   *
   * @return cohortTarget
   */
  @JsonProperty(JSON_PROPERTY_COHORT_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionCohortTarget getCohortTarget() {
    return cohortTarget;
  }

  public void setCohortTarget(ProductAnalyticsRetentionCohortTarget cohortTarget) {
    this.cohortTarget = cohortTarget;
    if (cohortTarget != null) {
      this.unparsed |= cohortTarget.unparsed;
    }
  }

  public ProductAnalyticsRetentionCellScope returnPeriodTarget(
      ProductAnalyticsRetentionIndexTarget returnPeriodTarget) {
    this.returnPeriodTarget = returnPeriodTarget;
    this.unparsed |= returnPeriodTarget.unparsed;
    return this;
  }

  /**
   * Selects a cohort or return period by its zero-based position in the grid.
   *
   * @return returnPeriodTarget
   */
  @JsonProperty(JSON_PROPERTY_RETURN_PERIOD_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionIndexTarget getReturnPeriodTarget() {
    return returnPeriodTarget;
  }

  public void setReturnPeriodTarget(ProductAnalyticsRetentionIndexTarget returnPeriodTarget) {
    this.returnPeriodTarget = returnPeriodTarget;
    if (returnPeriodTarget != null) {
      this.unparsed |= returnPeriodTarget.unparsed;
    }
  }

  public ProductAnalyticsRetentionCellScope type(ProductAnalyticsRetentionCellScopeType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The discriminator identifying a scope narrowed to one grid cell.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsRetentionCellScopeType getType() {
    return type;
  }

  public void setType(ProductAnalyticsRetentionCellScopeType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ProductAnalyticsRetentionCellScope
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionCellScope putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsRetentionCellScope object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionCellScope productAnalyticsRetentionCellScope =
        (ProductAnalyticsRetentionCellScope) o;
    return Objects.equals(this.cohortTarget, productAnalyticsRetentionCellScope.cohortTarget)
        && Objects.equals(
            this.returnPeriodTarget, productAnalyticsRetentionCellScope.returnPeriodTarget)
        && Objects.equals(this.type, productAnalyticsRetentionCellScope.type)
        && Objects.equals(
            this.additionalProperties, productAnalyticsRetentionCellScope.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohortTarget, returnPeriodTarget, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionCellScope {\n");
    sb.append("    cohortTarget: ").append(toIndentedString(cohortTarget)).append("\n");
    sb.append("    returnPeriodTarget: ").append(toIndentedString(returnPeriodTarget)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
