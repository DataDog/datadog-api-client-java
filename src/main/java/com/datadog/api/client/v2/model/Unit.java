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
import java.util.Objects;

/** Object containing the metric unit family, scale factor, name, and short name. */
@JsonPropertyOrder({
  Unit.JSON_PROPERTY_FAMILY,
  Unit.JSON_PROPERTY_NAME,
  Unit.JSON_PROPERTY_PLURAL,
  Unit.JSON_PROPERTY_SCALE_FACTOR,
  Unit.JSON_PROPERTY_SHORT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Unit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAMILY = "family";
  private String family;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLURAL = "plural";
  private String plural;

  public static final String JSON_PROPERTY_SCALE_FACTOR = "scale_factor";
  private Double scaleFactor;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public Unit family(String family) {
    this.family = family;
    return this;
  }

  /**
   * Unit family, allows for conversion between units of the same family, for scaling.
   *
   * @return family
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public Unit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unit name
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Unit plural(String plural) {
    this.plural = plural;
    return this;
  }

  /**
   * Plural form of the unit name.
   *
   * @return plural
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLURAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }

  public Unit scaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

  /**
   * Factor for scaling between units of the same family.
   *
   * @return scaleFactor
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
  }

  public Unit shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Abbreviation of the unit.
   *
   * @return shortName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  /** Return true if this Unit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unit unit = (Unit) o;
    return Objects.equals(this.family, unit.family)
        && Objects.equals(this.name, unit.name)
        && Objects.equals(this.plural, unit.plural)
        && Objects.equals(this.scaleFactor, unit.scaleFactor)
        && Objects.equals(this.shortName, unit.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, name, plural, scaleFactor, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    scaleFactor: ").append(toIndentedString(scaleFactor)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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
