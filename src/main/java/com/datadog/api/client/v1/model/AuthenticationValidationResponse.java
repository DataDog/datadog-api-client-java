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

/** Represent validation endpoint responses. */
@JsonPropertyOrder({AuthenticationValidationResponse.JSON_PROPERTY_VALID})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AuthenticationValidationResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_VALID = "valid";
  private Boolean valid;

  /**
   * Return <code>true</code> if the authentication response is valid.
   *
   * @return valid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getValid() {
    return valid;
  }

  /** Return true if this AuthenticationValidationResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationValidationResponse authenticationValidationResponse =
        (AuthenticationValidationResponse) o;
    return Objects.equals(this.valid, authenticationValidationResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationValidationResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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