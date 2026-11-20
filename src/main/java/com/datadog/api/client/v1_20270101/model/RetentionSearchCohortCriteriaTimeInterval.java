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
  RetentionSearchCohortCriteriaTimeInterval.JSON_PROPERTY_TYPE,
  RetentionSearchCohortCriteriaTimeInterval.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RetentionSearchCohortCriteriaTimeInterval {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private RetentionSearchCohortCriteriaTimeIntervalType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private RetentionSearchCohortCriteriaTimeInterval20270101Value value;

  public RetentionSearchCohortCriteriaTimeInterval() {}

  @JsonCreator
  public RetentionSearchCohortCriteriaTimeInterval(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          RetentionSearchCohortCriteriaTimeIntervalType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE)
          RetentionSearchCohortCriteriaTimeInterval20270101Value value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
    this.unparsed |= value.unparsed;
  }

  public RetentionSearchCohortCriteriaTimeInterval type(
      RetentionSearchCohortCriteriaTimeIntervalType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearchCohortCriteriaTimeIntervalType getType() {
    return type;
  }

  public void setType(RetentionSearchCohortCriteriaTimeIntervalType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public RetentionSearchCohortCriteriaTimeInterval value(
      RetentionSearchCohortCriteriaTimeInterval20270101Value value) {
    this.value = value;
    this.unparsed |= value.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetentionSearchCohortCriteriaTimeInterval20270101Value getValue() {
    return value;
  }

  public void setValue(RetentionSearchCohortCriteriaTimeInterval20270101Value value) {
    this.value = value;
    if (value != null) {
      this.unparsed |= value.unparsed;
    }
  }

  /** Return true if this RetentionSearchCohortCriteriaTimeInterval object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionSearchCohortCriteriaTimeInterval retentionSearchCohortCriteriaTimeInterval =
        (RetentionSearchCohortCriteriaTimeInterval) o;
    return Objects.equals(this.type, retentionSearchCohortCriteriaTimeInterval.type)
        && Objects.equals(this.value, retentionSearchCohortCriteriaTimeInterval.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionSearchCohortCriteriaTimeInterval {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
