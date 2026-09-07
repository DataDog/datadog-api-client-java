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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Geographic location information for an IP indicator. */
@JsonPropertyOrder({
  IoCGeoLocation.JSON_PROPERTY_CITY,
  IoCGeoLocation.JSON_PROPERTY_COUNTRY_CODE,
  IoCGeoLocation.JSON_PROPERTY_COUNTRY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IoCGeoLocation {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_COUNTRY_NAME = "country_name";
  private String countryName;

  public IoCGeoLocation city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City name.
   *
   * @return city
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public IoCGeoLocation countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO country code.
   *
   * @return countryCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public IoCGeoLocation countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Full country name.
   *
   * @return countryName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
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
   * @return IoCGeoLocation
   */
  @JsonAnySetter
  public IoCGeoLocation putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IoCGeoLocation object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCGeoLocation ioCGeoLocation = (IoCGeoLocation) o;
    return Objects.equals(this.city, ioCGeoLocation.city)
        && Objects.equals(this.countryCode, ioCGeoLocation.countryCode)
        && Objects.equals(this.countryName, ioCGeoLocation.countryName)
        && Objects.equals(this.additionalProperties, ioCGeoLocation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, countryCode, countryName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCGeoLocation {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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
