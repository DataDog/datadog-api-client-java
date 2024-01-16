/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Object defining a variable that can be used in your test configuration. */
@JsonPropertyOrder({
  SyntheticsConfigVariable.JSON_PROPERTY_EXAMPLE,
  SyntheticsConfigVariable.JSON_PROPERTY_ID,
  SyntheticsConfigVariable.JSON_PROPERTY_NAME,
  SyntheticsConfigVariable.JSON_PROPERTY_PATTERN,
  SyntheticsConfigVariable.JSON_PROPERTY_SECURE,
  SyntheticsConfigVariable.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsConfigVariable {
  @JsonIgnore public boolean unparsed = false;
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
  private SyntheticsConfigVariableType type;

  public SyntheticsConfigVariable() {}

  @JsonCreator
  public SyntheticsConfigVariable(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          SyntheticsConfigVariableType type) {
    this.name = name;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SyntheticsConfigVariable example(String example) {
    this.example = example;
    return this;
  }

  /**
   * Example for the variable.
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

  public SyntheticsConfigVariable id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the variable for global variables.
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

  public SyntheticsConfigVariable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the variable.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SyntheticsConfigVariable pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Pattern of the variable.
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

  public SyntheticsConfigVariable secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Whether the value of this variable will be obfuscated in test results. Only for config
   * variables of type <code>text</code>.
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

  public SyntheticsConfigVariable type(SyntheticsConfigVariableType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the configuration variable.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsConfigVariableType getType() {
    return type;
  }

  public void setType(SyntheticsConfigVariableType type) {
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
   * @return SyntheticsConfigVariable
   */
  @JsonAnySetter
  public SyntheticsConfigVariable putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsConfigVariable object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsConfigVariable syntheticsConfigVariable = (SyntheticsConfigVariable) o;
    return Objects.equals(this.example, syntheticsConfigVariable.example)
        && Objects.equals(this.id, syntheticsConfigVariable.id)
        && Objects.equals(this.name, syntheticsConfigVariable.name)
        && Objects.equals(this.pattern, syntheticsConfigVariable.pattern)
        && Objects.equals(this.secure, syntheticsConfigVariable.secure)
        && Objects.equals(this.type, syntheticsConfigVariable.type)
        && Objects.equals(this.additionalProperties, syntheticsConfigVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(example, id, name, pattern, secure, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsConfigVariable {\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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
