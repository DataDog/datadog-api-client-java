/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Value of the global variable. */
@JsonPropertyOrder({
  SyntheticsGlobalVariableValue.JSON_PROPERTY_OPTIONS,
  SyntheticsGlobalVariableValue.JSON_PROPERTY_SECURE,
  SyntheticsGlobalVariableValue.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsGlobalVariableValue {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SyntheticsGlobalVariableOptions options;

  public static final String JSON_PROPERTY_SECURE = "secure";
  private Boolean secure;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public SyntheticsGlobalVariableValue options(SyntheticsGlobalVariableOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options for the Global Variable for MFA.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsGlobalVariableOptions getOptions() {
    return options;
  }

  public void setOptions(SyntheticsGlobalVariableOptions options) {
    this.options = options;
  }

  public SyntheticsGlobalVariableValue secure(Boolean secure) {
    this.secure = secure;
    return this;
  }

  /**
   * Determines if the value of the variable is hidden.
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

  public SyntheticsGlobalVariableValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the global variable. When reading a global variable, the value will not be present if
   * the variable is hidden with the <code>secure</code> property.
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
   * @return SyntheticsGlobalVariableValue
   */
  @JsonAnySetter
  public SyntheticsGlobalVariableValue putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsGlobalVariableValue object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsGlobalVariableValue syntheticsGlobalVariableValue = (SyntheticsGlobalVariableValue) o;
    return Objects.equals(this.options, syntheticsGlobalVariableValue.options)
        && Objects.equals(this.secure, syntheticsGlobalVariableValue.secure)
        && Objects.equals(this.value, syntheticsGlobalVariableValue.value)
        && Objects.equals(
            this.additionalProperties, syntheticsGlobalVariableValue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, secure, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsGlobalVariableValue {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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
