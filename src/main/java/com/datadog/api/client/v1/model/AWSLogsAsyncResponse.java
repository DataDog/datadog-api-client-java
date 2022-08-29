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
   * <p>A list of all Datadog-AWS logs integrations available in your Datadog organization.</p>
 */
@JsonPropertyOrder({
  AWSLogsAsyncResponse.JSON_PROPERTY_ERRORS,
  AWSLogsAsyncResponse.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLogsAsyncResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<AWSLogsAsyncError> errors = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public AWSLogsAsyncResponse errors(List<AWSLogsAsyncError> errors) {
    this.errors = errors;
    for (AWSLogsAsyncError item : errors) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public AWSLogsAsyncResponse addErrorsItem(AWSLogsAsyncError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    this.unparsed |= errorsItem.unparsed;
    return this;
  }

  /**
   * <p>List of errors.</p>
   * @return errors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ERRORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<AWSLogsAsyncError> getErrors() {
        return errors;
      }
  public void setErrors(List<AWSLogsAsyncError> errors) {
    this.errors = errors;
  }
  public AWSLogsAsyncResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Status of the properties.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Return true if this AWSLogsAsyncResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLogsAsyncResponse awsLogsAsyncResponse = (AWSLogsAsyncResponse) o;
    return Objects.equals(this.errors, awsLogsAsyncResponse.errors) && Objects.equals(this.status, awsLogsAsyncResponse.status);
  }


  @Override
  public int hashCode() {
    return Objects.hash(errors,status);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
