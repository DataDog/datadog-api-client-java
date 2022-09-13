/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Error budget remaining for an SLO. */
@JsonPropertyOrder({
  SLORawErrorBudgetRemaining.JSON_PROPERTY_UNIT,
  SLORawErrorBudgetRemaining.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLORawErrorBudgetRemaining {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public SLORawErrorBudgetRemaining unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Error budget remaining unit.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public SLORawErrorBudgetRemaining value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Error budget remaining value.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  /** Return true if this SLORawErrorBudgetRemaining object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLORawErrorBudgetRemaining sloRawErrorBudgetRemaining = (SLORawErrorBudgetRemaining) o;
    return Objects.equals(this.unit, sloRawErrorBudgetRemaining.unit)
        && Objects.equals(this.value, sloRawErrorBudgetRemaining.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLORawErrorBudgetRemaining {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
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
