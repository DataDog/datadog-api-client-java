/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Contains information of the CI error. */
@JsonPropertyOrder({
  CIAppCIError.JSON_PROPERTY_DOMAIN,
  CIAppCIError.JSON_PROPERTY_MESSAGE,
  CIAppCIError.JSON_PROPERTY_STACK,
  CIAppCIError.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CIAppCIError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private CIAppCIErrorDomain domain;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STACK = "stack";
  private JsonNullable<String> stack = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public CIAppCIError domain(CIAppCIErrorDomain domain) {
    this.domain = domain;
    this.unparsed |= !domain.isValid();
    return this;
  }

  /**
   * Error category used to differentiate between issues related to the developer or provider
   * environments.
   *
   * @return domain
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CIAppCIErrorDomain getDomain() {
    return domain;
  }

  public void setDomain(CIAppCIErrorDomain domain) {
    if (!domain.isValid()) {
      this.unparsed = true;
    }
    this.domain = domain;
  }

  public CIAppCIError message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

  /**
   * Error message.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMessage() {
    return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }

  public CIAppCIError stack(String stack) {
    this.stack = JsonNullable.<String>of(stack);
    return this;
  }

  /**
   * The stack trace of the reported errors.
   *
   * @return stack
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getStack() {
    return stack.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStack_JsonNullable() {
    return stack;
  }

  @JsonProperty(JSON_PROPERTY_STACK)
  public void setStack_JsonNullable(JsonNullable<String> stack) {
    this.stack = stack;
  }

  public void setStack(String stack) {
    this.stack = JsonNullable.<String>of(stack);
  }

  public CIAppCIError type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

  /**
   * Short description of the error type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getType() {
    return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }

  /** Return true if this CIAppCIError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CIAppCIError ciAppCiError = (CIAppCIError) o;
    return Objects.equals(this.domain, ciAppCiError.domain)
        && Objects.equals(this.message, ciAppCiError.message)
        && Objects.equals(this.stack, ciAppCiError.stack)
        && Objects.equals(this.type, ciAppCiError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, message, stack, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CIAppCIError {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
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
