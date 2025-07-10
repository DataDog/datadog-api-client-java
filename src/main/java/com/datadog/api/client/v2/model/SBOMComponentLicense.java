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

/** The software license of the component of the SBOM. */
@JsonPropertyOrder({SBOMComponentLicense.JSON_PROPERTY_LICENSE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SBOMComponentLicense {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_LICENSE = "license";
  private SBOMComponentLicenseLicense license;

  public SBOMComponentLicense() {}

  @JsonCreator
  public SBOMComponentLicense(
      @JsonProperty(required = true, value = JSON_PROPERTY_LICENSE)
          SBOMComponentLicenseLicense license) {
    this.license = license;
    this.unparsed |= license.unparsed;
  }

  public SBOMComponentLicense license(SBOMComponentLicenseLicense license) {
    this.license = license;
    this.unparsed |= license.unparsed;
    return this;
  }

  /**
   * The software license of the component of the SBOM.
   *
   * @return license
   */
  @JsonProperty(JSON_PROPERTY_LICENSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SBOMComponentLicenseLicense getLicense() {
    return license;
  }

  public void setLicense(SBOMComponentLicenseLicense license) {
    this.license = license;
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
   * @return SBOMComponentLicense
   */
  @JsonAnySetter
  public SBOMComponentLicense putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SBOMComponentLicense object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SBOMComponentLicense sbomComponentLicense = (SBOMComponentLicense) o;
    return Objects.equals(this.license, sbomComponentLicense.license)
        && Objects.equals(this.additionalProperties, sbomComponentLicense.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(license, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SBOMComponentLicense {\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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
