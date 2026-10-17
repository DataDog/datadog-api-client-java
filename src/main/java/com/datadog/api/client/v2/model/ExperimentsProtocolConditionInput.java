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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Protocol targeting condition. Publishing and replacement require a saved filter or a valid inline
 * attribute, operator, and values.
 */
@JsonPropertyOrder({
  ExperimentsProtocolConditionInput.JSON_PROPERTY_ATTRIBUTE,
  ExperimentsProtocolConditionInput.JSON_PROPERTY_OPERATOR,
  ExperimentsProtocolConditionInput.JSON_PROPERTY_ORDER_POSITION,
  ExperimentsProtocolConditionInput.JSON_PROPERTY_SAVED_FILTER_ID,
  ExperimentsProtocolConditionInput.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsProtocolConditionInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private String attribute;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_ORDER_POSITION = "order_position";
  private Long orderPosition;

  public static final String JSON_PROPERTY_SAVED_FILTER_ID = "saved_filter_id";
  private JsonNullable<String> savedFilterId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<List<String>> value = JsonNullable.<List<String>>undefined();

  public ExperimentsProtocolConditionInput attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Subject attribute evaluated by the targeting condition.
   *
   * @return attribute
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public ExperimentsProtocolConditionInput operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Comparison applied to the subject attribute.
   *
   * @return operator
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public ExperimentsProtocolConditionInput orderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
    return this;
  }

  /**
   * Position of this entry in the ordered configuration. minimum: 0
   *
   * @return orderPosition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOrderPosition() {
    return orderPosition;
  }

  public void setOrderPosition(Long orderPosition) {
    this.orderPosition = orderPosition;
  }

  public ExperimentsProtocolConditionInput savedFilterId(String savedFilterId) {
    this.savedFilterId = JsonNullable.<String>of(savedFilterId);
    return this;
  }

  /**
   * Saved filter UUID. Null selects an inline condition. An empty string skips the saved-filter
   * lookup.
   *
   * @return savedFilterId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getSavedFilterId() {
    return savedFilterId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SAVED_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getSavedFilterId_JsonNullable() {
    return savedFilterId;
  }

  @JsonProperty(JSON_PROPERTY_SAVED_FILTER_ID)
  public void setSavedFilterId_JsonNullable(JsonNullable<String> savedFilterId) {
    this.savedFilterId = savedFilterId;
  }

  public void setSavedFilterId(String savedFilterId) {
    this.savedFilterId = JsonNullable.<String>of(savedFilterId);
  }

  public ExperimentsProtocolConditionInput value(List<String> value) {
    this.value = JsonNullable.<List<String>>of(value);
    return this;
  }

  public ExperimentsProtocolConditionInput addValueItem(String valueItem) {
    if (this.value == null || !this.value.isPresent()) {
      this.value = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.value.get().add(valueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Values compared with the subject attribute in this condition.
   *
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getValue() {
    return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getValue_JsonNullable() {
    return value;
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<List<String>> value) {
    this.value = value;
  }

  public void setValue(List<String> value) {
    this.value = JsonNullable.<List<String>>of(value);
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
   * @return ExperimentsProtocolConditionInput
   */
  @JsonAnySetter
  public ExperimentsProtocolConditionInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsProtocolConditionInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsProtocolConditionInput experimentsProtocolConditionInput =
        (ExperimentsProtocolConditionInput) o;
    return Objects.equals(this.attribute, experimentsProtocolConditionInput.attribute)
        && Objects.equals(this.operator, experimentsProtocolConditionInput.operator)
        && Objects.equals(this.orderPosition, experimentsProtocolConditionInput.orderPosition)
        && Objects.equals(this.savedFilterId, experimentsProtocolConditionInput.savedFilterId)
        && Objects.equals(this.value, experimentsProtocolConditionInput.value)
        && Objects.equals(
            this.additionalProperties, experimentsProtocolConditionInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attribute, operator, orderPosition, savedFilterId, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsProtocolConditionInput {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    orderPosition: ").append(toIndentedString(orderPosition)).append("\n");
    sb.append("    savedFilterId: ").append(toIndentedString(savedFilterId)).append("\n");
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
