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
import com.datadog.api.v1.client.model.ServiceLevelObjective;
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
 * A response with one or more service level objective.
 */
@ApiModel(description = "A response with one or more service level objective.")
@JsonPropertyOrder({
  ServiceLevelObjectiveListResponse.JSON_PROPERTY_DATA,
  ServiceLevelObjectiveListResponse.JSON_PROPERTY_ERRORS
})

public class ServiceLevelObjectiveListResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ServiceLevelObjective> data = new ArrayList<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors = null;


  public ServiceLevelObjectiveListResponse data(List<ServiceLevelObjective> data) {
    
    this.data = data;
    return this;
  }

  public ServiceLevelObjectiveListResponse addDataItem(ServiceLevelObjective dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * An array of service level objective objects.
   * @return data
  **/
  @ApiModelProperty(required = true, value = "An array of service level objective objects.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ServiceLevelObjective> getData() {
    return data;
  }


  public void setData(List<ServiceLevelObjective> data) {
    this.data = data;
  }


  public ServiceLevelObjectiveListResponse errors(List<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public ServiceLevelObjectiveListResponse addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array of error messages. Each endpoint documents how/whether this field is used.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of error messages. Each endpoint documents how/whether this field is used.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getErrors() {
    return errors;
  }


  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLevelObjectiveListResponse serviceLevelObjectiveListResponse = (ServiceLevelObjectiveListResponse) o;
    return Objects.equals(this.data, serviceLevelObjectiveListResponse.data) &&
        Objects.equals(this.errors, serviceLevelObjectiveListResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLevelObjectiveListResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

