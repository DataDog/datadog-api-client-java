/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object containing the metric unit family, scale factor, name, and short name. */
@JsonPropertyOrder({
  MetricsQueryUnit.JSON_PROPERTY_FAMILY,
  MetricsQueryUnit.JSON_PROPERTY_NAME,
  MetricsQueryUnit.JSON_PROPERTY_PLURAL,
  MetricsQueryUnit.JSON_PROPERTY_SCALE_FACTOR,
  MetricsQueryUnit.JSON_PROPERTY_SHORT_NAME
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricsQueryUnit {
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

  /**
   * Unit family, allows for conversion between units of the same family, for scaling.
   *
   * @return family
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFamily() {
    return family;
  }

  /**
   * Unit name
   *
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  /**
   * Plural form of the unit name.
   *
   * @return plural
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLURAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlural() {
    return plural;
  }

  /**
   * Factor for scaling between units of the same family.
   *
   * @return scaleFactor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getScaleFactor() {
    return scaleFactor;
  }

  /**
   * Abbreviation of the unit.
   *
   * @return shortName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShortName() {
    return shortName;
  }

  /** Return true if this MetricsQueryUnit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsQueryUnit metricsQueryUnit = (MetricsQueryUnit) o;
    return Objects.equals(this.family, metricsQueryUnit.family)
        && Objects.equals(this.name, metricsQueryUnit.name)
        && Objects.equals(this.plural, metricsQueryUnit.plural)
        && Objects.equals(this.scaleFactor, metricsQueryUnit.scaleFactor)
        && Objects.equals(this.shortName, metricsQueryUnit.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, name, plural, scaleFactor, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsQueryUnit {\n");
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
