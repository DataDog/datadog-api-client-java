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

/** Used to create conditions before running subsequent actions. */
@JsonPropertyOrder({
  CompletionGate.JSON_PROPERTY_COMPLETION_CONDITION,
  CompletionGate.JSON_PROPERTY_RETRY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CompletionGate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPLETION_CONDITION = "completionCondition";
  private CompletionCondition completionCondition;

  public static final String JSON_PROPERTY_RETRY_STRATEGY = "retryStrategy";
  private RetryStrategy retryStrategy;

  public CompletionGate() {}

  @JsonCreator
  public CompletionGate(
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPLETION_CONDITION)
          CompletionCondition completionCondition,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETRY_STRATEGY)
          RetryStrategy retryStrategy) {
    this.completionCondition = completionCondition;
    this.unparsed |= completionCondition.unparsed;
    this.retryStrategy = retryStrategy;
    this.unparsed |= retryStrategy.unparsed;
  }

  public CompletionGate completionCondition(CompletionCondition completionCondition) {
    this.completionCondition = completionCondition;
    this.unparsed |= completionCondition.unparsed;
    return this;
  }

  /**
   * The definition of <code>CompletionCondition</code> object.
   *
   * @return completionCondition
   */
  @JsonProperty(JSON_PROPERTY_COMPLETION_CONDITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CompletionCondition getCompletionCondition() {
    return completionCondition;
  }

  public void setCompletionCondition(CompletionCondition completionCondition) {
    this.completionCondition = completionCondition;
  }

  public CompletionGate retryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
    this.unparsed |= retryStrategy.unparsed;
    return this;
  }

  /**
   * The definition of <code>RetryStrategy</code> object.
   *
   * @return retryStrategy
   */
  @JsonProperty(JSON_PROPERTY_RETRY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
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
   * @return CompletionGate
   */
  @JsonAnySetter
  public CompletionGate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CompletionGate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletionGate completionGate = (CompletionGate) o;
    return Objects.equals(this.completionCondition, completionGate.completionCondition)
        && Objects.equals(this.retryStrategy, completionGate.retryStrategy)
        && Objects.equals(this.additionalProperties, completionGate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionCondition, retryStrategy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionGate {\n");
    sb.append("    completionCondition: ")
        .append(toIndentedString(completionCondition))
        .append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
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
