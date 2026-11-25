/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonPropertyOrder({
  WidgetNumberFormat.JSON_PROPERTY_PRECISION,
  WidgetNumberFormat.JSON_PROPERTY_UNIT,
  WidgetNumberFormat.JSON_PROPERTY_UNIT_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetNumberFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRECISION = "precision";
  private Precision precision;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private NumberFormatUnit unit;

  public static final String JSON_PROPERTY_UNIT_SCALE = "unit_scale";
  private JsonNullable<NumberFormatUnitScale> unitScale =
      JsonNullable.<NumberFormatUnitScale>undefined();

  public WidgetNumberFormat precision(Precision precision) {
    this.precision = precision;
    this.unparsed |= precision.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return precision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Precision getPrecision() {
    return precision;
  }

  public void setPrecision(Precision precision) {
    this.precision = precision;
    if (precision != null) {
      this.unparsed |= precision.unparsed;
    }
  }

  public WidgetNumberFormat unit(NumberFormatUnit unit) {
    this.unit = unit;
    this.unparsed |= unit.unparsed;
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NumberFormatUnit getUnit() {
    return unit;
  }

  public void setUnit(NumberFormatUnit unit) {
    this.unit = unit;
    if (unit != null) {
      this.unparsed |= unit.unparsed;
    }
  }

  public WidgetNumberFormat unitScale(NumberFormatUnitScale unitScale) {
    this.unitScale = JsonNullable.<NumberFormatUnitScale>of(unitScale);
    return this;
  }

  /**
   * Test-only generated schema for the dashboard versioning proof of concept.
   *
   * @return unitScale
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public NumberFormatUnitScale getUnitScale() {
    return unitScale.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIT_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<NumberFormatUnitScale> getUnitScale_JsonNullable() {
    return unitScale;
  }

  @JsonProperty(JSON_PROPERTY_UNIT_SCALE)
  public void setUnitScale_JsonNullable(JsonNullable<NumberFormatUnitScale> unitScale) {
    this.unitScale = unitScale;
  }

  public void setUnitScale(NumberFormatUnitScale unitScale) {
    this.unitScale = JsonNullable.<NumberFormatUnitScale>of(unitScale);
  }

  /** Return true if this WidgetNumberFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetNumberFormat widgetNumberFormat = (WidgetNumberFormat) o;
    return Objects.equals(this.precision, widgetNumberFormat.precision)
        && Objects.equals(this.unit, widgetNumberFormat.unit)
        && Objects.equals(this.unitScale, widgetNumberFormat.unitScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precision, unit, unitScale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetNumberFormat {\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitScale: ").append(toIndentedString(unitScale)).append("\n");
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
