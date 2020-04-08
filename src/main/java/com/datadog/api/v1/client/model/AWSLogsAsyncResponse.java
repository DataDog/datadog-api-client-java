/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.AWSLogsAsyncResponseErrors;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * TODO.
 */
@ApiModel(description = "TODO.")
@JsonPropertyOrder({
  AWSLogsAsyncResponse.JSON_PROPERTY_ERRORS,
  AWSLogsAsyncResponse.JSON_PROPERTY_STATUS
})

public class AWSLogsAsyncResponse {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<AWSLogsAsyncResponseErrors> errors = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;


  public AWSLogsAsyncResponse errors(List<AWSLogsAsyncResponseErrors> errors) {
    
    this.errors = errors;
    return this;
  }

  public AWSLogsAsyncResponse addErrorsItem(AWSLogsAsyncResponseErrors errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * TODO.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AWSLogsAsyncResponseErrors> getErrors() {
    return errors;
  }


  public void setErrors(List<AWSLogsAsyncResponseErrors> errors) {
    this.errors = errors;
  }


  public AWSLogsAsyncResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * TODO.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "created", value = "TODO.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogsAsyncResponse awSLogsAsyncResponse = (AWSLogsAsyncResponse) o;
    return Objects.equals(this.errors, awSLogsAsyncResponse.errors) &&
        Objects.equals(this.status, awSLogsAsyncResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLogsAsyncResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

