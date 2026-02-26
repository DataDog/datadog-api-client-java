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
   * <p>The steps used in a Synthetic mobile test.</p>
 */
@JsonPropertyOrder({
  SyntheticsMobileStep.JSON_PROPERTY_ALLOW_FAILURE,
  SyntheticsMobileStep.JSON_PROPERTY_HAS_NEW_STEP_ELEMENT,
  SyntheticsMobileStep.JSON_PROPERTY_IS_CRITICAL,
  SyntheticsMobileStep.JSON_PROPERTY_NAME,
  SyntheticsMobileStep.JSON_PROPERTY_NO_SCREENSHOT,
  SyntheticsMobileStep.JSON_PROPERTY_PARAMS,
  SyntheticsMobileStep.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsMobileStep.JSON_PROPERTY_TIMEOUT,
  SyntheticsMobileStep.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileStep {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALLOW_FAILURE = "allowFailure";
  private Boolean allowFailure;

  public static final String JSON_PROPERTY_HAS_NEW_STEP_ELEMENT = "hasNewStepElement";
  private Boolean hasNewStepElement;

  public static final String JSON_PROPERTY_IS_CRITICAL = "isCritical";
  private Boolean isCritical;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NO_SCREENSHOT = "noScreenshot";
  private Boolean noScreenshot;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private SyntheticsMobileStepParams params;

  public static final String JSON_PROPERTY_PUBLIC_ID = "publicId";
  private String publicId;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SyntheticsMobileStepType type;

  public SyntheticsMobileStep() {}

  @JsonCreator
  public SyntheticsMobileStep(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_PARAMS)SyntheticsMobileStepParams params,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)SyntheticsMobileStepType type) {
        this.name = name;
        this.params = params;
        this.unparsed |= params.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public SyntheticsMobileStep allowFailure(Boolean allowFailure) {
    this.allowFailure = allowFailure;
    return this;
  }

  /**
   * <p>A boolean set to allow this step to fail.</p>
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
  public SyntheticsMobileStep hasNewStepElement(Boolean hasNewStepElement) {
    this.hasNewStepElement = hasNewStepElement;
    return this;
  }

  /**
   * <p>A boolean set to determine if the step has a new step element.</p>
   * @return hasNewStepElement
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_NEW_STEP_ELEMENT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHasNewStepElement() {
        return hasNewStepElement;
      }
  public void setHasNewStepElement(Boolean hasNewStepElement) {
    this.hasNewStepElement = hasNewStepElement;
  }
  public SyntheticsMobileStep isCritical(Boolean isCritical) {
    this.isCritical = isCritical;
    return this;
  }

  /**
   * <p>A boolean to use in addition to <code>allowFailure</code> to determine if the test should be marked as failed when the step fails.</p>
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
  public SyntheticsMobileStep name(String name) {
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
  public SyntheticsMobileStep noScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
    return this;
  }

  /**
   * <p>A boolean set to not take a screenshot for the step.</p>
   * @return noScreenshot
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NO_SCREENSHOT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getNoScreenshot() {
        return noScreenshot;
      }
  public void setNoScreenshot(Boolean noScreenshot) {
    this.noScreenshot = noScreenshot;
  }
  public SyntheticsMobileStep params(SyntheticsMobileStepParams params) {
    this.params = params;
    this.unparsed |= params.unparsed;
    return this;
  }

  /**
   * <p>The parameters of a mobile step.</p>
   * @return params
  **/
      @JsonProperty(JSON_PROPERTY_PARAMS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsMobileStepParams getParams() {
        return params;
      }
  public void setParams(SyntheticsMobileStepParams params) {
    this.params = params;
  }
  public SyntheticsMobileStep publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>The public ID of the step.</p>
   * @return publicId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }
  public SyntheticsMobileStep timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * <p>The time before declaring a step failed.</p>
   * @return timeout
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TIMEOUT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTimeout() {
        return timeout;
      }
  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }
  public SyntheticsMobileStep type(SyntheticsMobileStepType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>Step type used in your mobile Synthetic test.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SyntheticsMobileStepType getType() {
        return type;
      }
  public void setType(SyntheticsMobileStepType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return SyntheticsMobileStep
   */
  @JsonAnySetter
  public SyntheticsMobileStep putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsMobileStep object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileStep syntheticsMobileStep = (SyntheticsMobileStep) o;
    return Objects.equals(this.allowFailure, syntheticsMobileStep.allowFailure) && Objects.equals(this.hasNewStepElement, syntheticsMobileStep.hasNewStepElement) && Objects.equals(this.isCritical, syntheticsMobileStep.isCritical) && Objects.equals(this.name, syntheticsMobileStep.name) && Objects.equals(this.noScreenshot, syntheticsMobileStep.noScreenshot) && Objects.equals(this.params, syntheticsMobileStep.params) && Objects.equals(this.publicId, syntheticsMobileStep.publicId) && Objects.equals(this.timeout, syntheticsMobileStep.timeout) && Objects.equals(this.type, syntheticsMobileStep.type) && Objects.equals(this.additionalProperties, syntheticsMobileStep.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(allowFailure,hasNewStepElement,isCritical,name,noScreenshot,params,publicId,timeout,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileStep {\n");
    sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
    sb.append("    hasNewStepElement: ").append(toIndentedString(hasNewStepElement)).append("\n");
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
