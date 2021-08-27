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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Object describing the browser test configuration. */
@ApiModel(description = "Object describing the browser test configuration.")
@JsonPropertyOrder({SyntheticsBrowserTestResultFullCheck.JSON_PROPERTY_CONFIG})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsBrowserTestResultFullCheck {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private SyntheticsTestConfig config;

  public SyntheticsBrowserTestResultFullCheck() {}

  @JsonCreator
  public SyntheticsBrowserTestResultFullCheck(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG) SyntheticsTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
  }

  public SyntheticsBrowserTestResultFullCheck config(SyntheticsTestConfig config) {
    this.config = config;
    this.unparsed |= config.unparsed;
    return this;
  }

  /**
   * Get config
   *
   * @return config
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsTestConfig getConfig() {
    return config;
  }

  public void setConfig(SyntheticsTestConfig config) {
    this.config = config;
  }

  /** Return true if this SyntheticsBrowserTestResultFull_check object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBrowserTestResultFullCheck syntheticsBrowserTestResultFullCheck =
        (SyntheticsBrowserTestResultFullCheck) o;
    return Objects.equals(this.config, syntheticsBrowserTestResultFullCheck.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBrowserTestResultFullCheck {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
