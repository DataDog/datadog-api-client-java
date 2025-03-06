/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Used to handle errors in an action. */
@JsonPropertyOrder({
  ErrorHandler.JSON_PROPERTY_FALLBACK_STEP_NAME,
  ErrorHandler.JSON_PROPERTY_RETRY_STRATEGY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ErrorHandler {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FALLBACK_STEP_NAME = "fallbackStepName";
  private String fallbackStepName;

  public static final String JSON_PROPERTY_RETRY_STRATEGY = "retryStrategy";
  private RetryStrategy retryStrategy;

  public ErrorHandler() {}

  @JsonCreator
  public ErrorHandler(
      @JsonProperty(required = true, value = JSON_PROPERTY_FALLBACK_STEP_NAME)
          String fallbackStepName,
      @JsonProperty(required = true, value = JSON_PROPERTY_RETRY_STRATEGY)
          RetryStrategy retryStrategy) {
    this.fallbackStepName = fallbackStepName;
    this.retryStrategy = retryStrategy;
    this.unparsed |= retryStrategy.unparsed;
  }

  public ErrorHandler fallbackStepName(String fallbackStepName) {
    this.fallbackStepName = fallbackStepName;
    return this;
  }

  /**
   * The <code>ErrorHandler</code> <code>fallbackStepName</code>.
   *
   * @return fallbackStepName
   */
  @JsonProperty(JSON_PROPERTY_FALLBACK_STEP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFallbackStepName() {
    return fallbackStepName;
  }

  public void setFallbackStepName(String fallbackStepName) {
    this.fallbackStepName = fallbackStepName;
  }

  public ErrorHandler retryStrategy(RetryStrategy retryStrategy) {
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

  /** Return true if this ErrorHandler object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorHandler errorHandler = (ErrorHandler) o;
    return Objects.equals(this.fallbackStepName, errorHandler.fallbackStepName)
        && Objects.equals(this.retryStrategy, errorHandler.retryStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallbackStepName, retryStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorHandler {\n");
    sb.append("    fallbackStepName: ").append(toIndentedString(fallbackStepName)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
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
