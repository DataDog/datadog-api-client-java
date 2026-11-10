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

/**
 * Location derived from the device's public IP address. Absent when no location data is available.
 */
@JsonPropertyOrder({
  DeviceGeoIP.JSON_PROPERTY_GEO_CITY,
  DeviceGeoIP.JSON_PROPERTY_GEO_COUNTRY_ISO_CODE,
  DeviceGeoIP.JSON_PROPERTY_GEO_LATITUDE,
  DeviceGeoIP.JSON_PROPERTY_GEO_LONGITUDE,
  DeviceGeoIP.JSON_PROPERTY_GEO_SUBDIVISION_ISO_CODE,
  DeviceGeoIP.JSON_PROPERTY_PUBLIC_IP_ADDRESS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeviceGeoIP {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_GEO_CITY = "geo_city";
  private String geoCity;

  public static final String JSON_PROPERTY_GEO_COUNTRY_ISO_CODE = "geo_country_iso_code";
  private String geoCountryIsoCode;

  public static final String JSON_PROPERTY_GEO_LATITUDE = "geo_latitude";
  private Double geoLatitude;

  public static final String JSON_PROPERTY_GEO_LONGITUDE = "geo_longitude";
  private Double geoLongitude;

  public static final String JSON_PROPERTY_GEO_SUBDIVISION_ISO_CODE = "geo_subdivision_iso_code";
  private String geoSubdivisionIsoCode;

  public static final String JSON_PROPERTY_PUBLIC_IP_ADDRESS = "public_ip_address";
  private String publicIpAddress;

  public DeviceGeoIP geoCity(String geoCity) {
    this.geoCity = geoCity;
    return this;
  }

  /**
   * City resolved from the device's public IP address.
   *
   * @return geoCity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGeoCity() {
    return geoCity;
  }

  public void setGeoCity(String geoCity) {
    this.geoCity = geoCity;
  }

  public DeviceGeoIP geoCountryIsoCode(String geoCountryIsoCode) {
    this.geoCountryIsoCode = geoCountryIsoCode;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 country code resolved from the device's public IP address.
   *
   * @return geoCountryIsoCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_COUNTRY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGeoCountryIsoCode() {
    return geoCountryIsoCode;
  }

  public void setGeoCountryIsoCode(String geoCountryIsoCode) {
    this.geoCountryIsoCode = geoCountryIsoCode;
  }

  public DeviceGeoIP geoLatitude(Double geoLatitude) {
    this.geoLatitude = geoLatitude;
    return this;
  }

  /**
   * Latitude resolved from the device's public IP address.
   *
   * @return geoLatitude
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGeoLatitude() {
    return geoLatitude;
  }

  public void setGeoLatitude(Double geoLatitude) {
    this.geoLatitude = geoLatitude;
  }

  public DeviceGeoIP geoLongitude(Double geoLongitude) {
    this.geoLongitude = geoLongitude;
    return this;
  }

  /**
   * Longitude resolved from the device's public IP address.
   *
   * @return geoLongitude
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getGeoLongitude() {
    return geoLongitude;
  }

  public void setGeoLongitude(Double geoLongitude) {
    this.geoLongitude = geoLongitude;
  }

  public DeviceGeoIP geoSubdivisionIsoCode(String geoSubdivisionIsoCode) {
    this.geoSubdivisionIsoCode = geoSubdivisionIsoCode;
    return this;
  }

  /**
   * ISO 3166-2 subdivision code (for example, a state or province) resolved from the device's
   * public IP address.
   *
   * @return geoSubdivisionIsoCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEO_SUBDIVISION_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGeoSubdivisionIsoCode() {
    return geoSubdivisionIsoCode;
  }

  public void setGeoSubdivisionIsoCode(String geoSubdivisionIsoCode) {
    this.geoSubdivisionIsoCode = geoSubdivisionIsoCode;
  }

  public DeviceGeoIP publicIpAddress(String publicIpAddress) {
    this.publicIpAddress = publicIpAddress;
    return this;
  }

  /**
   * Public IPv4 or IPv6 address of the device.
   *
   * @return publicIpAddress
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicIpAddress() {
    return publicIpAddress;
  }

  public void setPublicIpAddress(String publicIpAddress) {
    this.publicIpAddress = publicIpAddress;
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
   * @return DeviceGeoIP
   */
  @JsonAnySetter
  public DeviceGeoIP putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeviceGeoIP object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceGeoIP deviceGeoIp = (DeviceGeoIP) o;
    return Objects.equals(this.geoCity, deviceGeoIp.geoCity)
        && Objects.equals(this.geoCountryIsoCode, deviceGeoIp.geoCountryIsoCode)
        && Objects.equals(this.geoLatitude, deviceGeoIp.geoLatitude)
        && Objects.equals(this.geoLongitude, deviceGeoIp.geoLongitude)
        && Objects.equals(this.geoSubdivisionIsoCode, deviceGeoIp.geoSubdivisionIsoCode)
        && Objects.equals(this.publicIpAddress, deviceGeoIp.publicIpAddress)
        && Objects.equals(this.additionalProperties, deviceGeoIp.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        geoCity,
        geoCountryIsoCode,
        geoLatitude,
        geoLongitude,
        geoSubdivisionIsoCode,
        publicIpAddress,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceGeoIP {\n");
    sb.append("    geoCity: ").append(toIndentedString(geoCity)).append("\n");
    sb.append("    geoCountryIsoCode: ").append(toIndentedString(geoCountryIsoCode)).append("\n");
    sb.append("    geoLatitude: ").append(toIndentedString(geoLatitude)).append("\n");
    sb.append("    geoLongitude: ").append(toIndentedString(geoLongitude)).append("\n");
    sb.append("    geoSubdivisionIsoCode: ")
        .append(toIndentedString(geoSubdivisionIsoCode))
        .append("\n");
    sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
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
