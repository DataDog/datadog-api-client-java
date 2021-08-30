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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A service level objective response containing the requested object. */
@ApiModel(description = "A service level objective response containing the requested object.")
@JsonPropertyOrder({
  CheckCanDeleteSLOResponse.JSON_PROPERTY_DATA,
  CheckCanDeleteSLOResponse.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckCanDeleteSLOResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private CheckCanDeleteSLOResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private Map<String, String> errors = null;

  public CheckCanDeleteSLOResponse data(CheckCanDeleteSLOResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CheckCanDeleteSLOResponseData getData() {
    return data;
  }

  public void setData(CheckCanDeleteSLOResponseData data) {
    this.data = data;
  }

  public CheckCanDeleteSLOResponse errors(Map<String, String> errors) {
    this.errors = errors;
    return this;
  }

  public CheckCanDeleteSLOResponse putErrorsItem(String key, String errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

  /**
   * A mapping of SLO id to it&#39;s current usages.
   *
   * @return errors
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A mapping of SLO id to it's current usages.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getErrors() {
    return errors;
  }

  public void setErrors(Map<String, String> errors) {
    this.errors = errors;
  }

  /** Return true if this CheckCanDeleteSLOResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteSLOResponse checkCanDeleteSLOResponse = (CheckCanDeleteSLOResponse) o;
    return Objects.equals(this.data, checkCanDeleteSLOResponse.data)
        && Objects.equals(this.errors, checkCanDeleteSLOResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteSLOResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
