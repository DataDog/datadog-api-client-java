/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of a unit cost create or replace request. */
@JsonPropertyOrder({
  UnitCostRequestAttributes.JSON_PROPERTY_DENOMINATOR_QUERY,
  UnitCostRequestAttributes.JSON_PROPERTY_DESCRIPTION,
  UnitCostRequestAttributes.JSON_PROPERTY_NAME,
  UnitCostRequestAttributes.JSON_PROPERTY_NUMERATOR_QUERY,
  UnitCostRequestAttributes.JSON_PROPERTY_UNIT_LABEL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UnitCostRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DENOMINATOR_QUERY = "denominator_query";
  private UnitCostQueryDefinition denominatorQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMERATOR_QUERY = "numerator_query";
  private UnitCostQueryDefinition numeratorQuery;

  public static final String JSON_PROPERTY_UNIT_LABEL = "unit_label";
  private String unitLabel;

  public UnitCostRequestAttributes() {}

  @JsonCreator
  public UnitCostRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DENOMINATOR_QUERY)
          UnitCostQueryDefinition denominatorQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMERATOR_QUERY)
          UnitCostQueryDefinition numeratorQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT_LABEL) String unitLabel) {
    this.denominatorQuery = denominatorQuery;
    this.unparsed |= denominatorQuery.unparsed;
    this.name = name;
    this.numeratorQuery = numeratorQuery;
    this.unparsed |= numeratorQuery.unparsed;
    this.unitLabel = unitLabel;
  }

  public UnitCostRequestAttributes denominatorQuery(UnitCostQueryDefinition denominatorQuery) {
    this.denominatorQuery = denominatorQuery;
    this.unparsed |= denominatorQuery.unparsed;
    return this;
  }

  /**
   * A timeseries object containing <code>queries</code> and <code>formulas</code> arrays.
   *
   * @return denominatorQuery
   */
  @JsonProperty(JSON_PROPERTY_DENOMINATOR_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UnitCostQueryDefinition getDenominatorQuery() {
    return denominatorQuery;
  }

  public void setDenominatorQuery(UnitCostQueryDefinition denominatorQuery) {
    this.denominatorQuery = denominatorQuery;
    if (denominatorQuery != null) {
      this.unparsed |= denominatorQuery.unparsed;
    }
  }

  public UnitCostRequestAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * An optional description of the unit cost. At most 2000 characters.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public UnitCostRequestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the unit cost. At most 200 characters.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UnitCostRequestAttributes numeratorQuery(UnitCostQueryDefinition numeratorQuery) {
    this.numeratorQuery = numeratorQuery;
    this.unparsed |= numeratorQuery.unparsed;
    return this;
  }

  /**
   * A timeseries object containing <code>queries</code> and <code>formulas</code> arrays.
   *
   * @return numeratorQuery
   */
  @JsonProperty(JSON_PROPERTY_NUMERATOR_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UnitCostQueryDefinition getNumeratorQuery() {
    return numeratorQuery;
  }

  public void setNumeratorQuery(UnitCostQueryDefinition numeratorQuery) {
    this.numeratorQuery = numeratorQuery;
    if (numeratorQuery != null) {
      this.unparsed |= numeratorQuery.unparsed;
    }
  }

  public UnitCostRequestAttributes unitLabel(String unitLabel) {
    this.unitLabel = unitLabel;
    return this;
  }

  /**
   * The label describing the denominator unit, for example <code>user</code>. At most 100
   * characters.
   *
   * @return unitLabel
   */
  @JsonProperty(JSON_PROPERTY_UNIT_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUnitLabel() {
    return unitLabel;
  }

  public void setUnitLabel(String unitLabel) {
    this.unitLabel = unitLabel;
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
   * @return UnitCostRequestAttributes
   */
  @JsonAnySetter
  public UnitCostRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UnitCostRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitCostRequestAttributes unitCostRequestAttributes = (UnitCostRequestAttributes) o;
    return Objects.equals(this.denominatorQuery, unitCostRequestAttributes.denominatorQuery)
        && Objects.equals(this.description, unitCostRequestAttributes.description)
        && Objects.equals(this.name, unitCostRequestAttributes.name)
        && Objects.equals(this.numeratorQuery, unitCostRequestAttributes.numeratorQuery)
        && Objects.equals(this.unitLabel, unitCostRequestAttributes.unitLabel)
        && Objects.equals(
            this.additionalProperties, unitCostRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        denominatorQuery, description, name, numeratorQuery, unitLabel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitCostRequestAttributes {\n");
    sb.append("    denominatorQuery: ").append(toIndentedString(denominatorQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numeratorQuery: ").append(toIndentedString(numeratorQuery)).append("\n");
    sb.append("    unitLabel: ").append(toIndentedString(unitLabel)).append("\n");
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
