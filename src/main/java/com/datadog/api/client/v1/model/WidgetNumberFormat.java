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

/** Number format options for the widget. */
@JsonPropertyOrder({
  WidgetNumberFormat.JSON_PROPERTY_UNIT,
  WidgetNumberFormat.JSON_PROPERTY_UNIT_SCALE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetNumberFormat {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_UNIT = "unit";
  private NumberFormatUnit unit;

  public static final String JSON_PROPERTY_UNIT_SCALE = "unit_scale";
  private JsonNullable<NumberFormatUnitScale> unitScale =
      JsonNullable.<NumberFormatUnitScale>undefined();

  public WidgetNumberFormat unit(NumberFormatUnit unit) {
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

  public WidgetNumberFormat unitScale(NumberFormatUnitScale unitScale) {
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
   * @return WidgetNumberFormat
   */
  @JsonAnySetter
  public WidgetNumberFormat putAdditionalProperty(String key, Object value) {
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
    return Objects.equals(this.unit, widgetNumberFormat.unit)
        && Objects.equals(this.unitScale, widgetNumberFormat.unitScale)
        && Objects.equals(this.additionalProperties, widgetNumberFormat.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, unitScale, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetNumberFormat {\n");
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
