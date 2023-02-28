/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
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
   * <p>The API test failure details.</p>
 */
@JsonPropertyOrder({
  SyntheticsApiTestResultFailure.JSON_PROPERTY_CODE,
  SyntheticsApiTestResultFailure.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsApiTestResultFailure {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private SyntheticsApiTestFailureCode code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public SyntheticsApiTestResultFailure code(SyntheticsApiTestFailureCode code) {
    this.code = code;
    this.unparsed |= !code.isValid();
    return this;
  }

  /**
   * <p>Error code that can be returned by a Synthetic test.</p>
   * @return code
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsApiTestFailureCode getCode() {
        return code;
      }
  public void setCode(SyntheticsApiTestFailureCode code) {
    if (!code.isValid()) {
        this.unparsed = true;
    }
    this.code = code;
  }
  public SyntheticsApiTestResultFailure message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>The API test error message.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Return true if this SyntheticsApiTestResultFailure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsApiTestResultFailure syntheticsApiTestResultFailure = (SyntheticsApiTestResultFailure) o;
    return Objects.equals(this.code, syntheticsApiTestResultFailure.code) && Objects.equals(this.message, syntheticsApiTestResultFailure.message);
  }


  @Override
  public int hashCode() {
    return Objects.hash(code,message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsApiTestResultFailure {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
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
