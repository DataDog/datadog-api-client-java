/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The steps used in a Synthetics multistep API test. */
@JsonPropertyOrder({
  SyntheticsAPIStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsAPIStep.JSON_PROPERTY_ASSERTIONS,
  SyntheticsAPIStep.JSON_PROPERTY_EXTRACTED_VALUES,
  SyntheticsAPIStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsAPIStep.JSON_PROPERTY_NAME,
  SyntheticsAPIStep.JSON_PROPERTY_REQUEST,
  SyntheticsAPIStep.JSON_PROPERTY_RETRY,
  SyntheticsAPIStep.JSON_PROPERTY_SUBTYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPIStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = new ArrayList<>();

  public static final String JSON_PROPERTY_EXTRACTED_VALUES = "extractedValues";
  private List<SyntheticsParsingOptions> extractedValues = null;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsAPIStepSubtype subtype;

  public SyntheticsAPIStep() {}

  @JsonCreator
  public SyntheticsAPIStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_ASSERTIONS)
          List<SyntheticsAssertion> assertions,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REQUEST) SyntheticsTestRequest request,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBTYPE)
          SyntheticsAPIStepSubtype subtype) {
    this.assertions = assertions;
    this.name = name;
    this.request = request;
    this.unparsed |= request.unparsed;
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
  }

  public SyntheticsAPIStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * Determines whether or not to continue with test if this step fails.
   *
   * @return allowFailure
   */
  @jakarta.annotation.Nullable
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
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * Array of assertions used for the test.
   *
   * @return assertions
   */
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @jakarta.annotation.Nullable
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
   * only if <code>allowFailure</code> is <code>true</code>.
   *
   * @return isCritical
   */
  @jakarta.annotation.Nullable
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
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * Object describing the Synthetic test request.
   *
   * @return request
   */
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsTestRequest getRequest() {
    return request;
  }

  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }

  public SyntheticsAPIStep retry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
    this.unparsed |= retry.unparsed;
    return this;
  }

  /**
   * Object describing the retry strategy to apply to a Synthetic test.
   *
   * @return retry
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestOptionsRetry getRetry() {
    return retry;
  }

  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }

  public SyntheticsAPIStep subtype(SyntheticsAPIStepSubtype subtype) {
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
    return this;
  }

  /**
   * The subtype of the Synthetic multistep API test step, currently only supporting <code>http
   * </code>.
   *
   * @return subtype
   */
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    SyntheticsAPIStep syntheticsApiStep = (SyntheticsAPIStep) o;
    return Objects.equals(this.allowFailure, syntheticsApiStep.allowFailure)
        && Objects.equals(this.assertions, syntheticsApiStep.assertions)
        && Objects.equals(this.extractedValues, syntheticsApiStep.extractedValues)
        && Objects.equals(this.isCritical, syntheticsApiStep.isCritical)
        && Objects.equals(this.name, syntheticsApiStep.name)
        && Objects.equals(this.request, syntheticsApiStep.request)
        && Objects.equals(this.retry, syntheticsApiStep.retry)
        && Objects.equals(this.subtype, syntheticsApiStep.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFailure, assertions, extractedValues, isCritical, name, request, retry, subtype);
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
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
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
