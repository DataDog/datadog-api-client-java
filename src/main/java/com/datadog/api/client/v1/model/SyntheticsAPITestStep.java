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
import java.util.UUID;
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
   * <p>The Test step used in a Synthetic multi-step API test.</p>
 */
@JsonPropertyOrder({
  SyntheticsAPITestStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsAPITestStep.JSON_PROPERTY_ASSERTIONS,
  SyntheticsAPITestStep.JSON_PROPERTY_EXIT_IF_SUCCEED,
  SyntheticsAPITestStep.JSON_PROPERTY_EXTRACTED_VALUES,
  SyntheticsAPITestStep.JSON_PROPERTY_EXTRACTED_VALUES_FROM_SCRIPT,
  SyntheticsAPITestStep.JSON_PROPERTY_ID,
  SyntheticsAPITestStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsAPITestStep.JSON_PROPERTY_NAME,
  SyntheticsAPITestStep.JSON_PROPERTY_REQUEST,
  SyntheticsAPITestStep.JSON_PROPERTY_RETRY,
  SyntheticsAPITestStep.JSON_PROPERTY_SUBTYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPITestStep {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<SyntheticsAssertion> assertions = new ArrayList<>();

  public static final String JSON_PROPERTY_EXIT_IF_SUCCEED = "exitIfSucceed";
  private Boolean exitIfSucceed;

  public static final String JSON_PROPERTY_EXTRACTED_VALUES = "extractedValues";
  private List<SyntheticsParsingOptions> extractedValues = null;

  public static final String JSON_PROPERTY_EXTRACTED_VALUES_FROM_SCRIPT = "extractedValuesFromScript";
  private String extractedValuesFromScript;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private SyntheticsTestRequest request;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsAPITestStepSubtype subtype;

  public SyntheticsAPITestStep() {}

  @JsonCreator
  public SyntheticsAPITestStep(
            @JsonProperty(required=true, value=JSON_PROPERTY_ASSERTIONS)List<SyntheticsAssertion> assertions,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_REQUEST)SyntheticsTestRequest request,
            @JsonProperty(required=true, value=JSON_PROPERTY_SUBTYPE)SyntheticsAPITestStepSubtype subtype) {
        this.assertions = assertions;
        this.name = name;
        this.request = request;
        this.unparsed |= request.unparsed;
        this.subtype = subtype;
        this.unparsed |= !subtype.isValid();
  }
  public SyntheticsAPITestStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * <p>Determines whether or not to continue with test if this step fails.</p>
   * @return allowFailure
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALLOW_FAILURE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getAllowFailure() {
        return allowFailure;
      }
  public void setAllowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
  }
  public SyntheticsAPITestStep assertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
    for (SyntheticsAssertion item : assertions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsAPITestStep addAssertionsItem(SyntheticsAssertion assertionsItem) {
    this.assertions.add(assertionsItem);
    this.unparsed |= assertionsItem.unparsed;
    return this;
  }

  /**
   * <p>Array of assertions used for the test.</p>
   * @return assertions
  **/
      @JsonProperty(JSON_PROPERTY_ASSERTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SyntheticsAssertion> getAssertions() {
        return assertions;
      }
  public void setAssertions(List<SyntheticsAssertion> assertions) {
    this.assertions = assertions;
  }
  public SyntheticsAPITestStep exitIfSucceed(Boolean exitIfSucceed) {
    this.exitIfSucceed = exitIfSucceed;
    return this;
  }

  /**
   * <p>Determines whether or not to exit the test if the step succeeds.</p>
   * @return exitIfSucceed
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXIT_IF_SUCCEED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getExitIfSucceed() {
        return exitIfSucceed;
      }
  public void setExitIfSucceed(Boolean exitIfSucceed) {
    this.exitIfSucceed = exitIfSucceed;
  }
  public SyntheticsAPITestStep extractedValues(List<SyntheticsParsingOptions> extractedValues) {
    this.extractedValues = extractedValues;
    for (SyntheticsParsingOptions item : extractedValues) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsAPITestStep addExtractedValuesItem(SyntheticsParsingOptions extractedValuesItem) {
    if (this.extractedValues == null) {
      this.extractedValues = new ArrayList<>();
    }
    this.extractedValues.add(extractedValuesItem);
    this.unparsed |= extractedValuesItem.unparsed;
    return this;
  }

  /**
   * <p>Array of values to parse and save as variables from the response.</p>
   * @return extractedValues
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTRACTED_VALUES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsParsingOptions> getExtractedValues() {
        return extractedValues;
      }
  public void setExtractedValues(List<SyntheticsParsingOptions> extractedValues) {
    this.extractedValues = extractedValues;
  }
  public SyntheticsAPITestStep extractedValuesFromScript(String extractedValuesFromScript) {
    this.extractedValuesFromScript = extractedValuesFromScript;
    return this;
  }

  /**
   * <p>Generate variables using JavaScript.</p>
   * @return extractedValuesFromScript
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXTRACTED_VALUES_FROM_SCRIPT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getExtractedValuesFromScript() {
        return extractedValuesFromScript;
      }
  public void setExtractedValuesFromScript(String extractedValuesFromScript) {
    this.extractedValuesFromScript = extractedValuesFromScript;
  }

  /**
   * <p>ID of the step.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public SyntheticsAPITestStep isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

  /**
   * <p>Determines whether or not to consider the entire test as failed if this step fails.
   * Can be used only if <code>allowFailure</code> is <code>true</code>.</p>
   * @return isCritical
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_CRITICAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsCritical() {
        return isCritical;
      }
  public void setIsCritical(Boolean isCritical) {
    this.isCritical = isCritical;
  }
  public SyntheticsAPITestStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the step.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SyntheticsAPITestStep request(SyntheticsTestRequest request) {
    this.request = request;
    this.unparsed |= request.unparsed;
    return this;
  }

  /**
   * <p>Object describing the Synthetic test request.</p>
   * @return request
  **/
      @JsonProperty(JSON_PROPERTY_REQUEST)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsTestRequest getRequest() {
        return request;
      }
  public void setRequest(SyntheticsTestRequest request) {
    this.request = request;
  }
  public SyntheticsAPITestStep retry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
    this.unparsed |= retry.unparsed;
    return this;
  }

  /**
   * <p>Object describing the retry strategy to apply to a Synthetic test.</p>
   * @return retry
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RETRY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsTestOptionsRetry getRetry() {
        return retry;
      }
  public void setRetry(SyntheticsTestOptionsRetry retry) {
    this.retry = retry;
  }
  public SyntheticsAPITestStep subtype(SyntheticsAPITestStepSubtype subtype) {
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
    return this;
  }

  /**
   * <p>The subtype of the Synthetic multi-step API test step.</p>
   * @return subtype
  **/
      @JsonProperty(JSON_PROPERTY_SUBTYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsAPITestStepSubtype getSubtype() {
        return subtype;
      }
  public void setSubtype(SyntheticsAPITestStepSubtype subtype) {
    if (!subtype.isValid()) {
        this.unparsed = true;
    }
    this.subtype = subtype;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsAPITestStep
   */
  @JsonAnySetter
  public SyntheticsAPITestStep putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this SyntheticsAPITestStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestStep syntheticsApiTestStep = (SyntheticsAPITestStep) o;
    return Objects.equals(this.allowFailure, syntheticsApiTestStep.allowFailure) && Objects.equals(this.assertions, syntheticsApiTestStep.assertions) && Objects.equals(this.exitIfSucceed, syntheticsApiTestStep.exitIfSucceed) && Objects.equals(this.extractedValues, syntheticsApiTestStep.extractedValues) && Objects.equals(this.extractedValuesFromScript, syntheticsApiTestStep.extractedValuesFromScript) && Objects.equals(this.id, syntheticsApiTestStep.id) && Objects.equals(this.isCritical, syntheticsApiTestStep.isCritical) && Objects.equals(this.name, syntheticsApiTestStep.name) && Objects.equals(this.request, syntheticsApiTestStep.request) && Objects.equals(this.retry, syntheticsApiTestStep.retry) && Objects.equals(this.subtype, syntheticsApiTestStep.subtype) && Objects.equals(this.additionalProperties, syntheticsApiTestStep.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allowFailure,assertions,exitIfSucceed,extractedValues,extractedValuesFromScript,id,isCritical,name,request,retry,subtype, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
    sb.append("    exitIfSucceed: ").append(toIndentedString(exitIfSucceed)).append("\n");
    sb.append("    extractedValues: ").append(toIndentedString(extractedValues)).append("\n");
    sb.append("    extractedValuesFromScript: ").append(toIndentedString(extractedValuesFromScript)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
