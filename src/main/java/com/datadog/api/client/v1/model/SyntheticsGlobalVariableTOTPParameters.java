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

/** Parameters for the TOTP/MFA variable */
@JsonPropertyOrder({
  SyntheticsGlobalVariableTOTPParameters.JSON_PROPERTY_DIGITS,
  SyntheticsGlobalVariableTOTPParameters.JSON_PROPERTY_REFRESH_INTERVAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariableTOTPParameters {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIGITS = "digits";
  private Integer digits;

  public static final String JSON_PROPERTY_REFRESH_INTERVAL = "refresh_interval";
  private Integer refreshInterval;

  public SyntheticsGlobalVariableTOTPParameters digits(Integer digits) {
    this.digits = digits;
    return this;
  }

  /**
   * Number of digits for the OTP code. minimum: 4 maximum: 10
   *
   * @return digits
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getDigits() {
    return digits;
  }

  public void setDigits(Integer digits) {
    this.digits = digits;
  }

  public SyntheticsGlobalVariableTOTPParameters refreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

  /**
   * Interval for which to refresh the token (in seconds). minimum: 0 maximum: 999
   *
   * @return refreshInterval
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRefreshInterval() {
    return refreshInterval;
  }

  public void setRefreshInterval(Integer refreshInterval) {
    this.refreshInterval = refreshInterval;
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
   * @return SyntheticsGlobalVariableTOTPParameters
   */
  @JsonAnySetter
  public SyntheticsGlobalVariableTOTPParameters putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsGlobalVariableTOTPParameters object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariableTOTPParameters syntheticsGlobalVariableTotpParameters =
        (SyntheticsGlobalVariableTOTPParameters) o;
    return Objects.equals(this.digits, syntheticsGlobalVariableTotpParameters.digits)
        && Objects.equals(
            this.refreshInterval, syntheticsGlobalVariableTotpParameters.refreshInterval)
        && Objects.equals(
            this.additionalProperties, syntheticsGlobalVariableTotpParameters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digits, refreshInterval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableTOTPParameters {\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
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
