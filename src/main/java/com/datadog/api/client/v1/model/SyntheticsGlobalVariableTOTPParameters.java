/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
            this.refreshInterval, syntheticsGlobalVariableTotpParameters.refreshInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digits, refreshInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableTOTPParameters {\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
    sb.append("}");
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
