/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
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
   * <p>A unit definition for metric values.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsUnit.JSON_PROPERTY_FAMILY,
  ProductAnalyticsUnit.JSON_PROPERTY_ID,
  ProductAnalyticsUnit.JSON_PROPERTY_NAME,
  ProductAnalyticsUnit.JSON_PROPERTY_PLURAL,
  ProductAnalyticsUnit.JSON_PROPERTY_SCALE_FACTOR,
  ProductAnalyticsUnit.JSON_PROPERTY_SHORT_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsUnit {
  @JsonIgnore
  public boolean unparsed = false;
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

  public ProductAnalyticsUnit family(String family) {
    this.family = family;
    return this;
  }

  /**
   * <p>Getfamily</p>
   * @return family
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FAMILY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getFamily() {
        return family;
      }
  public void setFamily(String family) {
    this.family = family;
  }
  public ProductAnalyticsUnit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getid</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getId() {
        return id;
      }
  public void setId(Long id) {
    this.id = id;
  }
  public ProductAnalyticsUnit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getname</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public ProductAnalyticsUnit plural(String plural) {
    this.plural = plural;
    return this;
  }

  /**
   * <p>Getplural</p>
   * @return plural
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PLURAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPlural() {
        return plural;
      }
  public void setPlural(String plural) {
    this.plural = plural;
  }
  public ProductAnalyticsUnit scaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

  /**
   * <p>GetscaleFactor</p>
   * @return scaleFactor
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getScaleFactor() {
        return scaleFactor;
      }
  public void setScaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
  }
  public ProductAnalyticsUnit shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * <p>GetshortName</p>
   * @return shortName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHORT_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getShortName() {
        return shortName;
      }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ProductAnalyticsUnit
   */
  @JsonAnySetter
  public ProductAnalyticsUnit putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ProductAnalyticsUnit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsUnit productAnalyticsUnit = (ProductAnalyticsUnit) o;
    return Objects.equals(this.family, productAnalyticsUnit.family) && Objects.equals(this.id, productAnalyticsUnit.id) && Objects.equals(this.name, productAnalyticsUnit.name) && Objects.equals(this.plural, productAnalyticsUnit.plural) && Objects.equals(this.scaleFactor, productAnalyticsUnit.scaleFactor) && Objects.equals(this.shortName, productAnalyticsUnit.shortName) && Objects.equals(this.additionalProperties, productAnalyticsUnit.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(family,id,name,plural,scaleFactor,shortName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsUnit {\n");
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
