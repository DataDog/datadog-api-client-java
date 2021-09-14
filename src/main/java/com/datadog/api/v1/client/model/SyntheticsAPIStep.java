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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The steps used in a Synthetics multistep API test. */
@ApiModel(description = "The steps used in a Synthetics multistep API test.")
@JsonPropertyOrder({
  SyntheticsAPIStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsAPIStep.JSON_PROPERTY_ASSERTIONS,
  SyntheticsAPIStep.JSON_PROPERTY_EXTRACTED_VALUES,
  SyntheticsAPIStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsAPIStep.JSON_PROPERTY_NAME,
  SyntheticsAPIStep.JSON_PROPERTY_REQUEST,
  SyntheticsAPIStep.JSON_PROPERTY_SUBTYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsAPIStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = null;

  public static final String JSON_PROPERTY_EXTRACTED_VALUES = "extractedValues";
  private List<SyntheticsParsingOptions> extractedValues = null;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsAPIStepSubtype subtype;

  public SyntheticsAPIStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * Determines whether or not to continue with test if this step fails.
   *
   * @return allowFailure
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether or not to continue with test if this step fails.")
  @JsonProperty(JSON_PROPERTY_ALLOW_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAllowFailure() {
    return allowFailure;
  }

  public void setAllowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
  }

  public SyntheticsAPIStep assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    for (SyntheticsAssertion item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsAPIStep addAssertionsItem(SyntheticsAssertion assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * Array of assertions used for the test.
   *
   * @return assertions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of assertions used for the test.")
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsAssertion> getAssertions() {
    return assertions;
  }

  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }

  public SyntheticsAPIStep extractedValues(List<SyntheticsParsingOptions> extractedValues) {
    this.extractedValues = extractedValues;
    for (SyntheticsParsingOptions item : extractedValues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsAPIStep addExtractedValuesItem(SyntheticsParsingOptions extractedValuesItem) {
    if (this.extractedValues == null) {
      this.extractedValues = new ArrayList<>();
    }
    this.extractedValues.add(extractedValuesItem);
    this.unparsed |= extractedValuesItem.unparsed;
    return this;
  }

  /**
   * Array of values to parse and save as variables from the response.
   *
   * @return extractedValues
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of values to parse and save as variables from the response.")
  @JsonProperty(JSON_PROPERTY_EXTRACTED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsParsingOptions> getExtractedValues() {
    return extractedValues;
  }

  public void setExtractedValues(List<SyntheticsParsingOptions> extractedValues) {
    this.extractedValues = extractedValues;
  }

  public SyntheticsAPIStep isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

  /**
   * Determines whether or not to consider the entire test as failed if this step fails. Can be used
   * only if &#x60;allowFailure&#x60; is &#x60;true&#x60;.
   *
   * @return isCritical
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Determines whether or not to consider the entire test as failed if this step fails. Can"
              + " be used only if `allowFailure` is `true`.")
  @JsonProperty(JSON_PROPERTY_IS_CRITICAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsCritical() {
    return isCritical;
  }

  public void setIsCritical(Boolean isCritical) {
    this.isCritical = isCritical;
  }

  public SyntheticsAPIStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the step.
   *
   * @return name
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the step.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsAPIStep request(SyntheticsTestRequest request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * Get request
   *
   * @return request
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestRequest getRequest() {
    return request;
  }

  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }

  public SyntheticsAPIStep subtype(SyntheticsAPIStepSubtype subtype) {
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
    return this;
  }

  /**
   * Get subtype
   *
   * @return subtype
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsAPIStepSubtype getSubtype() {
    return subtype;
  }

  public void setSubtype(SyntheticsAPIStepSubtype subtype) {
    if (!subtype.isValid()) {
      this.unparsed = true;
    }
    this.subtype = subtype;
  }

  /** Return true if this SyntheticsAPIStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPIStep syntheticsAPIStep = (SyntheticsAPIStep) o;
    return Objects.equals(this.allowFailure, syntheticsAPIStep.allowFailure)
        && Objects.equals(this.assertions, syntheticsAPIStep.assertions)
        && Objects.equals(this.extractedValues, syntheticsAPIStep.extractedValues)
        && Objects.equals(this.isCritical, syntheticsAPIStep.isCritical)
        && Objects.equals(this.name, syntheticsAPIStep.name)
        && Objects.equals(this.request, syntheticsAPIStep.request)
        && Objects.equals(this.subtype, syntheticsAPIStep.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFailure, assertions, extractedValues, isCritical, name, request, subtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPIStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    extractedValues: ").append(toIndentedString(extractedValues)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
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
