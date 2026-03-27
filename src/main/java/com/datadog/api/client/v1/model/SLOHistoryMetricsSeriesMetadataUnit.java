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

/** An Object of metric units. */
@JsonPropertyOrder({
  SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_FAMILY,
  SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_ID,
  SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_NAME,
  SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_PLURAL,
  SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_SCALE_FACTOR,
  SLOHistoryMetricsSeriesMetadataUnit.JSON_PROPERTY_SHORT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOHistoryMetricsSeriesMetadataUnit {
  @JsonIgnore public boolean unparsed = false;
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
   * The family of metric unit, for example <code>bytes</code> is the family for <code>kibibyte
   * </code>, <code>byte</code>, and <code>bit</code> units.
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

  public SLOHistoryMetricsSeriesMetadataUnit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the metric unit.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
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
   * The unit of the metric, for instance <code>byte</code>.
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

  public SLOHistoryMetricsSeriesMetadataUnit plural(String plural) {
    this.plural = JsonNullable.<String>of(plural);
    return this;
  }

  /**
   * The plural Unit of metric, for instance <code>bytes</code>.
   *
   * @return plural
   */
  @jakarta.annotation.Nullable
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
   * The scale factor of metric unit, for instance <code>1.0</code>.
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

  public SLOHistoryMetricsSeriesMetadataUnit shortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
    return this;
  }

  /**
   * A shorter and abbreviated version of the metric unit, for instance <code>B</code>.
   *
   * @return shortName
   */
  @jakarta.annotation.Nullable
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
   * @return SLOHistoryMetricsSeriesMetadataUnit
   */
  @JsonAnySetter
  public SLOHistoryMetricsSeriesMetadataUnit putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SLOHistoryMetricsSeriesMetadataUnit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOHistoryMetricsSeriesMetadataUnit sloHistoryMetricsSeriesMetadataUnit =
        (SLOHistoryMetricsSeriesMetadataUnit) o;
    return Objects.equals(this.family, sloHistoryMetricsSeriesMetadataUnit.family)
        && Objects.equals(this.id, sloHistoryMetricsSeriesMetadataUnit.id)
        && Objects.equals(this.name, sloHistoryMetricsSeriesMetadataUnit.name)
        && Objects.equals(this.plural, sloHistoryMetricsSeriesMetadataUnit.plural)
        && Objects.equals(this.scaleFactor, sloHistoryMetricsSeriesMetadataUnit.scaleFactor)
        && Objects.equals(this.shortName, sloHistoryMetricsSeriesMetadataUnit.shortName)
        && Objects.equals(
            this.additionalProperties, sloHistoryMetricsSeriesMetadataUnit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, id, name, plural, scaleFactor, shortName, additionalProperties);
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
