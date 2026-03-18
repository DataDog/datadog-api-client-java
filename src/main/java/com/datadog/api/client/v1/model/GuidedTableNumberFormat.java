/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Number display format for a guided table column value. */
@JsonPropertyOrder({
  GuidedTableNumberFormat.JSON_PROPERTY_PRECISION,
  GuidedTableNumberFormat.JSON_PROPERTY_UNIT,
  GuidedTableNumberFormat.JSON_PROPERTY_UNIT_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GuidedTableNumberFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PRECISION = "precision";
  private GuidedTableNumberFormatPrecision precision;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private NumberFormatUnit unit;

  public static final String JSON_PROPERTY_UNIT_SCALE = "unit_scale";
  private JsonNullable<NumberFormatUnitScale> unitScale =
      JsonNullable.<NumberFormatUnitScale>undefined();

  public GuidedTableNumberFormat precision(GuidedTableNumberFormatPrecision precision) {
    this.precision = precision;
    this.unparsed |= precision.unparsed;
    return this;
  }

  /**
   * Number of digits after the decimal point. Use <code>*</code> for full precision, <code>integer
   * </code> to show full integer values, or omit for automatic precision.
   *
   * @return precision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRECISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GuidedTableNumberFormatPrecision getPrecision() {
    return precision;
  }

  public void setPrecision(GuidedTableNumberFormatPrecision precision) {
    this.precision = precision;
  }

  public GuidedTableNumberFormat unit(NumberFormatUnit unit) {
    this.unit = unit;
    this.unparsed |= unit.unparsed;
    return this;
  }

  /**
   * Number format unit.
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
  }

  public GuidedTableNumberFormat unitScale(NumberFormatUnitScale unitScale) {
    this.unitScale = JsonNullable.<NumberFormatUnitScale>of(unitScale);
    return this;
  }

  /**
   * The definition of <code>NumberFormatUnitScale</code> object.
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
   * @return GuidedTableNumberFormat
   */
  @JsonAnySetter
  public GuidedTableNumberFormat putAdditionalProperty(String key, Object value) {
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

  /** Return true if this GuidedTableNumberFormat object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuidedTableNumberFormat guidedTableNumberFormat = (GuidedTableNumberFormat) o;
    return Objects.equals(this.precision, guidedTableNumberFormat.precision)
        && Objects.equals(this.unit, guidedTableNumberFormat.unit)
        && Objects.equals(this.unitScale, guidedTableNumberFormat.unitScale)
        && Objects.equals(this.additionalProperties, guidedTableNumberFormat.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(precision, unit, unitScale, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuidedTableNumberFormat {\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitScale: ").append(toIndentedString(unitScale)).append("\n");
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
