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

import com.datadog.api.v1.client.JSON;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An Object of metric units.
 */
@ApiModel(description = "An Object of metric units.")
@JsonPropertyOrder(
    {
        SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_FAMILY,
        SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_ID,
        SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_NAME,
        SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_PLURAL,
        SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_SCALE_FACTOR,
        SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_SHORT_NAME
    }
)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SLOHistoryMetricsSeriesMetadataUnit {

    @JsonIgnore
    public boolean unparsed = false;

    public static final String JSON_PROPERTY_FAMILY = "family";
    private String family;

    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_PLURAL = "plural";
    private JsonNullable<String> plural = JsonNullable.<String>undefined();

    public static final String JSON_PROPERTY_SCALE_FACTOR = "scale_factor";
    private Double scaleFactor;

    public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
    private JsonNullable<String> shortName = JsonNullable.<String>undefined();

    public SLOHistoryMetricsSeriesMetadataUnit family(String family) {
        this.family = family;
        return this;
    }

    /**
     * The family of metric unit, for example &#x60;bytes&#x60; is the family for &#x60;kibibyte&#x60;, &#x60;byte&#x60;, and &#x60;bit&#x60; units.
     * @return family
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The family of metric unit, for example `bytes` is the family for `kibibyte`, `byte`, and `bit` units.")
    @JsonProperty(JSON_PROPERTY_FAMILY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public SLOHistoryMetricsSeriesMetadataUnit id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the metric unit.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The ID of the metric unit.")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SLOHistoryMetricsSeriesMetadataUnit name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The unit of the metric, for instance &#x60;byte&#x60;.
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The unit of the metric, for instance `byte`.")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SLOHistoryMetricsSeriesMetadataUnit plural(String plural) {
        this.plural = JsonNullable.<String>of(plural);
        return this;
    }

    /**
     * The plural Unit of metric, for instance &#x60;bytes&#x60;.
     * @return plural
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The plural Unit of metric, for instance `bytes`.")
    @JsonIgnore
    public String getPlural() {
        return plural.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_PLURAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getPlural_JsonNullable() {
        return plural;
    }

    @JsonProperty(JSON_PROPERTY_PLURAL)
    public void setPlural_JsonNullable(JsonNullable<String> plural) {
        this.plural = plural;
    }

    public void setPlural(String plural) {
        this.plural = JsonNullable.<String>of(plural);
    }

    public SLOHistoryMetricsSeriesMetadataUnit scaleFactor(Double scaleFactor) {
        this.scaleFactor = scaleFactor;
        return this;
    }

    /**
     * The scale factor of metric unit, for instance &#x60;1.0&#x60;.
     * @return scaleFactor
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The scale factor of metric unit, for instance `1.0`.")
    @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(Double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public SLOHistoryMetricsSeriesMetadataUnit shortName(String shortName) {
        this.shortName = JsonNullable.<String>of(shortName);
        return this;
    }

    /**
     * A shorter and abbreviated version of the metric unit, for instance &#x60;B&#x60;.
     * @return shortName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A shorter and abbreviated version of the metric unit, for instance `B`.")
    @JsonIgnore
    public String getShortName() {
        return shortName.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_SHORT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getShortName_JsonNullable() {
        return shortName;
    }

    @JsonProperty(JSON_PROPERTY_SHORT_NAME)
    public void setShortName_JsonNullable(JsonNullable<String> shortName) {
        this.shortName = shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = JsonNullable.<String>of(shortName);
    }

    /**
     * Return true if this SLOHistoryMetricsSeriesMetadataUnit object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SLOHistoryMetricsSeriesMetadataUnit slOHistoryMetricsSeriesMetadataUnit = (SLOHistoryMetricsSeriesMetadataUnit) o;
        return (
            Objects.equals(this.family, slOHistoryMetricsSeriesMetadataUnit.family) &&
            Objects.equals(this.id, slOHistoryMetricsSeriesMetadataUnit.id) &&
            Objects.equals(this.name, slOHistoryMetricsSeriesMetadataUnit.name) &&
            Objects.equals(this.plural, slOHistoryMetricsSeriesMetadataUnit.plural) &&
            Objects.equals(this.scaleFactor, slOHistoryMetricsSeriesMetadataUnit.scaleFactor) &&
            Objects.equals(this.shortName, slOHistoryMetricsSeriesMetadataUnit.shortName)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, id, name, plural, scaleFactor, shortName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SLOHistoryMetricsSeriesMetadataUnit {\n");
        sb.append("    family: ").append(toIndentedString(family)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
