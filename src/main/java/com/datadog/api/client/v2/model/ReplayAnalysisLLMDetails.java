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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** AI-generated analysis details for a replay issue. */
@JsonPropertyOrder({
  ReplayAnalysisLLMDetails.JSON_PROPERTY_INTENT,
  ReplayAnalysisLLMDetails.JSON_PROPERTY_USER_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReplayAnalysisLLMDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTENT = "intent";
  private String intent;

  public static final String JSON_PROPERTY_USER_PATTERN = "user_pattern";
  private List<String> userPattern = new ArrayList<>();

  public ReplayAnalysisLLMDetails() {}

  @JsonCreator
  public ReplayAnalysisLLMDetails(
      @JsonProperty(required = true, value = JSON_PROPERTY_INTENT) String intent,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_PATTERN) List<String> userPattern) {
    this.intent = intent;
    this.userPattern = userPattern;
  }

  public ReplayAnalysisLLMDetails intent(String intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Interpreted user intent derived from session analysis.
   *
   * @return intent
   */
  @JsonProperty(JSON_PROPERTY_INTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public ReplayAnalysisLLMDetails userPattern(List<String> userPattern) {
    this.userPattern = userPattern;
    return this;
  }

  public ReplayAnalysisLLMDetails addUserPatternItem(String userPatternItem) {
    this.userPattern.add(userPatternItem);
    return this;
  }

  /**
   * List of user behavior steps observed in the session.
   *
   * @return userPattern
   */
  @JsonProperty(JSON_PROPERTY_USER_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getUserPattern() {
    return userPattern;
  }

  public void setUserPattern(List<String> userPattern) {
    this.userPattern = userPattern;
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
   * @return ReplayAnalysisLLMDetails
   */
  @JsonAnySetter
  public ReplayAnalysisLLMDetails putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReplayAnalysisLLMDetails object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplayAnalysisLLMDetails replayAnalysisLlmDetails = (ReplayAnalysisLLMDetails) o;
    return Objects.equals(this.intent, replayAnalysisLlmDetails.intent)
        && Objects.equals(this.userPattern, replayAnalysisLlmDetails.userPattern)
        && Objects.equals(this.additionalProperties, replayAnalysisLlmDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, userPattern, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplayAnalysisLLMDetails {\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    userPattern: ").append(toIndentedString(userPattern)).append("\n");
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
