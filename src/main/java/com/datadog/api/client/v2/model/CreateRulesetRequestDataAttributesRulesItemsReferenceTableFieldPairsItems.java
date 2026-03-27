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

/**
 * The definition of <code>CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
 * </code> object.
 */
@JsonPropertyOrder({
  CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
      .JSON_PROPERTY_INPUT_COLUMN,
  CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems.JSON_PROPERTY_OUTPUT_KEY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INPUT_COLUMN = "input_column";
  private String inputColumn;

  public static final String JSON_PROPERTY_OUTPUT_KEY = "output_key";
  private String outputKey;

  public CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems() {}

  @JsonCreator
  public CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUT_COLUMN) String inputColumn,
      @JsonProperty(required = true, value = JSON_PROPERTY_OUTPUT_KEY) String outputKey) {
    this.inputColumn = inputColumn;
    this.outputKey = outputKey;
  }

  public CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems inputColumn(
      String inputColumn) {
    this.inputColumn = inputColumn;
    return this;
  }

  /**
   * The <code>items</code> <code>input_column</code>.
   *
   * @return inputColumn
   */
  @JsonProperty(JSON_PROPERTY_INPUT_COLUMN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInputColumn() {
    return inputColumn;
  }

  public void setInputColumn(String inputColumn) {
    this.inputColumn = inputColumn;
  }

  public CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems outputKey(
      String outputKey) {
    this.outputKey = outputKey;
    return this;
  }

  /**
   * The <code>items</code> <code>output_key</code>.
   *
   * @return outputKey
   */
  @JsonProperty(JSON_PROPERTY_OUTPUT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getOutputKey() {
    return outputKey;
  }

  public void setOutputKey(String outputKey) {
    this.outputKey = outputKey;
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
   * @return CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
   */
  @JsonAnySetter
  public CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
      putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
        createRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems =
            (CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems) o;
    return Objects.equals(
            this.inputColumn,
            createRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems.inputColumn)
        && Objects.equals(
            this.outputKey,
            createRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems.outputKey)
        && Objects.equals(
            this.additionalProperties,
            createRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputColumn, outputKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class CreateRulesetRequestDataAttributesRulesItemsReferenceTableFieldPairsItems {\n");
    sb.append("    inputColumn: ").append(toIndentedString(inputColumn)).append("\n");
    sb.append("    outputKey: ").append(toIndentedString(outputKey)).append("\n");
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
