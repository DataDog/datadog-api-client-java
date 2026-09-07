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

/** Unit metadata for a numeric metric. */
@JsonPropertyOrder({
  CommitmentsUnit.JSON_PROPERTY_FAMILY,
  CommitmentsUnit.JSON_PROPERTY_ID,
  CommitmentsUnit.JSON_PROPERTY_NAME,
  CommitmentsUnit.JSON_PROPERTY_PLURAL,
  CommitmentsUnit.JSON_PROPERTY_SCALE_FACTOR,
  CommitmentsUnit.JSON_PROPERTY_SHORT_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsUnit {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FAMILY = "family";
  private String family;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLURAL = "plural";
  private String plural;

  public static final String JSON_PROPERTY_SCALE_FACTOR = "scale_factor";
  private Double scaleFactor;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public CommitmentsUnit() {}

  @JsonCreator
  public CommitmentsUnit(
      @JsonProperty(required = true, value = JSON_PROPERTY_FAMILY) String family,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) Long id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PLURAL) String plural,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCALE_FACTOR) Double scaleFactor,
      @JsonProperty(required = true, value = JSON_PROPERTY_SHORT_NAME) String shortName) {
    this.family = family;
    this.id = id;
    this.name = name;
    this.plural = plural;
    this.scaleFactor = scaleFactor;
    this.shortName = shortName;
  }

  public CommitmentsUnit family(String family) {
    this.family = family;
    return this;
  }

  /**
   * The unit family (for example, percentage or money).
   *
   * @return family
   */
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public CommitmentsUnit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unit identifier.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CommitmentsUnit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The unit name (for example, percent or dollar).
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

  public CommitmentsUnit plural(String plural) {
    this.plural = plural;
    return this;
  }

  /**
   * The plural form of the unit name.
   *
   * @return plural
   */
  @JsonProperty(JSON_PROPERTY_PLURAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }

  public CommitmentsUnit scaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

  /**
   * The scale factor for the unit.
   *
   * @return scaleFactor
   */
  @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
  }

  public CommitmentsUnit shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * The abbreviated unit name (for example, % or $).
   *
   * @return shortName
   */
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
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
   * @return CommitmentsUnit
   */
  @JsonAnySetter
  public CommitmentsUnit putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsUnit object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsUnit commitmentsUnit = (CommitmentsUnit) o;
    return Objects.equals(this.family, commitmentsUnit.family)
        && Objects.equals(this.id, commitmentsUnit.id)
        && Objects.equals(this.name, commitmentsUnit.name)
        && Objects.equals(this.plural, commitmentsUnit.plural)
        && Objects.equals(this.scaleFactor, commitmentsUnit.scaleFactor)
        && Objects.equals(this.shortName, commitmentsUnit.shortName)
        && Objects.equals(this.additionalProperties, commitmentsUnit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, id, name, plural, scaleFactor, shortName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsUnit {\n");
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
