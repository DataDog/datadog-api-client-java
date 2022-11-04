/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The steps used in a Synthetics browser test. */
@JsonPropertyOrder({
  SyntheticsStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsStep.JSON_PROPERTY_NAME,
  SyntheticsStep.JSON_PROPERTY_PARAMS,
  SyntheticsStep.JSON_PROPERTY_TIMEOUT,
  SyntheticsStep.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsStep {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private Object params;

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
        && Objects.equals(this.isCritical, syntheticsStep.isCritical)
        && Objects.equals(this.name, syntheticsStep.name)
        && Objects.equals(this.params, syntheticsStep.params)
        && Objects.equals(this.timeout, syntheticsStep.timeout)
        && Objects.equals(this.type, syntheticsStep.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowFailure, isCritical, name, params, timeout, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    isCritical: ").append(toIndentedString(isCritical)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
