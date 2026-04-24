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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A warning captured during a browser test step. */
@JsonPropertyOrder({
  SyntheticsTestResultWarning.JSON_PROPERTY_ELEMENT_BOUNDS,
  SyntheticsTestResultWarning.JSON_PROPERTY_MESSAGE,
  SyntheticsTestResultWarning.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultWarning {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELEMENT_BOUNDS = "element_bounds";
  private List<SyntheticsTestResultBounds> elementBounds = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SyntheticsTestResultWarning elementBounds(List<SyntheticsTestResultBounds> elementBounds) {
    this.elementBounds = elementBounds;
    for (SyntheticsTestResultBounds item : elementBounds) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultWarning addElementBoundsItem(
      SyntheticsTestResultBounds elementBoundsItem) {
    if (this.elementBounds == null) {
      this.elementBounds = new ArrayList<>();
    }
    this.elementBounds.add(elementBoundsItem);
    this.unparsed |= elementBoundsItem.unparsed;
    return this;
  }

  /**
   * Bounds of elements related to the warning.
   *
   * @return elementBounds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENT_BOUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultBounds> getElementBounds() {
    return elementBounds;
  }

  public void setElementBounds(List<SyntheticsTestResultBounds> elementBounds) {
    this.elementBounds = elementBounds;
  }

  public SyntheticsTestResultWarning message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Warning message.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SyntheticsTestResultWarning type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the warning.
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
   * @return SyntheticsTestResultWarning
   */
  @JsonAnySetter
  public SyntheticsTestResultWarning putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultWarning object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultWarning syntheticsTestResultWarning = (SyntheticsTestResultWarning) o;
    return Objects.equals(this.elementBounds, syntheticsTestResultWarning.elementBounds)
        && Objects.equals(this.message, syntheticsTestResultWarning.message)
        && Objects.equals(this.type, syntheticsTestResultWarning.type)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultWarning.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementBounds, message, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultWarning {\n");
    sb.append("    elementBounds: ").append(toIndentedString(elementBounds)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
