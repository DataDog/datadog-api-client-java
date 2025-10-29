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

/** */
@JsonPropertyOrder({
  GetCohortResponseDataAttributesCohortsItems.JSON_PROPERTY_COHORT,
  GetCohortResponseDataAttributesCohortsItems.JSON_PROPERTY_COHORT_SIZE,
  GetCohortResponseDataAttributesCohortsItems.JSON_PROPERTY_START_TIME,
  GetCohortResponseDataAttributesCohortsItems.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetCohortResponseDataAttributesCohortsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COHORT = "cohort";
  private String cohort;

  public static final String JSON_PROPERTY_COHORT_SIZE = "cohort_size";
  private Long cohortSize;

  public static final String JSON_PROPERTY_START_TIME = "start_time";
  private Long startTime;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<GetCohortResponseDataAttributesCohortsItemsValuesItems> values = null;

  public GetCohortResponseDataAttributesCohortsItems cohort(String cohort) {
    this.cohort = cohort;
    return this;
  }

  /**
   * Getcohort
   *
   * @return cohort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCohort() {
    return cohort;
  }

  public void setCohort(String cohort) {
    this.cohort = cohort;
  }

  public GetCohortResponseDataAttributesCohortsItems cohortSize(Long cohortSize) {
    this.cohortSize = cohortSize;
    return this;
  }

  /**
   * GetcohortSize
   *
   * @return cohortSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COHORT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCohortSize() {
    return cohortSize;
  }

  public void setCohortSize(Long cohortSize) {
    this.cohortSize = cohortSize;
  }

  public GetCohortResponseDataAttributesCohortsItems startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * GetstartTime
   *
   * @return startTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public GetCohortResponseDataAttributesCohortsItems values(
      List<GetCohortResponseDataAttributesCohortsItemsValuesItems> values) {
    this.values = values;
    for (GetCohortResponseDataAttributesCohortsItemsValuesItems item : values) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public GetCohortResponseDataAttributesCohortsItems addValuesItem(
      GetCohortResponseDataAttributesCohortsItemsValuesItems valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    this.unparsed |= valuesItem.unparsed;
    return this;
  }

  /**
   * Getvalues
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<GetCohortResponseDataAttributesCohortsItemsValuesItems> getValues() {
    return values;
  }

  public void setValues(List<GetCohortResponseDataAttributesCohortsItemsValuesItems> values) {
    this.values = values;
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
   * @return GetCohortResponseDataAttributesCohortsItems
   */
  @JsonAnySetter
  public GetCohortResponseDataAttributesCohortsItems putAdditionalProperty(
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

  /** Return true if this GetCohortResponseDataAttributesCohortsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCohortResponseDataAttributesCohortsItems getCohortResponseDataAttributesCohortsItems =
        (GetCohortResponseDataAttributesCohortsItems) o;
    return Objects.equals(this.cohort, getCohortResponseDataAttributesCohortsItems.cohort)
        && Objects.equals(this.cohortSize, getCohortResponseDataAttributesCohortsItems.cohortSize)
        && Objects.equals(this.startTime, getCohortResponseDataAttributesCohortsItems.startTime)
        && Objects.equals(this.values, getCohortResponseDataAttributesCohortsItems.values)
        && Objects.equals(
            this.additionalProperties,
            getCohortResponseDataAttributesCohortsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cohort, cohortSize, startTime, values, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCohortResponseDataAttributesCohortsItems {\n");
    sb.append("    cohort: ").append(toIndentedString(cohort)).append("\n");
    sb.append("    cohortSize: ").append(toIndentedString(cohortSize)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
