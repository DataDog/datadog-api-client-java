/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Object containing the metric unit family, scale factor, name, and short name.</p>
 */
@JsonPropertyOrder({
  MetricsQueryUnit.JSON_PROPERTY_FAMILY,
  MetricsQueryUnit.JSON_PROPERTY_NAME,
  MetricsQueryUnit.JSON_PROPERTY_PLURAL,
  MetricsQueryUnit.JSON_PROPERTY_SCALE_FACTOR,
  MetricsQueryUnit.JSON_PROPERTY_SHORT_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricsQueryUnit {
  @JsonIgnore
  public boolean unparsed = false;
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
   * <p>Unit family, allows for conversion between units of the same family, for scaling.</p>
   * @return family
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FAMILY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFamily() {
        return family;
      }

  /**
   * <p>Unit name</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }

  /**
   * <p>Plural form of the unit name.</p>
   * @return plural
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PLURAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPlural() {
        return plural;
      }

  /**
   * <p>Factor for scaling between units of the same family.</p>
   * @return scaleFactor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getScaleFactor() {
        return scaleFactor;
      }

  /**
   * <p>Abbreviation of the unit.</p>
   * @return shortName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHORT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getShortName() {
        return shortName;
      }

  /**
   * Return true if this MetricsQueryUnit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsQueryUnit metricsQueryUnit = (MetricsQueryUnit) o;
    return Objects.equals(this.family, metricsQueryUnit.family) && Objects.equals(this.name, metricsQueryUnit.name) && Objects.equals(this.plural, metricsQueryUnit.plural) && Objects.equals(this.scaleFactor, metricsQueryUnit.scaleFactor) && Objects.equals(this.shortName, metricsQueryUnit.shortName);
  }


  @Override
  public int hashCode() {
    return Objects.hash(family,name,plural,scaleFactor,shortName);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
