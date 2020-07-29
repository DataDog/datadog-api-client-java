/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing the metric unit family, scale factor, name, and short name.
 */
@ApiModel(description = "Object containing the metric unit family, scale factor, name, and short name.")
@JsonPropertyOrder({
  MetricsQueryResponseUnit.JSON_PROPERTY_FAMILY,
  MetricsQueryResponseUnit.JSON_PROPERTY_NAME,
  MetricsQueryResponseUnit.JSON_PROPERTY_PLURAL,
  MetricsQueryResponseUnit.JSON_PROPERTY_SCALE_FACTOR,
  MetricsQueryResponseUnit.JSON_PROPERTY_SHORT_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetricsQueryResponseUnit {
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
   * @return family
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "time", value = "Unit family, allows for conversion between units of the same family, for scaling.")
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamily() {
    return family;
  }




   /**
   * Unit name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "minute", value = "Unit name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * Plural form of the unit name.
   * @return plural
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "minutes", value = "Plural form of the unit name.")
  @JsonProperty(JSON_PROPERTY_PLURAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlural() {
    return plural;
  }




   /**
   * Factor for scaling between units of the same family.
   * @return scaleFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60.0", value = "Factor for scaling between units of the same family.")
  @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScaleFactor() {
    return scaleFactor;
  }




   /**
   * Abbreviation of the unit.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "min", value = "Abbreviation of the unit.")
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortName() {
    return shortName;
  }




  /**
   * Return true if this MetricsQueryResponse_unit object is equal to o.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricsQueryResponseUnit metricsQueryResponseUnit = (MetricsQueryResponseUnit) o;
    return Objects.equals(this.family, metricsQueryResponseUnit.family) &&
        Objects.equals(this.name, metricsQueryResponseUnit.name) &&
        Objects.equals(this.plural, metricsQueryResponseUnit.plural) &&
        Objects.equals(this.scaleFactor, metricsQueryResponseUnit.scaleFactor) &&
        Objects.equals(this.shortName, metricsQueryResponseUnit.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, name, plural, scaleFactor, shortName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricsQueryResponseUnit {\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

