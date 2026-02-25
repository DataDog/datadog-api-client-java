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
import org.openapitools.jackson.nullable.JsonNullable;

/** */
@JsonPropertyOrder({ProductAnalyticsScalarColumnMeta.JSON_PROPERTY_UNIT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsScalarColumnMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_UNIT = "unit";
  private JsonNullable<List<ProductAnalyticsUnit>> unit =
      JsonNullable.<List<ProductAnalyticsUnit>>undefined();

  public ProductAnalyticsScalarColumnMeta unit(List<ProductAnalyticsUnit> unit) {
    this.unit = JsonNullable.<List<ProductAnalyticsUnit>>of(unit);
    return this;
  }

  public ProductAnalyticsScalarColumnMeta addUnitItem(ProductAnalyticsUnit unitItem) {
    if (this.unit == null || !this.unit.isPresent()) {
      this.unit = JsonNullable.<List<ProductAnalyticsUnit>>of(new ArrayList<>());
    }
    try {
      this.unit.get().add(unitItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Getunit
   *
   * @return unit
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ProductAnalyticsUnit> getUnit() {
    return unit.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ProductAnalyticsUnit>> getUnit_JsonNullable() {
    return unit;
  }

  @JsonProperty(JSON_PROPERTY_UNIT)
  public void setUnit_JsonNullable(JsonNullable<List<ProductAnalyticsUnit>> unit) {
    this.unit = unit;
  }

  public void setUnit(List<ProductAnalyticsUnit> unit) {
    this.unit = JsonNullable.<List<ProductAnalyticsUnit>>of(unit);
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
   * @return ProductAnalyticsScalarColumnMeta
   */
  @JsonAnySetter
  public ProductAnalyticsScalarColumnMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsScalarColumnMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsScalarColumnMeta productAnalyticsScalarColumnMeta =
        (ProductAnalyticsScalarColumnMeta) o;
    return Objects.equals(this.unit, productAnalyticsScalarColumnMeta.unit)
        && Objects.equals(
            this.additionalProperties, productAnalyticsScalarColumnMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsScalarColumnMeta {\n");
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
