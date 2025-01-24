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

/** The custom connection attributes. */
@JsonPropertyOrder({
  CustomConnectionAttributes.JSON_PROPERTY_NAME,
  CustomConnectionAttributes.JSON_PROPERTY_ON_PREM_RUNNER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomConnectionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ON_PREM_RUNNER = "onPremRunner";
  private CustomConnectionAttributesOnPremRunner onPremRunner;

  public CustomConnectionAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom connection.
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

  public CustomConnectionAttributes onPremRunner(
      CustomConnectionAttributesOnPremRunner onPremRunner) {
    this.onPremRunner = onPremRunner;
    this.unparsed |= onPremRunner.unparsed;
    return this;
  }

  /**
   * Information about the Private Action Runner used by the custom connection, if the custom
   * connection is associated with a Private Action Runner.
   *
   * @return onPremRunner
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ON_PREM_RUNNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CustomConnectionAttributesOnPremRunner getOnPremRunner() {
    return onPremRunner;
  }

  public void setOnPremRunner(CustomConnectionAttributesOnPremRunner onPremRunner) {
    this.onPremRunner = onPremRunner;
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
   * @return CustomConnectionAttributes
   */
  @JsonAnySetter
  public CustomConnectionAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomConnectionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConnectionAttributes customConnectionAttributes = (CustomConnectionAttributes) o;
    return Objects.equals(this.name, customConnectionAttributes.name)
        && Objects.equals(this.onPremRunner, customConnectionAttributes.onPremRunner)
        && Objects.equals(
            this.additionalProperties, customConnectionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, onPremRunner, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConnectionAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onPremRunner: ").append(toIndentedString(onPremRunner)).append("\n");
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
