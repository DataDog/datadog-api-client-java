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
import java.util.UUID;
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
   * <p>Defines the cohort and return criteria that make up a retention query.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsRetentionSearch.JSON_PROPERTY_COHORT_CRITERIA,
  ProductAnalyticsRetentionSearch.JSON_PROPERTY_FILTERS,
  ProductAnalyticsRetentionSearch.JSON_PROPERTY_RETENTION_ENTITY,
  ProductAnalyticsRetentionSearch.JSON_PROPERTY_RETURN_CONDITION,
  ProductAnalyticsRetentionSearch.JSON_PROPERTY_RETURN_CRITERIA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionSearch {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COHORT_CRITERIA = "cohort_criteria";
  private ProductAnalyticsRetentionCohortCriteria cohortCriteria;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private ProductAnalyticsRetentionFilters filters;

  public static final String JSON_PROPERTY_RETENTION_ENTITY = "retention_entity";
  private ProductAnalyticsRetentionEntity retentionEntity;

  public static final String JSON_PROPERTY_RETURN_CONDITION = "return_condition";
  private ProductAnalyticsRetentionReturnCondition returnCondition;

  public static final String JSON_PROPERTY_RETURN_CRITERIA = "return_criteria";
  private ProductAnalyticsRetentionReturnCriteria returnCriteria;

  public ProductAnalyticsRetentionSearch() {}

  @JsonCreator
  public ProductAnalyticsRetentionSearch(
            @JsonProperty(required=true, value=JSON_PROPERTY_COHORT_CRITERIA)ProductAnalyticsRetentionCohortCriteria cohortCriteria,
            @JsonProperty(required=true, value=JSON_PROPERTY_RETENTION_ENTITY)ProductAnalyticsRetentionEntity retentionEntity,
            @JsonProperty(required=true, value=JSON_PROPERTY_RETURN_CONDITION)ProductAnalyticsRetentionReturnCondition returnCondition) {
        this.cohortCriteria = cohortCriteria;
        this.unparsed |= cohortCriteria.unparsed;
        this.retentionEntity = retentionEntity;
        this.unparsed |= !retentionEntity.isValid();
        this.returnCondition = returnCondition;
        this.unparsed |= !returnCondition.isValid();
  }
  public ProductAnalyticsRetentionSearch cohortCriteria(ProductAnalyticsRetentionCohortCriteria cohortCriteria) {
    this.cohortCriteria = cohortCriteria;
    this.unparsed |= cohortCriteria.unparsed;
    return this;
  }

  /**
   * <p>Defines the event that places an entity into a cohort, and how cohorts are bucketed over time.</p>
   * @return cohortCriteria
  **/
      @JsonProperty(JSON_PROPERTY_COHORT_CRITERIA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsRetentionCohortCriteria getCohortCriteria() {
        return cohortCriteria;
      }
  public void setCohortCriteria(ProductAnalyticsRetentionCohortCriteria cohortCriteria) {
    this.cohortCriteria = cohortCriteria;
    if (cohortCriteria != null) {
      this.unparsed |= cohortCriteria.unparsed;
    }
  }
  public ProductAnalyticsRetentionSearch filters(ProductAnalyticsRetentionFilters filters) {
    this.filters = filters;
    this.unparsed |= filters.unparsed;
    return this;
  }

  /**
   * <p>Filters narrowing the events considered by a retention query.</p>
   * @return filters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsRetentionFilters getFilters() {
        return filters;
      }
  public void setFilters(ProductAnalyticsRetentionFilters filters) {
    this.filters = filters;
    if (filters != null) {
      this.unparsed |= filters.unparsed;
    }
  }
  public ProductAnalyticsRetentionSearch retentionEntity(ProductAnalyticsRetentionEntity retentionEntity) {
    this.retentionEntity = retentionEntity;
    this.unparsed |= !retentionEntity.isValid();
    return this;
  }

  /**
   * <p>The entity whose retention is measured.</p>
   * @return retentionEntity
  **/
      @JsonProperty(JSON_PROPERTY_RETENTION_ENTITY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsRetentionEntity getRetentionEntity() {
        return retentionEntity;
      }
  public void setRetentionEntity(ProductAnalyticsRetentionEntity retentionEntity) {
    if (!retentionEntity.isValid()) {
        this.unparsed = true;
    }
    this.retentionEntity = retentionEntity;
  }
  public ProductAnalyticsRetentionSearch returnCondition(ProductAnalyticsRetentionReturnCondition returnCondition) {
    this.returnCondition = returnCondition;
    this.unparsed |= !returnCondition.isValid();
    return this;
  }

  /**
   * <p>When an entity counts as having returned. Use <code>conversion_on</code> to count only entities that
   * returned during the period itself, or <code>conversion_on_or_after</code> to also count later returns.</p>
   * @return returnCondition
  **/
      @JsonProperty(JSON_PROPERTY_RETURN_CONDITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsRetentionReturnCondition getReturnCondition() {
        return returnCondition;
      }
  public void setReturnCondition(ProductAnalyticsRetentionReturnCondition returnCondition) {
    if (!returnCondition.isValid()) {
        this.unparsed = true;
    }
    this.returnCondition = returnCondition;
  }
  public ProductAnalyticsRetentionSearch returnCriteria(ProductAnalyticsRetentionReturnCriteria returnCriteria) {
    this.returnCriteria = returnCriteria;
    this.unparsed |= returnCriteria.unparsed;
    return this;
  }

  /**
   * <p>Defines the event that counts as a return, and the window in which it must occur.</p>
   * @return returnCriteria
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETURN_CRITERIA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ProductAnalyticsRetentionReturnCriteria getReturnCriteria() {
        return returnCriteria;
      }
  public void setReturnCriteria(ProductAnalyticsRetentionReturnCriteria returnCriteria) {
    this.returnCriteria = returnCriteria;
    if (returnCriteria != null) {
      this.unparsed |= returnCriteria.unparsed;
    }
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsRetentionSearch
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionSearch putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ProductAnalyticsRetentionSearch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionSearch productAnalyticsRetentionSearch = (ProductAnalyticsRetentionSearch) o;
    return Objects.equals(this.cohortCriteria, productAnalyticsRetentionSearch.cohortCriteria) && Objects.equals(this.filters, productAnalyticsRetentionSearch.filters) && Objects.equals(this.retentionEntity, productAnalyticsRetentionSearch.retentionEntity) && Objects.equals(this.returnCondition, productAnalyticsRetentionSearch.returnCondition) && Objects.equals(this.returnCriteria, productAnalyticsRetentionSearch.returnCriteria) && Objects.equals(this.additionalProperties, productAnalyticsRetentionSearch.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cohortCriteria,filters,retentionEntity,returnCondition,returnCriteria, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionSearch {\n");
    sb.append("    cohortCriteria: ").append(toIndentedString(cohortCriteria)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    retentionEntity: ").append(toIndentedString(retentionEntity)).append("\n");
    sb.append("    returnCondition: ").append(toIndentedString(returnCondition)).append("\n");
    sb.append("    returnCriteria: ").append(toIndentedString(returnCriteria)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
