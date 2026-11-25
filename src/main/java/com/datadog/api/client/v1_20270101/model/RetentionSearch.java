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
  RetentionSearch.JSON_PROPERTY_COHORT_CRITERIA,
  RetentionSearch.JSON_PROPERTY_FILTERS,
  RetentionSearch.JSON_PROPERTY_RETENTION_ENTITY,
  RetentionSearch.JSON_PROPERTY_RETURN_CONDITION,
  RetentionSearch.JSON_PROPERTY_RETURN_CRITERIA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionSearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COHORT_CRITERIA = "cohort_criteria";
  private RetentionSearchCohortCriteria cohortCriteria;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private RetentionSearchFilters filters;

  public static final String JSON_PROPERTY_RETENTION_ENTITY = "retention_entity";
  private RetentionSearchRetentionEntity retentionEntity;

  public static final String JSON_PROPERTY_RETURN_CONDITION = "return_condition";
  private RetentionSearchReturnCondition returnCondition;

  public static final String JSON_PROPERTY_RETURN_CRITERIA = "return_criteria";
  private RetentionSearchReturnCriteria returnCriteria;

  public RetentionSearch() {}

  @JsonCreator
  public RetentionSearch(
      @JsonProperty(required = true, value = JSON_PROPERTY_COHORT_CRITERIA)
          RetentionSearchCohortCriteria cohortCriteria,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETENTION_ENTITY)
          RetentionSearchRetentionEntity retentionEntity,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETURN_CONDITION)
          RetentionSearchReturnCondition returnCondition) {
    this.cohortCriteria = cohortCriteria;
    this.unparsed |= cohortCriteria.unparsed;
    this.retentionEntity = retentionEntity;
    this.unparsed |= !retentionEntity.isValid();
    this.returnCondition = returnCondition;
    this.unparsed |= !returnCondition.isValid();
  }

  public RetentionSearch cohortCriteria(RetentionSearchCohortCriteria cohortCriteria) {
    this.cohortCriteria = cohortCriteria;
    this.unparsed |= cohortCriteria.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return cohortCriteria
   */
  @JsonProperty(JSON_PROPERTY_COHORT_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearchCohortCriteria getCohortCriteria() {
    return cohortCriteria;
  }

  public void setCohortCriteria(RetentionSearchCohortCriteria cohortCriteria) {
    this.cohortCriteria = cohortCriteria;
    if (cohortCriteria != null) {
      this.unparsed |= cohortCriteria.unparsed;
    }
  }

  public RetentionSearch filters(RetentionSearchFilters filters) {
    this.filters = filters;
    this.unparsed |= filters.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RetentionSearchFilters getFilters() {
    return filters;
  }

  public void setFilters(RetentionSearchFilters filters) {
    this.filters = filters;
    if (filters != null) {
      this.unparsed |= filters.unparsed;
    }
  }

  public RetentionSearch retentionEntity(RetentionSearchRetentionEntity retentionEntity) {
    this.retentionEntity = retentionEntity;
    this.unparsed |= !retentionEntity.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return retentionEntity
   */
  @JsonProperty(JSON_PROPERTY_RETENTION_ENTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearchRetentionEntity getRetentionEntity() {
    return retentionEntity;
  }

  public void setRetentionEntity(RetentionSearchRetentionEntity retentionEntity) {
    if (!retentionEntity.isValid()) {
      this.unparsed = true;
    }
    this.retentionEntity = retentionEntity;
  }

  public RetentionSearch returnCondition(RetentionSearchReturnCondition returnCondition) {
    this.returnCondition = returnCondition;
    this.unparsed |= !returnCondition.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return returnCondition
   */
  @JsonProperty(JSON_PROPERTY_RETURN_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearchReturnCondition getReturnCondition() {
    return returnCondition;
  }

  public void setReturnCondition(RetentionSearchReturnCondition returnCondition) {
    if (!returnCondition.isValid()) {
      this.unparsed = true;
    }
    this.returnCondition = returnCondition;
  }

  public RetentionSearch returnCriteria(RetentionSearchReturnCriteria returnCriteria) {
    this.returnCriteria = returnCriteria;
    this.unparsed |= returnCriteria.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return returnCriteria
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RetentionSearchReturnCriteria getReturnCriteria() {
    return returnCriteria;
  }

  public void setReturnCriteria(RetentionSearchReturnCriteria returnCriteria) {
    this.returnCriteria = returnCriteria;
    if (returnCriteria != null) {
      this.unparsed |= returnCriteria.unparsed;
    }
  }

  /** Return true if this RetentionSearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionSearch retentionSearch = (RetentionSearch) o;
    return Objects.equals(this.cohortCriteria, retentionSearch.cohortCriteria)
        && Objects.equals(this.filters, retentionSearch.filters)
        && Objects.equals(this.retentionEntity, retentionSearch.retentionEntity)
        && Objects.equals(this.returnCondition, retentionSearch.returnCondition)
        && Objects.equals(this.returnCriteria, retentionSearch.returnCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohortCriteria, filters, retentionEntity, returnCondition, returnCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionSearch {\n");
    sb.append("    cohortCriteria: ").append(toIndentedString(cohortCriteria)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    retentionEntity: ").append(toIndentedString(retentionEntity)).append("\n");
    sb.append("    returnCondition: ").append(toIndentedString(returnCondition)).append("\n");
    sb.append("    returnCriteria: ").append(toIndentedString(returnCriteria)).append("\n");
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
