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

/** Options for the Global Variable for MFA. */
@JsonPropertyOrder({SyntheticsGlobalVariableOptions.JSON_PROPERTY_TOTP_PARAMETERS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariableOptions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TOTP_PARAMETERS = "totp_parameters";
  private SyntheticsGlobalVariableTOTPParameters totpParameters;

  public SyntheticsGlobalVariableOptions totpParameters(
      SyntheticsGlobalVariableTOTPParameters totpParameters) {
    this.totpParameters = totpParameters;
    this.unparsed |= totpParameters.unparsed;
    return this;
  }

  /**
   * Parameters for the TOTP/MFA variable
   *
   * @return totpParameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTP_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsGlobalVariableTOTPParameters getTotpParameters() {
    return totpParameters;
  }

  public void setTotpParameters(SyntheticsGlobalVariableTOTPParameters totpParameters) {
    this.totpParameters = totpParameters;
  }

  /** Return true if this SyntheticsGlobalVariableOptions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariableOptions syntheticsGlobalVariableOptions =
        (SyntheticsGlobalVariableOptions) o;
    return Objects.equals(this.totpParameters, syntheticsGlobalVariableOptions.totpParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totpParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableOptions {\n");
    sb.append("    totpParameters: ").append(toIndentedString(totpParameters)).append("\n");
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
