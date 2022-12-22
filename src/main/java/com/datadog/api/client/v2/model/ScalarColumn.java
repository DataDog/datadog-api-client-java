/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A single column in a scalar query response. */
@JsonPropertyOrder({ScalarColumn.JSON_PROPERTY_UNIT, ScalarColumn.JSON_PROPERTY_VALUES})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScalarColumn {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_UNIT = "unit";
  private List<Unit> unit = null;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Double> values = null;

  public ScalarColumn unit(List<Unit> unit) {
    this.unit = unit;
    for (Unit item : unit) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScalarColumn addUnitItem(Unit unitItem) {
    if (this.unit == null) {
      this.unit = new ArrayList<>();
    }
    this.unit.add(unitItem);
    this.unparsed |= unitItem.unparsed;
    return this;
  }

  /**
   * List of units.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Unit> getUnit() {
    return unit;
  }

  public void setUnit(List<Unit> unit) {
    this.unit = unit;
  }

  public ScalarColumn values(List<Double> values) {
    this.values = values;
    return this;
  }

  public ScalarColumn addValuesItem(Double valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Array of values for each group-by combination that results from one formula or query.
   *
   * @return values
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Double> getValues() {
    return values;
  }

  public void setValues(List<Double> values) {
    this.values = values;
  }

  /** Return true if this ScalarColumn object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScalarColumn scalarColumn = (ScalarColumn) o;
    return Objects.equals(this.unit, scalarColumn.unit)
        && Objects.equals(this.values, scalarColumn.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalarColumn {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
