/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes of a retention grid response, containing the cohort rows and the period columns. */
@JsonPropertyOrder({
  ProductAnalyticsRetentionGridResponseAttributes.JSON_PROPERTY_COHORTS,
  ProductAnalyticsRetentionGridResponseAttributes.JSON_PROPERTY_RETENTION_ENTITY,
  ProductAnalyticsRetentionGridResponseAttributes.JSON_PROPERTY_RETENTION_PERIODS,
  ProductAnalyticsRetentionGridResponseAttributes.JSON_PROPERTY_UNIT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionGridResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COHORTS = "cohorts";
  private List<ProductAnalyticsRetentionGridCohort> cohorts = null;

  public static final String JSON_PROPERTY_RETENTION_ENTITY = "retention_entity";
  private String retentionEntity;

  public static final String JSON_PROPERTY_RETENTION_PERIODS = "retention_periods";
  private List<ProductAnalyticsRetentionPeriod> retentionPeriods = null;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<ProductAnalyticsUnit> unit = null;

  public ProductAnalyticsRetentionGridResponseAttributes cohorts(
      List<ProductAnalyticsRetentionGridCohort> cohorts) {
    this.cohorts = cohorts;
    if (cohorts != null) {
      for (ProductAnalyticsRetentionGridCohort item : cohorts) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsRetentionGridResponseAttributes addCohortsItem(
      ProductAnalyticsRetentionGridCohort cohortsItem) {
    if (this.cohorts == null) {
      this.cohorts = new ArrayList<>();
    }
    this.cohorts.add(cohortsItem);
    this.unparsed |= cohortsItem.unparsed;
    return this;
  }

  /**
   * The cohorts forming the rows of the grid.
   *
   * @return cohorts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsRetentionGridCohort> getCohorts() {
    return cohorts;
  }

  public void setCohorts(List<ProductAnalyticsRetentionGridCohort> cohorts) {
    this.cohorts = cohorts;
    if (cohorts != null) {
      for (ProductAnalyticsRetentionGridCohort item : cohorts) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsRetentionGridResponseAttributes retentionEntity(String retentionEntity) {
    this.retentionEntity = retentionEntity;
    return this;
  }

  /**
   * The entity whose retention was measured.
   *
   * @return retentionEntity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetentionEntity() {
    return retentionEntity;
  }

  public void setRetentionEntity(String retentionEntity) {
    this.retentionEntity = retentionEntity;
  }

  public ProductAnalyticsRetentionGridResponseAttributes retentionPeriods(
      List<ProductAnalyticsRetentionPeriod> retentionPeriods) {
    this.retentionPeriods = retentionPeriods;
    if (retentionPeriods != null) {
      for (ProductAnalyticsRetentionPeriod item : retentionPeriods) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsRetentionGridResponseAttributes addRetentionPeriodsItem(
      ProductAnalyticsRetentionPeriod retentionPeriodsItem) {
    if (this.retentionPeriods == null) {
      this.retentionPeriods = new ArrayList<>();
    }
    this.retentionPeriods.add(retentionPeriodsItem);
    this.unparsed |= retentionPeriodsItem.unparsed;
    return this;
  }

  /**
   * The return periods forming the columns of the grid.
   *
   * @return retentionPeriods
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsRetentionPeriod> getRetentionPeriods() {
    return retentionPeriods;
  }

  public void setRetentionPeriods(List<ProductAnalyticsRetentionPeriod> retentionPeriods) {
    this.retentionPeriods = retentionPeriods;
    if (retentionPeriods != null) {
      for (ProductAnalyticsRetentionPeriod item : retentionPeriods) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsRetentionGridResponseAttributes unit(List<ProductAnalyticsUnit> unit) {
    this.unit = unit;
    if (unit != null) {
      for (ProductAnalyticsUnit item : unit) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsRetentionGridResponseAttributes addUnitItem(
      ProductAnalyticsUnit unitItem) {
    if (this.unit == null) {
      this.unit = new ArrayList<>();
    }
    this.unit.add(unitItem);
    this.unparsed |= unitItem.unparsed;
    return this;
  }

  /**
   * Unit definitions for the grid values.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsUnit> getUnit() {
    return unit;
  }

  public void setUnit(List<ProductAnalyticsUnit> unit) {
    this.unit = unit;
    if (unit != null) {
      for (ProductAnalyticsUnit item : unit) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ProductAnalyticsRetentionGridResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionGridResponseAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ProductAnalyticsRetentionGridResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionGridResponseAttributes
        productAnalyticsRetentionGridResponseAttributes =
            (ProductAnalyticsRetentionGridResponseAttributes) o;
    return Objects.equals(this.cohorts, productAnalyticsRetentionGridResponseAttributes.cohorts)
        && Objects.equals(
            this.retentionEntity, productAnalyticsRetentionGridResponseAttributes.retentionEntity)
        && Objects.equals(
            this.retentionPeriods, productAnalyticsRetentionGridResponseAttributes.retentionPeriods)
        && Objects.equals(this.unit, productAnalyticsRetentionGridResponseAttributes.unit)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsRetentionGridResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohorts, retentionEntity, retentionPeriods, unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionGridResponseAttributes {\n");
    sb.append("    cohorts: ").append(toIndentedString(cohorts)).append("\n");
    sb.append("    retentionEntity: ").append(toIndentedString(retentionEntity)).append("\n");
    sb.append("    retentionPeriods: ").append(toIndentedString(retentionPeriods)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
