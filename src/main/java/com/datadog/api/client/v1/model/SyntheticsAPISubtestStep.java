/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The subtest step used in a Synthetics multi-step API test. */
@JsonPropertyOrder({
  SyntheticsAPISubtestStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsAPISubtestStep.JSON_PROPERTY_ALWAYS_EXECUTE,
  SyntheticsAPISubtestStep.JSON_PROPERTY_EXIT_IF_SUCCEED,
  SyntheticsAPISubtestStep.JSON_PROPERTY_EXTRACTED_VALUES_FROM_SCRIPT,
  SyntheticsAPISubtestStep.JSON_PROPERTY_ID,
  SyntheticsAPISubtestStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsAPISubtestStep.JSON_PROPERTY_NAME,
  SyntheticsAPISubtestStep.JSON_PROPERTY_RETRY,
  SyntheticsAPISubtestStep.JSON_PROPERTY_SUBTEST_PUBLIC_ID,
  SyntheticsAPISubtestStep.JSON_PROPERTY_SUBTYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsAPISubtestStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_ALWAYS_EXECUTE = "alwaysExecute";
  private Boolean alwaysExecute;

  public static final String JSON_PROPERTY_EXIT_IF_SUCCEED = "exitIfSucceed";
  private Boolean exitIfSucceed;

  public static final String JSON_PROPERTY_EXTRACTED_VALUES_FROM_SCRIPT =
      "extractedValuesFromScript";
  private String extractedValuesFromScript;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RETRY = "retry";
  private SyntheticsTestOptionsRetry retry;

  public static final String JSON_PROPERTY_SUBTEST_PUBLIC_ID = "subtestPublicId";
  private String subtestPublicId;

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SyntheticsAPISubtestStepSubtype subtype;

  public SyntheticsAPISubtestStep() {}

  @JsonCreator
  public SyntheticsAPISubtestStep(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBTEST_PUBLIC_ID)
          String subtestPublicId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBTYPE)
          SyntheticsAPISubtestStepSubtype subtype) {
    this.name = name;
    this.subtestPublicId = subtestPublicId;
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
  }

  public SyntheticsAPISubtestStep allowFailure(Boolean allowFailure) {
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

  public SyntheticsAPISubtestStep alwaysExecute(Boolean alwaysExecute) {
    this.alwaysExecute = alwaysExecute;
    return this;
  }

  /**
   * A boolean set to always execute this step even if the previous step failed or was skipped.
   *
   * @return alwaysExecute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALWAYS_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAlwaysExecute() {
    return alwaysExecute;
  }

  public void setAlwaysExecute(Boolean alwaysExecute) {
    this.alwaysExecute = alwaysExecute;
  }

  public SyntheticsAPISubtestStep exitIfSucceed(Boolean exitIfSucceed) {
    this.exitIfSucceed = exitIfSucceed;
    return this;
  }

  /**
   * Determines whether or not to exit the test if the step succeeds.
   *
   * @return exitIfSucceed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXIT_IF_SUCCEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExitIfSucceed() {
    return exitIfSucceed;
  }

  public void setExitIfSucceed(Boolean exitIfSucceed) {
    this.exitIfSucceed = exitIfSucceed;
  }

  public SyntheticsAPISubtestStep extractedValuesFromScript(String extractedValuesFromScript) {
    this.extractedValuesFromScript = extractedValuesFromScript;
    return this;
  }

  /**
   * Generate variables using JavaScript.
   *
   * @return extractedValuesFromScript
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTED_VALUES_FROM_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExtractedValuesFromScript() {
    return extractedValuesFromScript;
  }

  public void setExtractedValuesFromScript(String extractedValuesFromScript) {
    this.extractedValuesFromScript = extractedValuesFromScript;
  }

  /**
   * ID of the step.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public SyntheticsAPISubtestStep isCritical(Boolean isCritical) {
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

  public SyntheticsAPISubtestStep name(String name) {
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

  public SyntheticsAPISubtestStep retry(SyntheticsTestOptionsRetry retry) {
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

  public SyntheticsAPISubtestStep subtestPublicId(String subtestPublicId) {
    this.subtestPublicId = subtestPublicId;
    return this;
  }

  /**
   * Public ID of the test to be played as part of a <code>playSubTest</code> step type.
   *
   * @return subtestPublicId
   */
  @JsonProperty(JSON_PROPERTY_SUBTEST_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubtestPublicId() {
    return subtestPublicId;
  }

  public void setSubtestPublicId(String subtestPublicId) {
    this.subtestPublicId = subtestPublicId;
  }

  public SyntheticsAPISubtestStep subtype(SyntheticsAPISubtestStepSubtype subtype) {
    this.subtype = subtype;
    this.unparsed |= !subtype.isValid();
    return this;
  }

  /**
   * The subtype of the Synthetic multi-step API subtest step.
   *
   * @return subtype
   */
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsAPISubtestStepSubtype getSubtype() {
    return subtype;
  }

  public void setSubtype(SyntheticsAPISubtestStepSubtype subtype) {
    if (!subtype.isValid()) {
      this.unparsed = true;
    }
    this.subtype = subtype;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsAPISubtestStep
   */
  @JsonAnySetter
  public SyntheticsAPISubtestStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsAPISubtestStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPISubtestStep syntheticsApiSubtestStep = (SyntheticsAPISubtestStep) o;
    return Objects.equals(this.allowFailure, syntheticsApiSubtestStep.allowFailure)
        && Objects.equals(this.alwaysExecute, syntheticsApiSubtestStep.alwaysExecute)
        && Objects.equals(this.exitIfSucceed, syntheticsApiSubtestStep.exitIfSucceed)
        && Objects.equals(
            this.extractedValuesFromScript, syntheticsApiSubtestStep.extractedValuesFromScript)
        && Objects.equals(this.id, syntheticsApiSubtestStep.id)
        && Objects.equals(this.isCritical, syntheticsApiSubtestStep.isCritical)
        && Objects.equals(this.name, syntheticsApiSubtestStep.name)
        && Objects.equals(this.retry, syntheticsApiSubtestStep.retry)
        && Objects.equals(this.subtestPublicId, syntheticsApiSubtestStep.subtestPublicId)
        && Objects.equals(this.subtype, syntheticsApiSubtestStep.subtype)
        && Objects.equals(this.additionalProperties, syntheticsApiSubtestStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFailure,
        alwaysExecute,
        exitIfSucceed,
        extractedValuesFromScript,
        id,
        isCritical,
        name,
        retry,
        subtestPublicId,
        subtype,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPISubtestStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    alwaysExecute: ").append(toIndentedString(alwaysExecute)).append("\n");
    sb.append("    exitIfSucceed: ").append(toIndentedString(exitIfSucceed)).append("\n");
    sb.append("    extractedValuesFromScript: ")
        .append(toIndentedString(extractedValuesFromScript))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    subtestPublicId: ").append(toIndentedString(subtestPublicId)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
