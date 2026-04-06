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

/** Condition request payload for targeting rules. */
@JsonPropertyOrder({
  ConditionRequest.JSON_PROPERTY_ATTRIBUTE,
  ConditionRequest.JSON_PROPERTY_OPERATOR,
  ConditionRequest.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConditionRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private String attribute;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private ConditionOperator operator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private List<String> value = new ArrayList<>();

  public ConditionRequest() {}

  @JsonCreator
  public ConditionRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTE) String attribute,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPERATOR) ConditionOperator operator,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) List<String> value) {
    this.attribute = attribute;
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    this.value = value;
  }

  public ConditionRequest attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * The user or request attribute to evaluate.
   *
   * @return attribute
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public ConditionRequest operator(ConditionOperator operator) {
    this.operator = operator;
    this.unparsed |= !operator.isValid();
    return this;
  }

  /**
   * The operator used in a targeting condition.
   *
   * @return operator
   */
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConditionOperator getOperator() {
    return operator;
  }

  public void setOperator(ConditionOperator operator) {
    if (!operator.isValid()) {
      this.unparsed = true;
    }
    this.operator = operator;
  }

  public ConditionRequest value(List<String> value) {
    this.value = value;
    return this;
  }

  public ConditionRequest addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

  /**
   * Values used by the selected operator.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
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
   * @return ConditionRequest
   */
  @JsonAnySetter
  public ConditionRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ConditionRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionRequest conditionRequest = (ConditionRequest) o;
    return Objects.equals(this.attribute, conditionRequest.attribute)
        && Objects.equals(this.operator, conditionRequest.operator)
        && Objects.equals(this.value, conditionRequest.value)
        && Objects.equals(this.additionalProperties, conditionRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionRequest {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
