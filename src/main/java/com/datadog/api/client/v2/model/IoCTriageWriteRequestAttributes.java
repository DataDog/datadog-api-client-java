/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Attributes for setting an indicator's triage state. */
@JsonPropertyOrder({
  IoCTriageWriteRequestAttributes.JSON_PROPERTY_INDICATOR,
  IoCTriageWriteRequestAttributes.JSON_PROPERTY_TRIAGE_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IoCTriageWriteRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDICATOR = "indicator";
  private String indicator;

  public static final String JSON_PROPERTY_TRIAGE_STATE = "triage_state";
  private String triageState;

  public IoCTriageWriteRequestAttributes() {}

  @JsonCreator
  public IoCTriageWriteRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_INDICATOR) String indicator,
      @JsonProperty(required = true, value = JSON_PROPERTY_TRIAGE_STATE) String triageState) {
    this.indicator = indicator;
    this.triageState = triageState;
  }

  public IoCTriageWriteRequestAttributes indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }

  /**
   * The indicator value to triage (for example, an IP address or domain).
   *
   * @return indicator
   */
  @JsonProperty(JSON_PROPERTY_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIndicator() {
    return indicator;
  }

  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }

  public IoCTriageWriteRequestAttributes triageState(String triageState) {
    this.triageState = triageState;
    return this;
  }

  /**
   * The triage state to set: not_reviewed or reviewed.
   *
   * @return triageState
   */
  @JsonProperty(JSON_PROPERTY_TRIAGE_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTriageState() {
    return triageState;
  }

  public void setTriageState(String triageState) {
    this.triageState = triageState;
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
   * @return IoCTriageWriteRequestAttributes
   */
  @JsonAnySetter
  public IoCTriageWriteRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IoCTriageWriteRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoCTriageWriteRequestAttributes ioCTriageWriteRequestAttributes =
        (IoCTriageWriteRequestAttributes) o;
    return Objects.equals(this.indicator, ioCTriageWriteRequestAttributes.indicator)
        && Objects.equals(this.triageState, ioCTriageWriteRequestAttributes.triageState)
        && Objects.equals(
            this.additionalProperties, ioCTriageWriteRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicator, triageState, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoCTriageWriteRequestAttributes {\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    triageState: ").append(toIndentedString(triageState)).append("\n");
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
