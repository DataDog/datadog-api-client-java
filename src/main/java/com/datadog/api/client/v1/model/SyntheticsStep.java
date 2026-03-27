/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The steps used in a Synthetic browser test. */
@JsonPropertyOrder({
  SyntheticsStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsStep.JSON_PROPERTY_ALWAYS_EXECUTE,
  SyntheticsStep.JSON_PROPERTY_EXIT_IF_SUCCEED,
  SyntheticsStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsStep.JSON_PROPERTY_NAME,
  SyntheticsStep.JSON_PROPERTY_NO_SCREENSHOT,
  SyntheticsStep.JSON_PROPERTY_PARAMS,
  SyntheticsStep.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsStep.JSON_PROPERTY_TIMEOUT,
  SyntheticsStep.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_ALWAYS_EXECUTE = "alwaysExecute";
  private Boolean alwaysExecute;

  public static final String JSON_PROPERTY_EXIT_IF_SUCCEED = "exitIfSucceed";
  private Boolean exitIfSucceed;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NO_SCREENSHOT = "noScreenshot";
  private Boolean noScreenshot;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private Object params;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsStepType type;

  public SyntheticsStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * A boolean set to allow this step to fail.
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

  public SyntheticsStep alwaysExecute(Boolean alwaysExecute) {
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

  public SyntheticsStep exitIfSucceed(Boolean exitIfSucceed) {
    this.exitIfSucceed = exitIfSucceed;
    return this;
  }

  /**
   * A boolean set to exit the test if the step succeeds.
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

  public SyntheticsStep isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

  /**
   * A boolean to use in addition to <code>allowFailure</code> to determine if the test should be
   * marked as failed when the step fails.
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

  public SyntheticsStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the step.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsStep noScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
    return this;
  }

  /**
   * A boolean set to skip taking a screenshot for the step.
   *
   * @return noScreenshot
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_SCREENSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoScreenshot() {
    return noScreenshot;
  }

  public void setNoScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
  }

  public SyntheticsStep params(Object params) {
    this.params = params;
    return this;
  }

  /**
   * The parameters of the step.
   *
   * @return params
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }

  public SyntheticsStep publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The public ID of the step.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public SyntheticsStep timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * The time before declaring a step failed.
   *
   * @return timeout
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  public SyntheticsStep type(SyntheticsStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Step type used in your Synthetic test.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsStepType getType() {
    return type;
  }

  public void setType(SyntheticsStepType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsStep
   */
  @JsonAnySetter
  public SyntheticsStep putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsStep object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsStep syntheticsStep = (SyntheticsStep) o;
    return Objects.equals(this.allowFailure, syntheticsStep.allowFailure)
        && Objects.equals(this.alwaysExecute, syntheticsStep.alwaysExecute)
        && Objects.equals(this.exitIfSucceed, syntheticsStep.exitIfSucceed)
        && Objects.equals(this.isCritical, syntheticsStep.isCritical)
        && Objects.equals(this.name, syntheticsStep.name)
        && Objects.equals(this.noScreenshot, syntheticsStep.noScreenshot)
        && Objects.equals(this.params, syntheticsStep.params)
        && Objects.equals(this.publicId, syntheticsStep.publicId)
        && Objects.equals(this.timeout, syntheticsStep.timeout)
        && Objects.equals(this.type, syntheticsStep.type)
        && Objects.equals(this.additionalProperties, syntheticsStep.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowFailure,
        alwaysExecute,
        exitIfSucceed,
        isCritical,
        name,
        noScreenshot,
        params,
        publicId,
        timeout,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    alwaysExecute: ").append(toIndentedString(alwaysExecute)).append("\n");
    sb.append("    exitIfSucceed: ").append(toIndentedString(exitIfSucceed)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    noScreenshot: ").append(toIndentedString(noScreenshot)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
