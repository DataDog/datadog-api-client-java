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

/** A feedback metric containing user response. */
@JsonPropertyOrder({
  SecurityMonitoringSignalInvestigationFeedbackMetric.JSON_PROPERTY_PLACEHOLDER,
  SecurityMonitoringSignalInvestigationFeedbackMetric.JSON_PROPERTY_PROMPT,
  SecurityMonitoringSignalInvestigationFeedbackMetric.JSON_PROPERTY_RESPONSE,
  SecurityMonitoringSignalInvestigationFeedbackMetric.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalInvestigationFeedbackMetric {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PLACEHOLDER = "placeholder";
  private String placeholder;

  public static final String JSON_PROPERTY_PROMPT = "prompt";
  private String prompt;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private String response;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SecurityMonitoringSignalInvestigationFeedbackMetric() {}

  @JsonCreator
  public SecurityMonitoringSignalInvestigationFeedbackMetric(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROMPT) String prompt,
      @JsonProperty(required = true, value = JSON_PROPERTY_RESPONSE) String response,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.prompt = prompt;
    this.response = response;
    this.type = type;
  }

  public SecurityMonitoringSignalInvestigationFeedbackMetric placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Placeholder text for the metric.
   *
   * @return placeholder
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLACEHOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public SecurityMonitoringSignalInvestigationFeedbackMetric prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * The question or prompt.
   *
   * @return prompt
   */
  @JsonProperty(JSON_PROPERTY_PROMPT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public SecurityMonitoringSignalInvestigationFeedbackMetric response(String response) {
    this.response = response;
    return this;
  }

  /**
   * The user's response.
   *
   * @return response
   */
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public SecurityMonitoringSignalInvestigationFeedbackMetric type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of metric.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * @return SecurityMonitoringSignalInvestigationFeedbackMetric
   */
  @JsonAnySetter
  public SecurityMonitoringSignalInvestigationFeedbackMetric putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this SecurityMonitoringSignalInvestigationFeedbackMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalInvestigationFeedbackMetric
        securityMonitoringSignalInvestigationFeedbackMetric =
            (SecurityMonitoringSignalInvestigationFeedbackMetric) o;
    return Objects.equals(
            this.placeholder, securityMonitoringSignalInvestigationFeedbackMetric.placeholder)
        && Objects.equals(this.prompt, securityMonitoringSignalInvestigationFeedbackMetric.prompt)
        && Objects.equals(
            this.response, securityMonitoringSignalInvestigationFeedbackMetric.response)
        && Objects.equals(this.type, securityMonitoringSignalInvestigationFeedbackMetric.type)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalInvestigationFeedbackMetric.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeholder, prompt, response, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalInvestigationFeedbackMetric {\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
