/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** A variable used or extracted during a test. */
@JsonPropertyOrder({
  SyntheticsTestResultVariable.JSON_PROPERTY_ERR,
  SyntheticsTestResultVariable.JSON_PROPERTY_ERROR_MESSAGE,
  SyntheticsTestResultVariable.JSON_PROPERTY_EXAMPLE,
  SyntheticsTestResultVariable.JSON_PROPERTY_ID,
  SyntheticsTestResultVariable.JSON_PROPERTY_NAME,
  SyntheticsTestResultVariable.JSON_PROPERTY_PATTERN,
  SyntheticsTestResultVariable.JSON_PROPERTY_SECURE,
  SyntheticsTestResultVariable.JSON_PROPERTY_TYPE,
  SyntheticsTestResultVariable.JSON_PROPERTY_VAL,
  SyntheticsTestResultVariable.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultVariable {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ERR = "err";
  private String err;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_EXAMPLE = "example";
  private String example;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_SECURE = "secure";
  private Boolean secure;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VAL = "val";
  private String val;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public SyntheticsTestResultVariable err(String err) {
    this.err = err;
    return this;
  }

  /**
   * Error encountered when evaluating the variable.
   *
   * @return err
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public SyntheticsTestResultVariable errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Human-readable error message for variable evaluation.
   *
   * @return errorMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public SyntheticsTestResultVariable example(String example) {
    this.example = example;
    return this;
  }

  /**
   * Example value for the variable.
   *
   * @return example
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXAMPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public SyntheticsTestResultVariable id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Variable identifier.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SyntheticsTestResultVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable name.
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

  public SyntheticsTestResultVariable pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Pattern used to extract the variable.
   *
   * @return pattern
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public SyntheticsTestResultVariable secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Whether the variable holds a secure value.
   *
   * @return secure
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSecure() {
    return secure;
  }

  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  public SyntheticsTestResultVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Variable type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SyntheticsTestResultVariable val(String val) {
    this.val = val;
    return this;
  }

  /**
   * Evaluated value of the variable.
   *
   * @return val
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }

  public SyntheticsTestResultVariable value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Current value of the variable.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return SyntheticsTestResultVariable
   */
  @JsonAnySetter
  public SyntheticsTestResultVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultVariable syntheticsTestResultVariable = (SyntheticsTestResultVariable) o;
    return Objects.equals(this.err, syntheticsTestResultVariable.err)
        && Objects.equals(this.errorMessage, syntheticsTestResultVariable.errorMessage)
        && Objects.equals(this.example, syntheticsTestResultVariable.example)
        && Objects.equals(this.id, syntheticsTestResultVariable.id)
        && Objects.equals(this.name, syntheticsTestResultVariable.name)
        && Objects.equals(this.pattern, syntheticsTestResultVariable.pattern)
        && Objects.equals(this.secure, syntheticsTestResultVariable.secure)
        && Objects.equals(this.type, syntheticsTestResultVariable.type)
        && Objects.equals(this.val, syntheticsTestResultVariable.val)
        && Objects.equals(this.value, syntheticsTestResultVariable.value)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        err,
        errorMessage,
        example,
        id,
        name,
        pattern,
        secure,
        type,
        val,
        value,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultVariable {\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
